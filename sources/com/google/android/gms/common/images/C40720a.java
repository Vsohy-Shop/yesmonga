package com.google.android.gms.common.images;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.common.images.a */
public final class C40720a {

    /* renamed from: a */
    public final int f103722a;

    /* renamed from: b */
    public final int f103723b;

    public C40720a(int i, int i2) {
        this.f103722a = i;
        this.f103723b = i2;
    }

    @C0359n0
    /* renamed from: c */
    public static C40720a m165724c(@C0359n0 String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new C40720a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw m165725d(str);
                }
            } else {
                throw m165725d(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    /* renamed from: d */
    public static NumberFormatException m165725d(String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    /* renamed from: a */
    public int mo134247a() {
        return this.f103723b;
    }

    /* renamed from: b */
    public int mo134248b() {
        return this.f103722a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40720a) {
            C40720a aVar = (C40720a) obj;
            if (this.f103722a == aVar.f103722a && this.f103723b == aVar.f103723b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f103723b;
        int i2 = this.f103722a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @C0359n0
    public String toString() {
        int i = this.f103722a;
        int i2 = this.f103723b;
        return i + "x" + i2;
    }
}
