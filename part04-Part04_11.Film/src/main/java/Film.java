/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathilde
 */
public class Film {
    private final String name;
    private final int ageRatting;
    
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRatting = filmAgeRating;
    }
    
    public String name(){
        return this.name;
    }
    
    public int ageRatting(){
        return this.ageRatting;
    }

    
}
