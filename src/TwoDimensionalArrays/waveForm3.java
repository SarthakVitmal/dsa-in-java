package TwoDimensionalArrays;

public class waveForm3 {
    public static void display(int [][]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        display(arr);

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n-1;i>=0;i--){
            if(i%2==0){
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
