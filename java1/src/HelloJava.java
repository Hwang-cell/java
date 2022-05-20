public class HelloJava {
    public static void main(String[] args){
        int num1 = 0, num2 = 0, count = 0;
        while(true) {
            count++;
            num1 = (int)(Math.random()*6) + 1;
            num2 = (int)(Math.random()*6) + 1;
            System.out.printf("(%d, %d) count: %d회%n", num1, num2, count );

            if(num1==6 && num2!=6){
                System.out.println("1번 주사위 6이 나왔습니다.");
                break;
            }
            if(num1!=6 && num2==6){
                System.out.println("2번 주사위 6이 나왔습니다.");
                break;
            }
            if(num1==6 && num2==6){
                System.out.println("모든 주사위가 6이 나왔습니다.");
                break;
            }
            if((num1+num2)==6){
                System.out.println("두 주사위의 합이 6이 나왔습니다.");
                break;
            }
        }
        System.out.println("프로그램 종료");

    }
}