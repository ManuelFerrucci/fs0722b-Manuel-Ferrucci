
class Persona {

    constructor(nome, age) {

        this.nome = nome;
        this.age = age;

    }
    
};

let persona1 = new Persona('Mario Rossi', 38);

let persona2 = new Persona('Carlo Bianchi', 38);

let persona3 = new Persona('Giovanni Verga', 30);

console.log(persona1, persona2, persona3);



function confrontaEta() {

    if(persona1.age > persona2.age) {

        return console.log(persona1.nome + ' è più vecchio di ' + persona2.nome);

    } else if(persona1.age < persona2.age) {

        return console.log(persona2.nome + ' è più vecchio di ' + persona1.nome);

    } else {

        return console.log(persona1.nome + ' e ' + persona2.nome + ' hanno la stessa età');

    }

};

confrontaEta();