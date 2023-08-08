package com.carrefour.fid.android.presentation.viewmodels.order.refont.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a */
public final class C27077a {

    /* renamed from: e */
    public static final int f65819e = C28892e.f70778a;
    @C12579k

    /* renamed from: a */
    public final C28892e<List<OrdersOnlineItemModel>> f65820a;

    /* renamed from: b */
    public final boolean f65821b;

    /* renamed from: c */
    public final boolean f65822c;

    /* renamed from: d */
    public final boolean f65823d;

    public C27077a() {
        this((C28892e) null, false, false, false, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C27077a m114460f(C27077a aVar, C28892e<List<OrdersOnlineItemModel>> eVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = aVar.f65820a;
        }
        if ((i & 2) != 0) {
            z = aVar.f65821b;
        }
        if ((i & 4) != 0) {
            z2 = aVar.f65822c;
        }
        if ((i & 8) != 0) {
            z3 = aVar.f65823d;
        }
        return aVar.mo78663e(eVar, z, z2, z3);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<List<OrdersOnlineItemModel>> mo78659a() {
        return this.f65820a;
    }

    /* renamed from: b */
    public final boolean mo78660b() {
        return this.f65821b;
    }

    /* renamed from: c */
    public final boolean mo78661c() {
        return this.f65822c;
    }

    /* renamed from: d */
    public final boolean mo78662d() {
        return this.f65823d;
    }

    @C12579k
    /* renamed from: e */
    public final C27077a mo78663e(@C12579k C28892e<? extends List<OrdersOnlineItemModel>> eVar, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(eVar, "items");
        return new C27077a(eVar, z, z2, z3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27077a)) {
            return false;
        }
        C27077a aVar = (C27077a) obj;
        return Intrinsics.areEqual((Object) this.f65820a, (Object) aVar.f65820a) && this.f65821b == aVar.f65821b && this.f65822c == aVar.f65822c && this.f65823d == aVar.f65823d;
    }

    /* renamed from: g */
    public final boolean mo78665g() {
        return this.f65821b;
    }

    @C12579k
    /* renamed from: h */
    public final C28892e<List<OrdersOnlineItemModel>> mo78666h() {
        return this.f65820a;
    }

    public int hashCode() {
        int hashCode = this.f65820a.hashCode() * 31;
        boolean z = this.f65821b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f65822c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f65823d;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo78668i() {
        return this.f65823d;
    }

    /* renamed from: j */
    public final boolean mo78669j() {
        return this.f65822c;
    }

    @C12579k
    public String toString() {
        C28892e<List<OrdersOnlineItemModel>> eVar = this.f65820a;
        boolean z = this.f65821b;
        boolean z2 = this.f65822c;
        boolean z3 = this.f65823d;
        return "OrderOnlineUiState(items=" + eVar + ", hasNextPage=" + z + ", isRefreshing=" + z2 + ", isLoadingMore=" + z3 + ")";
    }

    public C27077a(@C12579k C28892e<? extends List<OrdersOnlineItemModel>> eVar, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(eVar, "items");
        this.f65820a = eVar;
        this.f65821b = z;
        this.f65822c = z2;
        this.f65823d = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27077a(C28892e eVar, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
