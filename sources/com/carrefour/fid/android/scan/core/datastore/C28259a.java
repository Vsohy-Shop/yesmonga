package com.carrefour.fid.android.scan.core.datastore;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.scan.core.datastore.a */
public final class C28259a {

    /* renamed from: a */
    public final boolean f68410a;

    public C28259a(boolean z) {
        this.f68410a = z;
    }

    /* renamed from: c */
    public static /* synthetic */ C28259a m118177c(C28259a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f68410a;
        }
        return aVar.mo82199b(z);
    }

    /* renamed from: a */
    public final boolean mo82198a() {
        return this.f68410a;
    }

    @C12579k
    /* renamed from: b */
    public final C28259a mo82199b(boolean z) {
        return new C28259a(z);
    }

    /* renamed from: d */
    public final boolean mo82200d() {
        return this.f68410a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28259a) && this.f68410a == ((C28259a) obj).f68410a;
    }

    public int hashCode() {
        boolean z = this.f68410a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f68410a;
        return "ScanPreferences(scanTutorialShown=" + z + ")";
    }
}
