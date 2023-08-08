package com.airbnb.lottie.model;

import androidx.annotation.C0354l;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {

    /* renamed from: a */
    public final String f55576a;

    /* renamed from: b */
    public final String f55577b;

    /* renamed from: c */
    public final float f55578c;

    /* renamed from: d */
    public final Justification f55579d;

    /* renamed from: e */
    public final int f55580e;

    /* renamed from: f */
    public final float f55581f;

    /* renamed from: g */
    public final float f55582g;
    @C0354l

    /* renamed from: h */
    public final int f55583h;
    @C0354l

    /* renamed from: i */
    public final int f55584i;

    /* renamed from: j */
    public final float f55585j;

    /* renamed from: k */
    public final boolean f55586k;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, @C0354l int i2, @C0354l int i3, float f4, boolean z) {
        this.f55576a = str;
        this.f55577b = str2;
        this.f55578c = f;
        this.f55579d = justification;
        this.f55580e = i;
        this.f55581f = f2;
        this.f55582g = f3;
        this.f55583h = i2;
        this.f55584i = i3;
        this.f55585j = f4;
        this.f55586k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f55576a.hashCode() * 31) + this.f55577b.hashCode()) * 31)) + this.f55578c)) * 31) + this.f55579d.ordinal()) * 31) + this.f55580e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f55581f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f55583h;
    }
}
