

/*document.querySelector('#tasto1')
.addEventListener('click', function() {

    let testoInserito = document.querySelector('#testo-task');                     //IMPORTANTE - IL CODICE JAVASCRIPT E' TUTTO COMMENTATO PERCHE' NON SAPEVO FARE IL
                                                                                   //CODICE DA SOLO. QUINDI QUELLO CHE VEDI E' QUELLO FATTO DA MICHELE. 
    let contenitore = document.createElement('div');                               //SE DECOMMENTI FUNZIONA TUTTO
    contenitore.classList.add('da-fare');                                          //MA DEVO IMPARARE, QUINDI DI LASCIARTELO FUNZIONANTE COME SE L'AVESSI FATTO IO

    let span = document.createElement('span');                                     //MI SEMBRAVA UNA PRESA IN GIRO VERSO ENTRAMBI
    span.textContent = testoInserito.value;

    let completato = document.createElement('button');
    completato.textContent = 'Completato!';

    completato.addEventListener('click', () => {

        contenitore.classList.add('completato');
        document.querySelector('#lista-dei-completati')
        .append(contenitore);

    })

    contenitore.append(span, completato);
    document.querySelector('#lista-da-fare').append(contenitore);

    testoInserito.value = '';

})*/