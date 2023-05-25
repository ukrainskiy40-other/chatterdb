package io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("user_chatter")
public class UserChatterEntity implements Persistable<Long> {

    @Id
    private Long id;
    private String login;

    @Transient
    private boolean newRow;
    @Override
    @Transient
    public boolean isNew() {
        return this.newRow || id == null;
    }
    @Transient
    public UserChatterEntity setAsNew() {
        this.newRow = true;
        return this;
    }
}
