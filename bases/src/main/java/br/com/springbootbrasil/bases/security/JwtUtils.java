package br.com.springbootbrasil.bases.security;


import br.com.springbootbrasil.bases.BaseUser;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class JwtUtils {

    public static <T extends BaseUser> String generateToken(T usuario) {
        return JWT.create()
                .withSubject(usuario.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
                .sign(Algorithm.HMAC512(SecurityConstants.SECRET.getBytes()));
    }

    public static <T extends BaseUser> String generateRefreshToken(T usuario) {
        return JWT.create()
                .withSubject(usuario.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME_REFRESH))
                .withClaim("typ", "Refresh")
                .sign(Algorithm.HMAC512(SecurityConstants.SECRET.getBytes()));
    }

    public static String getSubFromToken(String token) {
        if (token == null)
            return null;
        return JWT.decode(token.replace("Bearer ", "")).getSubject();
    }

    public static boolean validateToken(String token) {
        return JWT.decode(token.replace("Bearer ", "")).getExpiresAt().after(new Date());
    }

}
