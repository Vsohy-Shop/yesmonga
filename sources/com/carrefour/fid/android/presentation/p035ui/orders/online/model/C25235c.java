package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.InfoProductsReplacementType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.c */
public final class C25235c implements C25237e {

    /* renamed from: e */
    public static final int f62213e = 8;
    @C12580l

    /* renamed from: a */
    public final String f62214a;

    /* renamed from: b */
    public int f62215b;

    /* renamed from: c */
    public final boolean f62216c;
    @C12579k

    /* renamed from: d */
    public final InfoProductsReplacementType f62217d;

    public C25235c() {
        this((String) null, 0, false, (InfoProductsReplacementType) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ C25235c m109196g(C25235c cVar, String str, int i, boolean z, InfoProductsReplacementType infoProductsReplacementType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.f62214a;
        }
        if ((i2 & 2) != 0) {
            i = cVar.f62215b;
        }
        if ((i2 & 4) != 0) {
            z = cVar.f62216c;
        }
        if ((i2 & 8) != 0) {
            infoProductsReplacementType = cVar.f62217d;
        }
        return cVar.mo73541f(str, i, z, infoProductsReplacementType);
    }

    @C12580l
    /* renamed from: a */
    public final String mo73536a() {
        return this.f62214a;
    }

    /* renamed from: b */
    public final int mo73537b() {
        return this.f62215b;
    }

    /* renamed from: d */
    public final boolean mo73538d() {
        return this.f62216c;
    }

    @C12579k
    /* renamed from: e */
    public final InfoProductsReplacementType mo73539e() {
        return this.f62217d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25235c)) {
            return false;
        }
        C25235c cVar = (C25235c) obj;
        return Intrinsics.areEqual((Object) this.f62214a, (Object) cVar.f62214a) && this.f62215b == cVar.f62215b && this.f62216c == cVar.f62216c && this.f62217d == cVar.f62217d;
    }

    @C12579k
    /* renamed from: f */
    public final C25235c mo73541f(@C12580l String str, int i, boolean z, @C12579k InfoProductsReplacementType infoProductsReplacementType) {
        Intrinsics.checkNotNullParameter(infoProductsReplacementType, "replacementType");
        return new C25235c(str, i, z, infoProductsReplacementType);
    }

    /* renamed from: h */
    public final int mo73542h() {
        return this.f62215b;
    }

    public int hashCode() {
        String str = this.f62214a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f62215b)) * 31;
        boolean z = this.f62216c;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f62217d.hashCode();
    }

    @C12580l
    /* renamed from: i */
    public final String mo73544i() {
        return this.f62214a;
    }

    @C12579k
    /* renamed from: j */
    public final InfoProductsReplacementType mo73545j() {
        return this.f62217d;
    }

    /* renamed from: k */
    public final boolean mo73546k() {
        return this.f62216c;
    }

    /* renamed from: l */
    public final void mo73547l(int i) {
        this.f62215b = i;
    }

    @C12579k
    public String toString() {
        String str = this.f62214a;
        int i = this.f62215b;
        boolean z = this.f62216c;
        InfoProductsReplacementType infoProductsReplacementType = this.f62217d;
        return "OrdersOnlineDetailsDepartmentModel(label=" + str + ", count=" + i + ", shouldDisplayMissingView=" + z + ", replacementType=" + infoProductsReplacementType + ")";
    }

    public C25235c(@C12580l String str, int i, boolean z, @C12579k InfoProductsReplacementType infoProductsReplacementType) {
        Intrinsics.checkNotNullParameter(infoProductsReplacementType, "replacementType");
        this.f62214a = str;
        this.f62215b = i;
        this.f62216c = z;
        this.f62217d = infoProductsReplacementType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25235c(String str, int i, boolean z, InfoProductsReplacementType infoProductsReplacementType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? InfoProductsReplacementType.Unknown : infoProductsReplacementType);
    }
}
