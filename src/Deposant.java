public class Deposant extends Personne
{
    private String civilite;
    private String mail;
    private Adresse adresse;

    public Deposant(String nom,String prenom,String civilite,String mail,Adresse adresse)
    {
        super(nom,prenom);
        this.civilite = validerChaine(civilite, 10);
        this.mail = validerChaine(mail, 50);
        this.adresse = adresse;
    }

    public String toString()
    {
        return "\n"+nom+" "+prenom+" "+civilite+" "+mail+" "+adresse.toString();
    }
}
