class Classroom {
    public static void main(String[] args) {
        // Add references to several instances of the Wilder class inside main() method.
    Wilder miles = new Wilder ("Miles"); 
    Wilder lis = new Wilder ("Lis"); 
    Wilder david = new Wilder ("David"); 
    // For each of the references, display the result of the whoAmI() method;
    System.out.println(miles.whoAmI());
    System.out.println(lis.whoAmI());
    System.out.println(david.whoAmI());
    }
}