/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.home__6;

import java.util.concurrent.Semaphore;

/**
 *
 * @author afana
 */
public class Home__6  {

    public static void main(String[] args) {
        System.out.println("Работу выполнила Афанасьева Злата, РИБО-01-21, Вариант №2" + "\n");

        Semaphore table = new Semaphore(2);

        for (int i = 1; i <= 7; i++) {
            Thread student = new Thread(new Student(i, table));
            student.start();
        }
    }
}
