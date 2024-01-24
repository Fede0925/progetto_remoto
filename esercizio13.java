package it.edu.iisgubbio.vettorri;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class esercizio13 extends Application{
	TextField tVettore = new TextField();
	TextField tK = new TextField();
	Button calcola = new Button("calcola");
	Label risultato = new Label();
	Boolean maggiore;
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10));
		griglia.setAlignment(Pos.CENTER);
		griglia.add(tVettore, 0, 0);
		griglia.add(tK, 0, 1);
		griglia.add(calcola, 0, 2);
		griglia.add(risultato, 0, 3);
		
		tVettore.setPromptText("Inserisci la lista di numeri");
		tK.setPromptText("Inserisci il valore K");
		
		calcola.setOnAction(e->calcola());
		
		finestra.setScene(scena);
		finestra.setTitle("Numeri maggiori di K");
		finestra.show();
	}
	
	private void calcola() {
		String numeri = tVettore.getText();
		String vettString[] = numeri.split(",");
		int vettore[] = new int[vettString.length];
		int k = Integer.parseInt(tK.getText());
		
		for(int i=0;i<vettore.length;i++) {
			vettore[i] = Integer.parseInt(vettString[i]);
		}
		
		for(int i=0;i<vettore.length;i++) {
			if(k>vettore[i]) {
				maggiore=false;
			}
			if(k<vettore[i]){
				maggiore=true;
			}
		}
		
		if(maggiore) {
			risultato.setText("Tutti i numeri sono maggiori di K");
		}
		if(maggiore==false){
			risultato.setText("I numeri non sono tutti maggiori di K");
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}