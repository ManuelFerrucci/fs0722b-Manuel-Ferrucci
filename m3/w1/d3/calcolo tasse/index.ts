
//let fatturato:any = <HTMLInputElement>document.querySelector('#fatturato');

abstract class PagamentiTasse {
    tasseInps: number;
    tasseIrpef: number;
    constructor(tasseInps: number, tasseIrpef: number) {
        this.tasseInps = tasseInps;
        this.tasseIrpef = tasseIrpef;
    }
    /*get UtileTasse():number {
        return
    }
    get TasseInps():number {
        return
    }
    get TasseIrpef():number {
        return
    }
    get RedditoAnnuoNetto():number {
        return
    }*/
}

class Lavoratore extends PagamentiTasse {
    codiceReddito:number;
    redditoAnnuoLordo:number;
    constructor(tasseInps: number,tasseIrpef: number, codiceReddito:number, redditoAnnuoLordo:any) {
        super(tasseInps, tasseIrpef);
        this.codiceReddito = codiceReddito;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
    }
}
let fatturato = <HTMLInputElement>document.querySelector('#fatturato');
let tipo_lavoro = (<HTMLSelectElement>document.querySelector('#tipo_lavoro'));
let option_lavoro_default = <HTMLOptionElement>document.querySelector('#option_lavoro_default');
let negoziante = <HTMLOptionElement>document.querySelector('#negoziante');
let imprenditore_edile = <HTMLOptionElement>document.querySelector('#imprenditore_edile');
let ingegnere_informatico = <HTMLOptionElement>document.querySelector('#ingegnere_informatico');
let button_resetta_importo = <HTMLButtonElement>document.querySelector('#button_resetta_importo');
let button_calcola = <HTMLButtonElement>document.querySelector('#button_calcola');
let tasse_inps = <HTMLSpanElement>document.querySelector('#tasse_inps');
let tasse_irpef = <HTMLSpanElement>document.querySelector('#tasse_irpef');
let totale_tasse = <HTMLSpanElement>document.querySelector('#totale_tasse');
let reddito_netto = <HTMLSpanElement>document.querySelector('#reddito_netto');

let Negoziante = new Lavoratore(0.33,0.23,1,fatturato);
let Imprenditore = new Lavoratore(0.33,0.35,2,fatturato);
let Ingegnere = new Lavoratore(0.33,0.23,3,fatturato);
console.log(Ingegnere.redditoAnnuoLordo);

let tassaIrpef;
function variabileIrpef() {
    let result:number = (parseInt(fatturato.value) <= 15000)? tassaIrpef = 0.23 : (parseInt(fatturato.value) >= 15001) && (parseInt(fatturato.value) <= 28000)? tassaIrpef = 0.25 : (parseInt(fatturato.value) >= 28001) && (parseInt(fatturato.value) <= 50000)? tassaIrpef = 0.35 : tassaIrpef = 0.43;
    return tassaIrpef;
}

function resettaImporti() {
    fatturato.value = '';
    tasse_inps.innerHTML = '';
    tasse_irpef.innerHTML = '';
    totale_tasse.innerHTML = '';
    reddito_netto.innerHTML = '';
}

button_resetta_importo.addEventListener('click', () => {
    resettaImporti();
})

function calcoli() {
    let calcoloTasseInps:any = parseInt(fatturato.value)*(0.33);
    tasse_inps.innerHTML = calcoloTasseInps;

    let calcoloTasseIrpef:any = parseInt(fatturato.value)*(0.23);
    tasse_irpef.innerHTML = calcoloTasseIrpef;

    let calcoloTasseTotali:any = parseInt(fatturato.value)*(0.58);
    totale_tasse.innerHTML = calcoloTasseTotali;

    let totaleNetto:any = parseInt(fatturato.value) - parseInt(calcoloTasseTotali);
    reddito_netto.innerHTML = totaleNetto;
}

button_calcola.addEventListener('click', () => {
    calcoli();
});


//let Negoziante = new Lavoratore(` 0.33,0.25,1,${this.fatturato}` );
//scaglioni irpef:
//1. fatturato <= 15.000 = 23%
//2. 15.001 <= fatturato <= 28.000 = 25%
//3. 28.001 <= fatturato <= 50.000 = 35%
//4. fatturato > 50.000 = 43%

//coefficente redditività a seconda codice ATECO
//1. Negoziante - cod 1 = 40%
//2. Imprenditore edile - cod 2 = 86%
//3. Ingegnere informatico - cod 3 = 78%

//aliquota lavoratori autonomi INPS = 33%


