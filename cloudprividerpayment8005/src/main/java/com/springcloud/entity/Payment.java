package com.springcloud.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Payment(String serial) {
        this.serial = serial;
    }

    public Payment(Long id) {
        this.id = id;
    }
}
