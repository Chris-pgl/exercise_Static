public class Tester {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Luca","Ricci","Roma");
        Employee employee2 = new Employee("Sara","Russo","Messina");



        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);


        badge1.showBadgeDetails();
        badge2.showBadgeDetails();


    }
}
