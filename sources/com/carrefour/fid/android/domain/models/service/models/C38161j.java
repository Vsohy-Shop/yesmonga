package com.carrefour.fid.android.domain.models.service.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.j */
public final class C38161j {
    @C12579k

    /* renamed from: a */
    public final String f96663a;

    public C38161j() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C38161j m158165c(C38161j jVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.f96663a;
        }
        return jVar.mo119344b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo119343a() {
        return this.f96663a;
    }

    @C12579k
    /* renamed from: b */
    public final C38161j mo119344b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        return new C38161j(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo119345d() {
        return this.f96663a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38161j) && Intrinsics.areEqual((Object) this.f96663a, (Object) ((C38161j) obj).f96663a);
    }

    public int hashCode() {
        return this.f96663a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f96663a;
        return "ServicePicto(url=" + str + ")";
    }

    public C38161j(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f96663a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38161j(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
