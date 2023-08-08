package com.google.android.gms.internal.mlkit_vision_common;

import java.util.List;
import javax.annotation.CheckForNull;

final class zzn extends zzo {

    /* renamed from: c */
    public final transient int f100607c;

    /* renamed from: d */
    public final transient int f100608d;
    final /* synthetic */ zzo zzc;

    public zzn(zzo zzo, int i, int i2) {
        this.zzc = zzo;
        this.f100607c = i;
        this.f100608d = i2;
    }

    public final Object get(int i) {
        C39162f4.m161213a(i, this.f100608d, "index");
        return this.zzc.get(i + this.f100607c);
    }

    /* renamed from: h */
    public final int mo123377h() {
        return this.zzc.mo123378i() + this.f100607c + this.f100608d;
    }

    /* renamed from: i */
    public final int mo123378i() {
        return this.zzc.mo123378i() + this.f100607c;
    }

    @CheckForNull
    /* renamed from: q */
    public final Object[] mo123381q() {
        return this.zzc.mo123381q();
    }

    /* renamed from: r */
    public final zzo mo123388r(int i, int i2) {
        C39162f4.m161215c(i, i2, this.f100608d);
        zzo zzo = this.zzc;
        int i3 = this.f100607c;
        return zzo.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f100608d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
