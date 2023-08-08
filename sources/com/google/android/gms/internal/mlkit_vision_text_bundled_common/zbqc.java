package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
import javax.annotation.CheckForNull;

final class zbqc extends zbqd {

    /* renamed from: c */
    public final transient int f71599c;

    /* renamed from: d */
    public final transient int f71600d;
    final /* synthetic */ zbqd zbc;

    public zbqc(zbqd zbqd, int i, int i2) {
        this.zbc = zbqd;
        this.f71599c = i;
        this.f71600d = i2;
    }

    public final Object get(int i) {
        C29679rr.m120993a(i, this.f71600d, "index");
        return this.zbc.get(i + this.f71599c);
    }

    /* renamed from: h */
    public final int mo84937h() {
        return this.zbc.mo84938i() + this.f71599c + this.f71600d;
    }

    /* renamed from: i */
    public final int mo84938i() {
        return this.zbc.mo84938i() + this.f71599c;
    }

    @CheckForNull
    /* renamed from: q */
    public final Object[] mo84941q() {
        return this.zbc.mo84941q();
    }

    /* renamed from: r */
    public final zbqd mo84948r(int i, int i2) {
        C29679rr.m120996d(i, i2, this.f71600d);
        zbqd zbqd = this.zbc;
        int i3 = this.f71599c;
        return zbqd.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f71600d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
