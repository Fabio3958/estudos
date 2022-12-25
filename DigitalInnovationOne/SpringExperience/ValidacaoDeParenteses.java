package DigitalInnovationOne.SpringExperience;

public class ValidacaoDeParenteses {

    public static boolean isValid(String str){

        if (str.charAt(0) == '(' && str.charAt(1) == ')')
            return true;

        if (str.charAt(0) == '{' && str.charAt(1) == '}')
            return true;

        return str.charAt(0) == '[' && str.charAt(1) == ']';
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

}
