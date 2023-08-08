package com.carrefour.fid.android.product.presentation.models;

import com.carrefour.fid.android.domain.models.product.detail.C38106a;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.e */
public final class C27656e {
    @C12579k

    /* renamed from: a */
    public final C28892e<C38106a> f67181a;

    /* renamed from: b */
    public final int f67182b;
    @C12580l

    /* renamed from: c */
    public final Integer f67183c;

    /* renamed from: d */
    public final boolean f67184d;

    public C27656e() {
        this((C28892e) null, 0, (Integer) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C27656e m116349f(C27656e eVar, C28892e<C38106a> eVar2, int i, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar2 = eVar.f67181a;
        }
        if ((i2 & 2) != 0) {
            i = eVar.f67182b;
        }
        if ((i2 & 4) != 0) {
            num = eVar.f67183c;
        }
        if ((i2 & 8) != 0) {
            z = eVar.f67184d;
        }
        return eVar.mo80357e(eVar2, i, num, z);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<C38106a> mo80353a() {
        return this.f67181a;
    }

    /* renamed from: b */
    public final int mo80354b() {
        return this.f67182b;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo80355c() {
        return this.f67183c;
    }

    /* renamed from: d */
    public final boolean mo80356d() {
        return this.f67184d;
    }

    @C12579k
    /* renamed from: e */
    public final C27656e mo80357e(@C12579k C28892e<C38106a> eVar, int i, @C12580l Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "productAndOfferSelected");
        return new C27656e(eVar, i, num, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27656e)) {
            return false;
        }
        C27656e eVar = (C27656e) obj;
        return Intrinsics.areEqual((Object) this.f67181a, (Object) eVar.f67181a) && this.f67182b == eVar.f67182b && Intrinsics.areEqual((Object) this.f67183c, (Object) eVar.f67183c) && this.f67184d == eVar.f67184d;
    }

    /* renamed from: g */
    public final int mo80359g() {
        return this.f67182b;
    }

    @C12580l
    /* renamed from: h */
    public final Integer mo80360h() {
        return this.f67183c;
    }

    public int hashCode() {
        int hashCode = ((this.f67181a.hashCode() * 31) + Integer.hashCode(this.f67182b)) * 31;
        Integer num = this.f67183c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f67184d;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C28892e<C38106a> mo80362i() {
        return this.f67181a;
    }

    /* renamed from: j */
    public final boolean mo80363j() {
        return this.f67184d;
    }

    @C12579k
    public String toString() {
        C28892e<C38106a> eVar = this.f67181a;
        int i = this.f67182b;
        Integer num = this.f67183c;
        boolean z = this.f67184d;
        return "NonFoodProductDetailsModel(productAndOfferSelected=" + eVar + ", basketCount=" + i + ", basketItemQuantityToSell=" + num + ", isLoggedInAndSetted=" + z + ")";
    }

    public C27656e(@C12579k C28892e<C38106a> eVar, int i, @C12580l Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "productAndOfferSelected");
        this.f67181a = eVar;
        this.f67182b = i;
        this.f67183c = num;
        this.f67184d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27656e(C28892e eVar, int i, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? false : z);
    }
}
