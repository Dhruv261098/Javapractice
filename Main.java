public class Main {

    public static void main(String[] args){

//        For Tree
//
//        Tree MyFavoriteOakTree = new Tree(120,10,TreeType.OAK);
//        Tree MyFavouriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
//
//
//
//        if(MyFavoriteOakTree.getHeightFt() > 100){
//            System.out.println(MyFavoriteOakTree.treeType+" Tree is tall");
//        }

//        For Employee

//        Employee Employee1 = new Employee ("Dhruv", 25, 100000,"canada" );
//        Employee Employee2 = new Employee ("Desai", 35, 100000,"India" );
//
//        Employee.announceMent();
//
//        System.out.println(Employee1.salary);
//        System.out.println(Employee2.salary);
//
//        Employee1.raiseSalary();
//
//        System.out.println(Employee1.salary);
//        System.out.println(Employee2.salary);

//        For Employee

          BankAccount Customer1 =new BankAccount("Mahesh", 8000);

          System.out.println(Customer1.getBalance());


          Customer1.withdraw(100);


          System.out.println(Customer1.getBalance());
          Customer1.deposit();
          System.out.println(Customer1.getBalance());




    }

}