package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fred.slawson.adm, Charles Golden II 
 */
public class UnitManager {
	ArrayList<Unit> units;  //player
	ArrayList<Unit> defUnits;  //AI

	public void UnitManager(ArrayList<Unit> Units, ArrayList<Unit> def){
		units = Units;
		defUnits = def;
		//Scanner scanner = new Scanner(units);      // not sure why you would scan an arraylist? 
		/*String fileString = "";
		while (scanner.hasNextLine()) {
			fileString.concat(scanner.nextLine());
		}
		while (fileString.contains("<end>")) {
			units.add(fileString.substring(0, fileString.indexOf("<end>") + 4));
			fileString = fileString.substring(fileString.indexOf("<end>") + 4);
		}*/
		

	}

//	public void addUnit(String name, int owner) {
//		if (owner == 1) {
//			Unit unit = new Unit(units, name, owner);
//			playerUnits.add(unit);
//		}
//		else if (owner == 2) {
//			Unit unit = new Unit(units, name, owner);
//			enemyUnits.add(unit);
//		}
//		else {
//			throw new Exception("No units added, could not determine unit's allegience");
//		}
//
//	}

}

/*
 * Unit Stat Block Template
 * 
 * <name>"spearman" <strength>1 <health>1 <range>2 <price>1 <speed>10
 * <AImode>"AdvanceToContact();" <end>
 */