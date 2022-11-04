function operazioneAritmetica() { 
    document.getElementById('operazioni_matematiche').value = eval(document.getElementById('operazioni_matematiche').value); 
}


function numero(dato){ 
    document.getElementById('operazioni_matematiche').value += dato;
}

 
function cancellaIlCampo() { 
    document.getElementById('operazioni_matematiche').value = '';
}