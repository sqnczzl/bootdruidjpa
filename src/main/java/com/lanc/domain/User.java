package com.lanc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: zzl
 * @Date: 2019/3/12 17:44
 * @Description:
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @Column(name = "", length = 36)
    private String id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "address", length = 60)
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
