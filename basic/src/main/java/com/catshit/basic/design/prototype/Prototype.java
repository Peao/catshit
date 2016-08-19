package com.catshit.basic.design.prototype;

import com.catshit.basic.agilejava.Student;

import java.io.*;

/**
 * @author Leon
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 3009711679102341439L;
    private int age;
    private String name;
    private Student student;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(baos);
        os.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return ois.readObject();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setAge(11);
        prototype.setName("liuqq");
        prototype.setStudent(new Student("liuqq"));

        System.out.println(prototype.getStudent());

        try {
            Prototype clonePrototype = (Prototype) prototype.clone();
//            System.out.println("age = " + clonePrototype.getAge());
//            System.out.println("name = " + clonePrototype.getName());
            System.out.println("name = " + clonePrototype.getStudent());

            Prototype p = (Prototype) prototype.deepClone();
            System.out.println("name = " + p);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
