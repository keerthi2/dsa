package TopHundredDSA.Array;

public class PeakOfElementIn2D {

    static void main() {
       int[][] data= {{1,4},{3,2}};
       //  1,4
        // 3,2
       findPeak(data);
    }

    public static void findPeak(int[][] data) {
        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data[0].length ; j++) {
if(checkLeftElement(i,j,data) && checkBottomElement(i,j,data) && checkRightElement(i,j,data)&& checkTopElement(i,j,data)){
    System.out.println( i +" "+ j);
};
            }


        }

    }

  /*public static boolean  checkpeakforGivenIndex(int row,int coloumn, int[][] data) {
        if((coloumn-1<0 || data[row][coloumn-1]<=data[row][coloumn] ) &&
                (coloumn+1<data[0].length || data[row][coloumn+1]<=data[row][coloumn] )
        && (row-1<0 || data[row-1][coloumn]<=data[row][coloumn] ) && (row+1<data.length || data[row+1][coloumn]<=data[row][coloumn])){
         return true;
        }
        return false;
    }*/

   static boolean  checkLeftElement(int row,int coloumn, int[][] data){
        if (coloumn-1<0){
            return true;
        }
        else if (data[row][coloumn-1]<=data[row][coloumn]){
            return true;
        }
        return false;
   }

   static boolean checkRightElement(int row,int coloumn, int[][] data){
        if (coloumn+1>=data[0].length){
            return true;
        }
        else if (data[row][coloumn+1]<=data[row][coloumn] ){
            return true;
        }
        return false;
    }

   static boolean checkBottomElement(int row,int coloumn, int[][] data){
        if (row+1>=data.length){
            return true;
        }
        else if (data[row+1][coloumn]<=data[row][coloumn]){
            return true;
        }
        else{
            return false;
        }
    }
   static boolean checkTopElement(int row,int coloumn, int[][] data){
        if (row-1<0){
            return true;
        }
        else if (data[row-1][coloumn]<=data[row][coloumn]){
            return true;
        }
        else{
            return false;
        }
    }

}
