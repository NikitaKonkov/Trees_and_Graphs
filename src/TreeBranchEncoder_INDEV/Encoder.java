package TreeBranchEncoder_INDEV;


public class Encoder {
    static int size = 0;
    static int len = 0;
    /**
     * Extends the given Hex text while (len < (2 ^ n))
     * @param text for extending
     * @return extended text*/
    public static String Extender(String text){
        int s = 2;
        int n = 0;
        while (s <= text.length()){
            s *= 2;
            n++;
        }
        len = (s - 1);
        size = n;
        n = 0;
        StringBuilder textBuilder = new StringBuilder(text);
        while (textBuilder.length() < len){
            textBuilder.append(textBuilder.charAt(n));
            n++;
        }
        text = textBuilder.toString();
        return text;
    }
    /**
     * */
    public static char[] Substitution(String text){
        String hex_text = Extender(Hex(text));
        int[] ea = Indexation.TreeArray(size);
        char[] out = new char[len];
        for (int n = 0; n < len; n++){
            out[ea[n]] = hex_text.charAt(n);
        }
        return out;
    }

    /**
     * Converts each character of the text, into hex values.
     * @param text for converting
     * @return hex string */
    public static String Hex(String text){
        StringBuilder out = new StringBuilder();
        for (int n: text.toCharArray()){
            out.append(Integer.toHexString(n));
        }
        return out.toString();
    }

    public static String unHex(char[] arr){
        StringBuilder out = new StringBuilder();
        for (int n = 0; n < arr.length-1; n+=2){
            out.append((char) Integer.parseInt(arr[n]+""+arr[n+1],16));
        }
        return out.toString();
    }


    //public static void Looper(){}


    public static void main(String[] args) {
        char[] text = Substitution("This is a test sentence, to proof a point 0123456789ABCDEFGHI11");
        //text = Substitution(unHex(text));
        System.out.println(text);
        int[] arr = Indexation.TreeArray(size);
        StringBuilder res = new StringBuilder();
        for (int n = 0; n < text.length-1; n+=2){
            res.append((char) Integer.parseInt((text[arr[n]]+""+text[arr[n+1]]),16));
        }
        System.out.println(res);
        text = Substitution(String.valueOf(res));
        res = new StringBuilder();
        for (int n = 0; n < text.length-1; n+=2){
            res.append((char) Integer.parseInt((text[arr[n]]+""+text[arr[n+1]]),16));
        }
        System.out.println(res);

        System.out.println(res);
        text = Substitution(String.valueOf(res));
        res = new StringBuilder();
        for (int n = 0; n < text.length-1; n+=2){
            res.append((char) Integer.parseInt((text[arr[n]]+""+text[arr[n+1]]),16));
        }
        System.out.println(res);
    }
}
