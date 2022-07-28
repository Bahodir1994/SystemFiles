package uz.beepro;

public class EncapsulationFinal {

    private static int nextId = 1;
    private int id;

    public EncapsulationFinal() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static int getNextId(){
        return nextId;
    }
}
