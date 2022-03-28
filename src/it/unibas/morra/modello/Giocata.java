package it.unibas.morra.modello;

public class Giocata {
    
    private String nomeGiocatore;
    private int giocataPlayer;
    private int sommaPlayer;
    private int giocataComputer;
    private int sommaComputer;

    public Giocata(String nomeGiocatore, int giocataPlayer, int sommaPlayer, int giocataComputer, int sommaComputer) {
        this.nomeGiocatore = nomeGiocatore;
        this.giocataPlayer = giocataPlayer;
        this.sommaPlayer = sommaPlayer;
        this.giocataComputer = giocataComputer;
        this.sommaComputer = sommaComputer;
    }
    
    public String controlloGiocata(){
        String risultato;
        if(sommaPlayer == sommaComputer){
                if( (sommaPlayer == (giocataPlayer + giocataComputer))  && (sommaComputer == (giocataPlayer + giocataComputer)) ){
                   return risultato = "PARITA'";
                }
            }
                if(sommaPlayer == (giocataPlayer + giocataComputer)){
                    risultato = "HA VINTO " + nomeGiocatore;
                } else {
                    if(sommaComputer == (giocataPlayer + giocataComputer)){
                    risultato =  "HA VINTO COMPUTER"; 
                    } else {
                        risultato = "NESSUNO HA VINTO"; 
                    }
                }
        return risultato;
    }
    
    public void calcolaPartiteVinte(){
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Giocata{nomeGiocatore=").append(nomeGiocatore);
        sb.append(", giocataPlayer=").append(giocataPlayer);
        sb.append(", sommaPlayer=").append(sommaPlayer);
        sb.append(", giocataComputer=").append(giocataComputer);
        sb.append(", sommaComputer=").append(sommaComputer);
        sb.append('}');
        return sb.toString();
    }
    
    
    
   
}
