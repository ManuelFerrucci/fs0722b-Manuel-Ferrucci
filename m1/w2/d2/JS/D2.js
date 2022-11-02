/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/



/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/*

Ci sono diversi tipi di dato in JavaScript.
Dati primitivi:

Numero -> è un tipo di dato appunto numerico, in cui possono essere inseriti sia numeri interi che decimali, con la presenza del punto (e non la virgola), ad esempio:

var numeroIntero = 1;
var numeroDecimale = 1.5;


stringa -> è un tipo di dato costituito da testo, incluso tra due apici (o doppi apici). Si può usare il backslash (\) se dovessero esserci problemi con gli apici, ad esempio:

var testo = 'ciao';
var testoApice = 'ho mangiato un\'altra fetta di torta'


booleano -> è un tipo di dato che prevede due sole risposte possibili: "true" oppure "false" (inserita senza apici), quindi vero o falso.


null -> è un tipo di dato che in pratica è vuoto, ed è tenuto lì in attesa di essere utilizzato.


undefined -> è un tipo di dato che rappresenta un valore non definito, in quanto la variabile non è stata valorizzata. 


Poi ci sono i tipi di dato complesso.
Ad esempio:

array -> se le variabili possono definirsi dei "contenitori", gli array sono delle "liste di contenitori". Risaltano all'occhio per la presenza delle parentesi quadre.

oggetti -> sono dei gruppi di codici che contengono delle proprietà. Risaltano all'occhio per la presenza delle parentesi graffe.

*/



/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

/*

let name = 'Manuel';

*/



/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

/*

let x = 12;
let y = 20;

let risultato = x + y;

console.log(risultato);

*/



/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

/*

let nome = 12;

*/



/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/*

//const name = 'Manuel';
//const name = 'Ferrucci'; //non è possibile riassegnare

let name = 'Manuel';
name = 'Ferrucci';  //usando "let" posso riassegnare la variabile

*/



/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/*

let x = 12;
let y = 4;

let risultato = (x - y);

console.log(risultato);

*/



/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/*

let name1 = 'john';
let name2 = 'John';

if (name1 == name2) {

  console.log('true')

} else {

  console.log('false')

}

*/