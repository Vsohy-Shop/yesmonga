package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.C40131g;

public final class MembersInjectors {

    public enum NoOpMembersInjector implements C40131g<Object> {
        INSTANCE;

        public void injectMembers(Object obj) {
            C40153o.m163384c(obj, "Cannot inject members into a null reference");
        }
    }

    /* renamed from: a */
    public static <T> C40131g<T> m163344a() {
        return NoOpMembersInjector.INSTANCE;
    }
}
