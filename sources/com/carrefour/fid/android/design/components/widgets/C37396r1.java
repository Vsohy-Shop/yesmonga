package com.carrefour.fid.android.design.components.widgets;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.r1 */
public final class C37396r1 {

    /* renamed from: d */
    public static final int f93965d = 8;
    @C12579k

    /* renamed from: a */
    public final String f93966a;
    @C12580l

    /* renamed from: b */
    public final Boolean f93967b;
    @C12580l

    /* renamed from: c */
    public final C37399s1 f93968c;

    public C37396r1(@C12579k String str, @C12580l Boolean bool, @C12580l C37399s1 s1Var) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f93966a = str;
        this.f93967b = bool;
        this.f93968c = s1Var;
    }

    /* renamed from: e */
    public static /* synthetic */ C37396r1 m153579e(C37396r1 r1Var, String str, Boolean bool, C37399s1 s1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = r1Var.f93966a;
        }
        if ((i & 2) != 0) {
            bool = r1Var.f93967b;
        }
        if ((i & 4) != 0) {
            s1Var = r1Var.f93968c;
        }
        return r1Var.mo113981d(str, bool, s1Var);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113978a() {
        return this.f93966a;
    }

    @C12580l
    /* renamed from: b */
    public final Boolean mo113979b() {
        return this.f93967b;
    }

    @C12580l
    /* renamed from: c */
    public final C37399s1 mo113980c() {
        return this.f93968c;
    }

    @C12579k
    /* renamed from: d */
    public final C37396r1 mo113981d(@C12579k String str, @C12580l Boolean bool, @C12580l C37399s1 s1Var) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C37396r1(str, bool, s1Var);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37396r1)) {
            return false;
        }
        C37396r1 r1Var = (C37396r1) obj;
        return Intrinsics.areEqual((Object) this.f93966a, (Object) r1Var.f93966a) && Intrinsics.areEqual((Object) this.f93967b, (Object) r1Var.f93967b) && Intrinsics.areEqual((Object) this.f93968c, (Object) r1Var.f93968c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo113983f() {
        return this.f93966a;
    }

    @C12580l
    /* renamed from: g */
    public final C37399s1 mo113984g() {
        return this.f93968c;
    }

    @C12580l
    /* renamed from: h */
    public final Boolean mo113985h() {
        return this.f93967b;
    }

    public int hashCode() {
        int hashCode = this.f93966a.hashCode() * 31;
        Boolean bool = this.f93967b;
        int i = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C37399s1 s1Var = this.f93968c;
        if (s1Var != null) {
            i = s1Var.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f93966a;
        Boolean bool = this.f93967b;
        C37399s1 s1Var = this.f93968c;
        return "StoreInfo(name=" + str + ", isStoreOpen=" + bool + ", openingTimeRange=" + s1Var + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37396r1(String str, Boolean bool, C37399s1 s1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : s1Var);
    }
}
