package com.google.firebase.components;

import java.lang.annotation.Annotation;

/* renamed from: com.google.firebase.components.f0 */
public final class C32578f0<T> {

    /* renamed from: a */
    public final Class<? extends Annotation> f79048a;

    /* renamed from: b */
    public final Class<T> f79049b;

    /* renamed from: com.google.firebase.components.f0$a */
    public @interface C32579a {
    }

    public C32578f0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f79048a = cls;
        this.f79049b = cls2;
    }

    /* renamed from: a */
    public static <T> C32578f0<T> m131623a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C32578f0<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> C32578f0<T> m131624b(Class<T> cls) {
        return new C32578f0<>(C32579a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32578f0.class != obj.getClass()) {
            return false;
        }
        C32578f0 f0Var = (C32578f0) obj;
        if (!this.f79049b.equals(f0Var.f79049b)) {
            return false;
        }
        return this.f79048a.equals(f0Var.f79048a);
    }

    public int hashCode() {
        return (this.f79049b.hashCode() * 31) + this.f79048a.hashCode();
    }

    public String toString() {
        if (this.f79048a == C32579a.class) {
            return this.f79049b.getName();
        }
        return "@" + this.f79048a.getName() + " " + this.f79049b.getName();
    }
}
