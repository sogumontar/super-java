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
 * @version $Id: TagBracket.java, v 0.1 2024‐05‐26 11.56 dongsheng.hds Exp $$
 */
public class TagBracket {

    /** final value for Tag's  */
    private  static final Map<String, String> TAG = new HashMap<>();

    /** initialize TAG */
    static {
        TAG.put("(", ")");
        TAG.put("[", "]");
        TAG.put("{", "}");
    }

    public static void main(String[] args) {
        System.out.println(isValidFormat("<html><a></a><b></b></html>"));
    }

    /**
     * Check whether the tag's format is valid or not
     * @param tag
     * @return
     */
    private static boolean isValidFormat(String tag){
        //validate nullability param
        if(Objects.isNull(tag)){
            return false;
        }
        if(tag.charAt(0) == '<'){
            return isValidHtmlFormat(tag);
        }
        return isValidCodeFormat(tag);
    }

    private static boolean isValidCodeFormat(String tag){
        //validate param's length
        if(tag.length() % 2 != 0){
            return false;
        }

        for (int i = 0; i < (tag.length() / 2) ; i++) {

            //compare open and close tag
            if(!Objects.equals(TAG.get(String.valueOf(tag.charAt(i))),
                    String.valueOf(tag.charAt(tag.length() - 1 - i)))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidHtmlFormat(String tag){
        Stack<String> stackTextTag = new Stack<>();
        int i=0;
        while (i< tag.length()){
            int tagTextPos = tag.indexOf('>', i);
            if(tagTextPos == -1){
                return false;
            }
            String tagText = tag.substring(i, tagTextPos + 1);
            if(!tagText.contains("/")) {
                stackTextTag.push(tagText);
            } else {
                if(stackTextTag.isEmpty()){
                    return false;
                }
                String openTag = stackTextTag.pop();
                if(!isMatchingTag(openTag, tagText)){
                    return false;
                }
            }
            i=tagTextPos+1;
        }
        return stackTextTag.isEmpty();
    }


    private static boolean isMatchingTag(String openTextTag, String closeTextTag) {
        return openTextTag.equals(closeTextTag.replace("/", ""));
    }
}