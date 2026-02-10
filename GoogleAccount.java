class GoogleAccount {

static void createAccount(String firstName,String lastName,String email,String password,String confirmPassword){
System.out.println("FIRST NAME: " + firstName);
System.out.println("LAST NAME: " + lastName);
System.out.println("EMAIL: " + email);
System.out.println("PASSWORD: " + password);
System.out.println("CONFIRM PASSWORD: " + confirmPassword);
}

public static void main(String[] args){
createAccount("Sagar","MK","sagar@gmail.com","12345","12345");
}
}
