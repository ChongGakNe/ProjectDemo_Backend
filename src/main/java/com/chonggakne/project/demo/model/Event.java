package com.chonggakne.project.demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String context;
    private Boolean checked;

    public Event(String context, Boolean checked) {
        this.context = context;
        this.checked = checked;
    }
}
