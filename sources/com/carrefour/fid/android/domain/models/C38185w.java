package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28565n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.w */
public final class C38185w {

    /* renamed from: d */
    public static final int f96744d = 8;
    @C12579k

    /* renamed from: a */
    public final C38182t f96745a;
    @C12580l

    /* renamed from: b */
    public final List<C38040j> f96746b;
    @C12580l

    /* renamed from: c */
    public final List<OfferProductDomain> f96747c;

    public C38185w(@C12579k C38182t tVar, @C12580l List<C38040j> list, @C12580l List<OfferProductDomain> list2) {
        Intrinsics.checkNotNullParameter(tVar, C28565n.C28566a.f69613b);
        this.f96745a = tVar;
        this.f96746b = list;
        this.f96747c = list2;
    }

    /* renamed from: e */
    public static /* synthetic */ C38185w m158362e(C38185w wVar, C38182t tVar, List<C38040j> list, List<OfferProductDomain> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = wVar.f96745a;
        }
        if ((i & 2) != 0) {
            list = wVar.f96746b;
        }
        if ((i & 4) != 0) {
            list2 = wVar.f96747c;
        }
        return wVar.mo119577d(tVar, list, list2);
    }

    @C12579k
    /* renamed from: a */
    public final C38182t mo119574a() {
        return this.f96745a;
    }

    @C12580l
    /* renamed from: b */
    public final List<C38040j> mo119575b() {
        return this.f96746b;
    }

    @C12580l
    /* renamed from: c */
    public final List<OfferProductDomain> mo119576c() {
        return this.f96747c;
    }

    @C12579k
    /* renamed from: d */
    public final C38185w mo119577d(@C12579k C38182t tVar, @C12580l List<C38040j> list, @C12580l List<OfferProductDomain> list2) {
        Intrinsics.checkNotNullParameter(tVar, C28565n.C28566a.f69613b);
        return new C38185w(tVar, list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38185w)) {
            return false;
        }
        C38185w wVar = (C38185w) obj;
        return Intrinsics.areEqual((Object) this.f96745a, (Object) wVar.f96745a) && Intrinsics.areEqual((Object) this.f96746b, (Object) wVar.f96746b) && Intrinsics.areEqual((Object) this.f96747c, (Object) wVar.f96747c);
    }

    @C12580l
    /* renamed from: f */
    public final List<C38040j> mo119579f() {
        return this.f96746b;
    }

    @C12580l
    /* renamed from: g */
    public final List<OfferProductDomain> mo119580g() {
        return this.f96747c;
    }

    @C12579k
    /* renamed from: h */
    public final C38182t mo119581h() {
        return this.f96745a;
    }

    public int hashCode() {
        int hashCode = this.f96745a.hashCode() * 31;
        List<C38040j> list = this.f96746b;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<OfferProductDomain> list2 = this.f96747c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        C38182t tVar = this.f96745a;
        List<C38040j> list = this.f96746b;
        List<OfferProductDomain> list2 = this.f96747c;
        return "ProductsResultDomain(page=" + tVar + ", facets=" + list + ", offerList=" + list2 + ")";
    }
}
