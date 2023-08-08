package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.presentation.p035ui.product.filter.ProductListFiltersFacetTermsFragment;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.facet.a */
public final class C28160a {
    @C12579k

    /* renamed from: a */
    public final C28892e<Facet> f68207a;
    @C12579k

    /* renamed from: b */
    public final C38104c f68208b;

    public C28160a() {
        this((C28892e) null, (C38104c) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C28160a m117888d(C28160a aVar, C28892e<Facet> eVar, C38104c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = aVar.f68207a;
        }
        if ((i & 2) != 0) {
            cVar = aVar.f68208b;
        }
        return aVar.mo81898c(eVar, cVar);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<Facet> mo81896a() {
        return this.f68207a;
    }

    @C12579k
    /* renamed from: b */
    public final C38104c mo81897b() {
        return this.f68208b;
    }

    @C12579k
    /* renamed from: c */
    public final C28160a mo81898c(@C12579k C28892e<Facet> eVar, @C12579k C38104c cVar) {
        Intrinsics.checkNotNullParameter(eVar, ProductListFiltersFacetTermsFragment.f62548f);
        Intrinsics.checkNotNullParameter(cVar, "currentFacetSelection");
        return new C28160a(eVar, cVar);
    }

    @C12579k
    /* renamed from: e */
    public final C38104c mo81899e() {
        return this.f68208b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28160a)) {
            return false;
        }
        C28160a aVar = (C28160a) obj;
        return Intrinsics.areEqual((Object) this.f68207a, (Object) aVar.f68207a) && Intrinsics.areEqual((Object) this.f68208b, (Object) aVar.f68208b);
    }

    @C12579k
    /* renamed from: f */
    public final C28892e<Facet> mo81901f() {
        return this.f68207a;
    }

    public int hashCode() {
        return (this.f68207a.hashCode() * 31) + this.f68208b.hashCode();
    }

    @C12579k
    public String toString() {
        C28892e<Facet> eVar = this.f68207a;
        C38104c cVar = this.f68208b;
        return "FacetState(facet=" + eVar + ", currentFacetSelection=" + cVar + ")";
    }

    public C28160a(@C12579k C28892e<Facet> eVar, @C12579k C38104c cVar) {
        Intrinsics.checkNotNullParameter(eVar, ProductListFiltersFacetTermsFragment.f62548f);
        Intrinsics.checkNotNullParameter(cVar, "currentFacetSelection");
        this.f68207a = eVar;
        this.f68208b = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28160a(C28892e eVar, C38104c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i & 2) != 0 ? new C38104c(CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E()) : cVar);
    }
}
