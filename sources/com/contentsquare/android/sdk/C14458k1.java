package com.contentsquare.android.sdk;

import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.k1 */
public final class C14458k1 {

    /* renamed from: a */
    public static final C14460b<Object> f35717a = new C14460b<>();

    /* renamed from: b */
    public static final C14459a<Object> f35718b = new C14459a<>();

    /* renamed from: c */
    public static final C14461c<Object> f35719c = new C14461c<>();

    /* renamed from: com.contentsquare.android.sdk.k1$a */
    public static final class C14459a<T> implements C14603p0<T, List<T>> {
        /* renamed from: a */
        public List<T> mo34472d(T t) {
            return Collections.singletonList(t);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k1$b */
    public static final class C14460b<T> implements C14603p0<C14210b5<T>, List<T>> {
        /* renamed from: a */
        public List<T> mo34472d(C14210b5<T> b5Var) {
            return b5Var.mo34653e();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k1$c */
    public static final class C14461c<T> implements C14603p0<C14210b5<List<T>>, List<T>> {
        /* renamed from: a */
        public List<T> mo34472d(C14210b5<List<T>> b5Var) {
            return b5Var.mo34659j() ? b5Var.mo34655g() : Collections.emptyList();
        }
    }

    /* renamed from: a */
    public static <T> C14603p0<T, T> m62280a() {
        return C14241c4.f35180b;
    }
}
