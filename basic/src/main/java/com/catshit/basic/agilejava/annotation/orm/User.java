package com.catshit.basic.agilejava.annotation.orm;

/**
 * @author Leon
 */
@Entity("t_user")
public class User {

    private String name;

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
