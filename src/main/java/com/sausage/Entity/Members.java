package com.sausage.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Members {
    @Id
//    @GeneratedValue // Auto IncId Generator
    private String id;

    @Column(length = 20, nullable = false)
    private String pw;

//    @Column(columnDefinition = "TEXT", nullable = true)
//    private Integer price;
//
//    private String memo;

    @Builder
    public Members(String name, Integer price, String memo) {
        this.id = id;
        this.pw = pw;
    }
}
