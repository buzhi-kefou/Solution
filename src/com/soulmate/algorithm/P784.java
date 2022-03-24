package com.soulmate.algorithm;

import java.util.LinkedList;
import java.util.List;

public class P784 {

    public static void main(String[] args) {
        System.out.println('a' - 'A');
        System.out.println('q' - 'Q');
        System.out.println('Q' - 'q');
        System.out.println('C' - 'c');
    }

    LinkedList<String> strings = new LinkedList<>();

    public List<String> letterCasePermutation(String s) {
        StringBuilder builder = new StringBuilder();
        function(0, s.length(), s, builder);
        return strings;
    }

    public void function(int ptr, int len, String str, StringBuilder sb) {
        if (ptr == str.length()) {
            strings.add(sb.toString());
            return;
        }
        char ch;
        ch = str.charAt(ptr);
        if (!Character.isDigit(ch)) {
            StringBuilder builder = new StringBuilder(sb);
            if (Character.isUpperCase(ch))
                builder.append((char) (ch + 32));
            else
                builder.append((char) (ch - 32));
            function(ptr + 1, len, str, builder);
        }
        sb.append(ch);
        function(ptr + 1, len, str, sb);
    }
}
