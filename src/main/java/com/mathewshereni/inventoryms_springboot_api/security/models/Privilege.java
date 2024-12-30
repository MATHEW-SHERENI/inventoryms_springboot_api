package com.mathewshereni.inventoryms_springboot_api.security.models;

import com.mathewshereni.inventoryms_springboot_api.models.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Privilege extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String description;

    @ManyToOne
    @JoinColumn(name = "userid" , insertable = false , updatable = false)
    private User user;
    private long userid;

    @ManyToOne
    @JoinColumn(name = "roleid" , insertable = false , updatable = false)
    private Role role;
    private long roleid;

    @OneToMany(mappedBy = "privilege")
    private List<UserPrivilegeAssignment> users;



}
