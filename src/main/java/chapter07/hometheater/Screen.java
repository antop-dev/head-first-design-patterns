package chapter07.hometheater;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + "이 올라갑니다.");
    }

    public void down() {
        System.out.println(description + "이 내려옵니다.");
    }


    public String toString() {
        return description;
    }
}
