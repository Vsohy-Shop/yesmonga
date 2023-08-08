package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.BasketAmounts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.j */
public final class C38493j {

    /* renamed from: d */
    public static final int f97619d = 0;

    /* renamed from: a */
    public final boolean f97620a;
    @C12580l

    /* renamed from: b */
    public final BasketAmounts f97621b;

    /* renamed from: c */
    public final boolean f97622c;

    public C38493j(boolean z, @C12580l BasketAmounts basketAmounts, boolean z2) {
        this.f97620a = z;
        this.f97621b = basketAmounts;
        this.f97622c = z2;
    }

    /* renamed from: e */
    public static /* synthetic */ C38493j m159699e(C38493j jVar, boolean z, BasketAmounts basketAmounts, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = jVar.f97620a;
        }
        if ((i & 2) != 0) {
            basketAmounts = jVar.f97621b;
        }
        if ((i & 4) != 0) {
            z2 = jVar.f97622c;
        }
        return jVar.mo122092d(z, basketAmounts, z2);
    }

    /* renamed from: a */
    public final boolean mo122089a() {
        return this.f97620a;
    }

    @C12580l
    /* renamed from: b */
    public final BasketAmounts mo122090b() {
        return this.f97621b;
    }

    /* renamed from: c */
    public final boolean mo122091c() {
        return this.f97622c;
    }

    @C12579k
    /* renamed from: d */
    public final C38493j mo122092d(boolean z, @C12580l BasketAmounts basketAmounts, boolean z2) {
        return new C38493j(z, basketAmounts, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38493j)) {
            return false;
        }
        C38493j jVar = (C38493j) obj;
        return this.f97620a == jVar.f97620a && Intrinsics.areEqual((Object) this.f97621b, (Object) jVar.f97621b) && this.f97622c == jVar.f97622c;
    }

    /* renamed from: f */
    public final boolean mo122094f() {
        return this.f97622c;
    }

    @C12580l
    /* renamed from: g */
    public final BasketAmounts mo122095g() {
        return this.f97621b;
    }

    /* renamed from: h */
    public final boolean mo122096h() {
        return this.f97620a;
    }

    public int hashCode() {
        boolean z = this.f97620a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        BasketAmounts basketAmounts = this.f97621b;
        int hashCode = (i + (basketAmounts == null ? 0 : basketAmounts.hashCode())) * 31;
        boolean z3 = this.f97622c;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    @C12579k
    public String toString() {
        boolean z = this.f97620a;
        BasketAmounts basketAmounts = this.f97621b;
        boolean z2 = this.f97622c;
        return "LoyaltyUiModel(isLoyaltyActivated=" + z + ", loyaltyAmount=" + basketAmounts + ", hasFidCard=" + z2 + ")";
    }
}
