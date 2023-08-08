package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39931i;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.core.constants.C36187r;
import com.carrefour.fid.android.domain.interactors.basket.C37564e;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.order.C37738n;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.interactors.slot.C37861g;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import com.carrefour.fid.android.domain.models.slot.extension.SlotKt;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
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
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001uBq\b\u0007\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010n\u001a\u00020i¢\u0006\u0004\bs\u0010tJ7\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0002J#\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0002J\u001b\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\nH\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001e\u0010!\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010 \u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0019\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b&\u0010'JA\u0010)\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000eH\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0010\u00102\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0002J\u001b\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000e\u00108\u001a\u0002072\u0006\u00106\u001a\u00020\u0004R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0017\u0010n\u001a\u00020i8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0004¢\u0006\u0006\n\u0004\bp\u0010q\u0002\u0004\n\u0002\b\u0019¨\u0006v"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotOmrViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$c;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$d;", "", "facilityStoreId", "", "isFromHomePage", "slotId", "isSlotBooked", "Lkotlin/d2;", "z0", "(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "", "", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "slotMap", "u0", "isProductThresholdExceeded", "J0", "(Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/collections/h0;", "x0", "I0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "v0", "", "slotDateIndex", "", "Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;", "w0", "disabledPartOfDayList", "currentSlotPartOfDay", "K0", "A0", "slotDay", "B0", "slotIndex", "E0", "(Ljava/lang/Integer;)V", "selectedSlot", "C0", "(Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/slot/Slot;Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;Ljava/util/List;)V", "orderId", "L0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "F0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$a;", "partialState", "H0", "intent", "G0", "(Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "facilityServiceId", "Lkotlinx/coroutines/c2;", "M0", "Lcom/carrefour/fid/android/domain/interactors/slot/g;", "a", "Lcom/carrefour/fid/android/domain/interactors/slot/g;", "getSlotsUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "b", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectedUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "d", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "fetchDeliveryStoresUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "e", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "getPromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/category/b;", "f", "Lcom/carrefour/fid/android/domain/interactors/category/b;", "getDrivePromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "g", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "getMirrorDriveServiceUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "h", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "setServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "i", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "updateStoreServiceUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/e;", "j", "Lcom/carrefour/fid/android/domain/interactors/basket/e;", "bookSlotForCurrentBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/n;", "k", "Lcom/carrefour/fid/android/domain/interactors/order/n;", "updateOrderOnlineUseCase", "Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "l", "Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "analytics", "Landroidx/lifecycle/p0;", "m", "Landroidx/lifecycle/p0;", "y0", "()Landroidx/lifecycle/p0;", "savedStateHandle", "Lcom/carrefour/fid/android/checkout/presentation/ui/slot/i;", "n", "Lcom/carrefour/fid/android/checkout/presentation/ui/slot/i;", "args", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/slot/g;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/basket/f0;Lcom/carrefour/fid/android/domain/interactors/service/b;Lcom/carrefour/fid/android/domain/interactors/service/g;Lcom/carrefour/fid/android/domain/interactors/category/b;Lcom/carrefour/fid/android/domain/interactors/service/f;Lcom/carrefour/fid/android/domain/interactors/service/s;Lcom/carrefour/fid/android/domain/interactors/service/v;Lcom/carrefour/fid/android/domain/interactors/basket/e;Lcom/carrefour/fid/android/domain/interactors/order/n;Lcom/carrefour/fid/android/checkout/presentation/analytics/a;Landroidx/lifecycle/p0;)V", "BookSlotError", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceSlotOmrViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotOmrViewModel.kt\ncom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotOmrViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,378:1\n1477#2:379\n1502#2,3:380\n1505#2,3:390\n1747#2,3:393\n288#2,2:397\n361#3,7:383\n1#4:396\n11335#5:399\n11670#5,3:400\n11335#5:403\n11670#5,3:404\n*S KotlinDebug\n*F\n+ 1 ServiceSlotOmrViewModel.kt\ncom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotOmrViewModel\n*L\n96#1:379\n96#1:380,3\n96#1:390,3\n134#1:393,3\n169#1:397,2\n96#1:383,7\n203#1:399\n203#1:400,3\n217#1:403\n217#1:404,3\n*E\n"})
public final class ServiceSlotOmrViewModel extends BaseMVIViewModel<C39964a.C39975c, C39964a.C39977d> {
    @C12579k

    /* renamed from: a */
    public final C37861g f101859a;
    @C12579k

    /* renamed from: b */
    public final C37823k f101860b;
    @C12579k

    /* renamed from: c */
    public final C37569f0 f101861c;
    @C12579k

    /* renamed from: d */
    public final C37812b f101862d;
    @C12579k

    /* renamed from: e */
    public final C37818g f101863e;
    @C12579k

    /* renamed from: f */
    public final C37620b f101864f;
    @C12579k

    /* renamed from: g */
    public final C37817f f101865g;
    @C12579k

    /* renamed from: h */
    public final C37836s f101866h;
    @C12579k

    /* renamed from: i */
    public final C37841v f101867i;
    @C12579k

    /* renamed from: j */
    public final C37564e f101868j;
    @C12579k

    /* renamed from: k */
    public final C37738n f101869k;
    @C12579k

    /* renamed from: l */
    public final C39866a f101870l;
    @C12579k

    /* renamed from: m */
    public final C19456p0 f101871m;
    @C12579k

    /* renamed from: n */
    public final C39931i f101872n;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotOmrViewModel$BookSlotError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class BookSlotError extends Exception {

        /* renamed from: a */
        public static final int f101873a = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ServiceSlotOmrViewModel(@C12579k C37861g gVar, @C12579k C37823k kVar, @C12579k C37569f0 f0Var, @C12579k C37812b bVar, @C12579k C37818g gVar2, @C12579k C37620b bVar2, @C12579k C37817f fVar, @C12579k C37836s sVar, @C12579k C37841v vVar, @C12579k C37564e eVar, @C12579k C37738n nVar, @C12579k C39866a aVar, @C12579k C19456p0 p0Var) {
        super(C39964a.C39975c.f101961i.mo131851a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        C37861g gVar3 = gVar;
        C37823k kVar2 = kVar;
        C37569f0 f0Var2 = f0Var;
        C37812b bVar3 = bVar;
        C37818g gVar4 = gVar2;
        C37620b bVar4 = bVar2;
        C37817f fVar2 = fVar;
        C37836s sVar2 = sVar;
        C37841v vVar2 = vVar;
        Intrinsics.checkNotNullParameter(gVar3, "getSlotsUseCase");
        Intrinsics.checkNotNullParameter(kVar2, "getServiceSelectedUseCase");
        Intrinsics.checkNotNullParameter(f0Var2, "retrieveBasketUseCase");
        Intrinsics.checkNotNullParameter(bVar3, "fetchDeliveryStoresUseCase");
        Intrinsics.checkNotNullParameter(gVar4, "getPromiseUseCase");
        Intrinsics.checkNotNullParameter(bVar4, "getDrivePromiseUseCase");
        Intrinsics.checkNotNullParameter(fVar2, "getMirrorDriveServiceUseCase");
        Intrinsics.checkNotNullParameter(sVar2, "setServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(vVar2, "updateStoreServiceUseCase");
        Intrinsics.checkNotNullParameter(eVar, "bookSlotForCurrentBasketUseCase");
        Intrinsics.checkNotNullParameter(nVar, "updateOrderOnlineUseCase");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f101859a = gVar3;
        this.f101860b = kVar2;
        this.f101861c = f0Var2;
        this.f101862d = bVar3;
        this.f101863e = gVar4;
        this.f101864f = bVar4;
        this.f101865g = fVar2;
        this.f101866h = sVar2;
        this.f101867i = vVar2;
        this.f101868j = eVar;
        this.f101869k = nVar;
        this.f101870l = aVar;
        C19456p0 p0Var2 = p0Var;
        this.f101871m = p0Var2;
        this.f101872n = C39931i.f101826h.mo131671b(p0Var2);
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m162762D0(ServiceSlotOmrViewModel serviceSlotOmrViewModel, Integer num, Slot slot, SlotPartOfDay slotPartOfDay, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            slot = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        serviceSlotOmrViewModel.mo131716C0(num, slot, slotPartOfDay, list);
    }

    /* renamed from: h0 */
    public static final /* synthetic */ C39964a.C39975c m162767h0(ServiceSlotOmrViewModel serviceSlotOmrViewModel) {
        return (C39964a.C39975c) serviceSlotOmrViewModel.getCurrentState();
    }

    /* renamed from: A0 */
    public final void mo131714A0(int i) {
        List<SlotPartOfDay> w0 = mo131728w0(i);
        List Q5 = CollectionsKt___CollectionsKt.m40557Q5(w0);
        SlotPartOfDay s = ((C39964a.C39975c) getCurrentState()).mo131848s();
        if (s == null) {
            s = SlotPartOfDay.MORNING;
        }
        SlotPartOfDay K0 = mo131723K0(Q5, s);
        m162762D0(this, Integer.valueOf(i), (Slot) null, K0, w0, 2, (Object) null);
    }

    /* renamed from: B0 */
    public final void mo131715B0(SlotPartOfDay slotPartOfDay) {
        m162762D0(this, ((C39964a.C39975c) getCurrentState()).mo131846q(), (Slot) null, slotPartOfDay, (List) null, 10, (Object) null);
    }

    /* renamed from: C0 */
    public final void mo131716C0(Integer num, Slot slot, SlotPartOfDay slotPartOfDay, List<? extends SlotPartOfDay> list) {
        List<Slot> list2;
        Collection<List<Slot>> values;
        Map<String, List<Slot>> r = ((C39964a.C39975c) getCurrentState()).mo131847r();
        if (r == null || (values = r.values()) == null || (list2 = SlotKt.m158347t(values, num, slotPartOfDay)) == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        mo131720H0(new C39964a.C39965a.C39969d(list2, slot, num, slotPartOfDay, list));
    }

    /* renamed from: E0 */
    public final void mo131717E0(Integer num) {
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
        m162762D0(this, valueOf, slot2, s, (List) null, 8, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131718F0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$isYieldEligible$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$isYieldEligible$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$isYieldEligible$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$isYieldEligible$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$isYieldEligible$1
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
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f101860b
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.mo131718F0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: G0 */
    public Object processIntent(@C12579k C39964a.C39977d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (dVar instanceof C39964a.C39977d.C39978a) {
            C39964a.C39977d.C39978a aVar = (C39964a.C39977d.C39978a) dVar;
            Object z0 = mo131731z0(aVar.mo131861i(), aVar.mo131865m(), aVar.mo131863k(), aVar.mo131866n(), cVar);
            if (z0 == C11063b.m42612h()) {
                return z0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C39964a.C39977d.C39980c) {
            Object L0 = mo131724L0(((C39964a.C39977d.C39980c) dVar).mo131876d(), cVar);
            if (L0 == C11063b.m42612h()) {
                return L0;
            }
            return C11079d2.f28267a;
        } else {
            if (dVar instanceof C39964a.C39977d.C39979b) {
                mo131714A0(((C39964a.C39977d.C39979b) dVar).mo131870d());
            } else if (dVar instanceof C39964a.C39977d.C39982e) {
                mo131715B0(((C39964a.C39977d.C39982e) dVar).mo131888d());
            } else if (dVar instanceof C39964a.C39977d.C39981d) {
                mo131717E0(C11064a.m42620f(((C39964a.C39977d.C39981d) dVar).mo131882d()));
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: H0 */
    public final void mo131720H0(C39964a.C39965a aVar) {
        reduceAndPublishState(C39964a.f101938a.mo131782a(), aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (r5 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131721I0(boolean r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectFirstSlotAvailable$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectFirstSlotAvailable$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectFirstSlotAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectFirstSlotAvailable$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectFirstSlotAvailable$1
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
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r2
            java.lang.Object r3 = r0.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.L$2
            com.carrefour.fid.android.domain.models.slot.Slot r4 = (com.carrefour.fid.android.domain.models.slot.Slot) r4
            java.lang.Object r5 = r0.L$1
            kotlin.collections.h0 r5 = (kotlin.collections.C10942h0) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007d
        L_0x0041:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0049:
            kotlin.C11661u0.m45747n(r9)
            kotlin.collections.h0 r5 = r7.mo131729x0()
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
            java.lang.Object r0 = r7.mo131718F0(r0)
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
            java.util.List r1 = r0.mo131728w0(r1)
            r0.mo131716C0(r8, r4, r9, r1)
            if (r5 != 0) goto L_0x00a3
            goto L_0x009e
        L_0x009d:
            r0 = r7
        L_0x009e:
            r0.mo131727v0()
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
        L_0x00a3:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.mo131721I0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131722J0(java.lang.String r10, boolean r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectIsBookedSlot$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectIsBookedSlot$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectIsBookedSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectIsBookedSlot$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$selectIsBookedSlot$1
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
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r4 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r4
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.models.slot.a r6 = (com.carrefour.fid.android.domain.models.slot.C38180a) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r7 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r7
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
            java.lang.Object r12 = r9.mo131718F0(r0)
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
            kotlin.collections.h0 r12 = r7.mo131729x0()
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
            java.util.List r10 = r7.mo131728w0(r10)
            r7.mo131716C0(r0, r12, r11, r10)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0101:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r10 = r7.mo131721I0(r10, r0)
            if (r10 != r1) goto L_0x0112
            return r1
        L_0x0112:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.mo131722J0(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: K0 */
    public final SlotPartOfDay mo131723K0(List<? extends SlotPartOfDay> list, SlotPartOfDay slotPartOfDay) {
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

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131724L0(java.lang.String r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$updateOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$updateOrder$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$updateOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$updateOrder$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$updateOrder$1
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
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r0
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
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r2
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
            r8.mo131720H0(r2)
            com.carrefour.fid.android.domain.interactors.order.n r2 = r8.f101869k
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
            com.carrefour.fid.android.checkout.presentation.analytics.a r4 = r2.f101870l
            r4.mo131450l()
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r2.mo131718F0(r0)
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
            com.carrefour.fid.android.checkout.presentation.analytics.a r10 = r0.f101870l
            r10.mo131452n()
            goto L_0x00b6
        L_0x00b1:
            com.carrefour.fid.android.checkout.presentation.analytics.a r10 = r0.f101870l
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.mo131724L0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: M0 */
    public final C11723c2 mo131725M0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceSlotOmrViewModel$validateSlot$1(this, str, (C11045c<? super ServiceSlotOmrViewModel$validateSlot$1>) null), 3, (Object) null);
    }

    /* renamed from: u0 */
    public final boolean mo131726u0(Map<String, ? extends List<Slot>> map) {
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

    /* renamed from: v0 */
    public final void mo131727v0() {
        m162762D0(this, 0, (Slot) null, SlotPartOfDay.MORNING, mo131728w0(0), 2, (Object) null);
    }

    /* renamed from: w0 */
    public final List<SlotPartOfDay> mo131728w0(int i) {
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
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.collections.C10942h0<com.carrefour.fid.android.domain.models.slot.Slot> mo131729x0() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.mo131729x0():kotlin.collections.h0");
    }

    @C12579k
    /* renamed from: y0 */
    public final C19456p0 mo131730y0() {
        return this.f101871m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131731z0(java.lang.String r21, boolean r22, java.lang.String r23, boolean r24, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$1 r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$1 r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 0
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L_0x00a8
            if (r4 == r10) goto L_0x008d
            if (r4 == r9) goto L_0x006d
            if (r4 == r7) goto L_0x004a
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r3 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0202
        L_0x004a:
            boolean r4 = r2.Z$0
            java.lang.Object r7 = r2.L$5
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r9 = r2.L$4
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r9
            java.lang.Object r12 = r2.L$3
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r12 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r12
            java.lang.Object r13 = r2.L$2
            java.lang.Object r14 = r2.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r15 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r15
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x01ad
        L_0x006d:
            boolean r4 = r2.Z$0
            java.lang.Object r9 = r2.L$4
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r12 = r2.L$3
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r12 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r12
            java.lang.Object r13 = r2.L$2
            java.lang.Object r14 = r2.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r15 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r15
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r7 = r9
            goto L_0x0181
        L_0x008d:
            boolean r4 = r2.Z$1
            boolean r12 = r2.Z$0
            java.lang.Object r13 = r2.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r14 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r14
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r19 = r14
            r14 = r4
            r4 = r19
            goto L_0x00db
        L_0x00a8:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$b r1 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39965a.C39967b.f101940b
            r0.mo131720H0(r1)
            com.carrefour.fid.android.domain.interactors.slot.g r1 = r0.f101859a
            com.carrefour.fid.android.domain.interactors.slot.g$a r4 = new com.carrefour.fid.android.domain.interactors.slot.g$a
            if (r21 != 0) goto L_0x00b9
            java.lang.String r12 = ""
            goto L_0x00bb
        L_0x00b9:
            r12 = r21
        L_0x00bb:
            r4.<init>(r12)
            r2.L$0 = r0
            r12 = r23
            r2.L$1 = r12
            r13 = r22
            r2.Z$0 = r13
            r14 = r24
            r2.Z$1 = r14
            r2.label = r10
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x00d5
            return r3
        L_0x00d5:
            r4 = r0
            r19 = r13
            r13 = r12
            r12 = r19
        L_0x00db:
            boolean r15 = kotlin.Result.m38710j(r1)
            if (r15 == 0) goto L_0x0220
            r15 = r1
            com.carrefour.fid.android.domain.models.slot.ServiceSlot r15 = (com.carrefour.fid.android.domain.models.slot.ServiceSlot) r15
            java.util.List r16 = r15.mo119478e()
            r5 = r16
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.jvm.functions.l[] r6 = new kotlin.jvm.functions.C11300l[r9]
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$2$slotMap$1 r17 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$2$slotMap$1.f101874f
            r6[r8] = r17
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$2$slotMap$2 r17 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$getSlotDetails$2$slotMap$2.f101875f
            r6[r10] = r17
            java.util.Comparator r6 = kotlin.comparisons.C11006g.m42420h(r6)
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r5, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0109:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x013c
            java.lang.Object r10 = r5.next()
            r18 = r10
            com.carrefour.fid.android.domain.models.slot.Slot r18 = (com.carrefour.fid.android.domain.models.slot.Slot) r18
            java.lang.String r11 = r18.mo119504p()
            r7 = 10
            java.lang.String r7 = r11.substring(r8, r7)
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            java.lang.Object r11 = r6.get(r7)
            if (r11 != 0) goto L_0x0134
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r6.put(r7, r11)
        L_0x0134:
            java.util.List r11 = (java.util.List) r11
            r11.add(r10)
            r7 = 3
            r10 = 1
            goto L_0x0109
        L_0x013c:
            boolean r5 = r4.mo131726u0(r6)
            if (r5 != 0) goto L_0x0151
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.shared.io.EmptyListThrowable r3 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r3.<init>()
            r2.<init>(r3)
            r4.emitEvent(r2)
            goto L_0x0220
        L_0x0151:
            if (r12 == 0) goto L_0x0163
            com.carrefour.fid.android.checkout.presentation.analytics.a r5 = r4.f101870l
            java.util.Collection r7 = r6.values()
            r5.mo131444f(r7)
            r12 = r15
            r15 = r4
            r4 = r14
            r14 = r13
            r13 = r1
            goto L_0x01d0
        L_0x0163:
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f101860b
            r2.L$0 = r4
            r2.L$1 = r13
            r2.L$2 = r1
            r2.L$3 = r15
            r2.L$4 = r6
            r2.Z$0 = r14
            r2.label = r9
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r2)
            if (r5 != r3) goto L_0x017a
            return r3
        L_0x017a:
            r7 = r6
            r12 = r15
            r15 = r4
            r4 = r14
            r14 = r13
            r13 = r1
            r1 = r5
        L_0x0181:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x0188
            r1 = 0
        L_0x0188:
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            if (r1 == 0) goto L_0x0192
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1.mo119354f()
            r9 = r1
            goto L_0x0193
        L_0x0192:
            r9 = 0
        L_0x0193:
            com.carrefour.fid.android.domain.interactors.basket.f0 r1 = r15.f101861c
            r2.L$0 = r15
            r2.L$1 = r14
            r2.L$2 = r13
            r2.L$3 = r12
            r2.L$4 = r9
            r2.L$5 = r7
            r2.Z$0 = r4
            r5 = 3
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x01ad
            return r3
        L_0x01ad:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x01b4
            r1 = 0
        L_0x01b4:
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            com.carrefour.fid.android.checkout.presentation.analytics.a r5 = r15.f101870l
            if (r1 == 0) goto L_0x01bf
            com.carrefour.fid.android.domain.models.basket.BasketType r1 = r1.mo116829N()
            goto L_0x01c0
        L_0x01bf:
            r1 = 0
        L_0x01c0:
            if (r9 == 0) goto L_0x01c7
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r6 = r9.mo119176T()
            goto L_0x01c8
        L_0x01c7:
            r6 = 0
        L_0x01c8:
            java.util.Collection r9 = r7.values()
            r5.mo131441c(r1, r6, r9)
            r6 = r7
        L_0x01d0:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$c r1 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$c
            r1.<init>(r6)
            r15.mo131720H0(r1)
            if (r4 == 0) goto L_0x0205
            if (r14 == 0) goto L_0x01e2
            int r1 = r14.length()
            if (r1 != 0) goto L_0x01e3
        L_0x01e2:
            r8 = 1
        L_0x01e3:
            if (r8 != 0) goto L_0x0205
            boolean r1 = r12.mo119480f()
            r2.L$0 = r15
            r2.L$1 = r13
            r4 = 0
            r2.L$2 = r4
            r2.L$3 = r4
            r2.L$4 = r4
            r2.L$5 = r4
            r4 = 4
            r2.label = r4
            java.lang.Object r1 = r15.mo131722J0(r14, r1, r2)
            if (r1 != r3) goto L_0x0200
            return r3
        L_0x0200:
            r3 = r13
            r2 = r15
        L_0x0202:
            r4 = r2
            r1 = r3
            goto L_0x0220
        L_0x0205:
            boolean r1 = r12.mo119480f()
            r2.L$0 = r15
            r2.L$1 = r13
            r4 = 0
            r2.L$2 = r4
            r2.L$3 = r4
            r2.L$4 = r4
            r2.L$5 = r4
            r4 = 5
            r2.label = r4
            java.lang.Object r1 = r15.mo131721I0(r1, r2)
            if (r1 != r3) goto L_0x0200
            return r3
        L_0x0220:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x022e
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            r2.<init>(r1)
            r4.emitEvent(r2)
        L_0x022e:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.mo131731z0(java.lang.String, boolean, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
