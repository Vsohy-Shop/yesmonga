package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.presentation.analytics.SuccessCreateCardAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.SuccessCreateCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.SuccessCreateCard;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\bH\u0001J\t\u0010\f\u001a\u00020\bH\u0001J\t\u0010\r\u001a\u00020\bH\u0001J\u001b\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/SuccessCreateCardViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/SuccessCreateCardAnalytics;", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "primeList", "Lkotlin/d2;", "getUserInformation", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "sendAppsFlyerTagCardCreation", "sendTagOnClickGo", "sendTagScreenView", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/SuccessCreateCardAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/presentation/analytics/SuccessCreateCardAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSuccessCreateCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessCreateCardViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/create/SuccessCreateCardViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 SuccessCreateCardViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/create/SuccessCreateCardViewModel\n*L\n36#1:42\n36#1:43,3\n*E\n"})
public final class SuccessCreateCardViewModel extends BaseMVIViewModel<SuccessCreateCard.UIState, SuccessCreateCard.UserAction> implements SuccessCreateCardAnalytics {
    private final /* synthetic */ SuccessCreateCardAnalyticsDelegate $$delegate_0;
    @C12579k
    private final C37878e getUserInfoUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public SuccessCreateCardViewModel(@C12579k C37878e eVar, @C12579k SuccessCreateCardAnalyticsDelegate successCreateCardAnalyticsDelegate) {
        super(new SuccessCreateCard.UIState((String) null, (List) null, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(successCreateCardAnalyticsDelegate, "analytics");
        this.getUserInfoUseCase = eVar;
        this.$$delegate_0 = successCreateCardAnalyticsDelegate;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getUserInformation(java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel$getUserInformation$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel$getUserInformation$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel$getUserInformation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel$getUserInformation$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel$getUserInformation$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0054
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.user.e r6 = r4.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r4
        L_0x0054:
            boolean r1 = kotlin.Result.m38709i(r6)
            if (r1 == 0) goto L_0x005d
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x005d:
            com.carrefour.fid.android.shared.base.u$d r1 = r0.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.SuccessCreateCard$UIState r1 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.SuccessCreateCard.UIState) r1
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6
            java.lang.String r6 = r6.mo116664s()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r5, r3)
            r2.<init>(r3)
            java.util.Iterator r5 = r5.iterator()
        L_0x007d:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0091
            java.lang.Object r3 = r5.next()
            com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r3 = (com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r3
            com.carrefour.fid.android.loyalty.presentation.models.DataPrimeCmsModel r3 = com.carrefour.fid.android.loyalty.presentation.models.extension.DataPrimeCmsModelKt.toDataPrimeCmsModel((com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r3)
            r2.add(r3)
            goto L_0x007d
        L_0x0091:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.SuccessCreateCard$UIState r5 = r1.copy(r6, r2)
            r0.publishState(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel.getUserInformation(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendAppsFlyerTagCardCreation() {
        this.$$delegate_0.sendAppsFlyerTagCardCreation();
    }

    public void sendTagOnClickGo() {
        this.$$delegate_0.sendTagOnClickGo();
    }

    public void sendTagScreenView() {
        this.$$delegate_0.sendTagScreenView();
    }

    @C12580l
    public Object processIntent(@C12579k SuccessCreateCard.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (!(userAction instanceof SuccessCreateCard.GetUserInformation)) {
            return C11079d2.f28267a;
        }
        Object userInformation = getUserInformation(((SuccessCreateCard.GetUserInformation) userAction).getPrimeList(), cVar);
        return userInformation == C11063b.m42612h() ? userInformation : C11079d2.f28267a;
    }
}
