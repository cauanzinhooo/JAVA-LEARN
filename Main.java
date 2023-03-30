class Main {
  public static void main(String[] args) {
    people pijas = new people("Pijas",19,"Casa da praia"); 
    people vancoco = new people("Barreto",15,"CASA DELE"); 

    vancoco.payRent(1500);
    pijas.payCondo(500); 
    System.out.println(pijas.toString());


    vancoco.payed(vancoco.payRent(600),vancoco.payCondo(300));
    pijas.payed(pijas.payRent(1000), pijas.payCondo(1000));
  }
}