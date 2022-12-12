public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        FirstClass myObjet = new FirstClass();
        FirstClass myObjet2 = new FirstClass();
        System.out.println(myObjet.x);
        System.out.println((myObjet2.x)*2);

        SecondClass mySObjet = new SecondClass();
        System.out.println(mySObjet.y);

        Etudiant vianney = new Etudiant();
        System.out.println("Je m'appelle " +  " " + vianney.Nom + " " + vianney.Prenom + " " +  "j'ai " + " " + vianney.Age + " " +  "et j'a pour matricule " + " " +  vianney.Matricule + " " +  "pour pouvoir me joindre veuillez passer par mon numero" + " " +  vianney.Numero + " " +  "ou par mon adresse mail " + " " +  vianney.AdresseMail);

    }
}