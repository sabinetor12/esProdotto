package esprodottondoja;

import java.util.*;
/**
 * La classe gestisce la tipologia Alimentare di Prodotto
 */
public class Alimentare extends Prodotto {
    /**
     * anno di scadenza riportato sulla confezione del prodotto
     */
    protected int annoScadenza;
    /**
     * mese di scadenza riportato sulla confezione del prodotto
     */
    protected int meseScadenza;
    
    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo ProdottoAlimentare
     * @param annoScadenza anno di scadenza da assegnare al nuovo oggetto Prodotto
     * @param meseScadenza mese di scadenza da assegnare al nuovo oggetto Prodotto
     * @param nome nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza nazione di produzione del nuovo oggetto Prodotto
     */
    public Alimentare(int annoScadenza, int meseScadenza, String nome,double prezzo, String provenienza) {
        super(nome, prezzo, provenienza);
        this.annoScadenza = annoScadenza;
        this.meseScadenza = meseScadenza;
    }
    /**
     * Controlla la scadenza del prodotto
     * @return true se il prodotto è scaduto, false altrimenti
     */
    public boolean isScaduto()
    {
        GregorianCalendar cal = new GregorianCalendar();

        if(cal.get(cal.YEAR) < annoScadenza)
        return false;
        else if(cal.get(cal.YEAR) == annoScadenza)
        {
            if(cal.get(cal.MONTH) +1 > meseScadenza)
                return true;
            else
                return false;
        }
        return true;
    }
    /**
     * Applica uno sconto sul prezzo del prodotto Alimentare. 
 <ul>
 <li> Se il prodotto è scaduto lo sconto non viene applicato. </li>
 <li> Se ci si trova nel mese di scadenza allora applica uno sconto del 50% </li>
 <li> Negli altri casi rimane lo sconto del 10%</li>
 </ul>
     */
    @Override
    public void applicaSconto()
    {
        GregorianCalendar cal = new GregorianCalendar();
        if(!isScaduto())
        {
            if(meseScadenza == cal.get(cal.MONTH)+1 && annoScadenza == cal.get(cal.YEAR))
            {
                setPrezzo(prezzo / 2);
            }
            else
            super.applicaSconto();
        }
    }

    public int getAnnoScadenza() {
        return this.annoScadenza;
    }

    public void setAnnoScadenza(int annoScadenza) {
        this.annoScadenza = annoScadenza;
    }

    public int getMeseScadenza() {
        return this.meseScadenza;
    }

    public void setMeseScadenza(int meseScadenza) {
        this.meseScadenza = meseScadenza;
    }

    @Override
    public String toString() {
        return "{" +
            " annoScadenza='" + getAnnoScadenza() + "'" +
            ", meseScadenza='" + getMeseScadenza() + "'" +
            "}";
    }
}

   
