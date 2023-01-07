

/*
中文等字符转码原理：
先转化为Unicode码
再转换为二进制
-代表1 .代表0
 */
public class ToMorse{
    public static String toMorse(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            out += getMorse(getBasicMorse(str.charAt(i)));
            if(i<str.length()-1) out+="/";
        }
        return out;
    }
    public static String getMorse(String basic){
        String out="";
        for (int i = 0; i < basic.length(); i++) {
            if(basic.charAt(i)=='1') out += "-";
            if(basic.charAt(i)=='0') out += ".";
        }
        return out;
    }
    public static String getBasicMorse(char a){
        a=Character.toUpperCase(a);
        String out = "";
        switch (a){
            case 'A' : out += "01" ; break;
            case 'B' : out += "1000" ; break;
            case 'C' : out += "1010" ; break;
            case 'D' : out += "100" ; break;
            case 'E' : out += "0" ; break;
            case 'F' : out += "0010" ; break;
            case 'G' : out += "110" ; break;
            case 'H' : out += "0000" ; break;
            case 'I' : out += "00" ; break;
            case 'J' : out += "0111" ; break;
            case 'K' : out += "101" ; break;
            case 'L' : out += "0100" ; break;
            case 'M' : out += "11" ; break;
            case 'N' : out += "10" ; break;
            case 'O' : out += "111" ; break;
            case 'P' : out += "0110" ; break;
            case 'Q' : out += "1101" ; break;
            case 'R' : out += "010" ; break;
            case 'S' : out += "000" ; break;
            case 'T' : out += "1" ; break;
            case 'U' : out += "001" ; break;
            case 'V' : out += "0001" ; break;
            case 'W' : out += "011" ; break;
            case 'X' : out += "1001" ; break;
            case 'Y' : out += "1011" ; break;
            case 'Z' : out += "1100" ; break;
            case '0' : out += "11111" ; break;
            case '1' : out += "01111" ; break;
            case '2' : out += "00111" ; break;
            case '3' : out += "00011" ; break;
            case '4' : out += "00001" ; break;
            case '5' : out += "00000" ; break;
            case '6' : out += "10000" ; break;
            case '7' : out += "11000" ; break;
            case '8' : out += "11100" ; break;
            case '9' : out += "11110" ; break;
            case '.' : out += "010101" ; break;
            case ':' : out += "111000" ; break;
            case ',' : out += "110011" ; break;
            case ';' : out += "101010" ; break;
            case '?' : out += "001100" ; break;
            case '=' : out += "10001" ; break;
            case '\'' : out += "011110" ; break;
            case '/' : out += "10010" ; break;
            case '!' : out += "101011" ; break;
            case '-' : out += "100001" ; break;
            case '_' : out += "001101" ; break;
            case '"' : out += "010010" ; break;
            case '(' : out += "10110" ; break;
            case ')' : out += "101101" ; break;
            case '$' : out += "0001001" ; break;
            case '&' : out += "01000" ; break;
            case '@' : out += "011010" ; break;
            default:
                out = Integer.toBinaryString(a);
        }
        return out;
    }
}