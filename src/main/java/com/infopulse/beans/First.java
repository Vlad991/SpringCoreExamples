package com.infopulse.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class First {
    private Second second;

    private First (Second second) {
        this.second = second;
    }
}
