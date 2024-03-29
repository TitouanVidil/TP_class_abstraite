class Architecte extends Personne
{
    private String conseilRegional;
    private boolean inscriptionOrdre;
    private Adresse adresse;
    private String telephone;



    public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone)
    {
        super(nom, prenom);
        this.conseilRegional = validerChaine(conseilRegional, 50);
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;
        if (telephoneValide(telephone))
        {
            this.telephone = telephone;
        }
        else
        {
            this.telephone = "" ;
        }
        Maj_conseilRegional();
    }

    private boolean telephoneValide(String telephone)
    {
        boolean test = false;
        int i=0;
        if(telephone.length() == 10)
        {
            for(i=0;i<10;i++)
            {
                if (Character.isDigit(telephone.charAt(i)) == true)
                {
                    test = true;
                }
                else
                {
                    test = false;
                    break;
                }
            }
        }
        else
        {
            System.out.println("Le format du telephone n'est pas bon");
        }

        return test;
    }

    public void Maj_conseilRegional()
    {
        String str = "\n" + nom + " " + prenom + " " + conseilRegional + " " + telephone + " ";
        if(inscriptionOrdre == true)
            str += "inscrit";
        else
            str += "non inscrit";

        System.out.println(str);
    }

    public String toString ()
    {
        return "\n" + nom + " " + prenom + " " + conseilRegional + " " + telephone + " "+ adresse.toString();
    }

}
