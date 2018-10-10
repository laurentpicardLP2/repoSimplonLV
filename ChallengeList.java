public class ChallengeList {
//laurent
  /**
  * retourne la moyenne de a et de b
  */
  public static double moyenne(double a, double b){
    int c=3;
    int d=3;

    // TODO @A
    return (a + b) / 2;
  }

  /**
  * retourn le perimetre d'un carre de cÃ´tÃ© a
  */
  public static int perimetreCarre(int a){
    // TODO @B
    return 4 * a;
  }

  /**
  * retourne L vrai si les 2 lettres du dÃ©but et de la fin sont les mÃªmes
  * ex "ABCDDFAB" : true
  */
  public static boolean commenceFini(String mot){
    // TODO @A laurent uuu
    int e=3; // test branche
    int f=3; // test branche
    int g=3; // test branche
    int h=3;
    int i=5;

    return mot.charAt(0) == mot.charAt(mot.length() - 1);
  }

  /**
  * retourne vrai si le mot contient des lettres diffÃ©rentes
  * ex "AAAAAA" : false
  * "AAAHAA" : true
  */
  public static boolean nonMonotone(String mot){
    // TODO @B Vincent
      for (int i = 0; i < mot.length(); i++) {
        for (int j = (i + 1); j < mot.length(); j++) {
          if (mot.charAt(i) != mot.charAt(j)) {
            return false;
          }
      }

    }
    return true;
  }

  /**
  * retourne le tarif associÃ© Ã  l'Ã¢ge :
  * "gratuit" pour les moins de 3 ans
  * "reduit" pour les 3 Ã  12 ans
  * "plein" pour les autres
  * "erreur" si age nÃ©gatif
  **/
  public static String tarif(int age){
    // TODO @A
    if(age < 0){
      return "erreur";
    }
    if (age < 3) {
      return "gratuit";
    }
    if(age >=3 && age <=12){
      return "reduit";
    }

    return "plein";

  }
;
  /**
  * retourne un message correspondant Ã  la tempÃ©rature :
  * "Ã§a gÃ¨le" si la temperature est nÃ©gative
  * "Ã§a caille" pour une temperature entre 0 et 5
  * "RAS" pour une temperature en 5 et 90
  * "Ã§a bouille" si la tempÃ©rature est supÃ©rieure Ã  90
  * "erreur" si la tempÃ©rature est infÃ©rieure Ã  -274
  **/
  public static String caGele(int temperature){
    // TODO @B vincent
    if (temperature < 0 && temperature >= -274) {
      return "Ca gele";
    }
    if (temperature >= 0 && temperature < 5) {
      return "Ca caille";
    }
    if (temperature >= 5 && temperature <= 90) {
      return "RAS";
    }
    if (temperature > 90) {
      return "Ca bouille";
    }
      return "erreur";

}

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
  **/
  public static String[] filtreShort(String[] noms){
    // TODO @A
    return null;
  }


  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
  **/
  public static String[] filtreLetter(String[] noms, char lettre){
    // TODO @B
    return null;
  }


  /**
  * un exemple
  **/
  public static int squareDigits(int n) {
    String res="";
    for (char digit : (n+"").toCharArray()){
      int d = Character.getNumericValue(digit);
      res = res + (d*d);
    }
    return Integer.parseInt(res);
  }


}

public class ChallengeList {
//laurent
  /**
  * retourne la moyenne de a et de b
  */
  public static double moyenne(double a, double b){
    int c=3;
    int d=3;

    // TODO @A
    return (a + b) / 2;
  }

  /**
  * retourn le perimetre d'un carre de cÃ´tÃ© a
  */
  public static int perimetreCarre(int a){
    // TODO @B
    return 4 * a;
  }

  /**
  * retourne L vrai si les 2 lettres du dÃ©but et de la fin sont les mÃªmes
  * ex "ABCDDFAB" : true
  */
  public static boolean commenceFini(String mot){
    // TODO @A laurent uu
    int e=3; // test branche
    int f=3; // test branche
    int g=3; // test branche
    int h=4;
    int i=5;

    return mot.charAt(0) == mot.charAt(mot.length() - 1);
  }

  /**
  * retourne vrai si le mot contient des lettres diffÃ©rentes
  * ex "AAAAAA" : false
  * "AAAHAA" : true
  */
  public static boolean nonMonotone(String mot){
    // TODO @B Vincent
      for (int i = 0; i < mot.length(); i++) {
        for (int j = (i + 1); j < mot.length(); j++) {
          if (mot.charAt(i) != mot.charAt(j)) {
            return false;
          }
      }

    }
    return true;
  }

  /**
  * retourne le tarif associÃ© Ã  l'Ã¢ge :
  * "gratuit" pour les moins de 3 ans
  * "reduit" pour les 3 Ã  12 ans
  * "plein" pour les autres
  * "erreur" si age nÃ©gatif
  **/
  public static String tarif(int age){
    // TODO @A
    if(age < 0){
      return "erreur";
    }
    if (age < 3) {
      return "gratuit";
    }
    if(age >=3 && age <=12){
      return "reduit";
    }

    return "plein";

  }

  /**
  * retourne un message correspondant Ã  la tempÃ©rature :
  * "Ã§a gÃ¨le" si la temperature est nÃ©gative
  * "Ã§a caille" pour une temperature entre 0 et 5
  * "RAS" pour une temperature en 5 et 90
  * "Ã§a bouille" si la tempÃ©rature est supÃ©rieure Ã  90
  * "erreur" si la tempÃ©rature est infÃ©rieure Ã  -274
  **/
  public static String caGele(int temperature){
    // TODO @B vincent
    if (temperature < 0 && temperature >= -274) {
      return "Ca gele";
    }
    if (temperature >= 0 && temperature < 5) {
      return "Ca caille";
    }
    if (temperature >= 5 && temperature <= 90) {
      return "RAS";
    }
    if (temperature > 90) {
      return "Ca bouille";
    }
      return "erreur";

}

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
  **/
  public static String[] filtreShort(String[] noms){
    // TODO @A
    return null;
  }


  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
  **/
  public static String[] filtreLetter(String[] noms, char lettre){
    // TODO @B
    return null;
  }


  /**
  * un exemple
  **/
  public static int squareDigits(int n) {
    String res="";
    for (char digit : (n+"").toCharArray()){
      int d = Character.getNumericValue(digit);
      res = res + (d*d);
    }
    return Integer.parseInt(res);
  }


}
