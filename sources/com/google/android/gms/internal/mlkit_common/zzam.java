package com.google.android.gms.internal.mlkit_common;

import java.util.List;
import javax.annotation.CheckForNull;

final class zzam extends zzan {

    /* renamed from: c */
    public final transient int f107492c;

    /* renamed from: d */
    public final transient int f107493d;
    final /* synthetic */ zzan zzc;

    public zzam(zzan zzan, int i, int i2) {
        this.zzc = zzan;
        this.f107492c = i;
        this.f107493d = i2;
    }

    public final Object get(int i) {
        C42347e.m171459a(i, this.f107493d, "index");
        return this.zzc.get(i + this.f107492c);
    }

    /* renamed from: h */
    public final int mo137853h() {
        return this.zzc.mo137854i() + this.f107492c + this.f107493d;
    }

    /* renamed from: i */
    public final int mo137854i() {
        return this.zzc.mo137854i() + this.f107492c;
    }

    @CheckForNull
    /* renamed from: q */
    public final Object[] mo137857q() {
        return this.zzc.mo137857q();
    }

    /* renamed from: r */
    public final zzan mo137864r(int i, int i2) {
        C42347e.m171461c(i, i2, this.f107493d);
        zzan zzan = this.zzc;
        int i3 = this.f107492c;
        return zzan.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f107493d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
