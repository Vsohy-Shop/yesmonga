package com.carrefour.fid.android.product.domain.model;

import com.carrefour.fid.android.domain.models.product.detail.C38107b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.domain.model.d */
public final class C27586d {
    @C12579k

    /* renamed from: a */
    public final C38107b f67008a;
    @C12579k

    /* renamed from: b */
    public final List<C38107b> f67009b;

    public C27586d(@C12579k C38107b bVar, @C12579k List<? extends C38107b> list) {
        Intrinsics.checkNotNullParameter(bVar, "productDetail");
        Intrinsics.checkNotNullParameter(list, "mixedProducts");
        this.f67008a = bVar;
        this.f67009b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C27586d m116053d(C27586d dVar, C38107b bVar, List<C38107b> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = dVar.f67008a;
        }
        if ((i & 2) != 0) {
            list = dVar.f67009b;
        }
        return dVar.mo80092c(bVar, list);
    }

    @C12579k
    /* renamed from: a */
    public final C38107b mo80090a() {
        return this.f67008a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38107b> mo80091b() {
        return this.f67009b;
    }

    @C12579k
    /* renamed from: c */
    public final C27586d mo80092c(@C12579k C38107b bVar, @C12579k List<? extends C38107b> list) {
        Intrinsics.checkNotNullParameter(bVar, "productDetail");
        Intrinsics.checkNotNullParameter(list, "mixedProducts");
        return new C27586d(bVar, list);
    }

    @C12579k
    /* renamed from: e */
    public final List<C38107b> mo80093e() {
        return this.f67009b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27586d)) {
            return false;
        }
        C27586d dVar = (C27586d) obj;
        return Intrinsics.areEqual((Object) this.f67008a, (Object) dVar.f67008a) && Intrinsics.areEqual((Object) this.f67009b, (Object) dVar.f67009b);
    }

    @C12579k
    /* renamed from: f */
    public final C38107b mo80095f() {
        return this.f67008a;
    }

    public int hashCode() {
        return (this.f67008a.hashCode() * 31) + this.f67009b.hashCode();
    }

    @C12579k
    public String toString() {
        C38107b bVar = this.f67008a;
        List<C38107b> list = this.f67009b;
        return "ProductDetailResult(productDetail=" + bVar + ", mixedProducts=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27586d(C38107b bVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
