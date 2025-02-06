package com.bungeobbang.backend.agenda.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgenda is a Querydsl query type for Agenda
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAgenda extends EntityPathBase<Agenda> {

    private static final long serialVersionUID = -909687707L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAgenda agenda = new QAgenda("agenda");

    public final com.bungeobbang.backend.common.entity.QBaseTimeEntity _super = new com.bungeobbang.backend.common.entity.QBaseTimeEntity(this);

    public final com.bungeobbang.backend.admin.domain.QAdmin admin;

    public final EnumPath<com.bungeobbang.backend.common.type.CategoryType> categoryType = createEnum("categoryType", com.bungeobbang.backend.common.type.CategoryType.class);

    public final StringPath content = createString("content");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<AgendaImage, QAgendaImage> images = this.<AgendaImage, QAgendaImage>createList("images", AgendaImage.class, QAgendaImage.class, PathInits.DIRECT2);

    public final BooleanPath isEnd = createBoolean("isEnd");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final StringPath title = createString("title");

    public final com.bungeobbang.backend.university.domain.QUniversity university;

    public QAgenda(String variable) {
        this(Agenda.class, forVariable(variable), INITS);
    }

    public QAgenda(Path<? extends Agenda> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAgenda(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAgenda(PathMetadata metadata, PathInits inits) {
        this(Agenda.class, metadata, inits);
    }

    public QAgenda(Class<? extends Agenda> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new com.bungeobbang.backend.admin.domain.QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.university = inits.isInitialized("university") ? new com.bungeobbang.backend.university.domain.QUniversity(forProperty("university")) : null;
    }

}

