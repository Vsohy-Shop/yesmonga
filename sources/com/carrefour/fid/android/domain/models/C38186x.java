package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.StoreOpeningState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.x */
public final class C38186x {

    /* renamed from: c */
    public static final int f96748c = 0;
    @C12579k

    /* renamed from: a */
    public final StoreOpeningState f96749a;
    @C12579k

    /* renamed from: b */
    public final String f96750b;

    public C38186x(@C12579k StoreOpeningState storeOpeningState, @C12579k String str) {
        Intrinsics.checkNotNullParameter(storeOpeningState, "state");
        Intrinsics.checkNotNullParameter(str, "openingHour");
        this.f96749a = storeOpeningState;
        this.f96750b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ C38186x m158370d(C38186x xVar, StoreOpeningState storeOpeningState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            storeOpeningState = xVar.f96749a;
        }
        if ((i & 2) != 0) {
            str = xVar.f96750b;
        }
        return xVar.mo119586c(storeOpeningState, str);
    }

    @C12579k
    /* renamed from: a */
    public final StoreOpeningState mo119584a() {
        return this.f96749a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119585b() {
        return this.f96750b;
    }

    @C12579k
    /* renamed from: c */
    public final C38186x mo119586c(@C12579k StoreOpeningState storeOpeningState, @C12579k String str) {
        Intrinsics.checkNotNullParameter(storeOpeningState, "state");
        Intrinsics.checkNotNullParameter(str, "openingHour");
        return new C38186x(storeOpeningState, str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo119587e() {
        return this.f96750b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38186x)) {
            return false;
        }
        C38186x xVar = (C38186x) obj;
        return this.f96749a == xVar.f96749a && Intrinsics.areEqual((Object) this.f96750b, (Object) xVar.f96750b);
    }

    @C12579k
    /* renamed from: f */
    public final StoreOpeningState mo119589f() {
        return this.f96749a;
    }

    public int hashCode() {
        return (this.f96749a.hashCode() * 31) + this.f96750b.hashCode();
    }

    @C12579k
    public String toString() {
        StoreOpeningState storeOpeningState = this.f96749a;
        String str = this.f96750b;
        return "StoreHoursDomain(state=" + storeOpeningState + ", openingHour=" + str + ")";
    }
}
