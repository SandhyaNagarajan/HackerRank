import java.util.Scanner;

public class HourGlass {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int OneSum = 0 , MaxSum = -1;
        System.out.println("Enter the array input");
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            for (int j = 0; j < arrRowItems.length; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        // outer loop
        System.out.println("Starting to process values");
        for(int i1 = 0 ; i1 < 4 ; i1++){
            for(int j1 = 0; j1 < 4 ; j1++){
                
                // inner loop- calculate each hour glass's two horizontal rows
                for(int i2 = i1;  i2 <= i1 + 2; i2 = i2+2) {
                    for(int j2 = j1; j2 < j1 + 3 ; j2++){
                    	System.out.println("("+i2+","+j2+")");
                    	
                        OneSum += arr[i2][j2];
                      }
                }
                // calculate the cental number of hour glass
                if(i1 < 4 && j1 < 4){
                	
                    OneSum += arr[i1+1][j1+1];
                    System.out.println("("+(i1+1)+","+(j1+1)+")");
                }
                
                // store only the higher value in MaxSum
                if(MaxSum < OneSum){
                    MaxSum = OneSum;
                    System.out.println(OneSum);

                }
                OneSum = 0;
            }
        }
        
        System.out.println(MaxSum);
        scanner.close();
    }

}
