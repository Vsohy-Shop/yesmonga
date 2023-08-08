package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a */
public final class C26132a {

    /* renamed from: g */
    public static final int f63885g = 0;

    /* renamed from: a */
    public final boolean f63886a;
    @C12579k

    /* renamed from: b */
    public final String f63887b;

    /* renamed from: c */
    public final double f63888c;

    /* renamed from: d */
    public final double f63889d;

    /* renamed from: e */
    public final boolean f63890e;

    /* renamed from: f */
    public final boolean f63891f;

    public C26132a(boolean z, @C12579k String str, double d, double d2, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        this.f63886a = z;
        this.f63887b = str;
        this.f63888c = d;
        this.f63889d = d2;
        this.f63890e = z2;
        this.f63891f = z3;
    }

    /* renamed from: h */
    public static /* synthetic */ C26132a m111703h(C26132a aVar, boolean z, String str, double d, double d2, boolean z2, boolean z3, int i, Object obj) {
        C26132a aVar2 = aVar;
        return aVar.mo75913g((i & 1) != 0 ? aVar2.f63886a : z, (i & 2) != 0 ? aVar2.f63887b : str, (i & 4) != 0 ? aVar2.f63888c : d, (i & 8) != 0 ? aVar2.f63889d : d2, (i & 16) != 0 ? aVar2.f63890e : z2, (i & 32) != 0 ? aVar2.f63891f : z3);
    }

    /* renamed from: a */
    public final boolean mo75906a() {
        return this.f63886a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo75907b() {
        return this.f63887b;
    }

    /* renamed from: c */
    public final double mo75908c() {
        return this.f63888c;
    }

    /* renamed from: d */
    public final double mo75909d() {
        return this.f63889d;
    }

    /* renamed from: e */
    public final boolean mo75910e() {
        return this.f63890e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26132a)) {
            return false;
        }
        C26132a aVar = (C26132a) obj;
        return this.f63886a == aVar.f63886a && Intrinsics.areEqual((Object) this.f63887b, (Object) aVar.f63887b) && Double.compare(this.f63888c, aVar.f63888c) == 0 && Double.compare(this.f63889d, aVar.f63889d) == 0 && this.f63890e == aVar.f63890e && this.f63891f == aVar.f63891f;
    }

    /* renamed from: f */
    public final boolean mo75912f() {
        return this.f63891f;
    }

    @C12579k
    /* renamed from: g */
    public final C26132a mo75913g(boolean z, @C12579k String str, double d, double d2, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        return new C26132a(z, str, d, d2, z2, z3);
    }

    public int hashCode() {
        boolean z = this.f63886a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((((z ? 1 : 0) * true) + this.f63887b.hashCode()) * 31) + Double.hashCode(this.f63888c)) * 31) + Double.hashCode(this.f63889d)) * 31;
        boolean z3 = this.f63890e;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f63891f;
        if (!z4) {
            z2 = z4;
        }
        return i + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final double mo75915i() {
        return this.f63889d;
    }

    /* renamed from: j */
    public final double mo75916j() {
        return this.f63888c;
    }

    @C12579k
    /* renamed from: k */
    public final String mo75917k() {
        return this.f63887b;
    }

    /* renamed from: l */
    public final boolean mo75918l() {
        return this.f63891f;
    }

    /* renamed from: m */
    public final boolean mo75919m() {
        return this.f63886a;
    }

    /* renamed from: n */
    public final boolean mo75920n() {
        return this.f63890e;
    }

    @C12579k
    public String toString() {
        boolean z = this.f63886a;
        String str = this.f63887b;
        double d = this.f63888c;
        double d2 = this.f63889d;
        boolean z2 = this.f63890e;
        boolean z3 = this.f63891f;
        return "LoyaltyState(hasLoyaltyCard=" + z + ", cardNumber=" + str + ", balance=" + d + ", amountValidated=" + d2 + ", useAllAmount=" + z2 + ", hasError=" + z3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26132a(boolean z, String str, double d, double d2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }
}
