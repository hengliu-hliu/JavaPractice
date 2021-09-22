public class StringPractice {

    private String myString;

    //Constructors
    public StringPractice(String myString){
        this.myString = myString;
    }
    
    public StringPractice(char c){
        this.myString = Character.toString(c);
    }

    public StringPractice(StringBuilder myStrBuilder){
        this.myString = myStrBuilder.toString();
    }

    // Getter
    public String getMyString() {
        return myString;
    }

    //Setter
    public void setMyString(String newStr){
        this.myString = newStr;
    }

    /*common methods*/

    public void print(){
        System.out.println(myString);
    }

    // + and ...
    public void combine(String...strs){

        for(String str : strs){
            myString += str;
        }
    }

    // Demonstration of some useful methods from the String class
    public void commonMethods(){

        int strLength = myString.length();

        print();

        //length()
        System.out.println("length(): "+ strLength);

        //codePointAt()
        System.out.println("codepointAt(): " + myString.codePointAt(strLength-1));

        //indexOf()
        System.out.println("indexOf(): " + myString.indexOf("e"));

        //isBlank(), isEmpty()

        //regex, matches()

        //split()

        //strip()

        //String.valueOf()



    }


}
