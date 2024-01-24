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

public class esercizio27 extends Application{
	TextField tVettore = new TextField();
	Label risultato = new Label();
	Button calcola = new Button("calcola");
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10));
		griglia.setAlignment(Pos.CENTER);
		griglia.add(tVettore, 0, 0);
		griglia.add(calcola, 0, 1);
		griglia.add(risultato, 0, 2);
		
		tVettore.setPromptText("Inserisci i numeri");
		calcola.setOnAction(e->calcola());
		
		finestra.setScene(scena);
		finestra.setTitle("Rovescia il vettore");
		finestra.show();
	}

	private void calcola() {
		String lista = tVettore.getText();
		String sVett[] = lista.split(",");
		String risL = "";
		int vettore[] = new int[sVett.length];
		int pos = vettore.length-1;
		for(int i=0;i<vettore.length;i++) {
			vettore[i]=Integer.parseInt(sVett[pos]);
			pos=pos-1;
			risL+=vettore[i]+" ";
		}
		risultato.setText(risL);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}