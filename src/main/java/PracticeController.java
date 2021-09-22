public class PracticeController<E> {

    //Practice objects
    private IntPractice myInt;
    private StringPractice myString;
    private ArrayPractice myArray;

    //Practice Controller constructor
    public PracticeController(int myInt, String myStr, E[] myArray){
        this.myInt = new IntPractice(myInt);
        this.myString = new StringPractice(myStr);
        this.myArray = new ArrayPractice<E>(myArray);
    }

    //Main method
    public static void main(String[] args){
        PracticeController firstPracticeController = new PracticeController<Integer>(5, "Testing", new Integer[] {1,2,3, 4,5});

        firstPracticeController.getStringMain().print();

        firstPracticeController.getMyArray().print();
    }

    // Getters
    public IntPractice getIntMain() {
        return myInt;
    }
    public StringPractice getStringMain() {
        return myString;
    }
    public ArrayPractice getMyArray(){
        return myArray;
    }
}
