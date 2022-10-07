open module xorcery.neo4j.shaded {
    requires com.github.luben.zstd_jni;
    requires com.sun.jna;
    requires commons.beanutils;
    requires commons.collections;
    requires io.netty.codec.http;
    requires io.netty.transport.classes.epoll;
    requires io.netty.transport.unix.common;
    requires jProcesses;
    requires jamm;
    requires java.rmi;
    requires jdk.attach;
    requires jdk.management;
    requires jdk.unsupported;
    requires jersey.container.servlet.core;
    requires jersey.server;
    requires org.apache.commons.compress;
    requires org.apache.commons.io;
    requires org.apache.commons.text;
    requires org.bouncycastle.pkix;
    requires org.bouncycastle.provider;
    requires org.eclipse.jetty.webapp;
    requires org.jctools.core;
    requires org.slf4j;

    requires transitive com.fasterxml.jackson.annotation;
    requires transitive com.fasterxml.jackson.core;
    requires transitive com.fasterxml.jackson.databind;
    requires transitive com.github.benmanes.caffeine;
    requires transitive inet.ipaddr;
    requires transitive info.picocli;
    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive io.netty.common;
    requires transitive io.netty.handler;
    requires transitive io.netty.transport;
    requires transitive java.compiler;
    requires transitive java.desktop;
    requires transitive java.logging;
    requires transitive java.management;
    requires transitive java.naming;
    requires transitive java.scripting;
    requires transitive java.sql;
    requires transitive java.xml;
    requires transitive jdk.javadoc;
    requires transitive jersey.common;
    requires transitive org.apache.commons.lang3;
    requires transitive org.eclipse.collections.api;
    requires transitive org.eclipse.collections.impl;
    requires transitive org.eclipse.jetty.http;
    requires transitive org.eclipse.jetty.io;
    requires transitive org.eclipse.jetty.server;
    requires transitive org.eclipse.jetty.servlet;
    requires transitive org.eclipse.jetty.util;
    requires transitive org.reactivestreams;
    requires transitive parboiled.core;
    requires transitive reactor.core;
    requires transitive scala.library;
    requires transitive scala.reflect;

    exports magnolia;
    exports mercator;
    exports org.apache.lucene;
    exports org.apache.lucene.analysis;
    exports org.apache.lucene.analysis.ar;
    exports org.apache.lucene.analysis.bg;
    exports org.apache.lucene.analysis.bn;
    exports org.apache.lucene.analysis.boost;
    exports org.apache.lucene.analysis.br;
    exports org.apache.lucene.analysis.ca;
    exports org.apache.lucene.analysis.charfilter;
    exports org.apache.lucene.analysis.cjk;
    exports org.apache.lucene.analysis.ckb;
    exports org.apache.lucene.analysis.commongrams;
    exports org.apache.lucene.analysis.compound;
    exports org.apache.lucene.analysis.compound.hyphenation;
    exports org.apache.lucene.analysis.core;
    exports org.apache.lucene.analysis.custom;
    exports org.apache.lucene.analysis.cz;
    exports org.apache.lucene.analysis.da;
    exports org.apache.lucene.analysis.de;
    exports org.apache.lucene.analysis.el;
    exports org.apache.lucene.analysis.en;
    exports org.apache.lucene.analysis.es;
    exports org.apache.lucene.analysis.et;
    exports org.apache.lucene.analysis.eu;
    exports org.apache.lucene.analysis.fa;
    exports org.apache.lucene.analysis.fi;
    exports org.apache.lucene.analysis.fr;
    exports org.apache.lucene.analysis.ga;
    exports org.apache.lucene.analysis.gl;
    exports org.apache.lucene.analysis.hi;
    exports org.apache.lucene.analysis.hu;
    exports org.apache.lucene.analysis.hunspell;
    exports org.apache.lucene.analysis.hy;
    exports org.apache.lucene.analysis.id;
    exports org.apache.lucene.analysis.in;
    exports org.apache.lucene.analysis.it;
    exports org.apache.lucene.analysis.lt;
    exports org.apache.lucene.analysis.lv;
    exports org.apache.lucene.analysis.minhash;
    exports org.apache.lucene.analysis.miscellaneous;
    exports org.apache.lucene.analysis.ngram;
    exports org.apache.lucene.analysis.nl;
    exports org.apache.lucene.analysis.no;
    exports org.apache.lucene.analysis.path;
    exports org.apache.lucene.analysis.pattern;
    exports org.apache.lucene.analysis.payloads;
    exports org.apache.lucene.analysis.pt;
    exports org.apache.lucene.analysis.query;
    exports org.apache.lucene.analysis.reverse;
    exports org.apache.lucene.analysis.ro;
    exports org.apache.lucene.analysis.ru;
    exports org.apache.lucene.analysis.shingle;
    exports org.apache.lucene.analysis.sinks;
    exports org.apache.lucene.analysis.snowball;
    exports org.apache.lucene.analysis.sr;
    exports org.apache.lucene.analysis.standard;
    exports org.apache.lucene.analysis.sv;
    exports org.apache.lucene.analysis.synonym;
    exports org.apache.lucene.analysis.th;
    exports org.apache.lucene.analysis.tokenattributes;
    exports org.apache.lucene.analysis.tr;
    exports org.apache.lucene.analysis.util;
    exports org.apache.lucene.analysis.wikipedia;
    exports org.apache.lucene.codecs;
    exports org.apache.lucene.codecs.blocktree;
    exports org.apache.lucene.codecs.compressing;
    exports org.apache.lucene.codecs.lucene50;
    exports org.apache.lucene.codecs.lucene60;
    exports org.apache.lucene.codecs.lucene70;
    exports org.apache.lucene.codecs.lucene80;
    exports org.apache.lucene.codecs.lucene84;
    exports org.apache.lucene.codecs.lucene86;
    exports org.apache.lucene.codecs.lucene87;
    exports org.apache.lucene.codecs.perfield;
    exports org.apache.lucene.collation;
    exports org.apache.lucene.collation.tokenattributes;
    exports org.apache.lucene.document;
    exports org.apache.lucene.geo;
    exports org.apache.lucene.index;
    exports org.apache.lucene.queryparser.classic;
    exports org.apache.lucene.queryparser.complexPhrase;
    exports org.apache.lucene.queryparser.ext;
    exports org.apache.lucene.queryparser.flexible.core;
    exports org.apache.lucene.queryparser.flexible.core.builders;
    exports org.apache.lucene.queryparser.flexible.core.config;
    exports org.apache.lucene.queryparser.flexible.core.messages;
    exports org.apache.lucene.queryparser.flexible.core.nodes;
    exports org.apache.lucene.queryparser.flexible.core.parser;
    exports org.apache.lucene.queryparser.flexible.core.processors;
    exports org.apache.lucene.queryparser.flexible.core.util;
    exports org.apache.lucene.queryparser.flexible.messages;
    exports org.apache.lucene.queryparser.flexible.precedence;
    exports org.apache.lucene.queryparser.flexible.precedence.processors;
    exports org.apache.lucene.queryparser.flexible.standard;
    exports org.apache.lucene.queryparser.flexible.standard.builders;
    exports org.apache.lucene.queryparser.flexible.standard.config;
    exports org.apache.lucene.queryparser.flexible.standard.nodes;
    exports org.apache.lucene.queryparser.flexible.standard.parser;
    exports org.apache.lucene.queryparser.flexible.standard.processors;
    exports org.apache.lucene.queryparser.simple;
    exports org.apache.lucene.queryparser.surround.parser;
    exports org.apache.lucene.queryparser.surround.query;
    exports org.apache.lucene.queryparser.xml;
    exports org.apache.lucene.queryparser.xml.builders;
    exports org.apache.lucene.search;
    exports org.apache.lucene.search.comparators;
    exports org.apache.lucene.search.similarities;
    exports org.apache.lucene.search.spans;
    exports org.apache.lucene.store;
    exports org.apache.lucene.util;
    exports org.apache.lucene.util.automaton;
    exports org.apache.lucene.util.bkd;
    exports org.apache.lucene.util.compress;
    exports org.apache.lucene.util.fst;
    exports org.apache.lucene.util.graph;
    exports org.apache.lucene.util.mutable;
    exports org.apache.lucene.util.packed;
    exports org.apache.shiro;
    exports org.apache.shiro.aop;
    exports org.apache.shiro.authc;
    exports org.apache.shiro.authc.credential;
    exports org.apache.shiro.authc.pam;
    exports org.apache.shiro.authz;
    exports org.apache.shiro.authz.annotation;
    exports org.apache.shiro.authz.aop;
    exports org.apache.shiro.authz.permission;
    exports org.apache.shiro.cache;
    exports org.apache.shiro.codec;
    exports org.apache.shiro.concurrent;
    exports org.apache.shiro.config;
    exports org.apache.shiro.config.event;
    exports org.apache.shiro.crypto;
    exports org.apache.shiro.crypto.hash;
    exports org.apache.shiro.crypto.hash.format;
    exports org.apache.shiro.dao;
    exports org.apache.shiro.env;
    exports org.apache.shiro.event;
    exports org.apache.shiro.event.support;
    exports org.apache.shiro.io;
    exports org.apache.shiro.jndi;
    exports org.apache.shiro.ldap;
    exports org.apache.shiro.mgt;
    exports org.apache.shiro.realm;
    exports org.apache.shiro.realm.activedirectory;
    exports org.apache.shiro.realm.jdbc;
    exports org.apache.shiro.realm.jndi;
    exports org.apache.shiro.realm.ldap;
    exports org.apache.shiro.realm.text;
    exports org.apache.shiro.session;
    exports org.apache.shiro.session.mgt;
    exports org.apache.shiro.session.mgt.eis;
    exports org.apache.shiro.subject;
    exports org.apache.shiro.subject.support;
    exports org.apache.shiro.util;
    exports org.neo4j.annotations;
    exports org.neo4j.annotations.api;
    exports org.neo4j.annotations.documented;
    exports org.neo4j.annotations.service;
    exports org.neo4j.bolt;
    exports org.neo4j.bolt.dbapi;
    exports org.neo4j.bolt.dbapi.impl;
    exports org.neo4j.bolt.messaging;
    exports org.neo4j.bolt.messaging.util;
    exports org.neo4j.bolt.packstream;
    exports org.neo4j.bolt.packstream.utf8;
    exports org.neo4j.bolt.routing;
    exports org.neo4j.bolt.runtime;
    exports org.neo4j.bolt.runtime.scheduling;
    exports org.neo4j.bolt.runtime.statemachine;
    exports org.neo4j.bolt.runtime.statemachine.impl;
    exports org.neo4j.bolt.security.auth;
    exports org.neo4j.bolt.transaction;
    exports org.neo4j.bolt.transport;
    exports org.neo4j.bolt.transport.configuration;
    exports org.neo4j.bolt.transport.pipeline;
    exports org.neo4j.bolt.txtracking;
    exports org.neo4j.bolt.v3;
    exports org.neo4j.bolt.v3.messaging;
    exports org.neo4j.bolt.v3.messaging.decoder;
    exports org.neo4j.bolt.v3.messaging.encoder;
    exports org.neo4j.bolt.v3.messaging.request;
    exports org.neo4j.bolt.v3.messaging.response;
    exports org.neo4j.bolt.v3.runtime;
    exports org.neo4j.bolt.v3.runtime.bookmarking;
    exports org.neo4j.bolt.v4;
    exports org.neo4j.bolt.v4.messaging;
    exports org.neo4j.bolt.v4.runtime;
    exports org.neo4j.bolt.v4.runtime.bookmarking;
    exports org.neo4j.bolt.v41;
    exports org.neo4j.bolt.v41.messaging;
    exports org.neo4j.bolt.v41.messaging.decoder;
    exports org.neo4j.bolt.v41.messaging.request;
    exports org.neo4j.bolt.v41.runtime;
    exports org.neo4j.bolt.v42;
    exports org.neo4j.bolt.v43;
    exports org.neo4j.bolt.v43.messaging;
    exports org.neo4j.bolt.v43.messaging.decoder;
    exports org.neo4j.bolt.v43.messaging.request;
    exports org.neo4j.bolt.v43.runtime;
    exports org.neo4j.bolt.v44;
    exports org.neo4j.bolt.v44.messaging;
    exports org.neo4j.bolt.v44.messaging.decoder;
    exports org.neo4j.bolt.v44.messaging.request;
    exports org.neo4j.bolt.v44.runtime;
    exports org.neo4j.buffer;
    exports org.neo4j.capabilities;
    exports org.neo4j.cli;
    exports org.neo4j.codegen;
    exports org.neo4j.codegen.api;
    exports org.neo4j.codegen.asm;
    exports org.neo4j.codegen.asm.signature;
    exports org.neo4j.codegen.asm.tree;
    exports org.neo4j.codegen.asm.tree.analysis;
    exports org.neo4j.codegen.asm.util;
    exports org.neo4j.codegen.bytecode;
    exports org.neo4j.codegen.source;
    exports org.neo4j.collection;
    exports org.neo4j.collection.pool;
    exports org.neo4j.collection.trackable;
    exports org.neo4j.commandline;
    exports org.neo4j.commandline.admin.security;
    exports org.neo4j.commandline.dbms;
    exports org.neo4j.common;
    exports org.neo4j.configuration;
    exports org.neo4j.configuration.connectors;
    exports org.neo4j.configuration.database.readonly;
    exports org.neo4j.configuration.helpers;
    exports org.neo4j.configuration.pagecache;
    exports org.neo4j.configuration.ssl;
    exports org.neo4j.consistency;
    exports org.neo4j.consistency.checker;
    exports org.neo4j.consistency.checking;
    exports org.neo4j.consistency.checking.cache;
    exports org.neo4j.consistency.checking.full;
    exports org.neo4j.consistency.checking.index;
    exports org.neo4j.consistency.internal;
    exports org.neo4j.consistency.report;
    exports org.neo4j.consistency.statistics;
    exports org.neo4j.consistency.store;
    exports org.neo4j.consistency.store.synthetic;
    exports org.neo4j.consistency.storestatistics;
    exports org.neo4j.counts;
    exports org.neo4j.csv.reader;
    exports org.neo4j.cursor;
    exports org.neo4j.cypher;
    exports org.neo4j.cypher.internal;
    exports org.neo4j.cypher.internal.administration;
    exports org.neo4j.cypher.internal.ast;
    exports org.neo4j.cypher.internal.ast.factory;
    exports org.neo4j.cypher.internal.ast.factory.neo4j;
    exports org.neo4j.cypher.internal.ast.prettifier;
    exports org.neo4j.cypher.internal.ast.semantics;
    exports org.neo4j.cypher.internal.cache;
    exports org.neo4j.cypher.internal.collection;
    exports org.neo4j.cypher.internal.compiler;
    exports org.neo4j.cypher.internal.compiler.ast.convert.plannerQuery;
    exports org.neo4j.cypher.internal.compiler.common;
    exports org.neo4j.cypher.internal.compiler.helpers;
    exports org.neo4j.cypher.internal.compiler.phases;
    exports org.neo4j.cypher.internal.compiler.planner;
    exports org.neo4j.cypher.internal.compiler.planner.logical;
    exports org.neo4j.cypher.internal.compiler.planner.logical.cardinality;
    exports org.neo4j.cypher.internal.compiler.planner.logical.cardinality.assumeIndependence;
    exports org.neo4j.cypher.internal.compiler.planner.logical.debug;
    exports org.neo4j.cypher.internal.compiler.planner.logical.idp;
    exports org.neo4j.cypher.internal.compiler.planner.logical.limit;
    exports org.neo4j.cypher.internal.compiler.planner.logical.ordering;
    exports org.neo4j.cypher.internal.compiler.planner.logical.plans;
    exports org.neo4j.cypher.internal.compiler.planner.logical.plans.rewriter;
    exports org.neo4j.cypher.internal.compiler.planner.logical.steps;
    exports org.neo4j.cypher.internal.compiler.planner.logical.steps.index;
    exports org.neo4j.cypher.internal.config;
    exports org.neo4j.cypher.internal.evaluator;
    exports org.neo4j.cypher.internal.expressions;
    exports org.neo4j.cypher.internal.expressions.functions;
    exports org.neo4j.cypher.internal.frontend;
    exports org.neo4j.cypher.internal.frontend.helpers;
    exports org.neo4j.cypher.internal.frontend.phases;
    exports org.neo4j.cypher.internal.frontend.phases.factories;
    exports org.neo4j.cypher.internal.frontend.phases.rewriting.cnf;
    exports org.neo4j.cypher.internal.ir;
    exports org.neo4j.cypher.internal.ir.helpers;
    exports org.neo4j.cypher.internal.ir.ordering;
    exports org.neo4j.cypher.internal.javacompat;
    exports org.neo4j.cypher.internal.logical.plans;
    exports org.neo4j.cypher.internal.macros;
    exports org.neo4j.cypher.internal.options;
    exports org.neo4j.cypher.internal.parser;
    exports org.neo4j.cypher.internal.parser.javacc;
    exports org.neo4j.cypher.internal.parser.matchers;
    exports org.neo4j.cypher.internal.plandescription;
    exports org.neo4j.cypher.internal.plandescription.rewrite;
    exports org.neo4j.cypher.internal.planner.spi;
    exports org.neo4j.cypher.internal.planning;
    exports org.neo4j.cypher.internal.planning.notification;
    exports org.neo4j.cypher.internal.preparser.javacc;
    exports org.neo4j.cypher.internal.procs;
    exports org.neo4j.cypher.internal.profiling;
    exports org.neo4j.cypher.internal.result;
    exports org.neo4j.cypher.internal.result.string;
    exports org.neo4j.cypher.internal.rewriting;
    exports org.neo4j.cypher.internal.rewriting.conditions;
    exports org.neo4j.cypher.internal.rewriting.rewriters;
    exports org.neo4j.cypher.internal.rewriting.rewriters.factories;
    exports org.neo4j.cypher.internal.runtime;
    exports org.neo4j.cypher.internal.runtime.ast;
    exports org.neo4j.cypher.internal.runtime.debug;
    exports org.neo4j.cypher.internal.runtime.interpreted;
    exports org.neo4j.cypher.internal.runtime.interpreted.commands;
    exports org.neo4j.cypher.internal.runtime.interpreted.commands.convert;
    exports org.neo4j.cypher.internal.runtime.interpreted.commands.expressions;
    exports org.neo4j.cypher.internal.runtime.interpreted.commands.predicates;
    exports org.neo4j.cypher.internal.runtime.interpreted.commands.showcommands;
    exports org.neo4j.cypher.internal.runtime.interpreted.commands.values;
    exports org.neo4j.cypher.internal.runtime.interpreted.load_csv;
    exports org.neo4j.cypher.internal.runtime.interpreted.pipes;
    exports org.neo4j.cypher.internal.runtime.interpreted.pipes.aggregation;
    exports org.neo4j.cypher.internal.runtime.interpreted.profiler;
    exports org.neo4j.cypher.internal.runtime.memory;
    exports org.neo4j.cypher.internal.runtime.scheduling;
    exports org.neo4j.cypher.internal.security;
    exports org.neo4j.cypher.internal.spi;
    exports org.neo4j.cypher.internal.tracing;
    exports org.neo4j.cypher.internal.util;
    exports org.neo4j.cypher.internal.util.attribution;
    exports org.neo4j.cypher.internal.util.helpers;
    exports org.neo4j.cypher.internal.util.symbols;
    exports org.neo4j.cypher.operations;
    exports org.neo4j.cypher.rendering;
    exports org.neo4j.cypher.result;
    exports org.neo4j.dbms;
    exports org.neo4j.dbms.api;
    exports org.neo4j.dbms.archive;
    exports org.neo4j.dbms.archive.printer;
    exports org.neo4j.dbms.database;
    exports org.neo4j.dbms.database.readonly;
    exports org.neo4j.dbms.diagnostics.jmx;
    exports org.neo4j.dbms.identity;
    exports org.neo4j.dbms.procedures;
    exports org.neo4j.dbms.systemgraph;
    exports org.neo4j.dbms.systemgraph.versions;
    exports org.neo4j.exceptions;
    exports org.neo4j.fabric;
    exports org.neo4j.fabric.bolt;
    exports org.neo4j.fabric.bookmark;
    exports org.neo4j.fabric.bootstrap;
    exports org.neo4j.fabric.cache;
    exports org.neo4j.fabric.config;
    exports org.neo4j.fabric.eval;
    exports org.neo4j.fabric.executor;
    exports org.neo4j.fabric.pipeline;
    exports org.neo4j.fabric.planning;
    exports org.neo4j.fabric.stream;
    exports org.neo4j.fabric.stream.summary;
    exports org.neo4j.fabric.transaction;
    exports org.neo4j.fabric.util;
    exports org.neo4j.function;
    exports org.neo4j.gis.spatial.index;
    exports org.neo4j.gis.spatial.index.curves;
    exports org.neo4j.graphalgo;
    exports org.neo4j.graphalgo.impl.path;
    exports org.neo4j.graphalgo.impl.shortestpath;
    exports org.neo4j.graphalgo.impl.util;
    exports org.neo4j.graphdb;
    exports org.neo4j.graphdb.config;
    exports org.neo4j.graphdb.event;
    exports org.neo4j.graphdb.facade;
    exports org.neo4j.graphdb.factory;
    exports org.neo4j.graphdb.factory.module;
    exports org.neo4j.graphdb.factory.module.edition;
    exports org.neo4j.graphdb.factory.module.edition.context;
    exports org.neo4j.graphdb.factory.module.id;
    exports org.neo4j.graphdb.impl;
    exports org.neo4j.graphdb.impl.notification;
    exports org.neo4j.graphdb.impl.traversal;
    exports org.neo4j.graphdb.schema;
    exports org.neo4j.graphdb.security;
    exports org.neo4j.graphdb.spatial;
    exports org.neo4j.graphdb.traversal;
    exports org.neo4j.hashing;
    exports org.neo4j.index.internal.gbptree;
    exports org.neo4j.internal.batchimport;
    exports org.neo4j.internal.batchimport.cache;
    exports org.neo4j.internal.batchimport.cache.idmapping;
    exports org.neo4j.internal.batchimport.cache.idmapping.string;
    exports org.neo4j.internal.batchimport.executor;
    exports org.neo4j.internal.batchimport.input;
    exports org.neo4j.internal.batchimport.input.csv;
    exports org.neo4j.internal.batchimport.staging;
    exports org.neo4j.internal.batchimport.stats;
    exports org.neo4j.internal.batchimport.store;
    exports org.neo4j.internal.batchimport.store.io;
    exports org.neo4j.internal.codec;
    exports org.neo4j.internal.collector;
    exports org.neo4j.internal.collector.extension;
    exports org.neo4j.internal.counts;
    exports org.neo4j.internal.diagnostics;
    exports org.neo4j.internal.helpers;
    exports org.neo4j.internal.helpers.collection;
    exports org.neo4j.internal.helpers.progress;
    exports org.neo4j.internal.id;
    exports org.neo4j.internal.id.indexed;
    exports org.neo4j.internal.kernel.api;
    exports org.neo4j.internal.kernel.api.connectioninfo;
    exports org.neo4j.internal.kernel.api.exceptions;
    exports org.neo4j.internal.kernel.api.exceptions.schema;
    exports org.neo4j.internal.kernel.api.helpers;
    exports org.neo4j.internal.kernel.api.procs;
    exports org.neo4j.internal.kernel.api.security;
    exports org.neo4j.internal.nativeimpl;
    exports org.neo4j.internal.recordstorage;
    exports org.neo4j.internal.recordstorage.legacy;
    exports org.neo4j.internal.schema;
    exports org.neo4j.internal.schema.constraints;
    exports org.neo4j.internal.unsafe;
    exports org.neo4j.internal.utils;
    exports org.neo4j.io;
    exports org.neo4j.io.bufferpool;
    exports org.neo4j.io.bufferpool.impl;
    exports org.neo4j.io.compress;
    exports org.neo4j.io.fs;
    exports org.neo4j.io.fs.watcher;
    exports org.neo4j.io.fs.watcher.resource;
    exports org.neo4j.io.layout;
    exports org.neo4j.io.layout.recordstorage;
    exports org.neo4j.io.marshal;
    exports org.neo4j.io.mem;
    exports org.neo4j.io.memory;
    exports org.neo4j.io.os;
    exports org.neo4j.io.pagecache;
    exports org.neo4j.io.pagecache.buffer;
    exports org.neo4j.io.pagecache.context;
    exports org.neo4j.io.pagecache.impl;
    exports org.neo4j.io.pagecache.impl.muninn;
    exports org.neo4j.io.pagecache.monitoring;
    exports org.neo4j.io.pagecache.tracing;
    exports org.neo4j.io.pagecache.tracing.cursor;
    exports org.neo4j.io.state;
    exports org.neo4j.kernel;
    exports org.neo4j.kernel.api;
    exports org.neo4j.kernel.api.database;
    exports org.neo4j.kernel.api.database.transaction;
    exports org.neo4j.kernel.api.exceptions;
    exports org.neo4j.kernel.api.exceptions.index;
    exports org.neo4j.kernel.api.exceptions.schema;
    exports org.neo4j.kernel.api.impl.fulltext;
    exports org.neo4j.kernel.api.impl.fulltext.analyzer;
    exports org.neo4j.kernel.api.impl.fulltext.analyzer.providers;
    exports org.neo4j.kernel.api.impl.index;
    exports org.neo4j.kernel.api.impl.index.backup;
    exports org.neo4j.kernel.api.impl.index.builder;
    exports org.neo4j.kernel.api.impl.index.collector;
    exports org.neo4j.kernel.api.impl.index.partition;
    exports org.neo4j.kernel.api.impl.index.sampler;
    exports org.neo4j.kernel.api.impl.index.storage;
    exports org.neo4j.kernel.api.impl.index.storage.layout;
    exports org.neo4j.kernel.api.impl.schema;
    exports org.neo4j.kernel.api.impl.schema.populator;
    exports org.neo4j.kernel.api.impl.schema.reader;
    exports org.neo4j.kernel.api.impl.schema.sampler;
    exports org.neo4j.kernel.api.impl.schema.verification;
    exports org.neo4j.kernel.api.impl.schema.writer;
    exports org.neo4j.kernel.api.index;
    exports org.neo4j.kernel.api.net;
    exports org.neo4j.kernel.api.procedure;
    exports org.neo4j.kernel.api.query;
    exports org.neo4j.kernel.api.security;
    exports org.neo4j.kernel.api.security.exception;
    exports org.neo4j.kernel.api.security.provider;
    exports org.neo4j.kernel.api.txstate;
    exports org.neo4j.kernel.availability;
    exports org.neo4j.kernel.database;
    exports org.neo4j.kernel.diagnostics;
    exports org.neo4j.kernel.diagnostics.providers;
    exports org.neo4j.kernel.extension;
    exports org.neo4j.kernel.extension.context;
    exports org.neo4j.kernel.impl.api;
    exports org.neo4j.kernel.impl.api.index;
    exports org.neo4j.kernel.impl.api.index.sampling;
    exports org.neo4j.kernel.impl.api.index.stats;
    exports org.neo4j.kernel.impl.api.index.updater;
    exports org.neo4j.kernel.impl.api.security;
    exports org.neo4j.kernel.impl.api.state;
    exports org.neo4j.kernel.impl.api.tracer;
    exports org.neo4j.kernel.impl.api.transaction.monitor;
    exports org.neo4j.kernel.impl.api.transaction.trace;
    exports org.neo4j.kernel.impl.cache;
    exports org.neo4j.kernel.impl.constraints;
    exports org.neo4j.kernel.impl.context;
    exports org.neo4j.kernel.impl.core;
    exports org.neo4j.kernel.impl.coreapi;
    exports org.neo4j.kernel.impl.coreapi.internal;
    exports org.neo4j.kernel.impl.coreapi.schema;
    exports org.neo4j.kernel.impl.factory;
    exports org.neo4j.kernel.impl.index.schema;
    exports org.neo4j.kernel.impl.index.schema.config;
    exports org.neo4j.kernel.impl.index.schema.fusion;
    exports org.neo4j.kernel.impl.locking;
    exports org.neo4j.kernel.impl.locking.forseti;
    exports org.neo4j.kernel.impl.newapi;
    exports org.neo4j.kernel.impl.pagecache;
    exports org.neo4j.kernel.impl.query;
    exports org.neo4j.kernel.impl.query.clientconnection;
    exports org.neo4j.kernel.impl.query.statistic;
    exports org.neo4j.kernel.impl.scheduler;
    exports org.neo4j.kernel.impl.security;
    exports org.neo4j.kernel.impl.store;
    exports org.neo4j.kernel.impl.store.allocator;
    exports org.neo4j.kernel.impl.store.cursor;
    exports org.neo4j.kernel.impl.store.format;
    exports org.neo4j.kernel.impl.store.format.aligned;
    exports org.neo4j.kernel.impl.store.format.standard;
    exports org.neo4j.kernel.impl.store.record;
    exports org.neo4j.kernel.impl.store.stats;
    exports org.neo4j.kernel.impl.storemigration;
    exports org.neo4j.kernel.impl.storemigration.legacy;
    exports org.neo4j.kernel.impl.transaction;
    exports org.neo4j.kernel.impl.transaction.log;
    exports org.neo4j.kernel.impl.transaction.log.checkpoint;
    exports org.neo4j.kernel.impl.transaction.log.checkpoint.volume;
    exports org.neo4j.kernel.impl.transaction.log.entry;
    exports org.neo4j.kernel.impl.transaction.log.files;
    exports org.neo4j.kernel.impl.transaction.log.files.checkpoint;
    exports org.neo4j.kernel.impl.transaction.log.pruning;
    exports org.neo4j.kernel.impl.transaction.log.reverse;
    exports org.neo4j.kernel.impl.transaction.log.rotation;
    exports org.neo4j.kernel.impl.transaction.log.rotation.monitor;
    exports org.neo4j.kernel.impl.transaction.state;
    exports org.neo4j.kernel.impl.transaction.state.storeview;
    exports org.neo4j.kernel.impl.transaction.stats;
    exports org.neo4j.kernel.impl.transaction.tracing;
    exports org.neo4j.kernel.impl.traversal;
    exports org.neo4j.kernel.impl.util;
    exports org.neo4j.kernel.impl.util.collection;
    exports org.neo4j.kernel.impl.util.diffsets;
    exports org.neo4j.kernel.impl.util.monitoring;
    exports org.neo4j.kernel.impl.util.watcher;
    exports org.neo4j.kernel.info;
    exports org.neo4j.kernel.internal;
    exports org.neo4j.kernel.internal.event;
    exports org.neo4j.kernel.internal.locker;
    exports org.neo4j.kernel.lifecycle;
    exports org.neo4j.kernel.monitoring;
    exports org.neo4j.kernel.monitoring.tracing;
    exports org.neo4j.kernel.recovery;
    exports org.neo4j.kernel.recovery.facade;
    exports org.neo4j.lock;
    exports org.neo4j.logging;
    exports org.neo4j.logging.internal;
    exports org.neo4j.logging.log4j;
    exports org.neo4j.logging.shaded.log4j;
    exports org.neo4j.logging.shaded.log4j.core;
    exports org.neo4j.logging.shaded.log4j.core.appender;
    exports org.neo4j.logging.shaded.log4j.core.appender.db;
    exports org.neo4j.logging.shaded.log4j.core.appender.db.jdbc;
    exports org.neo4j.logging.shaded.log4j.core.appender.mom;
    exports org.neo4j.logging.shaded.log4j.core.appender.mom.jeromq;
    exports org.neo4j.logging.shaded.log4j.core.appender.mom.kafka;
    exports org.neo4j.logging.shaded.log4j.core.appender.nosql;
    exports org.neo4j.logging.shaded.log4j.core.appender.rewrite;
    exports org.neo4j.logging.shaded.log4j.core.appender.rolling;
    exports org.neo4j.logging.shaded.log4j.core.appender.rolling.action;
    exports org.neo4j.logging.shaded.log4j.core.appender.routing;
    exports org.neo4j.logging.shaded.log4j.core.async;
    exports org.neo4j.logging.shaded.log4j.core.config;
    exports org.neo4j.logging.shaded.log4j.core.config.arbiters;
    exports org.neo4j.logging.shaded.log4j.core.config.builder.api;
    exports org.neo4j.logging.shaded.log4j.core.config.builder.impl;
    exports org.neo4j.logging.shaded.log4j.core.config.composite;
    exports org.neo4j.logging.shaded.log4j.core.config.json;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.convert;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.processor;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.util;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.validation;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.validation.constraints;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.validation.validators;
    exports org.neo4j.logging.shaded.log4j.core.config.plugins.visitors;
    exports org.neo4j.logging.shaded.log4j.core.config.properties;
    exports org.neo4j.logging.shaded.log4j.core.config.status;
    exports org.neo4j.logging.shaded.log4j.core.config.xml;
    exports org.neo4j.logging.shaded.log4j.core.config.yaml;
    exports org.neo4j.logging.shaded.log4j.core.filter;
    exports org.neo4j.logging.shaded.log4j.core.impl;
    exports org.neo4j.logging.shaded.log4j.core.jackson;
    exports org.neo4j.logging.shaded.log4j.core.jmx;
    exports org.neo4j.logging.shaded.log4j.core.layout;
    exports org.neo4j.logging.shaded.log4j.core.layout.internal;
    exports org.neo4j.logging.shaded.log4j.core.lookup;
    exports org.neo4j.logging.shaded.log4j.core.message;
    exports org.neo4j.logging.shaded.log4j.core.net;
    exports org.neo4j.logging.shaded.log4j.core.net.ssl;
    exports org.neo4j.logging.shaded.log4j.core.osgi;
    exports org.neo4j.logging.shaded.log4j.core.parser;
    exports org.neo4j.logging.shaded.log4j.core.pattern;
    exports org.neo4j.logging.shaded.log4j.core.script;
    exports org.neo4j.logging.shaded.log4j.core.selector;
    exports org.neo4j.logging.shaded.log4j.core.time;
    exports org.neo4j.logging.shaded.log4j.core.time.internal;
    exports org.neo4j.logging.shaded.log4j.core.tools;
    exports org.neo4j.logging.shaded.log4j.core.tools.picocli;
    exports org.neo4j.logging.shaded.log4j.core.util;
    exports org.neo4j.logging.shaded.log4j.core.util.datetime;
    exports org.neo4j.logging.shaded.log4j.internal;
    exports org.neo4j.logging.shaded.log4j.message;
    exports org.neo4j.logging.shaded.log4j.simple;
    exports org.neo4j.logging.shaded.log4j.spi;
    exports org.neo4j.logging.shaded.log4j.status;
    exports org.neo4j.logging.shaded.log4j.util;
    exports org.neo4j.memory;
    exports org.neo4j.messages;
    exports org.neo4j.monitoring;
    exports org.neo4j.procedure;
    exports org.neo4j.procedure.builtin;
    exports org.neo4j.procedure.builtin.routing;
    exports org.neo4j.procedure.impl;
    exports org.neo4j.procedure.impl.temporal;
    exports org.neo4j.resources;
    exports org.neo4j.scheduler;
    exports org.neo4j.server;
    exports org.neo4j.server.bind;
    exports org.neo4j.server.config;
    exports org.neo4j.server.configuration;
    exports org.neo4j.server.diagnostics;
    exports org.neo4j.server.helpers;
    exports org.neo4j.server.http;
    exports org.neo4j.server.http.cypher;
    exports org.neo4j.server.http.cypher.consumer;
    exports org.neo4j.server.http.cypher.entity;
    exports org.neo4j.server.http.cypher.format;
    exports org.neo4j.server.http.cypher.format.api;
    exports org.neo4j.server.http.cypher.format.common;
    exports org.neo4j.server.http.cypher.format.input.json;
    exports org.neo4j.server.http.cypher.format.jolt;
    exports org.neo4j.server.http.cypher.format.output.eventsource;
    exports org.neo4j.server.http.cypher.format.output.json;
    exports org.neo4j.server.http.error;
    exports org.neo4j.server.logging;
    exports org.neo4j.server.modules;
    exports org.neo4j.server.rest;
    exports org.neo4j.server.rest.dbms;
    exports org.neo4j.server.rest.discovery;
    exports org.neo4j.server.rest.domain;
    exports org.neo4j.server.rest.repr;
    exports org.neo4j.server.rest.repr.formats;
    exports org.neo4j.server.rest.web;
    exports org.neo4j.server.security.auth;
    exports org.neo4j.server.security.auth.exception;
    exports org.neo4j.server.security.ssl;
    exports org.neo4j.server.security.systemgraph;
    exports org.neo4j.server.security.systemgraph.versions;
    exports org.neo4j.server.startup;
    exports org.neo4j.server.web;
    exports org.neo4j.service;
    exports org.neo4j.ssl;
    exports org.neo4j.ssl.config;
    exports org.neo4j.storageengine;
    exports org.neo4j.storageengine.api;
    exports org.neo4j.storageengine.api.cursor;
    exports org.neo4j.storageengine.api.format;
    exports org.neo4j.storageengine.api.txstate;
    exports org.neo4j.storageengine.migration;
    exports org.neo4j.storageengine.util;
    exports org.neo4j.string;
    exports org.neo4j.time;
    exports org.neo4j.token;
    exports org.neo4j.token.api;
    exports org.neo4j.util;
    exports org.neo4j.util.concurrent;
    exports org.neo4j.values;
    exports org.neo4j.values.storable;
    exports org.neo4j.values.utils;
    exports org.neo4j.values.virtual;
    exports org.parboiled.scala;
    exports org.parboiled.scala.parserunners;
    exports org.parboiled.scala.rules;
    exports org.parboiled.scala.utils;
    exports org.tartarus.snowball;
    exports org.tartarus.snowball.ext;

    provides javax.annotation.processing.Processor with
            org.neo4j.annotations.service.ServiceAnnotationProcessor,
            org.neo4j.annotations.api.PublicApiAnnotationProcessor;
    provides org.apache.lucene.analysis.util.CharFilterFactory with
            org.apache.lucene.analysis.charfilter.HTMLStripCharFilterFactory,
            org.apache.lucene.analysis.charfilter.MappingCharFilterFactory,
            org.apache.lucene.analysis.cjk.CJKWidthCharFilterFactory,
            org.apache.lucene.analysis.fa.PersianCharFilterFactory,
            org.apache.lucene.analysis.pattern.PatternReplaceCharFilterFactory;
    provides org.apache.lucene.analysis.util.TokenFilterFactory with
            org.apache.lucene.analysis.tr.ApostropheFilterFactory,
            org.apache.lucene.analysis.ar.ArabicNormalizationFilterFactory,
            org.apache.lucene.analysis.ar.ArabicStemFilterFactory,
            org.apache.lucene.analysis.bg.BulgarianStemFilterFactory,
            org.apache.lucene.analysis.boost.DelimitedBoostTokenFilterFactory,
            org.apache.lucene.analysis.bn.BengaliNormalizationFilterFactory,
            org.apache.lucene.analysis.bn.BengaliStemFilterFactory,
            org.apache.lucene.analysis.br.BrazilianStemFilterFactory,
            org.apache.lucene.analysis.cjk.CJKBigramFilterFactory,
            org.apache.lucene.analysis.cjk.CJKWidthFilterFactory,
            org.apache.lucene.analysis.ckb.SoraniNormalizationFilterFactory,
            org.apache.lucene.analysis.ckb.SoraniStemFilterFactory,
            org.apache.lucene.analysis.commongrams.CommonGramsFilterFactory,
            org.apache.lucene.analysis.commongrams.CommonGramsQueryFilterFactory,
            org.apache.lucene.analysis.compound.DictionaryCompoundWordTokenFilterFactory,
            org.apache.lucene.analysis.compound.HyphenationCompoundWordTokenFilterFactory,
            org.apache.lucene.analysis.core.DecimalDigitFilterFactory,
            org.apache.lucene.analysis.core.LowerCaseFilterFactory,
            org.apache.lucene.analysis.core.StopFilterFactory,
            org.apache.lucene.analysis.core.TypeTokenFilterFactory,
            org.apache.lucene.analysis.core.UpperCaseFilterFactory,
            org.apache.lucene.analysis.cz.CzechStemFilterFactory,
            org.apache.lucene.analysis.de.GermanLightStemFilterFactory,
            org.apache.lucene.analysis.de.GermanMinimalStemFilterFactory,
            org.apache.lucene.analysis.de.GermanNormalizationFilterFactory,
            org.apache.lucene.analysis.de.GermanStemFilterFactory,
            org.apache.lucene.analysis.el.GreekLowerCaseFilterFactory,
            org.apache.lucene.analysis.el.GreekStemFilterFactory,
            org.apache.lucene.analysis.en.EnglishMinimalStemFilterFactory,
            org.apache.lucene.analysis.en.EnglishPossessiveFilterFactory,
            org.apache.lucene.analysis.en.KStemFilterFactory,
            org.apache.lucene.analysis.en.PorterStemFilterFactory,
            org.apache.lucene.analysis.es.SpanishLightStemFilterFactory,
            org.apache.lucene.analysis.es.SpanishMinimalStemFilterFactory,
            org.apache.lucene.analysis.fa.PersianNormalizationFilterFactory,
            org.apache.lucene.analysis.fi.FinnishLightStemFilterFactory,
            org.apache.lucene.analysis.fr.FrenchLightStemFilterFactory,
            org.apache.lucene.analysis.fr.FrenchMinimalStemFilterFactory,
            org.apache.lucene.analysis.ga.IrishLowerCaseFilterFactory,
            org.apache.lucene.analysis.gl.GalicianMinimalStemFilterFactory,
            org.apache.lucene.analysis.gl.GalicianStemFilterFactory,
            org.apache.lucene.analysis.hi.HindiNormalizationFilterFactory,
            org.apache.lucene.analysis.hi.HindiStemFilterFactory,
            org.apache.lucene.analysis.hu.HungarianLightStemFilterFactory,
            org.apache.lucene.analysis.hunspell.HunspellStemFilterFactory,
            org.apache.lucene.analysis.id.IndonesianStemFilterFactory,
            org.apache.lucene.analysis.in.IndicNormalizationFilterFactory,
            org.apache.lucene.analysis.it.ItalianLightStemFilterFactory,
            org.apache.lucene.analysis.lv.LatvianStemFilterFactory,
            org.apache.lucene.analysis.minhash.MinHashFilterFactory,
            org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilterFactory,
            org.apache.lucene.analysis.miscellaneous.CapitalizationFilterFactory,
            org.apache.lucene.analysis.miscellaneous.CodepointCountFilterFactory,
            org.apache.lucene.analysis.miscellaneous.ConcatenateGraphFilterFactory,
            org.apache.lucene.analysis.miscellaneous.DateRecognizerFilterFactory,
            org.apache.lucene.analysis.miscellaneous.DelimitedTermFrequencyTokenFilterFactory,
            org.apache.lucene.analysis.miscellaneous.DropIfFlaggedFilterFactory,
            org.apache.lucene.analysis.miscellaneous.FingerprintFilterFactory,
            org.apache.lucene.analysis.miscellaneous.FixBrokenOffsetsFilterFactory,
            org.apache.lucene.analysis.miscellaneous.HyphenatedWordsFilterFactory,
            org.apache.lucene.analysis.miscellaneous.KeepWordFilterFactory,
            org.apache.lucene.analysis.miscellaneous.KeywordMarkerFilterFactory,
            org.apache.lucene.analysis.miscellaneous.KeywordRepeatFilterFactory,
            org.apache.lucene.analysis.miscellaneous.LengthFilterFactory,
            org.apache.lucene.analysis.miscellaneous.LimitTokenCountFilterFactory,
            org.apache.lucene.analysis.miscellaneous.LimitTokenOffsetFilterFactory,
            org.apache.lucene.analysis.miscellaneous.LimitTokenPositionFilterFactory,
            org.apache.lucene.analysis.miscellaneous.RemoveDuplicatesTokenFilterFactory,
            org.apache.lucene.analysis.miscellaneous.StemmerOverrideFilterFactory,
            org.apache.lucene.analysis.miscellaneous.ProtectedTermFilterFactory,
            org.apache.lucene.analysis.miscellaneous.TrimFilterFactory,
            org.apache.lucene.analysis.miscellaneous.TruncateTokenFilterFactory,
            org.apache.lucene.analysis.miscellaneous.TypeAsSynonymFilterFactory,
            org.apache.lucene.analysis.miscellaneous.WordDelimiterFilterFactory,
            org.apache.lucene.analysis.miscellaneous.WordDelimiterGraphFilterFactory,
            org.apache.lucene.analysis.miscellaneous.ScandinavianFoldingFilterFactory,
            org.apache.lucene.analysis.miscellaneous.ScandinavianNormalizationFilterFactory,
            org.apache.lucene.analysis.ngram.EdgeNGramFilterFactory,
            org.apache.lucene.analysis.ngram.NGramFilterFactory,
            org.apache.lucene.analysis.no.NorwegianLightStemFilterFactory,
            org.apache.lucene.analysis.no.NorwegianMinimalStemFilterFactory,
            org.apache.lucene.analysis.pattern.PatternReplaceFilterFactory,
            org.apache.lucene.analysis.pattern.PatternCaptureGroupFilterFactory,
            org.apache.lucene.analysis.pattern.PatternTypingFilterFactory,
            org.apache.lucene.analysis.payloads.DelimitedPayloadTokenFilterFactory,
            org.apache.lucene.analysis.payloads.NumericPayloadTokenFilterFactory,
            org.apache.lucene.analysis.payloads.TokenOffsetPayloadTokenFilterFactory,
            org.apache.lucene.analysis.payloads.TypeAsPayloadTokenFilterFactory,
            org.apache.lucene.analysis.pt.PortugueseLightStemFilterFactory,
            org.apache.lucene.analysis.pt.PortugueseMinimalStemFilterFactory,
            org.apache.lucene.analysis.pt.PortugueseStemFilterFactory,
            org.apache.lucene.analysis.reverse.ReverseStringFilterFactory,
            org.apache.lucene.analysis.ru.RussianLightStemFilterFactory,
            org.apache.lucene.analysis.shingle.ShingleFilterFactory,
            org.apache.lucene.analysis.shingle.FixedShingleFilterFactory,
            org.apache.lucene.analysis.snowball.SnowballPorterFilterFactory,
            org.apache.lucene.analysis.sr.SerbianNormalizationFilterFactory,
            org.apache.lucene.analysis.standard.ClassicFilterFactory,
            org.apache.lucene.analysis.sv.SwedishLightStemFilterFactory,
            org.apache.lucene.analysis.synonym.SynonymFilterFactory,
            org.apache.lucene.analysis.synonym.SynonymGraphFilterFactory,
            org.apache.lucene.analysis.core.FlattenGraphFilterFactory,
            org.apache.lucene.analysis.tr.TurkishLowerCaseFilterFactory,
            org.apache.lucene.analysis.util.ElisionFilterFactory;
    provides org.apache.lucene.analysis.util.TokenizerFactory with
            org.apache.lucene.analysis.core.KeywordTokenizerFactory,
            org.apache.lucene.analysis.core.LetterTokenizerFactory,
            org.apache.lucene.analysis.core.WhitespaceTokenizerFactory,
            org.apache.lucene.analysis.ngram.EdgeNGramTokenizerFactory,
            org.apache.lucene.analysis.ngram.NGramTokenizerFactory,
            org.apache.lucene.analysis.path.PathHierarchyTokenizerFactory,
            org.apache.lucene.analysis.pattern.PatternTokenizerFactory,
            org.apache.lucene.analysis.pattern.SimplePatternSplitTokenizerFactory,
            org.apache.lucene.analysis.pattern.SimplePatternTokenizerFactory,
            org.apache.lucene.analysis.standard.ClassicTokenizerFactory,
            org.apache.lucene.analysis.standard.StandardTokenizerFactory,
            org.apache.lucene.analysis.standard.UAX29URLEmailTokenizerFactory,
            org.apache.lucene.analysis.th.ThaiTokenizerFactory,
            org.apache.lucene.analysis.wikipedia.WikipediaTokenizerFactory;
    provides org.apache.lucene.codecs.Codec with
            org.apache.lucene.codecs.lucene87.Lucene87Codec,
            org.apache.lucene.codecs.lucene70.Lucene70Codec,
            org.apache.lucene.codecs.lucene80.Lucene80Codec,
            org.apache.lucene.codecs.lucene84.Lucene84Codec,
            org.apache.lucene.codecs.lucene86.Lucene86Codec;
    provides org.apache.lucene.codecs.DocValuesFormat with
            org.apache.lucene.codecs.lucene80.Lucene80DocValuesFormat,
            org.apache.lucene.codecs.lucene70.Lucene70DocValuesFormat;
    provides org.apache.lucene.codecs.PostingsFormat with
            org.apache.lucene.codecs.lucene84.Lucene84PostingsFormat,
            org.apache.lucene.codecs.lucene50.Lucene50PostingsFormat;
    provides org.apache.lucene.index.SortFieldProvider with
            org.apache.lucene.search.SortField.Provider,
            org.apache.lucene.search.SortedNumericSortField.Provider,
            org.apache.lucene.search.SortedSetSortField.Provider;
    provides org.neo4j.capabilities.CapabilityDeclaration with
            org.neo4j.capabilities.DBMSCapabilities;
    provides org.neo4j.cli.CommandProvider with
            org.neo4j.consistency.CheckConsistencyCommandProvider,
            org.neo4j.commandline.dbms.DiagnosticsReportCommandProvider,
            org.neo4j.commandline.dbms.DumpCommandProvider,
            org.neo4j.commandline.dbms.LoadCommandProvider,
            org.neo4j.commandline.dbms.MemoryRecommendationsCommandProvider,
            org.neo4j.commandline.dbms.StoreInfoCommandProvider,
            org.neo4j.commandline.dbms.UnbindCommandProvider,
            org.neo4j.commandline.admin.security.SetDefaultAdminCommandProvider,
            org.neo4j.commandline.admin.security.SetInitialPasswordCommandProvider;
    provides org.neo4j.configuration.GroupSetting with
            org.neo4j.kernel.impl.index.schema.config.CrsConfig,
            org.neo4j.configuration.ssl.SslPolicyConfig;
    provides org.neo4j.configuration.SettingMigrator with
            org.neo4j.configuration.SettingMigrators.ActiveDatabaseMigrator,
            org.neo4j.configuration.SettingMigrators.AllowKeyGenerationMigrator,
            org.neo4j.configuration.SettingMigrators.ConnectorKeepAliveSettingsMigrator,
            org.neo4j.configuration.SettingMigrators.ConnectorMigrator,
            org.neo4j.configuration.SettingMigrators.ConsistencyCheckerSettingsMigrator,
            org.neo4j.configuration.SettingMigrators.CrsConfigMigrator,
            org.neo4j.configuration.SettingMigrators.DatababaseMigrator,
            org.neo4j.configuration.SettingMigrators.DatabaseMemoryMigrator,
            org.neo4j.configuration.SettingMigrators.DefaultAddressMigrator,
            org.neo4j.configuration.SettingMigrators.DefaultSchemaProviderMigrator,
            org.neo4j.configuration.SettingMigrators.ForsetiMigrator,
            org.neo4j.configuration.SettingMigrators.KillQueryVerboseMigrator,
            org.neo4j.configuration.SettingMigrators.LogFormatMigrator,
            org.neo4j.configuration.SettingMigrators.MultiThreadedSchemaIndexPopulationEnabledMigrator,
            org.neo4j.configuration.SettingMigrators.QueryLoggerMigrator,
            org.neo4j.configuration.SettingMigrators.ReadOnlyMigration,
            org.neo4j.configuration.SettingMigrators.RefuseToBeLeaderMigration,
            org.neo4j.configuration.SettingMigrators.SslPolicyMigrator,
            org.neo4j.configuration.SettingMigrators.WhitelistSettingsMigrator,
            org.neo4j.server.configuration.ServerSettingsMigrator;
    provides org.neo4j.configuration.SettingsDeclaration with
            org.neo4j.kernel.impl.index.schema.config.SpatialIndexSettings,
            org.neo4j.configuration.BootloaderSettings,
            org.neo4j.configuration.GraphDatabaseInternalSettings,
            org.neo4j.configuration.GraphDatabaseSettings,
            org.neo4j.configuration.connectors.BoltConnector,
            org.neo4j.configuration.connectors.BoltConnectorInternalSettings,
            org.neo4j.configuration.connectors.CommonConnectorConfig,
            org.neo4j.configuration.connectors.HttpConnector,
            org.neo4j.configuration.connectors.HttpsConnector,
            org.neo4j.fabric.config.FabricSettings,
            org.neo4j.kernel.api.impl.index.LuceneSettings,
            org.neo4j.configuration.FulltextSettings,
            org.neo4j.configuration.SslSystemInternalSettings,
            org.neo4j.configuration.SslSystemSettings,
            org.neo4j.server.configuration.ServerSettings,
            org.neo4j.capabilities.CapabilitiesSettings;
    provides org.neo4j.graphdb.schema.AnalyzerProvider with
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Arabic,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Armenian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Basque,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Brazilian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Bulgarian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.CJK,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Catalan,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Classic,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.CypherAnalyzerProvider,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Czech,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Danish,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Dutch,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.English,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Finnish,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.French,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Galician,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.German,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Greek,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Hindi,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Hungarian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Indonesian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Irish,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Italian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Keyword,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Latvian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Lithuanian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Norwegian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Persian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Portuguese,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Romanian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Russian,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Simple,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Sorani,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Spanish,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Standard,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.StandardFolding,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.StandardNoStopWords,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Stop,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Swedish,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Thai,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Turkish,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.UnicodeWhitespace,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.UrlOrEmail,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.UrlOrEmail.EmailAnalyzer,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.UrlOrEmail.UrlAnalyzer,
            org.neo4j.kernel.api.impl.fulltext.analyzer.providers.Whitespace;
    provides org.neo4j.internal.batchimport.BatchImporterFactory with
            org.neo4j.internal.batchimport.StandardBatchImporterFactory;
    provides org.neo4j.kernel.diagnostics.DiagnosticsOfflineReportProvider with
            org.neo4j.kernel.diagnostics.KernelDiagnosticsOfflineReportProvider,
            org.neo4j.server.diagnostics.ServerDiagnosticsOfflineReportProvider;
    provides org.neo4j.kernel.extension.ExtensionFactory with
            org.neo4j.internal.collector.extension.DataCollectorExtensionFactory;
    provides org.neo4j.kernel.impl.constraints.ConstraintSemantics with
            org.neo4j.kernel.impl.constraints.StandardConstraintSemantics;
    provides org.neo4j.kernel.impl.locking.LocksFactory with
            org.neo4j.kernel.impl.locking.forseti.ForsetiLocksFactory;
    provides org.neo4j.kernel.impl.pagecache.IOControllerService with
            org.neo4j.kernel.impl.pagecache.CommunityIOControllerService;
    provides org.neo4j.kernel.impl.store.format.RecordFormats.Factory with
            org.neo4j.kernel.impl.store.format.aligned.AlignedFormatFactory;
    provides org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThresholdPolicy with
            org.neo4j.kernel.impl.transaction.log.checkpoint.PeriodicThresholdPolicy,
            org.neo4j.kernel.impl.transaction.log.checkpoint.volume.VolumeThresholdPolicy;
    provides org.neo4j.kernel.monitoring.tracing.TracerFactory with
            org.neo4j.kernel.monitoring.tracing.DefaultTracerFactory;
    provides org.neo4j.logging.shaded.log4j.core.util.ContextDataProvider with
            org.neo4j.logging.shaded.log4j.core.impl.ThreadContextDataProvider;
    provides org.neo4j.logging.shaded.log4j.message.ThreadDumpMessage.ThreadInfoFactory with
            org.neo4j.logging.shaded.log4j.core.message.ExtendedThreadInfoFactory;
    provides org.neo4j.logging.shaded.log4j.spi.Provider with
            org.neo4j.logging.shaded.log4j.core.impl.Log4jProvider;
    provides org.neo4j.logging.shaded.log4j.util.PropertySource with
            org.neo4j.logging.shaded.log4j.util.EnvironmentPropertySource,
            org.neo4j.logging.shaded.log4j.util.SystemPropertiesPropertySource;
    provides org.neo4j.server.rest.repr.RepresentationFormat with
            org.neo4j.server.rest.repr.formats.JsonFormat;
    provides org.neo4j.server.startup.EntryPoint with
            org.neo4j.server.CommunityEntryPoint;
    provides org.neo4j.storageengine.api.StorageEngineFactory with
            org.neo4j.internal.recordstorage.RecordStorageEngineFactory;

    uses org.neo4j.configuration.SettingsDeclaration;
    uses org.neo4j.configuration.GroupSetting;
    uses org.neo4j.configuration.SettingMigrator;
    uses org.neo4j.kernel.extension.ExtensionFactory;
    uses org.neo4j.kernel.impl.pagecache.IOControllerService;
    uses org.neo4j.capabilities.CapabilityDeclaration;
    uses org.neo4j.capabilities.CapabilityProvider;
    uses org.neo4j.storageengine.api.StorageEngineFactory;
    uses org.neo4j.kernel.impl.locking.LocksFactory;
    uses org.neo4j.internal.batchimport.BatchImporterFactory;
    uses org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThresholdPolicy;
    uses org.neo4j.kernel.impl.store.format.RecordFormats$Factory;
    uses org.neo4j.kernel.impl.constraints.ConstraintSemantics;
}
