import java.util.*;
class Data{
    private Object object;

    public Data(Object object){
        this.object = object;
    }

    public Object getObject(Object object){
        return object;
    }

    public String toString(){
        return object.toString();
    }
}

class Name{
    private String name;

    public Name(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        // return "Name{" + "name=" + name + "\'" + "}";
        return name;
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
        element.add(new Data(new Name("Shruti")));
        System.out.println(element);

        Data x = new Data("Hello World");
        // System.out.println(x.getObject());
    }
}