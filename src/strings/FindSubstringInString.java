package strings;

class FindSubstringInString {
    public static String findSubstringInString(String []str) {
            String mainSTring = str[0];
            String []words = str[1].split(",");
            String  firstPart="";
            String secondPart="";
            for(String word:words) {
                int wordLength = word.length();
                if(mainSTring.startsWith(word) && firstPart.length()<wordLength) {
                    firstPart = word;
                }else if(mainSTring.endsWith(word) && secondPart.length()<wordLength) {
                    secondPart = word;
                }
            }
            return firstPart+","+secondPart;
    }

    public static void main(String[] args) {
        String[] str ={"baseball","base,all,a,ball"};
        System.out.println(findSubstringInString(str));
    }
}

