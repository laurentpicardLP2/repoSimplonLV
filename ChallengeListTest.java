import java.util.Arrays;

public class ChallengeListTest{





  public static void testMoyenne(){
    // TODO @B vincent
    assertEquals("calcul de la moyenne", 11.0, ChallengeList.moyenne(12.0, 10.0));
  }

  public static void testPerimetreCarre(){
    // TODO @A Laurent
    assertEquals("calcul de la perimetre", 16, ChallengeList.perimetreCarre(4));
  }

  public static void testCommenceFini(){
    // TODO @B Vincent
    assertTrue("calcul des lettres du début et de la fin", ChallengeList.commenceFini("BatmanB"));
  }

  public static void testNonMonotone(){
    // TODO @A Laurent
    assertTrue("verifie que ttes les lettres sont identiques", ChallengeList.commenceFini("aaaaaaaaa"));
  }

  public static void testTarif(){
    // TODO @B vincent
    assertEquals("calcul du tarif", "gratuit", ChallengeList.perimetreCarre(2));
    assertEquals("calcul du tarif", "reduit", ChallengeList.perimetreCarre(10));
    assertEquals("calcul du tarif", "plein", ChallengeList.perimetreCarre(38));
    assertEquals("calcul du tarif", "erreur", ChallengeList.perimetreCarre(-303));
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

public static void assertEquals(String message, String expected, String res){
  if (expected.equals(res)) {
    System.out.println("\nOK >> "+message);
  }
  else {
    throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
  }
}
