

/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/*

let x = 5;                // cambiare il numero a piacimento
let y = 10;               // cambiare il numero a piacimento

if (x > y) {

  console.log('Il più grande tra i due numeri è', x)

} else if (x < y) {

  console.log('Il più grande tra i due numeri è', y)

}

*/



/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/*

let x = 5;
let y = 10;           // cambiare il numero a piacimento

if (y != 5) {

  console.log('not equal')

}

*/


/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/*

let x = 10;           //cambiare numero a piacimento

let y = (x % 5);

if (y == 0) {

  console.log('divisibile per 5')

}

*/


/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/*

let x = 8;            //cambiare i numeri a piacimento
let y = 4;            //cambiare i numeri a piacimento

if (x == 8) {

  console.log('x è uguale a 8!')

} else if (y == 8) {

  console.log('y è uguale a 8!')

} else {

  console.log('Nessuno è uguale a 8!')

}


let addizione = (x + y);
let sottrazione = (x - y);

if (addizione == 8) {

  console.log('Addizione uguale a 8')

} else if (sottrazione == 8) {

  console.log('Sottrazione uguale a 8')
  
} else {

  console.log('Né addizione né sottrazione danno 8')

}

*/


/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

/*

let prodottoUno = 10;         //cambiare numero a piacimento
let prodottoDue = 30;         //cambiare numero a piacimento

let totalShoppingCart = (prodottoUno + prodottoDue);

if (totalShoppingCart <= 50) {

  console.log('Il totale da pagare è', (totalShoppingCart + 10));

} else if (totalShoppingCart > 50) {

  console.log('Il totale da pagare è', totalShoppingCart)

}

*/


/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/


/*
let prodottoUno = 10;       //cambiare numero a piacimento
let prodottoDue = 30;       //cambiare numero a piacimento

let prodottoUnoScontato = (prodottoUno / 100 *80);
let prodottoDueScontato = (prodottoDue / 100 *80);

let totalShoppingCart = (prodottoUnoScontato + prodottoDueScontato);

if (totalShoppingCart <= 50) {

  console.log('Il totale da pagare è', (totalShoppingCart + 10));

} else if (totalShoppingCart > 50) {

  console.log('Il totale da pagare è', totalShoppingCart)

}

*/


/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/








/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/*

let parola = 'Parola';

if (typeof(cognome) === 'number') {

  console.log('è un numero!');
  
} else {
  console.log('non è un numero')
}

*/


/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/*

let x = 10;         //cambiare numero a piacimento

let y = (x % 2);

if (y == 0) {

  console.log('divisibile per 2')

}

*/


/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/*

let val = 12;

  if (val < 5 && val < 10) {

      console.log("Meno di 5");

} else if (val < 10) {

      console.log("Meno di 10");

} else {

      console.log("Uguale a 10 o maggiore");

}

*/


/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css']
}
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".

*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */