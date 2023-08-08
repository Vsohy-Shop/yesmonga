package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.C38120r;
import com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
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
@C11363r0({"SMAP\nOHMOrdersOnlineDetailsEntityDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OHMOrdersOnlineDetailsEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OHMOrdersOnlineDetailsEntityDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1747#2,3:103\n1549#2:106\n1620#2,3:107\n*S KotlinDebug\n*F\n+ 1 OHMOrdersOnlineDetailsEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OHMOrdersOnlineDetailsEntityDataMapper\n*L\n89#1:103,3\n92#1:106\n92#1:107,3\n*E\n"})
public final class OHMOrdersOnlineDetailsEntityDataMapper {

    /* renamed from: g */
    public static final int f90120g = 8;
    @C12579k

    /* renamed from: a */
    public final C36522r0 f90121a;
    @C12579k

    /* renamed from: b */
    public final C36513o0 f90122b;
    @C12579k

    /* renamed from: c */
    public final C36508m0 f90123c;
    @C12579k

    /* renamed from: d */
    public final C37807b f90124d;
    @C12579k

    /* renamed from: e */
    public final C12154u0<Boolean> f90125e;
    @C12579k

    /* renamed from: f */
    public final C12074o0 f90126f;

    @C11067d(mo22501c = "com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$1", mo22502f = "OHMOrdersOnlineDetailsEntityDataMapper.kt", mo22503i = {}, mo22504l = {37}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$1 */
    public static final class C364551 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Boolean>, Object> {
        int label;
        final /* synthetic */ OHMOrdersOnlineDetailsEntityDataMapper this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C364551(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object obj2;
            boolean z;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C37807b b = this.this$0.f90124d;
                C37807b.C37808a aVar = new C37807b.C37808a(RemoteConfigTag.AdditionalOrder);
                this.label = 1;
                obj2 = b.m172966invokegIAlus(aVar, this);
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
            return ((C364551) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    @Inject
    public OHMOrdersOnlineDetailsEntityDataMapper(@C12579k C36522r0 r0Var, @C12579k C36513o0 o0Var, @C12579k C36508m0 m0Var, @C12579k C37807b bVar, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(r0Var, "ohmOrdersOnlineDetailsProductEntityDataMapper");
        Intrinsics.checkNotNullParameter(o0Var, "ohmOrdersOnlineDetailsDeliveryAddressEntityDM");
        Intrinsics.checkNotNullParameter(m0Var, "ohmOrdersOnlineDetailsAllowanceEntityDataMapper");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f90121a = r0Var;
        this.f90122b = o0Var;
        this.f90123c = m0Var;
        this.f90124d = bVar;
        C12074o0 a = C12079p0.m48260a(C11968h2.m47683c((C11723c2) null, 1, (Object) null).mo7443Q(coroutineDispatcher));
        this.f90126f = a;
        this.f90125e = C12038j.m48057b(a, (CoroutineContext) null, (CoroutineStart) null, new C364551(this, (C11045c<? super C364551>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bb A[EDGE_INSN: B:144:0x01bb->B:91:0x01bb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111174c(com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity r45, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.C38120r> r46) {
        /*
            r44 = this;
            r0 = r44
            r1 = r46
            boolean r2 = r1 instanceof com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1 r2 = (com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1 r2 = new com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper$asDomain$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L_0x0055
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            int r3 = r2.I$0
            java.lang.Object r4 = r2.L$2
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r2.L$1
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity r5 = (com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity) r5
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper r2 = (com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00bd
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0049:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity r4 = (com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity) r4
            java.lang.Object r9 = r2.L$0
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper r9 = (com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper) r9
            kotlin.C11661u0.m45747n(r1)
            goto L_0x006a
        L_0x0055:
            kotlin.C11661u0.m45747n(r1)
            kotlinx.coroutines.u0<java.lang.Boolean> r1 = r0.f90125e
            r2.L$0 = r0
            r4 = r45
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = r1.mo24780v(r2)
            if (r1 != r3) goto L_0x0069
            return r3
        L_0x0069:
            r9 = r0
        L_0x006a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.carrefour.fid.android.shared.util.i r10 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Get Additional Order FF: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119704b(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0097
            java.lang.Boolean r10 = r4.getAdditionalOrderEligible()
            if (r10 == 0) goto L_0x0097
            boolean r10 = r10.booleanValue()
            goto L_0x0098
        L_0x0097:
            r10 = r7
        L_0x0098:
            if (r1 == 0) goto L_0x009f
            java.lang.Long r11 = r4.getAdditionalOrderId()
            goto L_0x00a0
        L_0x009f:
            r11 = r8
        L_0x00a0:
            if (r1 == 0) goto L_0x00c5
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity r1 = r4.getAdditionalOrder()
            if (r1 == 0) goto L_0x00c5
            r2.L$0 = r9
            r2.L$1 = r4
            r2.L$2 = r11
            r2.I$0 = r10
            r2.label = r5
            java.lang.Object r1 = r9.mo111174c(r1, r2)
            if (r1 != r3) goto L_0x00b9
            return r3
        L_0x00b9:
            r5 = r4
            r2 = r9
            r3 = r10
            r4 = r11
        L_0x00bd:
            com.carrefour.fid.android.domain.models.r r1 = (com.carrefour.fid.android.domain.models.C38120r) r1
            r12 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r4 = r5
            goto L_0x00c6
        L_0x00c5:
            r12 = r8
        L_0x00c6:
            java.lang.String r13 = r4.getOrderId()
            com.carrefour.fid.android.core.constants.OrderStatus$a r1 = com.carrefour.fid.android.core.constants.OrderStatus.f89242c
            java.lang.String r2 = r4.getStatus()
            com.carrefour.fid.android.core.constants.OrderStatus r15 = r1.mo108074a(r2)
            com.carrefour.fid.android.shared.domain.models.order.OrderType$a r1 = com.carrefour.fid.android.shared.domain.models.order.OrderType.f70276c
            java.lang.String r2 = r4.getOrderType()
            java.lang.Boolean r3 = r4.getExpressPickup()
            com.carrefour.fid.android.shared.domain.models.order.OrderType r14 = r1.mo83640a(r2, r3)
            com.carrefour.fid.android.data.entities.Amount r1 = r4.getOrderAmount()
            if (r1 == 0) goto L_0x00ed
            double r1 = com.carrefour.fid.android.data.entities.extension.C36449f.m149518a(r1)
            goto L_0x00ef
        L_0x00ed:
            r1 = 0
        L_0x00ef:
            r16 = r1
            com.carrefour.fid.android.data.entities.Amount r1 = r4.getOrderPreparedAmount()
            if (r1 == 0) goto L_0x00fe
            java.lang.Double r1 = com.carrefour.fid.android.data.entities.extension.C36449f.m149519b(r1)
            r18 = r1
            goto L_0x0100
        L_0x00fe:
            r18 = r8
        L_0x0100:
            java.lang.String r19 = r4.getOrderCreationDateTime()
            java.lang.String r1 = r4.getLastUpdateDateTime()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x010f
            r20 = r2
            goto L_0x0111
        L_0x010f:
            r20 = r1
        L_0x0111:
            com.carrefour.fid.android.data.entities.OHMStore r1 = r4.getStore()
            java.lang.String r1 = r1.getFacilityServiceId()
            if (r1 != 0) goto L_0x011e
            r21 = r2
            goto L_0x0120
        L_0x011e:
            r21 = r1
        L_0x0120:
            com.carrefour.fid.android.data.entities.OHMStore r1 = r4.getStore()
            java.lang.String r1 = r1.getMetiRef()
            if (r1 != 0) goto L_0x012d
            r22 = r2
            goto L_0x012f
        L_0x012d:
            r22 = r1
        L_0x012f:
            com.carrefour.fid.android.data.entities.mapper.o0 r1 = r9.f90122b
            com.carrefour.fid.android.data.entities.OHMDeliveryAddress r3 = r4.getDeliveryAddress()
            com.carrefour.fid.android.domain.models.q r1 = r1.mo72340a(r3)
            if (r1 != 0) goto L_0x0150
            com.carrefour.fid.android.domain.models.q r1 = new com.carrefour.fid.android.domain.models.q
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 31
            r30 = 0
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
        L_0x0150:
            r25 = r1
            com.carrefour.fid.android.data.entities.OHMSlotInfoEntity r1 = r4.getSlotInfo()
            if (r1 == 0) goto L_0x015d
            java.lang.String r1 = r1.getSlotBeginDate()
            goto L_0x015e
        L_0x015d:
            r1 = r8
        L_0x015e:
            if (r1 != 0) goto L_0x0163
            r26 = r2
            goto L_0x0165
        L_0x0163:
            r26 = r1
        L_0x0165:
            com.carrefour.fid.android.data.entities.OHMSlotInfoEntity r1 = r4.getSlotInfo()
            if (r1 == 0) goto L_0x0170
            java.lang.String r1 = r1.getSlotEndDate()
            goto L_0x0171
        L_0x0170:
            r1 = r8
        L_0x0171:
            if (r1 != 0) goto L_0x0176
            r27 = r2
            goto L_0x0178
        L_0x0176:
            r27 = r1
        L_0x0178:
            com.carrefour.fid.android.data.entities.OHMSlotInfoEntity r1 = r4.getSlotInfo()
            if (r1 == 0) goto L_0x0183
            java.lang.String r1 = r1.getSlotId()
            goto L_0x0184
        L_0x0183:
            r1 = r8
        L_0x0184:
            if (r1 != 0) goto L_0x0189
            r28 = r2
            goto L_0x018b
        L_0x0189:
            r28 = r1
        L_0x018b:
            java.lang.String r1 = r4.getPickingEligibility()
            if (r1 != 0) goto L_0x0194
            r29 = r2
            goto L_0x0196
        L_0x0194:
            r29 = r1
        L_0x0196:
            com.carrefour.fid.android.data.entities.mapper.r0 r1 = r9.f90121a
            java.util.List r3 = r4.getOffersEntityList()
            java.util.List r1 = r1.mo83406b(r3)
            if (r1 != 0) goto L_0x01a6
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x01a6:
            r34 = r1
            java.util.List r1 = r4.getPaymentInfo()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L_0x01be
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01be
        L_0x01bb:
            r33 = r7
            goto L_0x01dc
        L_0x01be:
            java.util.Iterator r1 = r1.iterator()
        L_0x01c2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01bb
            java.lang.Object r3 = r1.next()
            com.carrefour.fid.android.data.entities.OHMPaymentInfo r3 = (com.carrefour.fid.android.data.entities.OHMPaymentInfo) r3
            java.lang.String r3 = r3.getPaymentChoice()
            java.lang.String r5 = "INSTORE"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x01c2
            r33 = r6
        L_0x01dc:
            java.util.List r1 = r4.getPaymentInfo()
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r1)
            com.carrefour.fid.android.data.entities.OHMPaymentInfo r1 = (com.carrefour.fid.android.data.entities.OHMPaymentInfo) r1
            if (r1 == 0) goto L_0x01ec
            java.lang.String r8 = r1.getPaymentDate()
        L_0x01ec:
            if (r8 != 0) goto L_0x01f1
            r35 = r2
            goto L_0x01f3
        L_0x01f1:
            r35 = r8
        L_0x01f3:
            java.lang.String r1 = r4.getInvoiceUrl()
            if (r1 != 0) goto L_0x01fc
            r36 = r2
            goto L_0x01fe
        L_0x01fc:
            r36 = r1
        L_0x01fe:
            java.util.List r1 = r4.getInvoicesInfo()
            if (r1 == 0) goto L_0x023f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0215:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x023c
            java.lang.Object r5 = r1.next()
            com.carrefour.fid.android.data.entities.InvoicesInfoEntity r5 = (com.carrefour.fid.android.data.entities.InvoicesInfoEntity) r5
            com.carrefour.fid.android.domain.models.InvoicesInfoDomain r8 = new com.carrefour.fid.android.domain.models.InvoicesInfoDomain
            java.lang.String r23 = r5.getInvoiceUrl()
            if (r23 != 0) goto L_0x022b
            r6 = r2
            goto L_0x022d
        L_0x022b:
            r6 = r23
        L_0x022d:
            java.lang.String r5 = r5.getInvoiceType()
            if (r5 != 0) goto L_0x0234
            r5 = r2
        L_0x0234:
            r8.<init>(r6, r5)
            r3.add(r8)
            r6 = 1
            goto L_0x0215
        L_0x023c:
            r37 = r3
            goto L_0x0245
        L_0x023f:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r37 = r1
        L_0x0245:
            com.carrefour.fid.android.data.entities.mapper.m0 r1 = r9.f90123c
            java.util.List r3 = r4.getAllowanceCharge()
            java.util.List r1 = r1.mo83406b(r3)
            if (r1 != 0) goto L_0x0255
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0255:
            r38 = r1
            java.lang.Boolean r1 = r4.isChangeDeliveryAvailable()
            if (r1 == 0) goto L_0x0264
            boolean r1 = r1.booleanValue()
            r39 = r1
            goto L_0x0266
        L_0x0264:
            r39 = r7
        L_0x0266:
            java.lang.Boolean r1 = r4.isCancelOrderAvailable()
            if (r1 == 0) goto L_0x0273
            boolean r1 = r1.booleanValue()
            r40 = r1
            goto L_0x0275
        L_0x0273:
            r40 = r7
        L_0x0275:
            java.lang.String r1 = r4.getTrackingUrl()
            if (r1 != 0) goto L_0x027e
            r41 = r2
            goto L_0x0280
        L_0x027e:
            r41 = r1
        L_0x0280:
            com.carrefour.fid.android.domain.models.r r1 = new com.carrefour.fid.android.domain.models.r
            if (r10 == 0) goto L_0x0286
            r10 = 1
            goto L_0x0287
        L_0x0286:
            r10 = r7
        L_0x0287:
            java.lang.String r23 = ""
            r24 = 0
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r32 = ""
            r42 = 8192(0x2000, float:1.14794E-41)
            r43 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper.mo111174c(com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public final Object mo111175d(@C12580l OHMOrdersOnlineDetailsDataEntity oHMOrdersOnlineDetailsDataEntity, @C12579k C11045c<? super C38120r> cVar) {
        return C11965h.m47673h(this.f90126f.getCoroutineContext(), new OHMOrdersOnlineDetailsEntityDataMapper$transform$2(oHMOrdersOnlineDetailsDataEntity, this, (C11045c<? super OHMOrdersOnlineDetailsEntityDataMapper$transform$2>) null), cVar);
    }
}
