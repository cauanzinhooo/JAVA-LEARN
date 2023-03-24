abstract class animal{
  private String name; 

  public animal(String name){
    this.name = name;
  } 
  public String getName(){
    return name;
  } 
  public abstract void roar();
}