package com.google.firebase.encoders;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.encoders.c */
public final class C33000c {

    /* renamed from: a */
    public final String f80085a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f80086b;

    /* renamed from: com.google.firebase.encoders.c$b */
    public static final class C33002b {

        /* renamed from: a */
        public final String f80087a;

        /* renamed from: b */
        public Map<Class<?>, Object> f80088b = null;

        public C33002b(String str) {
            this.f80087a = str;
        }

        @C0359n0
        /* renamed from: a */
        public C33000c mo95636a() {
            Map map;
            String str = this.f80087a;
            if (this.f80088b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f80088b));
            }
            return new C33000c(str, map);
        }

        @C0359n0
        /* renamed from: b */
        public <T extends Annotation> C33002b mo95637b(@C0359n0 T t) {
            if (this.f80088b == null) {
                this.f80088b = new HashMap();
            }
            this.f80088b.put(t.annotationType(), t);
            return this;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C33002b m133160a(@C0359n0 String str) {
        return new C33002b(str);
    }

    @C0359n0
    /* renamed from: d */
    public static C33000c m133161d(@C0359n0 String str) {
        return new C33000c(str, Collections.emptyMap());
    }

    @C0359n0
    /* renamed from: b */
    public String mo95631b() {
        return this.f80085a;
    }

    @C0363p0
    /* renamed from: c */
    public <T extends Annotation> T mo95632c(@C0359n0 Class<T> cls) {
        return (Annotation) this.f80086b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33000c)) {
            return false;
        }
        C33000c cVar = (C33000c) obj;
        if (!this.f80085a.equals(cVar.f80085a) || !this.f80086b.equals(cVar.f80086b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f80085a.hashCode() * 31) + this.f80086b.hashCode();
    }

    @C0359n0
    public String toString() {
        return "FieldDescriptor{name=" + this.f80085a + ", properties=" + this.f80086b.values() + "}";
    }

    public C33000c(String str, Map<Class<?>, Object> map) {
        this.f80085a = str;
        this.f80086b = map;
    }
}
