package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\f\u001a\u00020\u0004H\u0002J\u0013\u0010\r\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsLandingPageViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "m0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "k0", "l0", "j0", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "updateConsentsUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "e", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "f", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/shared/util/q;", "g", "Lcom/carrefour/fid/android/shared/util/q;", "singleServiceStationHasLoyaltyCard", "i0", "()Lcom/carrefour/fid/android/shared/util/q;", "serviceStationHasLoyaltyCard", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/consent/c;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class ServiceStationsLandingPageViewModel extends C28498p {

    /* renamed from: h */
    public static final int f64370h = 8;
    @C12579k

    /* renamed from: d */
    public final C37631c f64371d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f64372e;
    @C12579k

    /* renamed from: f */
    public final LoyaltyPreferencesStorage f64373f;
    @C12579k

    /* renamed from: g */
    public final C28947q<Boolean> f64374g = new C28947q<>();

    @Inject
    public ServiceStationsLandingPageViewModel(@C12579k C37631c cVar, @C12579k LoginRepository loginRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        Intrinsics.checkNotNullParameter(cVar, "updateConsentsUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        this.f64371d = cVar;
        this.f64372e = loginRepository;
        this.f64373f = loyaltyPreferencesStorage;
    }

    @C12579k
    /* renamed from: i0 */
    public final C28947q<Boolean> mo76637i0() {
        return this.f64374g;
    }

    /* renamed from: j0 */
    public final Object mo76638j0(C11045c<? super Boolean> cVar) {
        return C13181d.m57146e(this.f64372e.mo31354f()) ? this.f64373f.hasLoyaltyCard(cVar) : C11064a.m42615a(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76639k0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$hasLoyaltyCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$hasLoyaltyCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$hasLoyaltyCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$hasLoyaltyCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$hasLoyaltyCard$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.shared.util.q r0 = (com.carrefour.fid.android.shared.util.C28947q) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.util.q<java.lang.Boolean> r6 = r5.f64374g
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r0 = r5.mo76638j0(r0)
            if (r0 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0048:
            r0.mo57496r(r6)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel.mo76639k0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: l0 */
    public final boolean mo76640l0() {
        return C13181d.m57146e(this.f64372e.mo31354f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76641m0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            kotlin.C11661u0.m45747n(r9)
            boolean r9 = r8.mo76640l0()
            if (r9 != 0) goto L_0x004b
            com.carrefour.fid.android.shared.util.q r9 = r8.mo83420e0()
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r0 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r0.<init>()
            r9.mo57496r(r0)
            goto L_0x007f
        L_0x004b:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r8.mo76638j0(r0)
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r8
        L_0x0057:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x006e
            com.carrefour.fid.android.shared.util.q r9 = r0.mo83420e0()
            com.carrefour.fid.android.shared.io.LoyaltyConsentsThrowable r0 = new com.carrefour.fid.android.shared.io.LoyaltyConsentsThrowable
            java.lang.String r1 = "Error updating Fid Consents because no card was found"
            r0.<init>(r1)
            r9.mo57496r(r0)
            goto L_0x007f
        L_0x006e:
            kotlinx.coroutines.o0 r2 = androidx.lifecycle.C19500w0.m90846a(r0)
            r3 = 0
            r4 = 0
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$2 r5 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel$updateFidConsents$2
            r9 = 0
            r5.<init>(r0, r9)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r2, r3, r4, r5, r6, r7)
        L_0x007f:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel.mo76641m0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        mo76637i0().mo57495q(wVar);
        this.f64374g.mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
