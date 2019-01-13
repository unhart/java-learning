// Need to checking, but basicly same as containNumbersOnly-class
private static double str2doubel(String str) {
  double num = 0;
  double num2 = 0;
  int idForDot = str.indexOf('.');
  boolean isNeg = false;
  String st;
  int start = 0;
  int end = str.length();

  if (idForDot != -1) {
      st = str.substring(0, idForDot);
      for (int i = str.length() - 1; i >= idForDot + 1; i--) {
          num2 = (num2 + str.charAt(i) - '0') / 10;
      }
  } else {
      st = str;
  }

  if (st.charAt(0) == '-') {
      isNeg = true;
      start++;
  } else if (st.charAt(0) == '+') {
      start++;
  }

  for (int i = start; i < st.length(); i++) {
      if (st.charAt(i) == ',') {
          continue;
      }
      num *= 10;
      num += st.charAt(i) - '0';
  }

  num = num + num2;
  if (isNeg) {
      num = -1 * num;
  }
  return num;
}


// Currently working
private static boolean containNumbersOnly(String source) {
  boolean result = false;
  Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
  pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.

  result = pattern.matcher(source).matches();
  if(result){ return true; } else { return false; }
}


// // Decimal validator for string file, if file is containing only decimal it will be returning true-value othweise it's false;
// private static boolean containNumbersOnly(String source) {
//   boolean result = false;
//   Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
//   if((boolean)Pattern.compile("\\d+.\\d+")) {
//     pattern = Pattern.compile("\\d+.\\d+");
//   } else {
//     pattern = Pattern.compile("\\d+");
//   }
//   result = pattern.matcher(source).matches();
//   if(result){ return true; } else { return false; }
// }
//

// Currently working
private static boolean validateStringForNumbers(String source) {
  String[] _pattern = {"[0-9]+.[0-9]+", "[0-9]+", "[a-zA-Z_0-9]+"};
  String[] _REGexp = {"\\d+.\\d+", "\\d+", "\\s+"};
  boolean _result = false;
//    Pattern pattern = Pattern.compile();
//    Pattern pattern = Pattern.compile();
  //switch((source == Pattern.compile(_pattern))) {
//    switch(ArrayUtils.isEquals(_pattern, source)) {
  /*switch(Arrays.stream(_pattern).anyMatch(source::equals)) {
    case 0:
      Pattern pattern1 = Pattern.compile(_pattern[0]);
      pattern1 = Pattern.compile(_REGexp[0]);
      _result = pattern1.matcher(source).matches();
    break;
    case 1:
      Pattern pattern2 = Pattern.compile(_pattern[1]);
      pattern2 = Pattern.compile(_REGexp[1]);
      _result = pattern2.matcher(source).matches();
    break;
    case 2:
      _result = false;
    break;
  }*/
  if(Arrays.stream(_pattern).anyMatch(Pattern.matcher(source)::equals)) {
    _result = true;
  } else {
    _result = false;
  }

  return (boolean)_result;
}
