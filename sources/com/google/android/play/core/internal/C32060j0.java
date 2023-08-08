package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/* renamed from: com.google.android.play.core.internal.j0 */
public final class C32060j0<T> {

    /* renamed from: a */
    public final Object f78271a;

    /* renamed from: b */
    public final Field f78272b;

    /* renamed from: c */
    public final Class<T> f78273c;

    public C32060j0(Object obj, Field field, Class<T> cls) {
        this.f78271a = obj;
        this.f78272b = field;
        this.f78273c = cls;
    }

    /* renamed from: a */
    public final T mo92769a() {
        try {
            return this.f78273c.cast(this.f78272b.get(this.f78271a));
        } catch (Exception e) {
            throw new C32036bi(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f78272b.getName(), this.f78271a.getClass().getName(), this.f78273c.getName()}), e);
        }
    }

    /* renamed from: b */
    public final void mo92770b(T t) {
        try {
            this.f78272b.set(this.f78271a, t);
        } catch (Exception e) {
            throw new C32036bi(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f78272b.getName(), this.f78271a.getClass().getName(), this.f78273c.getName()}), e);
        }
    }

    /* renamed from: c */
    public final Field mo92771c() {
        return this.f78272b;
    }

    /* renamed from: d */
    public void mo92772d(Collection collection) {
        Object[] objArr = (Object[]) mo92769a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(mo92774f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        mo92770b(objArr2);
    }

    /* renamed from: e */
    public void mo92773e(Collection collection) {
        Object[] objArr = (Object[]) mo92769a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(mo92774f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo92770b(objArr2);
    }

    /* renamed from: f */
    public final Class mo92774f() {
        return mo92771c().getType().getComponentType();
    }

    public C32060j0(Object obj, Field field, Class cls, byte[] bArr) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }
}
