/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home__6;

import java.util.concurrent.Semaphore;

/**
 *
 * @author afana
 */
public class Student implements Runnable{
    private final int id;
    private final Semaphore table;

    public Student(int id, Semaphore table) {
        this.id = id;
        this.table = table;
    }

    @Override
    public void run() {
        try {
            System.out.println("Student" + id + " waiting");
            table.acquire();

            System.out.println("Student" + id + " eating");

            Thread.sleep(3000);

            System.out.println("Student" + id + " exit");

            table.release();
        } catch (InterruptedException e) {
        }
    }
}