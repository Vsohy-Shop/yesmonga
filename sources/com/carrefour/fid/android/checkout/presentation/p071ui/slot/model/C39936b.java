package com.carrefour.fid.android.checkout.presentation.p071ui.slot.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.model.b */
public final class C39936b implements C39938d {

    /* renamed from: d */
    public static final int f101839d = 0;

    /* renamed from: a */
    public final int f101840a;

    /* renamed from: b */
    public final boolean f101841b;
    @C12579k

    /* renamed from: c */
    public final String f101842c;

    public C39936b(int i, boolean z, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "startHourAvailable");
        this.f101840a = i;
        this.f101841b = z;
        this.f101842c = str;
    }

    /* renamed from: e */
    public static /* synthetic */ C39936b m162728e(C39936b bVar, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f101840a;
        }
        if ((i2 & 2) != 0) {
            z = bVar.f101841b;
        }
        if ((i2 & 4) != 0) {
            str = bVar.f101842c;
        }
        return bVar.mo131682d(i, z, str);
    }

    /* renamed from: a */
    public final int mo131679a() {
        return this.f101840a;
    }

    /* renamed from: b */
    public final boolean mo131680b() {
        return this.f101841b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo131681c() {
        return this.f101842c;
    }

    @C12579k
    /* renamed from: d */
    public final C39936b mo131682d(int i, boolean z, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "startHourAvailable");
        return new C39936b(i, z, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39936b)) {
            return false;
        }
        C39936b bVar = (C39936b) obj;
        return this.f101840a == bVar.f101840a && this.f101841b == bVar.f101841b && Intrinsics.areEqual((Object) this.f101842c, (Object) bVar.f101842c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo131684f() {
        return this.f101842c;
    }

    /* renamed from: g */
    public final int mo131685g() {
        return this.f101840a;
    }

    /* renamed from: h */
    public final boolean mo131686h() {
        return this.f101841b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f101840a) * 31;
        boolean z = this.f101841b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f101842c.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.f101840a;
        boolean z = this.f101841b;
        String str = this.f101842c;
        return "ServiceSlotHeaderModel(viewType=" + i + ", isProductThresholdExceeded=" + z + ", startHourAvailable=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39936b(int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, str);
    }
}
