package com.carrefour.fid.android.domain.models.service.models;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.i */
public final class C38160i {
    @C12579k

    /* renamed from: a */
    public final Date f96661a;
    @C12579k

    /* renamed from: b */
    public final Date f96662b;

    public C38160i(@C12579k Date date, @C12579k Date date2) {
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(date2, "endTime");
        this.f96661a = date;
        this.f96662b = date2;
    }

    /* renamed from: d */
    public static /* synthetic */ C38160i m158159d(C38160i iVar, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            date = iVar.f96661a;
        }
        if ((i & 2) != 0) {
            date2 = iVar.f96662b;
        }
        return iVar.mo119337c(date, date2);
    }

    @C12579k
    /* renamed from: a */
    public final Date mo119335a() {
        return this.f96661a;
    }

    @C12579k
    /* renamed from: b */
    public final Date mo119336b() {
        return this.f96662b;
    }

    @C12579k
    /* renamed from: c */
    public final C38160i mo119337c(@C12579k Date date, @C12579k Date date2) {
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(date2, "endTime");
        return new C38160i(date, date2);
    }

    @C12579k
    /* renamed from: e */
    public final Date mo119338e() {
        return this.f96662b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38160i)) {
            return false;
        }
        C38160i iVar = (C38160i) obj;
        return Intrinsics.areEqual((Object) this.f96661a, (Object) iVar.f96661a) && Intrinsics.areEqual((Object) this.f96662b, (Object) iVar.f96662b);
    }

    @C12579k
    /* renamed from: f */
    public final Date mo119340f() {
        return this.f96661a;
    }

    public int hashCode() {
        return (this.f96661a.hashCode() * 31) + this.f96662b.hashCode();
    }

    @C12579k
    public String toString() {
        Date date = this.f96661a;
        Date date2 = this.f96662b;
        return "OpeningTimeRange(startTime=" + date + ", endTime=" + date2 + ")";
    }
}
