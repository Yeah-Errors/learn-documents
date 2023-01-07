public class ToCh {
    public static String toBasic(String str){
        String out=str.replaceAll("-","1");
        out=out.replaceAll("\\.","0");
        return out;
    }
    public static String basicToCh(String str){
        StringBuilder out= new StringBuilder();
        String[] basic = str.split("[/| ]");
        for (String s : basic) {
            switch (s) {
                case "010101":
                    out.append(".");
                    break;
                case "111000":
                    out.append(":");
                    break;
                case "110011":
                    out.append(",");
                    break;
                case "101010":
                    out.append(";");
                    break;
                case "001100":
                    out.append("?");
                    break;
                case "10001":
                    out.append("=");
                    break;
                case "011110":
                    out.append("'");
                    break;
                case "10010":
                    out.append("/");
                    break;
                case "101011":
                    out.append("!");
                    break;
                case "100001":
                    out.append("-");
                    break;
                case "001101":
                    out.append("_");
                    break;
                case "010010":
                    out.append("\"");
                    break;
                case "10110":
                    out.append("(");
                    break;
                case "101101":
                    out.append(")");
                    break;
                case "0001001":
                    out.append("$");
                    break;
                case "01000":
                    out.append("&");
                    break;
                case "011010":
                    out.append("@");
                    break;
                case "01":
                    out.append("A");
                    break;
                case "1000":
                    out.append("B");
                    break;
                case "1010":
                    out.append("C");
                    break;
                case "100":
                    out.append("D");
                    break;
                case "0":
                    out.append("E");
                    break;
                case "0010":
                    out.append("F");
                    break;
                case "110":
                    out.append("G");
                    break;
                case "0000":
                    out.append("H");
                    break;
                case "00":
                    out.append("I");
                    break;
                case "0111":
                    out.append("J");
                    break;
                case "101":
                    out.append("K");
                    break;
                case "0100":
                    out.append("L");
                    break;
                case "11":
                    out.append("M");
                    break;
                case "10":
                    out.append("N");
                    break;
                case "111":
                    out.append("O");
                    break;
                case "0110":
                    out.append("P");
                    break;
                case "1101":
                    out.append("Q");
                    break;
                case "010":
                    out.append("R");
                    break;
                case "000":
                    out.append("S");
                    break;
                case "1":
                    out.append("T");
                    break;
                case "001":
                    out.append("U");
                    break;
                case "0001":
                    out.append("V");
                    break;
                case "011":
                    out.append("W");
                    break;
                case "1001":
                    out.append("X");
                    break;
                case "1011":
                    out.append("Y");
                    break;
                case "1100":
                    out.append("Z");
                    break;
                case "11111":
                    out.append("0");
                    break;
                case "01111":
                    out.append("1");
                    break;
                case "00111":
                    out.append("2");
                    break;
                case "00011":
                    out.append("3");
                    break;
                case "00001":
                    out.append("4");
                    break;
                case "00000":
                    out.append("5");
                    break;
                case "10000":
                    out.append("6");
                    break;
                case "11000":
                    out.append("7");
                    break;
                case "11100":
                    out.append("8");
                    break;
                case "11110":
                    out.append("9");
                    break;
                default:
                    out.append((char) Integer.parseInt(s, 2));
            }
        }
        return out.toString();
    }
}
