public class Classroom {

  public static void main(String[] args){

    Wilder olivier = new Wilder("Olivier", true);
    System.out.println(olivier.whoAmI());

    olivier.setFirstname("Jean Claude");
    olivier.setAware(false);

    System.out.println("En fait j'ai menti... " + olivier.whoAmI());

    System.out.println("New Wilder incoming !!");

    Wilder jacquesC = new Wilder("Jacques Chirac", false);

    System.out.println(jacquesC.whoAmI());
    System.out.println(jacquesC.getFirstName() + " retire son masque !!");

    jacquesC.setFirstname("Bastien K.");
    jacquesC.setAware(true);

    System.out.println("Haha ! Je vous ai bien eus !" + jacquesC.whoAmI());
  }
}
