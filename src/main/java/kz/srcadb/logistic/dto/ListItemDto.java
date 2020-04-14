package kz.srcadb.logistic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ListItemDto {
    private Long id;
    private String value;


    public ListItemDto(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}