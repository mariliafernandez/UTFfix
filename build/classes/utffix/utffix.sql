--CREATE DATABASE teste;

CREATE SEQUENCE public.init
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.chamado (
    abertura_chamado date,
    fechamento_chamado date,
    codigo_chamado integer DEFAULT nextval('public.init'::regclass) NOT NULL,
    local_chamado character varying(10),
    equipamento_chamado character varying(20),
    defeito_chamado character varying(100),
    CONSTRAINT chamado_pkey PRIMARY KEY (codigo_chamado),
    CONSTRAINT chamado_key UNIQUE (codigo_chamado)
);

CREATE TABLE public.equipamento (
    nome_equip character varying(50),
    id_equip integer DEFAULT nextval('public.init'::regclass) NOT NULL UNIQUE,
    codigo_equip character varying(10) NOT NULL
);

CREATE TABLE public.usuario (
    login_usuario character varying(20) NOT NULL,
    senha_usuario character varying(20) NOT NULL,
    nome_usuario character varying(50),
    tipo_usuario integer NOT NULL,
    codigo_usuario integer DEFAULT nextval('public.init'::regclass) NOT NULL,
    chamado_usuario integer,
    CONSTRAINT usuario_pkey PRIMARY KEY (codigo_usuario),
    CONSTRAINT usuario_codigo_usuario_key UNIQUE (codigo_usuario),
    CONSTRAINT usuario_login_usuario_key UNIQUE (login_usuario),
);



SELECT pg_catalog.setval('public.init', 18, true);


