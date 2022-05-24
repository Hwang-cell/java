package BankPack;

import java.io.ObjectOutputStream;

public class Customer extends Bank {
    // Customer
    Customer(String acc_no, String acc_name, int acc_balance){
        Set_acc_no(acc_no);
        Set_acc_name(acc_name);
        Set_acc_balance(acc_balance);
    }



    public static void main(String[] args){

        Customer customer = new Customer("739502-00-156229", "황상원", 1588593);
        customer.Put_acc_no();
        customer.Put_acc_name();
        customer.Put_acc_balance();
    }

}
