package com.carrefour.fid.android.presentation.viewmodels.order.online;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
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
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineDetailViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$c;", "intent", "Lkotlin/d2;", "i0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$c$b;", "g0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$c$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "j0", "", "h0", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "orderOnlineDetailUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/CancelOrderOnlineUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/order/CancelOrderOnlineUseCase;", "cancelOrderOnlineUseCase", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;", "c", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;", "ordersOnlineDetailsModelDataMapper", "Lcom/carrefour/fid/android/domain/interactors/slot/ShiftSlotRemoteConfigUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/slot/ShiftSlotRemoteConfigUseCase;", "shiftSlotRemoteConfigUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "e", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;Lcom/carrefour/fid/android/domain/interactors/order/CancelOrderOnlineUseCase;Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;Lcom/carrefour/fid/android/domain/interactors/slot/ShiftSlotRemoteConfigUseCase;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OrderOnlineDetailViewModel extends BaseMVIViewModel<C27012a.C27017b, C27012a.C27021c> {

    /* renamed from: f */
    public static final int f65165f = 8;
    @C12579k

    /* renamed from: a */
    public final GetOrderOnlineDetailUseCase f65166a;
    @C12579k

    /* renamed from: b */
    public final CancelOrderOnlineUseCase f65167b;
    @C12579k

    /* renamed from: c */
    public final C25216a f65168c;
    @C12579k

    /* renamed from: d */
    public final ShiftSlotRemoteConfigUseCase f65169d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f65170e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OrderOnlineDetailViewModel(@C12579k GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, @C12579k CancelOrderOnlineUseCase cancelOrderOnlineUseCase, @C12579k C25216a aVar, @C12579k ShiftSlotRemoteConfigUseCase shiftSlotRemoteConfigUseCase, @C12579k LoginRepository loginRepository) {
        super(C27012a.C27017b.C27019b.f65706b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getOrderOnlineDetailUseCase, "orderOnlineDetailUseCase");
        Intrinsics.checkNotNullParameter(cancelOrderOnlineUseCase, "cancelOrderOnlineUseCase");
        Intrinsics.checkNotNullParameter(aVar, "ordersOnlineDetailsModelDataMapper");
        Intrinsics.checkNotNullParameter(shiftSlotRemoteConfigUseCase, "shiftSlotRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f65166a = getOrderOnlineDetailUseCase;
        this.f65167b = cancelOrderOnlineUseCase;
        this.f65168c = aVar;
        this.f65169d = shiftSlotRemoteConfigUseCase;
        this.f65170e = loginRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77589f0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$cancelOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$cancelOrder$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$cancelOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$cancelOrder$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$cancelOrder$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b r1 = (com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x008c
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.shared.base.u$d r7 = r6.getCurrentState()
            boolean r2 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b.C27020c
            if (r2 == 0) goto L_0x004d
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$c r7 = (com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b.C27020c) r7
            goto L_0x004e
        L_0x004d:
            r7 = 0
        L_0x004e:
            if (r7 == 0) goto L_0x00b7
            java.lang.String r7 = r7.mo78450j()
            if (r7 != 0) goto L_0x0057
            goto L_0x00b7
        L_0x0057:
            boolean r2 = r6.mo77591h0()
            if (r2 == 0) goto L_0x006b
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a r7 = new com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r0 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r0.<init>()
            r7.<init>(r0)
            r6.emitEvent(r7)
            goto L_0x00b4
        L_0x006b:
            com.carrefour.fid.android.shared.base.u$d r2 = r6.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b) r2
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$b r4 = com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b.C27019b.f65706b
            r6.publishState(r4)
            com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase r4 = r6.f65167b
            com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase$a r5 = new com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase$a
            r5.<init>(r7)
            r0.L$0 = r6
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r4.m172976invokegIAlus(r5, r0)
            if (r7 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r0 = r6
            r1 = r2
        L_0x008c:
            r0.publishState(r1)
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x009d
            r1 = r7
            kotlin.d2 r1 = (kotlin.C11079d2) r1
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$b r1 = com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27013a.C27015b.f65701a
            r0.emitEvent(r1)
        L_0x009d:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x00b4
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a
            com.carrefour.fid.android.core.io.CancelOrderOnlineThrowable r2 = new com.carrefour.fid.android.core.io.CancelOrderOnlineThrowable
            java.lang.String r7 = r7.getMessage()
            r2.<init>(r7)
            r1.<init>(r2)
            r0.emitEvent(r1)
        L_0x00b4:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x00b7:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel.mo77589f0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77590g0(com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27021c.C27023b r18, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$getOrderDetails$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$getOrderDetails$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$getOrderDetails$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$getOrderDetails$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel$getOrderDetails$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x005b
            if (r4 == r7) goto L_0x0049
            if (r4 != r6) goto L_0x0041
            int r3 = r2.I$0
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$b r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27021c.C27023b) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00c0
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0049:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$b r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27021c.C27023b) r4
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0070
        L_0x005b:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase r1 = r0.f65169d
            r2.L$0 = r0
            r4 = r18
            r2.L$1 = r4
            r2.label = r7
            java.lang.Object r1 = r1.m173009invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x006f
            return r3
        L_0x006f:
            r8 = r0
        L_0x0070:
            boolean r9 = kotlin.Result.m38709i(r1)
            if (r9 == 0) goto L_0x0077
            r1 = 0
        L_0x0077:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0080
            boolean r1 = r1.booleanValue()
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b.C27020c
            if (r9 == 0) goto L_0x008c
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x008c:
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$b r9 = com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a.C27017b.C27019b.f65706b
            r8.publishState(r9)
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase r9 = r8.f65166a
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a r15 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a
            java.lang.String r11 = r4.mo78462j()
            java.lang.String r12 = "details-commande"
            java.lang.String r13 = r4.mo78461i()
            java.lang.String r14 = r4.mo78459h()
            java.lang.String r16 = r4.mo78458g()
            r10 = r15
            r5 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            r2.L$0 = r8
            r2.L$1 = r4
            r2.I$0 = r1
            r2.label = r6
            java.lang.Object r2 = r9.m172980invokegIAlus(r5, r2)
            if (r2 != r3) goto L_0x00bd
            return r3
        L_0x00bd:
            r3 = r1
            r1 = r2
            r2 = r8
        L_0x00c0:
            boolean r5 = kotlin.Result.m38710j(r1)
            if (r5 == 0) goto L_0x00df
            r5 = r1
            com.carrefour.fid.android.domain.models.r r5 = (com.carrefour.fid.android.domain.models.C38120r) r5
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$c r6 = new com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$c
            java.lang.String r4 = r4.mo78462j()
            com.carrefour.fid.android.presentation.ui.orders.online.mapper.a r8 = r2.f65168c
            if (r3 == 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            java.util.List r3 = r8.mo73294a(r5, r7)
            r6.<init>(r4, r3)
            r2.publishState(r6)
        L_0x00df:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x00ed
            com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a r3 = new com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a
            r3.<init>(r1)
            r2.emitEvent(r3)
        L_0x00ed:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel.mo77590g0(com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$b, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h0 */
    public final boolean mo77591h0() {
        return !C13181d.m57146e(this.f65170e.mo31354f());
    }

    @C12580l
    /* renamed from: i0 */
    public Object processIntent(@C12579k C27012a.C27021c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (Intrinsics.areEqual((Object) cVar, (Object) C27012a.C27021c.C27022a.f65711a)) {
            Object f0 = mo77589f0(cVar2);
            if (f0 == C11063b.m42612h()) {
                return f0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C27012a.C27021c.C27023b) {
            Object g0 = mo77590g0((C27012a.C27021c.C27023b) cVar, cVar2);
            if (g0 == C11063b.m42612h()) {
                return g0;
            }
            return C11079d2.f28267a;
        } else {
            if (cVar instanceof C27012a.C27021c.C27024c) {
                mo77593j0();
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: j0 */
    public final void mo77593j0() {
        C27012a.C27017b.C27020c cVar;
        String j;
        C28505u.C28509d currentState = getCurrentState();
        if (currentState instanceof C27012a.C27017b.C27020c) {
            cVar = (C27012a.C27017b.C27020c) currentState;
        } else {
            cVar = null;
        }
        if (cVar != null && (j = cVar.mo78450j()) != null) {
            emitEvent(new C27012a.C27013a.C27016c(j, true));
        }
    }
}
