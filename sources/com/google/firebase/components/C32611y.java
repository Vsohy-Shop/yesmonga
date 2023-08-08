package com.google.firebase.components;

import androidx.annotation.C0344h1;
import com.google.firebase.inject.C33058b;

/* renamed from: com.google.firebase.components.y */
public class C32611y<T> implements C33058b<T> {

    /* renamed from: c */
    public static final Object f79114c = new Object();

    /* renamed from: a */
    public volatile Object f79115a = f79114c;

    /* renamed from: b */
    public volatile C33058b<T> f79116b;

    public C32611y(T t) {
        this.f79115a = t;
    }

    @C0344h1
    /* renamed from: a */
    public boolean mo94760a() {
        return this.f79115a != f79114c;
    }

    public T get() {
        T t = this.f79115a;
        T t2 = f79114c;
        if (t == t2) {
            synchronized (this) {
                t = this.f79115a;
                if (t == t2) {
                    t = this.f79116b.get();
                    this.f79115a = t;
                    this.f79116b = null;
                }
            }
        }
        return t;
    }

    public C32611y(C33058b<T> bVar) {
        this.f79116b = bVar;
    }
}
