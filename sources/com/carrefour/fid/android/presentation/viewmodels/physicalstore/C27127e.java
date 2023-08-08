package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.e */
public final class C27127e {

    /* renamed from: c */
    public static final int f65971c = 0;
    @C12579k

    /* renamed from: a */
    public final C27116c f65972a;
    @C12579k

    /* renamed from: b */
    public final C27115b f65973b;

    public C27127e() {
        this((C27116c) null, (C27115b) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C27127e m114656d(C27127e eVar, C27116c cVar, C27115b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = eVar.f65972a;
        }
        if ((i & 2) != 0) {
            bVar = eVar.f65973b;
        }
        return eVar.mo78875c(cVar, bVar);
    }

    @C12579k
    /* renamed from: a */
    public final C27116c mo78873a() {
        return this.f65972a;
    }

    @C12579k
    /* renamed from: b */
    public final C27115b mo78874b() {
        return this.f65973b;
    }

    @C12579k
    /* renamed from: c */
    public final C27127e mo78875c(@C12579k C27116c cVar, @C12579k C27115b bVar) {
        Intrinsics.checkNotNullParameter(cVar, "storeServiceState");
        Intrinsics.checkNotNullParameter(bVar, "physicalStoreLoyaltyState");
        return new C27127e(cVar, bVar);
    }

    @C12579k
    /* renamed from: e */
    public final C27115b mo78876e() {
        return this.f65973b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27127e)) {
            return false;
        }
        C27127e eVar = (C27127e) obj;
        return Intrinsics.areEqual((Object) this.f65972a, (Object) eVar.f65972a) && Intrinsics.areEqual((Object) this.f65973b, (Object) eVar.f65973b);
    }

    @C12579k
    /* renamed from: f */
    public final C27116c mo78878f() {
        return this.f65972a;
    }

    public int hashCode() {
        return (this.f65972a.hashCode() * 31) + this.f65973b.hashCode();
    }

    @C12579k
    public String toString() {
        C27116c cVar = this.f65972a;
        C27115b bVar = this.f65973b;
        return "PhysicalStoreUiState(storeServiceState=" + cVar + ", physicalStoreLoyaltyState=" + bVar + ")";
    }

    public C27127e(@C12579k C27116c cVar, @C12579k C27115b bVar) {
        Intrinsics.checkNotNullParameter(cVar, "storeServiceState");
        Intrinsics.checkNotNullParameter(bVar, "physicalStoreLoyaltyState");
        this.f65972a = cVar;
        this.f65973b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27127e(C27116c cVar, C27115b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C27116c.C27118b.f65952a : cVar, (i & 2) != 0 ? new C27115b((C26501g) null, (C26497f) null, (C26487c) null, (C26505h) null, 15, (DefaultConstructorMarker) null) : bVar);
    }
}
