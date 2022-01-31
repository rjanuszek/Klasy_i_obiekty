public class User {
    // 1. Pola obiektu
    // To z czego składa się dany obiekt

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // 3. Konstruktor
    // Służy do tworzenia nowych obiektów
    // Domyślny konstruktor tworzy domyślny obiekt
    User(String firstName, String lastName, String email, int age){
        // this wskazuje OBIEKT
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }


    // 2. Metody
    // To co dany obiekt może zrobić

    // zwracany typ + Metoda
    void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }
    void getAllInfo() {
        // ciało metody
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }
    int getUserAge() {
        return age;
    }

    boolean isUserAdult () {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    void greetings(String name) {
            System.out.println("Hi " + name + ". Nice to see you!");
        }

    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }
    
    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " old.");
    }
    int yourArePlus10(int userAge){
        return userAge + 10;
    }
}
