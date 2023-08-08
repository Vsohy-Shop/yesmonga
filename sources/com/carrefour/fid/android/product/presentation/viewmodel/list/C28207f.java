package com.carrefour.fid.android.product.presentation.viewmodel.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38184v;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.f */
public final class C28207f {

    /* renamed from: c */
    public static final int f68312c = 8;
    @C12579k

    /* renamed from: a */
    public final List<C38184v> f68313a;

    /* renamed from: b */
    public final boolean f68314b;

    public C28207f() {
        this((List) null, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C28207f m118087d(C28207f fVar, List<C38184v> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.f68313a;
        }
        if ((i & 2) != 0) {
            z = fVar.f68314b;
        }
        return fVar.mo82117c(list, z);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38184v> mo82115a() {
        return this.f68313a;
    }

    /* renamed from: b */
    public final boolean mo82116b() {
        return this.f68314b;
    }

    @C12579k
    /* renamed from: c */
    public final C28207f mo82117c(@C12579k List<? extends C38184v> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "products");
        return new C28207f(list, z);
    }

    @C12579k
    /* renamed from: e */
    public final List<C38184v> mo82118e() {
        return this.f68313a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28207f)) {
            return false;
        }
        C28207f fVar = (C28207f) obj;
        return Intrinsics.areEqual((Object) this.f68313a, (Object) fVar.f68313a) && this.f68314b == fVar.f68314b;
    }

    /* renamed from: f */
    public final boolean mo82120f() {
        return this.f68314b;
    }

    public int hashCode() {
        int hashCode = this.f68313a.hashCode() * 31;
        boolean z = this.f68314b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        List<C38184v> list = this.f68313a;
        boolean z = this.f68314b;
        return "ProductListUiState(products=" + list + ", showLoaderInList=" + z + ")";
    }

    public C28207f(@C12579k List<? extends C38184v> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "products");
        this.f68313a = list;
        this.f68314b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28207f(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? false : z);
    }
}
