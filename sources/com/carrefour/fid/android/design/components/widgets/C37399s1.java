package com.carrefour.fid.android.design.components.widgets;

import androidx.compose.runtime.internal.C8567o;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.s1 */
public final class C37399s1 {

    /* renamed from: c */
    public static final int f93971c = 8;
    @C12579k

    /* renamed from: a */
    public final Date f93972a;
    @C12579k

    /* renamed from: b */
    public final Date f93973b;

    public C37399s1(@C12579k Date date, @C12579k Date date2) {
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(date2, "endTime");
        this.f93972a = date;
        this.f93973b = date2;
    }

    /* renamed from: d */
    public static /* synthetic */ C37399s1 m153587d(C37399s1 s1Var, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            date = s1Var.f93972a;
        }
        if ((i & 2) != 0) {
            date2 = s1Var.f93973b;
        }
        return s1Var.mo113991c(date, date2);
    }

    @C12579k
    /* renamed from: a */
    public final Date mo113989a() {
        return this.f93972a;
    }

    @C12579k
    /* renamed from: b */
    public final Date mo113990b() {
        return this.f93973b;
    }

    @C12579k
    /* renamed from: c */
    public final C37399s1 mo113991c(@C12579k Date date, @C12579k Date date2) {
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(date2, "endTime");
        return new C37399s1(date, date2);
    }

    @C12579k
    /* renamed from: e */
    public final Date mo113992e() {
        return this.f93973b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37399s1)) {
            return false;
        }
        C37399s1 s1Var = (C37399s1) obj;
        return Intrinsics.areEqual((Object) this.f93972a, (Object) s1Var.f93972a) && Intrinsics.areEqual((Object) this.f93973b, (Object) s1Var.f93973b);
    }

    @C12579k
    /* renamed from: f */
    public final Date mo113994f() {
        return this.f93972a;
    }

    public int hashCode() {
        return (this.f93972a.hashCode() * 31) + this.f93973b.hashCode();
    }

    @C12579k
    public String toString() {
        Date date = this.f93972a;
        Date date2 = this.f93973b;
        return "StoreOpeningTimeRange(startTime=" + date + ", endTime=" + date2 + ")";
    }
}
