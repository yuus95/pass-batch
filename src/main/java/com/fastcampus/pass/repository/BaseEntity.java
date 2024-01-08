package com.fastcampus.pass.repository;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass// 상속받은 entitiy에서 아래 필드들을 컬럼으로 사용할 수 있다.
//EntityListeners : 엔티티가 변경될 때 마다 속성에 있는 클래스를 콜백으로 사용
//AuditingEntityListener: Auditing 정보를 캡쳐하는 Listener
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate // 생성 일시를 생성합니다.
    @Column(updatable = false, nullable = false) // 업데이트를 하지 않도록, null이 되지 않도록 명시합니다.
    private LocalDateTime createdAt;
    @LastModifiedDate // 마지막 수정 일시를 생성합니다.
    private LocalDateTime modifiedAt;
}
