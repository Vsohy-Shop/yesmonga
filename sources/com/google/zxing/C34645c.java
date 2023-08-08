package com.google.zxing;

/* renamed from: com.google.zxing.c */
public final class C34645c {

    /* renamed from: a */
    public final int f83816a;

    /* renamed from: b */
    public final int f83817b;

    public C34645c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.f83816a = i;
        this.f83817b = i2;
    }

    /* renamed from: a */
    public int mo102487a() {
        return this.f83817b;
    }

    /* renamed from: b */
    public int mo102488b() {
        return this.f83816a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C34645c) {
            C34645c cVar = (C34645c) obj;
            if (this.f83816a == cVar.f83816a && this.f83817b == cVar.f83817b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f83816a * 32713) + this.f83817b;
    }

    public String toString() {
        return this.f83816a + "x" + this.f83817b;
    }
}
