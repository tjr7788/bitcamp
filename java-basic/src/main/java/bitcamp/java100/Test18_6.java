package bitcamp.java100;

public class Test18_6 {
    public static void main(String[] args) {
        String email = "hong@test.com";
        System.out.println(email.matches("1hong@test.com"));
        
        System.out.println(email.matches("^\\D.+@.+\\..+"));    //true or false
        
        String str = "홍길동(hong@test.com), 안중근(ahn@test.com), " + "유관순(yuu@test.com)";
        
        java.util.regex.Pattern pattern = 
                java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int startIndex = 0;
        while(matcher.find(startIndex)) {   
            String matchString = matcher.group();   //String
            startIndex = matcher.start() + matchString.length();
            System.out.println(matchString);
        }
    }
}



