
let listaUsers = [
    {id: 1, nome: 'Luca', cognome: 'Rossi', classe: 'A'},
    {id: 2, nome: 'Luigi', cognome: 'Verdi', classe: 'A'},
    {id: 3, nome: 'Mario', cognome: 'Bianchi', classe: 'A'},
    {id: 4, nome: 'Piero', cognome: 'Neri', classe: 'A'},
    {id: 5, nome: 'Paolo', cognome: 'Rossi', classe: 'A'},
    {id: 6, nome: 'Sergio', cognome: 'Verdi', classe: 'A'},
    {id: 7, nome: 'Gianno', cognome: 'Bianchi', classe: 'A'},
    {id: 8, nome: 'Davide', cognome: 'Neri', classe: 'A'},
]



/* Costruttore */

class Persona {

    constructor(id, nome, cognome, classe) {

        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;

    }

};

let user1 = new Persona(listaUsers[0].id, listaUsers[0].nome, listaUsers[0].cognome, listaUsers[0].classe);
console.log(user1);

let user2 = new Persona(listaUsers[1].id, listaUsers[1].nome, listaUsers[1].cognome, listaUsers[1].classe);
console.log(user2);

let user3 = new Persona(listaUsers[2].id, listaUsers[2].nome, listaUsers[2].cognome, listaUsers[2].classe);
console.log(user3);

let user4 = new Persona(listaUsers[3].id, listaUsers[3].nome, listaUsers[3].cognome, listaUsers[3].classe);
console.log(user4);

let user5 = new Persona(listaUsers[4].id, listaUsers[4].nome, listaUsers[4].cognome, listaUsers[4].classe);
console.log(user5);

let user6 = new Persona(listaUsers[5].id, listaUsers[5].nome, listaUsers[5].cognome, listaUsers[5].classe);
console.log(user6);

let user7 = new Persona(listaUsers[6].id, listaUsers[6].nome, listaUsers[6].cognome, listaUsers[6].classe);
console.log(user7);

let user8 = new Persona(listaUsers[7].id, listaUsers[7].nome, listaUsers[7].cognome, listaUsers[7].classe);
console.log(user8);




/* Selezione target */

let idUno = document.querySelector('#idUno');
let nomeUno = document.querySelector('#nomeUno');
let cognomeUno = document.querySelector('#cognomeUno');
let classeUno = document.querySelector('#classeUno');

let idDue = document.querySelector('#idDue');
let nomeDue = document.querySelector('#nomeDue');
let cognomeDue = document.querySelector('#cognomeDue');
let classeDue = document.querySelector('#classeDue');




/* Funzioni */

function nomiPrimaPagina() {

    idUno.innerHTML = user1.id;
    nomeUno.innerHTML = user1.nome;
    cognomeUno.innerHTML = user1.cognome;
    classeUno.innerHTML = user1.classe;

    idDue.innerHTML = user2.id;
    nomeDue.innerHTML = user2.nome;
    cognomeDue.innerHTML = user2.cognome;
    classeDue.innerHTML = user2.classe;

};

function nomiSecondaPagina() {

    idUno.innerHTML = user3.id;
    nomeUno.innerHTML = user3.nome;
    cognomeUno.innerHTML = user3.cognome;
    classeUno.innerHTML = user3.classe;

    idDue.innerHTML = user4.id;
    nomeDue.innerHTML = user4.nome;
    cognomeDue.innerHTML = user4.cognome;
    classeDue.innerHTML = user4.classe;

};

function nomiTerzaPagina() {

    idUno.innerHTML = user5.id;
    nomeUno.innerHTML = user5.nome;
    cognomeUno.innerHTML = user5.cognome;
    classeUno.innerHTML = user5.classe;

    idDue.innerHTML = user6.id;
    nomeDue.innerHTML = user6.nome;
    cognomeDue.innerHTML = user6.cognome;
    classeDue.innerHTML = user6.classe;

};

function nomiQuartaPagina() {

    idUno.innerHTML = user7.id;
    nomeUno.innerHTML = user7.nome;
    cognomeUno.innerHTML = user7.cognome;
    classeUno.innerHTML = user7.classe;

    idDue.innerHTML = user8.id;
    nomeDue.innerHTML = user8.nome;
    cognomeDue.innerHTML = user8.cognome;
    classeDue.innerHTML = user8.classe;

};

window.onload = nomiPrimaPagina();


/* Variare Pagine */

let tastoPrimo = document.querySelector('.link1');
let tastoPrecedente = document.querySelector('.link2');
let tastoSuccessivo = document.querySelector('.link3');
let tastoUltimo = document.querySelector('.link4');

tastoPrimo.addEventListener('click', (evento) => {

    evento.preventDefault;
    nomiPrimaPagina();

});

tastoPrecedente.addEventListener('click', (evento) => {

    evento.preventDefault;

    if (idDue.innerHTML == user8.id) {

        nomiTerzaPagina();

    } else if (idDue.innerHTML == user6.id) {

        nomiSecondaPagina();

    } else {

        nomiPrimaPagina();

    }

});

tastoSuccessivo.addEventListener('click', (evento) => {

    evento.preventDefault;

    if (idDue.innerHTML == user2.id) {

        nomiSecondaPagina();

    } else if (idDue.innerHTML == user4.id) {

        nomiTerzaPagina();

    } else {

        nomiQuartaPagina();

    }

});

tastoUltimo.addEventListener('click', (evento) => {

    evento.preventDefault;
    nomiQuartaPagina();

});