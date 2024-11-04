/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.Coky.Fazz;

import java.util.Stack;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: TagValidator.java, v 0.1 2024‐05‐29 10.35 dongsheng.hds Exp $$
 */
public class TagValidator {
    public static void main(String[] args) {
        String[] testStrings = {
                "<html><a><b></b></a></html>",  // valid
                "<html><a><b></a></b></html>",  // not valid
                "{([)}",  // not valid
        };

        for (String str : testStrings) {
            System.out.println(str + " = " + (isValidHtml(str) ? "valid" : "not valid"));
        }
    }

    public static boolean isValidHtml(String str) {
        Stack<String> stack = new Stack<>();
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == '<') {
                int j = str.indexOf('>', i);
                if (j == -1) {
                    return false; // No closing '>' found
                }

                String tag = str.substring(i, j + 1);
                if (!tag.contains("/")) {
                    // Opening tag, push to stack
                    stack.push(tag);
                } else {
                    // Closing tag, pop from stack and compare
                    if (stack.isEmpty()) {
                        return false;
                    }
                    String openTag = stack.pop();
                    if (!isMatchingTag(openTag, tag)) {
                        return false;
                    }
                }
                i = j + 1;
            } else {
                i++;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingTag(String openTag, String closeTag) {
        return openTag.equals(closeTag.replace("/", ""));
    }
}