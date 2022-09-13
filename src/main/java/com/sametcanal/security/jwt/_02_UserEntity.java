package com.sametcanal.security.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sametcanal.data.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;


// register için kullanılacak

@Getter
@Setter

@Entity
@Table(name = "users")
public class _02_UserEntity extends BaseEntity {

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;

    @Column(name="system_auto_data")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;
}
