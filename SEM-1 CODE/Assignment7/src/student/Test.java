/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author thego
 */
public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Programming 1", 3, 57, 45);
        Course course2 = new Course("Game Programming 1", 2.5, 100, 100);
        Course course3 = new Course("ITCS", 2, 60, 60);
        Student student = new Student("Buhbah6", "AttackHelicopter", "Buhbah6@gmail.com", course1, course2, course3);
        System.out.println(student);
    }
}
