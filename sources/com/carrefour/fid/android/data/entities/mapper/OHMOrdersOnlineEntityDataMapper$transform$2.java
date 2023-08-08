package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity;
import com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper$transform$2", mo22502f = "OHMOrdersOnlineEntityDataMapper.kt", mo22503i = {0}, mo22504l = {47}, mo22505m = "invokeSuspend", mo22506n = {"destination$iv$iv"}, mo22507s = {"L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lcom/carrefour/fid/android/domain/models/OrdersOnlineResultDomain;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOHMOrdersOnlineEntityDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OHMOrdersOnlineEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OHMOrdersOnlineEntityDataMapper$transform$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1549#2:87\n1620#2,3:88\n*S KotlinDebug\n*F\n+ 1 OHMOrdersOnlineEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OHMOrdersOnlineEntityDataMapper$transform$2\n*L\n47#1:87\n47#1:88,3\n*E\n"})
public final class OHMOrdersOnlineEntityDataMapper$transform$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super OrdersOnlineResultDomain>, Object> {
    final /* synthetic */ OHMOrdersOnlineEntity $entity;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ OHMOrdersOnlineEntityDataMapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OHMOrdersOnlineEntityDataMapper$transform$2(OHMOrdersOnlineEntity oHMOrdersOnlineEntity, OHMOrdersOnlineEntityDataMapper oHMOrdersOnlineEntityDataMapper, C11045c<? super OHMOrdersOnlineEntityDataMapper$transform$2> cVar) {
        super(2, cVar);
        this.$entity = oHMOrdersOnlineEntity;
        this.this$0 = oHMOrdersOnlineEntityDataMapper;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OHMOrdersOnlineEntityDataMapper$transform$2(this.$entity, this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r1 = r11.L$5
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$4
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper r4 = (com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper) r4
            java.lang.Object r5 = r11.L$3
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDataEntity r5 = (com.carrefour.fid.android.data.entities.OHMOrdersOnlineDataEntity) r5
            java.lang.Object r6 = r11.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r11.L$1
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r8 = r11.L$0
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper r8 = (com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper) r8
            kotlin.C11661u0.m45747n(r12)
            r9 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r11
            goto L_0x0089
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0036:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity r12 = r11.$entity
            if (r12 == 0) goto L_0x009f
            java.util.List r12 = r12.getData()
            if (r12 == 0) goto L_0x009f
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper r1 = r11.this$0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r12, r5)
            r4.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
            r6 = r12
            r12 = r11
            r10 = r4
            r4 = r1
            r1 = r10
        L_0x005b:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x009c
            java.lang.Object r5 = r6.next()
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDataEntity r5 = (com.carrefour.fid.android.data.entities.OHMOrdersOnlineDataEntity) r5
            kotlinx.coroutines.u0 r7 = r4.f90130c
            r12.L$0 = r4
            r12.L$1 = r1
            r12.L$2 = r6
            r12.L$3 = r5
            r12.L$4 = r4
            r12.L$5 = r1
            r12.label = r2
            java.lang.Object r7 = r7.mo24780v(r12)
            if (r7 != r0) goto L_0x0080
            return r0
        L_0x0080:
            r8 = r4
            r9 = r6
            r4 = r1
            r6 = r5
            r5 = r8
            r1 = r0
            r0 = r12
            r12 = r7
            r7 = r4
        L_0x0089:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r12 = r5.mo111178d(r6, r12)
            r4.add(r12)
            r12 = r0
            r0 = r1
            r1 = r7
            r4 = r8
            r6 = r9
            goto L_0x005b
        L_0x009c:
            java.util.List r1 = (java.util.List) r1
            goto L_0x00a1
        L_0x009f:
            r12 = r11
            r1 = r3
        L_0x00a1:
            if (r1 != 0) goto L_0x00a7
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00a7:
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r0 = new com.carrefour.fid.android.domain.models.OrdersPagingDomain
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity r2 = r12.$entity
            if (r2 == 0) goto L_0x00b8
            com.carrefour.fid.android.data.entities.APIMOrdersPagingEntity r2 = r2.getMeta()
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = r2.getScrollHash()
            goto L_0x00b9
        L_0x00b8:
            r2 = r3
        L_0x00b9:
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity r12 = r12.$entity
            if (r12 == 0) goto L_0x00c7
            com.carrefour.fid.android.data.entities.APIMOrdersPagingEntity r12 = r12.getMeta()
            if (r12 == 0) goto L_0x00c7
            java.lang.String r3 = r12.getScrollPaging()
        L_0x00c7:
            r0.<init>(r2, r3)
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r12 = new com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain
            r12.<init>(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper$transform$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super OrdersOnlineResultDomain> cVar) {
        return ((OHMOrdersOnlineEntityDataMapper$transform$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
