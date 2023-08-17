public class ReturnAge {
    public static void main(String[] args) {
        int currentYear = 2023;
        String usersDateOfBirth = "2001";
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println(currentYear - dateOfBirth);

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println(ageWithPartialYear);
    }
}
