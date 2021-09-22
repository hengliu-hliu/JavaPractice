import java.util.Arrays;

public class ArrayPractice<E> {

    private E[] myArray;

    public ArrayPractice(E[] myArray){
        this.myArray = myArray;
    }

    public E[] getMyArray() {
        return myArray;
    }

    public void setMyArray(E[] myArray) {
        this.myArray = myArray;
    }

    public void print(){
        System.out.println(Arrays.toString(myArray));
    }
}
