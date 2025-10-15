public class Dog {
    String name;
    int age;
    int numLegs;
    String breed;
    double speed;
    
    public Dog(String name_, int age_, int numLegs_, String breed_) {
        this.name = name_;
        this.age = age_;
        this.numLegs = (numLegs_ > 4) ? 4 : numLegs_;
        this.breed = breed_;
    }

    public String getName() { return this.name; }
    public void setName(String name_) { this.name = name_; }
    public int getAge() { return this.age; }
    public void setAge(int age_) { this.age = (age_ > 0) ? age_ : 1; }

    public String dogReport() {
        String[] report_text = new String[2];
        report_text[0] = getName();
        report_text[1] = String.valueOf(getAge());
        return "Dog's name is " + report_text[0] + " and is " + report_text[1] + " years old.";
    }

    // main class for testing
    public static void main(String[] args) {
        Dog my_pup = new Dog("Barney", 13, 4, "Shi Tzu");
        System.out.println(my_pup.dogReport());
    }
}
