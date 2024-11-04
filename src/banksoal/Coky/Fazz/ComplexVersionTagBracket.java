/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.Coky.Fazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: ComplexVersionTagBracket.java, v 0.1 2024‐05‐26 16.44 dongsheng.hds Exp $$
 */
public class ComplexVersionTagBracket extends BaseVersionTagBracket{

    public static void main(String[] args) {
        System.out.println(isValidFormat("<a><html></html></a>"));
    }
    /**
     * Check whether the tag's format is valid or not
     * @param tag
     * @return
     */
    private static boolean isValidFormat(String tag){

        if(Objects.isNull(tag)){
            return false;
        }

        if(tag.charAt(0) == '<'){
            return isHtmlFormatValid(tag);
        }

        return isCodeFormatValid(tag);
    }


}

class BaseVersionTagBracket {
    /** final value for Tag's  */
    static final Map<String, String> TAG = new HashMap<>();
    static final Stack<String> tagTextStack = new Stack<>();

    /** initialize TAG */
    static {
        TAG.put("(", ")");
        TAG.put("[", "]");
        TAG.put("{", "}");
    }

    /**
     * Check whether the number is even or not
     * @param number
     * @return
     */
    static boolean isEven(int number){
        return number % 2 == 0;
    }

    /**
     * Check whether the tag's format is valid or not {}()[]
     * @return
     */
    static boolean isCodeFormatValid(String tag){
        if(!isEven(tag.length())){
            return false;
        }

        for (int i = 0; i < (tag.length() / 2) ; i++) {

            if(!Objects.equals(TAG.get(String.valueOf(tag.charAt(i))),
                    String.valueOf(tag.charAt(tag.length() - 1 - i)))) {

                return false;

            }
        }
        return true;
    }

    /**
     * Check whether the tag's format is valid or not <html></html>
     * @return
     */
    static boolean isHtmlFormatValid(String tag){
        int i = 0;
        while (i < tag.length()){
            int closeTagPos = tag.indexOf('>', i);
            if(closeTagPos == -1){
                return false;
            }
            String tagText = tag.substring(i, closeTagPos + 1);
            if(!tagText.contains("/")){
                tagTextStack.push(tagText);
            }else{
                if(tagTextStack.isEmpty()){
                    return false;
                }
                if(!isMatch(tagTextStack.pop(), tagText)){
                    return false;
                }

            }
            i = closeTagPos +1;

        }
        return tagTextStack.isEmpty();
    }

    static boolean isMatch(String openTag, String closeTag){
        return openTag.equals(closeTag.replace("/", ""));
    }

}