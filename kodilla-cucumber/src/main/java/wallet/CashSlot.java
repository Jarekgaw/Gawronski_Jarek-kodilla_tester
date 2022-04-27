package wallet;

public class CashSlot {
    private Integer contents;

    public Integer getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
}
