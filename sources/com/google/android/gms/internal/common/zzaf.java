package com.google.android.gms.internal.common;

import java.util.List;
import javax.annotation.CheckForNull;

final class zzaf extends zzag {

    /* renamed from: c */
    public final transient int f104410c;

    /* renamed from: d */
    public final transient int f104411d;
    final /* synthetic */ zzag zzc;

    public zzaf(zzag zzag, int i, int i2) {
        this.zzc = zzag;
        this.f104410c = i;
        this.f104411d = i2;
    }

    public final Object get(int i) {
        C41124z.m166998a(i, this.f104411d, "index");
        return this.zzc.get(i + this.f104410c);
    }

    /* renamed from: h */
    public final int mo134944h() {
        return this.zzc.mo134945i() + this.f104410c + this.f104411d;
    }

    /* renamed from: i */
    public final int mo134945i() {
        return this.zzc.mo134945i() + this.f104410c;
    }

    /* renamed from: r */
    public final boolean mo134949r() {
        return true;
    }

    public final int size() {
        return this.f104411d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @CheckForNull
    /* renamed from: w */
    public final Object[] mo134955w() {
        return this.zzc.mo134955w();
    }

    /* renamed from: y */
    public final zzag mo134959y(int i, int i2) {
        C41124z.m167000c(i, i2, this.f104411d);
        zzag zzag = this.zzc;
        int i3 = this.f104410c;
        return zzag.subList(i + i3, i2 + i3);
    }
}
