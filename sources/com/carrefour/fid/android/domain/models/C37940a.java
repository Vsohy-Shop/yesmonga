package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.a */
public final class C37940a {

    /* renamed from: b */
    public static final int f95390b = 8;
    @C12579k

    /* renamed from: a */
    public final List<OfferProductDomain> f95391a;

    public C37940a() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C37940a m155831c(C37940a aVar, List<OfferProductDomain> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f95391a;
        }
        return aVar.mo116631b(list);
    }

    @C12579k
    /* renamed from: a */
    public final List<OfferProductDomain> mo116630a() {
        return this.f95391a;
    }

    @C12579k
    /* renamed from: b */
    public final C37940a mo116631b(@C12579k List<OfferProductDomain> list) {
        Intrinsics.checkNotNullParameter(list, "offers");
        return new C37940a(list);
    }

    @C12579k
    /* renamed from: d */
    public final List<OfferProductDomain> mo116632d() {
        return this.f95391a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37940a) && Intrinsics.areEqual((Object) this.f95391a, (Object) ((C37940a) obj).f95391a);
    }

    public int hashCode() {
        return this.f95391a.hashCode();
    }

    @C12579k
    public String toString() {
        List<OfferProductDomain> list = this.f95391a;
        return "BasketBuilderDomain(offers=" + list + ")";
    }

    public C37940a(@C12579k List<OfferProductDomain> list) {
        Intrinsics.checkNotNullParameter(list, "offers");
        this.f95391a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37940a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
