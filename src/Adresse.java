public class Adresse
{
    private String numero;
    private String voie;
    private String ville;
    private String cp;

    public Adresse(String numero, String voie, String ville, String cp)
    {
        this.numero = numero;
        this.voie = voie;
        this.ville = ville;
        this.cp = cp;
    }

    public String toString()
    {
        return numero+" "+voie+" "+ville+" "+cp+" ";
    }

    public String validerChaine(String chaine,int taille)
    {
        if(chaine.length() > taille)
            chaine = chaine.substring(0, taille);
        return chaine;
    }



}
