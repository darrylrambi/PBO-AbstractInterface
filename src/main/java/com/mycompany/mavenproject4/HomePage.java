/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author ASUS
 */
public class HomePage extends WebPage {

    public HomePage(String title) {
        super(title);
    }
    

    @Override
    protected void showMainPage() {
        if (this.loggedUsername == null || this.loggedUsername.isEmpty()) {
            System.out.println
            ("""
            # Selamat datang                               ##
            # Anda sedang berada di home page              ##
            # Ini penjelasan umum home page                ##
             """);
        } else {
            System.out.println(String.format("""
            # Selamat datang, %s!                          ##
            # Anda sedang berada di home page              ##
            # Ini penjelasan khusus home page              ##                                             
            """, loggedUsername));

        }
    }
    
    @Override
    public void login(String input) {
        this.loggedUsername = input;
        System.out.println("Selamat datang di halaman Home, " + loggedUsername + "!");
    }
}
