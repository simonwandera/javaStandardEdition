package src.assignment.oop1;

public enum Status {

    SOLD("Sold", 2),
    AVAILABLE("Available for local customer"),
    NEW("Brand new from factory"),
    PENDING("Pending for delivery");

    private final String name;

    private int value;

    Status(String name) {
        this.name = name;
    }

    Status(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }


}
