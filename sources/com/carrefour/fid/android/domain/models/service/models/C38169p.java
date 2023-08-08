package com.carrefour.fid.android.domain.models.service.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.p */
public final class C38169p {
    @C12580l

    /* renamed from: a */
    public final C38163l f96695a;

    public C38169p() {
        this((C38163l) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C38169p m158239c(C38169p pVar, C38163l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = pVar.f96695a;
        }
        return pVar.mo119429b(lVar);
    }

    @C12580l
    /* renamed from: a */
    public final C38163l mo119428a() {
        return this.f96695a;
    }

    @C12579k
    /* renamed from: b */
    public final C38169p mo119429b(@C12580l C38163l lVar) {
        return new C38169p(lVar);
    }

    @C12580l
    /* renamed from: d */
    public final C38163l mo119430d() {
        return this.f96695a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38169p) && Intrinsics.areEqual((Object) this.f96695a, (Object) ((C38169p) obj).f96695a);
    }

    public int hashCode() {
        C38163l lVar = this.f96695a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @C12579k
    public String toString() {
        C38163l lVar = this.f96695a;
        return "UpdateStore(store=" + lVar + ")";
    }

    public C38169p(@C12580l C38163l lVar) {
        this.f96695a = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38169p(C38163l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar);
    }
}
