public class task1HomeWork2 {
  public static void main(String[] args) {
    String input = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";
    StringBuilder strB = new StringBuilder();
    String [] temp = input.split(":|,");
    for (int i = 0; i < temp.length; i++) {
      temp[i] = temp[i].replaceAll("\"", "");
    }
    temp[0] = temp[0].replace("{","");
    temp[temp.length-1] = temp[temp.length-1].replace("}","");
    for (int i = 0; i < temp.length-1; i+=2) {
      if (!temp[i+1].equals("null")) {
        if (strB.length() == 0) {
        strB.append("\"" + temp[i] + "\"" + ":" + "\"" + temp[i + 1] + "\"");
      } else {strB.append("," + "\"" + temp[i] + "\"" + ":" + "\"" + temp[i + 1] + "\""); }
      }
    }
    StringBuilder strFinaly = new StringBuilder("{" + strB + "}");
    System.out.println(strFinaly);
  }  
}
