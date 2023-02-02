public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Adresse adresse1 = new Adresse("6","baudin","Ivry-Sur-Seine","94200");
        Adresse adresse2 = new Adresse("45","Molière","Ivry-Sur-Seine","94200");
        Architecte a1 = new Architecte("Titouan","Vidil","etrtgtg",true,adresse1,"5415445699");
        Deposant d1 = new Deposant("Gauthier","Pagezy","monsieur","gauthier.pagezy@esme.fr",adresse2);
        System.out.println(a1.toString());
        System.out.println(d1.toString());
    }
}