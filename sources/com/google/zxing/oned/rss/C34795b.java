package com.google.zxing.oned.rss;

/* renamed from: com.google.zxing.oned.rss.b */
public class C34795b {

    /* renamed from: a */
    public final int f84424a;

    /* renamed from: b */
    public final int f84425b;

    public C34795b(int i, int i2) {
        this.f84424a = i;
        this.f84425b = i2;
    }

    /* renamed from: a */
    public final int mo102927a() {
        return this.f84425b;
    }

    /* renamed from: b */
    public final int mo102928b() {
        return this.f84424a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34795b)) {
            return false;
        }
        C34795b bVar = (C34795b) obj;
        if (this.f84424a == bVar.f84424a && this.f84425b == bVar.f84425b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f84424a ^ this.f84425b;
    }

    public final String toString() {
        return this.f84424a + "(" + this.f84425b + ')';
    }
}
