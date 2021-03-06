class Wilder {
    // add attributes string firstname and boolean present
    private String firstname; // variables declared in class
    private boolean present; 
        // constructors to initialise firstname and present
    public Wilder (String firstname) {
        this.firstname = firstname;
        this.present = false;
    }
    // getters
    public String getFirstname() {
        return this.firstname;
    }
    
    public boolean isPresent() {
        return this.present;
    }
    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }
    // whoamI()method  "My name is firstname and I am present" or "My name is firstname and I am not present", 
    public String whoAmI() {
        String output = "My name is " + this.getFirstname() + " and I am ";
        if (present){
            output += "present.";
        }
        else {
            output += "not present.";
        }
        return output;
    }

}