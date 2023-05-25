package io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("message_chatter")
public class MessageChatterEntity implements Persistable<Long> {

    @Id
    private Long id;
    private String message;
    @Column("user_chatter_id")
    private Long userChatterId;

    @Transient
    private boolean newRow;
    @Override
    @Transient
    public boolean isNew() {
        return this.newRow || id == null;
    }
    @Transient
    public MessageChatterEntity setAsNew() {
        this.newRow = true;
        return this;
    }
}
