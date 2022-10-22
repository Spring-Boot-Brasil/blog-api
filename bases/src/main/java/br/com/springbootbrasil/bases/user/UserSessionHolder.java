package br.com.springbootbrasil.bases.user;

import br.com.springbootbrasil.bases.exception.BaseException;

public class UserSessionHolder {

    public static ThreadLocal<UserSession> context = new ThreadLocal<>();

    public static UserSession get() {
        if (context.get() != null) {
            return context.get();
        }
        throw new BaseException("user.not_authorized");
    }

    public static void set(UserSession user) {
        context.set(user);
    }

    public static void reset() {
        context.set(null);
        context.remove();
    }

}
