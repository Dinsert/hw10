public class Main {
    public static void main(String[] args) {
//        Task 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
//        Task 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
//        Task 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);
    }
}