package com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.a */
public final class C26330a {

    /* renamed from: a */
    public final boolean f64341a;

    public C26330a() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C26330a m112387c(C26330a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f64341a;
        }
        return aVar.mo76602b(z);
    }

    /* renamed from: a */
    public final boolean mo76601a() {
        return this.f64341a;
    }

    @C12579k
    /* renamed from: b */
    public final C26330a mo76602b(boolean z) {
        return new C26330a(z);
    }

    /* renamed from: d */
    public final boolean mo76603d() {
        return this.f64341a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26330a) && this.f64341a == ((C26330a) obj).f64341a;
    }

    public int hashCode() {
        boolean z = this.f64341a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f64341a;
        return "ScanBarcodeUiState(onBoardingShown=" + z + ")";
    }

    public C26330a(boolean z) {
        this.f64341a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26330a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
