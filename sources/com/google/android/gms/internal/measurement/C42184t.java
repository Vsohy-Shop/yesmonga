package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
public final class C42184t implements Iterator {

    /* renamed from: a */
    public int f106412a = 0;

    /* renamed from: b */
    public final /* synthetic */ C42201u f106413b;

    public C42184t(C42201u uVar) {
        this.f106413b = uVar;
    }

    public final boolean hasNext() {
        return this.f106412a < this.f106413b.f106436a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f106412a;
        C42201u uVar = this.f106413b;
        if (i < uVar.f106436a.length()) {
            String r = uVar.f106436a;
            this.f106412a = i + 1;
            return new C42201u(String.valueOf(r.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
