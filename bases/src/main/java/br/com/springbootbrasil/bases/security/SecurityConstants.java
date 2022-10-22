package br.com.springbootbrasil.bases.security;

public class SecurityConstants {
    public static final String SECRET = "P1d6@qE6xsx9I*as55#r3zi503";
    public static final int EXPIRATION_TIME = 180_000 * 3; // milisec => 9 mins;
    public static final int EXPIRATION_TIME_REFRESH = 900_000 * 2; // milisec => 30 mins;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}