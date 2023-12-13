//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount(1000);
//
//        Thread t1 = new Thread(new BankAccountThread(account, "deposit", 500));
//        Thread t2 = new Thread(new BankAccountThread(account, "withdraw", 700));
//        Thread t3 = new Thread(new BankAccountThread(account, "deposit", 1000));
//
//        t1.start();
//        t2.start();
//        t3.start();
////
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Final balance: " + account.getBalance());
//    }
//}
//