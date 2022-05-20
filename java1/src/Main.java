import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        int[] ar = {238, 483, 239, 442, 487, 239, 873};
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[0]);

        int[] ar1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ar2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[][] Consum;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                Consum[i][j] = sc.nextLine();
            }
        }

        String[][] ConsumerInformation = {
                {"Hwang", "Seoul", "010-9055-5128", "20"},
                {"kim", "Incheon", "010-5555-5128", "30"}
                {"park", "Tokyo", "010-8888-8888", "50"}
        }

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.arraycopy(ar1, 2, ar2, 4, 3);

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        String[][] europe_nations = {
                {"영국", "아일랜드", "아이스란드"},
                {"프랑스", "독일", "스페인"}
        };
        System.out.println(europe_nations[0]);
        System.out.println(europe_nations[0][0]);

        System.out.println(europe_nations.length);
        System.out.println(europe_nations[0].length);
        System.out.println(europe_nations[1].length);

    }
}