package moving;

class Batman implements Movable {
    public void stepAhead(String[][] myArray, String input) {
        String[][] newArray = new String[myArray.length][];
        if (input.equals("w")) {
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i].clone();
            }
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    if ("b".equals(newArray[i][j])) {
                        if (i == 0) {
                            newArray[i][j] = "_";
                            newArray[newArray.length - 1][j] = "b";
                        } else {
                            newArray[i][j] = "_";
                            newArray[i - 1][j] = "b";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j< newArray.length; j++) {
                System.out.print(newArray[i][j]);
            }
            System.out.println();
        }
    }
    public void turnLeft(String[][] myArray, String input) {
        String[][] newArray = new String[myArray.length][];
        if (input.equals("a")) {
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i].clone();
            }
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    if ("b".equals(newArray[i][j])) {
                        if (i == 0) {
                            newArray[i][j] = "_";
                            newArray[newArray.length - 1][j - 1] = "b";
                        } else {
                            newArray[i][j] = "_";
                            newArray[i][j - 1] = "b";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j< newArray.length; j++) {
                System.out.print(newArray[i][j]);
            }
            System.out.println();
        }

    }
    public void turnRight(String[][] myArray, String input) {
        String[][] newArray = new String[myArray.length][];
        if (input.equals("d")) {
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i].clone();
            }
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    if ("b".equals(newArray[i][j])) {
                        if (i == 0) {
                            newArray[i][j] = "_";
                            newArray[newArray.length - 1][++j] = "b";
                        } else {
                            newArray[i][j] = "_";
                            newArray[i][++j] = "b";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j< newArray.length; j++) {
                System.out.print(newArray[i][j]);
            }
            System.out.println();
        }
    }
    public void stepBack(String[][] myArray, String input){
        String[][] newArray = new String[myArray.length][];
        if (input.equals("s")) {
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i].clone();
            }
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    if ("b".equals(newArray[i][j])) {
                        if (i == 4) {
                            newArray[i][j] = "_";
                            newArray[newArray.length - 1][j] = "b";
                        }else{
                            newArray[i][j] = "_";
                            newArray[++i][j] = "b";
                        }
                    }
                }
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j< newArray.length; j++) {
                System.out.print(newArray[i][j]);
            }
            System.out.println();
        }
    }
}
