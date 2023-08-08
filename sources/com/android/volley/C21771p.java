package com.android.volley;

import androidx.annotation.C0363p0;
import com.android.volley.C21751e;

/* renamed from: com.android.volley.p */
public class C21771p<T> {
    @C0363p0

    /* renamed from: a */
    public final T f56324a;
    @C0363p0

    /* renamed from: b */
    public final C21751e.C21752a f56325b;
    @C0363p0

    /* renamed from: c */
    public final VolleyError f56326c;

    /* renamed from: d */
    public boolean f56327d;

    /* renamed from: com.android.volley.p$a */
    public interface C21772a {
        /* renamed from: c */
        void mo20312c(VolleyError volleyError);
    }

    /* renamed from: com.android.volley.p$b */
    public interface C21773b<T> {
        /* renamed from: b */
        void mo20311b(T t);
    }

    public C21771p(@C0363p0 T t, @C0363p0 C21751e.C21752a aVar) {
        this.f56327d = false;
        this.f56324a = t;
        this.f56325b = aVar;
        this.f56326c = null;
    }

    /* renamed from: a */
    public static <T> C21771p<T> m100086a(VolleyError volleyError) {
        return new C21771p<>(volleyError);
    }

    /* renamed from: c */
    public static <T> C21771p<T> m100087c(@C0363p0 T t, @C0363p0 C21751e.C21752a aVar) {
        return new C21771p<>(t, aVar);
    }

    /* renamed from: b */
    public boolean mo64960b() {
        return this.f56326c == null;
    }

    public C21771p(VolleyError volleyError) {
        this.f56327d = false;
        this.f56324a = null;
        this.f56325b = null;
        this.f56326c = volleyError;
    }
}
