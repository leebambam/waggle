package org.project.waggle.entity.together;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class togetherEntity {
    @Id
    private int to_no;
    private int m_no;
    private String to_title;
    public String to_content;
    private int to_count;
    private String to_ueryn;
    private String to_img;

}
