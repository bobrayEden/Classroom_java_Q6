public class Wilder {

  //attributs

  private String firstname;
  private boolean aware;

  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  //getters
  public String getFirstName() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  //setters
  public String setFirstname(String firstname) {
    return this.firstname = firstname;
  }

  public boolean setAware(boolean aware) {
    return this.aware = aware;
  }

  //méthode
  public String whoAmI(){
    if (this.isAware()) {
      return "Je m'appelle " + this.getFirstName() + " et je suis aware !";
    } else {
      return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware...";
    }

  }
}
