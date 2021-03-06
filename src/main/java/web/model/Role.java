package web.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "roles")
public class Role  {

    public Role(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role")
    private String rolename;

    @Transient
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

    public Role(int id, String rolename) {
        this.id = id;
        this.rolename = rolename;
        this.users = users;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
