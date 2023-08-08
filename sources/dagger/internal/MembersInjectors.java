package dagger.internal;

import dagger.C10158g;

public final class MembersInjectors {

    public enum NoOpMembersInjector implements C10158g<Object> {
        INSTANCE;

        public void injectMembers(Object obj) {
            C10335o.m38551c(obj, "Cannot inject members into a null reference");
        }
    }

    /* renamed from: a */
    public static <T> C10158g<T> m38511a() {
        return NoOpMembersInjector.INSTANCE;
    }
}
