package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import javax.annotation.CheckForNull;

final class zzcb extends zzcc {

    /* renamed from: c */
    public final transient int f98395c;

    /* renamed from: d */
    public final transient int f98396d;
    final /* synthetic */ zzcc zzc;

    public zzcb(zzcc zzcc, int i, int i2) {
        this.zzc = zzcc;
        this.f98395c = i;
        this.f98396d = i2;
    }

    public final Object get(int i) {
        C38728p.m160094a(i, this.f98396d, "index");
        return this.zzc.get(i + this.f98395c);
    }

    /* renamed from: h */
    public final int mo122630h() {
        return this.zzc.mo122631i() + this.f98395c + this.f98396d;
    }

    /* renamed from: i */
    public final int mo122631i() {
        return this.zzc.mo122631i() + this.f98395c;
    }

    @CheckForNull
    /* renamed from: q */
    public final Object[] mo122634q() {
        return this.zzc.mo122634q();
    }

    /* renamed from: r */
    public final zzcc mo122641r(int i, int i2) {
        C38728p.m160096c(i, i2, this.f98396d);
        zzcc zzcc = this.zzc;
        int i3 = this.f98395c;
        return zzcc.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f98396d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
