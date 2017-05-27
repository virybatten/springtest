--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.3
-- Dumped by pg_dump version 9.6.3

-- Started on 2017-05-26 19:08:20

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12387)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2166 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 186 (class 1259 OID 24612)
-- Name: employee1; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE employee1 (
    id integer NOT NULL,
    name character(50) DEFAULT NULL::bpchar,
    updatedate timestamp without time zone
);


ALTER TABLE employee1 OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 24610)
-- Name: employee1_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE employee1_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employee1_id_seq OWNER TO postgres;

--
-- TOC entry 2167 (class 0 OID 0)
-- Dependencies: 185
-- Name: employee1_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE employee1_id_seq OWNED BY employee1.id;


--
-- TOC entry 188 (class 1259 OID 24621)
-- Name: employee2; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE employee2 (
    id integer NOT NULL,
    name character(50) DEFAULT NULL::bpchar,
    updatedate timestamp without time zone,
    opinion character(50)
);


ALTER TABLE employee2 OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 24619)
-- Name: employee2_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE employee2_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employee2_id_seq OWNER TO postgres;

--
-- TOC entry 2168 (class 0 OID 0)
-- Dependencies: 187
-- Name: employee2_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE employee2_id_seq OWNED BY employee2.id;


--
-- TOC entry 190 (class 1259 OID 24630)
-- Name: employee3; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE employee3 (
    id integer NOT NULL,
    name character(50) DEFAULT NULL::bpchar,
    updatedate timestamp without time zone,
    departure integer
);


ALTER TABLE employee3 OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 24628)
-- Name: employee3_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE employee3_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employee3_id_seq OWNER TO postgres;

--
-- TOC entry 2169 (class 0 OID 0)
-- Dependencies: 189
-- Name: employee3_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE employee3_id_seq OWNED BY employee3.id;


--
-- TOC entry 192 (class 1259 OID 24640)
-- Name: employee4; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE employee4 (
    id integer NOT NULL,
    name character(50) DEFAULT NULL::bpchar,
    updatedate timestamp without time zone,
    status bit(1),
    level integer
);


ALTER TABLE employee4 OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 24638)
-- Name: employee4_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE employee4_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employee4_id_seq OWNER TO postgres;

--
-- TOC entry 2170 (class 0 OID 0)
-- Dependencies: 191
-- Name: employee4_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE employee4_id_seq OWNED BY employee4.id;


--
-- TOC entry 2019 (class 2604 OID 24615)
-- Name: employee1 id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee1 ALTER COLUMN id SET DEFAULT nextval('employee1_id_seq'::regclass);


--
-- TOC entry 2021 (class 2604 OID 24624)
-- Name: employee2 id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee2 ALTER COLUMN id SET DEFAULT nextval('employee2_id_seq'::regclass);


--
-- TOC entry 2023 (class 2604 OID 24633)
-- Name: employee3 id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee3 ALTER COLUMN id SET DEFAULT nextval('employee3_id_seq'::regclass);


--
-- TOC entry 2025 (class 2604 OID 24643)
-- Name: employee4 id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee4 ALTER COLUMN id SET DEFAULT nextval('employee4_id_seq'::regclass);


--
-- TOC entry 2153 (class 0 OID 24612)
-- Dependencies: 186
-- Data for Name: employee1; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY employee1 (id, name, updatedate) FROM stdin;
1	Ana                                               	2004-10-19 10:23:54
2	Alonso                                            	2004-10-21 00:00:00
3	Juan                                              	2004-10-20 00:00:00
\.


--
-- TOC entry 2171 (class 0 OID 0)
-- Dependencies: 185
-- Name: employee1_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('employee1_id_seq', 1, false);


--
-- TOC entry 2155 (class 0 OID 24621)
-- Dependencies: 188
-- Data for Name: employee2; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY employee2 (id, name, updatedate, opinion) FROM stdin;
1	Rosa                                              	2014-01-10 20:03:45	Good job!                                         
\.


--
-- TOC entry 2172 (class 0 OID 0)
-- Dependencies: 187
-- Name: employee2_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('employee2_id_seq', 1, false);


--
-- TOC entry 2157 (class 0 OID 24630)
-- Dependencies: 190
-- Data for Name: employee3; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY employee3 (id, name, updatedate, departure) FROM stdin;
1	Eduardo                                           	1998-12-16 10:02:50	5
\.


--
-- TOC entry 2173 (class 0 OID 0)
-- Dependencies: 189
-- Name: employee3_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('employee3_id_seq', 1, false);


--
-- TOC entry 2159 (class 0 OID 24640)
-- Dependencies: 192
-- Data for Name: employee4; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY employee4 (id, name, updatedate, status, level) FROM stdin;
1	Javier                                            	2008-01-25 13:22:12	1	1
3	Hugo                                              	2015-05-15 15:40:16	1	2
2	Veronica                                          	2010-10-15 13:22:12	0	4
\.


--
-- TOC entry 2174 (class 0 OID 0)
-- Dependencies: 191
-- Name: employee4_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('employee4_id_seq', 1, false);


--
-- TOC entry 2028 (class 2606 OID 24618)
-- Name: employee1 employee1_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee1
    ADD CONSTRAINT employee1_pkey PRIMARY KEY (id);


--
-- TOC entry 2030 (class 2606 OID 24627)
-- Name: employee2 employee2_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee2
    ADD CONSTRAINT employee2_pkey PRIMARY KEY (id);


--
-- TOC entry 2032 (class 2606 OID 24636)
-- Name: employee3 employee3_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee3
    ADD CONSTRAINT employee3_pkey PRIMARY KEY (id);


--
-- TOC entry 2034 (class 2606 OID 24646)
-- Name: employee4 employee4_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY employee4
    ADD CONSTRAINT employee4_pkey PRIMARY KEY (id);


-- Completed on 2017-05-26 19:08:20

--
-- PostgreSQL database dump complete
--

