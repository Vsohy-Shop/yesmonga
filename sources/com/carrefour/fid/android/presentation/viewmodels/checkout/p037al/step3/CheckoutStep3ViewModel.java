package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.core.type.ValidatePaymentType;
import com.carrefour.fid.android.domain.interactors.basket.C37560c;
import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.order.IsEligibleToOnSitePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37865j;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23378q;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.analytics.C26115a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010\\\u001a\u00020S\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010j\u001a\u00020e\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010t\u001a\u00020oø\u0001\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J#\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 J\u0006\u0010$\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020 J\u0006\u0010'\u001a\u00020\u0002J\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010J3\u00100\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0002R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010>\u001a\u00020;8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010UR\u0014\u0010`\u001a\u00020]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0017\u0010j\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0017\u0010t\u001a\u00020o8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00100y8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010{R \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100}8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010y8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010{R\"\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010}8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020 0y8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010{R!\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020 0}8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020,0\u00010y8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010{R(\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020,0\u00010}8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u000b0\u00010y8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010{R'\u0010\f\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u000b0\u00010}8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020 0\u00010y8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010{R(\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020 0\u00010}8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100y8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010{R!\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100}8\u0006¢\u0006\u000f\n\u0005\b\u0001\u0010\u001a\u0006\b \u0001\u0010\u0001R\u001f\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¢\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R$\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010§\u00018\u0006¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R\u0019\u0010²\u0001\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001b\u0010·\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001R\u0019\u0010¹\u0001\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010±\u0001R\u001d\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030º\u00010y8\u0002X\u0004¢\u0006\u0007\n\u0005\b»\u0001\u0010{R\"\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030º\u00010}8\u0006¢\u0006\u000f\n\u0005\b½\u0001\u0010\u001a\u0006\b¾\u0001\u0010\u0001R\u0017\u0010Á\u0001\u001a\u00020\t8\u0002XD¢\u0006\b\n\u0006\bÀ\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006Ä\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "I0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "L0", "K0", "J0", "N0", "", "amountInEuro", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/state/a;", "loyaltyState", "X0", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "", "postOrderSubstitutionEnabled", "v0", "(Lcom/carrefour/fid/android/domain/models/BasketDomain;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "isPaymentOnSite", "isFullLoyaltyChecked", "totalAmount", "Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "G0", "(ZZLjava/lang/Double;)Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "M0", "online", "Q0", "O0", "useAll", "R0", "", "code", "Lkotlinx/coroutines/c2;", "S0", "W0", "promoCode", "Y0", "U0", "V0", "T0", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "slot", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;", "basketSlotBookedMessageType", "u0", "(Lcom/carrefour/fid/android/domain/models/slot/Slot;Lcom/carrefour/fid/android/domain/models/basket/Basket;Lcom/carrefour/fid/android/domain/models/slot/BasketSlotBookedMessageType;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "P0", "Lcom/carrefour/fid/android/domain/interactors/order/IsEligibleToOnSitePaymentUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/order/IsEligibleToOnSitePaymentUseCase;", "isEligibleToOnSitePaymentUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "b", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/z;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/z;", "observeBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/l0;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/l0;", "synchronizeCurrentBasketUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "e", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "getLoyaltyBalanceUseCase", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "f", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "getLoyaltyCardNumberUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "g", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "loyaltyAuthenticationUseCase", "Lcom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase;", "h", "Lcom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase;", "validatePaymentUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "i", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/slot/j;", "j", "Lcom/carrefour/fid/android/domain/interactors/slot/j;", "updateSlotLocalStorageUseCase", "k", "getServiceSelectedUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/c;", "l", "Lcom/carrefour/fid/android/domain/interactors/basket/c;", "addPromotionToCurrentBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/c0;", "m", "Lcom/carrefour/fid/android/domain/interactors/basket/c0;", "removePromoCodeUseCase", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/analytics/a;", "n", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/analytics/a;", "w0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/analytics/a;", "analytics", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "o", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "otpAnalytics", "Landroidx/lifecycle/p0;", "p", "Landroidx/lifecycle/p0;", "E0", "()Landroidx/lifecycle/p0;", "savedStateHandle", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/q;", "q", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/q;", "args", "Lkotlinx/coroutines/flow/j;", "r", "Lkotlinx/coroutines/flow/j;", "_hasPaymentTypeChoice", "Lkotlinx/coroutines/flow/u;", "s", "Lkotlinx/coroutines/flow/u;", "y0", "()Lkotlinx/coroutines/flow/u;", "hasPaymentTypeChoice", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/state/PaymentType;", "t", "_paymentTypeState", "u", "C0", "paymentTypeState", "v", "_onSiteStoreNameState", "w", "A0", "onSiteStoreNameState", "Lcom/carrefour/fid/android/shared/type/e;", "x", "_basketState", "y", "x0", "basketState", "z", "_loyaltyState", "A", "z0", "B", "_promoCodeState", "C", "D0", "promoCodeState", "D", "_paymentLoadingState", "E", "B0", "paymentLoadingState", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/event/a;", "F", "Lkotlinx/coroutines/channels/g;", "_events", "Lkotlinx/coroutines/flow/e;", "G", "Lkotlinx/coroutines/flow/e;", "getEvents", "()Lkotlinx/coroutines/flow/e;", "events", "H", "Ljava/lang/Double;", "fidAmountAwaitingVerification", "I", "Z", "useAllFidAwaitingVerification", "J", "Lkotlinx/coroutines/c2;", "promoCodeValidationJob", "K", "promoCodeRemoveJob", "L", "isDelivery", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/common/state/a;", "M", "_secretCodeState", "N", "F0", "secretCodeState", "O", "fidThreshold", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/order/IsEligibleToOnSitePaymentUseCase;Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/domain/interactors/basket/z;Lcom/carrefour/fid/android/domain/interactors/basket/l0;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;Lcom/carrefour/fid/android/domain/interactors/loyalty/b;Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;Lcom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/slot/j;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/basket/c;Lcom/carrefour/fid/android/domain/interactors/basket/c0;Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/analytics/a;Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;Landroidx/lifecycle/p0;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep3ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,472:1\n1#2:473\n230#3,5:474\n230#3,5:479\n230#3,5:484\n230#3,5:489\n230#3,5:494\n230#3,5:499\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel\n*L\n232#1:474,5\n252#1:479,5\n266#1:484,5\n280#1:489,5\n315#1:494,5\n467#1:499,5\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel */
public final class CheckoutStep3ViewModel extends C19476v0 {

    /* renamed from: P */
    public static final int f63797P = 8;
    @C12579k

    /* renamed from: A */
    public final C11952u<C28892e<C26132a>> f63798A;
    @C12579k

    /* renamed from: B */
    public final C11940j<C28892e<String>> f63799B;
    @C12579k

    /* renamed from: C */
    public final C11952u<C28892e<String>> f63800C;
    @C12579k

    /* renamed from: D */
    public final C11940j<Boolean> f63801D;
    @C12579k

    /* renamed from: E */
    public final C11952u<Boolean> f63802E;
    @C12579k

    /* renamed from: F */
    public final C11744g<C26122a> f63803F;
    @C12579k

    /* renamed from: G */
    public final C11907e<C26122a> f63804G;
    @C12580l

    /* renamed from: H */
    public Double f63805H;

    /* renamed from: I */
    public boolean f63806I;
    @C12580l

    /* renamed from: J */
    public C11723c2 f63807J;
    @C12580l

    /* renamed from: K */
    public C11723c2 f63808K;

    /* renamed from: L */
    public boolean f63809L;
    @C12579k

    /* renamed from: M */
    public final C11940j<C26141a> f63810M;
    @C12579k

    /* renamed from: N */
    public final C11952u<C26141a> f63811N;

    /* renamed from: O */
    public final double f63812O = 10.0d;
    @C12579k

    /* renamed from: a */
    public final IsEligibleToOnSitePaymentUseCase f63813a;
    @C12579k

    /* renamed from: b */
    public final C37569f0 f63814b;
    @C12579k

    /* renamed from: c */
    public final C37606z f63815c;
    @C12579k

    /* renamed from: d */
    public final C37584l0 f63816d;
    @C12579k

    /* renamed from: e */
    public final GetLoyaltyBalanceUseCase f63817e;
    @C12579k

    /* renamed from: f */
    public final C37697b f63818f;
    @C12579k

    /* renamed from: g */
    public final LoyaltyAuthenticationUseCase f63819g;
    @C12579k

    /* renamed from: h */
    public final ValidatePaymentUseCase f63820h;
    @C12579k

    /* renamed from: i */
    public final C37823k f63821i;
    @C12579k

    /* renamed from: j */
    public final C37865j f63822j;
    @C12579k

    /* renamed from: k */
    public final C37823k f63823k;
    @C12579k

    /* renamed from: l */
    public final C37560c f63824l;
    @C12579k

    /* renamed from: m */
    public final C37561c0 f63825m;
    @C12579k

    /* renamed from: n */
    public final C26115a f63826n;
    @C12579k

    /* renamed from: o */
    public final C24603a f63827o;
    @C12579k

    /* renamed from: p */
    public final C19456p0 f63828p;
    @C12579k

    /* renamed from: q */
    public final C23378q f63829q;
    @C12579k

    /* renamed from: r */
    public final C11940j<Boolean> f63830r;
    @C12579k

    /* renamed from: s */
    public final C11952u<Boolean> f63831s;
    @C12579k

    /* renamed from: t */
    public final C11940j<PaymentType> f63832t;
    @C12579k

    /* renamed from: u */
    public final C11952u<PaymentType> f63833u;
    @C12579k

    /* renamed from: v */
    public final C11940j<String> f63834v;
    @C12579k

    /* renamed from: w */
    public final C11952u<String> f63835w;
    @C12579k

    /* renamed from: x */
    public final C11940j<C28892e<Basket>> f63836x;
    @C12579k

    /* renamed from: y */
    public final C11952u<C28892e<Basket>> f63837y;
    @C12579k

    /* renamed from: z */
    public final C11940j<C28892e<C26132a>> f63838z;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$1", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {0}, mo22504l = {117}, mo22505m = "invokeSuspend", mo22506n = {"$this$launch"}, mo22507s = {"L$0"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$1 */
    public static final class C261091 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CheckoutStep3ViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C261091 r0 = new C261091(this.this$0, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C12074o0 o0Var;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                o0Var = (C12074o0) this.L$0;
                CheckoutStep3ViewModel checkoutStep3ViewModel = this.this$0;
                this.L$0 = o0Var;
                this.label = 1;
                if (checkoutStep3ViewModel.mo75826I0(this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
                o0Var = (C12074o0) this.L$0;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final CheckoutStep3ViewModel checkoutStep3ViewModel2 = this.this$0;
            C12074o0 o0Var2 = o0Var;
            C11723c2 unused = C12038j.m48061f(o0Var2, (CoroutineContext) null, (CoroutineStart) null, new C11304p<C12074o0, C11045c<? super C11079d2>, Object>((C11045c<? super C261101>) null) {
                int label;

                @C12579k
                public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                    return 

                    @C11363r0({"SMAP\nCheckoutStep3ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel$observeBasket$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,472:1\n230#2,5:473\n230#2,5:478\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel$observeBasket$2\n*L\n212#1:473,5\n214#1:478,5\n*E\n"})
                    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$a */
                    public static final class C26113a implements C11908f<Basket> {

                        /* renamed from: a */
                        public final /* synthetic */ CheckoutStep3ViewModel f63839a;

                        public C26113a(CheckoutStep3ViewModel checkoutStep3ViewModel) {
                            this.f63839a = checkoutStep3ViewModel;
                        }

                        @C12580l
                        /* renamed from: c */
                        public final Object emit(@C12579k Basket basket, @C12579k C11045c<? super C11079d2> cVar) {
                            Object value;
                            Object value2;
                            this.f63839a.f63836x.setValue(new C28892e.C28895c(basket));
                            BasketPromotionCode E = basket.mo116820E();
                            if (E != null) {
                                C11940j m0 = this.f63839a.f63799B;
                                do {
                                    value2 = m0.getValue();
                                    C28892e eVar = (C28892e) value2;
                                } while (!m0.mo24216e(value2, new C28892e.C28895c(E.mo116939f())));
                            } else {
                                C11940j m02 = this.f63839a.f63799B;
                                do {
                                    value = m02.getValue();
                                    C28892e eVar2 = (C28892e) value;
                                } while (!m02.mo24216e(value, C28892e.C28896d.f70785b));
                            }
                            return C11079d2.f28267a;
                        }
                    }

                    @Inject
                    public CheckoutStep3ViewModel(@C12579k IsEligibleToOnSitePaymentUseCase isEligibleToOnSitePaymentUseCase, @C12579k C37569f0 f0Var, @C12579k C37606z zVar, @C12579k C37584l0 l0Var, @C12579k GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, @C12579k C37697b bVar, @C12579k LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase, @C12579k ValidatePaymentUseCase validatePaymentUseCase, @C12579k C37823k kVar, @C12579k C37865j jVar, @C12579k C37823k kVar2, @C12579k C37560c cVar, @C12579k C37561c0 c0Var, @C12579k C26115a aVar, @C12579k C24603a aVar2, @C12579k C19456p0 p0Var) {
                        IsEligibleToOnSitePaymentUseCase isEligibleToOnSitePaymentUseCase2 = isEligibleToOnSitePaymentUseCase;
                        C37569f0 f0Var2 = f0Var;
                        C37606z zVar2 = zVar;
                        C37584l0 l0Var2 = l0Var;
                        GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase2 = getLoyaltyBalanceUseCase;
                        C37697b bVar2 = bVar;
                        LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase2 = loyaltyAuthenticationUseCase;
                        ValidatePaymentUseCase validatePaymentUseCase2 = validatePaymentUseCase;
                        C37823k kVar3 = kVar;
                        C37865j jVar2 = jVar;
                        C37823k kVar4 = kVar2;
                        C37560c cVar2 = cVar;
                        C37561c0 c0Var2 = c0Var;
                        C26115a aVar3 = aVar;
                        Intrinsics.checkNotNullParameter(isEligibleToOnSitePaymentUseCase2, "isEligibleToOnSitePaymentUseCase");
                        Intrinsics.checkNotNullParameter(f0Var2, "retrieveBasketUseCase");
                        Intrinsics.checkNotNullParameter(zVar2, "observeBasketUseCase");
                        Intrinsics.checkNotNullParameter(l0Var2, "synchronizeCurrentBasketUseCase");
                        Intrinsics.checkNotNullParameter(getLoyaltyBalanceUseCase2, "getLoyaltyBalanceUseCase");
                        Intrinsics.checkNotNullParameter(bVar2, "getLoyaltyCardNumberUseCase");
                        Intrinsics.checkNotNullParameter(loyaltyAuthenticationUseCase2, "loyaltyAuthenticationUseCase");
                        Intrinsics.checkNotNullParameter(validatePaymentUseCase2, "validatePaymentUseCase");
                        Intrinsics.checkNotNullParameter(kVar3, "getServiceSelectionUseCase");
                        Intrinsics.checkNotNullParameter(jVar2, "updateSlotLocalStorageUseCase");
                        Intrinsics.checkNotNullParameter(kVar4, "getServiceSelectedUseCase");
                        Intrinsics.checkNotNullParameter(cVar2, "addPromotionToCurrentBasketUseCase");
                        Intrinsics.checkNotNullParameter(c0Var2, "removePromoCodeUseCase");
                        Intrinsics.checkNotNullParameter(aVar3, "analytics");
                        Intrinsics.checkNotNullParameter(aVar2, "otpAnalytics");
                        C19456p0 p0Var2 = p0Var;
                        Intrinsics.checkNotNullParameter(p0Var2, "savedStateHandle");
                        this.f63813a = isEligibleToOnSitePaymentUseCase2;
                        this.f63814b = f0Var2;
                        this.f63815c = zVar2;
                        this.f63816d = l0Var2;
                        this.f63817e = getLoyaltyBalanceUseCase2;
                        this.f63818f = bVar2;
                        this.f63819g = loyaltyAuthenticationUseCase2;
                        this.f63820h = validatePaymentUseCase2;
                        this.f63821i = kVar3;
                        this.f63822j = jVar2;
                        this.f63823k = kVar4;
                        this.f63824l = cVar2;
                        this.f63825m = c0Var2;
                        this.f63826n = aVar3;
                        this.f63827o = aVar2;
                        this.f63828p = p0Var2;
                        this.f63829q = C23378q.f59184e.mo68501b(p0Var2);
                        Boolean bool = Boolean.FALSE;
                        C11940j<Boolean> a = C11953v.m47628a(bool);
                        this.f63830r = a;
                        this.f63831s = C11909g.m47470m(a);
                        C11940j<PaymentType> a2 = C11953v.m47628a(PaymentType.Online);
                        this.f63832t = a2;
                        this.f63833u = C11909g.m47470m(a2);
                        C11940j<String> a3 = C11953v.m47628a("");
                        this.f63834v = a3;
                        this.f63835w = C11909g.m47470m(a3);
                        C28892e.C28894b bVar3 = C28892e.C28894b.f70781b;
                        C11940j<C28892e<Basket>> a4 = C11953v.m47628a(bVar3);
                        this.f63836x = a4;
                        this.f63837y = C11909g.m47470m(a4);
                        C11940j<C28892e<C26132a>> a5 = C11953v.m47628a(bVar3);
                        this.f63838z = a5;
                        this.f63798A = C11909g.m47470m(a5);
                        C11940j<C28892e<String>> a6 = C11953v.m47628a(C28892e.C28896d.f70785b);
                        this.f63799B = a6;
                        this.f63800C = C11909g.m47470m(a6);
                        C11940j<Boolean> a7 = C11953v.m47628a(bool);
                        this.f63801D = a7;
                        this.f63802E = C11909g.m47470m(a7);
                        C11744g<C26122a> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
                        this.f63803F = d;
                        this.f63804G = C11909g.m47490s1(d);
                        C11940j<C26141a> a8 = C11953v.m47628a(new C26141a(false, false, 3, (DefaultConstructorMarker) null));
                        this.f63810M = a8;
                        this.f63811N = C11909g.m47470m(a8);
                        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C261091(this, (C11045c<? super C261091>) null), 3, (Object) null);
                    }

                    /* renamed from: H0 */
                    public static /* synthetic */ ValidatePaymentType m111607H0(CheckoutStep3ViewModel checkoutStep3ViewModel, boolean z, boolean z2, Double d, int i, Object obj) {
                        if ((i & 4) != 0) {
                            d = null;
                        }
                        return checkoutStep3ViewModel.mo75825G0(z, z2, d);
                    }

                    @C12579k
                    /* renamed from: A0 */
                    public final C11952u<String> mo75819A0() {
                        return this.f63835w;
                    }

                    @C12579k
                    /* renamed from: B0 */
                    public final C11952u<Boolean> mo75820B0() {
                        return this.f63802E;
                    }

                    @C12579k
                    /* renamed from: C0 */
                    public final C11952u<PaymentType> mo75821C0() {
                        return this.f63833u;
                    }

                    @C12579k
                    /* renamed from: D0 */
                    public final C11952u<C28892e<String>> mo75822D0() {
                        return this.f63800C;
                    }

                    @C12579k
                    /* renamed from: E0 */
                    public final C19456p0 mo75823E0() {
                        return this.f63828p;
                    }

                    @C12579k
                    /* renamed from: F0 */
                    public final C11952u<C26141a> mo75824F0() {
                        return this.f63811N;
                    }

                    /* renamed from: G0 */
                    public final ValidatePaymentType mo75825G0(boolean z, boolean z2, Double d) {
                        String str;
                        double d2;
                        if (z) {
                            return ValidatePaymentType.IsOnSite.f89962b;
                        }
                        C26132a aVar = (C26132a) C28897f.m119478b(this.f63838z.getValue());
                        if (aVar != null) {
                            if (!z2) {
                                d2 = aVar.mo75915i();
                            } else if (d == null || aVar.mo75916j() <= d.doubleValue()) {
                                d2 = aVar.mo75916j();
                            } else {
                                d2 = d.doubleValue();
                            }
                            str = String.valueOf(d2);
                        } else {
                            str = "0";
                        }
                        return new ValidatePaymentType.InitPayment(str);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                    /* renamed from: I0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75826I0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
                        /*
                            r4 = this;
                            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initAnalytics$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r5
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initAnalytics$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initAnalytics$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initAnalytics$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initAnalytics$1
                            r0.<init>(r4, r5)
                        L_0x0018:
                            java.lang.Object r5 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L_0x003b
                            if (r2 != r3) goto L_0x0033
                            java.lang.Object r0 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r0
                            kotlin.C11661u0.m45747n(r5)
                            kotlin.Result r5 = (kotlin.Result) r5
                            java.lang.Object r5 = r5.mo21858l()
                            goto L_0x004c
                        L_0x0033:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r0)
                            throw r5
                        L_0x003b:
                            kotlin.C11661u0.m45747n(r5)
                            com.carrefour.fid.android.domain.interactors.basket.f0 r5 = r4.f63814b
                            r0.L$0 = r4
                            r0.label = r3
                            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
                            if (r5 != r1) goto L_0x004b
                            return r1
                        L_0x004b:
                            r0 = r4
                        L_0x004c:
                            boolean r1 = kotlin.Result.m38709i(r5)
                            if (r1 == 0) goto L_0x0053
                            r5 = 0
                        L_0x0053:
                            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r1 = r0.f63826n
                            r1.mo75863b(r5)
                            if (r5 == 0) goto L_0x006c
                            com.carrefour.fid.android.domain.models.basket.BasketAmounts r5 = r5.mo116855w()
                            if (r5 == 0) goto L_0x006c
                            double r1 = r5.mo116868D()
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r5 = r0.f63826n
                            float r0 = (float) r1
                            r5.mo75864c(r0)
                        L_0x006c:
                            kotlin.d2 r5 = kotlin.C11079d2.f28267a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75826I0(kotlin.coroutines.c):java.lang.Object");
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
                    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
                    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
                    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
                    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
                    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104  */
                    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129  */
                    /* JADX WARNING: Removed duplicated region for block: B:54:0x012f  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
                    /* renamed from: J0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75827J0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r21) {
                        /*
                            r20 = this;
                            r0 = r20
                            r1 = r21
                            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initLoyalty$1
                            if (r2 == 0) goto L_0x0017
                            r2 = r1
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initLoyalty$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initLoyalty$1) r2
                            int r3 = r2.label
                            r4 = -2147483648(0xffffffff80000000, float:-0.0)
                            r5 = r3 & r4
                            if (r5 == 0) goto L_0x0017
                            int r3 = r3 - r4
                            r2.label = r3
                            goto L_0x001c
                        L_0x0017:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initLoyalty$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initLoyalty$1
                            r2.<init>(r0, r1)
                        L_0x001c:
                            java.lang.Object r1 = r2.result
                            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r4 = r2.label
                            r5 = 3
                            r6 = 2
                            r7 = 1
                            if (r4 == 0) goto L_0x007a
                            if (r4 == r7) goto L_0x0068
                            if (r4 == r6) goto L_0x0052
                            if (r4 != r5) goto L_0x004a
                            double r3 = r2.D$0
                            java.lang.Object r5 = r2.L$2
                            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.C11940j) r5
                            java.lang.Object r6 = r2.L$1
                            java.lang.String r6 = (java.lang.String) r6
                            java.lang.Object r2 = r2.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r2
                            kotlin.C11661u0.m45747n(r1)
                            kotlin.Result r1 = (kotlin.Result) r1
                            java.lang.Object r1 = r1.mo21858l()
                            r11 = r3
                        L_0x0047:
                            r10 = r6
                            goto L_0x00df
                        L_0x004a:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L_0x0052:
                            java.lang.Object r4 = r2.L$2
                            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.C11940j) r4
                            java.lang.Object r6 = r2.L$1
                            java.lang.String r6 = (java.lang.String) r6
                            java.lang.Object r8 = r2.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r8
                            kotlin.C11661u0.m45747n(r1)
                            kotlin.Result r1 = (kotlin.Result) r1
                            java.lang.Object r1 = r1.mo21858l()
                            goto L_0x00bb
                        L_0x0068:
                            java.lang.Object r4 = r2.L$1
                            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.C11940j) r4
                            java.lang.Object r8 = r2.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r8
                            kotlin.C11661u0.m45747n(r1)
                            kotlin.Result r1 = (kotlin.Result) r1
                            java.lang.Object r1 = r1.mo21858l()
                            goto L_0x0094
                        L_0x007a:
                            kotlin.C11661u0.m45747n(r1)
                            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a>> r4 = r0.f63838z
                            com.carrefour.fid.android.domain.interactors.loyalty.b r1 = r0.f63818f
                            com.carrefour.fid.android.domain.interactors.loyalty.b$a r8 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
                            r8.<init>(r7)
                            r2.L$0 = r0
                            r2.L$1 = r4
                            r2.label = r7
                            java.lang.Object r1 = r1.m172966invokegIAlus(r8, r2)
                            if (r1 != r3) goto L_0x0093
                            return r3
                        L_0x0093:
                            r8 = r0
                        L_0x0094:
                            java.lang.Throwable r9 = kotlin.Result.m38705e(r1)
                            if (r9 != 0) goto L_0x012f
                            com.carrefour.fid.android.domain.models.loyalty.b r1 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r1
                            java.lang.String r1 = r1.mo117869h()
                            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r9 = r8.f63817e
                            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params r10 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params
                            r10.<init>(r1)
                            r2.L$0 = r8
                            r2.L$1 = r1
                            r2.L$2 = r4
                            r2.label = r6
                            java.lang.Object r6 = r9.m173041invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params) r10, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r2)
                            if (r6 != r3) goto L_0x00b6
                            return r3
                        L_0x00b6:
                            r19 = r6
                            r6 = r1
                            r1 = r19
                        L_0x00bb:
                            java.lang.Throwable r9 = kotlin.Result.m38705e(r1)
                            if (r9 != 0) goto L_0x0129
                            java.lang.Number r1 = (java.lang.Number) r1
                            double r9 = r1.doubleValue()
                            com.carrefour.fid.android.domain.interactors.service.k r1 = r8.f63821i
                            r2.L$0 = r8
                            r2.L$1 = r6
                            r2.L$2 = r4
                            r2.D$0 = r9
                            r2.label = r5
                            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
                            if (r1 != r3) goto L_0x00da
                            return r3
                        L_0x00da:
                            r5 = r4
                            r2 = r8
                            r11 = r9
                            goto L_0x0047
                        L_0x00df:
                            boolean r3 = kotlin.Result.m38709i(r1)
                            if (r3 == 0) goto L_0x00e6
                            r1 = 0
                        L_0x00e6:
                            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
                            r3 = 0
                            if (r1 == 0) goto L_0x00f9
                            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
                            if (r1 == 0) goto L_0x00f9
                            boolean r1 = r1.mo119185b0()
                            if (r1 != r7) goto L_0x00f9
                            r1 = r7
                            goto L_0x00fa
                        L_0x00f9:
                            r1 = r3
                        L_0x00fa:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r4 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a
                            int r6 = r10.length()
                            if (r6 <= 0) goto L_0x0104
                            r6 = r7
                            goto L_0x0105
                        L_0x0104:
                            r6 = r3
                        L_0x0105:
                            if (r6 == 0) goto L_0x010b
                            if (r1 == 0) goto L_0x010b
                            r9 = r7
                            goto L_0x010c
                        L_0x010b:
                            r9 = r3
                        L_0x010c:
                            r13 = 0
                            r15 = 0
                            r16 = 0
                            r17 = 56
                            r18 = 0
                            r8 = r4
                            r8.<init>(r9, r10, r11, r13, r15, r16, r17, r18)
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r1 = r2.f63826n
                            boolean r2 = r4.mo75919m()
                            r1.mo75875n(r2)
                            com.carrefour.fid.android.shared.type.e$c r1 = new com.carrefour.fid.android.shared.type.e$c
                            r1.<init>(r4)
                            r4 = r5
                            goto L_0x0134
                        L_0x0129:
                            com.carrefour.fid.android.shared.type.e$a r1 = new com.carrefour.fid.android.shared.type.e$a
                            r1.<init>(r9)
                            goto L_0x0134
                        L_0x012f:
                            com.carrefour.fid.android.shared.type.e$a r1 = new com.carrefour.fid.android.shared.type.e$a
                            r1.<init>(r9)
                        L_0x0134:
                            r4.setValue(r1)
                            kotlin.d2 r1 = kotlin.C11079d2.f28267a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75827J0(kotlin.coroutines.c):java.lang.Object");
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
                    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
                    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
                    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                    /* renamed from: K0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75828K0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
                        /*
                            r7 = this;
                            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initPaymentType$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r8
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initPaymentType$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initPaymentType$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initPaymentType$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initPaymentType$1
                            r0.<init>(r7, r8)
                        L_0x0018:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L_0x004a
                            if (r2 == r4) goto L_0x003c
                            if (r2 != r3) goto L_0x0034
                            java.lang.Object r1 = r0.L$2
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.C11940j) r1
                            java.lang.Object r0 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r0
                            kotlin.C11661u0.m45747n(r8)
                            goto L_0x008e
                        L_0x0034:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L_0x003c:
                            java.lang.Object r2 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r2
                            kotlin.C11661u0.m45747n(r8)
                            kotlin.Result r8 = (kotlin.Result) r8
                            java.lang.Object r8 = r8.mo21858l()
                            goto L_0x006c
                        L_0x004a:
                            kotlin.C11661u0.m45747n(r8)
                            boolean r8 = r7.f63809L
                            if (r8 == 0) goto L_0x005e
                            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType> r8 = r7.f63832t
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType r0 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType.Online
                            r8.setValue(r0)
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r8 = r7.f63826n
                            r8.mo75874m()
                            goto L_0x00bc
                        L_0x005e:
                            com.carrefour.fid.android.domain.interactors.order.IsEligibleToOnSitePaymentUseCase r8 = r7.f63813a
                            r0.L$0 = r7
                            r0.label = r4
                            java.lang.Object r8 = r8.m172982invokeIoAF18A(r0)
                            if (r8 != r1) goto L_0x006b
                            return r1
                        L_0x006b:
                            r2 = r7
                        L_0x006c:
                            boolean r5 = kotlin.Result.m38710j(r8)
                            if (r5 == 0) goto L_0x00bc
                            r5 = r8
                            java.lang.Boolean r5 = (java.lang.Boolean) r5
                            boolean r5 = r5.booleanValue()
                            kotlinx.coroutines.flow.j<java.lang.Boolean> r6 = r2.f63830r
                            if (r5 == 0) goto L_0x0099
                            r0.L$0 = r2
                            r0.L$1 = r8
                            r0.L$2 = r6
                            r0.label = r3
                            java.lang.Object r8 = r2.mo75830M0(r0)
                            if (r8 != r1) goto L_0x008c
                            return r1
                        L_0x008c:
                            r0 = r2
                            r1 = r6
                        L_0x008e:
                            java.lang.Boolean r8 = (java.lang.Boolean) r8
                            boolean r8 = r8.booleanValue()
                            if (r8 == 0) goto L_0x0097
                            goto L_0x009c
                        L_0x0097:
                            r2 = r0
                            r6 = r1
                        L_0x0099:
                            r4 = 0
                            r0 = r2
                            r1 = r6
                        L_0x009c:
                            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
                            r1.setValue(r8)
                            kotlinx.coroutines.flow.j<java.lang.Boolean> r8 = r0.f63830r
                            java.lang.Object r8 = r8.getValue()
                            java.lang.Boolean r8 = (java.lang.Boolean) r8
                            boolean r8 = r8.booleanValue()
                            if (r8 == 0) goto L_0x00b7
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r8 = r0.f63826n
                            r8.mo75873l()
                            goto L_0x00bc
                        L_0x00b7:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a r8 = r0.f63826n
                            r8.mo75874m()
                        L_0x00bc:
                            kotlin.d2 r8 = kotlin.C11079d2.f28267a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75828K0(kotlin.coroutines.c):java.lang.Object");
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                    /* renamed from: L0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75829L0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
                        /*
                            r4 = this;
                            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initServiceSelection$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r5
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initServiceSelection$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$initServiceSelection$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initServiceSelection$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initServiceSelection$1
                            r0.<init>(r4, r5)
                        L_0x0018:
                            java.lang.Object r5 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L_0x003b
                            if (r2 != r3) goto L_0x0033
                            java.lang.Object r0 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r0
                            kotlin.C11661u0.m45747n(r5)
                            kotlin.Result r5 = (kotlin.Result) r5
                            java.lang.Object r5 = r5.mo21858l()
                            goto L_0x004c
                        L_0x0033:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r0)
                            throw r5
                        L_0x003b:
                            kotlin.C11661u0.m45747n(r5)
                            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f63823k
                            r0.L$0 = r4
                            r0.label = r3
                            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
                            if (r5 != r1) goto L_0x004b
                            return r1
                        L_0x004b:
                            r0 = r4
                        L_0x004c:
                            boolean r1 = kotlin.Result.m38710j(r5)
                            if (r1 == 0) goto L_0x0064
                            r1 = r5
                            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
                            com.carrefour.fid.android.domain.models.service.models.l r1 = r1.mo119352e()
                            if (r1 == 0) goto L_0x0064
                            kotlinx.coroutines.flow.j<java.lang.String> r2 = r0.f63834v
                            java.lang.String r1 = r1.mo119361E()
                            r2.setValue(r1)
                        L_0x0064:
                            boolean r1 = kotlin.Result.m38709i(r5)
                            if (r1 == 0) goto L_0x006b
                            r5 = 0
                        L_0x006b:
                            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
                            r1 = 0
                            if (r5 == 0) goto L_0x007f
                            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
                            if (r5 == 0) goto L_0x007f
                            com.carrefour.fid.android.shared.util.ServiceUtil r2 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
                            boolean r5 = r2.mo84132n(r5)
                            if (r5 == 0) goto L_0x007f
                            goto L_0x0080
                        L_0x007f:
                            r3 = r1
                        L_0x0080:
                            r0.f63809L = r3
                            kotlin.d2 r5 = kotlin.C11079d2.f28267a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75829L0(kotlin.coroutines.c):java.lang.Object");
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                    /* renamed from: M0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75830M0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
                        /*
                            r4 = this;
                            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$isPaymentOnSiteActivated$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r5
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$isPaymentOnSiteActivated$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$isPaymentOnSiteActivated$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$isPaymentOnSiteActivated$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$isPaymentOnSiteActivated$1
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
                            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f63821i
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
                            if (r1 == 0) goto L_0x005e
                            boolean r5 = r1.mo119173Q()
                            if (r5 == 0) goto L_0x005e
                            goto L_0x005f
                        L_0x005e:
                            r3 = 0
                        L_0x005f:
                            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75830M0(kotlin.coroutines.c):java.lang.Object");
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                    /* renamed from: N0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75831N0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
                        /*
                            r5 = this;
                            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$observeBasket$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r6
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$observeBasket$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$observeBasket$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$observeBasket$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$observeBasket$1
                            r0.<init>(r5, r6)
                        L_0x0018:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L_0x003c
                            if (r2 == r4) goto L_0x0034
                            if (r2 != r3) goto L_0x002c
                            kotlin.C11661u0.m45747n(r6)
                            goto L_0x0064
                        L_0x002c:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r0)
                            throw r6
                        L_0x0034:
                            java.lang.Object r2 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r2
                            kotlin.C11661u0.m45747n(r6)
                            goto L_0x004d
                        L_0x003c:
                            kotlin.C11661u0.m45747n(r6)
                            com.carrefour.fid.android.domain.interactors.basket.z r6 = r5.f63815c
                            r0.L$0 = r5
                            r0.label = r4
                            java.lang.Object r6 = r6.invoke(r0)
                            if (r6 != r1) goto L_0x004c
                            return r1
                        L_0x004c:
                            r2 = r5
                        L_0x004d:
                            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6
                            kotlinx.coroutines.flow.e r6 = kotlinx.coroutines.flow.C11909g.m47492t0(r6)
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$a r4 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$a
                            r4.<init>(r2)
                            r2 = 0
                            r0.L$0 = r2
                            r0.label = r3
                            java.lang.Object r6 = r6.collect(r4, r0)
                            if (r6 != r1) goto L_0x0064
                            return r1
                        L_0x0064:
                            kotlin.d2 r6 = kotlin.C11079d2.f28267a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75831N0(kotlin.coroutines.c):java.lang.Object");
                    }

                    /* renamed from: O0 */
                    public final void mo75832O0(double d) {
                        C28892e<C26132a> value;
                        C26132a aVar = (C26132a) C28897f.m119478b(this.f63838z.getValue());
                        if (aVar != null) {
                            if (d > aVar.mo75916j()) {
                                C11940j<C28892e<C26132a>> jVar = this.f63838z;
                                do {
                                    value = jVar.getValue();
                                    C28892e eVar = value;
                                } while (!jVar.mo24216e(value, new C28892e.C28895c(C26132a.m111703h(aVar, false, (String) null, 0.0d, 0.0d, false, true, 31, (Object) null))));
                            } else if (d >= this.f63812O) {
                                this.f63805H = Double.valueOf(d);
                                C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3ViewModel$onCardFidAmount$2(this, aVar, (C11045c<? super CheckoutStep3ViewModel$onCardFidAmount$2>) null), 3, (Object) null);
                            } else {
                                mo75841X0(d, aVar);
                            }
                        }
                    }

                    /* renamed from: P0 */
                    public final void mo75833P0() {
                        C26141a value;
                        C11940j<C26141a> jVar = this.f63810M;
                        do {
                            value = jVar.getValue();
                        } while (!jVar.mo24216e(value, C26141a.m111733d(value, false, false, 2, (Object) null)));
                    }

                    /* renamed from: Q0 */
                    public final void mo75834Q0(boolean z) {
                        PaymentType paymentType;
                        C11940j<PaymentType> jVar = this.f63832t;
                        if (z) {
                            paymentType = PaymentType.Online;
                        } else {
                            paymentType = PaymentType.OnSite;
                        }
                        jVar.setValue(paymentType);
                        if (z) {
                            this.f63826n.mo75868g();
                        } else {
                            this.f63826n.mo75869h();
                        }
                    }

                    /* renamed from: R0 */
                    public final void mo75835R0(boolean z) {
                        Double d;
                        C28892e<C26132a> value;
                        BasketAmounts w;
                        C28892e<C26132a> value2;
                        C26132a aVar = (C26132a) C28897f.m119478b(this.f63838z.getValue());
                        if (aVar != null) {
                            if (!z) {
                                C11940j<C28892e<C26132a>> jVar = this.f63838z;
                                do {
                                    value2 = jVar.getValue();
                                    C28892e eVar = value2;
                                } while (!jVar.mo24216e(value2, new C28892e.C28895c(C26132a.m111703h(aVar, false, (String) null, 0.0d, 0.0d, false, false, 47, (Object) null))));
                                return;
                            }
                            double j = aVar.mo75916j();
                            Basket basket = (Basket) C28897f.m119478b(this.f63836x.getValue());
                            if (basket == null || (w = basket.mo116855w()) == null) {
                                d = null;
                            } else {
                                d = Double.valueOf(w.mo116868D());
                            }
                            if (j < this.f63812O || d == null || d.doubleValue() < this.f63812O) {
                                C11940j<C28892e<C26132a>> jVar2 = this.f63838z;
                                do {
                                    value = jVar2.getValue();
                                    C28892e eVar2 = value;
                                } while (!jVar2.mo24216e(value, new C28892e.C28895c(C26132a.m111703h(aVar, false, (String) null, 0.0d, 0.0d, true, false, 47, (Object) null))));
                                return;
                            }
                            this.f63806I = true;
                            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3ViewModel$onUseAllCardFidPressed$2(this, aVar, (C11045c<? super CheckoutStep3ViewModel$onUseAllCardFidPressed$2>) null), 3, (Object) null);
                        }
                    }

                    @C12579k
                    /* renamed from: S0 */
                    public final C11723c2 mo75836S0(@C12579k String str) {
                        Intrinsics.checkNotNullParameter(str, "code");
                        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3ViewModel$onValidateCode$1(this, str, (C11045c<? super CheckoutStep3ViewModel$onValidateCode$1>) null), 3, (Object) null);
                    }

                    @C12579k
                    /* renamed from: T0 */
                    public final C11723c2 mo75837T0(boolean z) {
                        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3ViewModel$onValidatePayment$1(this, z, (C11045c<? super CheckoutStep3ViewModel$onValidatePayment$1>) null), 3, (Object) null);
                    }

                    /* renamed from: U0 */
                    public final void mo75838U0() {
                        C11723c2 c2Var = this.f63808K;
                        if (c2Var != null) {
                            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
                        }
                        this.f63808K = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3ViewModel$removePromoCode$1(this, (C11045c<? super CheckoutStep3ViewModel$removePromoCode$1>) null), 3, (Object) null);
                    }

                    /* renamed from: V0 */
                    public final boolean mo75839V0() {
                        C26132a aVar = (C26132a) C28897f.m119478b(this.f63838z.getValue());
                        if (aVar != null) {
                            return aVar.mo75920n();
                        }
                        return false;
                    }

                    /* renamed from: W0 */
                    public final void mo75840W0() {
                        C28892e<C26132a> value;
                        C26132a aVar = (C26132a) C28897f.m119478b(this.f63838z.getValue());
                        if (aVar != null) {
                            Double d = this.f63805H;
                            if (d != null) {
                                mo75841X0(d.doubleValue(), aVar);
                                this.f63805H = null;
                            }
                            if (this.f63806I) {
                                C11940j<C28892e<C26132a>> jVar = this.f63838z;
                                do {
                                    value = jVar.getValue();
                                    C28892e eVar = value;
                                } while (!jVar.mo24216e(value, new C28892e.C28895c(C26132a.m111703h(aVar, false, (String) null, 0.0d, 0.0d, true, false, 47, (Object) null))));
                                this.f63806I = false;
                            }
                        }
                    }

                    /* renamed from: X0 */
                    public final void mo75841X0(double d, C26132a aVar) {
                        boolean z;
                        double d2;
                        CheckoutStep3ViewModel checkoutStep3ViewModel;
                        boolean z2 = true;
                        if (d > aVar.mo75916j()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (d != aVar.mo75916j()) {
                            z2 = false;
                        }
                        if (!z) {
                            checkoutStep3ViewModel = this;
                            d2 = d;
                        } else {
                            d2 = aVar.mo75915i();
                            checkoutStep3ViewModel = this;
                        }
                        C11940j<C28892e<C26132a>> jVar = checkoutStep3ViewModel.f63838z;
                        while (true) {
                            C28892e<C26132a> value = jVar.getValue();
                            C28892e eVar = value;
                            boolean z3 = z;
                            boolean z4 = z;
                            C11940j<C28892e<C26132a>> jVar2 = jVar;
                            if (!jVar2.mo24216e(value, new C28892e.C28895c(C26132a.m111703h(aVar, false, (String) null, 0.0d, d2, z2, z3, 7, (Object) null)))) {
                                jVar = jVar2;
                                z = z4;
                            } else {
                                return;
                            }
                        }
                    }

                    /* renamed from: Y0 */
                    public final void mo75842Y0(@C12579k String str) {
                        Intrinsics.checkNotNullParameter(str, "promoCode");
                        C11723c2 c2Var = this.f63807J;
                        if (c2Var != null) {
                            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
                        }
                        this.f63807J = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3ViewModel$validatePromoCode$1(this, str, (C11045c<? super CheckoutStep3ViewModel$validatePromoCode$1>) null), 3, (Object) null);
                    }

                    @C12579k
                    public final C11907e<C26122a> getEvents() {
                        return this.f63804G;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
                    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ff  */
                    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
                    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                    @org.jetbrains.annotations.C12580l
                    /* renamed from: u0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75844u0(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.slot.Slot r11, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.Basket r12, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType r13, boolean r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
                        /*
                            r10 = this;
                            boolean r0 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$bookSlotAndValidatePayment$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r15
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$bookSlotAndValidatePayment$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$bookSlotAndValidatePayment$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$bookSlotAndValidatePayment$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$bookSlotAndValidatePayment$1
                            r0.<init>(r10, r15)
                        L_0x0018:
                            java.lang.Object r15 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r2 = r0.label
                            r3 = 5
                            r4 = 4
                            r5 = 3
                            r6 = 2
                            r7 = 1
                            r8 = 0
                            if (r2 == 0) goto L_0x0072
                            if (r2 == r7) goto L_0x0069
                            if (r2 == r6) goto L_0x0053
                            if (r2 == r5) goto L_0x003b
                            if (r2 == r4) goto L_0x0069
                            if (r2 != r3) goto L_0x0033
                            goto L_0x0069
                        L_0x0033:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r12)
                            throw r11
                        L_0x003b:
                            boolean r11 = r0.Z$0
                            java.lang.Object r12 = r0.L$1
                            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12
                            java.lang.Object r13 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r13 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r13
                            kotlin.C11661u0.m45747n(r15)
                            kotlin.Result r15 = (kotlin.Result) r15
                            java.lang.Object r14 = r15.mo21858l()
                            r9 = r13
                            r13 = r11
                        L_0x0050:
                            r11 = r9
                            goto L_0x011b
                        L_0x0053:
                            boolean r11 = r0.Z$0
                            java.lang.Object r12 = r0.L$2
                            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12
                            java.lang.Object r13 = r0.L$1
                            com.carrefour.fid.android.domain.models.slot.Slot r13 = (com.carrefour.fid.android.domain.models.slot.Slot) r13
                            java.lang.Object r14 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r14 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r14
                            kotlin.C11661u0.m45747n(r15)
                            r9 = r13
                            r13 = r11
                            r11 = r9
                            goto L_0x00e3
                        L_0x0069:
                            java.lang.Object r11 = r0.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r11
                            kotlin.C11661u0.m45747n(r15)
                            goto L_0x014b
                        L_0x0072:
                            kotlin.C11661u0.m45747n(r15)
                            kotlinx.coroutines.flow.j<java.lang.Boolean> r15 = r10.f63801D
                            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
                            r15.setValue(r2)
                            com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType$Success r15 = com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType.Success.f96702a
                            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r15)
                            if (r13 == 0) goto L_0x014a
                            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<com.carrefour.fid.android.domain.models.basket.Basket>> r13 = r10.f63836x
                            java.lang.Object r13 = r13.getValue()
                            com.carrefour.fid.android.shared.type.e r13 = (com.carrefour.fid.android.shared.type.C28892e) r13
                            java.lang.Object r13 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r13)
                            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
                            if (r13 == 0) goto L_0x009f
                            int r13 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156170a(r13)
                            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r13)
                            goto L_0x00a0
                        L_0x009f:
                            r13 = r8
                        L_0x00a0:
                            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<com.carrefour.fid.android.domain.models.basket.Basket>> r15 = r10.f63836x
                            com.carrefour.fid.android.shared.type.e$c r2 = new com.carrefour.fid.android.shared.type.e$c
                            r2.<init>(r12)
                            r15.setValue(r2)
                            boolean r15 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156173d(r12)
                            if (r15 == 0) goto L_0x00bf
                            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a> r11 = r10.f63803F
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$e r12 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26127e.f63872a
                            r0.L$0 = r10
                            r0.label = r7
                            java.lang.Object r11 = r11.mo23757h0(r12, r0)
                            if (r11 != r1) goto L_0x014a
                            return r1
                        L_0x00bf:
                            int r15 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156170a(r12)
                            if (r13 != 0) goto L_0x00c6
                            goto L_0x00cc
                        L_0x00c6:
                            int r13 = r13.intValue()
                            if (r13 == r15) goto L_0x00e1
                        L_0x00cc:
                            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a> r13 = r10.f63803F
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$g r15 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26129g.f63876a
                            r0.L$0 = r10
                            r0.L$1 = r11
                            r0.L$2 = r12
                            r0.Z$0 = r14
                            r0.label = r6
                            java.lang.Object r13 = r13.mo23757h0(r15, r0)
                            if (r13 != r1) goto L_0x00e1
                            return r1
                        L_0x00e1:
                            r13 = r14
                            r14 = r10
                        L_0x00e3:
                            com.carrefour.fid.android.domain.models.basket.BasketSlot r15 = r12.mo116826K()
                            boolean r15 = r15.mo117001l()
                            if (r15 == 0) goto L_0x0135
                            com.carrefour.fid.android.domain.models.basket.BasketSlot r15 = r12.mo116826K()
                            java.lang.String r15 = r15.mo116999j()
                            java.lang.String r2 = r11.mo119508t()
                            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r2)
                            if (r15 == 0) goto L_0x0135
                            com.carrefour.fid.android.domain.interactors.slot.j r15 = r14.f63822j
                            com.carrefour.fid.android.domain.interactors.slot.j$a r2 = new com.carrefour.fid.android.domain.interactors.slot.j$a
                            r2.<init>(r11)
                            r0.L$0 = r14
                            r0.L$1 = r12
                            r0.L$2 = r8
                            r0.Z$0 = r13
                            r0.label = r5
                            java.lang.Object r11 = r15.m172966invokegIAlus(r2, r0)
                            if (r11 != r1) goto L_0x0117
                            return r1
                        L_0x0117:
                            r9 = r14
                            r14 = r11
                            goto L_0x0050
                        L_0x011b:
                            boolean r15 = kotlin.Result.m38710j(r14)
                            if (r15 == 0) goto L_0x014b
                            r15 = r14
                            kotlin.d2 r15 = (kotlin.C11079d2) r15
                            com.carrefour.fid.android.domain.models.BasketDomain r12 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r12)
                            r0.L$0 = r11
                            r0.L$1 = r14
                            r0.label = r4
                            java.lang.Object r12 = r11.mo75845v0(r12, r13, r0)
                            if (r12 != r1) goto L_0x014b
                            return r1
                        L_0x0135:
                            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a> r11 = r14.f63803F
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$e r12 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26127e.f63872a
                            r0.L$0 = r14
                            r0.L$1 = r8
                            r0.L$2 = r8
                            r0.label = r3
                            java.lang.Object r11 = r11.mo23757h0(r12, r0)
                            if (r11 != r1) goto L_0x0148
                            return r1
                        L_0x0148:
                            r11 = r14
                            goto L_0x014b
                        L_0x014a:
                            r11 = r10
                        L_0x014b:
                            kotlinx.coroutines.flow.j<java.lang.Boolean> r11 = r11.f63801D
                            r12 = 0
                            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r12)
                            r11.setValue(r12)
                            kotlin.d2 r11 = kotlin.C11079d2.f28267a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75844u0(com.carrefour.fid.android.domain.models.slot.Slot, com.carrefour.fid.android.domain.models.basket.Basket, com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType, boolean, kotlin.coroutines.c):java.lang.Object");
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
                    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f1  */
                    /* JADX WARNING: Removed duplicated region for block: B:49:0x0114  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
                    /* renamed from: v0 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object mo75845v0(com.carrefour.fid.android.domain.models.BasketDomain r20, boolean r21, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r22) {
                        /*
                            r19 = this;
                            r0 = r19
                            r1 = r22
                            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$confirmValidationPayment$1
                            if (r2 == 0) goto L_0x0017
                            r2 = r1
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$confirmValidationPayment$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel$confirmValidationPayment$1) r2
                            int r3 = r2.label
                            r4 = -2147483648(0xffffffff80000000, float:-0.0)
                            r5 = r3 & r4
                            if (r5 == 0) goto L_0x0017
                            int r3 = r3 - r4
                            r2.label = r3
                            goto L_0x001c
                        L_0x0017:
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$confirmValidationPayment$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$confirmValidationPayment$1
                            r2.<init>(r0, r1)
                        L_0x001c:
                            java.lang.Object r1 = r2.result
                            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r4 = r2.label
                            r5 = 3
                            r6 = 2
                            r7 = 0
                            r8 = 1
                            if (r4 == 0) goto L_0x0060
                            if (r4 == r8) goto L_0x0048
                            if (r4 == r6) goto L_0x003d
                            if (r4 != r5) goto L_0x0035
                            kotlin.C11661u0.m45747n(r1)
                            goto L_0x0126
                        L_0x0035:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L_0x003d:
                            java.lang.Object r4 = r2.L$1
                            java.lang.Object r6 = r2.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r6 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r6
                            kotlin.C11661u0.m45747n(r1)
                            goto L_0x010d
                        L_0x0048:
                            java.lang.Object r4 = r2.L$1
                            com.carrefour.fid.android.domain.models.BasketDomain r4 = (com.carrefour.fid.android.domain.models.BasketDomain) r4
                            java.lang.Object r8 = r2.L$0
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel) r8
                            kotlin.C11661u0.m45747n(r1)
                            kotlin.Result r1 = (kotlin.Result) r1
                            java.lang.Object r1 = r1.mo21858l()
                            r18 = r4
                            r4 = r1
                            r1 = r18
                            goto L_0x00eb
                        L_0x0060:
                            kotlin.C11661u0.m45747n(r1)
                            com.carrefour.fid.android.domain.models.BasketAmounts r1 = r20.mo115498v()
                            if (r1 == 0) goto L_0x0072
                            double r9 = r1.mo115423B()
                            java.lang.Double r1 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9)
                            goto L_0x0073
                        L_0x0072:
                            r1 = r7
                        L_0x0073:
                            r9 = 0
                            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Double) r1, (double) r9)
                            if (r1 != 0) goto L_0x008c
                            com.carrefour.fid.android.domain.models.BasketAmounts r1 = r20.mo115498v()
                            if (r1 == 0) goto L_0x008a
                            double r9 = r1.mo115423B()
                            java.lang.Double r1 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9)
                            goto L_0x0098
                        L_0x008a:
                            r1 = r7
                            goto L_0x0098
                        L_0x008c:
                            com.carrefour.fid.android.domain.models.BasketAmounts r1 = r20.mo115498v()
                            double r9 = r1.mo115452y()
                            java.lang.Double r1 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9)
                        L_0x0098:
                            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase r4 = r0.f63820h
                            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a r15 = new com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a
                            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType> r9 = r0.f63832t
                            java.lang.Object r9 = r9.getValue()
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.PaymentType r10 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType.OnSite
                            r11 = 0
                            if (r9 != r10) goto L_0x00a9
                            r9 = r8
                            goto L_0x00aa
                        L_0x00a9:
                            r9 = r11
                        L_0x00aa:
                            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a>> r10 = r0.f63838z
                            java.lang.Object r10 = r10.getValue()
                            com.carrefour.fid.android.shared.type.e r10 = (com.carrefour.fid.android.shared.type.C28892e) r10
                            java.lang.Object r10 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r10)
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.state.a r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a) r10
                            if (r10 == 0) goto L_0x00c1
                            boolean r10 = r10.mo75920n()
                            if (r10 == 0) goto L_0x00c1
                            r11 = r8
                        L_0x00c1:
                            com.carrefour.fid.android.core.type.ValidatePaymentType r10 = r0.mo75825G0(r9, r11, r1)
                            com.carrefour.fid.android.presentation.ui.checkout.al.q r1 = r0.f63829q
                            boolean r12 = r1.mo68495j()
                            r14 = 0
                            r1 = 0
                            r16 = 48
                            r17 = 0
                            r9 = r15
                            r11 = r20
                            r13 = r21
                            r5 = r15
                            r15 = r1
                            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                            r2.L$0 = r0
                            r1 = r20
                            r2.L$1 = r1
                            r2.label = r8
                            java.lang.Object r4 = r4.m172947invokegIAlus(r5, r2)
                            if (r4 != r3) goto L_0x00ea
                            return r3
                        L_0x00ea:
                            r8 = r0
                        L_0x00eb:
                            boolean r5 = kotlin.Result.m38710j(r4)
                            if (r5 == 0) goto L_0x010e
                            r5 = r4
                            com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r5 = (com.carrefour.fid.android.presentation.models.PaymentConfirmationModel) r5
                            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a> r9 = r8.f63803F
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$d r10 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$d
                            java.lang.String r1 = r1.mo115464G()
                            r10.<init>(r5, r1)
                            r2.L$0 = r8
                            r2.L$1 = r4
                            r2.label = r6
                            java.lang.Object r1 = r9.mo23757h0(r10, r2)
                            if (r1 != r3) goto L_0x010c
                            return r3
                        L_0x010c:
                            r6 = r8
                        L_0x010d:
                            r8 = r6
                        L_0x010e:
                            java.lang.Throwable r1 = kotlin.Result.m38705e(r4)
                            if (r1 == 0) goto L_0x0126
                            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a> r1 = r8.f63803F
                            com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$e r5 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a.C26127e.f63872a
                            r2.L$0 = r4
                            r2.L$1 = r7
                            r4 = 3
                            r2.label = r4
                            java.lang.Object r1 = r1.mo23757h0(r5, r2)
                            if (r1 != r3) goto L_0x0126
                            return r3
                        L_0x0126:
                            kotlin.d2 r1 = kotlin.C11079d2.f28267a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel.mo75845v0(com.carrefour.fid.android.domain.models.BasketDomain, boolean, kotlin.coroutines.c):java.lang.Object");
                    }

                    @C12579k
                    /* renamed from: w0 */
                    public final C26115a mo75846w0() {
                        return this.f63826n;
                    }

                    @C12579k
                    /* renamed from: x0 */
                    public final C11952u<C28892e<Basket>> mo75847x0() {
                        return this.f63837y;
                    }

                    @C12579k
                    /* renamed from: y0 */
                    public final C11952u<Boolean> mo75848y0() {
                        return this.f63831s;
                    }

                    @C12579k
                    /* renamed from: z0 */
                    public final C11952u<C28892e<C26132a>> mo75849z0() {
                        return this.f63798A;
                    }
                }
