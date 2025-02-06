package com.bungeobbang.backend.agenda.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgendaImage is a Querydsl query type for AgendaImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAgendaImage extends EntityPathBase<AgendaImage> {

    private static final long serialVersionUID = -189502474L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAgendaImage agendaImage = new QAgendaImage("agendaImage");

    public final QAgenda agenda;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QAgendaImage(String variable) {
        this(AgendaImage.class, forVariable(variable), INITS);
    }

    public QAgendaImage(Path<? extends AgendaImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAgendaImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAgendaImage(PathMetadata metadata, PathInits inits) {
        this(AgendaImage.class, metadata, inits);
    }

    public QAgendaImage(Class<? extends AgendaImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.agenda = inits.isInitialized("agenda") ? new QAgenda(forProperty("agenda"), inits.get("agenda")) : null;
    }

}

