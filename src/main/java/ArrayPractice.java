import java.util.Arrays;

public class ArrayPractice<E> {

    private E[] myArray;

    //Constructor
    public ArrayPractice(E[] myArray){
        this.myArray = myArray;
    }

    //Getter
    public E[] getMyArray() {
        return myArray;
    }

    // Setter
    public void setMyArray(E[] myArray) {
        this.myArray = myArray;
    }

    // Methods
    public void print(){
        System.out.println(Arrays.toString(myArray));
    }
}
