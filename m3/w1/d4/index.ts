interface Abbigliamento {
    id: number;
    codprod: number;
    collezione: string;
    capo: string;
    modello: number;
    quantità: number;
    colore: string;
    prezzoivaesclusa: number;
    prezzoivainclusa: number;
    disponibile: string;
    saldo: number;
    getSaldoCapo(): number;
    getAcquistoCapo(): number;
}

class capoAbbigliamento implements Abbigliamento {
    id: number;
    codprod: number;
    collezione: string;
    capo: string;
    modello: number;
    quantità: number;
    colore: string;
    prezzoivaesclusa: number;
    prezzoivainclusa: number;
    disponibile: string;
    saldo: number;

    constructor(id: number, codprod: number, collezione: string, capo: string, modello: number, quantità: number, colore: string, prezzoivaesclusa: number, prezzoivainclusa: number, disponibile: string, saldo: number) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantità = quantità;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    getSaldoCapo(): number {
        let prezzoScontato: any = ((this.prezzoivainclusa * this.saldo) / 100).toFixed(2); // ho dovuto mettere "any" dopo "prezzoScontato" perché usando .toFixed(2) mi dava errore di assegnazione stringa a numero
        console.log(`Il saldo applicato per il capo d'abbigliamento ${this.capo} è di € ` + prezzoScontato);
        return prezzoScontato;
    }
    getAcquistoCapo(): number {  //quando verrà ripreso successivamente nel console.log, verrà indicato sia il valore del saldo che quello del prezzo da pagare, perché ho fatto in modo riprendesse anche il console.log del metodo getSaldoCapo(). Mi sembrava più ordinato.
        let prezzoDaPagare: any = (this.prezzoivainclusa - this.getSaldoCapo()).toFixed(2); // ho dovuto mettere "any" dopo "prezzoDaPagare" perché usando .toFixed(2) mi dava errore di assegnazione stringa a numero
        console.log(`Il prezzo da pagare per il capo d'abbigliamento ${this.capo} è di € ` + prezzoDaPagare);
        return prezzoDaPagare;
    }
}


let datiSorgente = fetch('/JSON/Abbigliamento.json')
    .then((response) => response.json())
    .then((data) => {

        //console.log(data);                  //decommentare per visualizzare in console

        let Cardigan = new capoAbbigliamento(data[0].id, data[0].codprod, data[0].collezione, data[0].capo, data[0].modello, data[0].quantità, data[0].colore, data[0].prezzoivaesclusa, data[0].prezzoivainclusa, data[0].disponibile, data[0].saldo);
        let Maglietta = new capoAbbigliamento(data[1].id, data[1].codprod, data[1].collezione, data[1].capo, data[1].modello, data[1].quantità, data[1].colore, data[1].prezzoivaesclusa, data[1].prezzoivainclusa, data[1].disponibile, data[1].saldo);
        let Felpa = new capoAbbigliamento(data[2].id, data[2].codprod, data[2].collezione, data[2].capo, data[2].modello, data[2].quantità, data[2].colore, data[2].prezzoivaesclusa, data[2].prezzoivainclusa, data[2].disponibile, data[2].saldo);
        let Maglione = new capoAbbigliamento(data[3].id, data[3].codprod, data[3].collezione, data[3].capo, data[3].modello, data[3].quantità, data[3].colore, data[3].prezzoivaesclusa, data[3].prezzoivainclusa, data[3].disponibile, data[3].saldo);
        let Maglia = new capoAbbigliamento(data[4].id, data[4].codprod, data[4].collezione, data[4].capo, data[4].modello, data[4].quantità, data[4].colore, data[4].prezzoivaesclusa, data[4].prezzoivainclusa, data[4].disponibile, data[4].saldo);

        console.log(Cardigan);
        console.log(Maglietta);
        console.log(Felpa);
        console.log(Maglione);
        console.log(Maglia);

        //Cardigan.getSaldoCapo();          //decommentare per visualizzare in console il solo importo del saldo
        //Maglietta.getSaldoCapo();         //decommentare per visualizzare in console il solo importo del saldo
        //Felpa.getSaldoCapo();             //decommentare per visualizzare in console il solo importo del saldo
        //Maglione.getSaldoCapo();          //decommentare per visualizzare in console il solo importo del saldo
        //Maglia.getSaldoCapo();            //decommentare per visualizzare in console il solo importo del saldo

        Cardigan.getAcquistoCapo();
        Maglietta.getAcquistoCapo();
        Felpa.getAcquistoCapo();
        Maglione.getAcquistoCapo();
        Maglia.getAcquistoCapo();

    });