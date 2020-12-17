package edu.miu.cs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NotBlank(message = "Code required!!")
    private String code;
    @NotBlank(message = "Prefex required!!")
    private String prefex;
    @NotBlank(message = "Number required!!")
    private String number;

    public Phone() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefex() {
        return prefex;
    }

    public void setPrefex(String prefx) {
        this.prefex = prefx;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  code +"-"+prefex +"-"+ number;
    }
}
