package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class zzjg extends zzjb {

    /* renamed from: c */
    public final transient Object f106707c;

    public zzjg(Object obj) {
        obj.getClass();
        this.f106707c = obj;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f106707c.equals(obj);
    }

    /* renamed from: e */
    public final int mo137554e(Object[] objArr, int i) {
        objArr[0] = this.f106707c;
        return 1;
    }

    public final int hashCode() {
        return this.f106707c.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C41858a8(this.f106707c);
    }

    /* renamed from: k */
    public final C41894c8 mo137558k() {
        return new C41858a8(this.f106707c);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f106707c.toString();
        return "[" + obj + "]";
    }
}
