package com.soulmate.structure;

import java.util.Stack;

public class P20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int ptr=0;
        char cha;
        while (ptr<s.length()){
            cha=s.charAt(ptr);
            if(cha=='('||cha=='{'||cha=='['){
                stack.push(cha);
            }else {
                if(cha==')')
                   cha='(';
                if(cha=='}')
                    cha='{';
                if(cha==']')
                    cha='[';

                if(stack.isEmpty()||stack.pop()!=cha)
                    return false;
            }
            ptr++;
        }
        return stack.isEmpty();
    }
}
