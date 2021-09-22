public class StringPractice {
    private String myString;
    
    public StringPractice(String myString){
        this.myString = myString;
    }
    
    public StringPractice(char c){
        this.myString = Character.toString(c);
    }

    public StringPractice(StringBuilder myStrBuilder){
        this.myString = myStrBuilder.toString();
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String newStr){
        this.myString = newStr;
    }

    public void print(){
        System.out.println(myString);
    }
}
