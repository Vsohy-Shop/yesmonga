package com.carrefour.fid.android.presentation.models.mapper;

import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.domain.models.pickup.C38083d;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.C23659a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p073j$.time.DayOfWeek;

/* renamed from: com.carrefour.fid.android.presentation.models.mapper.g */
public final class C38506g {
    @C12579k
    /* renamed from: a */
    public static final List<C23659a> m159756a(@C12579k C38080a aVar) {
        List<C23659a> L;
        Intrinsics.checkNotNullParameter(aVar, "pickupPoint");
        C38083d dVar = (C38083d) CollectionsKt___CollectionsKt.m40479B2(aVar.mo118291s());
        if (dVar == null || (L = CollectionsKt__CollectionsKt.m40448L(new C23659a(DayOfWeek.MONDAY, dVar.mo118327o()), new C23659a(DayOfWeek.TUESDAY, dVar.mo118331s()), new C23659a(DayOfWeek.WEDNESDAY, dVar.mo118332t()), new C23659a(DayOfWeek.THURSDAY, dVar.mo118330r()), new C23659a(DayOfWeek.FRIDAY, dVar.mo118326n()), new C23659a(DayOfWeek.SATURDAY, dVar.mo118328p()), new C23659a(DayOfWeek.SUNDAY, dVar.mo118329q()))) == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return L;
    }
}
