package mooc;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            if (in.hasNext()){
                list[i] = in.nextInt();
            }
        }
        System.out.println(findMax(list));
    }
    public static int findMax(int[] list){
        int max = 0;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            count += list[i];
            if (count < 0){
                count = 0;
            }else {
                if (count > max){
                    max = count;
                }
            }
        }
        return max;
    }
}