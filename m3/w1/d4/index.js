var capoAbbigliamento = /** @class */ (function () {
    function capoAbbigliamento(id, codprod, collezione, capo, modello, quantità, colore, prezzoivaesclusa, prezzoivainclusa, disponibile, saldo) {
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
    capoAbbigliamento.prototype.getSaldoCapo = function () {
        var prezzoScontato = ((this.prezzoivainclusa * this.saldo) / 100).toFixed(2); // ho dovuto mettere "any" dopo "prezzoScontato" perché usando .toFixed(2) mi dava errore di assegnazione stringa a numero
        console.log("Il saldo applicato per il capo d'abbigliamento ".concat(this.capo, " \u00E8 di \u20AC ") + prezzoScontato);
        return prezzoScontato;
    };
    capoAbbigliamento.prototype.getAcquistoCapo = function () {
        var prezzoDaPagare = (this.prezzoivainclusa - this.getSaldoCapo()).toFixed(2); // ho dovuto mettere "any" dopo "prezzoDaPagare" perché usando .toFixed(2) mi dava errore di assegnazione stringa a numero
        console.log("Il prezzo da pagare per il capo d'abbigliamento ".concat(this.capo, " \u00E8 di \u20AC ") + prezzoDaPagare);
        return prezzoDaPagare;
    };
    return capoAbbigliamento;
}());
var datiSorgente = fetch('/JSON/Abbigliamento.json')
    .then(function (response) { return response.json(); })
    .then(function (data) {
    //console.log(data);                  //decommentare per visualizzare in console
    var Cardigan = new capoAbbigliamento(data[0].id, data[0].codprod, data[0].collezione, data[0].capo, data[0].modello, data[0].quantità, data[0].colore, data[0].prezzoivaesclusa, data[0].prezzoivainclusa, data[0].disponibile, data[0].saldo);
    var Maglietta = new capoAbbigliamento(data[1].id, data[1].codprod, data[1].collezione, data[1].capo, data[1].modello, data[1].quantità, data[1].colore, data[1].prezzoivaesclusa, data[1].prezzoivainclusa, data[1].disponibile, data[1].saldo);
    var Felpa = new capoAbbigliamento(data[2].id, data[2].codprod, data[2].collezione, data[2].capo, data[2].modello, data[2].quantità, data[2].colore, data[2].prezzoivaesclusa, data[2].prezzoivainclusa, data[2].disponibile, data[2].saldo);
    var Maglione = new capoAbbigliamento(data[3].id, data[3].codprod, data[3].collezione, data[3].capo, data[3].modello, data[3].quantità, data[3].colore, data[3].prezzoivaesclusa, data[3].prezzoivainclusa, data[3].disponibile, data[3].saldo);
    var Maglia = new capoAbbigliamento(data[4].id, data[4].codprod, data[4].collezione, data[4].capo, data[4].modello, data[4].quantità, data[4].colore, data[4].prezzoivaesclusa, data[4].prezzoivainclusa, data[4].disponibile, data[4].saldo);
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
    /////////////////// HTML /////////////////////
    var nome_capo_1 = document.querySelector('#nome_capo_1');
    var nome_capo_2 = document.querySelector('#nome_capo_2');
    var nome_capo_3 = document.querySelector('#nome_capo_3');
    var nome_capo_4 = document.querySelector('#nome_capo_4');
    var nome_capo_5 = document.querySelector('#nome_capo_5');
    var prezzo_pieno_1 = document.querySelector('#prezzo_pieno_1');
    var prezzo_pieno_2 = document.querySelector('#prezzo_pieno_2');
    var prezzo_pieno_3 = document.querySelector('#prezzo_pieno_3');
    var prezzo_pieno_4 = document.querySelector('#prezzo_pieno_4');
    var prezzo_pieno_5 = document.querySelector('#prezzo_pieno_5');
    var prezzo_scontato_1 = document.querySelector('#prezzo_scontato_1');
    var prezzo_scontato_2 = document.querySelector('#prezzo_scontato_2');
    var prezzo_scontato_3 = document.querySelector('#prezzo_scontato_3');
    var prezzo_scontato_4 = document.querySelector('#prezzo_scontato_4');
    var prezzo_scontato_5 = document.querySelector('#prezzo_scontato_5');
    nome_capo_1.innerHTML = data[0].capo;
    nome_capo_2.innerHTML = data[1].capo;
    nome_capo_3.innerHTML = data[2].capo;
    nome_capo_4.innerHTML = data[3].capo;
    nome_capo_5.innerHTML = data[4].capo;
    prezzo_pieno_1.innerHTML = '€ ' + Cardigan.prezzoivainclusa;
    prezzo_pieno_2.innerHTML = '€ ' + Maglietta.prezzoivainclusa;
    prezzo_pieno_3.innerHTML = '€ ' + Felpa.prezzoivainclusa;
    prezzo_pieno_4.innerHTML = '€ ' + Maglione.prezzoivainclusa;
    prezzo_pieno_5.innerHTML = '€ ' + Maglia.prezzoivainclusa;
    prezzo_scontato_1.innerHTML = '€ ' + Cardigan.getAcquistoCapo();
    prezzo_scontato_2.innerHTML = '€ ' + Maglietta.getAcquistoCapo();
    prezzo_scontato_3.innerHTML = '€ ' + Felpa.getAcquistoCapo();
    prezzo_scontato_4.innerHTML = '€ ' + Maglione.getAcquistoCapo();
    prezzo_scontato_5.innerHTML = '€ ' + Maglia.getAcquistoCapo();
});
