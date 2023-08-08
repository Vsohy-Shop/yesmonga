package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f */
public final class C25891f {
    @C12579k

    /* renamed from: a */
    public final C28892e<List<C27670g>> f63374a;

    public C25891f() {
        this((C28892e) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C25891f m110949c(C25891f fVar, C28892e<List<C27670g>> eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = fVar.f63374a;
        }
        return fVar.mo75172b(eVar);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<List<C27670g>> mo75171a() {
        return this.f63374a;
    }

    @C12579k
    /* renamed from: b */
    public final C25891f mo75172b(@C12579k C28892e<? extends List<? extends C27670g>> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "items");
        return new C25891f(eVar);
    }

    @C12579k
    /* renamed from: d */
    public final C28892e<List<C27670g>> mo75173d() {
        return this.f63374a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25891f) && Intrinsics.areEqual((Object) this.f63374a, (Object) ((C25891f) obj).f63374a);
    }

    public int hashCode() {
        return this.f63374a.hashCode();
    }

    @C12579k
    public String toString() {
        C28892e<List<C27670g>> eVar = this.f63374a;
        return "ShoppingListUiState(items=" + eVar + ")";
    }

    public C25891f(@C12579k C28892e<? extends List<? extends C27670g>> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "items");
        this.f63374a = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25891f(C28892e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar);
    }
}
