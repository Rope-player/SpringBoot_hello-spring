package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class Member {

    @Id /* Primary Key 라는 의미 */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* 자동 증감 */
    private Long id;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
