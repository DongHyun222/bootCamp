package JAVA_WS_04_1반_고동현;

public class Test {

    public static void main(String[] args) {
        
        BankService bankService = new BankService();
        System.out.println(bankService.getAccountList());
        System.out.println(bankService.getAccountListSortByBalance());
        System.out.println(bankService.getAccountListSortByUserSeq());
    }

}