/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author ASUS
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        HomePage h = new HomePage("tp_h");
        DashboardPage d = new DashboardPage("tp_d");
        
        System.out.println("Show full homepage no login");
        h.showFullPage();

        System.out.println("Show full dashboard page no login");
        d.showFullPage();
        
        h.login("zz");
        h.showFullPage();

        d.login("zz");
        d.showFullPage();
    }
}
