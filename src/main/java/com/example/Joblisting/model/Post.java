package com.example.Joblisting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@ToString
@Document(collection = "JobPost")
public class Post {
    @Getter @Setter private String profile;
    @Getter @Setter private String desc;
    @Getter @Setter private String[] techs;
    @Getter @Setter private int exp;

}
