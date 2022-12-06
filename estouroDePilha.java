/**
 * Ilustrar estouro "int"
 */ 
  public class estouroDePilha {
   public static void main(String[] args) {
      // Intervalo de int é [-2147483648, 2147483647] 
      int i1 = 2147483647;        // int máximo 
      System.out.println(i1 + 1);  // -2147483648 (estouro) 
      System.out.println(i1 + 2);  // -2147483647 (estouro) 
      System.out.println(i1 + 3);  // -2147483646 (estouro) 
      System.out.println(i1 * 2);  // -2 (estouro) 
      System.out.println(i1 * i1);  // 1 (estouro)
      
      int i2 = -2147483648;         // int mínimo 
      System.out.println(i2 - 1);   // 2147483647 (estouro) 
      System.out.println(i2 - 2);   // 2147483646 (estouro) 
      System.out.println(i2 * i2);  // 0 (estouro)
   }
}
