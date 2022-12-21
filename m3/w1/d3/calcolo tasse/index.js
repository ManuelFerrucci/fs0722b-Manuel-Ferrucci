//let fatturato:any = <HTMLInputElement>document.querySelector('#fatturato');
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var PagamentiTasse = /** @class */ (function () {
    function PagamentiTasse(tasseInps, tasseIrpef) {
        this.tasseInps = tasseInps;
        this.tasseIrpef = tasseIrpef;
    }
    return PagamentiTasse;
}());
var Lavoratore = /** @class */ (function (_super) {
    __extends(Lavoratore, _super);
    function Lavoratore(tasseInps, tasseIrpef, codiceReddito, redditoAnnuoLordo) {
        var _this = _super.call(this, tasseInps, tasseIrpef) || this;
        _this.codiceReddito = codiceReddito;
        _this.redditoAnnuoLordo = redditoAnnuoLordo;
        return _this;
    }
    return Lavoratore;
}(PagamentiTasse));
var fatturato = document.querySelector('#fatturato');
var tipo_lavoro = document.querySelector('#tipo_lavoro');
var option_lavoro_default = document.querySelector('#option_lavoro_default');
var negoziante = document.querySelector('#negoziante');
var imprenditore_edile = document.querySelector('#imprenditore_edile');
var ingegnere_informatico = document.querySelector('#ingegnere_informatico');
var button_resetta_importo = document.querySelector('#button_resetta_importo');
var button_calcola = document.querySelector('#button_calcola');
var tasse_inps = document.querySelector('#tasse_inps');
var tasse_irpef = document.querySelector('#tasse_irpef');
var totale_tasse = document.querySelector('#totale_tasse');
var reddito_netto = document.querySelector('#reddito_netto');
var Negoziante = new Lavoratore(0.33, 0.23, 1, fatturato);
var Imprenditore = new Lavoratore(0.33, 0.35, 2, fatturato);
var Ingegnere = new Lavoratore(0.33, 0.23, 3, fatturato);
console.log(Ingegnere.redditoAnnuoLordo);
var tassaIrpef;
function variabileIrpef() {
    var result = (parseInt(fatturato.value) <= 15000) ? tassaIrpef = 0.23 : (parseInt(fatturato.value) >= 15001) && (parseInt(fatturato.value) <= 28000) ? tassaIrpef = 0.25 : (parseInt(fatturato.value) >= 28001) && (parseInt(fatturato.value) <= 50000) ? tassaIrpef = 0.35 : tassaIrpef = 0.43;
    return tassaIrpef;
}
function resettaImporti() {
    fatturato.value = '';
    tasse_inps.innerHTML = '';
    tasse_irpef.innerHTML = '';
    totale_tasse.innerHTML = '';
    reddito_netto.innerHTML = '';
}
button_resetta_importo.addEventListener('click', function () {
    resettaImporti();
});
function calcoli() {
    var calcoloTasseInps = parseInt(fatturato.value) * (0.33);
    tasse_inps.innerHTML = calcoloTasseInps;
    var calcoloTasseIrpef = parseInt(fatturato.value) * (0.23);
    tasse_irpef.innerHTML = calcoloTasseIrpef;
    var calcoloTasseTotali = parseInt(fatturato.value) * (0.58);
    totale_tasse.innerHTML = calcoloTasseTotali;
    var totaleNetto = parseInt(fatturato.value) - parseInt(calcoloTasseTotali);
    reddito_netto.innerHTML = totaleNetto;
}
button_calcola.addEventListener('click', function () {
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
