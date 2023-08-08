package com.carrefour.fid.android.presentation.viewmodels.product.filter;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.extension.C38477m;
import com.carrefour.fid.android.presentation.models.extension.FacetModelKt;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListFiltersViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class ProductListFiltersViewModel extends C28498p {

    /* renamed from: h */
    public static final int f66071h = 8;
    @C12579k

    /* renamed from: d */
    public final LoyaltyPreferencesStorage f66072d;
    @C12579k

    /* renamed from: e */
    public final GetProductListUseCase f66073e;
    @C12579k

    /* renamed from: f */
    public final C28947q<ProductListResultModel> f66074f = new C28947q<>();
    @C12579k

    /* renamed from: g */
    public final C28947q<ProductListSettingsModel> f66075g = new C28947q<>();

    @Inject
    public ProductListFiltersViewModel(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k GetProductListUseCase getProductListUseCase) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(getProductListUseCase, "getProductListUseCase");
        this.f66072d = loyaltyPreferencesStorage;
        this.f66073e = getProductListUseCase;
    }

    public void clear() {
        super.clear();
        this.f66074f.mo57496r(null);
        this.f66075g.mo57496r(null);
    }

    @C12579k
    /* renamed from: i0 */
    public final LiveData<ProductListResultModel> mo78993i0() {
        return this.f66074f;
    }

    @C12579k
    /* renamed from: j0 */
    public final LiveData<ProductListSettingsModel> mo78994j0() {
        return this.f66075g;
    }

    /* renamed from: k0 */
    public final void mo78995k0(Object obj) {
        mo83421f0().mo57493o(Boolean.FALSE);
        if (Result.m38710j(obj)) {
            this.f66074f.mo57493o((ProductListResultModel) obj);
        }
        if (Result.m38705e(obj) != null) {
            mo83420e0().mo57493o(Result.m38705e(obj));
        }
    }

    /* renamed from: l0 */
    public final boolean mo78996l0() {
        ProductListSettingsModel f = this.f66075g.mo4610f();
        if (f == null) {
            return false;
        }
        List<FacetModel> s = f.mo121853s();
        return (s != null ? FacetModelKt.m159550d(s) : 0) > 0 || C38477m.m159650j(f);
    }

    /* renamed from: m0 */
    public final void mo78997m0(@C12580l ProductListSettingsModel productListSettingsModel) {
        clear();
        this.f66075g.mo57493o(productListSettingsModel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78998n0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.presentation.models.ProductListSettingsModel r1 = (com.carrefour.fid.android.presentation.models.ProductListSettingsModel) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            r5 = r1
            goto L_0x005a
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003b:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.shared.util.q<com.carrefour.fid.android.presentation.models.ProductListSettingsModel> r14 = r13.f66075g
            java.lang.Object r14 = r14.mo4610f()
            com.carrefour.fid.android.presentation.models.ProductListSettingsModel r14 = (com.carrefour.fid.android.presentation.models.ProductListSettingsModel) r14
            if (r14 == 0) goto L_0x006c
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r13.f66072d
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r0 = r2.hasLoyaltyCard(r0)
            if (r0 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r5 = r14
            r14 = r0
            r0 = r13
        L_0x005a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r6 = r14.booleanValue()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 28
            r12 = 0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a r14 = com.carrefour.fid.android.presentation.models.extension.C38477m.m159647g(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x006e
        L_0x006c:
            r0 = r13
            r14 = r3
        L_0x006e:
            if (r14 != 0) goto L_0x0094
            com.carrefour.fid.android.shared.util.q r14 = r0.mo83420e0()
            java.lang.Throwable r1 = new java.lang.Throwable
            androidx.lifecycle.LiveData r0 = r0.mo78994j0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No query for "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r14.mo57493o(r1)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        L_0x0094:
            com.carrefour.fid.android.shared.util.q r1 = r0.mo83421f0()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            r1.mo57493o(r2)
            kotlinx.coroutines.o0 r4 = androidx.lifecycle.C19500w0.m90846a(r0)
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$2 r7 = new com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel$load$2
            r7.<init>(r0, r14, r3)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r4, r5, r6, r7, r8, r9)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel.mo78998n0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f66074f.mo57495q(wVar);
        mo78993i0().mo57495q(wVar);
        this.f66075g.mo57495q(wVar);
        mo78994j0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
