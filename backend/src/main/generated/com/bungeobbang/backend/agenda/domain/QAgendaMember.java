package com.bungeobbang.backend.agenda.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgendaMember is a Querydsl query type for AgendaMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAgendaMember extends EntityPathBase<AgendaMember> {

    private static final long serialVersionUID = -1472128161L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAgendaMember agendaMember = new QAgendaMember("agendaMember");

    public final QAgenda agenda;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.bungeobbang.backend.member.domain.QMember member;

    public QAgendaMember(String variable) {
        this(AgendaMember.class, forVariable(variable), INITS);
    }

    public QAgendaMember(Path<? extends AgendaMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAgendaMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAgendaMember(PathMetadata metadata, PathInits inits) {
        this(AgendaMember.class, metadata, inits);
    }

    public QAgendaMember(Class<? extends AgendaMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.agenda = inits.isInitialized("agenda") ? new QAgenda(forProperty("agenda"), inits.get("agenda")) : null;
        this.member = inits.isInitialized("member") ? new com.bungeobbang.backend.member.domain.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

