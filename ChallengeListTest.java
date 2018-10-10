import java.util.Arrays;

public class ChallengeListTest{

  public static void main(String[] args) {

    assertEquals("calcul de la moyenne", 11.0, ChallengeList.moyenne(12.0, 10,0));
    System.out.print("Laurent et Vincent");
  }



  public static void testMoyenne(String message, int resAttendu, int res){
    // TODO @B
  }

  public static void testPerimetreCarre(){
    // TODO @A
  }

  public static void testCommenceFini(){
    // TODO @B
  }

  public static void testNonMonotone(){
    // TODO @A
  }

  public static void testTarif(){
    // TODO @B
  }

  public static void testCaGele(){
    // TODO @A
  }

  public static void testFiltreShort(){
    // TODO @B
  }

  public static void testFiltreLetter(){
    // TODO @A
  }


  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }

  public static void assertEquals(String message, String[] expected, String[] res){
    if (java.util.Arrays.deepEquals(expected, res)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+Arrays.toString(expected)+", res : "+Arrays.toString(res)+")");
    }
  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (res : "+res+")");
    }
  }

  public static void assertFalse(String message, boolean res){
    assertTrue(message, !res);
  }
}
