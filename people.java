public class people {
  private String name;
  private int age;
  private String adress;

  public people(String name, int age, String adress) {
    this.name = name;
    this.age = age;
    this.adress = adress;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAdress() {
    return adress;
  }

  @Override
  public String toString(){ 
    return "The person" + name + "has" + age + "and live at" + adress;
  }

  public double payRent(double value) {
    System.out.println(name + " pays " + value + "for the rent");
    return value;
  }

  public double payCondo(double value){
    System.out.println(name + " pays " + value + " for the condo");
    return value;
  }
public void payed(double rentPayment, double condoPayment){
    if (rentPayment + condoPayment > 2000){
      System.out.println("Payment done");
    }else{
      System.out.println("Payment not done");
    }
  }
}