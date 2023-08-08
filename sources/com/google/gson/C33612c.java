package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.gson.c */
public final class C33612c {

    /* renamed from: a */
    public final Field f81765a;

    public C33612c(Field field) {
        C$Gson$Preconditions.checkNotNull(field);
        this.f81765a = field;
    }

    /* renamed from: a */
    public Object mo97453a(Object obj) throws IllegalAccessException {
        return this.f81765a.get(obj);
    }

    /* renamed from: b */
    public <T extends Annotation> T mo97454b(Class<T> cls) {
        return this.f81765a.getAnnotation(cls);
    }

    /* renamed from: c */
    public Collection<Annotation> mo97455c() {
        return Arrays.asList(this.f81765a.getAnnotations());
    }

    /* renamed from: d */
    public Class<?> mo97456d() {
        return this.f81765a.getType();
    }

    /* renamed from: e */
    public Type mo97457e() {
        return this.f81765a.getGenericType();
    }

    /* renamed from: f */
    public Class<?> mo97458f() {
        return this.f81765a.getDeclaringClass();
    }

    /* renamed from: g */
    public String mo97459g() {
        return this.f81765a.getName();
    }

    /* renamed from: h */
    public boolean mo97460h(int i) {
        return (i & this.f81765a.getModifiers()) != 0;
    }

    /* renamed from: i */
    public boolean mo97461i() {
        return this.f81765a.isSynthetic();
    }
}
