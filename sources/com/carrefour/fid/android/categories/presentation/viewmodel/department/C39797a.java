package com.carrefour.fid.android.categories.presentation.viewmodel.department;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.categories.presentation.viewmodel.department.a */
public final class C39797a {

    /* renamed from: d */
    public static final int f101550d = C28892e.f70778a;
    @C12579k

    /* renamed from: a */
    public final C28892e<List<ProductCategory>> f101551a;

    /* renamed from: b */
    public final boolean f101552b;

    /* renamed from: c */
    public final boolean f101553c;

    public C39797a() {
        this((C28892e) null, false, false, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C39797a m162366e(C39797a aVar, C28892e<List<ProductCategory>> eVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = aVar.f101551a;
        }
        if ((i & 2) != 0) {
            z = aVar.f101552b;
        }
        if ((i & 4) != 0) {
            z2 = aVar.f101553c;
        }
        return aVar.mo131213d(eVar, z, z2);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<List<ProductCategory>> mo131210a() {
        return this.f101551a;
    }

    /* renamed from: b */
    public final boolean mo131211b() {
        return this.f101552b;
    }

    /* renamed from: c */
    public final boolean mo131212c() {
        return this.f101553c;
    }

    @C12579k
    /* renamed from: d */
    public final C39797a mo131213d(@C12579k C28892e<? extends List<ProductCategory>> eVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eVar, "departmentListState");
        return new C39797a(eVar, z, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39797a)) {
            return false;
        }
        C39797a aVar = (C39797a) obj;
        return Intrinsics.areEqual((Object) this.f101551a, (Object) aVar.f101551a) && this.f101552b == aVar.f101552b && this.f101553c == aVar.f101553c;
    }

    @C12579k
    /* renamed from: f */
    public final C28892e<List<ProductCategory>> mo131215f() {
        return this.f101551a;
    }

    /* renamed from: g */
    public final boolean mo131216g() {
        return this.f101553c;
    }

    /* renamed from: h */
    public final boolean mo131217h() {
        return this.f101552b;
    }

    public int hashCode() {
        int hashCode = this.f101551a.hashCode() * 31;
        boolean z = this.f101552b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f101553c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @C12579k
    public String toString() {
        C28892e<List<ProductCategory>> eVar = this.f101551a;
        boolean z = this.f101552b;
        boolean z2 = this.f101553c;
        return "DepartmentsState(departmentListState=" + eVar + ", isCouponDisplayed=" + z + ", hasFidCard=" + z2 + ")";
    }

    public C39797a(@C12579k C28892e<? extends List<ProductCategory>> eVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eVar, "departmentListState");
        this.f101551a = eVar;
        this.f101552b = z;
        this.f101553c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39797a(C28892e eVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
