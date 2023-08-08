package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.a */
public final class C27854a {

    /* renamed from: a */
    public final int f67459a;
    @C12580l

    /* renamed from: b */
    public final Integer f67460b;

    /* renamed from: c */
    public final boolean f67461c;

    public C27854a(int i, @C12580l Integer num, boolean z) {
        this.f67459a = i;
        this.f67460b = num;
        this.f67461c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C27854a m116924e(C27854a aVar, int i, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f67459a;
        }
        if ((i2 & 2) != 0) {
            num = aVar.f67460b;
        }
        if ((i2 & 4) != 0) {
            z = aVar.f67461c;
        }
        return aVar.mo80924d(i, num, z);
    }

    /* renamed from: a */
    public final int mo80921a() {
        return this.f67459a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo80922b() {
        return this.f67460b;
    }

    /* renamed from: c */
    public final boolean mo80923c() {
        return this.f67461c;
    }

    @C12579k
    /* renamed from: d */
    public final C27854a mo80924d(int i, @C12580l Integer num, boolean z) {
        return new C27854a(i, num, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27854a)) {
            return false;
        }
        C27854a aVar = (C27854a) obj;
        return this.f67459a == aVar.f67459a && Intrinsics.areEqual((Object) this.f67460b, (Object) aVar.f67460b) && this.f67461c == aVar.f67461c;
    }

    /* renamed from: f */
    public final int mo80926f() {
        return this.f67459a;
    }

    @C12580l
    /* renamed from: g */
    public final Integer mo80927g() {
        return this.f67460b;
    }

    /* renamed from: h */
    public final boolean mo80928h() {
        return this.f67461c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f67459a) * 31;
        Integer num = this.f67460b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f67461c;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        int i = this.f67459a;
        Integer num = this.f67460b;
        boolean z = this.f67461c;
        return "BasketData(basketCount=" + i + ", basketItemQuantityToSell=" + num + ", isBasketLoading=" + z + ")";
    }
}
