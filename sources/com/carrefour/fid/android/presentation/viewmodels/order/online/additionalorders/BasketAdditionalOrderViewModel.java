package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26906e;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.util.C28935i;
import dagger.hilt.android.lifecycle.C10245a;
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
@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/BasketAdditionalOrderViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/e$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/e$c;", "intent", "Lkotlin/d2;", "g0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/e$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer$CountDownState;", "state", "e0", "f0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/basket/i0;", "a", "Lcom/carrefour/fid/android/domain/interactors/basket/i0;", "switchBasketTypeUseCase", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/basket/i0;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketAdditionalOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketAdditionalOrderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/BasketAdditionalOrderViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class BasketAdditionalOrderViewModel extends BaseMVIViewModel<C26906e.C26910b, C26906e.C26913c> {

    /* renamed from: b */
    public static final int f65240b = 8;
    @C12579k

    /* renamed from: a */
    public final C37576i0 f65241a;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel$a */
    public /* synthetic */ class C26733a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomCountDownTimer.CountDownState.values().length];
            try {
                iArr[CustomCountDownTimer.CountDownState.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BasketAdditionalOrderViewModel(@C12579k C37576i0 i0Var) {
        super(C26906e.C26910b.C26912b.f65563b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(i0Var, "switchBasketTypeUseCase");
        this.f65241a = i0Var;
    }

    /* renamed from: e0 */
    public final void mo77690e0(CustomCountDownTimer.CountDownState countDownState) {
        if (C26733a.$EnumSwitchMapping$0[countDownState.ordinal()] == 1) {
            emitEvent(C26906e.C26907a.C26909b.f65561a);
            return;
        }
        C28935i iVar = C28935i.f70940a;
        C28935i.m119704b(iVar, "timer additional order state :" + countDownState + " ", (Throwable) null, 0, 6, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77691f0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel$leaveAdditionalOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel$leaveAdditionalOrder$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel$leaveAdditionalOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel$leaveAdditionalOrder$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel$leaveAdditionalOrder$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.basket.i0 r5 = r4.f65241a
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x005b
            kotlin.d2 r5 = (kotlin.C11079d2) r5
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.e$a$a r5 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26906e.C26907a.C26908a.f65559a
            r0.emitEvent(r5)
        L_0x005b:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel.mo77691f0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: g0 */
    public Object processIntent(@C12579k C26906e.C26913c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C26906e.C26913c.C26914a) {
            mo77690e0(((C26906e.C26913c.C26914a) cVar).mo78155d());
        } else if (cVar instanceof C26906e.C26913c.C26915b) {
            Object f0 = mo77691f0(cVar2);
            if (f0 == C11063b.m42612h()) {
                return f0;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }
}
