package com.carrefour.fid.android.domain.interactors.slot;

import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.slot.h */
public final class C37863h {
    @C12579k

    /* renamed from: a */
    public final String f94957a;

    public /* synthetic */ C37863h(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: c */
    public static /* synthetic */ C37863h m155084c(C37863h hVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.f94957a;
        }
        return hVar.mo115315b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo115314a() {
        return this.f94957a;
    }

    @C12579k
    /* renamed from: b */
    public final C37863h mo115315b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "facilityId");
        return new C37863h(str, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: d */
    public final String mo115316d() {
        return this.f94957a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37863h) && FacilityServiceId.m157962f(this.f94957a, ((C37863h) obj).f94957a);
    }

    public int hashCode() {
        return FacilityServiceId.m157963h(this.f94957a);
    }

    @C12579k
    public String toString() {
        String i = FacilityServiceId.m157964i(this.f94957a);
        return "Params(facilityId=" + i + ")";
    }

    public C37863h(String str) {
        Intrinsics.checkNotNullParameter(str, "facilityId");
        this.f94957a = str;
    }
}
