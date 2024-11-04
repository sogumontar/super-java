/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2024 All Rights Reserved.
 */
package banksoal.Coky.Fazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version $Id: Tagger.java, v 0.1 2024‐05‐31 10.25 dongsheng.hds Exp $$
 */
public class Tagger {

    static final Map<String, String> VALID_TAG = new HashMap<>();
    static {
        VALID_TAG.put("{","}");
        VALID_TAG.put("(",")");
        VALID_TAG.put("[","]");
        VALID_TAG.put("<",">");
    }
    static final Stack<String> tagStack = new Stack<>();

    public static void main(String[] args) {
        String str = "{{[]}}([])";
        String strHtml = "<html><a><b>{{}}</b></a></html>";
        System.out.println(isValidTag(strHtml));

    }

    private static boolean isValidTag(String str){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0 ; i<str.length() ; i++){
            if(VALID_TAG.get(String.valueOf(str.charAt(i))) != null){
                if(str.charAt(i) == '<'){
                    int closeTag = str.indexOf('>', i);
                    if(!pushHtmlTag(str, closeTag, i)){
                        return false;
                    }
                    i = closeTag;
                }else {
                    tagStack.push(String.valueOf(str.charAt(i)));
                }
            }else{
                if(tagStack.isEmpty()){
                    return false;
                }
                String lastTag = tagStack.pop();
                if(!VALID_TAG.get(lastTag).equals(String.valueOf(str.charAt(i)))){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean pushHtmlTag(String str, int closeTag, int i){
        if(closeTag == -1){
            return false;
        }
        String tag = str.substring(i, closeTag+1);
        if(str.charAt(i+1) == '/'){
            if (tagStack.isEmpty()) {
                return false;
            }
            String lastTag = tagStack.pop();
            if(!lastTag.equals(tag.replace("/", ""))){
                return false;
            }
        }else{
            tagStack.push(tag);
        }
        return true;
    }
}