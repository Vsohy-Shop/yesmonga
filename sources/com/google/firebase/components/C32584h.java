package com.google.firebase.components;

import com.google.firebase.inject.C33056a;
import com.google.firebase.inject.C33058b;
import java.util.Set;

/* renamed from: com.google.firebase.components.h */
public interface C32584h {
    /* renamed from: a */
    <T> C33058b<T> mo94703a(C32578f0<T> f0Var);

    /* renamed from: c */
    <T> C33058b<Set<T>> mo94704c(Class<T> cls) {
        return mo94706e(C32578f0.m131624b(cls));
    }

    /* renamed from: d */
    <T> Set<T> mo94705d(C32578f0<T> f0Var) {
        return mo94706e(f0Var).get();
    }

    /* renamed from: e */
    <T> C33058b<Set<T>> mo94706e(C32578f0<T> f0Var);

    /* renamed from: f */
    <T> T mo94707f(C32578f0<T> f0Var) {
        C33058b<T> a = mo94703a(f0Var);
        if (a == null) {
            return null;
        }
        return a.get();
    }

    /* renamed from: g */
    <T> Set<T> mo94708g(Class<T> cls) {
        return mo94705d(C32578f0.m131624b(cls));
    }

    <T> T get(Class<T> cls) {
        return mo94707f(C32578f0.m131624b(cls));
    }

    /* renamed from: h */
    <T> C33058b<T> mo94710h(Class<T> cls) {
        return mo94703a(C32578f0.m131624b(cls));
    }

    /* renamed from: i */
    <T> C33056a<T> mo94711i(C32578f0<T> f0Var);

    /* renamed from: j */
    <T> C33056a<T> mo94712j(Class<T> cls) {
        return mo94711i(C32578f0.m131624b(cls));
    }
}
