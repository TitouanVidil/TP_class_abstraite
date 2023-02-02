import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        ArrayList<Personne> liste = new ArrayList<Personne>();
        Adresse adresse1 = new Adresse("6","baudin","Ivry-Sur-Seine","94200");
        Adresse adresse2 = new Adresse("45","Molière","Ivry-Sur-Seine","94200");
        Architecte a1 = new Architecte("Titouan","Vidil","etrtgtg",true,adresse1,"5415445699");
        liste.add(a1);
        Deposant d1 = new Deposant("Gauthier","Pagezy","monsieur","gauthier.pagezy@esme.fr",adresse2);
        liste.add(d1);

        for(Personne p : liste)
        {
            System.out.println(p.toString());
        }
    }
}