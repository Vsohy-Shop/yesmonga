package com.carrefour.fid.android.domain.utilities;

import com.carrefour.fid.android.domain.models.criteo.C38001c;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.utilities.a */
public final class C38207a {
    @C12580l

    /* renamed from: a */
    public final C38001c f96774a;
    @C12580l

    /* renamed from: b */
    public final C38047a f96775b;

    public C38207a() {
        this((C38001c) null, (C38047a) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C38207a m158440d(C38207a aVar, C38001c cVar, C38047a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = aVar.f96774a;
        }
        if ((i & 2) != 0) {
            aVar2 = aVar.f96775b;
        }
        return aVar.mo119627c(cVar, aVar2);
    }

    @C12580l
    /* renamed from: a */
    public final C38001c mo119625a() {
        return this.f96774a;
    }

    @C12580l
    /* renamed from: b */
    public final C38047a mo119626b() {
        return this.f96775b;
    }

    @C12579k
    /* renamed from: c */
    public final C38207a mo119627c(@C12580l C38001c cVar, @C12580l C38047a aVar) {
        return new C38207a(cVar, aVar);
    }

    @C12580l
    /* renamed from: e */
    public final C38001c mo119628e() {
        return this.f96774a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38207a)) {
            return false;
        }
        C38207a aVar = (C38207a) obj;
        return Intrinsics.areEqual((Object) this.f96774a, (Object) aVar.f96774a) && Intrinsics.areEqual((Object) this.f96775b, (Object) aVar.f96775b);
    }

    @C12580l
    /* renamed from: f */
    public final C38047a mo119630f() {
        return this.f96775b;
    }

    public int hashCode() {
        C38001c cVar = this.f96774a;
        int i = 0;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        C38047a aVar = this.f96775b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        C38001c cVar = this.f96774a;
        C38047a aVar = this.f96775b;
        return "SponsoredItemsResult(criteoDomain=" + cVar + ", luckyCartBannerDetails=" + aVar + ")";
    }

    public C38207a(@C12580l C38001c cVar, @C12580l C38047a aVar) {
        this.f96774a = cVar;
        this.f96775b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38207a(C38001c cVar, C38047a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar);
    }
}
