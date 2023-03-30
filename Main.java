package pkgtry;
public static void main(String[] args) {
  try  {
    int[] numeros = {1, 2, 3}; 
    System.out.println(numeros[20]);
  } catch (Exception e) {
      System.out.println("Algo errado nessa porra");
  } finally {
      System.out.println("O 'Sexo acabou'. ");
  }
}