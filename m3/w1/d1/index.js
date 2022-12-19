var numeroCasuale = (Math.floor(Math.random() * (100 - 1) + 1));
console.log(numeroCasuale);
var numeroFrancesco = 40;
console.log(numeroFrancesco);
var numeroMario = 60;
console.log(numeroMario);
//var numeroManuale: number = 50;
function confrontaNumeri() {
    if (numeroCasuale == numeroFrancesco) {
        console.log('Il numero generato e quello di Francesco sono uguali');
    }
    else if (numeroCasuale == numeroMario) {
        console.log('Il numero generato e quello di Mario sono uguali');
    }
    else {
        if (((numeroCasuale != numeroFrancesco) && (numeroCasuale != numeroMario)) && (Math.abs(numeroCasuale - numeroFrancesco) < Math.abs(numeroCasuale - numeroMario))) {
            console.log('Il numero uscito non è quello di Francesco, ma si avvicina di più');
        }
        else if (((numeroCasuale != numeroFrancesco) && (numeroCasuale != numeroMario)) && (Math.abs(numeroCasuale - numeroFrancesco) > Math.abs(numeroCasuale - numeroMario))) {
            console.log('Il numero uscito non è quello di Mario, ma si avvicina di più');
        }
        else {
            console.log('Il numero uscito non è quello di Mario né di Francesco, ed il numero casuale è esattamente alla stessa distanza tra i loro');
        }
    }
}
confrontaNumeri();
