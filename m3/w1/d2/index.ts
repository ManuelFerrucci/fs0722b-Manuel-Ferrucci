
let versamento:number = 5;
let prelievo:number = 5;
let tassoInteresse:number = 0.1;

class Account {
    name:string;
    lastname:string;
    balanceInit:number;
    constructor(name:string,lastname:string, balanceInit:number) {
        this.name = name;
        this.lastname = lastname;
        this.balanceInit = balanceInit;
    }
    oneDeposit():number {
        let versamento:number = 5;
        return this.balanceInit = this.balanceInit + versamento;
    }
    oneWithDraw():number {
        let prelievo:number = 5;
        return this.balanceInit = this.balanceInit - prelievo;
    }
    twoDeposit():number {
        return this.balanceInit = this.balanceInit + (versamento*2);
    }
    twoWithDraw():number {
        return this.balanceInit = this.balanceInit - (prelievo*2);
    }
    addInterest():number {
        let soldiConInteressi:number = this.balanceInit * tassoInteresse;
        return this.balanceInit = this.balanceInit + soldiConInteressi;
    }
}

const SonAccount = new Account('Mario', 'Rossi', 0);
const MotherAccount = new Account('Anna', 'Verdi', 0);

SonAccount.oneDeposit();
//console.log(SonAccount);
SonAccount.oneWithDraw();
//console.log(SonAccount);
SonAccount.oneDeposit();
//console.log(SonAccount);
SonAccount.oneWithDraw();
//console.log(SonAccount);
SonAccount.twoDeposit();
//console.log(SonAccount);
SonAccount.oneWithDraw();
console.log(SonAccount);

MotherAccount.twoDeposit();
//console.log(MotherAccount);
MotherAccount.oneDeposit();
//console.log(MotherAccount);
MotherAccount.twoWithDraw();
//console.log(MotherAccount);
MotherAccount.twoDeposit();
//console.log(MotherAccount);
MotherAccount.twoDeposit();
//console.log(MotherAccount);
MotherAccount.twoDeposit();
//console.log(MotherAccount);
//MotherAccount.addInterest(); //decommenta per applicare gli interessi
console.log(MotherAccount);