package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity //Para indicar que se guarda en abse de datos

public class Pareja {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Persona p1;
    @OneToOne
    private Persona p2;

    public Pareja() {
    }

    public Pareja(Persona p1, Persona p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getP1() {
        return p1;
    }

    public void setP1(Persona p1) {
        this.p1 = p1;
    }

    public Persona getP2() {
        return p2;
    }

    public void setP2(Persona p2) {
        this.p2 = p2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pareja pareja = (Pareja) o;

        if (getP1() != null ? !getP1().equals(pareja.getP1()) : pareja.getP1() != null) return false;
        return getP2() != null ? getP2().equals(pareja.getP2()) : pareja.getP2() == null;

    }

    @Override
    public int hashCode() {
        int result = getP1() != null ? getP1().hashCode() : 0;
        result = 31 * result + (getP2() != null ? getP2().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pareja{" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
