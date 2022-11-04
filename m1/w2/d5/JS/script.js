function operazioneAritmetica() { 
    document.getElementById('operazioni_matematiche').value = eval(document.getElementById('operazioni_matematiche').value); 
}


function numero(dato){ 
    document.getElementById('operazioni_matematiche').value += dato;
}

 
function pulisciSchermata() { 
    document.getElementById('operazioni_matematiche').value = '';
}


function dueSegniNo() {
    document.getElementById('operazioni_matematiche').value = 'ERROR';
}