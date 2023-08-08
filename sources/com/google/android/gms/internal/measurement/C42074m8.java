package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.m8 */
public final class C42074m8 extends C42108o8 {

    /* renamed from: a */
    public int f106293a = 0;

    /* renamed from: b */
    public final int f106294b;

    /* renamed from: c */
    public final /* synthetic */ zzka f106295c;

    public C42074m8(zzka zzka) {
        this.f106295c = zzka;
        this.f106294b = zzka.mo137593i();
    }

    public final boolean hasNext() {
        return this.f106293a < this.f106294b;
    }

    public final byte zza() {
        int i = this.f106293a;
        if (i < this.f106294b) {
            this.f106293a = i + 1;
            return this.f106295c.mo137592h(i);
        }
        throw new NoSuchElementException();
    }
}
