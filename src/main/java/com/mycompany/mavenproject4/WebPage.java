/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author ASUS
 */
abstract public class WebPage implements Loginable {
    private String webTitle;
    protected String loggedUsername;

    public WebPage(String title) {
        this.webTitle = title;
    }
    
    protected void showHeader() {
        System.out.println(String.format("""
         #################################################
         ### %s                                       ##
         #----------------------------------------------##
         """, webTitle));
    }
    
    protected void showFooter() {
        System.out.println
        ("""
         #----------------------------------------------##
         # Created by zz                                ##
         #################################################
         """);
    }
    
    abstract protected void showMainPage();
    
    public void showFullPage() {
        showHeader();
        showMainPage();
        showFooter();
    }
}
