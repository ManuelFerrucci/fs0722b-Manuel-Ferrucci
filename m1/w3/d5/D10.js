/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/


let sum = 10 + 20; //dichiaro la variabile 'sum' e le assegno un'operazione di addizione

console.log(sum); //qui faccio console.log per visualizzare in console il valore della variabile



/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/


let random = Math.round(Math.random() *20); //dichiaro la variabile 'random' e le assegno un numero casuale tra 0 e 20 usando "Math.random". Prima però inserisco "Math.round" perché voglio che il numero che esca da math.random sia arrotondato all'intero più vicino

console.log(random); //qui faccio console.log per visualizzare in console il valore della variabile



/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/


let me = { //dichiaro l'oggetto 'me' e gli assegno le proprietà nome, cognome, e anni

  name: 'Manuel',
  surname: 'Ferrucci',
  age: 30

};

console.log(me); //qui faccio console.log per visualizzare in console i valori dell'oggetto me



/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/


delete me.age; //con 'delete' vado ad eliminare la proprietà 'age' dall'oggetto 'me'

console.log(me); //qui faccio console.log per visualizzare in console i valori dell'oggetto me dopo l'eliminazione della proprietà "age"



/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/


me.skills = ['HTML', 'CSS']; //aggiungo la proprietà "skills" (che in questo caso è un array) all'oggetto "me", e nelle parentesi quadre elenco i linguaggi conosciuti

console.log(me); //qui faccio console.log per visualizzare in console i valori dell'oggetto me, aggiornati con l'array. PS. IMPORTANTE! -> per visualizzare in modo perfetto in console, vanno commentati alcuni esercizi successivi!



/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/


me.skills.push('Javascript');

console.log(me); //qui faccio console.log per visualizzare in console i valori dell'oggetto me, aggiornati con l'aggiunta di un nuovo elemento "javascript" all'array "skills". PS. IMPORTANTE! -> per visualizzare in modo perfetto in console, vanno commentati alcuni esercizi precedenti o successivi!



/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/


me.skills.pop('Javascript');

console.log(me); //qui faccio console.log per visualizzare in console i valori dell'oggetto me, aggiornati con la rimozione dell'elemento "javascript" dall'array "skills". IMPORTANTE! -> per visualizzare in modo perfetto in console, vanno commentati alcuni esercizi precedenti o successivi!



// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/


function dice() { //qui creo una funzione "dice"

  let numeroRandom = Math.round(Math.random() *6); //dichiaro la variabile 'numeroRandom' e le assegno un numero casuale tra 0 e 6 usando "Math.random". Prima però inserisco "Math.round" perché voglio che il numero che esca da math.random sia arrotondato all'intero più vicino

  if(numeroRandom > 0) { //qui creo un if indicando che se "numeroRandom è maggiore di 0" (perché dalla traccia, il numero deve essere compreso tra 1 e 6, quindi 0 escluso) ...

    return console.log(numeroRandom); // ...mi deve ritornare in console il numero generato

  } else { //altrimenti...

    dice(); //...gli dico che deve eseguire nuovamente la funzione

  }

};

dice(); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte. PS. Probabilmente si poteva fare con un FOR, e forse non ho fatto una cosa molto ortodossa, ma ho voluto sperimentare e il metodo FUNZIONA.



/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/


function whoIsBigger(a, b) { //qui creo una funzione "whoIsBigger" al cui interno inserisco i parametri "a" e "b"

  if (a > b) { //qui creo un if indicando che se "a è maggiore di b" ...

    return console.log(a); // ...mi deve ritornare in console il valore di "a"

  } else if (b > a) { // altrimenti se "b" è maggiore di a" ...

    return console.log(b); // ...mi deve ritornare in console il valore di "b"

  } else { // altrimenti ...

    console.log ('I numeri sono uguali'); // ... mi deve tornare in console la questa stringa di testo

  }

};

whoIsBigger(10, 20); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte. Si possono cambiare i numeri a piacimento



/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/


function splitMe(stringa) { //qui creo una funzione "spliMe" al cui interno inserisco il parametro "stringa"

  let arrayStringa = stringa.split(' '); //dichiaro la variabile 'arrayStringa' e le dico che deve essere uguale al parametro stringa a cui è stato applicato il metodo "split", che divide le parole

  return console.log(arrayStringa); // qui gli dico che mi deve ritornare in console i valori dell'array creato

};

splitMe('Buongiorno a tutti'); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte. Si possono cambiare le parole a piacimento



/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/


function deleteOne(stringa2, booleano) { //qui creo una funzione "deleteOne" al cui interno inserisco i parametri "stringa2" e il booleano

  if (booleano == true) { //qui creo un if indicando che se "il booleano è uguale a true" ...

    let stringa2SenzaPrima = stringa2.slice(1, 10);
    return console.log(stringa2SenzaPrima); // ...mi deve ritornare in console il valore di "stringa2" senza il primo carattere

  } else { //altrimenti se "il booleano non è true" ...

    let stringa2SenzaUltima = stringa2.slice(0, 9);
    return console.log(stringa2SenzaUltima); // ...mi deve ritornare in console il valore di "stringa2" senza l'ultimo carattere

  }

};

deleteOne('Buongiorno', true); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte



/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/


function onlyLetters(stringa3) { //qui creo una funzione "onlyLetters" al cui interno inserisco il parametro "stringa3"

  return console.log(stringa3.replace(/[0-9]/g, 'tot')); // qui uso il metodo "replace" indicando che mi deve sostituire tutti i numeri con la parola "tot", e mi deve ritornare in console il valore di "stringa3" con le dovute sostituzioni. La lettera "g" sta a significare che non voglio che sostituisca solo l'eventuale primo numero incontrato, ma tutti gli eventuali numeri presenti nella stringa

};

onlyLetters('Ci sono 4 gatti ogni 5 cani'); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte, inserendo il testo voluto



/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/


function isThisAnEmail(stringa4) {

  

};

isThisAnEmail();



/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/


function whatDayIsIt(data) { //qui creo una funzione "whatDayIsIt" al cui interno inserisco il parametro "stringa3"

  let giorniSettimana = ['Domenica', 'Lunedì', 'Martedì', 'Mercoledì', 'Giovedì', 'Venerdì', 'Sabato']; //qui definisco un array con i giorni della settimana

  return console.log(giorniSettimana[5]); // qui dico che mi deve ritornare in console il valore di giorniSettimana con indice "5"

};

whatDayIsIt(); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte



/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/


function rollTheDices(a) {

  

};


//dice()


/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/


function howManyDays(data1) { //qui creo una funzione "howManyDays" al cui interno inserisco il parametro "data1"

  let giorno = 86400000; //creo una variabile "giorno" a cui assegno il numero di millisecondi che costituiscono un giorno (1000*60*60*24)

  let dataDiOggi = '11/11/2022'; //creo una variabile "dataDiOggi" a cui assegno la data di oggi

  let x = new Date(dataDiOggi); //creo una variabile "x" a cui assegno la data di oggi
  let y = new Date(data1); //creo una variabile "y" a cui assegno la data che andrò a stabilire quando lancerò la funzione

  console.log(Math.floor((x - y) / giorno)); // qui dico che mi deve ritornare in console la differenza in giorni dalla data odierna a quella che andrò a stabilire

};

howManyDays('11/11/2021'); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte, inserendo la data passata a piacimento



/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/


function isTodayMyBirthday() {

  let giorno = 86400000;

  let dataDiOggi = '02/21'; //creo una variabile "dataDiOggi" a cui assegno la data di oggi

  let dataMioCompleanno = '02/20'; //creo una variabile "dataMioCompleanno" a cui assegno la data del mio compleanno

  let x = new Date(dataDiOggi); //creo una variabile "x" a cui assegno la data di oggi
  let y = new Date(dataMioCompleanno); //creo una variabile "y" a cui assegno la data del mio compleanno

  differenzaTempo = Math.floor((x - y) / giorno); //creo una variabile "differenzaTempo" che equivale alla differenza in giorni dalla data odierna a quella che andrò a stabilire

  if (differenzaTempo == 0) { //qui creo un if indicando che se la differenza è uguale a zero ...

    return console.log(true); //...allora deve ritornarmi in console true

  } else { //altrimenti...

    return console.log(false); //...deve ritornarmi in console false

  }

};

isTodayMyBirthday(); //qui gli dico di eseguire la funzione, altrimenti tutto il processo non parte



// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file


const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
];



/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/


function deleteProp (a, b) {

  a = {prop1: 'Proprietà1', prop2: 'Proprietà2', prop3: 'Proprietà3'}

  b = 'prop2';

  delete a.b; //con 'delete' vado ad eliminare la proprietà 'prop2' dall'oggetto 'oggetto'

  console.log(a); //qui faccio console.log per visualizzare in console i valori dell'oggetto oggetto dopo l'eliminazione della proprietà "prop2"

};

deleteProp(); //DA RIVEDERE



/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/


function newestMovie() {

  

};

newestMovie();



/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/


/*function countMovies() {

  let conteggio = 0;
  
  for(let i = 0; i < movies.length; ++i){ if(movies[i] == 0) conteggio++;}

  console.log(conteggio);

};

countMovies();*/



/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/


function onlyTheYears() {
  
  let soloAnni = [];

  let proprietàFiltrate;

  for (let i = 0; i < movies.length; i++) {
    
    soloAnni.push(movies[i].Year);
    
  }

  proprietàFiltrate = soloAnni.filter(elemento => elemento.includes());

  console.log(soloAnni);

};

onlyTheYears();



/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/






/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/


function sumAllTheYears() {
  
  let soloAnni = [];

  let proprietàFiltrate;

  for (let i = 0; i < movies.length; i++) {
    
    soloAnni.push(movies[i].Year);
    
  }

  proprietàFiltrate = soloAnni.filter(elemento => elemento.includes());

  console.log(soloAnni);

  let somma = function(soloAnni) {

    return soloAnni.reduce((a, b) => a + b);

  };
  
  let sum = somma(soloAnni);
  
  console.log(sum);

};

sumAllTheYears();



/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/


function searchByTitle(nomeDelFilm) {
  
  let titoloFilm = [];

  let proprietàFiltrate;

  for (let i = 0; i < movies.length; i++) {
    
    titoloFilm.push(movies[i].Title);
    
  }

  proprietàFiltrate = titoloFilm.filter(elemento => elemento.includes(nomeDelFilm));

  console.log(proprietàFiltrate);

};

searchByTitle('Lord');



/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/






/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/


function removeIndex(a) {



}



// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/


function selezionaContainer() {

  elementoSelez = document.querySelector('#container');

  console.log(elementoSelez);

};

selezionaContainer();



/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/


function selezionaTd() {

  elementoSelez = document.querySelectorAll('td');

  console.log(elementoSelez);

};

selezionaTd();



/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/


function testoTd() {

  elementoSelez = document.querySelectorAll('td');

  for (let i = 0; i < elementoSelez.length; i++) {

    let valore = elementoSelez[i].value;

    return console.log([i]);
    
  }

};

testoTd();



/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/


function aggiungiColore() {

  let link = document.querySelector('a');

  coloreCambiato = link.style.backgroundColor = "red";

  console.log(link);

};

aggiungiColore();



/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/


function aggiungiElemento() {

  lista = document.querySelector('#myList');
        
  let liNuovo = document.createElement('li');
  let testoLiNuovo = document.createTextNode('Li creato con JS');

  liNuovo.append(testoLiNuovo);
  lista.append(liNuovo);

  console.log(lista);

};

aggiungiElemento();



/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/


function primaListaVia() {
        
  lista = document.querySelector('#myList').remove('ul');
  
  console.log(lista);

}

primaListaVia();



/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/


function aggiungiClasse() {
          
  let tagTr = document.querySelector('tr');

  tagTr.classList.add('nuovo-colore');

}; 

aggiungiClasse();







// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/

/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/

/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/

/* Questo array viene usato per gli esercizi. Non modificarlo. */

/*const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]*/
