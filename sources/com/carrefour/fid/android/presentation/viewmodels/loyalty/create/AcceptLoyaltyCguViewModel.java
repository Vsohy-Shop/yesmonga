package com.carrefour.fid.android.presentation.viewmodels.loyalty.create;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.AcceptLoyaltyCguAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.AcceptLoyaltyCguAnalyticsDelegate;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\t\u0010\b\u001a\u00020\u0005H\u0001J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/AcceptLoyaltyCguViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/mvi/a$c;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/mvi/a$e;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/AcceptLoyaltyCguAnalytics;", "Lkotlin/d2;", "sendTagClickAcceptLoyaltyCGU", "sendTagClickDenyLoyaltyCGU", "sendTagScreenAcceptLoyaltyCGU", "intent", "f0", "(Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/mvi/a$e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "e0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsPrimeFidUseCase;", "a", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsPrimeFidUseCase;", "getCmsPrimeFidUseCase", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/AcceptLoyaltyCguAnalyticsDelegate;", "acceptLoyaltyCguAnalytics", "<init>", "(Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsPrimeFidUseCase;Lcom/carrefour/fid/android/loyalty/presentation/analytics/AcceptLoyaltyCguAnalyticsDelegate;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AcceptLoyaltyCguViewModel extends BaseMVIViewModel<C26550a.C26553c, C26550a.C26555e> implements AcceptLoyaltyCguAnalytics {

    /* renamed from: c */
    public static final int f64859c = 8;
    @C12579k

    /* renamed from: a */
    public final GetCmsPrimeFidUseCase f64860a;

    /* renamed from: b */
    public final /* synthetic */ AcceptLoyaltyCguAnalyticsDelegate f64861b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AcceptLoyaltyCguViewModel(@C12579k GetCmsPrimeFidUseCase getCmsPrimeFidUseCase, @C12579k AcceptLoyaltyCguAnalyticsDelegate acceptLoyaltyCguAnalyticsDelegate) {
        super(new C26550a.C26553c(false, (String) null, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getCmsPrimeFidUseCase, "getCmsPrimeFidUseCase");
        Intrinsics.checkNotNullParameter(acceptLoyaltyCguAnalyticsDelegate, "acceptLoyaltyCguAnalytics");
        this.f64860a = getCmsPrimeFidUseCase;
        this.f64861b = acceptLoyaltyCguAnalyticsDelegate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77197e0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel$loadLoyaltyCguInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel$loadLoyaltyCguInfo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel$loadLoyaltyCguInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel$loadLoyaltyCguInfo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel$loadLoyaltyCguInfo$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005b
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.shared.base.u$d r7 = r6.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c r7 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a.C26553c) r7
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a.C26553c.m113054h(r7, r4, r5, r3, r5)
            r6.publishState(r7)
            com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidUseCase r7 = r6.f64860a
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m173128invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r6
        L_0x005b:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r7)
            r2 = 0
            if (r1 != 0) goto L_0x0076
            java.lang.String r7 = (java.lang.String) r7
            com.carrefour.fid.android.shared.base.u$d r1 = r0.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c r1 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a.C26553c) r1
            if (r7 != 0) goto L_0x006e
            java.lang.String r7 = ""
        L_0x006e:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c r7 = r1.mo77214g(r2, r7)
            r0.publishState(r7)
            goto L_0x008b
        L_0x0076:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$b r7 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$b
            r7.<init>(r1)
            r0.emitEvent(r7)
            com.carrefour.fid.android.shared.base.u$d r7 = r0.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c r7 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a.C26553c) r7
            com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a.C26553c.m113054h(r7, r2, r5, r3, r5)
            r0.publishState(r7)
        L_0x008b:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel.mo77197e0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C26550a.C26555e eVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (!(eVar instanceof C26550a.C26551a)) {
            return C11079d2.f28267a;
        }
        Object e0 = mo77197e0(cVar);
        if (e0 == C11063b.m42612h()) {
            return e0;
        }
        return C11079d2.f28267a;
    }

    public void sendTagClickAcceptLoyaltyCGU() {
        this.f64861b.sendTagClickAcceptLoyaltyCGU();
    }

    public void sendTagClickDenyLoyaltyCGU() {
        this.f64861b.sendTagClickDenyLoyaltyCGU();
    }

    public void sendTagScreenAcceptLoyaltyCGU() {
        this.f64861b.sendTagScreenAcceptLoyaltyCGU();
    }
}
