package com.carrefour.fid.android.domain.models.service.models;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.o */
public final class C38168o {
    @C12580l

    /* renamed from: a */
    public final List<C38167n> f96693a;

    /* renamed from: b */
    public final int f96694b;

    public C38168o() {
        this((List) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C38168o m158233d(C38168o oVar, List<C38167n> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = oVar.f96693a;
        }
        if ((i2 & 2) != 0) {
            i = oVar.f96694b;
        }
        return oVar.mo119422c(list, i);
    }

    @C12580l
    /* renamed from: a */
    public final List<C38167n> mo119420a() {
        return this.f96693a;
    }

    /* renamed from: b */
    public final int mo119421b() {
        return this.f96694b;
    }

    @C12579k
    /* renamed from: c */
    public final C38168o mo119422c(@C12580l List<C38167n> list, int i) {
        return new C38168o(list, i);
    }

    /* renamed from: e */
    public final int mo119423e() {
        return this.f96694b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38168o)) {
            return false;
        }
        C38168o oVar = (C38168o) obj;
        return Intrinsics.areEqual((Object) this.f96693a, (Object) oVar.f96693a) && this.f96694b == oVar.f96694b;
    }

    @C12580l
    /* renamed from: f */
    public final List<C38167n> mo119425f() {
        return this.f96693a;
    }

    public int hashCode() {
        List<C38167n> list = this.f96693a;
        return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.f96694b);
    }

    @C12579k
    public String toString() {
        List<C38167n> list = this.f96693a;
        int i = this.f96694b;
        return "StoreServicesPictos(servicesPictos=" + list + ", count=" + i + ")";
    }

    public C38168o(@C12580l List<C38167n> list, int i) {
        this.f96693a = list;
        this.f96694b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38168o(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i);
    }
}
