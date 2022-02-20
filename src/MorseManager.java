import java.util.HashMap;
import java.util.Map;

public class MorseManager {


    HashMap<String, Character> morseToEng = new HashMap<>();
    HashMap<Character, String> fun = new HashMap<>();

    public String englishToMorse(String s) {
        char[] arr = s.toLowerCase().toCharArray();

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char bokstav = arr[i];
            String morsekod = getEngToMorse(bokstav);
            result += morsekod;
        }
        return result;
    }

    public String morseToEnglish(String s) {

        String result = "";

        String[] arr = s.split(" ");

        for (String m : arr) {
            result += getMorseToEng(m) + " ";
        }

        return result;
    }

    private String getMorseToEng(String m) {
        if (!morseToEng.containsKey(m)) {
            throw new IllegalArgumentException(" unknown letter");
        }
        return morseToEng.get(m) + " ";

    }

    private String getEngToMorse(char m) {
        if (!fun.containsKey(m)) {
            throw new IllegalArgumentException("unknown letter");


        }
        return fun.get(m);


    }


    public void mapMorseCode() {
        fun.put('a', ".-");
        fun.put('b', "-...");
        fun.put('c', "-.-.");
        fun.put('d', "-..");
        fun.put('e', ".");
        fun.put('f', "..-.");
        fun.put('g', "--.");
        fun.put('h', "....");
        fun.put('i', "..");
        fun.put('j', ".---");
        fun.put('k', "-.-");
        fun.put('l', ".-..");
        fun.put('m', "--");
        fun.put('n', "-.");
        fun.put('o', "---");
        fun.put('p', ".--.");
        fun.put('q', "--.-");
        fun.put('r', ".-.");
        fun.put('s', "...");
        fun.put('t', "-");
        fun.put('u', "..-");
        fun.put('v', "...-");
        fun.put('w', ".--");
        fun.put('x', "-..-");
        fun.put('y', "-.--");
        fun.put('z', "--..");
        fun.put('1', ".----");
        fun.put('2', "..---");
        fun.put('3', "...--");
        fun.put('4', "....-");
        fun.put('5', ".....");
        fun.put('6', "-....");
        fun.put('7', "--...");
        fun.put('8', "---..");
        fun.put('9', "----.");
        fun.put('0', "-----");
        fun.put('.', ".-.-.-");
        fun.put(',', "--..--");
        fun.put('?', "..--..");
        fun.put(' ', " ");

        for (Map.Entry s : fun.entrySet()) {
            morseToEng.put((String) s.getValue(), (char) s.getKey());
        }
    }
}




