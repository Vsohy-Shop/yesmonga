package com.carrefour.fid.android.domain.models.accountmenu;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.accountmenu.a */
public final class C37950a {

    /* renamed from: a */
    public final boolean f95451a;

    /* renamed from: b */
    public final int f95452b;

    public C37950a(boolean z, int i) {
        this.f95451a = z;
        this.f95452b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C37950a m155961d(C37950a aVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = aVar.f95451a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.f95452b;
        }
        return aVar.mo116786c(z, i);
    }

    /* renamed from: a */
    public final boolean mo116784a() {
        return this.f95451a;
    }

    /* renamed from: b */
    public final int mo116785b() {
        return this.f95452b;
    }

    @C12579k
    /* renamed from: c */
    public final C37950a mo116786c(boolean z, int i) {
        return new C37950a(z, i);
    }

    /* renamed from: e */
    public final boolean mo116787e() {
        return this.f95451a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37950a)) {
            return false;
        }
        C37950a aVar = (C37950a) obj;
        return this.f95451a == aVar.f95451a && this.f95452b == aVar.f95452b;
    }

    /* renamed from: f */
    public final int mo116789f() {
        return this.f95452b;
    }

    public int hashCode() {
        boolean z = this.f95451a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + Integer.hashCode(this.f95452b);
    }

    @C12579k
    public String toString() {
        boolean z = this.f95451a;
        int i = this.f95452b;
        return "AirshipInbox(hasMessages=" + z + ", unreadMessageCount=" + i + ")";
    }
}
