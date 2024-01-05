package com.fastcampus.pass.repository;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass// 상속받은 entitiy에서 아래 필드들을 컬럼으로 사용할 수 있다.
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
