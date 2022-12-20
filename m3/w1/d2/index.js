var versamento = 5;
var prelievo = 5;
var tassoInteresse = 0.1;
var Account = /** @class */ (function () {
    function Account(name, lastname, balanceInit) {
        this.name = name;
        this.lastname = lastname;
        this.balanceInit = balanceInit;
    }
    Account.prototype.oneDeposit = function () {
        var versamento = 5;
        return this.balanceInit = this.balanceInit + versamento;
    };
    Account.prototype.oneWithDraw = function () {
        var prelievo = 5;
        return this.balanceInit = this.balanceInit - prelievo;
    };
    Account.prototype.twoDeposit = function () {
        return this.balanceInit = this.balanceInit + (versamento * 2);
    };
    Account.prototype.twoWithDraw = function () {
        return this.balanceInit = this.balanceInit - (prelievo * 2);
    };
    Account.prototype.addInterest = function () {
        var soldiConInteressi = this.balanceInit * tassoInteresse;
        return this.balanceInit = this.balanceInit + soldiConInteressi;
    };
    return Account;
}());
var SonAccount = new Account('Mario', 'Rossi', 0);
var MotherAccount = new Account('Anna', 'Verdi', 0);
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
