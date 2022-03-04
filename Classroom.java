class Classroom {
    public static void main(String[] args) {
        // Add references to several instances of the Wilder class inside main() method.
    Wilder miles = new Wilder ("Miles"); 
    Wilder lis = new Wilder ("Lis"); 
    Wilder david = new Wilder ("David");
    // For each of the references, display the result of the whoAmI() method
    System.out.println("Wilder name is : " + miles.getName() + "and their state is: " + String.valueOf(miles.isPresent()));
    miles.IsPresent(true);
    System.out.println("Wilder name is : " + lis.getName() + "and their state is: " + String.valueOf(lis.isPresent()));
    lis.IsPresent(true); 
    System.out.println("Wilder name is : " + david.getName()) + "and their state is: " + String.valueOf(david.isPresent()));
    david.IsPresent(true);   
    }
}