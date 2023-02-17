package moving;

interface Movable {
    default void stepAhead(String[][] x, String y){
    };

    default void turnLeft(String[][] x, String y){

    }
    default void turnRight(String[][] x, String y){

    }
    default void stepBack(String[][] x, String y){
    };
}