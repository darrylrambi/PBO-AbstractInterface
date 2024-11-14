/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author ASUS
 */
public class DashboardPage extends WebPage {

    public DashboardPage(String title) {
        super(title);
    }

    @Override
    protected void showMainPage() {
        if (this.loggedUsername == null || this.loggedUsername.isEmpty()) {
            System.out.println
            ("""
             # Akses ditutup untuk user guest               ##
             # Mohon login terlebih dahulu                  ##
             """);
        } else {
            System.out.println(String.format("""
            # Dashboard Page – %s                          ##
            # Opsi-opsi page dashboard                     ##
            # dsb.                                         ##
            """, loggedUsername));

        }
    }

    @Override
    public void login(String input) {
        this.loggedUsername = input;
        System.out.println(loggedUsername + " berhasil login ke halaman dashboard");
    }
    
}
