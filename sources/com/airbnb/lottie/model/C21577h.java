package com.airbnb.lottie.model;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17994n;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.model.h */
public class C21577h<T> {
    @C0363p0

    /* renamed from: a */
    public T f55750a;
    @C0363p0

    /* renamed from: b */
    public T f55751b;

    /* renamed from: a */
    public static boolean m99431a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void mo64443b(T t, T t2) {
        this.f55750a = t;
        this.f55751b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17994n)) {
            return false;
        }
        C17994n nVar = (C17994n) obj;
        if (!m99431a(nVar.f46482a, this.f55750a) || !m99431a(nVar.f46483b, this.f55751b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f55750a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f55751b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f55750a) + " " + String.valueOf(this.f55751b) + "}";
    }
}
