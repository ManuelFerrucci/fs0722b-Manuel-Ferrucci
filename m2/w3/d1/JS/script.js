
function User() {

    this.nome = '';
    this.cognome = '';
    this.dataNascita = '';

}

let nuovoUser = new User();

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

bottone.addEventListener('click', () => {
    
    let valoreNome = document.createElement('p');
    nomeInTabella.append(valoreNome);
    
    let valoreEta = document.createElement('p');
    anniInTabella.append(valoreEta);
    
    valoreNome.innerHTML = nomeForm.value + ' ' + cognomeForm.value;
    valoreEta.innerHTML = calcolaEta(dataForm.value);

    svuotaTesto();
        
})

