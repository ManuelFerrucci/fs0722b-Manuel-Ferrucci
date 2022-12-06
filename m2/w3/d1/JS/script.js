let nuovoUser = new User(nome, cognome, dataNascita);

function User(x, y, z) {

    this.nome = x;
    this.cognome = y;
    this.dataNascita = z;

    this.mostraNomeCompleto = function() {

        return this.nome + ' ' + this.cognome;

    };

}

function calcolaEta (valoreData) {
    
    let eta;

    let dataOdierna = new Date();
    dataOdierna = dataOdierna.getFullYear();

    let dataInserita = new Date(valoreData);
    dataInserita = dataInserita.getFullYear();

    eta = dataOdierna - dataInserita;
    
    return eta;

}

let nomeForm = document.querySelector('#nome');
let cognomeForm = document.querySelector('#cognome');
let dataForm = document.querySelector('#dataNascita');
let bottone = document.querySelector('#salva');
let nomeInTabella = document.querySelector('#nome_tabella');
let anniInTabella = document.querySelector('#eta_tabella');

function svuotaTesto () {

    nomeForm.value = '';
    cognomeForm.value = '';
    dataForm.value = '';

}

bottone.addEventListener('click', (evento) => {

    evento.preventDefault(); //serve a eliminare eventuli funzioni predefinite e fargli fare quello che dico io
    
    let valoreNome = document.createElement('p');
    nomeInTabella.append(valoreNome);
    
    let valoreEta = document.createElement('p');
    anniInTabella.append(valoreEta);
    
    valoreNome.innerHTML = nomeForm.value + ' ' + cognomeForm.value;
    valoreEta.innerHTML = calcolaEta(dataForm.value);

    svuotaTesto();
        
});