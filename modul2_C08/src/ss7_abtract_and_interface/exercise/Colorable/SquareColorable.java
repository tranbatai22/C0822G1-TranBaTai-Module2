package ss7_abtract_and_interface.exercise.Colorable;



public class SquareColorable extends Square implements Colorable {
    public SquareColorable(){}

    public SquareColorable(double side){
        super(side);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color All Four Size");
    }
}