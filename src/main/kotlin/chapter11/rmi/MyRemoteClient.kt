package chapter11.rmi

import java.rmi.Naming

class MyRemoteClient {
    fun go() {
        val service = Naming.lookup("rmi://127.0.0.1:1099/RemoteHello") as MyRemote
        val s = service.sayHello()
        println(s)
    }
}

fun main() {
    MyRemoteClient().go()
}
