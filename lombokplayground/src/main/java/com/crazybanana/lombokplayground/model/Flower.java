package com.crazybanana.lombokplayground.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Value
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    private int id, length;
    private String type, color;
}
