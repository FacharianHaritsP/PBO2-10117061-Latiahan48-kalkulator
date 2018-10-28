/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latiahan48.kalkulator;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung angka 1 dan angka 2
 */
public class PBO210117061Latiahan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        kalkulator jembatan = new kalkulator();
        jembatan.setValue1(7);
        jembatan.setValue2(5);
        System.out.println("VALUE 1 = " + jembatan.getValue1());
        System.out.println("VALUE 2 = " + jembatan.getValue2());
        jembatan.setNameProject();
        jembatan.setNoteProject(null);
        System.out.println("Result Add is = " + jembatan.add(jembatan.getValue1(), jembatan.getValue2()));
        System.out.println("Result Minus is = " + jembatan.minus(jembatan.getValue1(), jembatan.getValue2()));
        System.out.println("Result Multiplication is = " + jembatan.multiplication(jembatan.getValue1(), jembatan.getValue2()));
        System.out.println("Result Division is = " + jembatan.division(jembatan.getValue1(), jembatan.getValue2()));

    }

}
