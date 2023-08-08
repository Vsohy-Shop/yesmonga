package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.h */
public class C9652h<T> {

    /* renamed from: a */
    public final Object f26461a;

    /* renamed from: b */
    public final C9656j f26462b;

    /* renamed from: c */
    public long f26463c;

    /* renamed from: d */
    public T f26464d;

    public C9652h() {
        this(C9656j.f26468a);
    }

    @C0363p0
    /* renamed from: a */
    public T mo19620a() {
        synchronized (this.f26461a) {
            if (this.f26462b.mo19623a() >= this.f26463c) {
                return null;
            }
            T t = this.f26464d;
            return t;
        }
    }

    /* renamed from: b */
    public void mo19621b() {
        synchronized (this.f26461a) {
            this.f26464d = null;
            this.f26463c = 0;
        }
    }

    /* renamed from: c */
    public void mo19622c(@C0363p0 T t, long j) {
        synchronized (this.f26461a) {
            this.f26464d = t;
            this.f26463c = this.f26462b.mo19623a() + j;
        }
    }

    public C9652h(@C0359n0 C9656j jVar) {
        this.f26461a = new Object();
        this.f26462b = jVar;
    }
}
