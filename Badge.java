import java.util.Random;

public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void  keepTrackOfEmployeesNumber(){
        System.out.println(totalNumberOfEmployees ++);

    }
    public  int totalNumberOfEmployees(){
     return totalNumberOfEmployees;
    }


    private String generateBadgeIdCode(){
        //trovato online non riuscivo a farlo :\

        String alphabet = "ABCDEFGHIJKLMNOPQRSUVWXYZ";
        StringBuilder code = new StringBuilder();
        Random random = new Random();

        int length = 3;
        for(int i = 0; i < length; i++){
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            code.append(randomChar);
        }
        String randomString = code.toString();
        return randomString + employee.getName() + employee.getSurname() + randomString;
    }
    public void showBadgeDetails(){
        System.out.println(totalNumberOfEmployees);
        employee.getEmployeeDetails();
        System.out.println(generateBadgeIdCode());
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();


    }





}
