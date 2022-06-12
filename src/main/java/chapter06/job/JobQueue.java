package chapter06.job;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JobQueue {
    private final Queue<ExecuteJob> queue;
    private final List<Worker> workers;
    private boolean keepGoing = false;

    public JobQueue(int workerSize) {
        queue = new ConcurrentLinkedQueue<>();
        workers = new ArrayList<>(workerSize);

        for (int i = 0; i < workerSize; i++) {
            Worker worker = new Worker("JCo Worker - " + (i + 1));
//            worker.setDaemon(true);
            worker.start();

            workers.add(worker);
        }
    }

    public void start() {
        keepGoing = true;
    }

    public void stop() {
        keepGoing = false;
    }

    public void addJob(ExecuteJob job) {
        queue.offer(job);
    }

    public class Worker extends Thread {
        private final String name;

        public Worker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                if (keepGoing) {
                    ExecuteJob job = queue.poll();
                    if (job != null) {
                        job.execute();
                    }
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // do nothing
                }
            }
        }
    }

    public static void main(String[] args) {
        JobQueue jobQueue = new JobQueue(10);
        jobQueue.start();

        jobQueue.addJob(() -> System.out.println("Hello World!"));
    }

}
