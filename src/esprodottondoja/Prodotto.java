package esprodottondoja;

/**
 * La classe gestisce prodotti di un negozio
 */
public class Prodotto {
    /**
     * nome dell' oggetto
     */
    protected String nome;
    /**
     * prezzo dell' oggetto
     */
    protected double prezzo;
    /**
     * nazione di produzione del prodotto
     */
    protected String provenienza;
    /**
     * Costruttore parametrio, costruisce un oggetto Prodotto dato il nome prezzo e nazione di provenienza
     * 
     * @param nome nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza nazione di produzione del nuovo oggetto Prodotto
     */
    public Prodotto(String nome,double prezzo,String provenienza)
    {
        this.nome = nome;
        this.prezzo = prezzo;
        this.provenienza = provenienza;
    }
    /**
     * Applica uno sconto del 10% sul prezzo del prodotto
     */
    public void applicaSconto(){
        setPrezzo( prezzo - (prezzo / 10));
    }

    /**
     * Restituisce il nome del prodotto
     * @return il nome del prodotto
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * Imposta il nome del prodotto
     * @param nome  nome del prodotto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getProvenienza() {
        return this.provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Prodotto
     */
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", prezzo='" + getPrezzo() + "'" +
            ", provenienza='" + getProvenienza() + "'" +
            "}";
    }

}
