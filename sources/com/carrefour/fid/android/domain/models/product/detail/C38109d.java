package com.carrefour.fid.android.domain.models.product.detail;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.detail.d */
public final class C38109d {
    @C12579k

    /* renamed from: a */
    public final C38107b f96388a;

    /* renamed from: b */
    public final int f96389b;

    /* renamed from: c */
    public final boolean f96390c;

    /* renamed from: d */
    public final boolean f96391d;

    /* renamed from: e */
    public final boolean f96392e;

    public C38109d(@C12579k C38107b bVar, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(bVar, "product");
        this.f96388a = bVar;
        this.f96389b = i;
        this.f96390c = z;
        this.f96391d = z2;
        this.f96392e = z3;
    }

    /* renamed from: g */
    public static /* synthetic */ C38109d m157613g(C38109d dVar, C38107b bVar, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar = dVar.f96388a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f96389b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = dVar.f96390c;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = dVar.f96391d;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = dVar.f96392e;
        }
        return dVar.mo118753f(bVar, i3, z4, z5, z3);
    }

    @C12579k
    /* renamed from: a */
    public final C38107b mo118747a() {
        return this.f96388a;
    }

    /* renamed from: b */
    public final int mo118748b() {
        return this.f96389b;
    }

    /* renamed from: c */
    public final boolean mo118749c() {
        return this.f96390c;
    }

    /* renamed from: d */
    public final boolean mo118750d() {
        return this.f96391d;
    }

    /* renamed from: e */
    public final boolean mo118751e() {
        return this.f96392e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38109d)) {
            return false;
        }
        C38109d dVar = (C38109d) obj;
        return Intrinsics.areEqual((Object) this.f96388a, (Object) dVar.f96388a) && this.f96389b == dVar.f96389b && this.f96390c == dVar.f96390c && this.f96391d == dVar.f96391d && this.f96392e == dVar.f96392e;
    }

    @C12579k
    /* renamed from: f */
    public final C38109d mo118753f(@C12579k C38107b bVar, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(bVar, "product");
        return new C38109d(bVar, i, z, z2, z3);
    }

    @C12579k
    /* renamed from: h */
    public final C38107b mo118754h() {
        return this.f96388a;
    }

    public int hashCode() {
        int hashCode = ((this.f96388a.hashCode() * 31) + Integer.hashCode(this.f96389b)) * 31;
        boolean z = this.f96390c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96391d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f96392e;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final int mo118756i() {
        return this.f96389b;
    }

    /* renamed from: j */
    public final boolean mo118757j() {
        return this.f96390c;
    }

    /* renamed from: k */
    public final boolean mo118758k() {
        return this.f96392e;
    }

    /* renamed from: l */
    public final boolean mo118759l() {
        return this.f96391d;
    }

    @C12579k
    public String toString() {
        C38107b bVar = this.f96388a;
        int i = this.f96389b;
        boolean z = this.f96390c;
        boolean z2 = this.f96391d;
        boolean z3 = this.f96392e;
        return "ProductDetailItemData(product=" + bVar + ", quantity=" + i + ", isInShoppingList=" + z + ", isSyncingInShoppingList=" + z2 + ", isSyncingInBasket=" + z3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38109d(C38107b bVar, int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3);
    }
}
