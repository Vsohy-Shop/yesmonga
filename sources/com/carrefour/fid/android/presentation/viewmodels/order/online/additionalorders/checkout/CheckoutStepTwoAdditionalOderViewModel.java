package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.core.type.LoyaltyBalanceType;
import com.carrefour.fid.android.core.type.ValidatePaymentType;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29016s;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11945o;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001CB^\b\u0007\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010`\u001a\u00020^\u0012\u0007\u0010\u0001\u001a\u00020a\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)H@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u0004\u0018\u00010)H@ø\u0001\u0000¢\u0006\u0004\b-\u0010(J\u001b\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0011\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0001J\t\u00105\u001a\u00020\u0007H\u0001J\t\u00106\u001a\u00020\u0007H\u0001J\u001b\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u000e\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\u0014J\u0006\u0010=\u001a\u00020\u0007J\u000e\u0010?\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0014J\u0006\u0010@\u001a\u00020;J\u0006\u0010A\u001a\u00020\u0007R\u0014\u0010E\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020f0j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010pR\u0016\u0010t\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020.0u8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001c\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0u8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010wR\u0016\u0010\u001a\u0004\u0018\u00010|8BX\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$c;", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/CheckoutStepTwoTracking;", "", "withLoading", "Lkotlin/d2;", "x0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/models/CheckoutStepTwoModel;", "checkoutStepTwoModel", "E0", "(Lcom/carrefour/fid/android/presentation/models/CheckoutStepTwoModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "loyaltyTotalAmount", "discountTotalAmount", "isLoyaltyActivated", "z0", "(Ljava/lang/Double;Ljava/lang/Double;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "", "loyaltyAmount", "O0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "paymentSettingsModel", "P0", "(Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "settings", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "w0", "(Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;Lcom/carrefour/fid/android/domain/models/BasketDomain;Lkotlin/coroutines/c;)Ljava/lang/Object;", "isPaymentOnSite", "isFullLoyaltyChecked", "totalAmount", "Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "G0", "(ZZLjava/lang/Double;)Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "B0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/account/UserCards;", "userCards", "D0", "(Lcom/carrefour/fid/android/domain/models/account/UserCards;Lkotlin/coroutines/c;)Ljava/lang/Object;", "C0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$b$g;", "loyaltyBalance", "N0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$b$g;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/CheckoutStepTwoTracking$LoyaltyStatus;", "status", "h", "m", "s", "intent", "L0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "amount", "Lkotlinx/coroutines/c2;", "K0", "J0", "code", "v0", "M0", "I0", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "a", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "b", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "d", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "getLoyaltyBalanceUseCase", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "e", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "getLoyaltyCardNumberUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "f", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "loyaltyAuthenticationUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "g", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "getFacilityDetailsByAnabelKeyUseCase", "Lcom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase;", "Lcom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase;", "validatePaymentUseCase", "Landroidx/lifecycle/p0;", "j", "Landroidx/lifecycle/p0;", "savedStateHandle", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/common/state/a;", "k", "Lkotlinx/coroutines/flow/j;", "_secretCodeState", "Lkotlinx/coroutines/flow/u;", "l", "Lkotlinx/coroutines/flow/u;", "F0", "()Lkotlinx/coroutines/flow/u;", "secretCodeState", "Ljava/lang/String;", "fidAmountAwaitingVerification", "n", "Z", "useAllFidAwaitingVerification", "Lkotlinx/coroutines/flow/i;", "o", "Lkotlinx/coroutines/flow/i;", "_loyaltyBalance", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "p", "_storeService", "Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType;", "y0", "()Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType;", "getLoyaltyBalanceType", "state", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/s;", "tracking", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;Lcom/carrefour/fid/android/domain/interactors/loyalty/b;Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;Lcom/carrefour/fid/android/domain/interactors/service/e;Lcom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase;Landroidx/lifecycle/p0;Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/s;)V", "q", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStepTwoAdditionalOderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepTwoAdditionalOderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,509:1\n230#2,5:510\n288#3,2:515\n1747#3,3:517\n1549#3:520\n1620#3,3:521\n*S KotlinDebug\n*F\n+ 1 CheckoutStepTwoAdditionalOderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel\n*L\n156#1:510,5\n190#1:515,2\n336#1:517,3\n481#1:520\n481#1:521,3\n*E\n"})
public final class CheckoutStepTwoAdditionalOderViewModel extends BaseMVIViewModel<C26944g.C26954b, C26944g.C26964c> implements CheckoutStepTwoTracking {
    @C12579k

    /* renamed from: q */
    public static final C26778a f65337q = new C26778a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f65338r = 8;
    @C12579k

    /* renamed from: s */
    public static final String f65339s = "display_loyalty_note";
    @C12579k

    /* renamed from: a */
    public final C37878e f65340a;
    @C12579k

    /* renamed from: b */
    public final LoyaltyPreferencesStorage f65341b;
    @C12579k

    /* renamed from: c */
    public final C37569f0 f65342c;
    @C12579k

    /* renamed from: d */
    public final GetLoyaltyBalanceUseCase f65343d;
    @C12579k

    /* renamed from: e */
    public final C37697b f65344e;
    @C12579k

    /* renamed from: f */
    public final LoyaltyAuthenticationUseCase f65345f;
    @C12579k

    /* renamed from: g */
    public final C37816e f65346g;
    @C12579k

    /* renamed from: h */
    public final ValidatePaymentUseCase f65347h;

    /* renamed from: i */
    public final /* synthetic */ C29016s f65348i;
    @C12579k

    /* renamed from: j */
    public final C19456p0 f65349j;
    @C12579k

    /* renamed from: k */
    public final C11940j<C26141a> f65350k;
    @C12579k

    /* renamed from: l */
    public final C11952u<C26141a> f65351l;
    @C12580l

    /* renamed from: m */
    public String f65352m;

    /* renamed from: n */
    public boolean f65353n;
    @C12579k

    /* renamed from: o */
    public final C11911i<C26944g.C26954b.C26961g> f65354o;
    @C12579k

    /* renamed from: p */
    public final C11911i<StoreService> f65355p;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$a */
    public static final class C26778a {
        public /* synthetic */ C26778a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26778a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CheckoutStepTwoAdditionalOderViewModel(@C12579k C37878e eVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C37569f0 f0Var, @C12579k GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, @C12579k C37697b bVar, @C12579k LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase, @C12579k C37816e eVar2, @C12579k ValidatePaymentUseCase validatePaymentUseCase, @C12579k C19456p0 p0Var, @C12579k C29016s sVar) {
        super(C26944g.C26954b.C26957c.f65642b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        C37878e eVar3 = eVar;
        LoyaltyPreferencesStorage loyaltyPreferencesStorage2 = loyaltyPreferencesStorage;
        C37569f0 f0Var2 = f0Var;
        GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase2 = getLoyaltyBalanceUseCase;
        C37697b bVar2 = bVar;
        LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase2 = loyaltyAuthenticationUseCase;
        C37816e eVar4 = eVar2;
        ValidatePaymentUseCase validatePaymentUseCase2 = validatePaymentUseCase;
        C29016s sVar2 = sVar;
        Intrinsics.checkNotNullParameter(eVar3, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(f0Var2, "retrieveBasketUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyBalanceUseCase2, "getLoyaltyBalanceUseCase");
        Intrinsics.checkNotNullParameter(bVar2, "getLoyaltyCardNumberUseCase");
        Intrinsics.checkNotNullParameter(loyaltyAuthenticationUseCase2, "loyaltyAuthenticationUseCase");
        Intrinsics.checkNotNullParameter(eVar4, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(validatePaymentUseCase2, "validatePaymentUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "state");
        Intrinsics.checkNotNullParameter(sVar2, "tracking");
        this.f65340a = eVar3;
        this.f65341b = loyaltyPreferencesStorage2;
        this.f65342c = f0Var2;
        this.f65343d = getLoyaltyBalanceUseCase2;
        this.f65344e = bVar2;
        this.f65345f = loyaltyAuthenticationUseCase2;
        this.f65346g = eVar4;
        this.f65347h = validatePaymentUseCase2;
        this.f65348i = sVar2;
        this.f65349j = p0Var;
        C11940j<C26141a> a = C11953v.m47628a(new C26141a(false, false, 3, (DefaultConstructorMarker) null));
        this.f65350k = a;
        this.f65351l = C11909g.m47470m(a);
        mo77872s();
        mo77871m();
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.f65354o = C11945o.m47609a(1, 0, bufferOverflow);
        this.f65355p = C11945o.m47609a(1, 0, bufferOverflow);
    }

    /* renamed from: A0 */
    public static /* synthetic */ Object m113713A0(CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, Double d, Double d2, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return checkoutStepTwoAdditionalOderViewModel.mo77877z0(d, d2, z, cVar);
    }

    /* renamed from: H0 */
    public static /* synthetic */ ValidatePaymentType m113714H0(CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, boolean z, boolean z2, Double d, int i, Object obj) {
        if ((i & 4) != 0) {
            d = null;
        }
        return checkoutStepTwoAdditionalOderViewModel.mo77861G0(z, z2, d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        r6 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params((java.lang.String) r13);
        r0.L$0 = r5;
        r0.L$1 = null;
        r0.label = 2;
        r13 = r2.m173041invokegIAlus(r6, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r13 != r1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r5 = kotlin.Result.m38705e(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r5 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r4 = ((java.lang.Number) r13).doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r4 != 0.0d) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r3 == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26961g(new com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty((java.lang.String) null, false, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        r0.L$0 = r2;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        if (r2.mo77867N0(r13, r0) != r1) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        r0.mo77870h(com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.f71089b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26961g(new com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty(java.lang.String.valueOf(r4), true, (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        r0.L$0 = r2;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if (r2.mo77867N0(r13, r0) != r1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r0.mo77870h(com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.f71088a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        r2.mo77870h(com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.f71089b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ff, code lost:
        if ((r5 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutCardFidNotSecuredThrowable) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        r0.L$0 = r2;
        r0.label = 5;
        r13 = r2.mo77858D0((com.carrefour.fid.android.domain.models.account.UserCards) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010a, code lost:
        if (r13 != r1) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        r0.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26959e(new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel((java.lang.Double) null, (java.lang.String) r13)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26961g(new com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty((java.lang.String) null, false, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        r0.L$0 = r2;
        r0.L$1 = r5;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        if (r2.mo77867N0(r13, r0) != r1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
        r0 = r2;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        if ((r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutNotAcceptedCardFidThrowable) != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        r0.emitEvent(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26945a.C26948c(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77856B0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0063;
                case 2: goto L_0x0055;
                case 3: goto L_0x004c;
                case 4: goto L_0x0043;
                case 5: goto L_0x003a;
                case 6: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x002d:
            java.lang.Object r1 = r0.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r0
            kotlin.C11661u0.m45747n(r13)
            goto L_0x013e
        L_0x003a:
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r0
            kotlin.C11661u0.m45747n(r13)
            goto L_0x010e
        L_0x0043:
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r0
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00f2
        L_0x004c:
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r0
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00cb
        L_0x0055:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r2
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0098
        L_0x0063:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r2 = (com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r5
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0082
        L_0x006f:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r2 = r12.f65343d
            r0.L$0 = r12
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r13 = r12.mo77858D0(r4, r0)
            if (r13 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r5 = r12
        L_0x0082:
            java.lang.String r13 = (java.lang.String) r13
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params r6 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params
            r6.<init>(r13)
            r0.L$0 = r5
            r0.L$1 = r4
            r13 = 2
            r0.label = r13
            java.lang.Object r13 = r2.m173041invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params) r6, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r0)
            if (r13 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r2 = r5
        L_0x0098:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r13)
            if (r5 != 0) goto L_0x00f8
            java.lang.Number r13 = (java.lang.Number) r13
            double r4 = r13.doubleValue()
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            if (r3 == 0) goto L_0x00d2
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g
            com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty r9 = new com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r13.<init>(r9)
            r0.L$0 = r2
            r3 = 3
            r0.label = r3
            java.lang.Object r13 = r2.mo77867N0(r13, r0)
            if (r13 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            r0 = r2
        L_0x00cb:
            com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking$LoyaltyStatus r13 = com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.NO_LOYALTY
            r0.mo77870h(r13)
            goto L_0x014a
        L_0x00d2:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g
            com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty r3 = new com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty
            java.lang.String r7 = java.lang.String.valueOf(r4)
            r8 = 1
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r13.<init>(r3)
            r0.L$0 = r2
            r3 = 4
            r0.label = r3
            java.lang.Object r13 = r2.mo77867N0(r13, r0)
            if (r13 != r1) goto L_0x00f1
            return r1
        L_0x00f1:
            r0 = r2
        L_0x00f2:
            com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking$LoyaltyStatus r13 = com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.CARD
            r0.mo77870h(r13)
            goto L_0x014a
        L_0x00f8:
            com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking$LoyaltyStatus r13 = com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.NO_LOYALTY
            r2.mo77870h(r13)
            boolean r13 = r5 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutCardFidNotSecuredThrowable
            if (r13 == 0) goto L_0x011e
            r0.L$0 = r2
            r13 = 5
            r0.label = r13
            java.lang.Object r13 = r2.mo77858D0(r4, r0)
            if (r13 != r1) goto L_0x010d
            return r1
        L_0x010d:
            r0 = r2
        L_0x010e:
            java.lang.String r13 = (java.lang.String) r13
            com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel r1 = new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel
            r1.<init>(r4, r13)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e
            r13.<init>(r1)
            r0.publishState(r13)
            goto L_0x014a
        L_0x011e:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g
            com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty r3 = new com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 7
            r11 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r13.<init>(r3)
            r0.L$0 = r2
            r0.L$1 = r5
            r3 = 6
            r0.label = r3
            java.lang.Object r13 = r2.mo77867N0(r13, r0)
            if (r13 != r1) goto L_0x013c
            return r1
        L_0x013c:
            r0 = r2
            r1 = r5
        L_0x013e:
            boolean r13 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutNotAcceptedCardFidThrowable
            if (r13 != 0) goto L_0x014a
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c
            r13.<init>(r1)
            r0.emitEvent(r13)
        L_0x014a:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77856B0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77857C0(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.account.UserCards> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardFid$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.user.e r5 = r4.f65340a
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.label = r3
            java.lang.Object r5 = r5.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x007e
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            java.util.List r5 = r5.mo116669w()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0064:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r5.next()
            com.carrefour.fid.android.domain.models.account.UserCards r1 = (com.carrefour.fid.android.domain.models.account.UserCards) r1
            java.lang.String r2 = "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.account.UserCards"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r0.add(r1)
            goto L_0x0064
        L_0x0079:
            com.carrefour.fid.android.domain.models.account.UserCards r5 = com.carrefour.fid.android.account.data.entities.extentions.C13187j.m57159d(r0)
            goto L_0x007f
        L_0x007e:
            r5 = 0
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77857C0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77858D0(com.carrefour.fid.android.domain.models.account.UserCards r5, kotlin.coroutines.C11045c<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26780x272e67f9
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardNumberFromCache$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26780x272e67f9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardNumberFromCache$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardNumberFromCache$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.models.account.UserCards r5 = (com.carrefour.fid.android.domain.models.account.UserCards) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r6 = r4.f65341b
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.getLoyaltyCardNumber(r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            if (r3 == 0) goto L_0x005e
            if (r5 == 0) goto L_0x0058
            java.lang.String r5 = r5.mo116763k()
            goto L_0x0059
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 != 0) goto L_0x005d
            java.lang.String r5 = ""
        L_0x005d:
            return r5
        L_0x005e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77858D0(com.carrefour.fid.android.domain.models.account.UserCards, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77859E0(com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel r14, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyInfo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyInfo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyInfo$1
            r0.<init>(r13, r15)
        L_0x0018:
            r5 = r0
            java.lang.Object r15 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 4
            r3 = 3
            r4 = 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L_0x0073
            if (r1 == r7) goto L_0x0061
            if (r1 == r4) goto L_0x004c
            if (r1 == r3) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0129
        L_0x0035:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003d:
            java.lang.Object r14 = r5.L$2
            java.lang.Object r1 = r5.L$1
            com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel r1 = (com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel) r1
            java.lang.Object r3 = r5.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r3
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0102
        L_0x004c:
            java.lang.Object r14 = r5.L$3
            com.carrefour.fid.android.domain.models.service.models.StoreService r14 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r14
            java.lang.Object r1 = r5.L$2
            java.lang.Object r4 = r5.L$1
            com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel r4 = (com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel) r4
            java.lang.Object r8 = r5.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r8
            kotlin.C11661u0.m45747n(r15)
            r15 = r1
            r1 = r4
            goto L_0x00dc
        L_0x0061:
            java.lang.Object r14 = r5.L$1
            com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel r14 = (com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel) r14
            java.lang.Object r1 = r5.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r1
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0092
        L_0x0073:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.domain.interactors.service.e r15 = r13.f65346g
            java.lang.String r1 = r14.mo121346h()
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r1)
            com.carrefour.fid.android.domain.models.service.models.a r1 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r1)
            r5.L$0 = r13
            r5.L$1 = r14
            r5.label = r7
            java.lang.Object r15 = r15.m172966invokegIAlus(r1, r5)
            if (r15 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r1 = r13
        L_0x0092:
            boolean r8 = kotlin.Result.m38710j(r15)
            if (r8 == 0) goto L_0x0105
            r8 = r15
            com.carrefour.fid.android.domain.models.service.models.l r8 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r8
            java.util.List r8 = r8.mo119367K()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00a5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c1
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r10
            java.lang.String r10 = r10.mo119167K()
            java.lang.String r11 = r14.mo121349j()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00a5
            goto L_0x00c2
        L_0x00c1:
            r9 = r6
        L_0x00c2:
            r8 = r9
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r8
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.domain.models.service.models.StoreService> r9 = r1.f65355p
            r5.L$0 = r1
            r5.L$1 = r14
            r5.L$2 = r15
            r5.L$3 = r8
            r5.label = r4
            java.lang.Object r4 = r9.emit(r8, r5)
            if (r4 != r0) goto L_0x00d8
            return r0
        L_0x00d8:
            r12 = r1
            r1 = r14
            r14 = r8
            r8 = r12
        L_0x00dc:
            java.lang.Double r4 = r1.mo121348i()
            java.lang.Double r9 = r1.mo121345g()
            r10 = 0
            if (r14 == 0) goto L_0x00ee
            boolean r14 = r14.mo119185b0()
            if (r14 != r7) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r7 = r10
        L_0x00ef:
            r5.L$0 = r8
            r5.L$1 = r1
            r5.L$2 = r15
            r5.L$3 = r6
            r5.label = r3
            java.lang.Object r14 = r8.mo77877z0(r4, r9, r7, r5)
            if (r14 != r0) goto L_0x0100
            return r0
        L_0x0100:
            r14 = r15
            r3 = r8
        L_0x0102:
            r15 = r14
            r14 = r1
            r1 = r3
        L_0x0105:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r15)
            if (r3 == 0) goto L_0x0129
            java.lang.Double r3 = r14.mo121348i()
            java.lang.Double r14 = r14.mo121345g()
            r4 = 0
            r7 = 4
            r8 = 0
            r5.L$0 = r15
            r5.L$1 = r6
            r5.L$2 = r6
            r5.label = r2
            r2 = r3
            r3 = r14
            r6 = r7
            r7 = r8
            java.lang.Object r14 = m113713A0(r1, r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L_0x0129
            return r0
        L_0x0129:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77859E0(com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: F0 */
    public final C11952u<C26141a> mo77860F0() {
        return this.f65351l;
    }

    /* renamed from: G0 */
    public final ValidatePaymentType mo77861G0(boolean z, boolean z2, Double d) {
        String str;
        if (z) {
            return ValidatePaymentType.IsOnSite.f89962b;
        }
        if (mo77876y0() instanceof LoyaltyBalanceType.LoyaltyBalanceNotEmpty) {
            LoyaltyBalanceType y0 = mo77876y0();
            Intrinsics.checkNotNull(y0, "null cannot be cast to non-null type com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty");
            LoyaltyBalanceType.LoyaltyBalanceNotEmpty loyaltyBalanceNotEmpty = (LoyaltyBalanceType.LoyaltyBalanceNotEmpty) y0;
            if (!z2) {
                str = loyaltyBalanceNotEmpty.mo108555g();
            } else if (d == null || StringKt.m118946z(loyaltyBalanceNotEmpty.mo108556h(), 0.0d, 1, (Object) null) <= d.doubleValue()) {
                str = loyaltyBalanceNotEmpty.mo108556h();
            } else {
                str = d.toString();
            }
        } else {
            str = "0";
        }
        return new ValidatePaymentType.InitPayment(str);
    }

    /* renamed from: I0 */
    public final void mo77862I0() {
        C26141a value;
        C11940j<C26141a> jVar = this.f65350k;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, C26141a.m111733d(value, false, false, 2, (Object) null)));
    }

    /* renamed from: J0 */
    public final void mo77863J0() {
        LoyaltyBalanceType y0 = mo77876y0();
        if (!(y0 instanceof LoyaltyBalanceType.LoyaltyBalanceNotEmpty)) {
            return;
        }
        if (StringKt.m118946z(((LoyaltyBalanceType.LoyaltyBalanceNotEmpty) y0).mo108556h(), 0.0d, 1, (Object) null) < 10.0d) {
            emitEvent(C26944g.C26945a.C26953h.f65638a);
            return;
        }
        this.f65353n = true;
        emitEvent(C26944g.C26945a.C26947b.f65626a);
        emitEvent(C26944g.C26945a.C26946a.f65624a);
    }

    @C12579k
    /* renamed from: K0 */
    public final C11723c2 mo77864K0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "amount");
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1(str, this, (C11045c<? super CheckoutStepTwoAdditionalOderViewModel$onValidateFidAmount$1>) null), 3, (Object) null);
    }

    @C12580l
    /* renamed from: L0 */
    public Object processIntent(@C12579k C26944g.C26964c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        boolean z;
        if (cVar instanceof C26944g.C26964c.C26966b) {
            Object x0 = mo77875x0(((C26944g.C26964c.C26966b) cVar).mo78351d(), cVar2);
            if (x0 == C11063b.m42612h()) {
                return x0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26944g.C26964c.C26968d) {
            Object O0 = mo77868O0(((C26944g.C26964c.C26968d) cVar).mo78363d(), cVar2);
            if (O0 == C11063b.m42612h()) {
                return O0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26944g.C26964c.C26969e) {
            Object P0 = mo77869P0(((C26944g.C26964c.C26969e) cVar).mo78369d(), cVar2);
            if (P0 == C11063b.m42612h()) {
                return P0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26944g.C26964c.C26967c) {
            Object E0 = mo77859E0(((C26944g.C26964c.C26967c) cVar).mo78357d(), cVar2);
            if (E0 == C11063b.m42612h()) {
                return E0;
            }
            return C11079d2.f28267a;
        } else {
            if (Intrinsics.areEqual((Object) cVar, (Object) C26944g.C26964c.C26965a.f65656a)) {
                Boolean bool = (Boolean) this.f65349j.mo57648h(f65339s);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                publishState(new C26944g.C26954b.C26962h(z));
            }
            return C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: M0 */
    public final C11723c2 mo77866M0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1(this, (C11045c<? super CheckoutStepTwoAdditionalOderViewModel$resetFidCode$1>) null), 3, (Object) null);
    }

    /* renamed from: N0 */
    public final Object mo77867N0(C26944g.C26954b.C26961g gVar, C11045c<? super C11079d2> cVar) {
        publishState(gVar);
        Object emit = this.f65354o.emit(gVar, cVar);
        if (emit == C11063b.m42612h()) {
            return emit;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77868O0(java.lang.String r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validateLoyaltyAmount$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validateLoyaltyAmount$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validateLoyaltyAmount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validateLoyaltyAmount$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validateLoyaltyAmount$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00aa
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            kotlin.C11661u0.m45747n(r10)
            r4 = 0
            double r6 = com.carrefour.fid.android.shared.extension.StringKt.m118945y(r9, r4)
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0049
            r10 = r3
            goto L_0x004a
        L_0x0049:
            r10 = 0
        L_0x004a:
            if (r10 == 0) goto L_0x0059
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f
            com.carrefour.fid.android.core.type.LoyaltyAmountType$ResetLoyaltyAmount r10 = com.carrefour.fid.android.core.type.LoyaltyAmountType.ResetLoyaltyAmount.f89874d
            r9.<init>(r10)
            r8.publishState(r9)
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x0059:
            com.carrefour.fid.android.core.type.LoyaltyBalanceType r10 = r8.mo77876y0()
            boolean r10 = r10 instanceof com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty
            if (r10 == 0) goto L_0x0074
            com.carrefour.fid.android.core.type.LoyaltyBalanceType r10 = r8.mo77876y0()
            java.lang.String r2 = "null cannot be cast to non-null type com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r2)
            com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty r10 = (com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceNotEmpty) r10
            java.lang.String r10 = r10.mo108556h()
            double r4 = com.carrefour.fid.android.shared.extension.StringKt.m118945y(r10, r4)
        L_0x0074:
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0086
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f r10 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f
            com.carrefour.fid.android.core.type.LoyaltyAmountType$FailedLoyaltyAmount r0 = new com.carrefour.fid.android.core.type.LoyaltyAmountType$FailedLoyaltyAmount
            r0.<init>(r9)
            r10.<init>(r0)
            r8.publishState(r10)
            goto L_0x00b7
        L_0x0086:
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x00b7
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g r10 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g
            com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty r2 = new com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r2.<init>(r4, r3, r5)
            r10.<init>(r2)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r8.mo77867N0(r10, r0)
            if (r10 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r0 = r8
        L_0x00aa:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f r10 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f
            com.carrefour.fid.android.core.type.LoyaltyAmountType$SuccessLoyaltyAmount r1 = new com.carrefour.fid.android.core.type.LoyaltyAmountType$SuccessLoyaltyAmount
            r1.<init>(r9)
            r10.<init>(r1)
            r0.publishState(r10)
        L_0x00b7:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77868O0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77869P0(com.carrefour.fid.android.domain.models.PaymentSettingsModel r13, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validatePayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validatePayment$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validatePayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validatePayment$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$validatePayment$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r13 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00fd
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.domain.models.PaymentSettingsModel r13 = (com.carrefour.fid.android.domain.models.PaymentSettingsModel) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0069
        L_0x004e:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i r14 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i
            r14.<init>(r5)
            r12.publishState(r14)
            com.carrefour.fid.android.domain.interactors.basket.f0 r14 = r12.f65342c
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r5
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r12
        L_0x0069:
            r11 = r14
            r14 = r13
            r13 = r11
            boolean r6 = kotlin.Result.m38710j(r13)
            if (r6 == 0) goto L_0x00fe
            r6 = r13
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6
            java.util.List r7 = r6.mo116858y()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x008a
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x008a
        L_0x0088:
            r5 = r4
            goto L_0x00b8
        L_0x008a:
            java.util.Iterator r7 = r7.iterator()
        L_0x008e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0088
            java.lang.Object r8 = r7.next()
            com.carrefour.fid.android.domain.models.basket.BasketErrorMessage r8 = (com.carrefour.fid.android.domain.models.basket.BasketErrorMessage) r8
            java.lang.String r9 = r8.mo116909f()
            java.lang.String r10 = "FAILURE_CASE_SLOT_INVALID_DATE"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 != 0) goto L_0x00b5
            java.lang.String r8 = r8.mo116909f()
            java.lang.String r9 = "FAILURE_CASE_SLOT_NOT_BOOKED"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r8 = r4
            goto L_0x00b6
        L_0x00b5:
            r8 = r5
        L_0x00b6:
            if (r8 == 0) goto L_0x008e
        L_0x00b8:
            if (r5 == 0) goto L_0x00eb
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i
            r13.<init>(r4)
            r2.publishState(r13)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c r13 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c
            com.carrefour.fid.android.core.io.BasketSlotOutdatedThrowable r14 = new com.carrefour.fid.android.core.io.BasketSlotOutdatedThrowable
            com.carrefour.fid.android.domain.models.basket.BasketSlot r0 = r6.mo116826K()
            java.lang.String r0 = r0.mo116996h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "slot is outdated "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            r13.<init>(r14)
            r2.emitEvent(r13)
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x00eb:
            com.carrefour.fid.android.domain.models.BasketDomain r5 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r6)
            r0.L$0 = r2
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r14 = r2.mo77874w0(r14, r5, r0)
            if (r14 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            r0 = r2
        L_0x00fd:
            r2 = r0
        L_0x00fe:
            java.lang.Throwable r13 = kotlin.Result.m38705e(r13)
            if (r13 == 0) goto L_0x0114
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i r14 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i
            r14.<init>(r4)
            r2.publishState(r14)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c r14 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c
            r14.<init>(r13)
            r2.emitEvent(r14)
        L_0x0114:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77869P0(com.carrefour.fid.android.domain.models.PaymentSettingsModel, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public void mo77870h(@C12579k CheckoutStepTwoTracking.LoyaltyStatus loyaltyStatus) {
        Intrinsics.checkNotNullParameter(loyaltyStatus, "status");
        this.f65348i.mo77870h(loyaltyStatus);
    }

    /* renamed from: m */
    public void mo77871m() {
        this.f65348i.mo77871m();
    }

    /* renamed from: s */
    public void mo77872s() {
        this.f65348i.mo77872s();
    }

    @C12579k
    /* renamed from: v0 */
    public final C11723c2 mo77873v0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1(this, str, (C11045c<? super CheckoutStepTwoAdditionalOderViewModel$checkFidCode$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77874w0(com.carrefour.fid.android.domain.models.PaymentSettingsModel r13, com.carrefour.fid.android.domain.models.BasketDomain r14, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26779x9b4c5bd
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$confirmValidationPayment$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26779x9b4c5bd) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$confirmValidationPayment$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$confirmValidationPayment$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r13 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r13 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r13
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r14 = r15.mo21858l()
            goto L_0x00b5
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            kotlin.C11661u0.m45747n(r15)
            r15 = 0
            if (r14 == 0) goto L_0x0051
            com.carrefour.fid.android.domain.models.BasketAmounts r2 = r14.mo115498v()
            if (r2 == 0) goto L_0x0051
            double r4 = r2.mo115423B()
            java.lang.Double r2 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r4)
            goto L_0x0052
        L_0x0051:
            r2 = r15
        L_0x0052:
            r4 = 0
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Double) r2, (double) r4)
            if (r2 != 0) goto L_0x006b
            if (r14 == 0) goto L_0x007b
            com.carrefour.fid.android.domain.models.BasketAmounts r2 = r14.mo115498v()
            if (r2 == 0) goto L_0x007b
            double r4 = r2.mo115423B()
            java.lang.Double r15 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r4)
            goto L_0x007b
        L_0x006b:
            if (r14 == 0) goto L_0x007b
            com.carrefour.fid.android.domain.models.BasketAmounts r2 = r14.mo115498v()
            if (r2 == 0) goto L_0x007b
            double r4 = r2.mo115452y()
            java.lang.Double r15 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r4)
        L_0x007b:
            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase r2 = r12.f65347h
            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a r11 = new com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a
            boolean r4 = r13.mo116489k()
            boolean r5 = r13.mo116488j()
            com.carrefour.fid.android.core.type.ValidatePaymentType r5 = r12.mo77861G0(r4, r5, r15)
            boolean r7 = r13.mo116487i()
            boolean r8 = r13.mo116490l()
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.domain.models.service.models.StoreService> r15 = r12.f65355p
            java.util.List r15 = r15.mo24203d()
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r15)
            r9 = r15
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r9
            java.lang.String r10 = r13.mo116485h()
            r4 = r11
            r6 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r14 = r2.m172947invokegIAlus(r11, r0)
            if (r14 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r13 = r12
        L_0x00b5:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i r15 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i
            r0 = 0
            r15.<init>(r0)
            r13.publishState(r15)
            boolean r15 = kotlin.Result.m38710j(r14)
            if (r15 == 0) goto L_0x00da
            r15 = r14
            com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r15 = (com.carrefour.fid.android.presentation.models.PaymentConfirmationModel) r15
            androidx.lifecycle.p0 r0 = r13.f65349j
            java.lang.String r1 = "display_loyalty_note"
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            r0.mo57656q(r1, r2)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$f r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$f
            r0.<init>(r15)
            r13.emitEvent(r0)
        L_0x00da:
            java.lang.Throwable r14 = kotlin.Result.m38705e(r14)
            if (r14 == 0) goto L_0x00e8
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c r15 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c
            r15.<init>(r14)
            r13.emitEvent(r15)
        L_0x00e8:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77874w0(com.carrefour.fid.android.domain.models.PaymentSettingsModel, com.carrefour.fid.android.domain.models.BasketDomain, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2 != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77875x0(boolean r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getBasket$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getBasket$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getBasket$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0076
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.shared.base.u$d r9 = r7.getCurrentState()
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26958d
            if (r9 == 0) goto L_0x005e
            com.carrefour.fid.android.shared.base.u$d r9 = r7.getCurrentState()
            boolean r2 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26958d
            if (r2 == 0) goto L_0x0051
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$d r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26958d) r9
            goto L_0x0052
        L_0x0051:
            r9 = 0
        L_0x0052:
            r2 = 0
            if (r9 == 0) goto L_0x005c
            boolean r9 = r9.isLoading()
            if (r9 != 0) goto L_0x005c
            r2 = r3
        L_0x005c:
            if (r2 == 0) goto L_0x0068
        L_0x005e:
            if (r8 == 0) goto L_0x0068
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$d r8 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$d
            r8.<init>(r3)
            r7.publishState(r8)
        L_0x0068:
            com.carrefour.fid.android.domain.interactors.basket.f0 r8 = r7.f65342c
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r8.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r8 = r7
        L_0x0076:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r9)
            if (r0 != 0) goto L_0x00b0
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$a r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$a
            com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel r1 = new com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel
            java.lang.String r2 = r9.mo116859z()
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.StringKt.m118931k(r2)
            java.lang.String r3 = r9.mo116828M()
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r4 = r9.mo116855w()
            double r4 = r4.mo116893v()
            java.lang.Double r4 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r4)
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r9 = r9.mo116855w()
            double r5 = r9.mo116889s()
            java.lang.Double r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r5)
            r1.<init>(r2, r3, r4, r9)
            r0.<init>(r1)
            r8.publishState(r0)
            goto L_0x00b8
        L_0x00b0:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c
            r9.<init>(r0)
            r8.emitEvent(r9)
        L_0x00b8:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77875x0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: y0 */
    public final LoyaltyBalanceType mo77876y0() {
        C26944g.C26954b.C26961g gVar = (C26944g.C26954b.C26961g) CollectionsKt___CollectionsKt.m40479B2(this.f65354o.mo24203d());
        if (gVar != null) {
            return gVar.mo78334h();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Double} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c6, code lost:
        r12 = (com.carrefour.fid.android.domain.models.account.UserCards) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c8, code lost:
        if (r12 == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ca, code lost:
        r2 = r4.f65341b;
        r0.L$0 = r4;
        r0.L$1 = r9;
        r0.L$2 = r10;
        r0.L$3 = r12;
        r0.Z$0 = r11;
        r0.label = 2;
        r2 = r2.hasLoyaltyCard(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        if (r2 != r1) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00df, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
        r6 = r11;
        r11 = r9;
        r9 = r6;
        r7 = r12;
        r12 = r10;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ec, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ee, code lost:
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        if (r9 != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r4.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26959e(new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel(r12, (java.lang.String) null)));
        r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26961g(com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceDelivery.f89882e);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0116, code lost:
        if (r4.mo77867N0(r9, r0) != r1) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0118, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011c, code lost:
        r12 = r4.f65341b;
        r0.L$0 = r4;
        r0.L$1 = r11;
        r0.L$2 = r10;
        r0.L$3 = null;
        r0.Z$0 = r9;
        r0.label = 4;
        r12 = r12.hasLoyaltyCard(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012f, code lost:
        if (r12 != r1) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0131, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0139, code lost:
        if (((java.lang.Boolean) r12).booleanValue() != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013b, code lost:
        r2.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26959e(new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel(r11, (java.lang.String) null)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014a, code lost:
        if (r9 == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014c, code lost:
        r9 = r2.f65341b;
        r0.L$0 = r2;
        r0.L$1 = r10;
        r0.L$2 = null;
        r0.label = 5;
        r12 = r9.hasLoyaltyCard(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015b, code lost:
        if (r12 != r1) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015e, code lost:
        r9 = r10;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0166, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016c, code lost:
        if (r9.mo116764l() != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016f, code lost:
        r9 = r10;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0171, code lost:
        r11 = r10.f65341b;
        r0.L$0 = r10;
        r0.L$1 = r9;
        r0.L$2 = null;
        r0.label = 6;
        r12 = r11.hasLoyaltyCard(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0180, code lost:
        if (r12 != r1) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0182, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0189, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        if (r9.mo116764l() == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019c, code lost:
        if (r10.mo77856B0(r0) != r1) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a1, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a2, code lost:
        r11 = r10.f65341b;
        r0.L$0 = r10;
        r0.L$1 = r9;
        r0.label = 8;
        r12 = r11.hasLoyaltyCard(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b0, code lost:
        if (r12 != r1) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b9, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bf, code lost:
        if (r9.mo116764l() != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c1, code lost:
        r0.L$0 = r10;
        r0.L$1 = null;
        r0.label = 9;
        r12 = r10.mo77858D0((com.carrefour.fid.android.domain.models.account.UserCards) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cd, code lost:
        if (r12 != r1) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cf, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d0, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d1, code lost:
        r9.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26959e(new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel((java.lang.Double) null, (java.lang.String) r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e1, code lost:
        r0.L$0 = r10;
        r0.L$1 = null;
        r0.label = 10;
        r12 = r10.mo77858D0(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ed, code lost:
        if (r12 != r1) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ef, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f0, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f1, code lost:
        r9.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26959e(new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel((java.lang.Double) null, (java.lang.String) r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
        if (r9 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0203, code lost:
        r4.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26954b.C26959e(new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel(kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.doubleValue()), (java.lang.String) null)));
        r4.mo77870h(com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.f71090c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0220, code lost:
        r4.emitEvent(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g.C26945a.C26948c(new com.carrefour.fid.android.core.p057io.RequireAttachedLoyaltyCardThrowable()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022f, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77877z0(java.lang.Double r9, java.lang.Double r10, boolean r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyAmount$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyAmount$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyAmount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyAmount$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyAmount$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x009c;
                case 2: goto L_0x0082;
                case 3: goto L_0x007d;
                case 4: goto L_0x006a;
                case 5: goto L_0x005d;
                case 6: goto L_0x0050;
                case 7: goto L_0x004b;
                case 8: goto L_0x003e;
                case 9: goto L_0x0035;
                case 10: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002c:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r9
            kotlin.C11661u0.m45747n(r12)
            goto L_0x01f1
        L_0x0035:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r9
            kotlin.C11661u0.m45747n(r12)
            goto L_0x01d1
        L_0x003e:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r9 = (com.carrefour.fid.android.domain.models.account.UserCards) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r10
            kotlin.C11661u0.m45747n(r12)
            goto L_0x01b3
        L_0x004b:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x019f
        L_0x0050:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r9 = (com.carrefour.fid.android.domain.models.account.UserCards) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r10
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0183
        L_0x005d:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r9 = (com.carrefour.fid.android.domain.models.account.UserCards) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r10
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0160
        L_0x006a:
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$2
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            java.lang.Object r11 = r0.L$1
            java.lang.Double r11 = (java.lang.Double) r11
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0133
        L_0x007d:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0119
        L_0x0082:
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$3
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            java.lang.Object r11 = r0.L$2
            java.lang.Double r11 = (java.lang.Double) r11
            java.lang.Object r2 = r0.L$1
            java.lang.Double r2 = (java.lang.Double) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r4
            kotlin.C11661u0.m45747n(r12)
            r6 = r12
            r12 = r11
            r11 = r2
            r2 = r6
            goto L_0x00e6
        L_0x009c:
            boolean r11 = r0.Z$0
            java.lang.Object r9 = r0.L$2
            r10 = r9
            java.lang.Double r10 = (java.lang.Double) r10
            java.lang.Object r9 = r0.L$1
            java.lang.Double r9 = (java.lang.Double) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            r4 = r2
            goto L_0x00c6
        L_0x00b0:
            kotlin.C11661u0.m45747n(r12)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.Z$0 = r11
            r12 = 1
            r0.label = r12
            java.lang.Object r12 = r8.mo77857C0(r0)
            if (r12 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            r4 = r8
        L_0x00c6:
            com.carrefour.fid.android.domain.models.account.UserCards r12 = (com.carrefour.fid.android.domain.models.account.UserCards) r12
            if (r12 == 0) goto L_0x0201
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r4.f65341b
            r0.L$0 = r4
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r12
            r0.Z$0 = r11
            r5 = 2
            r0.label = r5
            java.lang.Object r2 = r2.hasLoyaltyCard(r0)
            if (r2 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            r6 = r11
            r11 = r9
            r9 = r6
            r7 = r12
            r12 = r10
            r10 = r7
        L_0x00e6:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00f1
            r9 = r11
            goto L_0x0201
        L_0x00f1:
            if (r9 != 0) goto L_0x011c
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e
            com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel r10 = new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel
            r10.<init>(r12, r3)
            r9.<init>(r10)
            r4.publishState(r9)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g
            com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceDelivery r10 = com.carrefour.fid.android.core.type.LoyaltyBalanceType.LoyaltyBalanceDelivery.f89882e
            r9.<init>(r10)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r10 = 3
            r0.label = r10
            java.lang.Object r9 = r4.mo77867N0(r9, r0)
            if (r9 != r1) goto L_0x0119
            return r1
        L_0x0119:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x011c:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r12 = r4.f65341b
            r0.L$0 = r4
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r3
            r0.Z$0 = r9
            r2 = 4
            r0.label = r2
            java.lang.Object r12 = r12.hasLoyaltyCard(r0)
            if (r12 != r1) goto L_0x0132
            return r1
        L_0x0132:
            r2 = r4
        L_0x0133:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x014a
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e
            com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel r10 = new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel
            r10.<init>(r11, r3)
            r9.<init>(r10)
            r2.publishState(r9)
            goto L_0x022d
        L_0x014a:
            if (r9 == 0) goto L_0x016f
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r9 = r2.f65341b
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r3
            r11 = 5
            r0.label = r11
            java.lang.Object r12 = r9.hasLoyaltyCard(r0)
            if (r12 != r1) goto L_0x015e
            return r1
        L_0x015e:
            r9 = r10
            r10 = r2
        L_0x0160:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L_0x0171
            boolean r11 = r9.mo116764l()
            if (r11 != 0) goto L_0x0191
            goto L_0x0171
        L_0x016f:
            r9 = r10
            r10 = r2
        L_0x0171:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r11 = r10.f65341b
            r0.L$0 = r10
            r0.L$1 = r9
            r0.L$2 = r3
            r12 = 6
            r0.label = r12
            java.lang.Object r12 = r11.hasLoyaltyCard(r0)
            if (r12 != r1) goto L_0x0183
            return r1
        L_0x0183:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L_0x01a2
            boolean r11 = r9.mo116764l()
            if (r11 == 0) goto L_0x01a2
        L_0x0191:
            r0.L$0 = r3
            r0.L$1 = r3
            r9 = 7
            r0.label = r9
            java.lang.Object r9 = r10.mo77856B0(r0)
            if (r9 != r1) goto L_0x019f
            return r1
        L_0x019f:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x01a2:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r11 = r10.f65341b
            r0.L$0 = r10
            r0.L$1 = r9
            r12 = 8
            r0.label = r12
            java.lang.Object r12 = r11.hasLoyaltyCard(r0)
            if (r12 != r1) goto L_0x01b3
            return r1
        L_0x01b3:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L_0x01e1
            boolean r11 = r9.mo116764l()
            if (r11 != 0) goto L_0x01e1
            r0.L$0 = r10
            r0.L$1 = r3
            r9 = 9
            r0.label = r9
            java.lang.Object r12 = r10.mo77858D0(r3, r0)
            if (r12 != r1) goto L_0x01d0
            return r1
        L_0x01d0:
            r9 = r10
        L_0x01d1:
            java.lang.String r12 = (java.lang.String) r12
            com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel r10 = new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel
            r10.<init>(r3, r12)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e r11 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e
            r11.<init>(r10)
            r9.publishState(r11)
            goto L_0x022d
        L_0x01e1:
            r0.L$0 = r10
            r0.L$1 = r3
            r11 = 10
            r0.label = r11
            java.lang.Object r12 = r10.mo77858D0(r9, r0)
            if (r12 != r1) goto L_0x01f0
            return r1
        L_0x01f0:
            r9 = r10
        L_0x01f1:
            java.lang.String r12 = (java.lang.String) r12
            com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel r10 = new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel
            r10.<init>(r3, r12)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e r11 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e
            r11.<init>(r10)
            r9.publishState(r11)
            goto L_0x022d
        L_0x0201:
            if (r9 == 0) goto L_0x0220
            double r9 = r9.doubleValue()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e r11 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e
            com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel r12 = new com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel
            java.lang.Double r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9)
            r12.<init>(r9, r3)
            r11.<init>(r12)
            r4.publishState(r11)
            com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking$LoyaltyStatus r9 = com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking.LoyaltyStatus.NO_CARD
            r4.mo77870h(r9)
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x0220:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c
            com.carrefour.fid.android.core.io.RequireAttachedLoyaltyCardThrowable r10 = new com.carrefour.fid.android.core.io.RequireAttachedLoyaltyCardThrowable
            r10.<init>()
            r9.<init>(r10)
            r4.emitEvent(r9)
        L_0x022d:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel.mo77877z0(java.lang.Double, java.lang.Double, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
