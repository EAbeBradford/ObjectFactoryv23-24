public class Main {
    //instaacne vars



    public static void main(String[] args) {
        System.out.println("hello Object Factory");
         Ponies p;
        p = new Ponies();
        System.out.println(p.isUnicorn);
        p.isUnicorn = true;
        System.out.println(p.isUnicorn);
        System.out.println(p.name);

         p.describePony();


        Ponies a;
        a = new Ponies();
        a.name = "Teddy";
        System.out.println("pony a's name is " + a.name);
    }
}
