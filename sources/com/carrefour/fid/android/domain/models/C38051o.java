package com.carrefour.fid.android.domain.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.o */
public final class C38051o extends C38037g {
    @C12579k

    /* renamed from: a */
    public final String f95939a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38051o(@C12579k String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "bonus");
        this.f95939a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C38051o m156950c(C38051o oVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oVar.f95939a;
        }
        return oVar.mo117932b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117931a() {
        return this.f95939a;
    }

    @C12579k
    /* renamed from: b */
    public final C38051o mo117932b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "bonus");
        return new C38051o(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo117933d() {
        return this.f95939a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38051o) && Intrinsics.areEqual((Object) this.f95939a, (Object) ((C38051o) obj).f95939a);
    }

    public int hashCode() {
        return this.f95939a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95939a;
        return "FreeDeliveryPrice(bonus=" + str + ")";
    }
}
