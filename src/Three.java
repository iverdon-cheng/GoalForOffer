public class Three {
    public String replaceSpace(StringBuffer str) {
        int length = str.length()-1;
        for(int i=0; i<=length; i++){
            if(str.charAt(i)== ' '){
                str.append(' ');
                str.append(' ');
            }
        }
        int resultLength = str.length()-1;
        while (length>=0 && resultLength>length){
            if (str.charAt(length) == ' '){
                str.setCharAt(resultLength--,'0') ;
                str.setCharAt(resultLength--,'2') ;
                str.setCharAt(resultLength--,'%') ;
                length--;
            }else {
                str.setCharAt(resultLength--,str.charAt(length--));
            }
        }
        return str.toString();
    }
}
