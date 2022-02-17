package banksoal;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : ExtendClass, v 0.1 2/14/22 12:46 PM Sogumontar Hendra Exp $$
 */
public class ExtendClass {
    public static void main(String[] args) {
        aClass a = new aClass();
        test(a);
    }

    public static void test(bClass b){
        b.cc = 12;
        System.out.println(b.cc);
    }
}

class aClass extends bClass{
    String ab;
    Integer ad;
}

class bClass{
    Integer cc;
}