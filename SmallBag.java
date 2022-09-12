//Benjamin Powell this is the smallbag generic class 08/27/22
public class SmallBag<T> {
    Item<T> item;
    
    /**
     * this is the setItem method that sets the item within the bag
     * @param Value is the item that is added into the bag
     */
    void setItem(Item Value) {
    
        item = Value;
    }// end of setItem
    /**
     * this is the normal get method for the item inside the bag
     * @return the item inside the bag
     */
    Item getItem() {
    
        return item;
    }//end of getItem 
}//end of class 
