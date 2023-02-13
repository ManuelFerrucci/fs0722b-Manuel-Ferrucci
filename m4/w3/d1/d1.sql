CREATE TABLE clienti(
	numeroCliente int NOT NULL PRIMARY KEY,
	nome varchar(255) NOT NULL,
	cognome varchar(255) NOT NULL,
	dataNascita date NOT NULL,
	regioneResidenza varchar(255) NOT NULL
)

CREATE TABLE fatture(
	numeroFattura int NOT NULL UNIQUE,
	tipologia varchar(255) NOT NULL,
	importo decimal NOT NULL,
	iva decimal,
	idCliente int NOT NULL PRIMARY KEY,
	dataFattura date NOT NULL,
	numeroFornitore varchar(255) NOT NULL
)

CREATE TABLE prodotti(
	idProdotto int NOT NULL PRIMARY KEY,
	descrizione varchar(255) NOT NULL,
	inProduzione varchar(16) NOT NULL,
	inCommercio varchar(16) NOT NULL,
	dataAttivazione date NOT NULL,
	dataDisattivazione date
)

CREATE TABLE fornitori(
	numeroFornitore int NOT NULL PRIMARY KEY,
	denominazione varchar(255) NOT NULL,
	regioneResidenza varchar(255) NOT NULL
)

INSERT INTO clienti(numeroCliente, nome, cognome, dataNascita, regioneResidenza) VALUES (1, 'Mario', 'Rossi', '1980-11-04', 'Campania');
INSERT INTO clienti(numeroCliente, nome, cognome, dataNascita, regioneResidenza) VALUES (2, 'Giuseppe', 'Verdi', '1982-07-14', 'Lazio');
INSERT INTO clienti(numeroCliente, nome, cognome, dataNascita, regioneResidenza) VALUES (3, 'Luca', 'Gialli', '1985-03-22', 'Campania');
INSERT INTO clienti(numeroCliente, nome, cognome, dataNascita, regioneResidenza) VALUES (4, 'Leonardo', 'Verdi', '1980-07-14', 'Lombardia');
INSERT INTO clienti(numeroCliente, nome, cognome, dataNascita, regioneResidenza) VALUES (5, 'Fernando', 'Gialli', '1980-03-22', 'Lombardia');

INSERT INTO fatture(numeroFattura, tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES (1, 'A', 100.00, 20.00, 1, '2023-01-04', '+39123456789');
INSERT INTO fatture(numeroFattura, tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES (2, 'B', 200.00, 40.00, 2, '2023-01-04', '+39223456789');
INSERT INTO fatture(numeroFattura, tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES (3, 'A', 40.00, 2.00, 3, '2023-01-04', '+39323456789');
INSERT INTO fatture(numeroFattura, tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES (4, 'B', 40.00, 8.00, 4, '2023-01-04', '+39423456789');
INSERT INTO fatture(numeroFattura, tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES (5, 'A', 300.00, 60.00, 5, '2023-01-04', '+39523456789');
INSERT INTO fatture(numeroFattura, tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES (6, 'A', 150.00, 30.00, 6, '2022-01-04', '+39623456789');

INSERT INTO prodotti(idProdotto, descrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione) VALUES (1, 'Piatti', 'sì', 'sì', '2022-02-04', '2027-03-21');
INSERT INTO prodotti(idProdotto, descrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione) VALUES (2, 'Bicchieri', 'sì', 'sì', '2022-04-13', '2027-03-21');
INSERT INTO prodotti(idProdotto, descrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione) VALUES (3, 'Tappeti', 'no', 'sì', '2022-05-04', '2023-11-04');
INSERT INTO prodotti(idProdotto, descrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione) VALUES (4, 'Polvere', 'no', 'no', '2021-11-04', '2022-11-04');
INSERT INTO prodotti(idProdotto, descrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione) VALUES (5, 'Polvere1', 'no', 'sì', '2017-04-23', '2023-11-04');
INSERT INTO prodotti(idProdotto, descrizione, inProduzione, inCommercio, dataAttivazione, dataDisattivazione) VALUES (6, 'Polvere2', 'sì', 'sì', '2017-11-04', '2028-11-04');

INSERT INTO fornitori(numeroFornitore, denominazione, regioneResidenza) VALUES (1, 'Fornitore1', 'Abruzzo');
INSERT INTO fornitori(numeroFornitore, denominazione, regioneResidenza) VALUES (2, 'Fornitore2', 'Molise');
INSERT INTO fornitori(numeroFornitore, denominazione, regioneResidenza) VALUES (3, 'Fornitore3', 'Marche');
INSERT INTO fornitori(numeroFornitore, denominazione, regioneResidenza) VALUES (4, 'Fornitore4', 'Abruzzo');
INSERT INTO fornitori(numeroFornitore, denominazione, regioneResidenza) VALUES (5, 'Fornitore5', 'Molise');
INSERT INTO fornitori(numeroFornitore, denominazione, regioneResidenza) VALUES (6, 'Fornitore6', 'Marche');

/*
• Estrarre il nome e il cognome dei clienti nati nel 1982
• Estrarre il numero delle fatture con iva al 20%
• Riportare il numero di fatture e la somma dei relativi importi divisi per anno di fatturazione
• Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio
• Considerando soltanto le fatture con iva al 20 per cento, estrarre il numero di fatture per ogni anno
• Estrarre gli anni in cui sono state registrate più di 2 fatture con tipologia ‘A’
• Riportare l’elenco delle fatture (numero, importo, iva e data) con in aggiunta il nome del fornitore
• Estrarre il totale degli importi delle fatture divisi per residenza dei clienti
• Estrarre il numero dei clienti nati nel 1980 che hanno almeno una fattura superiore a 50 euro
• Estrarre una colonna di nome “Denominazione” contenente il nome, seguito da un carattere “-“, seguito dal cognome, per i
soli clienti residenti nella regione Lombardia
*/

-- Estrarre il nome e il cognome dei clienti nati nel 1982
SELECT nome, cognome FROM clienti WHERE dataNascita LIKE '%1982%';

-- Estrarre il numero delle fatture con iva al 20%
SELECT numeroFattura FROM fatture WHERE fatture.iva = fatture.importo * 0.2;

-- Riportare il numero di fatture e la somma dei relativi importi divisi per anno di fatturazione
SELECT numeroFattura FROM fatture WHERE fatture.datafattura = '2023-01-04';
SELECT numeroFattura FROM fatture WHERE fatture.datafattura = '2022-01-04';

-- Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio
SELECT idProdotto, descrizione
FROM prodotti
WHERE ((dataAttivazione LIKE '%2017%' AND inProduzione = 'sì')
	   OR (dataAttivazione LIKE '%2017%' AND inCommercio = 'sì'));

-- Considerando soltanto le fatture con iva al 20 per cento, estrarre il numero di fatture per ogni anno
SELECT dataFattura FROM fatture WHERE fatture.iva = fatture.importo * 0.2;

-- Estrarre gli anni in cui sono state registrate più di 2 fatture con tipologia ‘A’
SELECT dataFattura FROM fatture WHERE fatture.tipologia = 'A'; -- VA AGGIUNTO IL COUNT

-- Riportare l’elenco delle fatture (numero, importo, iva e data) con in aggiunta il nome del fornitore
SELECT fatture.numeroFattura, fatture.importo, fatture.iva, fatture.dataFattura, fornitori.denominazione
FROM fatture INNER JOIN fornitori ON fornitori.numerofornitore = fatture.numeroFornitore;







