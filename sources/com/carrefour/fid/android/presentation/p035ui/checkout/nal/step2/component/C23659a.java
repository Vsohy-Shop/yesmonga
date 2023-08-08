package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import com.carrefour.fid.android.domain.models.pickup.C38082c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.DayOfWeek;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.a */
public final class C23659a {
    @C12579k

    /* renamed from: a */
    public final DayOfWeek f59699a;
    @C12579k

    /* renamed from: b */
    public final List<C38082c> f59700b;

    public C23659a(@C12579k DayOfWeek dayOfWeek, @C12579k List<C38082c> list) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "day");
        Intrinsics.checkNotNullParameter(list, "openings");
        this.f59699a = dayOfWeek;
        this.f59700b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C23659a m105074d(C23659a aVar, DayOfWeek dayOfWeek, List<C38082c> list, int i, Object obj) {
        if ((i & 1) != 0) {
            dayOfWeek = aVar.f59699a;
        }
        if ((i & 2) != 0) {
            list = aVar.f59700b;
        }
        return aVar.mo69352c(dayOfWeek, list);
    }

    @C12579k
    /* renamed from: a */
    public final DayOfWeek mo69350a() {
        return this.f59699a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38082c> mo69351b() {
        return this.f59700b;
    }

    @C12579k
    /* renamed from: c */
    public final C23659a mo69352c(@C12579k DayOfWeek dayOfWeek, @C12579k List<C38082c> list) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "day");
        Intrinsics.checkNotNullParameter(list, "openings");
        return new C23659a(dayOfWeek, list);
    }

    @C12579k
    /* renamed from: e */
    public final DayOfWeek mo69353e() {
        return this.f59699a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23659a)) {
            return false;
        }
        C23659a aVar = (C23659a) obj;
        return this.f59699a == aVar.f59699a && Intrinsics.areEqual((Object) this.f59700b, (Object) aVar.f59700b);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38082c> mo69355f() {
        return this.f59700b;
    }

    public int hashCode() {
        return (this.f59699a.hashCode() * 31) + this.f59700b.hashCode();
    }

    @C12579k
    public String toString() {
        DayOfWeek dayOfWeek = this.f59699a;
        List<C38082c> list = this.f59700b;
        return "DayOpening(day=" + dayOfWeek + ", openings=" + list + ")";
    }
}
