package com.GestioneIncendi2.proxy;

import java.util.List;

import com.GestioneIncendi2.models.Installazione;

// Il proxy serve a "nascondere" i processi più complessi e pesanti,
// facendo visualizzare al client solo il processo finale.
// in questo caso racchiudo il processo di controllo all'interno di un'interfaccia,
// che vado poi a richiamare nel momento in cui si effettua il controllo
public interface ProcessoDiControlloAllarmi {
	public void controlloAllarme(List<Installazione> listaSonde);
}
