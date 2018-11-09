
package multidimentionalarray_eligio;


import java.util.Scanner;


public class MultidimentionalArray_Eligio {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Number of rows -> ");
        int rows = in.nextInt();
        String[][] myArray = new String[rows][];   
               
        
        for(int i = 0;i<myArray.length;i++){
            System.out.print("\n\n\n\nNumber of Column in Row " + i + " -> ");
            int col = in.nextInt();
            myArray[i] = new String[col];
            for(int j = 0;j<myArray[i].length;j++){
                System.out.print("Asign Value of row " + i + " column " + j + " -> ");
                myArray[i][j] = in.next();  
            }
            System.out.println("Row" + i);
            // header
            for(int x = 0;x<myArray[i].length;x++){
                System.out.print("\tColumn" + x);
            }
            System.out.print("\n");
            
            // result
            for(int x = 0;x<myArray[i].length;x++){
                System.out.print("\t" + myArray[i][x]);
            }
            
        }
        System.out.println("\n\n\nFinal Result\n\n");
        
        System.out.print("\n");
        for(int i = 0;i<myArray.length;i++){
            System.out.println("\n");
            System.out.print("Row " + i + "");
            for(int p = 0;p<myArray[i].length;p++){
                System.out.print("\t" + myArray[i][p]);
            }
        }
        System.out.println("\n\n");
        
    }
    
}
