package com.google.android.datatransport;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.datatransport.c */
public final class C40041c {

    /* renamed from: a */
    public final String f102072a;

    public C40041c(@C0359n0 String str) {
        if (str != null) {
            this.f102072a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C40041c m163048b(@C0359n0 String str) {
        return new C40041c(str);
    }

    /* renamed from: a */
    public String mo132549a() {
        return this.f102072a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40041c)) {
            return false;
        }
        return this.f102072a.equals(((C40041c) obj).f102072a);
    }

    public int hashCode() {
        return this.f102072a.hashCode() ^ 1000003;
    }

    @C0359n0
    public String toString() {
        return "Encoding{name=\"" + this.f102072a + "\"}";
    }
}
