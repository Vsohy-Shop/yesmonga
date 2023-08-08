package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39923d;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.core.constants.C36187r;
import com.carrefour.fid.android.domain.interactors.basket.C37564e;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.order.C37738n;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.interactors.slot.C37861g;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import com.carrefour.fid.android.domain.models.slot.extension.SlotKt;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006¢\u0001£\u0001¤\u0001B\u0001\b\u0007\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\u0006\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u001a\u00020|\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0013\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0015\u001a\u00020\n2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019H\u0002J\u001b\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u000eH\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u001e\u0010%\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00122\u0006\u0010$\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020!H\u0002J\u0019\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b*\u0010+JA\u0010-\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0012H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0004\b0\u00101J#\u00105\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\f\u00107\u001a\u00020\n*\u000202H\u0002J\u001b\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0006J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020<H\u0002J\u001b\u0010@\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0006\u0010C\u001a\u00020BR\u0014\u0010G\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u001a\u00020|8\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R%\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0001\u0010\u0001R$\u0010\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010\u00018\u0002X\u0004ø\u0001\u0000¢\u0006\b\n\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00010\u00018\u0006ø\u0001\u0000¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¥\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$c;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$d;", "", "M0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "facilityStoreId", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/SlotArgsHome;", "homeArgs", "", "isFromHomePage", "slotId", "isSlotBooked", "Lkotlin/d2;", "F0", "(Ljava/lang/String;Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/SlotArgsHome;ZLjava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "", "", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "slotMap", "z0", "isProductThresholdExceeded", "R0", "(Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/collections/h0;", "C0", "Q0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "A0", "", "slotDateIndex", "", "Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;", "B0", "disabledPartOfDayList", "currentSlotPartOfDay", "S0", "G0", "slotDay", "H0", "slotIndex", "K0", "(Ljava/lang/Integer;)V", "selectedSlot", "I0", "(Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/slot/Slot;Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;Ljava/util/List;)V", "slot", "V0", "(Lcom/carrefour/fid/android/domain/models/slot/Slot;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "isFromHome", "T0", "(Lcom/carrefour/fid/android/domain/models/basket/Basket;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "L0", "orderId", "U0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "N0", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$a;", "partialState", "P0", "intent", "O0", "(Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/c2;", "W0", "Lcom/carrefour/fid/android/domain/interactors/slot/g;", "a", "Lcom/carrefour/fid/android/domain/interactors/slot/g;", "getSlotsUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "b", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "retrieveBasketFromCacheUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/l0;", "e", "Lcom/carrefour/fid/android/domain/interactors/basket/l0;", "synchronizeCurrentBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/e;", "f", "Lcom/carrefour/fid/android/domain/interactors/basket/e;", "bookSlotForCurrentBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/n;", "g", "Lcom/carrefour/fid/android/domain/interactors/order/n;", "updateOrderOnlineUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "h", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "fetchDeliveryStoresUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "i", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "getPromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/category/b;", "j", "Lcom/carrefour/fid/android/domain/interactors/category/b;", "getDrivePromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "k", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "getMirrorDriveServiceUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "l", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "setServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "m", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "updateStoreServiceUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "n", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "clearServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "o", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "checkRemoteConfigUseCase", "Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "p", "Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "analytics", "Landroidx/lifecycle/p0;", "q", "Landroidx/lifecycle/p0;", "E0", "()Landroidx/lifecycle/p0;", "savedStateHandle", "Lcom/carrefour/fid/android/checkout/presentation/ui/slot/d;", "r", "Lcom/carrefour/fid/android/checkout/presentation/ui/slot/d;", "args", "Lcom/carrefour/fid/android/domain/models/service/models/FacilityServiceId;", "s", "Ljava/lang/String;", "facilityServiceId", "Lkotlinx/coroutines/flow/j;", "t", "Lkotlinx/coroutines/flow/j;", "_omrFacilityServiceIdState", "Lkotlinx/coroutines/flow/u;", "u", "Lkotlinx/coroutines/flow/u;", "D0", "()Lkotlinx/coroutines/flow/u;", "omrFacilityServiceIdState", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "v", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "deliveryStores", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/slot/g;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/domain/interactors/basket/e0;Lcom/carrefour/fid/android/domain/interactors/basket/l0;Lcom/carrefour/fid/android/domain/interactors/basket/e;Lcom/carrefour/fid/android/domain/interactors/order/n;Lcom/carrefour/fid/android/domain/interactors/service/b;Lcom/carrefour/fid/android/domain/interactors/service/g;Lcom/carrefour/fid/android/domain/interactors/category/b;Lcom/carrefour/fid/android/domain/interactors/service/f;Lcom/carrefour/fid/android/domain/interactors/service/s;Lcom/carrefour/fid/android/domain/interactors/service/v;Lcom/carrefour/fid/android/domain/interactors/service/a;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;Lcom/carrefour/fid/android/checkout/presentation/analytics/a;Landroidx/lifecycle/p0;)V", "BookSlotError", "MissingProductError", "SlotUnavailableError", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceSlotViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotViewModel.kt\ncom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,559:1\n1477#2:560\n1502#2,3:561\n1505#2,3:571\n1747#2,3:574\n288#2,2:578\n1747#2,3:588\n361#3,7:564\n1#4:577\n11335#5:580\n11670#5,3:581\n11335#5:584\n11670#5,3:585\n*S KotlinDebug\n*F\n+ 1 ServiceSlotViewModel.kt\ncom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel\n*L\n216#1:560\n216#1:561,3\n216#1:571,3\n253#1:574,3\n288#1:578,2\n522#1:588,3\n216#1:564,7\n322#1:580\n322#1:581,3\n336#1:584\n336#1:585,3\n*E\n"})
public final class ServiceSlotViewModel extends BaseMVIViewModel<C39964a.C39975c, C39964a.C39977d> {
    @C12579k

    /* renamed from: a */
    public final C37861g f101876a;
    @C12579k

    /* renamed from: b */
    public final C37823k f101877b;
    @C12579k

    /* renamed from: c */
    public final C37569f0 f101878c;
    @C12579k

    /* renamed from: d */
    public final C37566e0 f101879d;
    @C12579k

    /* renamed from: e */
    public final C37584l0 f101880e;
    @C12579k

    /* renamed from: f */
    public final C37564e f101881f;
    @C12579k

    /* renamed from: g */
    public final C37738n f101882g;
    @C12579k

    /* renamed from: h */
    public final C37812b f101883h;
    @C12579k

    /* renamed from: i */
    public final C37818g f101884i;
    @C12579k

    /* renamed from: j */
    public final C37620b f101885j;
    @C12579k

    /* renamed from: k */
    public final C37817f f101886k;
    @C12579k

    /* renamed from: l */
    public final C37836s f101887l;
    @C12579k

    /* renamed from: m */
    public final C37841v f101888m;
    @C12579k

    /* renamed from: n */
    public final C37811a f101889n;
    @C12579k

    /* renamed from: o */
    public final C37807b f101890o;
    @C12579k

    /* renamed from: p */
    public final C39866a f101891p;
    @C12579k

    /* renamed from: q */
    public final C19456p0 f101892q;
    @C12579k

    /* renamed from: r */
    public final C39923d f101893r;
    @C12580l

    /* renamed from: s */
    public String f101894s;
    @C12579k

    /* renamed from: t */
    public final C11940j<FacilityServiceId> f101895t;
    @C12579k

    /* renamed from: u */
    public final C11952u<FacilityServiceId> f101896u;
    @C12580l

    /* renamed from: v */
    public C38166m f101897v;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel$BookSlotError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class BookSlotError extends Exception {

        /* renamed from: a */
        public static final int f101898a = 0;
    }

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel$MissingProductError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class MissingProductError extends Exception {

        /* renamed from: a */
        public static final int f101899a = 0;
    }

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel$SlotUnavailableError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "slot", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "a", "()Lcom/carrefour/fid/android/domain/models/slot/Slot;", "<init>", "(Lcom/carrefour/fid/android/domain/models/slot/Slot;)V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class SlotUnavailableError extends Exception {

        /* renamed from: a */
        public static final int f101900a = 8;
        @C12579k
        private final Slot slot;

        public SlotUnavailableError(@C12579k Slot slot2) {
            Intrinsics.checkNotNullParameter(slot2, OnlineStoreShopFragment.f60516Z);
            this.slot = slot2;
        }

        @C12579k
        /* renamed from: a */
        public final Slot mo131758a() {
            return this.slot;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ServiceSlotViewModel(@C12579k C37861g gVar, @C12579k C37823k kVar, @C12579k C37569f0 f0Var, @C12579k C37566e0 e0Var, @C12579k C37584l0 l0Var, @C12579k C37564e eVar, @C12579k C37738n nVar, @C12579k C37812b bVar, @C12579k C37818g gVar2, @C12579k C37620b bVar2, @C12579k C37817f fVar, @C12579k C37836s sVar, @C12579k C37841v vVar, @C12579k C37811a aVar, @C12579k C37807b bVar3, @C12579k C39866a aVar2, @C12579k C19456p0 p0Var) {
        super(C39964a.C39975c.f101961i.mo131851a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        C37861g gVar3 = gVar;
        C37823k kVar2 = kVar;
        C37569f0 f0Var2 = f0Var;
        C37566e0 e0Var2 = e0Var;
        C37584l0 l0Var2 = l0Var;
        C37564e eVar2 = eVar;
        C37738n nVar2 = nVar;
        C37812b bVar4 = bVar;
        C37818g gVar4 = gVar2;
        C37841v vVar2 = vVar;
        C39866a aVar3 = aVar2;
        Intrinsics.checkNotNullParameter(gVar3, "getSlotsUseCase");
        Intrinsics.checkNotNullParameter(kVar2, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(f0Var2, "retrieveBasketUseCase");
        Intrinsics.checkNotNullParameter(e0Var2, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(l0Var2, "synchronizeCurrentBasketUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "bookSlotForCurrentBasketUseCase");
        Intrinsics.checkNotNullParameter(nVar2, "updateOrderOnlineUseCase");
        Intrinsics.checkNotNullParameter(bVar4, "fetchDeliveryStoresUseCase");
        Intrinsics.checkNotNullParameter(gVar4, "getPromiseUseCase");
        Intrinsics.checkNotNullParameter(bVar2, "getDrivePromiseUseCase");
        Intrinsics.checkNotNullParameter(fVar, "getMirrorDriveServiceUseCase");
        Intrinsics.checkNotNullParameter(sVar, "setServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(vVar2, "updateStoreServiceUseCase");
        Intrinsics.checkNotNullParameter(aVar, "clearServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(bVar3, "checkRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "analytics");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        C37841v vVar3 = vVar2;
        this.f101876a = gVar3;
        this.f101877b = kVar2;
        this.f101878c = f0Var2;
        this.f101879d = e0Var2;
        this.f101880e = l0Var2;
        this.f101881f = eVar2;
        this.f101882g = nVar2;
        this.f101883h = bVar4;
        this.f101884i = gVar4;
        this.f101885j = bVar2;
        this.f101886k = fVar;
        this.f101887l = sVar;
        this.f101888m = vVar;
        this.f101889n = aVar;
        this.f101890o = bVar3;
        this.f101891p = aVar2;
        C19456p0 p0Var2 = p0Var;
        this.f101892q = p0Var2;
        this.f101893r = C39923d.f101802i.mo131628b(p0Var2);
        C11940j<FacilityServiceId> a = C11953v.m47628a(null);
        this.f101895t = a;
        this.f101896u = C11909g.m47470m(a);
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m162800J0(ServiceSlotViewModel serviceSlotViewModel, Integer num, Slot slot, SlotPartOfDay slotPartOfDay, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            slot = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        serviceSlotViewModel.mo131743I0(num, slot, slotPartOfDay, list);
    }

    /* renamed from: h0 */
    public static final /* synthetic */ C39964a.C39975c m162805h0(ServiceSlotViewModel serviceSlotViewModel) {
        return (C39964a.C39975c) serviceSlotViewModel.getCurrentState();
    }

    /* renamed from: A0 */
    public final void mo131735A0() {
        m162800J0(this, 0, (Slot) null, SlotPartOfDay.MORNING, mo131736B0(0), 2, (Object) null);
    }

    /* renamed from: B0 */
    public final List<SlotPartOfDay> mo131736B0(int i) {
        boolean z;
        Collection<List<Slot>> values;
        ArrayList arrayList = new ArrayList();
        SlotPartOfDay[] values2 = SlotPartOfDay.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (SlotPartOfDay slotPartOfDay : values2) {
            Map<String, List<Slot>> r = ((C39964a.C39975c) getCurrentState()).mo131847r();
            if (r == null || (values = r.values()) == null) {
                z = true;
            } else {
                z = SlotKt.m158340m(values, Integer.valueOf(i), slotPartOfDay);
            }
            if (!z) {
                arrayList.add(slotPartOfDay);
            }
            arrayList2.add(C11079d2.f28267a);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[SYNTHETIC] */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.collections.C10942h0<com.carrefour.fid.android.domain.models.slot.Slot> mo131737C0() {
        /*
            r7 = this;
            com.carrefour.fid.android.shared.base.u$d r0 = r7.getCurrentState()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39975c) r0
            java.util.Map r0 = r0.mo131847r()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.Set r2 = r0.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Iterable r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40617c6(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r2.next()
            kotlin.collections.h0 r3 = (kotlin.collections.C10942h0) r3
            int r4 = r3.mo22276a()
            java.lang.Object r3 = r3.mo22277b()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x005f
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0040:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.carrefour.fid.android.domain.models.slot.Slot r6 = (com.carrefour.fid.android.domain.models.slot.Slot) r6
            boolean r6 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158339l(r6)
            if (r6 == 0) goto L_0x0040
            goto L_0x0055
        L_0x0054:
            r5 = r1
        L_0x0055:
            com.carrefour.fid.android.domain.models.slot.Slot r5 = (com.carrefour.fid.android.domain.models.slot.Slot) r5
            if (r5 == 0) goto L_0x005f
            kotlin.collections.h0 r3 = new kotlin.collections.h0
            r3.<init>(r4, r5)
            goto L_0x0060
        L_0x005f:
            r3 = r1
        L_0x0060:
            if (r3 == 0) goto L_0x001c
            r1 = r3
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131737C0():kotlin.collections.h0");
    }

    @C12579k
    /* renamed from: D0 */
    public final C11952u<FacilityServiceId> mo131738D0() {
        return this.f101896u;
    }

    @C12579k
    /* renamed from: E0 */
    public final C19456p0 mo131739E0() {
        return this.f101892q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x038b, code lost:
        r5 = r14.f101890o;
        r6 = new com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b.C37808a(com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.f96513R0);
        r2.L$0 = r14;
        r2.L$1 = r11;
        r2.L$2 = r1;
        r2.L$3 = null;
        r2.Z$0 = r12;
        r2.Z$1 = r4;
        r2.label = 7;
        r5 = r5.m172966invokegIAlus(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03a7, code lost:
        if (r5 != r3) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a9, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03aa, code lost:
        r10 = r12;
        r13 = r14;
        r12 = r11;
        r11 = r1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03b3, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03b5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03b6, code lost:
        r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, (java.lang.Object) kotlin.coroutines.jvm.internal.C11064a.m42615a(true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03be, code lost:
        if (r11 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03c0, code lost:
        r5 = r11.mo116817B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03c4, code lost:
        if (r5 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03ca, code lost:
        if (r5.isEmpty() != true) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03cc, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03ce, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03cf, code lost:
        if (r5 == false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03d1, code lost:
        if (r1 == false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03d3, code lost:
        r1 = r13.f101885j;
        r2.L$0 = r13;
        r2.L$1 = r12;
        r2.L$2 = r11;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 8;
        r1 = r1.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03e7, code lost:
        if (r1 != r3) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03e9, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03ee, code lost:
        if (kotlin.Result.m38710j(r12) == false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03f0, code lost:
        r11 = (com.carrefour.fid.android.domain.models.category.C37992a) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03f9, code lost:
        if (r11.mo117312f() != com.carrefour.fid.android.domain.models.category.PromiseType.f95629a) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03fb, code lost:
        r15.f101895t.setValue(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r11.mo117310e()));
        r1 = r15.f101877b;
        r2.L$0 = r15;
        r2.L$1 = r14;
        r2.L$2 = r13;
        r2.L$3 = r12;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 9;
        r1 = r1.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x041e, code lost:
        if (r1 != r3) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0420, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0421, code lost:
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0429, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x042b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x042c, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x042e, code lost:
        if (r1 == null) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0430, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0434, code lost:
        if (r1 == null) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0436, code lost:
        r1 = r1.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x043a, code lost:
        if (r1 == null) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x043c, code lost:
        r14.f101894s = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0442, code lost:
        r14.f101891p.mo131449k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0448, code lost:
        r15.f101894s = r11.mo117310e();
        r1 = r15.f101877b;
        r2.L$0 = r15;
        r2.L$1 = r14;
        r2.L$2 = r13;
        r2.L$3 = r12;
        r2.L$4 = r11;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 10;
        r1 = r1.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0466, code lost:
        if (r1 != r3) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0468, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x046d, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x046f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0470, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0472, code lost:
        if (r1 == null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0474, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0478, code lost:
        if (r1 == null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x047a, code lost:
        r1 = r1.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x047e, code lost:
        if (r1 == null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0494, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) com.carrefour.fid.android.shared.extension.C28789y.m119125h(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)), (java.lang.Object) com.carrefour.fid.android.shared.extension.C28789y.m119125h(r11.mo117310e())) != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0496, code lost:
        r15.f101895t.setValue(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04a3, code lost:
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04a7, code lost:
        r28 = r12;
        r12 = r11;
        r11 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ad, code lost:
        r11 = r13;
        r13 = r14;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04b4, code lost:
        if (kotlin.Result.m38705e(r12) == null) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04b6, code lost:
        r1 = r14.f101877b;
        r2.L$0 = r14;
        r2.L$1 = r13;
        r2.L$2 = r11;
        r2.L$3 = r12;
        r2.L$4 = null;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 11;
        r1 = r1.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04ce, code lost:
        if (r1 != r3) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04d0, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04d1, code lost:
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d7, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04d9, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04da, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04dc, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04de, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e2, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04e4, code lost:
        r1 = r1.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04e8, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04ea, code lost:
        r13.f101894s = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04f2, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f5, code lost:
        r1 = r13.f101877b;
        r2.L$0 = r13;
        r2.L$1 = r12;
        r2.L$2 = r11;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 12;
        r1 = r1.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0509, code lost:
        if (r1 != r3) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x050b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0510, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0512, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0513, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0515, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0517, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x051b, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x051d, code lost:
        r1 = r1.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0521, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0523, code lost:
        r13.f101894s = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x052b, code lost:
        r14.f101894s = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0531, code lost:
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0532, code lost:
        r5 = r14.f101876a;
        r7 = r14.f101894s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010f, code lost:
        r14 = r12;
        r15 = r13;
        r12 = r1;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0538, code lost:
        if (r7 != null) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x053a, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x053b, code lost:
        if (r7 != null) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x053d, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x053f, code lost:
        r6 = new com.carrefour.fid.android.domain.interactors.slot.C37861g.C37862a(r7);
        r2.L$0 = r14;
        r2.L$1 = r11;
        r2.L$2 = r1;
        r2.L$3 = null;
        r2.L$4 = null;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 13;
        r5 = r5.m172966invokegIAlus(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0558, code lost:
        if (r5 != r3) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x055a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x055b, code lost:
        r12 = r11;
        r13 = r14;
        r11 = r1;
        r1 = r10;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0564, code lost:
        if (kotlin.Result.m38710j(r10) == false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0566, code lost:
        r6 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r10;
        r7 = new kotlin.jvm.functions.C11300l[]{com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$7$slotMap$1.f101901f, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$7$slotMap$2.f101902f};
        r7 = new java.util.LinkedHashMap();
        r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r6.mo119478e(), kotlin.comparisons.C11006g.m42420h(r7)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0592, code lost:
        if (r5.hasNext() == false) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0594, code lost:
        r14 = r5.next();
        r15 = ((com.carrefour.fid.android.domain.models.slot.Slot) r14).mo119504p().substring(0, 10);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, "this as java.lang.String…ing(startIndex, endIndex)");
        r8 = r7.get(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05af, code lost:
        if (r8 != null) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05b1, code lost:
        r8 = new java.util.ArrayList();
        r7.put(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05b9, code lost:
        ((java.util.List) r8).add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05c1, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05c6, code lost:
        if (r13.mo131757z0(r7) != false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05c8, code lost:
        r13.emitEvent(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39970b.C39972b(new com.carrefour.fid.android.shared.p046io.EmptyListThrowable()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05d7, code lost:
        if (r1 == false) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05d9, code lost:
        r13.f101891p.mo131442d(r7.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05e3, code lost:
        r1 = r13.f101877b;
        r2.L$0 = r13;
        r2.L$1 = r12;
        r2.L$2 = r11;
        r2.L$3 = r10;
        r2.L$4 = r6;
        r2.L$5 = r7;
        r2.Z$0 = r4;
        r2.label = 14;
        r1 = r1.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05fb, code lost:
        if (r1 != r3) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05fd, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05fe, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0603, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0605, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0606, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0608, code lost:
        if (r1 == null) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x060a, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x060f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0610, code lost:
        r7 = r13.f101891p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0612, code lost:
        if (r11 == null) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0614, code lost:
        r8 = r11.mo116829N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0619, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x061a, code lost:
        if (r1 == null) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x061c, code lost:
        r1 = r1.mo119176T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0621, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0622, code lost:
        r7.mo131441c(r8, r1, r5.values());
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x062a, code lost:
        r13.mo131749P0(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39965a.C39968c(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0632, code lost:
        if (r4 == false) goto L_0x0663;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0634, code lost:
        if (r12 == null) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x063a, code lost:
        if (r12.length() != 0) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x063d, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x063f, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0640, code lost:
        if (r7 != false) goto L_0x0663;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0642, code lost:
        r1 = r6.mo119480f();
        r2.L$0 = r13;
        r2.L$1 = r10;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.L$4 = null;
        r2.L$5 = null;
        r2.label = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x065b, code lost:
        if (r13.mo131751R0(r12, r1, r2) != r3) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x065d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x065e, code lost:
        r3 = r10;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0660, code lost:
        r13 = r2;
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0663, code lost:
        r1 = r6.mo119480f();
        r2.L$0 = r13;
        r2.L$1 = r10;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.L$4 = null;
        r2.L$5 = null;
        r2.label = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x067c, code lost:
        if (r13.mo131750Q0(r1, r2) != r3) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x067e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x067f, code lost:
        r1 = kotlin.Result.m38705e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0683, code lost:
        if (r1 == null) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0685, code lost:
        r13.emitEvent(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39970b.C39972b(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x068f, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x020f, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0211, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0212, code lost:
        r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0214, code lost:
        if (r10 == null) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0216, code lost:
        r13 = r10.mo131774f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0220, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE) == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0222, code lost:
        r13 = r14.f101883h;
        r16 = r10.mo131772e().getLatitude();
        r18 = r10.mo131772e().getLongitude();
        r10 = r15;
        r15 = new com.carrefour.fid.android.domain.interactors.service.C37812b.C37813a(r16, r18, false, 0, 0, 0, true, false, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r2.L$0 = r14;
        r2.L$1 = r11;
        r2.L$2 = r1;
        r2.L$3 = null;
        r2.Z$0 = r12;
        r2.Z$1 = r4;
        r2.label = 2;
        r10 = r13.m172966invokegIAlus(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x025c, code lost:
        if (r10 != r3) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x025e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x025f, code lost:
        r13 = r14;
        r28 = r11;
        r11 = r1;
        r1 = r28;
        r29 = r12;
        r12 = r10;
        r10 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x026e, code lost:
        if (kotlin.Result.m38710j(r12) == false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0270, code lost:
        r14 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r12;
        r13.f101897v = r14;
        r15 = r13.f101884i;
        r6 = new com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a(r14, false, com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE);
        r2.L$0 = r13;
        r2.L$1 = r1;
        r2.L$2 = r11;
        r2.L$3 = r12;
        r2.L$4 = r14;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 3;
        r5 = r15.m172966invokegIAlus(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0293, code lost:
        if (r5 != r3) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0295, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0296, code lost:
        r28 = r13;
        r13 = r1;
        r1 = r5;
        r5 = r12;
        r12 = r11;
        r11 = r14;
        r14 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02a3, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x02a5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02a6, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02a8, code lost:
        if (r1 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02aa, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02ae, code lost:
        if (r1 != null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02b2, code lost:
        if (r12 == null) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02bc, code lost:
        if (r12.mo116817B().isEmpty() == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02be, code lost:
        r6 = r14.f101884i;
        r15 = new com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a(r11, true, com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE);
        r2.L$0 = r14;
        r2.L$1 = r13;
        r2.L$2 = r12;
        r2.L$3 = r5;
        r2.L$4 = r1;
        r2.Z$0 = r10;
        r2.Z$1 = r4;
        r2.label = 5;
        r5 = r6.m172966invokegIAlus(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02dc, code lost:
        if (r5 != r3) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02de, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02df, code lost:
        r11 = r1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02e5, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02e7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02e8, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02ea, code lost:
        if (r1 == null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02ec, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02f0, code lost:
        if (r1 == null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02f2, code lost:
        r1 = r1.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02f7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02f8, code lost:
        if (r1 == null) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02fa, code lost:
        r14.f101895t.setValue(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)));
        r14.f101891p.mo131449k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x030c, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x030d, code lost:
        r14.f101894s = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1.mo119163G());
        r1 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0318, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x031b, code lost:
        r1 = r14.f101889n;
        r2.L$0 = null;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.L$4 = null;
        r2.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x032e, code lost:
        if (r1.m172965invokeIoAF18A(r2) != r3) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0330, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0333, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0334, code lost:
        r14 = r13;
        r28 = r11;
        r11 = r1;
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0342, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE) == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0344, code lost:
        r5 = r14.f101877b;
        r2.L$0 = r14;
        r2.L$1 = r11;
        r2.L$2 = r1;
        r2.L$3 = null;
        r2.Z$0 = r12;
        r2.Z$1 = r4;
        r2.label = 6;
        r5 = r5.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0359, code lost:
        if (r5 != r3) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x035b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x035c, code lost:
        r10 = r12;
        r13 = r14;
        r12 = r11;
        r11 = r1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0365, code lost:
        if (kotlin.Result.m38709i(r1) == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0367, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0368, code lost:
        r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x036a, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x036c, code lost:
        r1 = r1.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0370, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0372, code lost:
        r1 = r1.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0376, code lost:
        if (r1 == null) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0378, code lost:
        r13.f101894s = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x037e, code lost:
        r1 = r11;
        r11 = r12;
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0389, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE) == false) goto L_0x0531;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131740F0(java.lang.String r31, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r32, boolean r33, java.lang.String r34, boolean r35, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r36) {
        /*
            r30 = this;
            r0 = r30
            r1 = r36
            boolean r2 = r1 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$1 r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$1 r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            switch(r4) {
                case 0: goto L_0x01dc;
                case 1: goto L_0x01b9;
                case 2: goto L_0x0199;
                case 3: goto L_0x0174;
                case 4: goto L_0x016a;
                case 5: goto L_0x014b;
                case 6: goto L_0x0130;
                case 7: goto L_0x0115;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00d9;
                case 10: goto L_0x00b8;
                case 11: goto L_0x009d;
                case 12: goto L_0x0082;
                case 13: goto L_0x0062;
                case 14: goto L_0x003e;
                case 15: goto L_0x0033;
                case 16: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            java.lang.Object r3 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0660
        L_0x003e:
            boolean r4 = r2.Z$0
            java.lang.Object r5 = r2.L$5
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r2.L$4
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r6 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r6
            java.lang.Object r10 = r2.L$3
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r9 = r7
            goto L_0x05ff
        L_0x0062:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r28 = r10
            r10 = r1
            r1 = r28
            goto L_0x0560
        L_0x0082:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x050c
        L_0x009d:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x04d3
        L_0x00b8:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$4
            com.carrefour.fid.android.domain.models.category.a r11 = (com.carrefour.fid.android.domain.models.category.C37992a) r11
            java.lang.Object r12 = r2.L$3
            java.lang.Object r13 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
            java.lang.Object r14 = r2.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r15 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r15
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0469
        L_0x00d9:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$3
            java.lang.Object r12 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12
            java.lang.Object r13 = r2.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r14 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r14
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0425
        L_0x00f6:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
        L_0x010f:
            r14 = r12
            r15 = r13
            r12 = r1
            r13 = r11
            goto L_0x03ea
        L_0x0115:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x03af
        L_0x0130:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0361
        L_0x014b:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$4
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r11
            java.lang.Object r12 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r12 = (com.carrefour.fid.android.domain.models.basket.Basket) r12
            java.lang.Object r13 = r2.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r14 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r14
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x02e1
        L_0x016a:
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x0331
        L_0x0174:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$4
            com.carrefour.fid.android.domain.models.service.models.m r11 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r11
            java.lang.Object r12 = r2.L$3
            java.lang.Object r13 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
            java.lang.Object r14 = r2.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r15 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r15
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r5 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            goto L_0x029f
        L_0x0199:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            java.lang.Object r12 = r2.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r13
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r28 = r12
            r12 = r1
            r1 = r28
            goto L_0x026a
        L_0x01b9:
            boolean r4 = r2.Z$1
            boolean r10 = r2.Z$0
            java.lang.Object r11 = r2.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r12 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome) r12
            java.lang.Object r13 = r2.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r14 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r14
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r28 = r12
            r12 = r10
            r10 = r28
            goto L_0x020b
        L_0x01dc:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$b r1 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39965a.C39967b.f101940b
            r0.mo131749P0(r1)
            com.carrefour.fid.android.domain.interactors.basket.f0 r1 = r0.f101878c
            r2.L$0 = r0
            r4 = r31
            r2.L$1 = r4
            r10 = r32
            r2.L$2 = r10
            r11 = r34
            r2.L$3 = r11
            r12 = r33
            r2.Z$0 = r12
            r13 = r35
            r2.Z$1 = r13
            r2.label = r8
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0205
            return r3
        L_0x0205:
            r14 = r0
            r28 = r13
            r13 = r4
            r4 = r28
        L_0x020b:
            boolean r15 = kotlin.Result.m38709i(r1)
            if (r15 == 0) goto L_0x0212
            r1 = r9
        L_0x0212:
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            if (r10 == 0) goto L_0x052b
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r13 = r10.mo131774f()
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r15 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x033c
            com.carrefour.fid.android.domain.interactors.service.b r13 = r14.f101883h
            com.carrefour.fid.android.domain.interactors.service.b$a r15 = new com.carrefour.fid.android.domain.interactors.service.b$a
            com.carrefour.fid.android.domain.models.LatLon r16 = r10.mo131772e()
            double r16 = r16.getLatitude()
            com.carrefour.fid.android.domain.models.LatLon r10 = r10.mo131772e()
            double r18 = r10.getLongitude()
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 56
            r27 = 0
            r10 = r15
            r15.<init>(r16, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.L$0 = r14
            r2.L$1 = r11
            r2.L$2 = r1
            r2.L$3 = r9
            r2.Z$0 = r12
            r2.Z$1 = r4
            r2.label = r6
            java.lang.Object r10 = r13.m172966invokegIAlus(r10, r2)
            if (r10 != r3) goto L_0x025f
            return r3
        L_0x025f:
            r13 = r14
            r28 = r11
            r11 = r1
            r1 = r28
            r29 = r12
            r12 = r10
            r10 = r29
        L_0x026a:
            boolean r14 = kotlin.Result.m38710j(r12)
            if (r14 == 0) goto L_0x0334
            r14 = r12
            com.carrefour.fid.android.domain.models.service.models.m r14 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r14
            r13.f101897v = r14
            com.carrefour.fid.android.domain.interactors.service.g r15 = r13.f101884i
            com.carrefour.fid.android.domain.interactors.service.g$a r6 = new com.carrefour.fid.android.domain.interactors.service.g$a
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r5 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            r6.<init>(r14, r7, r5)
            r2.L$0 = r13
            r2.L$1 = r1
            r2.L$2 = r11
            r2.L$3 = r12
            r2.L$4 = r14
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 3
            r2.label = r5
            java.lang.Object r5 = r15.m172966invokegIAlus(r6, r2)
            if (r5 != r3) goto L_0x0296
            return r3
        L_0x0296:
            r28 = r13
            r13 = r1
            r1 = r5
            r5 = r12
            r12 = r11
            r11 = r14
            r14 = r28
        L_0x029f:
            boolean r6 = kotlin.Result.m38709i(r1)
            if (r6 == 0) goto L_0x02a6
            r1 = r9
        L_0x02a6:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x031b
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 != 0) goto L_0x02b2
            goto L_0x031b
        L_0x02b2:
            if (r12 == 0) goto L_0x030d
            java.util.List r6 = r12.mo116817B()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x030d
            com.carrefour.fid.android.domain.interactors.service.g r6 = r14.f101884i
            com.carrefour.fid.android.domain.interactors.service.g$a r15 = new com.carrefour.fid.android.domain.interactors.service.g$a
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r7 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            r15.<init>(r11, r8, r7)
            r2.L$0 = r14
            r2.L$1 = r13
            r2.L$2 = r12
            r2.L$3 = r5
            r2.L$4 = r1
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 5
            r2.label = r5
            java.lang.Object r5 = r6.m172966invokegIAlus(r15, r2)
            if (r5 != r3) goto L_0x02df
            return r3
        L_0x02df:
            r11 = r1
            r1 = r5
        L_0x02e1:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x02e8
            r1 = r9
        L_0x02e8:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x02f7
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 == 0) goto L_0x02f7
            java.lang.String r1 = r1.mo119163G()
            goto L_0x02f8
        L_0x02f7:
            r1 = r9
        L_0x02f8:
            if (r1 == 0) goto L_0x030c
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.FacilityServiceId> r5 = r14.f101895t
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r1)
            r5.setValue(r1)
            com.carrefour.fid.android.checkout.presentation.analytics.a r1 = r14.f101891p
            r1.mo131449k()
        L_0x030c:
            r1 = r11
        L_0x030d:
            java.lang.String r1 = r1.mo119163G()
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            r14.f101894s = r1
            r1 = r12
        L_0x0318:
            r11 = r13
            goto L_0x0532
        L_0x031b:
            com.carrefour.fid.android.domain.interactors.service.a r1 = r14.f101889n
            r2.L$0 = r9
            r2.L$1 = r9
            r2.L$2 = r9
            r2.L$3 = r9
            r2.L$4 = r9
            r4 = 4
            r2.label = r4
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0331
            return r3
        L_0x0331:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0334:
            r14 = r13
            r28 = r11
            r11 = r1
            r1 = r28
            goto L_0x0532
        L_0x033c:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$H1h3 r5 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0383
            com.carrefour.fid.android.domain.interactors.service.k r5 = r14.f101877b
            r2.L$0 = r14
            r2.L$1 = r11
            r2.L$2 = r1
            r2.L$3 = r9
            r2.Z$0 = r12
            r2.Z$1 = r4
            r6 = 6
            r2.label = r6
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r2)
            if (r5 != r3) goto L_0x035c
            return r3
        L_0x035c:
            r10 = r12
            r13 = r14
            r12 = r11
            r11 = r1
            r1 = r5
        L_0x0361:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x0368
            r1 = r9
        L_0x0368:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x037e
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 == 0) goto L_0x037e
            java.lang.String r1 = r1.mo119163G()
            if (r1 == 0) goto L_0x037e
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            r13.f101894s = r1
        L_0x037e:
            r1 = r11
            r11 = r12
            r14 = r13
            goto L_0x0532
        L_0x0383:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r5 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0531
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r5 = r14.f101890o
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r6 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r7 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.OmrDrive
            r6.<init>(r7)
            r2.L$0 = r14
            r2.L$1 = r11
            r2.L$2 = r1
            r2.L$3 = r9
            r2.Z$0 = r12
            r2.Z$1 = r4
            r7 = 7
            r2.label = r7
            java.lang.Object r5 = r5.m172966invokegIAlus(r6, r2)
            if (r5 != r3) goto L_0x03aa
            return r3
        L_0x03aa:
            r10 = r12
            r13 = r14
            r12 = r11
            r11 = r1
            r1 = r5
        L_0x03af:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x03b6
            r1 = r9
        L_0x03b6:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r11 == 0) goto L_0x03ce
            java.util.List r5 = r11.mo116817B()
            if (r5 == 0) goto L_0x03ce
            boolean r5 = r5.isEmpty()
            if (r5 != r8) goto L_0x03ce
            r5 = r8
            goto L_0x03cf
        L_0x03ce:
            r5 = 0
        L_0x03cf:
            if (r5 == 0) goto L_0x04f5
            if (r1 == 0) goto L_0x04f5
            com.carrefour.fid.android.domain.interactors.category.b r1 = r13.f101885j
            r2.L$0 = r13
            r2.L$1 = r12
            r2.L$2 = r11
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 8
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x010f
            return r3
        L_0x03ea:
            boolean r1 = kotlin.Result.m38710j(r12)
            if (r1 == 0) goto L_0x04ad
            r11 = r12
            com.carrefour.fid.android.domain.models.category.a r11 = (com.carrefour.fid.android.domain.models.category.C37992a) r11
            com.carrefour.fid.android.domain.models.category.PromiseType r1 = r11.mo117312f()
            com.carrefour.fid.android.domain.models.category.PromiseType r5 = com.carrefour.fid.android.domain.models.category.PromiseType.Express
            if (r1 != r5) goto L_0x0448
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.FacilityServiceId> r1 = r15.f101895t
            java.lang.String r5 = r11.mo117310e()
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r5)
            r1.setValue(r5)
            com.carrefour.fid.android.domain.interactors.service.k r1 = r15.f101877b
            r2.L$0 = r15
            r2.L$1 = r14
            r2.L$2 = r13
            r2.L$3 = r12
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 9
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0421
            return r3
        L_0x0421:
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
        L_0x0425:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x042c
            r1 = r9
        L_0x042c:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x0442
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 == 0) goto L_0x0442
            java.lang.String r1 = r1.mo119163G()
            if (r1 == 0) goto L_0x0442
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            r14.f101894s = r1
        L_0x0442:
            com.carrefour.fid.android.checkout.presentation.analytics.a r1 = r14.f101891p
            r1.mo131449k()
            goto L_0x04a7
        L_0x0448:
            java.lang.String r1 = r11.mo117310e()
            r15.f101894s = r1
            com.carrefour.fid.android.domain.interactors.service.k r1 = r15.f101877b
            r2.L$0 = r15
            r2.L$1 = r14
            r2.L$2 = r13
            r2.L$3 = r12
            r2.L$4 = r11
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 10
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0469
            return r3
        L_0x0469:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x0470
            r1 = r9
        L_0x0470:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x04a3
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 == 0) goto L_0x04a3
            java.lang.String r1 = r1.mo119163G()
            if (r1 == 0) goto L_0x04a3
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            java.lang.String r5 = com.carrefour.fid.android.shared.extension.C28789y.m119125h(r5)
            java.lang.String r6 = r11.mo117310e()
            java.lang.String r6 = com.carrefour.fid.android.shared.extension.C28789y.m119125h(r6)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 != 0) goto L_0x04a3
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.service.models.FacilityServiceId> r5 = r15.f101895t
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r1)
            r5.setValue(r1)
        L_0x04a3:
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
        L_0x04a7:
            r28 = r12
            r12 = r11
            r11 = r28
            goto L_0x04b0
        L_0x04ad:
            r11 = r13
            r13 = r14
            r14 = r15
        L_0x04b0:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r12)
            if (r1 == 0) goto L_0x04f2
            com.carrefour.fid.android.domain.interactors.service.k r1 = r14.f101877b
            r2.L$0 = r14
            r2.L$1 = r13
            r2.L$2 = r11
            r2.L$3 = r12
            r2.L$4 = r9
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 11
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x04d1
            return r3
        L_0x04d1:
            r12 = r13
            r13 = r14
        L_0x04d3:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x04da
            r1 = r9
        L_0x04da:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x037e
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 == 0) goto L_0x037e
            java.lang.String r1 = r1.mo119163G()
            if (r1 == 0) goto L_0x037e
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            r13.f101894s = r1
            goto L_0x037e
        L_0x04f2:
            r1 = r11
            goto L_0x0318
        L_0x04f5:
            com.carrefour.fid.android.domain.interactors.service.k r1 = r13.f101877b
            r2.L$0 = r13
            r2.L$1 = r12
            r2.L$2 = r11
            r2.Z$0 = r10
            r2.Z$1 = r4
            r5 = 12
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x050c
            return r3
        L_0x050c:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x0513
            r1 = r9
        L_0x0513:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x037e
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            if (r1 == 0) goto L_0x037e
            java.lang.String r1 = r1.mo119163G()
            if (r1 == 0) goto L_0x037e
            java.lang.String r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            r13.f101894s = r1
            goto L_0x037e
        L_0x052b:
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r13)
            r14.f101894s = r5
        L_0x0531:
            r10 = r12
        L_0x0532:
            com.carrefour.fid.android.domain.interactors.slot.g r5 = r14.f101876a
            com.carrefour.fid.android.domain.interactors.slot.g$a r6 = new com.carrefour.fid.android.domain.interactors.slot.g$a
            java.lang.String r7 = r14.f101894s
            if (r7 != 0) goto L_0x053b
            r7 = r9
        L_0x053b:
            if (r7 != 0) goto L_0x053f
            java.lang.String r7 = ""
        L_0x053f:
            r6.<init>(r7)
            r2.L$0 = r14
            r2.L$1 = r11
            r2.L$2 = r1
            r2.L$3 = r9
            r2.L$4 = r9
            r2.Z$0 = r10
            r2.Z$1 = r4
            r7 = 13
            r2.label = r7
            java.lang.Object r5 = r5.m172966invokegIAlus(r6, r2)
            if (r5 != r3) goto L_0x055b
            return r3
        L_0x055b:
            r12 = r11
            r13 = r14
            r11 = r1
            r1 = r10
            r10 = r5
        L_0x0560:
            boolean r5 = kotlin.Result.m38710j(r10)
            if (r5 == 0) goto L_0x067f
            r6 = r10
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r6 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r6
            java.util.List r5 = r6.mo119478e()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r7 = 2
            kotlin.jvm.functions.l[] r7 = new kotlin.jvm.functions.C11300l[r7]
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$7$slotMap$1 r14 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$7$slotMap$1.f101901f
            r15 = 0
            r7[r15] = r14
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$7$slotMap$2 r14 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$getSlotDetails$7$slotMap$2.f101902f
            r7[r8] = r14
            java.util.Comparator r7 = kotlin.comparisons.C11006g.m42420h(r7)
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r5, r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x058e:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x05c1
            java.lang.Object r14 = r5.next()
            r15 = r14
            com.carrefour.fid.android.domain.models.slot.Slot r15 = (com.carrefour.fid.android.domain.models.slot.Slot) r15
            java.lang.String r15 = r15.mo119504p()
            r8 = 10
            r9 = 0
            java.lang.String r15 = r15.substring(r9, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r8)
            java.lang.Object r8 = r7.get(r15)
            if (r8 != 0) goto L_0x05b9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.put(r15, r8)
        L_0x05b9:
            java.util.List r8 = (java.util.List) r8
            r8.add(r14)
            r8 = 1
            r9 = 0
            goto L_0x058e
        L_0x05c1:
            r9 = 0
            boolean r5 = r13.mo131757z0(r7)
            if (r5 != 0) goto L_0x05d7
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r1 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.shared.io.EmptyListThrowable r2 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r2.<init>()
            r1.<init>(r2)
            r13.emitEvent(r1)
            goto L_0x067f
        L_0x05d7:
            if (r1 == 0) goto L_0x05e3
            com.carrefour.fid.android.checkout.presentation.analytics.a r1 = r13.f101891p
            java.util.Collection r5 = r7.values()
            r1.mo131442d(r5)
            goto L_0x062a
        L_0x05e3:
            com.carrefour.fid.android.domain.interactors.service.k r1 = r13.f101877b
            r2.L$0 = r13
            r2.L$1 = r12
            r2.L$2 = r11
            r2.L$3 = r10
            r2.L$4 = r6
            r2.L$5 = r7
            r2.Z$0 = r4
            r5 = 14
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x05fe
            return r3
        L_0x05fe:
            r5 = r7
        L_0x05ff:
            boolean r7 = kotlin.Result.m38709i(r1)
            if (r7 == 0) goto L_0x0606
            r1 = 0
        L_0x0606:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x060f
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            goto L_0x0610
        L_0x060f:
            r1 = 0
        L_0x0610:
            com.carrefour.fid.android.checkout.presentation.analytics.a r7 = r13.f101891p
            if (r11 == 0) goto L_0x0619
            com.carrefour.fid.android.domain.models.basket.BasketType r8 = r11.mo116829N()
            goto L_0x061a
        L_0x0619:
            r8 = 0
        L_0x061a:
            if (r1 == 0) goto L_0x0621
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = r1.mo119176T()
            goto L_0x0622
        L_0x0621:
            r1 = 0
        L_0x0622:
            java.util.Collection r11 = r5.values()
            r7.mo131441c(r8, r1, r11)
            r7 = r5
        L_0x062a:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$c r1 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$c
            r1.<init>(r7)
            r13.mo131749P0(r1)
            if (r4 == 0) goto L_0x0663
            if (r12 == 0) goto L_0x063f
            int r1 = r12.length()
            if (r1 != 0) goto L_0x063d
            goto L_0x063f
        L_0x063d:
            r7 = r9
            goto L_0x0640
        L_0x063f:
            r7 = 1
        L_0x0640:
            if (r7 != 0) goto L_0x0663
            boolean r1 = r6.mo119480f()
            r2.L$0 = r13
            r2.L$1 = r10
            r4 = 0
            r2.L$2 = r4
            r2.L$3 = r4
            r2.L$4 = r4
            r2.L$5 = r4
            r4 = 15
            r2.label = r4
            java.lang.Object r1 = r13.mo131751R0(r12, r1, r2)
            if (r1 != r3) goto L_0x065e
            return r3
        L_0x065e:
            r3 = r10
            r2 = r13
        L_0x0660:
            r13 = r2
            r10 = r3
            goto L_0x067f
        L_0x0663:
            boolean r1 = r6.mo119480f()
            r2.L$0 = r13
            r2.L$1 = r10
            r4 = 0
            r2.L$2 = r4
            r2.L$3 = r4
            r2.L$4 = r4
            r2.L$5 = r4
            r4 = 16
            r2.label = r4
            java.lang.Object r1 = r13.mo131750Q0(r1, r2)
            if (r1 != r3) goto L_0x065e
            return r3
        L_0x067f:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r10)
            if (r1 == 0) goto L_0x068d
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            r2.<init>(r1)
            r13.emitEvent(r2)
        L_0x068d:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131740F0(java.lang.String, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome, boolean, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: G0 */
    public final void mo131741G0(int i) {
        List<SlotPartOfDay> B0 = mo131736B0(i);
        List Q5 = CollectionsKt___CollectionsKt.m40557Q5(B0);
        SlotPartOfDay s = ((C39964a.C39975c) getCurrentState()).mo131848s();
        if (s == null) {
            s = SlotPartOfDay.MORNING;
        }
        SlotPartOfDay S0 = mo131752S0(Q5, s);
        m162800J0(this, Integer.valueOf(i), (Slot) null, S0, B0, 2, (Object) null);
    }

    /* renamed from: H0 */
    public final void mo131742H0(SlotPartOfDay slotPartOfDay) {
        m162800J0(this, ((C39964a.C39975c) getCurrentState()).mo131846q(), (Slot) null, slotPartOfDay, (List) null, 10, (Object) null);
    }

    /* renamed from: I0 */
    public final void mo131743I0(Integer num, Slot slot, SlotPartOfDay slotPartOfDay, List<? extends SlotPartOfDay> list) {
        List<Slot> list2;
        Collection<List<Slot>> values;
        Map<String, List<Slot>> r = ((C39964a.C39975c) getCurrentState()).mo131847r();
        if (r == null || (values = r.values()) == null || (list2 = SlotKt.m158347t(values, num, slotPartOfDay)) == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        mo131749P0(new C39964a.C39965a.C39969d(list2, slot, num, slotPartOfDay, list));
    }

    /* renamed from: K0 */
    public final void mo131744K0(Integer num) {
        Slot slot;
        int i;
        List<Slot> t = ((C39964a.C39975c) getCurrentState()).mo131849t();
        int i2 = 0;
        if (t != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            slot = t.get(i);
        } else {
            slot = null;
        }
        Slot slot2 = slot;
        Integer q = ((C39964a.C39975c) getCurrentState()).mo131846q();
        if (q != null) {
            i2 = q.intValue();
        }
        Integer valueOf = Integer.valueOf(i2);
        SlotPartOfDay s = ((C39964a.C39975c) getCurrentState()).mo131848s();
        if (s == null) {
            s = SlotPartOfDay.MORNING;
        }
        m162800J0(this, valueOf, slot2, s, (List) null, 8, (Object) null);
    }

    /* renamed from: L0 */
    public final boolean mo131745L0(Basket basket) {
        boolean z;
        Iterable<Offer> B = basket.mo116817B();
        if ((B instanceof Collection) && ((Collection) B).isEmpty()) {
            return false;
        }
        for (Offer U : B) {
            if (U.mo118012U() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131746M0(kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$initFsidFromServiceSelection$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$initFsidFromServiceSelection$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$initFsidFromServiceSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$initFsidFromServiceSelection$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$initFsidFromServiceSelection$1
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
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f101877b
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
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
            if (r5 == 0) goto L_0x005b
            java.lang.String r1 = r5.mo119163G()
        L_0x005b:
            if (r1 != 0) goto L_0x005f
            java.lang.String r1 = ""
        L_0x005f:
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r1)
            java.lang.String r5 = com.carrefour.fid.android.shared.extension.C28789y.m119125h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131746M0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131747N0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$isYieldEligible$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$isYieldEligible$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$isYieldEligible$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$isYieldEligible$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$isYieldEligible$1
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
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f101877b
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
            r0 = 0
            if (r5 == 0) goto L_0x005e
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
            if (r5 == 0) goto L_0x005e
            boolean r5 = r5.mo119182Z()
            if (r5 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r3 = r0
        L_0x005f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131747N0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$processIntent$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$processIntent$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$processIntent$1
            r0.<init>(r9, r11)
        L_0x0018:
            r7 = r0
            java.lang.Object r11 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r4) goto L_0x003e
            if (r1 == r3) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00b6
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00a0
        L_0x003e:
            java.lang.Object r10 = r7.L$1
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r10
            java.lang.Object r1 = r7.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d r1 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d) r1
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0076
        L_0x004a:
            kotlin.C11661u0.m45747n(r11)
            boolean r11 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39978a
            if (r11 == 0) goto L_0x00a3
            r11 = r10
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$a r11 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39978a) r11
            java.lang.String r11 = r11.mo131861i()
            if (r11 != 0) goto L_0x005c
            java.lang.String r11 = ""
        L_0x005c:
            int r1 = r11.length()
            if (r1 != 0) goto L_0x0064
            r1 = r4
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r1 == 0) goto L_0x007d
            r7.L$0 = r10
            r7.L$1 = r9
            r7.label = r4
            java.lang.Object r11 = r9.mo131746M0(r7)
            if (r11 != r0) goto L_0x0074
            return r0
        L_0x0074:
            r1 = r10
            r10 = r9
        L_0x0076:
            java.lang.String r11 = (java.lang.String) r11
            r2 = r11
            r8 = r1
            r1 = r10
            r10 = r8
            goto L_0x007f
        L_0x007d:
            r1 = r9
            r2 = r11
        L_0x007f:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$a r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39978a) r10
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r11 = r10.mo131862j()
            boolean r4 = r10.mo131865m()
            java.lang.String r5 = r10.mo131863k()
            boolean r6 = r10.mo131866n()
            r10 = 0
            r7.L$0 = r10
            r7.L$1 = r10
            r7.label = r3
            r3 = r11
            java.lang.Object r10 = r1.mo131740F0(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00a3:
            boolean r11 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39980c
            if (r11 == 0) goto L_0x00b9
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$c r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39980c) r10
            java.lang.String r10 = r10.mo131876d()
            r7.label = r2
            java.lang.Object r10 = r9.mo131754U0(r10, r7)
            if (r10 != r0) goto L_0x00b6
            return r0
        L_0x00b6:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00b9:
            boolean r11 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39979b
            if (r11 == 0) goto L_0x00c7
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$b r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39979b) r10
            int r10 = r10.mo131870d()
            r9.mo131741G0(r10)
            goto L_0x00e6
        L_0x00c7:
            boolean r11 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39982e
            if (r11 == 0) goto L_0x00d5
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$e r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39982e) r10
            com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r10 = r10.mo131888d()
            r9.mo131742H0(r10)
            goto L_0x00e6
        L_0x00d5:
            boolean r11 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39981d
            if (r11 == 0) goto L_0x00e6
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$d r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39977d.C39981d) r10
            int r10 = r10.mo131882d()
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r10)
            r9.mo131744K0(r10)
        L_0x00e6:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.processIntent(com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: P0 */
    public final void mo131749P0(C39964a.C39965a aVar) {
        reduceAndPublishState(C39964a.f101938a.mo131782a(), aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (r5 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131750Q0(boolean r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectFirstSlotAvailable$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectFirstSlotAvailable$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectFirstSlotAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectFirstSlotAvailable$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectFirstSlotAvailable$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            boolean r8 = r0.Z$0
            int r1 = r0.I$0
            java.lang.Object r2 = r0.L$4
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r2
            java.lang.Object r3 = r0.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.L$2
            com.carrefour.fid.android.domain.models.slot.Slot r4 = (com.carrefour.fid.android.domain.models.slot.Slot) r4
            java.lang.Object r5 = r0.L$1
            kotlin.collections.h0 r5 = (kotlin.collections.C10942h0) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007d
        L_0x0041:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0049:
            kotlin.C11661u0.m45747n(r9)
            kotlin.collections.h0 r5 = r7.mo131737C0()
            if (r5 == 0) goto L_0x009d
            int r9 = r5.mo22276a()
            java.lang.Object r2 = r5.mo22277b()
            r4 = r2
            com.carrefour.fid.android.domain.models.slot.Slot r4 = (com.carrefour.fid.android.domain.models.slot.Slot) r4
            java.lang.String r2 = r4.mo119504p()
            r0.L$0 = r7
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r2
            r0.L$4 = r7
            r0.I$0 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r0 = r7.mo131747N0(r0)
            if (r0 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r1 = r9
            r9 = r0
            r3 = r2
            r0 = r7
            r2 = r0
        L_0x007d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$d r6 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$d
            r6.<init>(r8, r3, r9)
            r2.emitEvent(r6)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r1)
            com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r9 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158333f(r4)
            java.util.List r1 = r0.mo131736B0(r1)
            r0.mo131743I0(r8, r4, r9, r1)
            if (r5 != 0) goto L_0x00a3
            goto L_0x009e
        L_0x009d:
            r0 = r7
        L_0x009e:
            r0.mo131735A0()
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
        L_0x00a3:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131750Q0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131751R0(java.lang.String r10, boolean r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectIsBookedSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectIsBookedSlot$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectIsBookedSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectIsBookedSlot$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$selectIsBookedSlot$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0112
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            boolean r11 = r0.Z$1
            boolean r10 = r0.Z$0
            java.lang.Object r2 = r0.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r4 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r4
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.a r6 = (com.carrefour.fid.android.domain.models.slot.C38180a) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r7 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r7
            kotlin.C11661u0.m45747n(r12)
            goto L_0x008b
        L_0x004e:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.shared.base.u$d r12 = r9.getCurrentState()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c r12 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39975c) r12
            java.util.Map r12 = r12.mo131847r()
            if (r12 == 0) goto L_0x0063
            com.carrefour.fid.android.domain.models.slot.a r10 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158346s(r12, r10)
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r6 = r5
        L_0x0064:
            if (r6 == 0) goto L_0x0072
            com.carrefour.fid.android.domain.models.slot.Slot r10 = r6.mo119554f()
            if (r10 == 0) goto L_0x0072
            java.lang.String r10 = r10.mo119504p()
            r2 = r10
            goto L_0x0073
        L_0x0072:
            r2 = r5
        L_0x0073:
            r0.L$0 = r9
            r0.L$1 = r6
            r0.L$2 = r9
            r0.L$3 = r2
            r0.Z$0 = r11
            r0.Z$1 = r11
            r0.label = r4
            java.lang.Object r12 = r9.mo131747N0(r0)
            if (r12 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r4 = r9
            r7 = r4
            r10 = r11
        L_0x008b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$d r8 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$d
            r8.<init>(r11, r2, r12)
            r4.emitEvent(r8)
            if (r6 == 0) goto L_0x0101
            com.carrefour.fid.android.shared.base.u$d r10 = r7.getCurrentState()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39975c) r10
            java.util.Map r10 = r10.mo131847r()
            if (r10 == 0) goto L_0x00be
            java.util.Set r10 = r10.keySet()
            if (r10 == 0) goto L_0x00be
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String r11 = r6.mo119552e()
            java.lang.Integer r10 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158331d(r10, r11)
            if (r10 == 0) goto L_0x00be
            int r10 = r10.intValue()
            goto L_0x00bf
        L_0x00be:
            r10 = 0
        L_0x00bf:
            com.carrefour.fid.android.domain.models.slot.Slot r11 = r6.mo119554f()
            com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r11 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158333f(r11)
            com.carrefour.fid.android.domain.models.slot.Slot r12 = r6.mo119554f()
            boolean r12 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158339l(r12)
            if (r12 != 0) goto L_0x00ef
            com.carrefour.fid.android.domain.models.slot.Slot r12 = r6.mo119554f()
            boolean r12 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158338k(r12)
            if (r12 == 0) goto L_0x00dc
            goto L_0x00ef
        L_0x00dc:
            kotlin.collections.h0 r12 = r7.mo131737C0()
            if (r12 == 0) goto L_0x00ea
            java.lang.Object r12 = r12.mo22281f()
            com.carrefour.fid.android.domain.models.slot.Slot r12 = (com.carrefour.fid.android.domain.models.slot.Slot) r12
            if (r12 != 0) goto L_0x00f3
        L_0x00ea:
            com.carrefour.fid.android.domain.models.slot.Slot r12 = r6.mo119554f()
            goto L_0x00f3
        L_0x00ef:
            com.carrefour.fid.android.domain.models.slot.Slot r12 = r6.mo119554f()
        L_0x00f3:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r10)
            java.util.List r10 = r7.mo131736B0(r10)
            r7.mo131743I0(r0, r12, r11, r10)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0101:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r10 = r7.mo131750Q0(r10, r0)
            if (r10 != r1) goto L_0x0112
            return r1
        L_0x0112:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131751R0(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: S0 */
    public final SlotPartOfDay mo131752S0(List<? extends SlotPartOfDay> list, SlotPartOfDay slotPartOfDay) {
        if (list.contains(slotPartOfDay)) {
            SlotPartOfDay[] values = SlotPartOfDay.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (SlotPartOfDay slotPartOfDay2 : values) {
                if (!list.contains(slotPartOfDay2)) {
                    return slotPartOfDay2;
                }
                arrayList.add(C11079d2.f28267a);
            }
        }
        return slotPartOfDay;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131753T0(com.carrefour.fid.android.domain.models.basket.Basket r9, boolean r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$sendSlotSelectionAnalytics$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$sendSlotSelectionAnalytics$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$sendSlotSelectionAnalytics$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$sendSlotSelectionAnalytics$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$sendSlotSelectionAnalytics$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0058
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$2
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r10
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r0
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00a5
        L_0x003c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0044:
            boolean r10 = r0.Z$0
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x006d
        L_0x0058:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.domain.interactors.service.k r11 = r8.f101877b
            r0.L$0 = r8
            r0.L$1 = r9
            r0.Z$0 = r10
            r0.label = r4
            java.lang.Object r11 = r11.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r2 = r8
        L_0x006d:
            boolean r4 = kotlin.Result.m38709i(r11)
            if (r4 == 0) goto L_0x0074
            r11 = r5
        L_0x0074:
            com.carrefour.fid.android.domain.models.service.models.k r11 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r11
            if (r11 == 0) goto L_0x007d
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = r11.mo119354f()
            goto L_0x007e
        L_0x007d:
            r11 = r5
        L_0x007e:
            com.carrefour.fid.android.checkout.presentation.analytics.a r4 = r2.f101891p
            com.carrefour.fid.android.domain.models.basket.BasketType r6 = r9.mo116829N()
            if (r11 == 0) goto L_0x008b
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r7 = r11.mo119176T()
            goto L_0x008c
        L_0x008b:
            r7 = r5
        L_0x008c:
            r4.mo131445g(r6, r7, r10)
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r0 = r2.mo131747N0(r0)
            if (r0 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r1 = r9
            r9 = r10
            r10 = r11
            r11 = r0
            r0 = r2
        L_0x00a5:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00bd
            com.carrefour.fid.android.checkout.presentation.analytics.a r11 = r0.f101891p
            com.carrefour.fid.android.domain.models.basket.BasketType r0 = r1.mo116829N()
            if (r10 == 0) goto L_0x00b9
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r5 = r10.mo119176T()
        L_0x00b9:
            r11.mo131447i(r0, r5, r9)
            goto L_0x00cc
        L_0x00bd:
            com.carrefour.fid.android.checkout.presentation.analytics.a r11 = r0.f101891p
            com.carrefour.fid.android.domain.models.basket.BasketType r0 = r1.mo116829N()
            if (r10 == 0) goto L_0x00c9
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r5 = r10.mo119176T()
        L_0x00c9:
            r11.mo131446h(r0, r5, r9)
        L_0x00cc:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131753T0(com.carrefour.fid.android.domain.models.basket.Basket, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131754U0(java.lang.String r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$updateOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$updateOrder$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$updateOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$updateOrder$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$updateOrder$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.L$2
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00a3
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
        L_0x0050:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0083
        L_0x0054:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.shared.base.u$d r10 = r8.getCurrentState()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c r10 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39975c) r10
            com.carrefour.fid.android.domain.models.slot.Slot r10 = r10.mo131845p()
            if (r10 == 0) goto L_0x00d0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$b r2 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39965a.C39967b.f101940b
            r8.mo131749P0(r2)
            com.carrefour.fid.android.domain.interactors.order.n r2 = r8.f101882g
            com.carrefour.fid.android.domain.interactors.order.n$a r5 = new com.carrefour.fid.android.domain.interactors.order.n$a
            java.lang.String r10 = r10.mo119508t()
            r6 = 0
            r5.<init>(r9, r10, r6)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.m172966invokegIAlus(r5, r0)
            if (r10 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r2 = r8
            goto L_0x0050
        L_0x0083:
            boolean r4 = kotlin.Result.m38710j(r9)
            if (r4 == 0) goto L_0x00bf
            r4 = r9
            kotlin.d2 r4 = (kotlin.C11079d2) r4
            com.carrefour.fid.android.checkout.presentation.analytics.a r4 = r2.f101891p
            r4.mo131450l()
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r2.mo131747N0(r0)
            if (r0 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r1 = r10
            r10 = r0
            r0 = r2
        L_0x00a3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00b1
            com.carrefour.fid.android.checkout.presentation.analytics.a r10 = r0.f101891p
            r10.mo131452n()
            goto L_0x00b6
        L_0x00b1:
            com.carrefour.fid.android.checkout.presentation.analytics.a r10 = r0.f101891p
            r10.mo131451m()
        L_0x00b6:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$c r10 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$c
            r10.<init>(r1)
            r0.emitEvent(r10)
            r2 = r0
        L_0x00bf:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            if (r9 == 0) goto L_0x00cd
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r10 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            r10.<init>(r9)
            r2.emitEvent(r10)
        L_0x00cd:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x00d0:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = "Not selected slot!"
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131754U0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131755V0(com.carrefour.fid.android.domain.models.slot.Slot r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateFullSlotAndCheckBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateFullSlotAndCheckBasket$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateFullSlotAndCheckBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateFullSlotAndCheckBasket$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateFullSlotAndCheckBasket$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r7 = r0.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r1 = (com.carrefour.fid.android.domain.models.slot.Slot) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00ba
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r7 = (com.carrefour.fid.android.domain.models.slot.Slot) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0066
        L_0x0053:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.basket.l0 r8 = r6.f101880e
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r2 = r6
        L_0x0066:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)
            if (r4 != 0) goto L_0x00d1
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            com.carrefour.fid.android.domain.models.basket.BasketSlot r4 = r8.mo116826K()
            com.carrefour.fid.android.domain.models.slot.Slot r4 = com.carrefour.fid.android.domain.models.basket.extension.C37973b.m156174a(r4)
            com.carrefour.fid.android.domain.models.basket.BasketSlot r5 = r8.mo116826K()
            boolean r5 = r5.mo117001l()
            if (r5 == 0) goto L_0x00c3
            java.lang.String r4 = r4.mo119508t()
            java.lang.String r5 = r7.mo119508t()
            boolean r4 = com.carrefour.fid.android.domain.models.slot.SlotId.m158312f(r4, r5)
            if (r4 == 0) goto L_0x00c3
            boolean r4 = r2.mo131745L0(r8)
            if (r4 == 0) goto L_0x00a2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r7 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$MissingProductError r8 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$MissingProductError
            r8.<init>()
            r7.<init>(r8)
            r2.emitEvent(r7)
            goto L_0x00df
        L_0x00a2:
            com.carrefour.fid.android.checkout.presentation.ui.slot.d r4 = r2.f101893r
            boolean r4 = r4.mo131623s()
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r0 = r2.mo131753T0(r8, r4, r0)
            if (r0 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r1 = r7
            r7 = r8
            r0 = r2
        L_0x00ba:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a r8 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a
            r8.<init>(r1, r7)
            r0.emitEvent(r8)
            goto L_0x00df
        L_0x00c3:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r8 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$SlotUnavailableError r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$SlotUnavailableError
            r0.<init>(r7)
            r8.<init>(r0)
            r2.emitEvent(r8)
            goto L_0x00df
        L_0x00d1:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r7 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.shared.io.BasketSlotBookThrowable r8 = new com.carrefour.fid.android.shared.io.BasketSlotBookThrowable
            r0 = 0
            r8.<init>(r0)
            r7.<init>(r8)
            r2.emitEvent(r7)
        L_0x00df:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.mo131755V0(com.carrefour.fid.android.domain.models.slot.Slot, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: W0 */
    public final C11723c2 mo131756W0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceSlotViewModel$validateSlot$1(this, (C11045c<? super ServiceSlotViewModel$validateSlot$1>) null), 3, (Object) null);
    }

    /* renamed from: z0 */
    public final boolean mo131757z0(Map<String, ? extends List<Slot>> map) {
        boolean z;
        if (map.isEmpty()) {
            return false;
        }
        Iterable<Slot> a0 = C10978t.m41497a0(map.values());
        if ((a0 instanceof Collection) && ((Collection) a0).isEmpty()) {
            return false;
        }
        for (Slot slot : a0) {
            if (!Intrinsics.areEqual((Object) slot.mo119514x(), (Object) Boolean.TRUE) || (!Intrinsics.areEqual((Object) slot.mo119510u(), (Object) C36187r.f89350a) && !Intrinsics.areEqual((Object) slot.mo119510u(), (Object) C36187r.f89351b))) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
