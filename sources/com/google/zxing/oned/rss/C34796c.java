package com.google.zxing.oned.rss;

import com.google.zxing.C34762l;

/* renamed from: com.google.zxing.oned.rss.c */
public final class C34796c {

    /* renamed from: a */
    public final int f84426a;

    /* renamed from: b */
    public final int[] f84427b;

    /* renamed from: c */
    public final C34762l[] f84428c;

    public C34796c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f84426a = i;
        this.f84427b = iArr;
        float f = (float) i4;
        this.f84428c = new C34762l[]{new C34762l((float) i2, f), new C34762l((float) i3, f)};
    }

    /* renamed from: a */
    public C34762l[] mo102932a() {
        return this.f84428c;
    }

    /* renamed from: b */
    public int[] mo102933b() {
        return this.f84427b;
    }

    /* renamed from: c */
    public int mo102934c() {
        return this.f84426a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C34796c) && this.f84426a == ((C34796c) obj).f84426a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f84426a;
    }
}
