package com.carrefour.fid.android.catalogs.core.datastore;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.catalogs.core.datastore.a */
public final class C39390a {

    /* renamed from: b */
    public static final int f100729b = 0;

    /* renamed from: a */
    public final int f100730a;

    public C39390a(int i) {
        this.f100730a = i;
    }

    /* renamed from: c */
    public static /* synthetic */ C39390a m161418c(C39390a aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f100730a;
        }
        return aVar.mo130263b(i);
    }

    /* renamed from: a */
    public final int mo130262a() {
        return this.f100730a;
    }

    @C12579k
    /* renamed from: b */
    public final C39390a mo130263b(int i) {
        return new C39390a(i);
    }

    /* renamed from: d */
    public final int mo130264d() {
        return this.f100730a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39390a) && this.f100730a == ((C39390a) obj).f100730a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f100730a);
    }

    @C12579k
    public String toString() {
        int i = this.f100730a;
        return "CatalogPreferences(catalogLaunchCount=" + i + ")";
    }
}
