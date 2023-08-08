package com.carrefour.fid.android.domain.models.category;

import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.category.a */
public final class C37992a {
    @C12579k

    /* renamed from: a */
    public final PromiseType f95632a;
    @C12579k

    /* renamed from: b */
    public final String f95633b;

    public /* synthetic */ C37992a(PromiseType promiseType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(promiseType, str);
    }

    /* renamed from: d */
    public static /* synthetic */ C37992a m156394d(C37992a aVar, PromiseType promiseType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            promiseType = aVar.f95632a;
        }
        if ((i & 2) != 0) {
            str = aVar.f95633b;
        }
        return aVar.mo117309c(promiseType, str);
    }

    @C12579k
    /* renamed from: a */
    public final PromiseType mo117307a() {
        return this.f95632a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117308b() {
        return this.f95633b;
    }

    @C12579k
    /* renamed from: c */
    public final C37992a mo117309c(@C12579k PromiseType promiseType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(promiseType, "promiseType");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        return new C37992a(promiseType, str, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public final String mo117310e() {
        return this.f95633b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37992a)) {
            return false;
        }
        C37992a aVar = (C37992a) obj;
        return this.f95632a == aVar.f95632a && FacilityServiceId.m157962f(this.f95633b, aVar.f95633b);
    }

    @C12579k
    /* renamed from: f */
    public final PromiseType mo117312f() {
        return this.f95632a;
    }

    public int hashCode() {
        return (this.f95632a.hashCode() * 31) + FacilityServiceId.m157963h(this.f95633b);
    }

    @C12579k
    public String toString() {
        PromiseType promiseType = this.f95632a;
        String i = FacilityServiceId.m157964i(this.f95633b);
        return "DrivePromise(promiseType=" + promiseType + ", facilityServiceId=" + i + ")";
    }

    public C37992a(PromiseType promiseType, String str) {
        Intrinsics.checkNotNullParameter(promiseType, "promiseType");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.f95632a = promiseType;
        this.f95633b = str;
    }
}
