package com.urbanairship.android.layout.util;

import androidx.annotation.RestrictTo;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.util.h */
public abstract class C35914h {

    /* renamed from: a */
    public final int f88805a;

    /* renamed from: b */
    public final int f88806b;

    /* renamed from: c */
    public final int f88807c;

    /* renamed from: d */
    public final int f88808d;

    public C35914h(int i, int i2, int i3, int i4) {
        this.f88805a = i;
        this.f88806b = i2;
        this.f88807c = i3;
        this.f88808d = i4;
    }

    /* renamed from: a */
    public int mo107567a() {
        return this.f88808d;
    }

    /* renamed from: b */
    public int mo107568b() {
        return this.f88805a;
    }

    /* renamed from: c */
    public int mo107569c() {
        return this.f88807c;
    }

    /* renamed from: d */
    public int mo107570d() {
        return this.f88806b;
    }

    public String toString() {
        return "InitialSpacing{left=" + this.f88805a + ", top=" + this.f88806b + ", right=" + this.f88807c + ", bottom=" + this.f88808d + C12361b.f30259j;
    }
}
