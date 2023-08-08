package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.b */
public final class C26144b {
    @C12579k

    /* renamed from: a */
    public final C28892e<C11079d2> f63929a;
    @C12579k

    /* renamed from: b */
    public final C28892e<C37562d> f63930b;

    public C26144b() {
        this((C28892e) null, (C28892e) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C26144b m111765d(C26144b bVar, C28892e<C11079d2> eVar, C28892e<C37562d> eVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = bVar.f63929a;
        }
        if ((i & 2) != 0) {
            eVar2 = bVar.f63930b;
        }
        return bVar.mo75963c(eVar, eVar2);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<C11079d2> mo75961a() {
        return this.f63929a;
    }

    @C12579k
    /* renamed from: b */
    public final C28892e<C37562d> mo75962b() {
        return this.f63930b;
    }

    @C12579k
    /* renamed from: c */
    public final C26144b mo75963c(@C12579k C28892e<C11079d2> eVar, @C12579k C28892e<C37562d> eVar2) {
        Intrinsics.checkNotNullParameter(eVar, "updateBasketState");
        Intrinsics.checkNotNullParameter(eVar2, "basketAndOffersState");
        return new C26144b(eVar, eVar2);
    }

    @C12579k
    /* renamed from: e */
    public final C28892e<C37562d> mo75964e() {
        return this.f63930b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26144b)) {
            return false;
        }
        C26144b bVar = (C26144b) obj;
        return Intrinsics.areEqual((Object) this.f63929a, (Object) bVar.f63929a) && Intrinsics.areEqual((Object) this.f63930b, (Object) bVar.f63930b);
    }

    @C12579k
    /* renamed from: f */
    public final C28892e<C11079d2> mo75966f() {
        if (!C28897f.m119479c(this.f63929a) && !C28897f.m119479c(this.f63930b)) {
            return C28892e.C28894b.f70781b;
        }
        if (this.f63929a instanceof C28892e.C28893a) {
            return new C28892e.C28893a(((C28892e.C28893a) this.f63929a).mo84083d());
        }
        if (this.f63930b instanceof C28892e.C28893a) {
            return new C28892e.C28893a(((C28892e.C28893a) this.f63930b).mo84083d());
        }
        return new C28892e.C28895c(C11079d2.f28267a);
    }

    @C12579k
    /* renamed from: g */
    public final C28892e<C11079d2> mo75967g() {
        return this.f63929a;
    }

    public int hashCode() {
        return (this.f63929a.hashCode() * 31) + this.f63930b.hashCode();
    }

    @C12579k
    public String toString() {
        C28892e<C11079d2> eVar = this.f63929a;
        C28892e<C37562d> eVar2 = this.f63930b;
        return "NonFoodCheckout1State(updateBasketState=" + eVar + ", basketAndOffersState=" + eVar2 + ")";
    }

    public C26144b(@C12579k C28892e<C11079d2> eVar, @C12579k C28892e<C37562d> eVar2) {
        Intrinsics.checkNotNullParameter(eVar, "updateBasketState");
        Intrinsics.checkNotNullParameter(eVar2, "basketAndOffersState");
        this.f63929a = eVar;
        this.f63930b = eVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26144b(C28892e eVar, C28892e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i & 2) != 0 ? C28892e.C28896d.f70785b : eVar2);
    }
}
