package com.nishthasoft.recursive;

public class Puzzle {

    public static void main(String[] args) {

        towerOfHano(4,'x','y', 'z');
        
    }
    
        static void towerOfHano(int n, char from, char to , char aux) {

            if (n == 1) {
                System.out.println("Moving the disk 1  from " + from + " to the " + to + " rod.");
                return;
            } else {

                towerOfHano(n - 1, from, aux, to);
                System.out.println("Moving the disk " + n + " from " + from + " to the " + to + " rod.");
                towerOfHano(n - 1, aux, to, from);

            }
        }
}
