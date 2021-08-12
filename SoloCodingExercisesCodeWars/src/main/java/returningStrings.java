public class returningStrings {


    public static void main(String[] args) {

        System.out.println(greet2("Murs"));
        System.out.println(greet1("Uzeyir"));
        System.out.println(greet4("Mohamet"));
        System.out.println(greet4("Adam"));

    }


    public static String greet1(String name){
        /* String.format method has been used here %s is format specifier takes any type outputs String value
        For more The java string format() method and Java String Format Specifiers
        Throws  NullPointerException : if format is null. IllegalFormatException : if format is illegal or incompatible.
        * */
        return String.format("Hello, %s how are you doing today?", name);
    }
    public static boolean greet4(String name){

        System.out.println("Hello, " + name + " how are you doing today?");
        return false;
    }

    public static String greet2(String name){

        return "Hello, "+ name + " how are you doing today?"; //Little Advance
    }

    public static String greet3(String name){
        StringBuilder builder =  new StringBuilder();
        return builder.append("Hello, ").append(name).append(" how are you doing today?").toString();
    }
}
