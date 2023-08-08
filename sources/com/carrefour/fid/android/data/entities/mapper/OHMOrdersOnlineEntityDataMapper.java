package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.data.entities.OHMOrdersOnlineDataEntity;
import com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity;
import com.carrefour.fid.android.data.entities.OHMPaymentInfo;
import com.carrefour.fid.android.data.entities.OHMSlotInfoEntity;
import com.carrefour.fid.android.data.entities.OHMStore;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain;
import com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.C12154u0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOHMOrdersOnlineEntityDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OHMOrdersOnlineEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OHMOrdersOnlineEntityDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1747#2,3:87\n*S KotlinDebug\n*F\n+ 1 OHMOrdersOnlineEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OHMOrdersOnlineEntityDataMapper\n*L\n83#1:87,3\n*E\n"})
public final class OHMOrdersOnlineEntityDataMapper {

    /* renamed from: e */
    public static final int f90127e = 8;
    @C12579k

    /* renamed from: a */
    public final C37807b f90128a;
    @C12579k

    /* renamed from: b */
    public final CoroutineDispatcher f90129b;
    @C12579k

    /* renamed from: c */
    public final C12154u0<Boolean> f90130c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f90131d;

    @C11067d(mo22501c = "com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper$1", mo22502f = "OHMOrdersOnlineEntityDataMapper.kt", mo22503i = {}, mo22504l = {35}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper$1 */
    public static final class C364561 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Boolean>, Object> {
        int label;
        final /* synthetic */ OHMOrdersOnlineEntityDataMapper this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C364561(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object obj2;
            boolean z;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C37807b c = this.this$0.f90128a;
                C37807b.C37808a aVar = new C37807b.C37808a(RemoteConfigTag.AdditionalOrder);
                this.label = 1;
                obj2 = c.m172966invokegIAlus(aVar, this);
                if (obj2 == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
                obj2 = ((Result) obj).mo21858l();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (Result.m38705e(obj2) == null) {
                z = ((Boolean) obj2).booleanValue();
            } else {
                z = false;
            }
            return C11064a.m42615a(z);
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Boolean> cVar) {
            return ((C364561) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    @Inject
    public OHMOrdersOnlineEntityDataMapper(@C12579k C37807b bVar, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f90128a = bVar;
        this.f90129b = coroutineDispatcher;
        C12074o0 a = C12079p0.m48260a(C11968h2.m47683c((C11723c2) null, 1, (Object) null).mo7443Q(coroutineDispatcher));
        this.f90131d = a;
        this.f90130c = C12038j.m48057b(a, (CoroutineContext) null, (CoroutineStart) null, new C364561(this, (C11045c<? super C364561>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public final OrdersOnlineDomain mo111178d(OHMOrdersOnlineDataEntity oHMOrdersOnlineDataEntity, boolean z) {
        boolean z2;
        Long l;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z3;
        boolean z4;
        Boolean additionalOrderEligible;
        boolean z5 = false;
        if (!z || (additionalOrderEligible = oHMOrdersOnlineDataEntity.getAdditionalOrderEligible()) == null) {
            z2 = false;
        } else {
            z2 = additionalOrderEligible.booleanValue();
        }
        String str10 = null;
        if (z) {
            l = oHMOrdersOnlineDataEntity.getAdditionalOrderId();
        } else {
            l = null;
        }
        String orderId = oHMOrdersOnlineDataEntity.getOrderId();
        double a = C36449f.m149518a(oHMOrdersOnlineDataEntity.getOrderAmount());
        Double b = C36449f.m149519b(oHMOrdersOnlineDataEntity.getOrderPreparedAmount());
        Long unscaledAmount = oHMOrdersOnlineDataEntity.getOrderAmount().getUnscaledAmount();
        if (unscaledAmount != null) {
            i = (int) unscaledAmount.longValue();
        } else {
            i = 0;
        }
        int scale = oHMOrdersOnlineDataEntity.getOrderAmount().getScale();
        String orderCreationDateTime = oHMOrdersOnlineDataEntity.getOrderCreationDateTime();
        OrderStatus a2 = OrderStatus.f89242c.mo108074a(oHMOrdersOnlineDataEntity.getOrderStatus());
        OrderType a3 = OrderType.f70276c.mo83640a(oHMOrdersOnlineDataEntity.getOrderType(), oHMOrdersOnlineDataEntity.getExpressPickup());
        String str11 = C36178i.f89318m + oHMOrdersOnlineDataEntity.getOrderId();
        OHMSlotInfoEntity slotInfo = oHMOrdersOnlineDataEntity.getSlotInfo();
        if (slotInfo != null) {
            str = slotInfo.getSlotId();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        OHMSlotInfoEntity slotInfo2 = oHMOrdersOnlineDataEntity.getSlotInfo();
        if (slotInfo2 != null) {
            str3 = slotInfo2.getSlotBeginDate();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        OHMSlotInfoEntity slotInfo3 = oHMOrdersOnlineDataEntity.getSlotInfo();
        if (slotInfo3 != null) {
            str5 = slotInfo3.getSlotEndDate();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        OHMSlotInfoEntity slotInfo4 = oHMOrdersOnlineDataEntity.getSlotInfo();
        if (slotInfo4 != null) {
            str7 = slotInfo4.getSlotCutOff();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        String trackingUrl = oHMOrdersOnlineDataEntity.getTrackingUrl();
        if (trackingUrl == null) {
            str9 = "";
        } else {
            str9 = trackingUrl;
        }
        Boolean canCancelOrder = oHMOrdersOnlineDataEntity.getCanCancelOrder();
        if (canCancelOrder != null) {
            z3 = canCancelOrder.booleanValue();
        } else {
            z3 = false;
        }
        Boolean canPostponeOrder = oHMOrdersOnlineDataEntity.getCanPostponeOrder();
        if (canPostponeOrder != null) {
            z4 = canPostponeOrder.booleanValue();
        } else {
            z4 = false;
        }
        String invoiceCreationDate = oHMOrdersOnlineDataEntity.getInvoiceCreationDate();
        OHMStore store = oHMOrdersOnlineDataEntity.getStore();
        if (store != null) {
            str10 = store.getFacilityServiceId();
        }
        if (str10 == null) {
            str10 = "";
        }
        List<OHMPaymentInfo> paymentInfo = oHMOrdersOnlineDataEntity.getPaymentInfo();
        if (paymentInfo != null) {
            Iterable iterable = paymentInfo;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((OHMPaymentInfo) it.next()).getPaymentChoice(), (Object) C36178i.f89321p)) {
                            z5 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return new OrdersOnlineDomain(z2, z4, z3, l, 0, orderId, a2, a3, i, scale, Double.valueOf(a), b, str2, str4, str6, invoiceCreationDate, str8, orderCreationDateTime, str11, str9, str10, z5, 16, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: e */
    public final Object mo111179e(@C12580l OHMOrdersOnlineEntity oHMOrdersOnlineEntity, @C12579k C11045c<? super OrdersOnlineResultDomain> cVar) {
        return C11965h.m47673h(this.f90131d.getCoroutineContext(), new OHMOrdersOnlineEntityDataMapper$transform$2(oHMOrdersOnlineEntity, this, (C11045c<? super OHMOrdersOnlineEntityDataMapper$transform$2>) null), cVar);
    }
}
