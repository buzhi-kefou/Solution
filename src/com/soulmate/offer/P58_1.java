package com.soulmate.offer;

public class P58_1 {

    public static void main(String[] args) {
        String string = new String("the sky is blue");
        System.out.println(new P58_1().reverseWords(string));
    }

    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        int i, j;
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                for (j = i; j >= 0; j--) {
                    if (s.charAt(j) == ' ') {
                        if (builder.length() == 0) {
                            builder.append(s, j + 1, i + 1);
                        } else {
                            builder.append(" " + s.substring(j + 1, i + 1));
                        }
                        break;
                    }
                    if (j == 0) {
                        if (builder.length() == 0) {
                            builder.append(s, j, i + 1);
                        } else {
                            builder.append(" " + s.substring(j, i + 1));
                        }
                    }
                }
                i = j;
            }
        }
        return builder.toString();
    }

}
