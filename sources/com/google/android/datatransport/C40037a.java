package com.google.android.datatransport;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.datatransport.a */
public final class C40037a<T> extends C40083d<T> {

    /* renamed from: a */
    public final Integer f102059a;

    /* renamed from: b */
    public final T f102060b;

    /* renamed from: c */
    public final Priority f102061c;

    public C40037a(@C0363p0 Integer num, T t, Priority priority) {
        this.f102059a = num;
        if (t != null) {
            this.f102060b = t;
            if (priority != null) {
                this.f102061c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @C0363p0
    /* renamed from: a */
    public Integer mo132543a() {
        return this.f102059a;
    }

    /* renamed from: b */
    public T mo132544b() {
        return this.f102060b;
    }

    /* renamed from: c */
    public Priority mo132545c() {
        return this.f102061c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40083d)) {
            return false;
        }
        C40083d dVar = (C40083d) obj;
        Integer num = this.f102059a;
        if (num != null ? num.equals(dVar.mo132543a()) : dVar.mo132543a() == null) {
            if (this.f102060b.equals(dVar.mo132544b()) && this.f102061c.equals(dVar.mo132545c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Integer num = this.f102059a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f102060b.hashCode()) * 1000003) ^ this.f102061c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f102059a + ", payload=" + this.f102060b + ", priority=" + this.f102061c + "}";
    }
}
