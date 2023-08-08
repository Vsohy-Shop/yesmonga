package com.google.android.gms.internal.location;

import java.util.List;

final class zzbr extends zzbs {

    /* renamed from: c */
    public final transient int f105965c;

    /* renamed from: d */
    public final transient int f105966d;
    final /* synthetic */ zzbs zzc;

    public zzbr(zzbs zzbs, int i, int i2) {
        this.zzc = zzbs;
        this.f105965c = i;
        this.f105966d = i2;
    }

    public final Object get(int i) {
        C41780k0.m169054a(i, this.f105966d, "index");
        return this.zzc.get(i + this.f105965c);
    }

    /* renamed from: h */
    public final Object[] mo136287h() {
        return this.zzc.mo136287h();
    }

    /* renamed from: i */
    public final int mo136288i() {
        return this.zzc.mo136288i() + this.f105965c;
    }

    /* renamed from: k */
    public final int mo136290k() {
        return this.zzc.mo136288i() + this.f105965c + this.f105966d;
    }

    /* renamed from: r */
    public final boolean mo136292r() {
        return true;
    }

    public final int size() {
        return this.f105966d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* renamed from: y */
    public final zzbs mo136302y(int i, int i2) {
        C41780k0.m169056c(i, i2, this.f105966d);
        zzbs zzbs = this.zzc;
        int i3 = this.f105965c;
        return zzbs.subList(i + i3, i2 + i3);
    }
}
