 class Main {
 }
     class Person

{
    public  String name;

    public Person (String naam)
    {
        name = naam;
    }

    public static void main(String[] args)
    {
        Person henk = new Person("Henk");
        Person mohamed = new Person("Mohamed");
        //mohamed.name = "Mohamed";
        henk = mohamed;
        System.out.println(mohamed.name);
        System.out.println(henk.name);
        //mohamed = henk;
        mohamed.name = "Jan";
        System.out.println(henk.name);
        System.out.println(mohamed.name);
        henk.name = "Piet";
        System.out.println(henk.name);
        System.out.println(mohamed.name);
        henk = new Person("Henk");
        Person aziza = new Person("Aziza");
        System.out.println(henk.name);
        System.out.println(mohamed.name);
        mohamed.name = "Henk";
        System.out.println(henk.name);
        System.out.println(mohamed.name);
        if (mohamed == henk)
        {
            System.out.println("True1");
        }
        else
        {
            System.out.println("false1");
        }
        if (mohamed.equals(henk))
        {
            System.out.println("True2");
        }
        else
        {
            System.out.println("false2");
        }
        if (mohamed.name.equals(henk.name))
        {
            System.out.println("True3");
        }
        mohamed = henk;
        if (mohamed == henk)
        {
            System.out.println("True4");
        }
        else
        {
            System.out.println("false4");
        }
        if (mohamed.equals(henk))
        {
            System.out.println("True5");
        }
        else
        {
            System.out.println("false5");
        }
        if (mohamed.name.equals(henk.name))
        {
            System.out.println("True6");
        }
        if (mohamed.name == henk.name)
        {
            System.out.println("True7");
        }
        else
        {
            System.out.println("false7");
        }
    }
}