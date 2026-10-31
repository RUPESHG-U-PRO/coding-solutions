
class MyRegex {
    private static final String IP_BLOCK = "(\\d{1,2}|0\\d{2}|1\\d{2}|2[0-4]\\d|25[0-5])";
    public final String pattern = "^" + IP_BLOCK + "\\." + IP_BLOCK + "\\." + IP_BLOCK + "\\." + IP_BLOCK + "$";
//Write your code here
}
