package com.bungeobbang.backend.opinion.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOpinion is a Querydsl query type for Opinion
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOpinion extends EntityPathBase<Opinion> {

    private static final long serialVersionUID = 555962901L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOpinion opinion = new QOpinion("opinion");

    public final com.bungeobbang.backend.common.entity.QBaseTimeEntity _super = new com.bungeobbang.backend.common.entity.QBaseTimeEntity(this);

    public final EnumPath<com.bungeobbang.backend.common.type.CategoryType> categoryType = createEnum("categoryType", com.bungeobbang.backend.common.type.CategoryType.class);

    public final NumberPath<Integer> chatCount = createNumber("chatCount", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isRemind = createBoolean("isRemind");

    public final com.bungeobbang.backend.member.domain.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final EnumPath<OpinionType> opinionType = createEnum("opinionType", OpinionType.class);

    public final com.bungeobbang.backend.university.domain.QUniversity university;

    public QOpinion(String variable) {
        this(Opinion.class, forVariable(variable), INITS);
    }

    public QOpinion(Path<? extends Opinion> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOpinion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOpinion(PathMetadata metadata, PathInits inits) {
        this(Opinion.class, metadata, inits);
    }

    public QOpinion(Class<? extends Opinion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.bungeobbang.backend.member.domain.QMember(forProperty("member"), inits.get("member")) : null;
        this.university = inits.isInitialized("university") ? new com.bungeobbang.backend.university.domain.QUniversity(forProperty("university")) : null;
    }

}

