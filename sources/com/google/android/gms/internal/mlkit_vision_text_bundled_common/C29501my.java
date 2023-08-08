package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.my */
public final class C29501my extends C29575oy {

    /* renamed from: c */
    public final byte[] f71361c;

    /* renamed from: d */
    public int f71362d;

    /* renamed from: e */
    public int f71363e;

    /* renamed from: f */
    public int f71364f = Integer.MAX_VALUE;

    public /* synthetic */ C29501my(byte[] bArr, int i, int i2, boolean z, C29464ly lyVar) {
        super((C29538ny) null);
        this.f71361c = bArr;
        this.f71362d = 0;
    }

    /* renamed from: c */
    public final int mo84725c(int i) throws zbye {
        int i2 = this.f71364f;
        this.f71364f = 0;
        int i3 = this.f71362d + this.f71363e;
        this.f71362d = i3;
        if (i3 > 0) {
            this.f71363e = i3;
            this.f71362d = 0;
        } else {
            this.f71363e = 0;
        }
        return i2;
    }
}
