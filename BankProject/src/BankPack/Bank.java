package BankPack;

public abstract class Bank {
    // 상속할 속성
    public String acc_no;
    public String acc_name;
    public int acc_balance;

    // Putter
    public void Put_acc_no(){
        System.out.println(acc_name + "님의 계좌번호는 " + acc_no + " 입니다.");
    }
    public void Put_acc_name(){
        System.out.println(acc_name + "고객님 환영합니다.");
    }
    public void Put_acc_balance(){
        System.out.println(acc_name + "님의 잔액은 " + acc_balance + " 원입니다.");
    }

    // Getter
    public String Get_acc_no(String n){
        return acc_no;
    }
    public String Get_acc_name(String n){
        return acc_name;
    }
    public int Get_acc_balance(int n){
        return acc_balance;
    }

    // Setter
    public void Set_acc_no(String n){
        acc_no = n;
    }
    public void Set_acc_name(String n){
        acc_name = n;
    }
    public void Set_acc_balance(int n){
        acc_balance = n;
    }
}