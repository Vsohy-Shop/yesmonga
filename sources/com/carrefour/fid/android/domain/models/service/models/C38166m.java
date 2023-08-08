package com.carrefour.fid.android.domain.models.service.models;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.m */
public final class C38166m {
    @C12579k

    /* renamed from: a */
    public final List<C38163l> f96687a;

    public C38166m() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C38166m m158217c(C38166m mVar, List<C38163l> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mVar.f96687a;
        }
        return mVar.mo119401b(list);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38163l> mo119400a() {
        return this.f96687a;
    }

    @C12579k
    /* renamed from: b */
    public final C38166m mo119401b(@C12579k List<C38163l> list) {
        Intrinsics.checkNotNullParameter(list, "storeList");
        return new C38166m(list);
    }

    @C12579k
    /* renamed from: d */
    public final List<C38163l> mo119402d() {
        return this.f96687a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38166m) && Intrinsics.areEqual((Object) this.f96687a, (Object) ((C38166m) obj).f96687a);
    }

    public int hashCode() {
        return this.f96687a.hashCode();
    }

    @C12579k
    public String toString() {
        List<C38163l> list = this.f96687a;
        return "StoreFacility(storeList=" + list + ")";
    }

    public C38166m(@C12579k List<C38163l> list) {
        Intrinsics.checkNotNullParameter(list, "storeList");
        this.f96687a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38166m(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
