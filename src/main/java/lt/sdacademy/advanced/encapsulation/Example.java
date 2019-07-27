package lt.sdacademy.advanced.encapsulation;

public class Example {

    private String title = "Default";
    private int count;

    public String getTitle() {
        return ++count > 3 ? null : title;
    }

    public void setTitle(String title) {
        if (title == null) {
            return;
        }
        this.title = title;
    }
}
