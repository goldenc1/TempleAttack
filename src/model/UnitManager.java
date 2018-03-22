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
 * @author fred.slawson.adm
 */
public class UnitManager {
    File units;
    ArrayList unitList;
    ArrayList playerUnits;
    ArrayList enemyUnits;
    public void UnitManager(File Units) throws FileNotFoundException{
        units=Units;
        Scanner scanner = new Scanner(units);
        String fileString="";
        while (scanner.hasNextLine()) {
                fileString.concat(scanner.nextLine());
              }
        while(fileString.contains("<end>")){
            unitList.add(fileString.substring(0,fileString.indexOf("<end>")+4));
            fileString= fileString.substring(fileString.indexOf("<end>")+4);   
}   
   
    }
public void addUnit(String name, int owner){
if(owner==1){Unit unit = new Unit(unitList,name,owner);
playerUnits.add(unit);
}
if(owner==2){Unit unit = new Unit(unitList,name,owner);
enemyUnits.add(unit);
}

}
   
}   
 

/*  Unit Stat Block Template 

<name>"spearman"
<strength>1
<health>1
<range>2
<price>1
<speed>10
<AImode>"AdvanceToContact();"
<end>
*/