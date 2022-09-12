//Benjamin Powell 08/28/22 this is the item generic class 
public class Item<T> {
    private T e;

    /**
     * This method is used to set the value of e 
     * @param Value is passed by the uder to set e
     */
    void setE(T Value) {
    
        e = Value;
    }//end of setE
    
    /**
     * this is a normal getter method to get the value of e
     * @return the value of e 
     */
    T getter() {
    
        return e;
    }//end of getter
}//end of class
