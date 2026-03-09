
package com.mycompany.day3inputoutput;
//include JOptionPane in our project
import javax.swing.JOptionPane;

public class Day3InputOutput {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Welcome to JOptionPane 101");
        //read in favourite movie of user
        String favoriteMovie = JOptionPane.showInputDialog("What is your Favourite Movie? ");
        
        int views = Integer.parseInt(JOptionPane.showInputDialog("How many times have you seen it? "));
        
        double hours = Double.parseDouble(JOptionPane.showInputDialog("How many hours is the movie? "));
        
        
        
        JOptionPane.showMessageDialog(null, "Favourite Movie: " + favoriteMovie
         + "\nViewed: " + views+ " times" + "\nMovie Length: " + hours + " hours" );
        
        
        
        
    }
}
