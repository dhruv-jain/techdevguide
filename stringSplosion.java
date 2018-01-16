/*Given a non-empty string like "Code" return a string like "CCoCodCode".
http://codingbat.com/prob/p117334

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"*/

public String stringSplosion(String str) {
  String result = "";
  // On each iteration, add the substring of the chars 0..i
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
}
