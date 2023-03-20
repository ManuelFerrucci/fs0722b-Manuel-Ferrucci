let buttonListaSonde = document.querySelector('#buttonListaSonde');
let buttonListaIncendi = document.querySelector('#buttonListaIncendi');
let contenitore_lista = document.querySelector('#contenitore_lista');

buttonListaSonde.addEventListener('click', () => {

    contenitore_lista.innerHTML = "";

    fetch("http://localhost:8080/api/lista-sonde")
        .then((response) => response.json())
        .then((data) => {
            let array = data.content;
            console.log(array);

            array.forEach(element => {
                let sonda = document.createElement('p');
                sonda.innerHTML = 'Sonda trovata --- ' + 'id: ' + element.id + ', ' + 'latitudine: ' + element.latitudine + ', ' + 'longitudine: ' + element.longitudine + ', ' + 'quantità del fumo: ' + element.quantitaFumo + ', ' + 'allarme incendio: ' + element.allarmeIncendio;
                contenitore_lista.append(sonda);
            });
        })
})

buttonListaIncendi.addEventListener('click', () => {

    contenitore_lista.innerHTML = "";

    fetch("http://localhost:8080/api/lista-sonde")
        .then((response) => response.json())
        .then((data) => {
            let array = data.content;
            console.log(array);

            let avvisoIncendi = document.createElement('p');
            avvisoIncendi.innerHTML = 'Allarmi rilevati dalle sonde:';
            contenitore_lista.append(avvisoIncendi);
            array.forEach(element => {
                if (element.quantitaFumo > 5) {
                    let contenitore = document.createElement('div')
                    contenitore.classList.add('infoIncendio')
                    let incendio = document.createElement('p');
                    let infoURL = document.createElement('p');
                    incendio.innerHTML = 'La sonda ' + element.id + ' rileva quantità di fumo '
                        + (element.quantitaFumo - 5) + ' unità al di sopra del limite, ALLARME INCENDIO';
                    infoURL.innerHTML = 'URL (SOLO STAMPA): https://host/alarm?=idsonda=' + element.id + '&latitudine=' + element.latitudine
                        + '&longitudine=' + element.longitudine + '&smokeLevel=' + element.quantitaFumo;

                    contenitore.append(incendio);
                    contenitore.append(infoURL);
                    contenitore_lista.append(contenitore);
                }
            });
        })
})