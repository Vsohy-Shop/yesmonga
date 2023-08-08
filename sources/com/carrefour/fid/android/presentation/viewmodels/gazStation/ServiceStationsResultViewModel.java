package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.models.C38527s;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b6\u00107J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u0014\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0013\u0010\u0018\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0012J\u0013\u0010\u0019\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\u0013\u0010\u001b\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0012J\u0013\u0010\u001c\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0012R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020.028@X\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0002\u0004\n\u0002\b\u0019¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsResultViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "", "mediaPath", "u0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "count", "w0", "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "s0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "o0", "", "throwable", "p0", "l0", "v0", "t0", "r0", "m0", "Lcom/carrefour/fid/android/domain/interactors/gazStation/PostTicketCardUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/gazStation/PostTicketCardUseCase;", "postTicketCardUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "e", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "f", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "g", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "appPreferencesStorage", "Lcom/carrefour/fid/android/shared/util/q;", "Lcom/carrefour/fid/android/presentation/models/s;", "h", "Lcom/carrefour/fid/android/shared/util/q;", "singleServiceStationModel", "Landroidx/lifecycle/LiveData;", "n0", "()Landroidx/lifecycle/LiveData;", "serviceStationModel", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/gazStation/PostTicketCardUseCase;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class ServiceStationsResultViewModel extends C28498p {

    /* renamed from: i */
    public static final int f64375i = 8;
    @C12579k

    /* renamed from: d */
    public final PostTicketCardUseCase f64376d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f64377e;
    @C12579k

    /* renamed from: f */
    public final LoyaltyPreferencesStorage f64378f;
    @C12579k

    /* renamed from: g */
    public final AppPreferencesStorage f64379g;
    @C12579k

    /* renamed from: h */
    public final C28947q<C38527s> f64380h = new C28947q<>();

    @Inject
    public ServiceStationsResultViewModel(@C12579k PostTicketCardUseCase postTicketCardUseCase, @C12579k LoginRepository loginRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(postTicketCardUseCase, "postTicketCardUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f64376d = postTicketCardUseCase;
        this.f64377e = loginRepository;
        this.f64378f = loyaltyPreferencesStorage;
        this.f64379g = appPreferencesStorage;
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m112464q0(ServiceStationsResultViewModel serviceStationsResultViewModel, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        serviceStationsResultViewModel.mo76647p0(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76643l0(kotlin.coroutines.C11045c<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getLaunchCount$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getLaunchCount$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getLaunchCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getLaunchCount$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getLaunchCount$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f64379g
            r0.label = r3
            java.lang.Object r5 = r5.mo108080c(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.core.datastore.a r5 = (com.carrefour.fid.android.core.datastore.C36193a) r5
            int r5 = r5.mo108117D()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel.mo76643l0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m0 */
    public final Object mo76644m0(C11045c<? super String> cVar) {
        return this.f64378f.getLoyaltyCardNumber(cVar);
    }

    @C12579k
    /* renamed from: n0 */
    public final LiveData<C38527s> mo76645n0() {
        return this.f64380h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76646o0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Long> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getTimerStartDate$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getTimerStartDate$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getTimerStartDate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getTimerStartDate$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$getTimerStartDate$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f64379g
            r0.label = r3
            java.lang.Object r5 = r5.mo108080c(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.core.datastore.a r5 = (com.carrefour.fid.android.core.datastore.C36193a) r5
            long r0 = r5.mo108118E()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.C11064a.m42621g(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel.mo76646o0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: p0 */
    public final void mo76647p0(Throwable th) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceStationsResultViewModel$handlePostTicketError$1(this, th, (C11045c<? super ServiceStationsResultViewModel$handlePostTicketError$1>) null), 3, (Object) null);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64380h.mo57495q(wVar);
        mo76645n0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76648r0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$hasNoCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$hasNoCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$hasNoCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$hasNoCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$hasNoCard$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r5 = r4.f64378f
            r0.label = r3
            java.lang.Object r5 = r5.hasLoyaltyCard(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel.mo76648r0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76649s0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$isCountLimitExceeded$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$isCountLimitExceeded$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$isCountLimitExceeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$isCountLimitExceeded$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$isCountLimitExceeded$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.mo76643l0(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = 2
            if (r5 <= r0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel.mo76649s0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t0 */
    public final boolean mo76650t0() {
        return !C13181d.m57146e(this.f64377e.mo31354f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76651u0(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$postTicketCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$postTicketCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$postTicketCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$postTicketCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$postTicketCard$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x006f
            if (r2 == r6) goto L_0x0063
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0139
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r12 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel) r12
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0107
        L_0x004b:
            java.lang.Object r12 = r0.L$3
            java.io.File r12 = (java.io.File) r12
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase r5 = (com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r6 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel) r6
            kotlin.C11661u0.m45747n(r13)
            r10 = r6
            r6 = r2
            r2 = r10
            goto L_0x00ee
        L_0x0063:
            java.lang.Object r12 = r0.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel) r2
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0094
        L_0x006f:
            kotlin.C11661u0.m45747n(r13)
            boolean r13 = r11.mo76650t0()
            if (r13 == 0) goto L_0x0086
            com.carrefour.fid.android.shared.util.q r12 = r11.mo83420e0()
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r13 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r13.<init>()
            r12.mo57496r(r13)
            goto L_0x0139
        L_0x0086:
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r6
            java.lang.Object r13 = r11.mo76648r0(r0)
            if (r13 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r2 = r11
        L_0x0094:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00aa
            com.carrefour.fid.android.shared.util.q r12 = r2.mo83420e0()
            com.carrefour.fid.android.shared.io.LoyaltyCardThrowable r13 = new com.carrefour.fid.android.shared.io.LoyaltyCardThrowable
            r13.<init>()
            r12.mo57496r(r13)
            goto L_0x0139
        L_0x00aa:
            boolean r13 = kotlin.text.C11622t.isBlank(r12)
            if (r13 == 0) goto L_0x00b5
            m112464q0(r2, r7, r6, r7)
            goto L_0x0139
        L_0x00b5:
            com.carrefour.fid.android.shared.util.q r13 = r2.mo83421f0()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            r13.mo57496r(r6)
            com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase r13 = r2.f64376d
            com.carrefour.fid.android.shared.util.h$a r6 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            java.util.Date r8 = r8.getTime()
            java.lang.String r9 = "getInstance().time"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.String r6 = r6.mo84238h(r8)
            java.io.File r8 = new java.io.File
            r8.<init>(r12)
            r0.L$0 = r2
            r0.L$1 = r13
            r0.L$2 = r6
            r0.L$3 = r8
            r0.label = r5
            java.lang.Object r12 = r2.mo76644m0(r0)
            if (r12 != r1) goto L_0x00eb
            return r1
        L_0x00eb:
            r5 = r13
            r13 = r12
            r12 = r8
        L_0x00ee:
            java.lang.String r13 = (java.lang.String) r13
            com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$a r8 = new com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase$a
            r8.<init>(r6, r12, r13)
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.label = r4
            java.lang.Object r13 = r5.m172970invokegIAlus(r8, r0)
            if (r13 != r1) goto L_0x0106
            return r1
        L_0x0106:
            r12 = r2
        L_0x0107:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r13)
            r4 = 0
            if (r2 != 0) goto L_0x012b
            com.carrefour.fid.android.presentation.models.s r13 = (com.carrefour.fid.android.presentation.models.C38527s) r13
            com.carrefour.fid.android.shared.util.q r2 = r12.mo83421f0()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            r2.mo57493o(r5)
            com.carrefour.fid.android.shared.util.q<com.carrefour.fid.android.presentation.models.s> r2 = r12.f64380h
            r2.mo57493o(r13)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r12 = r12.mo76653w0(r4, r0)
            if (r12 != r1) goto L_0x0139
            return r1
        L_0x012b:
            com.carrefour.fid.android.shared.util.q r13 = r12.mo83421f0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            r13.mo57493o(r0)
            r12.mo76647p0(r2)
        L_0x0139:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel.mo76651u0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: v0 */
    public final Object mo76652v0(C11045c<? super C11079d2> cVar) {
        Object p = this.f64379g.mo108093p(Calendar.getInstance().getTimeInMillis(), cVar);
        return p == C11063b.m42612h() ? p : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: w0 */
    public final Object mo76653w0(int i, @C12579k C11045c<? super C11079d2> cVar) {
        Object o = this.f64379g.mo108092o(i, cVar);
        return o == C11063b.m42612h() ? o : C11079d2.f28267a;
    }
}
