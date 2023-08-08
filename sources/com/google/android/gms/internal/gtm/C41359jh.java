package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.gtm.jh */
public final class C41359jh extends C41432mh {

    /* renamed from: a */
    public int f104712a = 0;

    /* renamed from: b */
    public final int f104713b;

    /* renamed from: c */
    public final /* synthetic */ zztd f104714c;

    public C41359jh(zztd zztd) {
        this.f104714c = zztd;
        this.f104713b = zztd.mo136144i();
    }

    public final boolean hasNext() {
        return this.f104712a < this.f104713b;
    }

    public final byte zza() {
        int i = this.f104712a;
        if (i < this.f104713b) {
            this.f104712a = i + 1;
            return this.f104714c.mo136143h(i);
        }
        throw new NoSuchElementException();
    }
}
