package p1;

public class PickableObject implements GameObject{
    private int ID;
    private int level;
    private boolean pickable;
    public static int IDCounter = 0;
    PickableObject(){
        this.ID = IDCounter;
        IDCounter++;
        this.level = 1;
        this.pickable = true;
    }
    @Override
    public String toString() {
        return "\n======\nID: " + ID + "\nlevel: " + level + "pickable: " + pickable;
    }
}
