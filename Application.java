//Benjamin Powell this is the main class for the generic programs 
public class Application {
    public static void main(String[] args){
    
        Item<String> itemString = new Item<String>();
        itemString.setE("Bejamin Powell ");

        Item<Integer> itemInt = new Item<Integer>();

        SmallBag<Item> bag = new SmallBag<Item>();
        bag.setItem(itemString);
        System.out.println(bag.getItem().getter());

        bag.setItem(itemInt);
        itemInt.setE(123);

        System.out.println(bag.getItem().getter());
    }//end of main 
}//end of class 
