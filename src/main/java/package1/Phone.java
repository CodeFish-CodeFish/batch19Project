package package1;

class Phone {

    String zipCode;

    {
        zipCode = "+1";
    }

    Phone(String areaCode, String phoneNumber) {
        System.out.println(zipCode + " " + areaCode + " " + phoneNumber);
    }

    public static void main(String[] args) {
        Phone usPhone = new Phone("312", "222-3333");
    }
}
