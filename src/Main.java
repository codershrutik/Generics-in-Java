import java.util.*;
class Data{
    private Object object;

    public Data(Object object){
        this.object = object;
    }

    public String toString(){
        return object.toString();
    }
}

public class Main{
    public static void main(String[] args) {
        List<Data> element = new LinkedList<>();
        element.add(new Data("Shruti"));
        element.add(new Data('§'));
        element.add(new Data(25));
        element.add(new Data(52.25));
        element.add(new Data("Meow"));
        System.out.println(element);
    }
}