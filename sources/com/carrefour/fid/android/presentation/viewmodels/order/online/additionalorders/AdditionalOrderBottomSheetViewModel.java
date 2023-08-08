package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37541b;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
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
@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderBottomSheetViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/a$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/a$c;", "intent", "Lkotlin/d2;", "h0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "orderId", "f0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/r;", "orderDetails", "g0", "(Lcom/carrefour/fid/android/domain/models/r;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "getOrderOnlineDetailUseCase", "Lcom/carrefour/fid/android/domain/interactors/additionalorder/b;", "b", "Lcom/carrefour/fid/android/domain/interactors/additionalorder/b;", "appSetAdditionalOrderContextUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/PrepareAdditionalOrderBasketUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/order/PrepareAdditionalOrderBasketUseCase;", "prepareAdditionalOrderBasketUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;Lcom/carrefour/fid/android/domain/interactors/additionalorder/b;Lcom/carrefour/fid/android/domain/interactors/order/PrepareAdditionalOrderBasketUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AdditionalOrderBottomSheetViewModel extends BaseMVIViewModel<C26836a.C26841b, C26836a.C26845c> {

    /* renamed from: d */
    public static final int f65204d = 8;
    @C12579k

    /* renamed from: a */
    public final GetOrderOnlineDetailUseCase f65205a;
    @C12579k

    /* renamed from: b */
    public final C37541b f65206b;
    @C12579k

    /* renamed from: c */
    public final PrepareAdditionalOrderBasketUseCase f65207c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AdditionalOrderBottomSheetViewModel(@C12579k GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, @C12579k C37541b bVar, @C12579k PrepareAdditionalOrderBasketUseCase prepareAdditionalOrderBasketUseCase, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        super(C26836a.C26841b.C26843b.f65440b, coroutineDispatcher, (C19456p0) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getOrderOnlineDetailUseCase, "getOrderOnlineDetailUseCase");
        Intrinsics.checkNotNullParameter(bVar, "appSetAdditionalOrderContextUseCase");
        Intrinsics.checkNotNullParameter(prepareAdditionalOrderBasketUseCase, "prepareAdditionalOrderBasketUseCase");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f65205a = getOrderOnlineDetailUseCase;
        this.f65206b = bVar;
        this.f65207c = prepareAdditionalOrderBasketUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77642f0(java.lang.String r14, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$initAdditionalOrderProcess$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$initAdditionalOrderProcess$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$initAdditionalOrderProcess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$initAdditionalOrderProcess$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$initAdditionalOrderProcess$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00a2
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0035:
            java.lang.Object r14 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel r14 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel) r14
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x006f
        L_0x0043:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.shared.base.u$d r15 = r13.getCurrentState()
            boolean r15 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a.C26841b.C26844c
            if (r15 != 0) goto L_0x0053
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b$c r15 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a.C26841b.C26844c.f65442b
            r13.publishState(r15)
        L_0x0053:
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase r15 = r13.f65205a
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 30
            r12 = 0
            r5 = r2
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.L$0 = r13
            r0.label = r4
            java.lang.Object r15 = r15.m172980invokegIAlus(r2, r0)
            if (r15 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r14 = r13
        L_0x006f:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r15)
            if (r2 == 0) goto L_0x0080
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$b r15 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$b
            r15.<init>(r2)
            r14.emitEvent(r15)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        L_0x0080:
            boolean r2 = kotlin.Result.m38710j(r15)
            if (r2 == 0) goto L_0x00a2
            r2 = r15
            com.carrefour.fid.android.domain.models.r r2 = (com.carrefour.fid.android.domain.models.C38120r) r2
            boolean r4 = r2.mo118937I()
            if (r4 != 0) goto L_0x0097
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$a r15 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a.C26837a.C26838a.f65434a
            r14.emitEvent(r15)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        L_0x0097:
            r0.L$0 = r15
            r0.label = r3
            java.lang.Object r14 = r14.mo77643g0(r2, r0)
            if (r14 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel.mo77642f0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094 A[Catch:{ all -> 0x0036 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77643g0(com.carrefour.fid.android.domain.models.C38120r r12, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26720xf2fb64c0
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$prepareAdditionalOrderBasket$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26720xf2fb64c0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$prepareAdditionalOrderBasket$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel$prepareAdditionalOrderBasket$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel r12 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel) r12
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x0036 }
            kotlin.Result r13 = (kotlin.Result) r13     // Catch:{ all -> 0x0036 }
            java.lang.Object r13 = r13.mo21858l()     // Catch:{ all -> 0x0036 }
            goto L_0x0095
        L_0x0036:
            r12 = move-exception
            goto L_0x00c3
        L_0x0039:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0041:
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel r12 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel) r12
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            r13.mo21858l()
            goto L_0x0086
        L_0x004e:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.domain.interactors.additionalorder.b r13 = r11.f65206b
            java.lang.String r2 = r12.mo118951W()
            java.lang.String r6 = com.carrefour.fid.android.domain.models.order.C38078a.m157201b(r2)
            java.lang.String r2 = r12.mo118969g0()
            java.lang.String r8 = com.carrefour.fid.android.domain.models.slot.SlotId.m158308b(r2)
            java.lang.String r2 = r12.mo118944P()
            java.lang.String r7 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r2)
            java.lang.String r12 = r12.mo118948T()
            java.lang.String r9 = com.carrefour.fid.android.domain.models.service.models.C38153f.m158109b(r12)
            com.carrefour.fid.android.domain.models.additionalorder.a r12 = new com.carrefour.fid.android.domain.models.additionalorder.a
            r10 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r12 = r13.m172966invokegIAlus(r12, r0)
            if (r12 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r12 = r11
        L_0x0086:
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase r13 = r12.f65207c     // Catch:{ all -> 0x0036 }
            r0.L$0 = r12     // Catch:{ all -> 0x0036 }
            r0.label = r3     // Catch:{ all -> 0x0036 }
            java.lang.Object r13 = r13.m172984invokeIoAF18A(r0)     // Catch:{ all -> 0x0036 }
            if (r13 != r1) goto L_0x0095
            return r1
        L_0x0095:
            boolean r0 = kotlin.Result.m38710j(r13)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x00a8
            r0 = r13
            kotlin.d2 r0 = (kotlin.C11079d2) r0     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b$b r0 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a.C26841b.C26843b.f65440b     // Catch:{ all -> 0x0036 }
            r12.publishState(r0)     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$c r0 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a.C26837a.C26840c.f65438a     // Catch:{ all -> 0x0036 }
            r12.emitEvent(r0)     // Catch:{ all -> 0x0036 }
        L_0x00a8:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r13)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x00bb
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b$b r1 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a.C26841b.C26843b.f65440b     // Catch:{ all -> 0x0036 }
            r12.publishState(r1)     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$b r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$b     // Catch:{ all -> 0x0036 }
            r1.<init>(r0)     // Catch:{ all -> 0x0036 }
            r12.emitEvent(r1)     // Catch:{ all -> 0x0036 }
        L_0x00bb:
            kotlin.Result r12 = kotlin.Result.m38701a(r13)     // Catch:{ all -> 0x0036 }
            kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x0036 }
            goto L_0x00cc
        L_0x00c3:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            kotlin.Result.m38702b(r12)
        L_0x00cc:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel.mo77643g0(com.carrefour.fid.android.domain.models.r, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: h0 */
    public Object processIntent(@C12579k C26836a.C26845c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (!(cVar instanceof C26836a.C26845c.C26846a)) {
            return C11079d2.f28267a;
        }
        Object f0 = mo77642f0(((C26836a.C26845c.C26846a) cVar).mo77919d(), cVar2);
        if (f0 == C11063b.m42612h()) {
            return f0;
        }
        return C11079d2.f28267a;
    }
}
