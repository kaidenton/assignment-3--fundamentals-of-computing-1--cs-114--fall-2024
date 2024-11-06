public class Matrix {
    void printMatrix(int[][] table) {
        final String ANSI_RESET = "\u001B[37m";
        final String ANSI_YELLOW = "\u001B[33m";

        for(int row = 0; row < table.length; row++) {
            for(int col = 0; col < table.length; col++) {
              //There is a minus 1 because they start at 0, meaning col would never equal 4
              if(col + row == table.length - 1){
                System.out.print(ANSI_YELLOW + "\t" + table[row][col] + ANSI_RESET);
              }else{
                System.out.print("\t" + table[row][col]);
              }
            }
            System.out.println(" ");
        }
    }

    void populateMatrix(int[][] table) {
        int value = 1;
        //ANSI_RESET will make the font color white
        final String ANSI_RESET = "\u001B[37m";
        //ANSI_YELLOW will make the font color yellow
        final String ANSI_YELLOW = "\u001B[33m";
        //Gives all the numbers their corresponding numbers
        for(int row = 0; row < table.length; row++) {
            for(int col = 0; col < table.length; col++) {
                table[row][col] = value++;
            }
        }

        for(int row = 0; row < table.length; row++) {
            for(int col = 0; col < table.length; col++) {
              //There is a minus 1 because they start at 0, meaning col would never equal 4
              if(col + row == table.length - 1){
                System.out.print(ANSI_YELLOW + "\t" + table[row][col] + ANSI_RESET);
              }else{
                System.out.print("\t" + table[row][col]);
              }
            }
            System.out.println(" ");
        }
    }

    void flipMatrix(int[][] table) {
    
    }
}
