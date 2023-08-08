package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.data.entities.mapper.C36496i0;
import com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.feedback.C37686a;
import com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.C38049m;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.ecommerce.checkout.manager.C38208a;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29003g;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29005h;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11661u0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10975r0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003.2\u0010By\b\u0007\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\t\u0010\b\u001a\u00020\u0005H\u0001J\t\u0010\t\u001a\u00020\u0005H\u0001J\u001d\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001J\t\u0010\u000f\u001a\u00020\u0005H\u0001J\t\u0010\u0010\u001a\u00020\u0005H\u0001J\u001b\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u001d\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H@ø\u0001\u0000¢\u0006\u0004\b'\u0010&J\b\u0010(\u001a\u00020\u0005H\u0002J\u0016\u0010,\u001a\u00020\n2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$c;", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/g;", "Lkotlin/d2;", "A", "v", "O", "Q", "", "basketType", "", "isBasketBusiness", "F", "X", "c", "intent", "q0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "success", "l0", "(Lkotlin/jvm/functions/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$c$b;", "initialValues", "r0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$c$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/r;", "ordersOnlineDetails", "o0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$c$b;Lcom/carrefour/fid/android/domain/models/r;Lkotlin/coroutines/c;)Ljava/lang/Object;", "n0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "p0", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmationModel", "t0", "(Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "s0", "sendAirshipEvent", "", "Lcom/carrefour/fid/android/domain/models/OfferProductDomain;", "offers", "m0", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "a", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/i0;", "b", "Lcom/carrefour/fid/android/domain/interactors/basket/i0;", "switchBasketTypeUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/i;", "Lcom/carrefour/fid/android/domain/interactors/criteo/i;", "criteoSendCriteoEventUseCase", "Lcom/carrefour/fid/android/ecommerce/checkout/manager/a;", "d", "Lcom/carrefour/fid/android/ecommerce/checkout/manager/a;", "checkoutTrackingManager", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "e", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "getOfferProductListUseCase", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "f", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "g", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/feedback/OrderFeedbackUseCase;", "h", "Lcom/carrefour/fid/android/domain/interactors/feedback/OrderFeedbackUseCase;", "feedbackUseCase", "Lcom/carrefour/fid/android/domain/interactors/feedback/a;", "i", "Lcom/carrefour/fid/android/domain/interactors/feedback/a;", "checkFeedbackConsentUseCase", "Lcom/carrefour/fid/android/data/entities/mapper/i0;", "j", "Lcom/carrefour/fid/android/data/entities/mapper/i0;", "feedbackModelMapper", "Lcom/carrefour/fid/android/tracking/a;", "k", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/domain/interactors/account/order/GetOnlineOrderByIdUseCase;", "l", "Lcom/carrefour/fid/android/domain/interactors/account/order/GetOnlineOrderByIdUseCase;", "getOnlineOrderByIdUseCase", "Lcom/carrefour/fid/android/domain/interactors/store/GetDeliveryStoreUseCase;", "m", "Lcom/carrefour/fid/android/domain/interactors/store/GetDeliveryStoreUseCase;", "getDeliveryStoreUseCase", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/h;", "checkoutConfirmationTracking", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/domain/interactors/basket/i0;Lcom/carrefour/fid/android/domain/interactors/criteo/i;Lcom/carrefour/fid/android/ecommerce/checkout/manager/a;Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/feedback/OrderFeedbackUseCase;Lcom/carrefour/fid/android/domain/interactors/feedback/a;Lcom/carrefour/fid/android/data/entities/mapper/i0;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/domain/interactors/account/order/GetOnlineOrderByIdUseCase;Lcom/carrefour/fid/android/domain/interactors/store/GetDeliveryStoreUseCase;Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/h;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutConfirmationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1603#2,9:289\n1855#2:298\n1856#2:300\n1612#2:301\n1855#2:302\n1856#2:304\n1549#2:305\n1620#2,3:306\n1549#2:309\n1620#2,3:310\n1549#2:313\n1620#2,3:314\n1855#2,2:317\n1#3:299\n1#3:303\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel\n*L\n236#1:289,9\n236#1:298\n236#1:300\n236#1:301\n241#1:302\n241#1:304\n261#1:305\n261#1:306,3\n262#1:309\n262#1:310,3\n263#1:313\n263#1:314,3\n279#1:317,2\n236#1:299\n*E\n"})
public final class CheckoutConfirmationViewModel extends BaseMVIViewModel<C26748b, C26752c> implements C29003g {

    /* renamed from: o */
    public static final int f65247o = 8;
    @C12579k

    /* renamed from: a */
    public final C37569f0 f65248a;
    @C12579k

    /* renamed from: b */
    public final C37576i0 f65249b;
    @C12579k

    /* renamed from: c */
    public final C37670i f65250c;
    @C12579k

    /* renamed from: d */
    public final C38208a f65251d;
    @C12579k

    /* renamed from: e */
    public final GetOfferProductListUseCase f65252e;
    @C12579k

    /* renamed from: f */
    public final AccountRepository f65253f;
    @C12579k

    /* renamed from: g */
    public final LoyaltyPreferencesStorage f65254g;
    @C12579k

    /* renamed from: h */
    public final OrderFeedbackUseCase f65255h;
    @C12579k

    /* renamed from: i */
    public final C37686a f65256i;
    @C12579k

    /* renamed from: j */
    public final C36496i0 f65257j;
    @C12579k

    /* renamed from: k */
    public final C28994a f65258k;
    @C12579k

    /* renamed from: l */
    public final GetOnlineOrderByIdUseCase f65259l;
    @C12579k

    /* renamed from: m */
    public final GetDeliveryStoreUseCase f65260m;

    /* renamed from: n */
    public final /* synthetic */ C29005h f65261n;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$1", mo22502f = "CheckoutConfirmationViewModel.kt", mo22503i = {}, mo22504l = {121, 122}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$1 */
    public static final class C267401 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ CheckoutConfirmationViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C267401(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11944n uiState = this.this$0.getUiState();
                C267411 r1 = new C11304p<C26748b, C11045c<? super Boolean>, Object>((C11045c<? super C267411>) null) {
                    /* synthetic */ Object L$0;
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C267411 r0 = 

                        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a */
                        public interface C26742a extends C28505u.C28506a {

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$a */
                            public static final class C26743a implements C26742a {
                                @C12579k

                                /* renamed from: a */
                                public static final C26743a f65262a = new C26743a();

                                /* renamed from: b */
                                public static final int f65263b = 0;
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$b */
                            public static final class C26744b implements C26742a {

                                /* renamed from: b */
                                public static final int f65264b = 0;

                                /* renamed from: a */
                                public final boolean f65265a;

                                public C26744b(boolean z) {
                                    this.f65265a = z;
                                }

                                /* renamed from: c */
                                public static /* synthetic */ C26744b m113577c(C26744b bVar, boolean z, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        z = bVar.f65265a;
                                    }
                                    return bVar.mo77716b(z);
                                }

                                /* renamed from: a */
                                public final boolean mo77715a() {
                                    return this.f65265a;
                                }

                                @C12579k
                                /* renamed from: b */
                                public final C26744b mo77716b(boolean z) {
                                    return new C26744b(z);
                                }

                                /* renamed from: d */
                                public final boolean mo77717d() {
                                    return this.f65265a;
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C26744b) && this.f65265a == ((C26744b) obj).f65265a;
                                }

                                public int hashCode() {
                                    boolean z = this.f65265a;
                                    if (z) {
                                        return 1;
                                    }
                                    return z ? 1 : 0;
                                }

                                @C12579k
                                public String toString() {
                                    boolean z = this.f65265a;
                                    return "DisplayStoreFeedback(enabled=" + z + ")";
                                }
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$c */
                            public static final class C26745c implements C26742a {

                                /* renamed from: b */
                                public static final int f65266b = 0;

                                /* renamed from: a */
                                public final boolean f65267a;

                                public C26745c(boolean z) {
                                    this.f65267a = z;
                                }

                                /* renamed from: c */
                                public static /* synthetic */ C26745c m113581c(C26745c cVar, boolean z, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        z = cVar.f65267a;
                                    }
                                    return cVar.mo77722b(z);
                                }

                                /* renamed from: a */
                                public final boolean mo77721a() {
                                    return this.f65267a;
                                }

                                @C12579k
                                /* renamed from: b */
                                public final C26745c mo77722b(boolean z) {
                                    return new C26745c(z);
                                }

                                /* renamed from: d */
                                public final boolean mo77723d() {
                                    return this.f65267a;
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C26745c) && this.f65267a == ((C26745c) obj).f65267a;
                                }

                                public int hashCode() {
                                    boolean z = this.f65267a;
                                    if (z) {
                                        return 1;
                                    }
                                    return z ? 1 : 0;
                                }

                                @C12579k
                                public String toString() {
                                    boolean z = this.f65267a;
                                    return "DisplayStoreFeedbackDialog(enabled=" + z + ")";
                                }
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d */
                            public static final class C26746d implements C26742a {

                                /* renamed from: b */
                                public static final int f65268b = 8;
                                @C12579k

                                /* renamed from: a */
                                public final Throwable f65269a;

                                public C26746d(@C12579k Throwable th) {
                                    Intrinsics.checkNotNullParameter(th, "throwable");
                                    this.f65269a = th;
                                }

                                /* renamed from: c */
                                public static /* synthetic */ C26746d m113585c(C26746d dVar, Throwable th, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        th = dVar.f65269a;
                                    }
                                    return dVar.mo77728b(th);
                                }

                                @C12579k
                                /* renamed from: a */
                                public final Throwable mo77727a() {
                                    return this.f65269a;
                                }

                                @C12579k
                                /* renamed from: b */
                                public final C26746d mo77728b(@C12579k Throwable th) {
                                    Intrinsics.checkNotNullParameter(th, "throwable");
                                    return new C26746d(th);
                                }

                                @C12579k
                                /* renamed from: d */
                                public final Throwable mo77729d() {
                                    return this.f65269a;
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C26746d) && Intrinsics.areEqual((Object) this.f65269a, (Object) ((C26746d) obj).f65269a);
                                }

                                public int hashCode() {
                                    return this.f65269a.hashCode();
                                }

                                @C12579k
                                public String toString() {
                                    Throwable th = this.f65269a;
                                    return "Error(throwable=" + th + ")";
                                }
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$e */
                            public static final class C26747e implements C26742a {

                                /* renamed from: b */
                                public static final int f65270b = 8;
                                @C12579k

                                /* renamed from: a */
                                public final C38049m f65271a;

                                public C26747e(@C12579k C38049m mVar) {
                                    Intrinsics.checkNotNullParameter(mVar, "feedbackModel");
                                    this.f65271a = mVar;
                                }

                                /* renamed from: c */
                                public static /* synthetic */ C26747e m113589c(C26747e eVar, C38049m mVar, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        mVar = eVar.f65271a;
                                    }
                                    return eVar.mo77734b(mVar);
                                }

                                @C12579k
                                /* renamed from: a */
                                public final C38049m mo77733a() {
                                    return this.f65271a;
                                }

                                @C12579k
                                /* renamed from: b */
                                public final C26747e mo77734b(@C12579k C38049m mVar) {
                                    Intrinsics.checkNotNullParameter(mVar, "feedbackModel");
                                    return new C26747e(mVar);
                                }

                                @C12579k
                                /* renamed from: d */
                                public final C38049m mo77735d() {
                                    return this.f65271a;
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C26747e) && Intrinsics.areEqual((Object) this.f65271a, (Object) ((C26747e) obj).f65271a);
                                }

                                public int hashCode() {
                                    return this.f65271a.hashCode();
                                }

                                @C12579k
                                public String toString() {
                                    C38049m mVar = this.f65271a;
                                    return "OpenFeedback(feedbackModel=" + mVar + ")";
                                }
                            }
                        }

                        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c */
                        public interface C26752c extends C28505u.C28507b {

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$a */
                            public static final class C26753a implements C26752c {
                                @C12579k

                                /* renamed from: a */
                                public static final C26753a f65282a = new C26753a();

                                /* renamed from: b */
                                public static final int f65283b = 0;
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b */
                            public static final class C26754b implements C26752c {

                                /* renamed from: e */
                                public static final int f65284e = 8;
                                @C12580l

                                /* renamed from: a */
                                public final OrderConfirmationModel f65285a;
                                @C12580l

                                /* renamed from: b */
                                public final String f65286b;

                                /* renamed from: c */
                                public final boolean f65287c;
                                @C12579k

                                /* renamed from: d */
                                public final String f65288d;

                                public C26754b(@C12580l OrderConfirmationModel orderConfirmationModel, @C12580l String str, boolean z, @C12579k String str2) {
                                    Intrinsics.checkNotNullParameter(str2, "initialOrderId");
                                    this.f65285a = orderConfirmationModel;
                                    this.f65286b = str;
                                    this.f65287c = z;
                                    this.f65288d = str2;
                                }

                                /* renamed from: f */
                                public static /* synthetic */ C26754b m113610f(C26754b bVar, OrderConfirmationModel orderConfirmationModel, String str, boolean z, String str2, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        orderConfirmationModel = bVar.f65285a;
                                    }
                                    if ((i & 2) != 0) {
                                        str = bVar.f65286b;
                                    }
                                    if ((i & 4) != 0) {
                                        z = bVar.f65287c;
                                    }
                                    if ((i & 8) != 0) {
                                        str2 = bVar.f65288d;
                                    }
                                    return bVar.mo77761e(orderConfirmationModel, str, z, str2);
                                }

                                @C12580l
                                /* renamed from: a */
                                public final OrderConfirmationModel mo77757a() {
                                    return this.f65285a;
                                }

                                @C12580l
                                /* renamed from: b */
                                public final String mo77758b() {
                                    return this.f65286b;
                                }

                                /* renamed from: c */
                                public final boolean mo77759c() {
                                    return this.f65287c;
                                }

                                @C12579k
                                /* renamed from: d */
                                public final String mo77760d() {
                                    return this.f65288d;
                                }

                                @C12579k
                                /* renamed from: e */
                                public final C26754b mo77761e(@C12580l OrderConfirmationModel orderConfirmationModel, @C12580l String str, boolean z, @C12579k String str2) {
                                    Intrinsics.checkNotNullParameter(str2, "initialOrderId");
                                    return new C26754b(orderConfirmationModel, str, z, str2);
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C26754b)) {
                                        return false;
                                    }
                                    C26754b bVar = (C26754b) obj;
                                    return Intrinsics.areEqual((Object) this.f65285a, (Object) bVar.f65285a) && Intrinsics.areEqual((Object) this.f65286b, (Object) bVar.f65286b) && this.f65287c == bVar.f65287c && Intrinsics.areEqual((Object) this.f65288d, (Object) bVar.f65288d);
                                }

                                @C12580l
                                /* renamed from: g */
                                public final String mo77763g() {
                                    return this.f65286b;
                                }

                                @C12579k
                                /* renamed from: h */
                                public final String mo77764h() {
                                    return this.f65288d;
                                }

                                public int hashCode() {
                                    OrderConfirmationModel orderConfirmationModel = this.f65285a;
                                    int i = 0;
                                    int hashCode = (orderConfirmationModel == null ? 0 : orderConfirmationModel.hashCode()) * 31;
                                    String str = this.f65286b;
                                    if (str != null) {
                                        i = str.hashCode();
                                    }
                                    int i2 = (hashCode + i) * 31;
                                    boolean z = this.f65287c;
                                    if (z) {
                                        z = true;
                                    }
                                    return ((i2 + (z ? 1 : 0)) * 31) + this.f65288d.hashCode();
                                }

                                @C12580l
                                /* renamed from: i */
                                public final OrderConfirmationModel mo77766i() {
                                    return this.f65285a;
                                }

                                /* renamed from: j */
                                public final boolean mo77767j() {
                                    return this.f65287c;
                                }

                                @C12579k
                                public String toString() {
                                    OrderConfirmationModel orderConfirmationModel = this.f65285a;
                                    String str = this.f65286b;
                                    boolean z = this.f65287c;
                                    String str2 = this.f65288d;
                                    return "Init(orderConfirmation=" + orderConfirmationModel + ", errorCode=" + str + ", isExpressPickup=" + z + ", initialOrderId=" + str2 + ")";
                                }
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$c */
                            public static final class C26755c implements C26752c {
                                @C12579k

                                /* renamed from: a */
                                public static final C26755c f65289a = new C26755c();

                                /* renamed from: b */
                                public static final int f65290b = 0;
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$d */
                            public static final class C26756d implements C26752c {
                                @C12579k

                                /* renamed from: a */
                                public static final C26756d f65291a = new C26756d();

                                /* renamed from: b */
                                public static final int f65292b = 0;
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        @Inject
                        public CheckoutConfirmationViewModel(@C12579k C37569f0 f0Var, @C12579k C37576i0 i0Var, @C12579k C37670i iVar, @C12579k C38208a aVar, @C12579k GetOfferProductListUseCase getOfferProductListUseCase, @C12579k AccountRepository accountRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k OrderFeedbackUseCase orderFeedbackUseCase, @C12579k C37686a aVar2, @C12579k C36496i0 i0Var2, @C12579k C28994a aVar3, @C12579k GetOnlineOrderByIdUseCase getOnlineOrderByIdUseCase, @C12579k GetDeliveryStoreUseCase getDeliveryStoreUseCase, @C12579k C29005h hVar) {
                            super(C26748b.C26751c.f65280b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
                            C37569f0 f0Var2 = f0Var;
                            C37576i0 i0Var3 = i0Var;
                            C37670i iVar2 = iVar;
                            C38208a aVar4 = aVar;
                            GetOfferProductListUseCase getOfferProductListUseCase2 = getOfferProductListUseCase;
                            AccountRepository accountRepository2 = accountRepository;
                            LoyaltyPreferencesStorage loyaltyPreferencesStorage2 = loyaltyPreferencesStorage;
                            OrderFeedbackUseCase orderFeedbackUseCase2 = orderFeedbackUseCase;
                            C37686a aVar5 = aVar2;
                            Intrinsics.checkNotNullParameter(f0Var2, "retrieveBasketUseCase");
                            Intrinsics.checkNotNullParameter(i0Var3, "switchBasketTypeUseCase");
                            Intrinsics.checkNotNullParameter(iVar2, "criteoSendCriteoEventUseCase");
                            Intrinsics.checkNotNullParameter(aVar4, "checkoutTrackingManager");
                            Intrinsics.checkNotNullParameter(getOfferProductListUseCase2, "getOfferProductListUseCase");
                            Intrinsics.checkNotNullParameter(accountRepository2, "accountRepository");
                            Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
                            Intrinsics.checkNotNullParameter(orderFeedbackUseCase2, "feedbackUseCase");
                            Intrinsics.checkNotNullParameter(aVar5, "checkFeedbackConsentUseCase");
                            Intrinsics.checkNotNullParameter(i0Var2, "feedbackModelMapper");
                            Intrinsics.checkNotNullParameter(aVar3, "audienceTrackingAdapter");
                            Intrinsics.checkNotNullParameter(getOnlineOrderByIdUseCase, "getOnlineOrderByIdUseCase");
                            Intrinsics.checkNotNullParameter(getDeliveryStoreUseCase, "getDeliveryStoreUseCase");
                            Intrinsics.checkNotNullParameter(hVar, "checkoutConfirmationTracking");
                            this.f65248a = f0Var2;
                            this.f65249b = i0Var3;
                            this.f65250c = iVar2;
                            this.f65251d = aVar4;
                            this.f65252e = getOfferProductListUseCase2;
                            this.f65253f = accountRepository2;
                            this.f65254g = loyaltyPreferencesStorage2;
                            this.f65255h = orderFeedbackUseCase2;
                            this.f65256i = aVar5;
                            this.f65257j = i0Var2;
                            this.f65258k = aVar3;
                            this.f65259l = getOnlineOrderByIdUseCase;
                            this.f65260m = getDeliveryStoreUseCase;
                            this.f65261n = hVar;
                            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C267401(this, (C11045c<? super C267401>) null), 3, (Object) null);
                            mo77712v();
                        }

                        /* renamed from: A */
                        public void mo77696A() {
                            this.f65261n.mo77696A();
                        }

                        /* renamed from: F */
                        public void mo77697F(@C12579k String str, boolean z) {
                            Intrinsics.checkNotNullParameter(str, "basketType");
                            this.f65261n.mo77697F(str, z);
                        }

                        /* renamed from: O */
                        public void mo77698O() {
                            this.f65261n.mo77698O();
                        }

                        /* renamed from: Q */
                        public void mo77699Q() {
                            this.f65261n.mo77699Q();
                        }

                        /* renamed from: X */
                        public void mo77700X() {
                            this.f65261n.mo77700X();
                        }

                        /* renamed from: c */
                        public void mo77701c() {
                            this.f65261n.mo77701c();
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
                        /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
                        /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                        /* renamed from: l0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77702l0(kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$checkStoreFeedback$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r6
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$checkStoreFeedback$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$checkStoreFeedback$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$checkStoreFeedback$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$checkStoreFeedback$1
                                r0.<init>(r4, r6)
                            L_0x0018:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x003f
                                if (r2 != r3) goto L_0x0037
                                java.lang.Object r5 = r0.L$1
                                kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
                                java.lang.Object r0 = r0.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r0
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
                                com.carrefour.fid.android.domain.interactors.feedback.a r6 = r4.f65256i
                                r0.L$0 = r4
                                r0.L$1 = r5
                                r0.label = r3
                                java.lang.Object r6 = r6.m172968invokeIoAF18A(r0)
                                if (r6 != r1) goto L_0x0051
                                return r1
                            L_0x0051:
                                r0 = r4
                            L_0x0052:
                                java.lang.Throwable r1 = kotlin.Result.m38705e(r6)
                                if (r1 == 0) goto L_0x0061
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$b r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$b
                                r2 = 0
                                r1.<init>(r2)
                                r0.emitEvent(r1)
                            L_0x0061:
                                boolean r0 = kotlin.Result.m38710j(r6)
                                if (r0 == 0) goto L_0x0074
                                java.lang.Boolean r6 = (java.lang.Boolean) r6
                                boolean r6 = r6.booleanValue()
                                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
                                r5.invoke(r6)
                            L_0x0074:
                                kotlin.d2 r5 = kotlin.C11079d2.f28267a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77702l0(kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* renamed from: m0 */
                        public final String mo77703m0(List<OfferProductDomain> list) {
                            boolean X = ((OfferProductDomain) CollectionsKt___CollectionsKt.m40706w2(list)).mo116039X();
                            for (OfferProductDomain X2 : list) {
                                if (X != X2.mo116039X()) {
                                    return C38212b.f96791K;
                                }
                            }
                            if (X) {
                                return "nonfood";
                            }
                            return "food";
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
                        /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
                        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                        /* renamed from: n0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77704n0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r18) {
                            /*
                                r17 = this;
                                r0 = r17
                                r1 = r18
                                boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getBasket$1
                                if (r2 == 0) goto L_0x0017
                                r2 = r1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getBasket$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getBasket$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x0017
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001c
                            L_0x0017:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getBasket$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getBasket$1
                                r2.<init>(r0, r1)
                            L_0x001c:
                                java.lang.Object r1 = r2.result
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r4 = r2.label
                                r5 = 2
                                r6 = 1
                                if (r4 == 0) goto L_0x0057
                                if (r4 == r6) goto L_0x0044
                                if (r4 != r5) goto L_0x003c
                                java.lang.Object r3 = r2.L$1
                                java.lang.Object r2 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r2
                                kotlin.C11661u0.m45747n(r1)
                                kotlin.Result r1 = (kotlin.Result) r1
                                r1.mo21858l()
                                goto L_0x00ae
                            L_0x003c:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r1
                            L_0x0044:
                                java.lang.Object r4 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a) r4
                                java.lang.Object r6 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r6 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r6
                                kotlin.C11661u0.m45747n(r1)
                                kotlin.Result r1 = (kotlin.Result) r1
                                java.lang.Object r1 = r1.mo21858l()
                            L_0x0055:
                                r7 = r4
                                goto L_0x007d
                            L_0x0057:
                                kotlin.C11661u0.m45747n(r1)
                                com.carrefour.fid.android.shared.base.u$d r1 = r17.getCurrentState()
                                boolean r4 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a
                                if (r4 == 0) goto L_0x0065
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a r1 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a) r1
                                goto L_0x0066
                            L_0x0065:
                                r1 = 0
                            L_0x0066:
                                r4 = r1
                                if (r4 != 0) goto L_0x006c
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            L_0x006c:
                                com.carrefour.fid.android.domain.interactors.basket.f0 r1 = r0.f65248a
                                r2.L$0 = r0
                                r2.L$1 = r4
                                r2.label = r6
                                java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
                                if (r1 != r3) goto L_0x007b
                                return r3
                            L_0x007b:
                                r6 = r0
                                goto L_0x0055
                            L_0x007d:
                                boolean r4 = kotlin.Result.m38710j(r1)
                                if (r4 == 0) goto L_0x00b0
                                r4 = r1
                                com.carrefour.fid.android.domain.models.basket.Basket r4 = (com.carrefour.fid.android.domain.models.basket.Basket) r4
                                com.carrefour.fid.android.domain.models.BasketDomain r8 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r4)
                                r9 = 0
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r13 = 0
                                r14 = 0
                                r15 = 126(0x7e, float:1.77E-43)
                                r16 = 0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a r4 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a.m113593m(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                                r6.publishState(r4)
                                com.carrefour.fid.android.domain.interactors.basket.i0 r4 = r6.f65249b
                                com.carrefour.fid.android.domain.models.basket.BasketType r7 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE
                                r2.L$0 = r6
                                r2.L$1 = r1
                                r2.label = r5
                                java.lang.Object r2 = r4.m172966invokegIAlus(r7, r2)
                                if (r2 != r3) goto L_0x00ac
                                return r3
                            L_0x00ac:
                                r3 = r1
                                r2 = r6
                            L_0x00ae:
                                r6 = r2
                                r1 = r3
                            L_0x00b0:
                                java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
                                if (r1 == 0) goto L_0x00be
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d
                                r2.<init>(r1)
                                r6.emitEvent(r2)
                            L_0x00be:
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77704n0(kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
                        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
                        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
                        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5  */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
                        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5 A[RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
                        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
                        /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8  */
                        /* JADX WARNING: Removed duplicated region for block: B:41:0x00fb  */
                        /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
                        /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
                        /* JADX WARNING: Removed duplicated region for block: B:47:0x0112  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
                        /* renamed from: o0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77705o0(com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b r22, com.carrefour.fid.android.domain.models.C38120r r23, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r24) {
                            /*
                                r21 = this;
                                r0 = r21
                                r1 = r24
                                boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getStoreInfo$1
                                if (r2 == 0) goto L_0x0017
                                r2 = r1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getStoreInfo$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getStoreInfo$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x0017
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001c
                            L_0x0017:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getStoreInfo$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$getStoreInfo$1
                                r2.<init>(r0, r1)
                            L_0x001c:
                                java.lang.Object r1 = r2.result
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r4 = r2.label
                                java.lang.String r5 = ""
                                r6 = 0
                                r7 = 0
                                r8 = 3
                                r9 = 2
                                r10 = 1
                                if (r4 == 0) goto L_0x0076
                                if (r4 == r10) goto L_0x0064
                                if (r4 == r9) goto L_0x0054
                                if (r4 != r8) goto L_0x004c
                                int r3 = r2.I$0
                                boolean r4 = r2.Z$0
                                java.lang.Object r8 = r2.L$2
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r8 = (com.carrefour.fid.android.domain.models.OrderConfirmationModel) r8
                                java.lang.Object r9 = r2.L$1
                                java.lang.String r9 = (java.lang.String) r9
                                java.lang.Object r2 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r2
                                kotlin.C11661u0.m45747n(r1)
                                r15 = r4
                                r16 = r8
                                r13 = r9
                                goto L_0x00ed
                            L_0x004c:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r1
                            L_0x0054:
                                java.lang.Object r4 = r2.L$2
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r4
                                java.lang.Object r9 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b) r9
                                java.lang.Object r11 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r11
                                kotlin.C11661u0.m45747n(r1)
                                goto L_0x00bc
                            L_0x0064:
                                java.lang.Object r4 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b) r4
                                java.lang.Object r11 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r11
                                kotlin.C11661u0.m45747n(r1)
                                kotlin.Result r1 = (kotlin.Result) r1
                                java.lang.Object r1 = r1.mo21858l()
                                goto L_0x00a1
                            L_0x0076:
                                kotlin.C11661u0.m45747n(r1)
                                com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase r1 = r0.f65260m
                                com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$a
                                com.carrefour.fid.android.domain.models.q r11 = r23.mo118942N()
                                java.lang.String r11 = r11.mo118925i()
                                com.carrefour.fid.android.domain.models.q r12 = r23.mo118942N()
                                java.lang.String r12 = r12.mo118923h()
                                r4.<init>(r11, r12)
                                r2.L$0 = r0
                                r11 = r22
                                r2.L$1 = r11
                                r2.label = r10
                                java.lang.Object r1 = r1.m173012invokegIAlus(r4, r2)
                                if (r1 != r3) goto L_0x009f
                                return r3
                            L_0x009f:
                                r4 = r11
                                r11 = r0
                            L_0x00a1:
                                java.lang.Throwable r12 = kotlin.Result.m38705e(r1)
                                if (r12 != 0) goto L_0x0112
                                com.carrefour.fid.android.domain.models.service.models.m r1 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r1
                                com.carrefour.fid.android.account.data.repositories.AccountRepository r1 = r11.f65253f
                                r2.L$0 = r11
                                r2.L$1 = r4
                                r2.L$2 = r11
                                r2.label = r9
                                java.lang.Object r1 = r1.mo31329n(r2)
                                if (r1 != r3) goto L_0x00ba
                                return r3
                            L_0x00ba:
                                r9 = r4
                                r4 = r11
                            L_0x00bc:
                                com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
                                if (r1 == 0) goto L_0x00c5
                                java.lang.String r1 = r1.mo116664s()
                                goto L_0x00c6
                            L_0x00c5:
                                r1 = r7
                            L_0x00c6:
                                if (r1 != 0) goto L_0x00c9
                                r1 = r5
                            L_0x00c9:
                                boolean r12 = r9.mo77767j()
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r9 = r9.mo77766i()
                                com.carrefour.fid.android.account.data.repositories.AccountRepository r11 = r11.f65253f
                                r2.L$0 = r4
                                r2.L$1 = r1
                                r2.L$2 = r9
                                r2.Z$0 = r12
                                r2.I$0 = r6
                                r2.label = r8
                                java.lang.Object r2 = r11.mo31329n(r2)
                                if (r2 != r3) goto L_0x00e6
                                return r3
                            L_0x00e6:
                                r13 = r1
                                r1 = r2
                                r2 = r4
                                r3 = r6
                                r16 = r9
                                r15 = r12
                            L_0x00ed:
                                r12 = 0
                                com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
                                if (r1 == 0) goto L_0x00f6
                                java.lang.String r7 = r1.mo116663r()
                            L_0x00f6:
                                if (r7 != 0) goto L_0x00fb
                                r17 = r5
                                goto L_0x00fd
                            L_0x00fb:
                                r17 = r7
                            L_0x00fd:
                                r18 = 0
                                r19 = 65
                                r20 = 0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a
                                if (r3 == 0) goto L_0x0109
                                r14 = r10
                                goto L_0x010a
                            L_0x0109:
                                r14 = r6
                            L_0x010a:
                                r11 = r1
                                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                r2.publishState(r1)
                                goto L_0x011a
                            L_0x0112:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d
                                r1.<init>(r12)
                                r11.emitEvent(r1)
                            L_0x011a:
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77705o0(com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b, com.carrefour.fid.android.domain.models.r, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
                        /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                        /* renamed from: p0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77706p0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
                            /*
                                r8 = this;
                                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$launchFeedback$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r9
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$launchFeedback$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$launchFeedback$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$launchFeedback$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$launchFeedback$1
                                r0.<init>(r8, r9)
                            L_0x0018:
                                java.lang.Object r9 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 1
                                r4 = 0
                                if (r2 == 0) goto L_0x003c
                                if (r2 != r3) goto L_0x0034
                                java.lang.Object r0 = r0.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r0
                                kotlin.C11661u0.m45747n(r9)
                                kotlin.Result r9 = (kotlin.Result) r9
                                java.lang.Object r9 = r9.mo21858l()
                                goto L_0x0084
                            L_0x0034:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r0)
                                throw r9
                            L_0x003c:
                                kotlin.C11661u0.m45747n(r9)
                                com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
                                boolean r2 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a
                                if (r2 == 0) goto L_0x004a
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a) r9
                                goto L_0x004b
                            L_0x004a:
                                r9 = r4
                            L_0x004b:
                                if (r9 != 0) goto L_0x0050
                                kotlin.d2 r9 = kotlin.C11079d2.f28267a
                                return r9
                            L_0x0050:
                                com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase r2 = r8.f65255h
                                com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$a r5 = new com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase$a
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r6 = r9.mo77752q()
                                if (r6 == 0) goto L_0x005f
                                java.lang.String r6 = r6.mo116163n()
                                goto L_0x0060
                            L_0x005f:
                                r6 = r4
                            L_0x0060:
                                java.lang.String r7 = ""
                                if (r6 != 0) goto L_0x0065
                                r6 = r7
                            L_0x0065:
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r9 = r9.mo77752q()
                                if (r9 == 0) goto L_0x0070
                                java.lang.String r9 = r9.mo116156g()
                                goto L_0x0071
                            L_0x0070:
                                r9 = r4
                            L_0x0071:
                                if (r9 != 0) goto L_0x0074
                                goto L_0x0075
                            L_0x0074:
                                r7 = r9
                            L_0x0075:
                                r5.<init>(r6, r7)
                                r0.L$0 = r8
                                r0.label = r3
                                java.lang.Object r9 = r2.m172967invokegIAlus(r5, r0)
                                if (r9 != r1) goto L_0x0083
                                return r1
                            L_0x0083:
                                r0 = r8
                            L_0x0084:
                                boolean r1 = kotlin.Result.m38710j(r9)
                                if (r1 == 0) goto L_0x00a4
                                boolean r1 = kotlin.Result.m38709i(r9)
                                if (r1 == 0) goto L_0x0091
                                goto L_0x0092
                            L_0x0091:
                                r4 = r9
                            L_0x0092:
                                com.carrefour.fid.android.domain.models.l r4 = (com.carrefour.fid.android.domain.models.C38042l) r4
                                if (r4 == 0) goto L_0x00a4
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$e r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$e
                                com.carrefour.fid.android.data.entities.mapper.i0 r1 = r0.f65257j
                                com.carrefour.fid.android.domain.models.m r1 = r1.mo72340a(r4)
                                r9.<init>(r1)
                                r0.emitEvent(r9)
                            L_0x00a4:
                                kotlin.d2 r9 = kotlin.C11079d2.f28267a
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77706p0(kotlin.coroutines.c):java.lang.Object");
                        }

                        @C12580l
                        /* renamed from: q0 */
                        public Object processIntent(@C12579k C26752c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
                            if (cVar instanceof C26752c.C26754b) {
                                Object r0 = mo77708r0((C26752c.C26754b) cVar, cVar2);
                                if (r0 == C11063b.m42612h()) {
                                    return r0;
                                }
                                return C11079d2.f28267a;
                            } else if (Intrinsics.areEqual((Object) cVar, (Object) C26752c.C26753a.f65282a)) {
                                Object l0 = mo77702l0(new CheckoutConfirmationViewModel$processIntent$2(this), cVar2);
                                if (l0 == C11063b.m42612h()) {
                                    return l0;
                                }
                                return C11079d2.f28267a;
                            } else if (Intrinsics.areEqual((Object) cVar, (Object) C26752c.C26755c.f65289a)) {
                                Object p0 = mo77706p0(cVar2);
                                if (p0 == C11063b.m42612h()) {
                                    return p0;
                                }
                                return C11079d2.f28267a;
                            } else {
                                if (Intrinsics.areEqual((Object) cVar, (Object) C26752c.C26756d.f65291a)) {
                                    sendAirshipEvent();
                                }
                                return C11079d2.f28267a;
                            }
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
                            r15 = r12;
                            r19 = r13;
                            r20 = r14;
                            r13 = r9;
                            r14 = r10;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
                            r10 = kotlin.Result.m38705e(r1);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d6, code lost:
                            if (r10 != null) goto L_0x0172;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
                            r1 = (com.carrefour.fid.android.domain.models.C38120r) r1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
                            if (r1.mo118958b0() == null) goto L_0x00ea;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e6, code lost:
                            if ((r1.mo118958b0() instanceof com.carrefour.fid.android.shared.domain.models.order.OrderType.Clcv) == false) goto L_0x00ea;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
                            r10 = 1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ea, code lost:
                            r10 = 0;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
                            if (r10 == 0) goto L_0x015d;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
                            r1 = r9.f65253f;
                            r2.L$0 = r9;
                            r2.L$1 = r4;
                            r2.L$2 = r9;
                            r2.I$0 = r10;
                            r2.label = 2;
                            r1 = r1.mo31329n(r2);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fe, code lost:
                            if (r1 != r3) goto L_0x0101;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0100, code lost:
                            return r3;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
                            r13 = r4;
                            r12 = r9;
                            r14 = r12;
                            r4 = r10;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
                            r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
                            if (r1 == null) goto L_0x010e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
                            r1 = r1.mo116664s();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
                            r1 = null;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
                            if (r1 != null) goto L_0x0113;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
                            r11 = "";
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0113, code lost:
                            r11 = r1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
                            r9 = r13.mo77767j();
                            r10 = r13.mo77766i();
                            r1 = r14.f65253f;
                            r2.L$0 = r14;
                            r2.L$1 = r13;
                            r2.L$2 = r12;
                            r2.L$3 = r11;
                            r2.L$4 = r10;
                            r2.Z$0 = r9;
                            r2.I$0 = r4;
                            r2.label = 3;
                            r1 = r1.mo31329n(r2);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0133, code lost:
                            if (r1 != r3) goto L_0x006a;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0135, code lost:
                            return r3;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
                            r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0139, code lost:
                            if (r1 == null) goto L_0x0140;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
                            r1 = r1.mo116663r();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
                            r1 = null;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0141, code lost:
                            if (r1 != null) goto L_0x0144;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0143, code lost:
                            r1 = "";
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
                            if (r4 == 0) goto L_0x0150;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:58:0x014e, code lost:
                            r12 = true;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0150, code lost:
                            r12 = false;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
                            r15.publishState(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26748b.C26749a((com.carrefour.fid.android.domain.models.BasketDomain) null, r11, r12, r13, r14, r1, (com.carrefour.fid.android.domain.models.LuckyCartTicketDomain) null, 65, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            r4 = r19;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:61:0x015d, code lost:
                            r2.L$0 = r9;
                            r2.L$1 = r4;
                            r2.label = 4;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0168, code lost:
                            if (r9.mo77705o0(r4, r1, r2) != r3) goto L_0x016b;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
                            return r3;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
                            r5 = r9;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:65:0x016c, code lost:
                            r20 = r5;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:66:0x016e, code lost:
                            r1 = r4;
                            r4 = r20;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0172, code lost:
                            r9.emitEvent(new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26742a.C26746d(r10));
                            r1 = r4;
                            r4 = r9;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017c, code lost:
                            r1 = r1.mo77766i();
                            r2.L$0 = r4;
                            r2.L$1 = null;
                            r2.L$2 = null;
                            r2.L$3 = null;
                            r2.L$4 = null;
                            r2.label = 5;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0191, code lost:
                            if (r4.mo77711t0(r1, r2) != r3) goto L_0x0194;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0193, code lost:
                            return r3;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0194, code lost:
                            r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$5(r4);
                            r2.L$0 = null;
                            r2.label = 6;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a2, code lost:
                            if (r4.mo77702l0(r1, r2) != r3) goto L_0x01a5;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a4, code lost:
                            return r3;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a7, code lost:
                            return kotlin.C11079d2.f28267a;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
                        /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
                        /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
                        /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
                        /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
                        /* JADX WARNING: Removed duplicated region for block: B:17:0x009b  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
                        /* renamed from: r0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77708r0(com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b r22, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r23) {
                            /*
                                r21 = this;
                                r0 = r21
                                r1 = r23
                                boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$1
                                if (r2 == 0) goto L_0x0017
                                r2 = r1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x0017
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001c
                            L_0x0017:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$1
                                r2.<init>(r0, r1)
                            L_0x001c:
                                java.lang.Object r1 = r2.result
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r4 = r2.label
                                java.lang.String r5 = ""
                                r6 = 0
                                r7 = 1
                                r8 = 0
                                switch(r4) {
                                    case 0: goto L_0x009b;
                                    case 1: goto L_0x0089;
                                    case 2: goto L_0x0073;
                                    case 3: goto L_0x004f;
                                    case 4: goto L_0x0042;
                                    case 5: goto L_0x0039;
                                    case 6: goto L_0x0034;
                                    default: goto L_0x002c;
                                }
                            L_0x002c:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r1
                            L_0x0034:
                                kotlin.C11661u0.m45747n(r1)
                                goto L_0x01a5
                            L_0x0039:
                                java.lang.Object r4 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r4
                                kotlin.C11661u0.m45747n(r1)
                                goto L_0x0194
                            L_0x0042:
                                java.lang.Object r4 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b) r4
                                java.lang.Object r5 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r5
                                kotlin.C11661u0.m45747n(r1)
                                goto L_0x016c
                            L_0x004f:
                                int r4 = r2.I$0
                                boolean r9 = r2.Z$0
                                java.lang.Object r10 = r2.L$4
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r10 = (com.carrefour.fid.android.domain.models.OrderConfirmationModel) r10
                                java.lang.Object r11 = r2.L$3
                                java.lang.String r11 = (java.lang.String) r11
                                java.lang.Object r12 = r2.L$2
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r12 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r12
                                java.lang.Object r13 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b r13 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b) r13
                                java.lang.Object r14 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r14 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r14
                                kotlin.C11661u0.m45747n(r1)
                            L_0x006a:
                                r15 = r12
                                r19 = r13
                                r20 = r14
                                r13 = r9
                                r14 = r10
                                goto L_0x0136
                            L_0x0073:
                                int r4 = r2.I$0
                                java.lang.Object r9 = r2.L$2
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r9
                                java.lang.Object r10 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b r10 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b) r10
                                java.lang.Object r11 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r11
                                kotlin.C11661u0.m45747n(r1)
                                r12 = r9
                                r13 = r10
                                r14 = r11
                                goto L_0x0105
                            L_0x0089:
                                java.lang.Object r4 = r2.L$1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b r4 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26752c.C26754b) r4
                                java.lang.Object r9 = r2.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r9
                                kotlin.C11661u0.m45747n(r1)
                                kotlin.Result r1 = (kotlin.Result) r1
                                java.lang.Object r1 = r1.mo21858l()
                                goto L_0x00d2
                            L_0x009b:
                                kotlin.C11661u0.m45747n(r1)
                                java.lang.String r1 = r22.mo77763g()
                                if (r1 == 0) goto L_0x00b6
                                java.lang.String r1 = r22.mo77763g()
                                boolean r1 = kotlin.text.C11622t.isBlank(r1)
                                if (r1 != 0) goto L_0x00b6
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$a r1 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.C26742a.C26743a.f65262a
                                r0.emitEvent(r1)
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            L_0x00b6:
                                com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase r1 = r0.f65259l
                                com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase$a
                                java.lang.String r9 = r22.mo77764h()
                                r4.<init>(r9)
                                r2.L$0 = r0
                                r9 = r22
                                r2.L$1 = r9
                                r2.label = r7
                                java.lang.Object r1 = r1.m172932invokegIAlus(r4, r2)
                                if (r1 != r3) goto L_0x00d0
                                return r3
                            L_0x00d0:
                                r4 = r9
                                r9 = r0
                            L_0x00d2:
                                java.lang.Throwable r10 = kotlin.Result.m38705e(r1)
                                if (r10 != 0) goto L_0x0172
                                com.carrefour.fid.android.domain.models.r r1 = (com.carrefour.fid.android.domain.models.C38120r) r1
                                com.carrefour.fid.android.shared.domain.models.order.OrderType r10 = r1.mo118958b0()
                                if (r10 == 0) goto L_0x00ea
                                com.carrefour.fid.android.shared.domain.models.order.OrderType r10 = r1.mo118958b0()
                                boolean r10 = r10 instanceof com.carrefour.fid.android.shared.domain.models.order.OrderType.Clcv
                                if (r10 == 0) goto L_0x00ea
                                r10 = r7
                                goto L_0x00eb
                            L_0x00ea:
                                r10 = r6
                            L_0x00eb:
                                if (r10 == 0) goto L_0x015d
                                com.carrefour.fid.android.account.data.repositories.AccountRepository r1 = r9.f65253f
                                r2.L$0 = r9
                                r2.L$1 = r4
                                r2.L$2 = r9
                                r2.I$0 = r10
                                r11 = 2
                                r2.label = r11
                                java.lang.Object r1 = r1.mo31329n(r2)
                                if (r1 != r3) goto L_0x0101
                                return r3
                            L_0x0101:
                                r13 = r4
                                r12 = r9
                                r14 = r12
                                r4 = r10
                            L_0x0105:
                                com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
                                if (r1 == 0) goto L_0x010e
                                java.lang.String r1 = r1.mo116664s()
                                goto L_0x010f
                            L_0x010e:
                                r1 = r8
                            L_0x010f:
                                if (r1 != 0) goto L_0x0113
                                r11 = r5
                                goto L_0x0114
                            L_0x0113:
                                r11 = r1
                            L_0x0114:
                                boolean r9 = r13.mo77767j()
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r10 = r13.mo77766i()
                                com.carrefour.fid.android.account.data.repositories.AccountRepository r1 = r14.f65253f
                                r2.L$0 = r14
                                r2.L$1 = r13
                                r2.L$2 = r12
                                r2.L$3 = r11
                                r2.L$4 = r10
                                r2.Z$0 = r9
                                r2.I$0 = r4
                                r15 = 3
                                r2.label = r15
                                java.lang.Object r1 = r1.mo31329n(r2)
                                if (r1 != r3) goto L_0x006a
                                return r3
                            L_0x0136:
                                r10 = 0
                                com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
                                if (r1 == 0) goto L_0x0140
                                java.lang.String r1 = r1.mo116663r()
                                goto L_0x0141
                            L_0x0140:
                                r1 = r8
                            L_0x0141:
                                if (r1 != 0) goto L_0x0144
                                r1 = r5
                            L_0x0144:
                                r16 = 0
                                r17 = 65
                                r18 = 0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a r5 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a
                                if (r4 == 0) goto L_0x0150
                                r12 = r7
                                goto L_0x0151
                            L_0x0150:
                                r12 = r6
                            L_0x0151:
                                r9 = r5
                                r4 = r15
                                r15 = r1
                                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                                r4.publishState(r5)
                                r4 = r19
                                goto L_0x016e
                            L_0x015d:
                                r2.L$0 = r9
                                r2.L$1 = r4
                                r5 = 4
                                r2.label = r5
                                java.lang.Object r1 = r9.mo77705o0(r4, r1, r2)
                                if (r1 != r3) goto L_0x016b
                                return r3
                            L_0x016b:
                                r5 = r9
                            L_0x016c:
                                r20 = r5
                            L_0x016e:
                                r1 = r4
                                r4 = r20
                                goto L_0x017c
                            L_0x0172:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$a$d
                                r1.<init>(r10)
                                r9.emitEvent(r1)
                                r1 = r4
                                r4 = r9
                            L_0x017c:
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r1 = r1.mo77766i()
                                r2.L$0 = r4
                                r2.L$1 = r8
                                r2.L$2 = r8
                                r2.L$3 = r8
                                r2.L$4 = r8
                                r5 = 5
                                r2.label = r5
                                java.lang.Object r1 = r4.mo77711t0(r1, r2)
                                if (r1 != r3) goto L_0x0194
                                return r3
                            L_0x0194:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$5 r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$processOrderConfirmation$5
                                r1.<init>(r4)
                                r2.L$0 = r8
                                r5 = 6
                                r2.label = r5
                                java.lang.Object r1 = r4.mo77702l0(r1, r2)
                                if (r1 != r3) goto L_0x01a5
                                return r3
                            L_0x01a5:
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77708r0(com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$c$b, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
                        /* renamed from: s0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77709s0(com.carrefour.fid.android.domain.models.OrderConfirmationModel r25, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r26) {
                            /*
                                r24 = this;
                                r0 = r24
                                r1 = r26
                                boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$sendCriteoEvent$1
                                if (r2 == 0) goto L_0x0017
                                r2 = r1
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$sendCriteoEvent$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$sendCriteoEvent$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x0017
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001c
                            L_0x0017:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$sendCriteoEvent$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$sendCriteoEvent$1
                                r2.<init>(r0, r1)
                            L_0x001c:
                                java.lang.Object r1 = r2.result
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r4 = r2.label
                                r5 = 1
                                if (r4 == 0) goto L_0x003b
                                if (r4 != r5) goto L_0x0033
                                kotlin.C11661u0.m45747n(r1)
                                kotlin.Result r1 = (kotlin.Result) r1
                                r1.mo21858l()
                                goto L_0x0120
                            L_0x0033:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r1
                            L_0x003b:
                                kotlin.C11661u0.m45747n(r1)
                                com.carrefour.fid.android.domain.interactors.criteo.i r1 = r0.f65250c
                                com.carrefour.fid.android.domain.models.criteo.CriteoEventType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoEventType.EVENT_TYPE_VIEW_TRANSACTION
                                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r7 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_TRACK_TRANSACTION
                                java.lang.String r4 = ""
                                r6 = 10
                                r9 = 0
                                if (r25 == 0) goto L_0x0079
                                java.util.List r10 = r25.mo116151c()
                                if (r10 == 0) goto L_0x0079
                                java.lang.Iterable r10 = (java.lang.Iterable) r10
                                java.util.ArrayList r11 = new java.util.ArrayList
                                int r12 = kotlin.collections.C10978t.m41495Y(r10, r6)
                                r11.<init>(r12)
                                java.util.Iterator r10 = r10.iterator()
                            L_0x0060:
                                boolean r12 = r10.hasNext()
                                if (r12 == 0) goto L_0x0077
                                java.lang.Object r12 = r10.next()
                                com.carrefour.fid.android.domain.models.OrderOfferModel r12 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r12
                                java.lang.String r12 = r12.mo116200a()
                                if (r12 != 0) goto L_0x0073
                                r12 = r4
                            L_0x0073:
                                r11.add(r12)
                                goto L_0x0060
                            L_0x0077:
                                r10 = r11
                                goto L_0x007a
                            L_0x0079:
                                r10 = r9
                            L_0x007a:
                                if (r25 == 0) goto L_0x00b2
                                java.util.List r11 = r25.mo116151c()
                                if (r11 == 0) goto L_0x00b2
                                java.lang.Iterable r11 = (java.lang.Iterable) r11
                                java.util.ArrayList r12 = new java.util.ArrayList
                                int r13 = kotlin.collections.C10978t.m41495Y(r11, r6)
                                r12.<init>(r13)
                                java.util.Iterator r11 = r11.iterator()
                            L_0x0091:
                                boolean r13 = r11.hasNext()
                                if (r13 == 0) goto L_0x00b3
                                java.lang.Object r13 = r11.next()
                                com.carrefour.fid.android.domain.models.OrderOfferModel r13 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r13
                                java.lang.Double r13 = r13.mo116201b()
                                if (r13 == 0) goto L_0x00a8
                                double r13 = r13.doubleValue()
                                goto L_0x00aa
                            L_0x00a8:
                                r13 = 0
                            L_0x00aa:
                                java.lang.Double r13 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r13)
                                r12.add(r13)
                                goto L_0x0091
                            L_0x00b2:
                                r12 = r9
                            L_0x00b3:
                                if (r25 == 0) goto L_0x00ec
                                java.util.List r11 = r25.mo116151c()
                                if (r11 == 0) goto L_0x00ec
                                java.lang.Iterable r11 = (java.lang.Iterable) r11
                                java.util.ArrayList r13 = new java.util.ArrayList
                                int r6 = kotlin.collections.C10978t.m41495Y(r11, r6)
                                r13.<init>(r6)
                                java.util.Iterator r6 = r11.iterator()
                            L_0x00ca:
                                boolean r11 = r6.hasNext()
                                if (r11 == 0) goto L_0x00ea
                                java.lang.Object r11 = r6.next()
                                com.carrefour.fid.android.domain.models.OrderOfferModel r11 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r11
                                java.lang.Integer r11 = r11.mo116202c()
                                if (r11 == 0) goto L_0x00e1
                                int r11 = r11.intValue()
                                goto L_0x00e2
                            L_0x00e1:
                                r11 = 0
                            L_0x00e2:
                                java.lang.Integer r11 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r11)
                                r13.add(r11)
                                goto L_0x00ca
                            L_0x00ea:
                                r14 = r13
                                goto L_0x00ed
                            L_0x00ec:
                                r14 = r9
                            L_0x00ed:
                                if (r25 == 0) goto L_0x00f3
                                java.lang.String r9 = r25.mo116155f()
                            L_0x00f3:
                                if (r9 != 0) goto L_0x00f8
                                r18 = r4
                                goto L_0x00fa
                            L_0x00f8:
                                r18 = r9
                            L_0x00fa:
                                com.carrefour.fid.android.domain.models.criteo.h r4 = new com.carrefour.fid.android.domain.models.criteo.h
                                r6 = r4
                                r9 = 0
                                r11 = 0
                                r13 = 0
                                r15 = 0
                                r16 = 0
                                r17 = 0
                                r19 = 0
                                r20 = 0
                                r21 = 0
                                r22 = 30548(0x7754, float:4.2807E-41)
                                r23 = 0
                                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                                com.carrefour.fid.android.domain.interactors.criteo.i$a r6 = new com.carrefour.fid.android.domain.interactors.criteo.i$a
                                r6.<init>(r4)
                                r2.label = r5
                                java.lang.Object r1 = r1.m172966invokegIAlus(r6, r2)
                                if (r1 != r3) goto L_0x0120
                                return r3
                            L_0x0120:
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77709s0(com.carrefour.fid.android.domain.models.OrderConfirmationModel, kotlin.coroutines.c):java.lang.Object");
                        }

                        public final void sendAirshipEvent() {
                            this.f65258k.mo32669d(C13758b.f33429V, C10975r0.m41401k(C11078d1.m42659a(C13758b.f33430W, C28932h.f70914a.mo84245o())));
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
                        /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb A[RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
                        /* JADX WARNING: Removed duplicated region for block: B:48:0x0103  */
                        /* JADX WARNING: Removed duplicated region for block: B:80:0x018b  */
                        /* JADX WARNING: Removed duplicated region for block: B:81:0x0190  */
                        /* JADX WARNING: Removed duplicated region for block: B:83:0x0194  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
                        /* renamed from: t0 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo77711t0(com.carrefour.fid.android.domain.models.OrderConfirmationModel r18, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
                            /*
                                r17 = this;
                                r0 = r17
                                r1 = r18
                                r2 = r19
                                boolean r3 = r2 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$trackCriteoTransaction$1
                                if (r3 == 0) goto L_0x0019
                                r3 = r2
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$trackCriteoTransaction$1 r3 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$trackCriteoTransaction$1) r3
                                int r4 = r3.label
                                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                                r6 = r4 & r5
                                if (r6 == 0) goto L_0x0019
                                int r4 = r4 - r5
                                r3.label = r4
                                goto L_0x001e
                            L_0x0019:
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$trackCriteoTransaction$1 r3 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$trackCriteoTransaction$1
                                r3.<init>(r0, r2)
                            L_0x001e:
                                java.lang.Object r2 = r3.result
                                java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r5 = r3.label
                                java.lang.String r6 = ""
                                r7 = 3
                                r8 = 2
                                r9 = 1
                                r10 = 0
                                if (r5 == 0) goto L_0x0074
                                if (r5 == r9) goto L_0x005c
                                if (r5 == r8) goto L_0x0049
                                if (r5 != r7) goto L_0x0041
                                java.lang.Object r1 = r3.L$1
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r1 = (com.carrefour.fid.android.domain.models.OrderConfirmationModel) r1
                                java.lang.Object r3 = r3.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r3
                                kotlin.C11661u0.m45747n(r2)
                                goto L_0x0187
                            L_0x0041:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r1
                            L_0x0049:
                                java.lang.Object r1 = r3.L$1
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r1 = (com.carrefour.fid.android.domain.models.OrderConfirmationModel) r1
                                java.lang.Object r5 = r3.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r5
                                kotlin.C11661u0.m45747n(r2)
                                kotlin.Result r2 = (kotlin.Result) r2
                                java.lang.Object r2 = r2.mo21858l()
                                goto L_0x00fd
                            L_0x005c:
                                java.lang.Object r1 = r3.L$3
                                java.util.List r1 = (java.util.List) r1
                                java.lang.Object r5 = r3.L$2
                                com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r5 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase) r5
                                java.lang.Object r11 = r3.L$1
                                com.carrefour.fid.android.domain.models.OrderConfirmationModel r11 = (com.carrefour.fid.android.domain.models.OrderConfirmationModel) r11
                                java.lang.Object r12 = r3.L$0
                                com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel r12 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel) r12
                                kotlin.C11661u0.m45747n(r2)
                                r15 = r12
                                r12 = r1
                                r1 = r11
                                goto L_0x00d4
                            L_0x0074:
                                kotlin.C11661u0.m45747n(r2)
                                com.carrefour.fid.android.ecommerce.checkout.manager.a r2 = r0.f65251d
                                if (r1 == 0) goto L_0x0080
                                java.lang.String r5 = r18.mo116155f()
                                goto L_0x0081
                            L_0x0080:
                                r5 = r10
                            L_0x0081:
                                if (r5 != 0) goto L_0x0084
                                r5 = r6
                            L_0x0084:
                                boolean r2 = r2.mo119634b(r5)
                                if (r2 != 0) goto L_0x0198
                                com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r5 = r0.f65252e
                                if (r1 == 0) goto L_0x00b5
                                java.util.List r2 = r18.mo116151c()
                                if (r2 == 0) goto L_0x00b5
                                java.lang.Iterable r2 = (java.lang.Iterable) r2
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r11.<init>()
                                java.util.Iterator r2 = r2.iterator()
                            L_0x009f:
                                boolean r12 = r2.hasNext()
                                if (r12 == 0) goto L_0x00b6
                                java.lang.Object r12 = r2.next()
                                com.carrefour.fid.android.domain.models.OrderOfferModel r12 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r12
                                java.lang.String r12 = r12.mo116200a()
                                if (r12 == 0) goto L_0x009f
                                r11.add(r12)
                                goto L_0x009f
                            L_0x00b5:
                                r11 = r10
                            L_0x00b6:
                                if (r11 != 0) goto L_0x00bd
                                java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                                goto L_0x00be
                            L_0x00bd:
                                r2 = r11
                            L_0x00be:
                                com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r11 = r0.f65254g
                                r3.L$0 = r0
                                r3.L$1 = r1
                                r3.L$2 = r5
                                r3.L$3 = r2
                                r3.label = r9
                                java.lang.Object r11 = r11.hasLoyaltyCard(r3)
                                if (r11 != r4) goto L_0x00d1
                                return r4
                            L_0x00d1:
                                r15 = r0
                                r12 = r2
                                r2 = r11
                            L_0x00d4:
                                java.lang.Boolean r2 = (java.lang.Boolean) r2
                                boolean r13 = r2.booleanValue()
                                r14 = 0
                                r2 = 4
                                r16 = 0
                                com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r11 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
                                r18 = r11
                                r11 = r18
                                r7 = r15
                                r15 = r2
                                r11.<init>(r12, r13, r14, r15, r16)
                                r3.L$0 = r7
                                r3.L$1 = r1
                                r3.L$2 = r10
                                r3.L$3 = r10
                                r3.label = r8
                                r2 = r18
                                java.lang.Object r2 = r5.m172988invokegIAlus(r2, r3)
                                if (r2 != r4) goto L_0x00fc
                                return r4
                            L_0x00fc:
                                r5 = r7
                            L_0x00fd:
                                boolean r7 = kotlin.Result.m38710j(r2)
                                if (r7 == 0) goto L_0x0198
                                r7 = r2
                                java.util.List r7 = (java.util.List) r7
                                java.util.List r8 = com.carrefour.fid.android.domain.extension.C37507h.m153957i(r7)
                                if (r1 == 0) goto L_0x0165
                                java.util.List r11 = r1.mo116151c()
                                if (r11 == 0) goto L_0x0165
                                java.lang.Iterable r11 = (java.lang.Iterable) r11
                                java.util.Iterator r11 = r11.iterator()
                            L_0x0118:
                                boolean r12 = r11.hasNext()
                                if (r12 == 0) goto L_0x0165
                                java.lang.Object r12 = r11.next()
                                com.carrefour.fid.android.domain.models.OrderOfferModel r12 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r12
                                r13 = r8
                                java.lang.Iterable r13 = (java.lang.Iterable) r13
                                java.util.Iterator r13 = r13.iterator()
                            L_0x012b:
                                boolean r14 = r13.hasNext()
                                if (r14 == 0) goto L_0x0151
                                java.lang.Object r14 = r13.next()
                                r15 = r14
                                com.carrefour.fid.android.presentation.models.OfferProductModel r15 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r15
                                java.lang.String r10 = r12.mo116200a()
                                com.carrefour.fid.android.presentation.models.ProductModel r15 = r15.mo121517o0()
                                if (r15 == 0) goto L_0x0147
                                java.lang.String r15 = r15.mo121889s()
                                goto L_0x0148
                            L_0x0147:
                                r15 = 0
                            L_0x0148:
                                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r15)
                                if (r10 == 0) goto L_0x014f
                                goto L_0x0152
                            L_0x014f:
                                r10 = 0
                                goto L_0x012b
                            L_0x0151:
                                r14 = 0
                            L_0x0152:
                                com.carrefour.fid.android.presentation.models.OfferProductModel r14 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r14
                                if (r14 == 0) goto L_0x015f
                                double r13 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159584f(r14)
                                java.lang.Double r10 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r13)
                                goto L_0x0160
                            L_0x015f:
                                r10 = 0
                            L_0x0160:
                                r12.mo116203d(r10)
                                r10 = 0
                                goto L_0x0118
                            L_0x0165:
                                r8 = r7
                                java.util.Collection r8 = (java.util.Collection) r8
                                boolean r8 = r8.isEmpty()
                                r8 = r8 ^ r9
                                if (r8 == 0) goto L_0x0176
                                java.lang.String r7 = r5.mo77703m0(r7)
                                r5.mo77697F(r7, r9)
                            L_0x0176:
                                r3.L$0 = r5
                                r3.L$1 = r1
                                r3.L$2 = r2
                                r2 = 3
                                r3.label = r2
                                java.lang.Object r2 = r5.mo77709s0(r1, r3)
                                if (r2 != r4) goto L_0x0186
                                return r4
                            L_0x0186:
                                r3 = r5
                            L_0x0187:
                                com.carrefour.fid.android.ecommerce.checkout.manager.a r2 = r3.f65251d
                                if (r1 == 0) goto L_0x0190
                                java.lang.String r10 = r1.mo116155f()
                                goto L_0x0191
                            L_0x0190:
                                r10 = 0
                            L_0x0191:
                                if (r10 != 0) goto L_0x0194
                                goto L_0x0195
                            L_0x0194:
                                r6 = r10
                            L_0x0195:
                                r2.mo119633a(r6)
                            L_0x0198:
                                kotlin.d2 r1 = kotlin.C11079d2.f28267a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel.mo77711t0(com.carrefour.fid.android.domain.models.OrderConfirmationModel, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* renamed from: v */
                        public void mo77712v() {
                            this.f65261n.mo77712v();
                        }

                        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b */
                        public interface C26748b extends C28505u.C28509d {

                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$b */
                            public static final class C26750b {
                                @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
                                @C12579k
                                /* renamed from: a */
                                public static C28505u.C28509d m113609a(@C12579k C26748b bVar) {
                                    return C28505u.C28509d.C28510a.m118428a(bVar);
                                }
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$c */
                            public static final class C26751c implements C26748b {
                                @C12579k

                                /* renamed from: b */
                                public static final C26751c f65280b = new C26751c();

                                /* renamed from: c */
                                public static final int f65281c = 0;

                                @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
                                @C12579k
                                public C28505u.C28509d reset() {
                                    return C26750b.m113609a(this);
                                }
                            }

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel$b$a */
                            public static final class C26749a implements C26748b {

                                /* renamed from: i */
                                public static final int f65272i = 8;
                                @C12580l

                                /* renamed from: b */
                                public final BasketDomain f65273b;
                                @C12579k

                                /* renamed from: c */
                                public final String f65274c;

                                /* renamed from: d */
                                public final boolean f65275d;

                                /* renamed from: e */
                                public final boolean f65276e;
                                @C12580l

                                /* renamed from: f */
                                public final OrderConfirmationModel f65277f;
                                @C12579k

                                /* renamed from: g */
                                public final String f65278g;
                                @C12580l

                                /* renamed from: h */
                                public final LuckyCartTicketDomain f65279h;

                                public C26749a(@C12580l BasketDomain basketDomain, @C12579k String str, boolean z, boolean z2, @C12580l OrderConfirmationModel orderConfirmationModel, @C12579k String str2, @C12580l LuckyCartTicketDomain luckyCartTicketDomain) {
                                    Intrinsics.checkNotNullParameter(str, "firstName");
                                    Intrinsics.checkNotNullParameter(str2, "username");
                                    this.f65273b = basketDomain;
                                    this.f65274c = str;
                                    this.f65275d = z;
                                    this.f65276e = z2;
                                    this.f65277f = orderConfirmationModel;
                                    this.f65278g = str2;
                                    this.f65279h = luckyCartTicketDomain;
                                }

                                /* renamed from: m */
                                public static /* synthetic */ C26749a m113593m(C26749a aVar, BasketDomain basketDomain, String str, boolean z, boolean z2, OrderConfirmationModel orderConfirmationModel, String str2, LuckyCartTicketDomain luckyCartTicketDomain, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        basketDomain = aVar.f65273b;
                                    }
                                    if ((i & 2) != 0) {
                                        str = aVar.f65274c;
                                    }
                                    String str3 = str;
                                    if ((i & 4) != 0) {
                                        z = aVar.f65275d;
                                    }
                                    boolean z3 = z;
                                    if ((i & 8) != 0) {
                                        z2 = aVar.f65276e;
                                    }
                                    boolean z4 = z2;
                                    if ((i & 16) != 0) {
                                        orderConfirmationModel = aVar.f65277f;
                                    }
                                    OrderConfirmationModel orderConfirmationModel2 = orderConfirmationModel;
                                    if ((i & 32) != 0) {
                                        str2 = aVar.f65278g;
                                    }
                                    String str4 = str2;
                                    if ((i & 64) != 0) {
                                        luckyCartTicketDomain = aVar.f65279h;
                                    }
                                    return aVar.mo77748l(basketDomain, str3, z3, z4, orderConfirmationModel2, str4, luckyCartTicketDomain);
                                }

                                @C12580l
                                /* renamed from: e */
                                public final BasketDomain mo77739e() {
                                    return this.f65273b;
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C26749a)) {
                                        return false;
                                    }
                                    C26749a aVar = (C26749a) obj;
                                    return Intrinsics.areEqual((Object) this.f65273b, (Object) aVar.f65273b) && Intrinsics.areEqual((Object) this.f65274c, (Object) aVar.f65274c) && this.f65275d == aVar.f65275d && this.f65276e == aVar.f65276e && Intrinsics.areEqual((Object) this.f65277f, (Object) aVar.f65277f) && Intrinsics.areEqual((Object) this.f65278g, (Object) aVar.f65278g) && Intrinsics.areEqual((Object) this.f65279h, (Object) aVar.f65279h);
                                }

                                @C12579k
                                /* renamed from: f */
                                public final String mo77741f() {
                                    return this.f65274c;
                                }

                                /* renamed from: g */
                                public final boolean mo77742g() {
                                    return this.f65275d;
                                }

                                /* renamed from: h */
                                public final boolean mo77743h() {
                                    return this.f65276e;
                                }

                                public int hashCode() {
                                    BasketDomain basketDomain = this.f65273b;
                                    int i = 0;
                                    int hashCode = (((basketDomain == null ? 0 : basketDomain.hashCode()) * 31) + this.f65274c.hashCode()) * 31;
                                    boolean z = this.f65275d;
                                    boolean z2 = true;
                                    if (z) {
                                        z = true;
                                    }
                                    int i2 = (hashCode + (z ? 1 : 0)) * 31;
                                    boolean z3 = this.f65276e;
                                    if (!z3) {
                                        z2 = z3;
                                    }
                                    int i3 = (i2 + (z2 ? 1 : 0)) * 31;
                                    OrderConfirmationModel orderConfirmationModel = this.f65277f;
                                    int hashCode2 = (((i3 + (orderConfirmationModel == null ? 0 : orderConfirmationModel.hashCode())) * 31) + this.f65278g.hashCode()) * 31;
                                    LuckyCartTicketDomain luckyCartTicketDomain = this.f65279h;
                                    if (luckyCartTicketDomain != null) {
                                        i = luckyCartTicketDomain.hashCode();
                                    }
                                    return hashCode2 + i;
                                }

                                @C12580l
                                /* renamed from: i */
                                public final OrderConfirmationModel mo77745i() {
                                    return this.f65277f;
                                }

                                @C12579k
                                /* renamed from: j */
                                public final String mo77746j() {
                                    return this.f65278g;
                                }

                                @C12580l
                                /* renamed from: k */
                                public final LuckyCartTicketDomain mo77747k() {
                                    return this.f65279h;
                                }

                                @C12579k
                                /* renamed from: l */
                                public final C26749a mo77748l(@C12580l BasketDomain basketDomain, @C12579k String str, boolean z, boolean z2, @C12580l OrderConfirmationModel orderConfirmationModel, @C12579k String str2, @C12580l LuckyCartTicketDomain luckyCartTicketDomain) {
                                    Intrinsics.checkNotNullParameter(str, "firstName");
                                    Intrinsics.checkNotNullParameter(str2, "username");
                                    return new C26749a(basketDomain, str, z, z2, orderConfirmationModel, str2, luckyCartTicketDomain);
                                }

                                @C12580l
                                /* renamed from: n */
                                public final BasketDomain mo77749n() {
                                    return this.f65273b;
                                }

                                @C12579k
                                /* renamed from: o */
                                public final String mo77750o() {
                                    return this.f65274c;
                                }

                                @C12580l
                                /* renamed from: p */
                                public final LuckyCartTicketDomain mo77751p() {
                                    return this.f65279h;
                                }

                                @C12580l
                                /* renamed from: q */
                                public final OrderConfirmationModel mo77752q() {
                                    return this.f65277f;
                                }

                                @C12579k
                                /* renamed from: r */
                                public final String mo77753r() {
                                    return this.f65278g;
                                }

                                @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
                                @C12579k
                                public C28505u.C28509d reset() {
                                    return C26750b.m113609a(this);
                                }

                                /* renamed from: s */
                                public final boolean mo77754s() {
                                    return this.f65275d;
                                }

                                /* renamed from: t */
                                public final boolean mo77755t() {
                                    return this.f65276e;
                                }

                                @C12579k
                                public String toString() {
                                    BasketDomain basketDomain = this.f65273b;
                                    String str = this.f65274c;
                                    boolean z = this.f65275d;
                                    boolean z2 = this.f65276e;
                                    OrderConfirmationModel orderConfirmationModel = this.f65277f;
                                    String str2 = this.f65278g;
                                    LuckyCartTicketDomain luckyCartTicketDomain = this.f65279h;
                                    return "Confirmation(basketDomain=" + basketDomain + ", firstName=" + str + ", isDeliveryStore=" + z + ", isExpressPickup=" + z2 + ", orderConfirmationModel=" + orderConfirmationModel + ", username=" + str2 + ", luckyCartTicket=" + luckyCartTicketDomain + ")";
                                }

                                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                                public /* synthetic */ C26749a(BasketDomain basketDomain, String str, boolean z, boolean z2, OrderConfirmationModel orderConfirmationModel, String str2, LuckyCartTicketDomain luckyCartTicketDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
                                    this((i & 1) != 0 ? null : basketDomain, str, z, z2, orderConfirmationModel, str2, (i & 64) != 0 ? null : luckyCartTicketDomain);
                                }
                            }
                        }
                    }
