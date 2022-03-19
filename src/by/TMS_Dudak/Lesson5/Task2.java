package by.TMS_Dudak.Lesson5;

public class Task2 {
    public static void main(String[] args) {
        int[] increasing = new int [50];
        for(int i=0, j=1; j<=99; i++){
            if(j%2==1){
                increasing[i]=j;
                j+=2;
            }
            System.out.print(increasing[i] + " ");
        }

        System.out.println("\n");

        int[] decreasing = new int[50];
        for(int i=0, j=99; j>=1; i++){
            if(j%2==1){
                decreasing[i]=j;
                j-=2;
            }
            System.out.print(decreasing[i] + " ");
        }
    }
}
