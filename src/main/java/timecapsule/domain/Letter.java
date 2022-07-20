package timecapsule.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Letter {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String content;
    private String password;

}
