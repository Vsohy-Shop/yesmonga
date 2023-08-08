package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
public final class C42167s implements Iterator {

    /* renamed from: a */
    public int f106392a = 0;

    /* renamed from: b */
    public final /* synthetic */ C42201u f106393b;

    public C42167s(C42201u uVar) {
        this.f106393b = uVar;
    }

    public final boolean hasNext() {
        return this.f106392a < this.f106393b.f106436a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f106392a;
        if (i < this.f106393b.f106436a.length()) {
            this.f106392a = i + 1;
            return new C42201u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
