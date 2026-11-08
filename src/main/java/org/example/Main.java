package org.example;

public class Main {
    public static void main(String[] arg) {
        String s = "J@va the be$t!123";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        String result = new String(chars);

        System.out.println(result);
    }
}

//    int n = s.length();
//    char c = s.charAt(0);
//    char[] chars = s.toCharArray();
//    StringBuilder reverseS = new StringBuilder();

//    for(int i = chars.length - 1; i >= 0; i--){
//        reverseS.append(chars[i]);
//    }
//    String reversed = reverseS.toString();
//
//    System.out.println(reversed);
//
//    }
//}
