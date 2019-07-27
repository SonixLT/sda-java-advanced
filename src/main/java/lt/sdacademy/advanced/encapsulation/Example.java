package lt.sdacademy.advanced.encapsulation;

public class Example {

    private String title = "Default";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            return;
        }
        this.title = title;
    }
}
