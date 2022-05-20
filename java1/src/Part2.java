import java.util.Scanner;
public class Part2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char[][] gameMap = new char[4][5];
        String[] strAr = new String[5];

        for(int i=0; i<5; i++){
            System.out.println("행에 입력할 문자 5개 입력");
            strAr[i]=sc.nextLine();
            for(int j=0; j<4; j++){
                gameMap[i][j] = strAr[i].charAt(j);
            }
        }

    }
}
