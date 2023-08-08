package androidx.datastore.core;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.datastore.core.b */
public final class C18568b<T> extends C18578j<T> {

    /* renamed from: a */
    public final T f47420a;

    /* renamed from: b */
    public final int f47421b;

    public C18568b(T t, int i) {
        super((DefaultConstructorMarker) null);
        this.f47420a = t;
        this.f47421b = i;
    }

    /* renamed from: a */
    public final void mo53576a() {
        T t = this.f47420a;
        boolean z = false;
        if ((t != null ? t.hashCode() : 0) == this.f47421b) {
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    /* renamed from: b */
    public final int mo53577b() {
        return this.f47421b;
    }

    /* renamed from: c */
    public final T mo53578c() {
        return this.f47420a;
    }
}
