package com.fut.desktop.app.domain.pinEvents;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonFormat
@AllArgsConstructor
@NoArgsConstructor
public class Didm {

    // for iPhone it's idfv
    private String android;
}
