package com.google.firebase.events;

import com.google.firebase.components.C32576e0;

/* renamed from: com.google.firebase.events.a */
public class C33029a<T> {

    /* renamed from: a */
    public final Class<T> f80142a;

    /* renamed from: b */
    public final T f80143b;

    public C33029a(Class<T> cls, T t) {
        this.f80142a = (Class) C32576e0.m131619b(cls);
        this.f80143b = C32576e0.m131619b(t);
    }

    /* renamed from: a */
    public T mo95702a() {
        return this.f80143b;
    }

    /* renamed from: b */
    public Class<T> mo95703b() {
        return this.f80142a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f80142a, this.f80143b});
    }
}
