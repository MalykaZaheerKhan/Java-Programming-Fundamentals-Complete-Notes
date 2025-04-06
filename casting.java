public class casting {
    public static void main(String args[]){
        //casting : convert from one type to another
        //it can be either implicit or explicit
        //implicit casting: pass from small data type to larger memory/data type
        //explicit casting: we wanna store large data type value into small data type

        double price=100.00;
        double finalprice=price + 18;

        System.out.println(finalprice);

        int pr=100;
        int fpr= pr + (int) 18.99;   //explicit casting

        System.out.println(fpr);
    }
    
}
