package springmvc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class StudentData implements Serializable {
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("grade")
    private int grade;
}
