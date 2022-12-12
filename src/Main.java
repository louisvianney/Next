public class Main {
    //man method
    public static void main(String[] args) {

        System.out.println("Hello world!");
        FirstClass myObjet = new FirstClass();
        FirstClass myObjet2 = new FirstClass();
        System.out.println(myObjet.x);
        System.out.println((myObjet2.x) * 2);

        SecondClass mySObjet = new SecondClass();
        System.out.println(mySObjet.y);

        Etudiant vianney = new Etudiant();
        System.out.println("Je m'appelle " + " " + vianney.Nom + " " + vianney.Prenom + " " + "j'ai " + " " + vianney.Age + " " + "et j'a pour matricule " + " " + vianney.Matricule + " " + "pour pouvoir me joindre veuillez passer par mon numero" + " " + vianney.Numero + " " + "ou par mon adresse mail " + " " + vianney.AdresseMail);

        Enseignant ulrich = new Enseignant();
        System.out.println("Je m'appelle " + " " + ulrich.Nom + " " + ulrich.Prenom + " " + "j'enseigne " + " " + ulrich.Matiere + " " + "et j'ai un poste de " + " " + ulrich.Etat);

        Main myObj = new Main(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
        myStaticMethod(); // Call the static method
        myMethod();

        Main myCar = new Main();
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }

    static void myMethod() {
        System.out.println("Hello World!");
    }

    //static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);

    }
}


