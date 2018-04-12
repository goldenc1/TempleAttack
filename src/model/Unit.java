package model;

import java.io.File;
import java.util.ArrayList;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fred.slawson.adm
 */
public class Unit {

    //UML Attribs
private double strength=0;  //attack power
private double health=0;     //hit points
private int price=0;          //gold cost
private double speed=0;       //pixels per tick of movement
private boolean boost=false;  //is unit boosted?
private double range;         //pixels of range that unit attacks at   
    //other stuff needed
private String AImode=null;   //defines unit behavior
private int owner=0;             //whos unit is it?
private String name="";           //name of the unit
// a unit is instantiated
    public Unit(ArrayList<String> units, String UnitType, int player){
        for (String x: units){
        if(x.contains(UnitType)){
        String temp = x;   
        this.setName(temp.substring(temp.indexOf("<name>")+5,temp.indexOf("/n")));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setStrength(Double.parseDouble(temp.substring(temp.indexOf("<strength>")+8,temp.indexOf("/n"))));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setHealth(Double.parseDouble(temp.substring(temp.indexOf("<health>")+7,temp.indexOf("/n"))));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setRange(Double.parseDouble(temp.substring(temp.indexOf("<range>")+6,temp.indexOf("/n"))));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setPrice(Integer.parseInt(temp.substring(temp.indexOf("<price>")+6,temp.indexOf("/n"))));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setSpeed(Double.parseDouble(temp.substring(temp.indexOf("<speed>")+6,temp.indexOf("/n"))));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setAI(temp.substring(temp.indexOf("<AImode>")+7,temp.indexOf("/n")));
        temp=temp.substring(temp.indexOf("/n")+1);
        this.setOwner(player);
        }
}}
    public Unit() {
    	
    }
    
    
    public void setName(String Name){
        this.name=Name;
 }   
    public String getName(){
        return this.name;
} 
    public void setStrength(double str){
        this.strength=str;
 }   
    public double getStrength(){
        return this.strength;
}
    public void setHealth(double HP){
        this.health=HP;
 }   
    public double getHealth(){
        return this.health;
}
    public void setPrice(int cost){
        this.price=cost;
 }   
    public int getPrice(){
        return this.price;
}    
    public void setSpeed(double velo){
        this.speed=velo;
 }   
    public double getSpeed(){
        return this.speed;
}    
    public void setBoost(boolean boosted){
        this.boost=boosted;
 }   
    public boolean getBoost(){
        return this.boost;
}    
    public void setRange(double rng){
        this.range=rng;
 }   
    public double getRange(){
        return this.range;
}
    public void setAI(String mode){
        this.AImode=mode;
 }   
    public String getAI(){
        return this.AImode;
}    
    public void setOwner(int own){
        this.owner=own;
 }   
    public int getOwner(){
        return this.owner;
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