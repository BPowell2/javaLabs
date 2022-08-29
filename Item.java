//Benjamin Powell 08/28/22 this is the item generic class 
public class Item<T> {
    private T e;

    void setE(T Value) {
    
        e = Value;
    }//end of setE
    T getter() {
    
        return e;
    }//end of getter
}//end of class
