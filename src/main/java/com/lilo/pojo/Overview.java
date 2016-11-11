package com.lilo.pojo;

import lombok.*;

import java.sql.Timestamp;

/**
 * Created by liming on 16-11-9.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Overview {

    Timestamp ts;
    int registered;
    int active;
    double active_hours;
    double active_ratio;
    int tvactive;
    double tvactive_hours;
    double tvactive_ratio;
    int channels;
    int programs;
    int ads;

}
