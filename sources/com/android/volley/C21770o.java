package com.android.volley;

/* renamed from: com.android.volley.o */
public abstract class C21770o<T> implements Runnable {

    /* renamed from: a */
    public final Request<T> f56323a;

    public C21770o(Request<T> request) {
        this.f56323a = request;
    }

    /* renamed from: a */
    public int mo64959a(C21770o<?> oVar) {
        return this.f56323a.compareTo(oVar.f56323a);
    }
}
