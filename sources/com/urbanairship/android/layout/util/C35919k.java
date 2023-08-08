package com.urbanairship.android.layout.util;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.util.k */
public final class C35919k {

    /* renamed from: a */
    public final int f88820a;

    /* renamed from: b */
    public final boolean f88821b;

    public C35919k(int i, boolean z) {
        this.f88820a = i;
        this.f88821b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ C35919k m148102d(C35919k kVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = kVar.f88820a;
        }
        if ((i2 & 2) != 0) {
            z = kVar.f88821b;
        }
        return kVar.mo107576c(i, z);
    }

    /* renamed from: a */
    public final int mo107574a() {
        return this.f88820a;
    }

    /* renamed from: b */
    public final boolean mo107575b() {
        return this.f88821b;
    }

    @C12579k
    /* renamed from: c */
    public final C35919k mo107576c(int i, boolean z) {
        return new C35919k(i, z);
    }

    /* renamed from: e */
    public final int mo107577e() {
        return this.f88820a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35919k)) {
            return false;
        }
        C35919k kVar = (C35919k) obj;
        return this.f88820a == kVar.f88820a && this.f88821b == kVar.f88821b;
    }

    /* renamed from: f */
    public final boolean mo107579f() {
        return this.f88821b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f88820a) * 31;
        boolean z = this.f88821b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        return "PagerScrollEvent(position=" + this.f88820a + ", isInternalScroll=" + this.f88821b + ')';
    }
}
