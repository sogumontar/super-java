package banksoal.Cermati;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : Main, v 0.1 4/30/22 8:35 AM Sogumontar Hendra Exp $$
 */
import java.io.*;
import java.math.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class CermatiTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String author = bufferedReader.readLine();

        List<String> result = Result.getAuthorHistory(author);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Result {

    /*
     * Complete the 'getAuthorHistory' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING author as parameter.
     *
     * Base urls:
     *   https://jsonmock.hackerrank.com/api/article_users?username=
     *   https://jsonmock.hackerrank.com/api/articles?author=
     *
     */

    public static List<String> getAuthorHistory(String author) {


        String articleUserBaseUrl = "https://jsonmock.hackerrank.com/api/article_users?username=";
        String articlesBaseUrl = "https://jsonmock.hackerrank.com/api/articles?author=";


        List<String> result  = new ArrayList<>();
        consume(articleUserBaseUrl, author, result);
        consume(articlesBaseUrl, author, result);

        System.out.println(result);


        return result;
    }

    public static void consume(String baseUrl, String fieldValue, List<String> result){

        try {

            URL url = new URL( baseUrl+ fieldValue);//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                                           + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                storeData(result, output);
            }
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
    }

    public static void storeData(List<String> history, String output){
        Map<String,String> dataMap = getImportantDataFromJsonString(output);
        if(dataMap.containsKey("about")){
            history.add(dataMap.get("about"));
        }else{
            String title =dataMap.get("title");
            String story_title =dataMap.get("story_title");
            if(!title.isEmpty() && title !=null){
                history.add(title);
            }else if(!story_title.isEmpty() && title != null){
                history.add(story_title);
            }

        }
    }


    private static Map<String,String> getImportantDataFromJsonString(String jsonString){
        Map<String,String> map = new HashMap<>();
        jsonString = jsonString.replaceAll("\\{", "").replaceAll("}", "").replaceAll("\\[", "").replaceAll("]","").replaceAll("\":","*").replaceAll("\"", "");

        String[] arrayData = jsonString.split(",");
        for (String data: arrayData) {
            String[] splittedString = data.split("\\*");
            map.put(splittedString[0],splittedString[1]);
        }
        return map;
    }

}

