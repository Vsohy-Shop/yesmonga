package com.google.android.gms.internal.measurement;

import java.util.List;
import javax.annotation.CheckForNull;

final class zziz extends zzja {

    /* renamed from: d */
    public final transient int f106692d;

    /* renamed from: e */
    public final transient int f106693e;
    final /* synthetic */ zzja zzc;

    public zziz(zzja zzja, int i, int i2) {
        this.zzc = zzja;
        this.f106692d = i;
        this.f106693e = i2;
    }

    public final Object get(int i) {
        C42090n7.m170597a(i, this.f106693e, "index");
        return this.zzc.get(i + this.f106692d);
    }

    /* renamed from: h */
    public final int mo137555h() {
        return this.zzc.mo137556i() + this.f106692d + this.f106693e;
    }

    /* renamed from: i */
    public final int mo137556i() {
        return this.zzc.mo137556i() + this.f106692d;
    }

    @CheckForNull
    /* renamed from: q */
    public final Object[] mo137559q() {
        return this.zzc.mo137559q();
    }

    /* renamed from: r */
    public final zzja mo137566r(int i, int i2) {
        C42090n7.m170599c(i, i2, this.f106693e);
        zzja zzja = this.zzc;
        int i3 = this.f106692d;
        return zzja.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f106693e;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
