package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.b0 */
public final class C37954b0 {

    /* renamed from: d */
    public static final int f95459d = 0;
    @C12579k

    /* renamed from: a */
    public final String f95460a;
    @C12579k

    /* renamed from: b */
    public final String f95461b;

    /* renamed from: c */
    public final boolean f95462c;

    public C37954b0(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        Intrinsics.checkNotNullParameter(str2, "count");
        this.f95460a = str;
        this.f95461b = str2;
        this.f95462c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C37954b0 m155982e(C37954b0 b0Var, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b0Var.f95460a;
        }
        if ((i & 2) != 0) {
            str2 = b0Var.f95461b;
        }
        if ((i & 4) != 0) {
            z = b0Var.f95462c;
        }
        return b0Var.mo116809d(str, str2, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116806a() {
        return this.f95460a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116807b() {
        return this.f95461b;
    }

    /* renamed from: c */
    public final boolean mo116808c() {
        return this.f95462c;
    }

    @C12579k
    /* renamed from: d */
    public final C37954b0 mo116809d(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        Intrinsics.checkNotNullParameter(str2, "count");
        return new C37954b0(str, str2, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37954b0)) {
            return false;
        }
        C37954b0 b0Var = (C37954b0) obj;
        return Intrinsics.areEqual((Object) this.f95460a, (Object) b0Var.f95460a) && Intrinsics.areEqual((Object) this.f95461b, (Object) b0Var.f95461b) && this.f95462c == b0Var.f95462c;
    }

    @C12579k
    /* renamed from: f */
    public final String mo116811f() {
        return this.f95461b;
    }

    /* renamed from: g */
    public final boolean mo116812g() {
        return this.f95462c;
    }

    @C12579k
    /* renamed from: h */
    public final String mo116813h() {
        return this.f95460a;
    }

    public int hashCode() {
        int hashCode = ((this.f95460a.hashCode() * 31) + this.f95461b.hashCode()) * 31;
        boolean z = this.f95462c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        String str = this.f95460a;
        String str2 = this.f95461b;
        boolean z = this.f95462c;
        return "TermDomain(term=" + str + ", count=" + str2 + ", selected=" + z + ")";
    }
}
