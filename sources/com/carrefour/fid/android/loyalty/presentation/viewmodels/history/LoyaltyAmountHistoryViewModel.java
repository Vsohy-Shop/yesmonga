package com.carrefour.fid.android.loyalty.presentation.viewmodels.history;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAmountHistoryAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAmountHistoryAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.models.TransactionsModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory;
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
import kotlin.text.C11620r;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B!\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\t\u0010\u0014\u001a\u00020\u0007H\u0001J\u001b\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/LoyaltyAmountHistoryViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAmountHistoryAnalytics;", "", "date", "Lkotlin/d2;", "getListCardOperation", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyCardOperationHistoryDomain;", "list", "getUserTransactions", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "balance", "checkNegativeAmount", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$PartialState;", "partialState", "publishState", "sendScreenView", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase;", "getFidHistoryUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserTransactionsUseCase;", "getUserTransactionsUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserTransactionsUseCase;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAmountHistoryAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserTransactionsUseCase;Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAmountHistoryAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyAmountHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyAmountHistoryViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/history/LoyaltyAmountHistoryViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1549#2:83\n1620#2,3:84\n*S KotlinDebug\n*F\n+ 1 LoyaltyAmountHistoryViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/history/LoyaltyAmountHistoryViewModel\n*L\n64#1:83\n64#1:84,3\n*E\n"})
public final class LoyaltyAmountHistoryViewModel extends BaseMVIViewModel<LoyaltyAmountHistory.UIState, LoyaltyAmountHistory.UserAction> implements LoyaltyAmountHistoryAnalytics {
    private final /* synthetic */ LoyaltyAmountHistoryAnalyticsDelegate $$delegate_0;
    @C12579k
    private final GetFidHistoryUseCase getFidHistoryUseCase;
    @C12579k
    private final GetUserTransactionsUseCase getUserTransactionsUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public LoyaltyAmountHistoryViewModel(@C12579k GetFidHistoryUseCase getFidHistoryUseCase2, @C12579k GetUserTransactionsUseCase getUserTransactionsUseCase2, @C12579k LoyaltyAmountHistoryAnalyticsDelegate loyaltyAmountHistoryAnalyticsDelegate) {
        super(new LoyaltyAmountHistory.UIState(false, false, (TransactionsModel) null, (List) null, 15, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getFidHistoryUseCase2, "getFidHistoryUseCase");
        Intrinsics.checkNotNullParameter(getUserTransactionsUseCase2, "getUserTransactionsUseCase");
        Intrinsics.checkNotNullParameter(loyaltyAmountHistoryAnalyticsDelegate, "analytics");
        this.getFidHistoryUseCase = getFidHistoryUseCase2;
        this.getUserTransactionsUseCase = getUserTransactionsUseCase2;
        this.$$delegate_0 = loyaltyAmountHistoryAnalyticsDelegate;
    }

    private final void checkNegativeAmount(String str) {
        boolean z;
        Float floatOrNull = C11620r.toFloatOrNull(str);
        if (floatOrNull == null || floatOrNull.floatValue() >= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        publishState(new LoyaltyAmountHistory.PartialState.CheckNegativeAmount(z));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getListCardOperation(java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getListCardOperation$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getListCardOperation$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getListCardOperation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getListCardOperation$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getListCardOperation$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r3) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            kotlin.C11661u0.m45747n(r8)
            goto L_0x008f
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel r7 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x006b
        L_0x0043:
            kotlin.C11661u0.m45747n(r8)
            if (r7 != 0) goto L_0x0050
            com.carrefour.fid.android.shared.util.h$a r7 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            java.lang.String r8 = "MM/yyyy"
            java.lang.String r7 = r7.mo84244n(r8)
        L_0x0050:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$Loading r8 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$Loading
            r8.<init>(r3, r5, r4, r5)
            r6.publishState(r8)
            com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase r8 = r6.getFidHistoryUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$Param
            r2.<init>(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.m173039invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain>>>) r0)
            if (r8 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r7 = r6
        L_0x006b:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r8)
            if (r2 != 0) goto L_0x007e
            java.util.List r8 = (java.util.List) r8
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.getUserTransactions(r8, r0)
            if (r7 != r1) goto L_0x008f
            return r1
        L_0x007e:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$Loading r8 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$Loading
            r0 = 0
            r8.<init>(r0, r5, r4, r5)
            r7.publishState(r8)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$UiEvent$ErrorHistory r8 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$UiEvent$ErrorHistory
            r8.<init>(r2)
            r7.emitEvent(r8)
        L_0x008f:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel.getListCardOperation(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getUserTransactions(java.util.List<com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getUserTransactions$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getUserTransactions$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getUserTransactions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getUserTransactions$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel$getUserTransactions$1
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
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0052
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase r6 = r4.getUserTransactionsUseCase
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m173053invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r4
        L_0x0052:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r6)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0090
            com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain r6 = (com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain) r6
            if (r6 == 0) goto L_0x0062
            com.carrefour.fid.android.loyalty.presentation.models.TransactionsModel r3 = com.carrefour.fid.android.loyalty.presentation.models.extension.TransactionsModelKt.toModel((com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain) r6)
        L_0x0062:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r5, r1)
            r6.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0087
            java.lang.Object r1 = r5.next()
            com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain r1 = (com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain) r1
            com.carrefour.fid.android.loyalty.presentation.models.OperationHistoryModel r1 = com.carrefour.fid.android.loyalty.presentation.models.extension.OperationHistoryModelKt.toModel((com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain) r1)
            r6.add(r1)
            goto L_0x0073
        L_0x0087:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$GetHistoryTransaction r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$GetHistoryTransaction
            r5.<init>(r2, r3, r6)
            r0.publishState(r5)
            goto L_0x00a1
        L_0x0090:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$Loading r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$PartialState$Loading
            r6 = 2
            r5.<init>(r2, r3, r6, r3)
            r0.publishState(r5)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$UiEvent$ErrorHistory r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory$UiEvent$ErrorHistory
            r5.<init>(r1)
            r0.emitEvent(r5)
        L_0x00a1:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel.getUserTransactions(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    private final void publishState(LoyaltyAmountHistory.PartialState partialState) {
        reduceAndPublishState(LoyaltyAmountHistory.INSTANCE.getReducer(), partialState);
    }

    public void sendScreenView() {
        this.$$delegate_0.sendScreenView();
    }

    @C12580l
    public Object processIntent(@C12579k LoyaltyAmountHistory.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof LoyaltyAmountHistory.UserAction.CheckBalanceReceived) {
            checkNegativeAmount(((LoyaltyAmountHistory.UserAction.CheckBalanceReceived) userAction).getBalance());
        } else if (userAction instanceof LoyaltyAmountHistory.UserAction.GetCardOperation) {
            Object listCardOperation = getListCardOperation(((LoyaltyAmountHistory.UserAction.GetCardOperation) userAction).getDate(), cVar);
            return listCardOperation == C11063b.m42612h() ? listCardOperation : C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }
}
