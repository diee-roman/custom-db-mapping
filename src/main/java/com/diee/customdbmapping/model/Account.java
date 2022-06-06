package com.diee.customdbmapping.model;

import com.diee.customdbmapping.config.dbmapping.ListArrayType;
import com.diee.customdbmapping.model.projection.AccountBasicInfo;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "account")
@TypeDef(
    name = "list-array",
    typeClass = ListArrayType.class
)

@NamedNativeQuery(name = "Account.getBasicInfo",
    query = "SELECT a.username, a.email, a.roles FROM Account a WHERE a.username = :username",
    resultSetMapping = "BasicInfoMapping")
@SqlResultSetMapping(
    name = "BasicInfoMapping",
    classes = @ConstructorResult(
        targetClass = AccountBasicInfo.class,
        columns = {
            @ColumnResult(name = "username", type = String.class),
            @ColumnResult(name = "email", type = String.class),
            @ColumnResult(name = "roles", type = ListArrayType.class)
        }))

@Data
public class Account {

    @Id
    private Long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Type(type = "list-array")
    @Column(name = "roles", columnDefinition = "text[]")
    private List<String> roles;
}
