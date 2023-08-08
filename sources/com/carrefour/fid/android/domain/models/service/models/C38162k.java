package com.carrefour.fid.android.domain.models.service.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.k */
public final class C38162k {
    @C12580l

    /* renamed from: a */
    public final C38163l f96664a;
    @C12580l

    /* renamed from: b */
    public final StoreService f96665b;

    public C38162k() {
        this((C38163l) null, (StoreService) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C38162k m158169d(C38162k kVar, C38163l lVar, StoreService storeService, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = kVar.f96664a;
        }
        if ((i & 2) != 0) {
            storeService = kVar.f96665b;
        }
        return kVar.mo119351c(lVar, storeService);
    }

    @C12580l
    /* renamed from: a */
    public final C38163l mo119349a() {
        return this.f96664a;
    }

    @C12580l
    /* renamed from: b */
    public final StoreService mo119350b() {
        return this.f96665b;
    }

    @C12579k
    /* renamed from: c */
    public final C38162k mo119351c(@C12580l C38163l lVar, @C12580l StoreService storeService) {
        return new C38162k(lVar, storeService);
    }

    @C12580l
    /* renamed from: e */
    public final C38163l mo119352e() {
        return this.f96664a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38162k)) {
            return false;
        }
        C38162k kVar = (C38162k) obj;
        return Intrinsics.areEqual((Object) this.f96664a, (Object) kVar.f96664a) && Intrinsics.areEqual((Object) this.f96665b, (Object) kVar.f96665b);
    }

    @C12580l
    /* renamed from: f */
    public final StoreService mo119354f() {
        return this.f96665b;
    }

    public int hashCode() {
        C38163l lVar = this.f96664a;
        int i = 0;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        StoreService storeService = this.f96665b;
        if (storeService != null) {
            i = storeService.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        C38163l lVar = this.f96664a;
        StoreService storeService = this.f96665b;
        return "ServiceSelection(store=" + lVar + ", storeService=" + storeService + ")";
    }

    public C38162k(@C12580l C38163l lVar, @C12580l StoreService storeService) {
        this.f96664a = lVar;
        this.f96665b = storeService;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38162k(C38163l lVar, StoreService storeService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : storeService);
    }
}
