package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import javax.annotation.CheckForNull;

final class zzbl extends zzbm {

    /* renamed from: c */
    public final transient int f72404c;

    /* renamed from: d */
    public final transient int f72405d;
    final /* synthetic */ zzbm zzc;

    public zzbl(zzbm zzbm, int i, int i2) {
        this.zzc = zzbm;
        this.f72404c = i;
        this.f72405d = i2;
    }

    public final Object get(int i) {
        C29997b.m121587a(i, this.f72405d, "index");
        return this.zzc.get(i + this.f72404c);
    }

    /* renamed from: h */
    public final int mo85448h() {
        return this.zzc.mo85449i() + this.f72404c + this.f72405d;
    }

    /* renamed from: i */
    public final int mo85449i() {
        return this.zzc.mo85449i() + this.f72404c;
    }

    @CheckForNull
    /* renamed from: q */
    public final Object[] mo85452q() {
        return this.zzc.mo85452q();
    }

    /* renamed from: r */
    public final zzbm mo85459r(int i, int i2) {
        C29997b.m121589c(i, i2, this.f72405d);
        zzbm zzbm = this.zzc;
        int i3 = this.f72404c;
        return zzbm.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f72405d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
