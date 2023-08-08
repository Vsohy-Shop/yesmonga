package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.data.entities.mapper.C36496i0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase;
import com.carrefour.fid.android.domain.interactors.product.C37748a;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37838t;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.C38049m;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.ecommerce.checkout.manager.C38208a;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28947q;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B{\b\u0007\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\b\b\u0001\u0010q\u001a\u00020p¢\u0006\u0004\br\u0010sJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u0013\u0010\u0018\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013J\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\nJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nJ\u0010\u0010 \u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010`R\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c0b8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020g0b8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010eR\u001c\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c0j8@X\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020g0j8@X\u0004¢\u0006\u0006\u001a\u0004\bn\u0010l\u0002\u0004\n\u0002\b\u0019¨\u0006t"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmationModel", "Lkotlin/d2;", "I0", "(Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/domain/models/OfferProductDomain;", "offers", "", "x0", "Landroidx/lifecycle/w;", "owner", "", "clear", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "A0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "E0", "D0", "C0", "B0", "F0", "v0", "subBasketId", "Lkotlinx/coroutines/c2;", "H0", "slotDateBegin", "orderNumber", "G0", "K0", "sendAirshipEvent", "u0", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/a;", "e", "Lcom/carrefour/fid/android/domain/interactors/product/a;", "clearBasketByReferenceUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/t;", "f", "Lcom/carrefour/fid/android/domain/interactors/service/t;", "switchToStandardPromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/i;", "g", "Lcom/carrefour/fid/android/domain/interactors/criteo/i;", "criteoSendCriteoEventUseCase", "Lcom/carrefour/fid/android/ecommerce/checkout/manager/a;", "h", "Lcom/carrefour/fid/android/ecommerce/checkout/manager/a;", "checkoutTrackingManager", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "i", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "getOfferProductListUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "j", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "k", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "l", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/feedback/OrderFeedbackUseCase;", "m", "Lcom/carrefour/fid/android/domain/interactors/feedback/OrderFeedbackUseCase;", "feedbackUseCase", "Lcom/carrefour/fid/android/data/entities/mapper/i0;", "n", "Lcom/carrefour/fid/android/data/entities/mapper/i0;", "feedbackModelMapper", "Lcom/carrefour/fid/android/tracking/a;", "o", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/domain/interactors/basket/r;", "p", "Lcom/carrefour/fid/android/domain/interactors/basket/r;", "getTotalBasketNumberUseCase", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "q", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "y0", "()Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "J0", "(Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;)V", "checkoutConfirmationAnalyticsViewModel", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/o0;", "scope", "Lcom/carrefour/fid/android/shared/util/q;", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "s", "Lcom/carrefour/fid/android/shared/util/q;", "singleBasket", "Lcom/carrefour/fid/android/domain/models/m;", "t", "singleFeedbackModel", "Landroidx/lifecycle/LiveData;", "w0", "()Landroidx/lifecycle/LiveData;", "basket", "z0", "feedbackModel", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/domain/interactors/product/a;Lcom/carrefour/fid/android/domain/interactors/service/t;Lcom/carrefour/fid/android/domain/interactors/criteo/i;Lcom/carrefour/fid/android/ecommerce/checkout/manager/a;Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/feedback/OrderFeedbackUseCase;Lcom/carrefour/fid/android/data/entities/mapper/i0;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/domain/interactors/basket/r;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutConfirmationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1549#2:225\n1620#2,3:226\n1549#2:229\n1620#2,3:230\n1549#2:233\n1620#2,3:234\n1855#2,2:237\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel\n*L\n189#1:225\n189#1:226,3\n190#1:229\n190#1:230,3\n191#1:233\n191#1:234,3\n207#1:237,2\n*E\n"})
public final class CheckoutConfirmationViewModel extends C28498p {

    /* renamed from: u */
    public static final int f64065u = 8;
    @C12579k

    /* renamed from: d */
    public final C37569f0 f64066d;
    @C12579k

    /* renamed from: e */
    public final C37748a f64067e;
    @C12579k

    /* renamed from: f */
    public final C37838t f64068f;
    @C12579k

    /* renamed from: g */
    public final C37670i f64069g;
    @C12579k

    /* renamed from: h */
    public final C38208a f64070h;
    @C12579k

    /* renamed from: i */
    public final GetOfferProductListUseCase f64071i;
    @C12579k

    /* renamed from: j */
    public final C37823k f64072j;
    @C12579k

    /* renamed from: k */
    public final AccountRepository f64073k;
    @C12579k

    /* renamed from: l */
    public final LoyaltyPreferencesStorage f64074l;
    @C12579k

    /* renamed from: m */
    public final OrderFeedbackUseCase f64075m;
    @C12579k

    /* renamed from: n */
    public final C36496i0 f64076n;
    @C12579k

    /* renamed from: o */
    public final C28994a f64077o;
    @C12579k

    /* renamed from: p */
    public final C37596r f64078p;
    @Inject

    /* renamed from: q */
    public C26196a f64079q;
    @C12579k

    /* renamed from: r */
    public final C12074o0 f64080r;
    @C12579k

    /* renamed from: s */
    public final C28947q<BasketDomain> f64081s = new C28947q<>();
    @C12579k

    /* renamed from: t */
    public final C28947q<C38049m> f64082t = new C28947q<>();

    @Inject
    public CheckoutConfirmationViewModel(@C12579k C37569f0 f0Var, @C12579k C37748a aVar, @C12579k C37838t tVar, @C12579k C37670i iVar, @C12579k C38208a aVar2, @C12579k GetOfferProductListUseCase getOfferProductListUseCase, @C12579k C37823k kVar, @C12579k AccountRepository accountRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k OrderFeedbackUseCase orderFeedbackUseCase, @C12579k C36496i0 i0Var, @C12579k C28994a aVar3, @C12579k C37596r rVar, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(f0Var, "retrieveBasketUseCase");
        Intrinsics.checkNotNullParameter(aVar, "clearBasketByReferenceUseCase");
        Intrinsics.checkNotNullParameter(tVar, "switchToStandardPromiseUseCase");
        Intrinsics.checkNotNullParameter(iVar, "criteoSendCriteoEventUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "checkoutTrackingManager");
        Intrinsics.checkNotNullParameter(getOfferProductListUseCase, "getOfferProductListUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(orderFeedbackUseCase, "feedbackUseCase");
        Intrinsics.checkNotNullParameter(i0Var, "feedbackModelMapper");
        Intrinsics.checkNotNullParameter(aVar3, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(rVar, "getTotalBasketNumberUseCase");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f64066d = f0Var;
        this.f64067e = aVar;
        this.f64068f = tVar;
        this.f64069g = iVar;
        this.f64070h = aVar2;
        this.f64071i = getOfferProductListUseCase;
        this.f64072j = kVar;
        this.f64073k = accountRepository;
        this.f64074l = loyaltyPreferencesStorage;
        this.f64075m = orderFeedbackUseCase;
        this.f64076n = i0Var;
        this.f64077o = aVar3;
        this.f64078p = rVar;
        this.f64080r = C12079p0.m48272m(C19500w0.m90846a(this), coroutineDispatcher);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76179A0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getFirstName$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getFirstName$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getFirstName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getFirstName$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getFirstName$1
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
            com.carrefour.fid.android.account.data.repositories.AccountRepository r5 = r4.f64073k
            r0.label = r3
            java.lang.Object r5 = r5.mo31329n(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = r5.mo116664s()
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76179A0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76180B0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreAddress$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreAddress$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreAddress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreAddress$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreAddress$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f64072j
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r5 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 == 0) goto L_0x005c
            com.carrefour.fid.android.domain.models.service.models.l r5 = r5.mo119352e()
            if (r5 == 0) goto L_0x005c
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r5 = r5.mo119392v()
            goto L_0x005d
        L_0x005c:
            r5 = r1
        L_0x005d:
            if (r5 == 0) goto L_0x0087
            java.lang.String r0 = r5.mo119126h()
            java.lang.String r1 = r5.mo119131l()
            java.lang.String r5 = r5.mo119129j()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76180B0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76181C0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreDistance$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreDistance$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreDistance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreDistance$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreDistance$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f64072j
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            if (r0 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 == 0) goto L_0x005c
            com.carrefour.fid.android.domain.models.service.models.l r5 = r5.mo119352e()
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = r5.mo119396z()
            if (r5 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r5 = "0"
        L_0x005e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " km"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76181C0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76182D0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreName$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreName$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreName$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getStoreName$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f64072j
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r5 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 == 0) goto L_0x005b
            com.carrefour.fid.android.domain.models.service.models.l r5 = r5.mo119352e()
            if (r5 == 0) goto L_0x005b
            java.lang.String r1 = r5.mo119361E()
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76182D0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76183E0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getUserEmail$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getUserEmail$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getUserEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getUserEmail$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$getUserEmail$1
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
            com.carrefour.fid.android.account.data.repositories.AccountRepository r5 = r4.f64073k
            r0.label = r3
            java.lang.Object r5 = r5.mo31329n(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = r5.mo116663r()
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76183E0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76184F0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$isDeliveryStore$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$isDeliveryStore$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$isDeliveryStore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$isDeliveryStore$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$isDeliveryStore$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f64072j
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r5 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 == 0) goto L_0x0055
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r5.mo119354f()
        L_0x0055:
            if (r1 == 0) goto L_0x0060
            com.carrefour.fid.android.shared.util.ServiceUtil r5 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r5 = r5.mo84132n(r1)
            if (r5 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76184F0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: G0 */
    public final void mo76185G0(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "slotDateBegin");
        Intrinsics.checkNotNullParameter(str2, "orderNumber");
        C11723c2 unused = C12038j.m48061f(this.f64080r, (CoroutineContext) null, (CoroutineStart) null, new CheckoutConfirmationViewModel$launchFeedback$1(this, str, str2, (C11045c<? super CheckoutConfirmationViewModel$launchFeedback$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: H0 */
    public final C11723c2 mo76186H0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        return C12038j.m48061f(this.f64080r, (CoroutineContext) null, (CoroutineStart) null, new CheckoutConfirmationViewModel$onSuccessOrder$1(this, str, (C11045c<? super CheckoutConfirmationViewModel$onSuccessOrder$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76187I0(com.carrefour.fid.android.domain.models.OrderConfirmationModel r25, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$sendCriteoEvent$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$sendCriteoEvent$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$sendCriteoEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$sendCriteoEvent$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$sendCriteoEvent$1
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
            goto L_0x011d
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.criteo.i r1 = r0.f64069g
            com.carrefour.fid.android.domain.models.criteo.CriteoEventType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoEventType.EVENT_TYPE_VIEW_TRANSACTION
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r7 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_TRACK_TRANSACTION
            r4 = 10
            r6 = 0
            if (r25 == 0) goto L_0x0076
            java.util.List r9 = r25.mo116151c()
            if (r9 == 0) goto L_0x0076
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.C10978t.m41495Y(r9, r4)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x005e:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0077
            java.lang.Object r11 = r9.next()
            com.carrefour.fid.android.domain.models.OrderOfferModel r11 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r11
            java.lang.String r11 = r11.mo116200a()
            if (r11 != 0) goto L_0x0072
            java.lang.String r11 = ""
        L_0x0072:
            r10.add(r11)
            goto L_0x005e
        L_0x0076:
            r10 = r6
        L_0x0077:
            if (r25 == 0) goto L_0x00b1
            java.util.List r9 = r25.mo116151c()
            if (r9 == 0) goto L_0x00b1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.C10978t.m41495Y(r9, r4)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L_0x008e:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00af
            java.lang.Object r12 = r9.next()
            com.carrefour.fid.android.domain.models.OrderOfferModel r12 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r12
            java.lang.Double r12 = r12.mo116201b()
            if (r12 == 0) goto L_0x00a5
            double r12 = r12.doubleValue()
            goto L_0x00a7
        L_0x00a5:
            r12 = 0
        L_0x00a7:
            java.lang.Double r12 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r12)
            r11.add(r12)
            goto L_0x008e
        L_0x00af:
            r12 = r11
            goto L_0x00b2
        L_0x00b1:
            r12 = r6
        L_0x00b2:
            if (r25 == 0) goto L_0x00eb
            java.util.List r9 = r25.mo116151c()
            if (r9 == 0) goto L_0x00eb
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            int r4 = kotlin.collections.C10978t.m41495Y(r9, r4)
            r11.<init>(r4)
            java.util.Iterator r4 = r9.iterator()
        L_0x00c9:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00e9
            java.lang.Object r9 = r4.next()
            com.carrefour.fid.android.domain.models.OrderOfferModel r9 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r9
            java.lang.Integer r9 = r9.mo116202c()
            if (r9 == 0) goto L_0x00e0
            int r9 = r9.intValue()
            goto L_0x00e1
        L_0x00e0:
            r9 = 0
        L_0x00e1:
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r9)
            r11.add(r9)
            goto L_0x00c9
        L_0x00e9:
            r14 = r11
            goto L_0x00ec
        L_0x00eb:
            r14 = r6
        L_0x00ec:
            if (r25 == 0) goto L_0x00f5
            java.lang.String r4 = r25.mo116155f()
            r18 = r4
            goto L_0x00f7
        L_0x00f5:
            r18 = r6
        L_0x00f7:
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
            if (r1 != r3) goto L_0x011d
            return r3
        L_0x011d:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.mo76187I0(com.carrefour.fid.android.domain.models.OrderConfirmationModel, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: J0 */
    public final void mo76188J0(@C12579k C26196a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f64079q = aVar;
    }

    /* renamed from: K0 */
    public final void mo76189K0(@C12580l OrderConfirmationModel orderConfirmationModel) {
        String str;
        C38208a aVar = this.f64070h;
        if (orderConfirmationModel != null) {
            str = orderConfirmationModel.mo116155f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (!aVar.mo119634b(str)) {
            C11723c2 unused = C12038j.m48061f(this.f64080r, (CoroutineContext) null, (CoroutineStart) null, new CheckoutConfirmationViewModel$trackCriteoTransaction$1(this, orderConfirmationModel, (C11045c<? super CheckoutConfirmationViewModel$trackCriteoTransaction$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64081s.mo57495q(wVar);
        mo83421f0().mo57495q(wVar);
        this.f64082t.mo57495q(wVar);
        mo76196z0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }

    public final void sendAirshipEvent() {
        this.f64077o.mo32669d(C13758b.f33429V, C10975r0.m41401k(C11078d1.m42659a(C13758b.f33430W, C28932h.f70914a.mo84245o())));
    }

    /* renamed from: u0 */
    public final boolean mo76191u0() {
        return this.f64078p.mo33353a();
    }

    /* renamed from: v0 */
    public final void mo76192v0() {
        C11723c2 unused = C12038j.m48061f(this.f64080r, (CoroutineContext) null, (CoroutineStart) null, new CheckoutConfirmationViewModel$getBasket$1(this, (C11045c<? super CheckoutConfirmationViewModel$getBasket$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: w0 */
    public final LiveData<BasketDomain> mo76193w0() {
        return this.f64081s;
    }

    /* renamed from: x0 */
    public final String mo76194x0(List<OfferProductDomain> list) {
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

    @C12579k
    /* renamed from: y0 */
    public final C26196a mo76195y0() {
        C26196a aVar = this.f64079q;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkoutConfirmationAnalyticsViewModel");
        return null;
    }

    @C12579k
    /* renamed from: z0 */
    public final LiveData<C38049m> mo76196z0() {
        return this.f64082t;
    }
}
