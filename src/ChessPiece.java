abstract public class ChessPiece {
    private String color;
    private String location;


    public ChessPiece(String color, String location) {
        this.color = color;
        this.location = location;
    }

    abstract public boolean move(String newLocation);
}
