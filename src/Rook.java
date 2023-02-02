public class Rook extends ChessPiece {


    public Rook(String color, String location) {
        super(color, location);
    }

    @Override
    public boolean move(String newLocation) {
        System.out.print("I move horizontal & Vertical");
        return true;
    }
}
