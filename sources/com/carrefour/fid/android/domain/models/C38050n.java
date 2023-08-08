package com.carrefour.fid.android.domain.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.n */
public final class C38050n extends C38037g {
    @C12579k

    /* renamed from: a */
    public final String f95938a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38050n(@C12579k String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "price");
        this.f95938a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C38050n m156946c(C38050n nVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nVar.f95938a;
        }
        return nVar.mo117926b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117925a() {
        return this.f95938a;
    }

    @C12579k
    /* renamed from: b */
    public final C38050n mo117926b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "price");
        return new C38050n(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo117927d() {
        return this.f95938a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38050n) && Intrinsics.areEqual((Object) this.f95938a, (Object) ((C38050n) obj).f95938a);
    }

    public int hashCode() {
        return this.f95938a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95938a;
        return "FeesDeliveryPrice(price=" + str + ")";
    }
}
