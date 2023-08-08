package com.carrefour.fid.android.presentation.p035ui.orders.online.mapper;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38120r;
import com.carrefour.fid.android.shared.util.C28932h;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"SimpleDateFormat"})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsModelDataMapper.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/mapper/OrdersOnlineDetailsModelDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n766#2:188\n857#2,2:189\n288#2,2:191\n766#2:193\n857#2,2:194\n766#2:196\n857#2,2:197\n800#2,11:199\n800#2,11:211\n800#2,11:222\n800#2,11:233\n1#3:210\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsModelDataMapper.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/mapper/OrdersOnlineDetailsModelDataMapper\n*L\n81#1:188\n81#1:189,2\n93#1:191,2\n123#1:193\n123#1:194,2\n124#1:196\n124#1:197,2\n142#1:199,11\n145#1:211,11\n167#1:222,11\n170#1:233,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.mapper.a */
public final class C25216a {

    /* renamed from: c */
    public static final int f62103c = 8;
    @C12579k

    /* renamed from: a */
    public final SimpleDateFormat f62104a = new SimpleDateFormat(C28932h.f70917d);
    @C12579k

    /* renamed from: b */
    public final SimpleDateFormat f62105b = new SimpleDateFormat(C28932h.f70923j);

    /* renamed from: b */
    public static /* synthetic */ List m108973b(C25216a aVar, C38120r rVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aVar.mo73294a(rVar, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: com.carrefour.fid.android.domain.models.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.carrefour.fid.android.domain.models.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.carrefour.fid.android.domain.models.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: com.carrefour.fid.android.domain.models.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25237e> mo73294a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.C38120r r38, boolean r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            java.lang.String r2 = "entity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.List r2 = kotlin.collections.C10976s.m41417i()
            boolean r4 = r38.mo118937I()
            java.lang.Long r5 = r38.mo118938J()
            java.lang.String r10 = r38.mo118951W()
            com.carrefour.fid.android.shared.domain.models.order.OrderType r3 = r38.mo118958b0()
            if (r3 != 0) goto L_0x0021
            com.carrefour.fid.android.shared.domain.models.order.OrderType$Unknown r3 = com.carrefour.fid.android.shared.domain.models.order.OrderType.Unknown.f70294e
        L_0x0021:
            r8 = r3
            java.lang.String r11 = com.carrefour.fid.android.domain.extension.C37509j.m153961c(r38)
            java.lang.String r12 = r38.mo118971h0()
            java.lang.String r13 = r38.mo118939K()
            com.carrefour.fid.android.domain.models.q r3 = r38.mo118942N()
            java.lang.String r14 = r3.mo118925i()
            java.lang.String r15 = r38.mo118964e0()
            java.lang.String r16 = r38.mo118967f0()
            java.lang.String r6 = r38.mo118950V()
            com.carrefour.fid.android.core.constants.OrderStatus r3 = r38.mo118956a0()
            if (r3 != 0) goto L_0x004a
            com.carrefour.fid.android.core.constants.OrderStatus$Unknown r3 = com.carrefour.fid.android.core.constants.OrderStatus.Unknown.f89266e
        L_0x004a:
            r7 = r3
            java.lang.String r18 = r38.mo118960c0()
            kotlin.Pair r17 = com.carrefour.fid.android.domain.extension.C37509j.m153968j(r38)
            boolean r19 = com.carrefour.fid.android.domain.extension.C37509j.m153972n(r38)
            java.lang.String r20 = r38.mo118943O()
            java.lang.String r21 = r38.mo118962d0()
            java.lang.String r22 = r38.mo118941M()
            java.lang.String r9 = r38.mo118952X()
            java.lang.String r23 = r38.mo118944P()
            java.lang.String r25 = com.carrefour.fid.android.domain.extension.C37509j.m153963e(r38)
            java.lang.String r31 = com.carrefour.fid.android.domain.extension.C37509j.m153962d(r38)
            java.util.List r3 = r38.mo118940L()
            java.util.List r26 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d.m108902a(r3)
            boolean r29 = r38.mo118978k0()
            boolean r28 = r38.mo118976j0()
            java.lang.String r24 = r38.mo118974i0()
            com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r32 = com.carrefour.fid.android.domain.extension.C37509j.m153959a(r38)
            boolean r30 = com.carrefour.fid.android.domain.extension.C37509j.m153960b(r38)
            boolean r33 = r38.mo118980l0()
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r3 = new com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel
            r34 = r3
            r27 = r39
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2.add(r3)
            com.carrefour.fid.android.domain.models.r r3 = r38.mo118936H()
            r4 = 1
            if (r3 != 0) goto L_0x017c
            java.util.List r3 = r38.mo118954Z()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b5:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00cd
            java.lang.Object r7 = r3.next()
            r8 = r7
            com.carrefour.fid.android.domain.models.s r8 = (com.carrefour.fid.android.domain.models.C38121s) r8
            boolean r8 = r8.mo119029T()
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x00b5
            r6.add(r7)
            goto L_0x00b5
        L_0x00cd:
            com.carrefour.fid.android.core.constants.OrderStatus r3 = r38.mo118956a0()
            boolean r3 = com.carrefour.fid.android.core.extension.C36306e.m148952d(r3)
            java.util.List r3 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d.m108903b(r6, r3)
            boolean r4 = com.carrefour.fid.android.domain.extension.C37509j.m153971m(r38)
            if (r4 == 0) goto L_0x00e7
            com.carrefour.fid.android.presentation.ui.orders.online.model.h r4 = new com.carrefour.fid.android.presentation.ui.orders.online.model.h
            r4.<init>()
            r2.add(r4)
        L_0x00e7:
            java.util.List r3 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.OrdersOnlineDetailsProductModelKt.m108879a(r3, r1)
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            java.util.List r3 = r38.mo118954Z()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00fa:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x010f
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.carrefour.fid.android.domain.models.s r6 = (com.carrefour.fid.android.domain.models.C38121s) r6
            boolean r6 = r6.mo119029T()
            if (r6 == 0) goto L_0x00fa
            r5 = r4
            goto L_0x0110
        L_0x010f:
            r5 = 0
        L_0x0110:
            com.carrefour.fid.android.domain.models.s r5 = (com.carrefour.fid.android.domain.models.C38121s) r5
            if (r5 == 0) goto L_0x038c
            com.carrefour.fid.android.core.constants.OrderStatus r3 = r38.mo118956a0()
            com.carrefour.fid.android.core.constants.OrderStatus$Validated r4 = com.carrefour.fid.android.core.constants.OrderStatus.Validated.f89268e
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 != 0) goto L_0x0142
            com.carrefour.fid.android.core.constants.OrderStatus r1 = r38.mo118956a0()
            com.carrefour.fid.android.core.constants.OrderStatus$Affected r3 = com.carrefour.fid.android.core.constants.OrderStatus.Affected.f89246e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x012d
            goto L_0x0142
        L_0x012d:
            int r1 = r5.mo119022M()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            double r3 = r5.mo119014E()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r3)
            goto L_0x0156
        L_0x0142:
            int r1 = r5.mo119027R()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            double r3 = r5.mo119015F()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r3)
        L_0x0156:
            com.carrefour.fid.android.presentation.ui.orders.online.model.j r3 = new com.carrefour.fid.android.presentation.ui.orders.online.model.j
            java.lang.Object r4 = r1.mo21849e()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r5 = r5.mo119023N()
            java.lang.String r5 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25197b.m108890a(r5)
            java.lang.Object r1 = r1.mo21851f()
            java.lang.Number r1 = (java.lang.Number) r1
            double r6 = r1.doubleValue()
            r3.<init>(r4, r5, r6)
            r2.add(r3)
            goto L_0x038c
        L_0x017c:
            java.util.List r3 = r38.mo118954Z()
            com.carrefour.fid.android.core.constants.OrderStatus r6 = r38.mo118956a0()
            boolean r6 = com.carrefour.fid.android.core.extension.C36306e.m148952d(r6)
            java.util.List r3 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d.m108903b(r3, r6)
            com.carrefour.fid.android.domain.models.r r6 = r38.mo118936H()
            java.util.List r6 = r6.mo118954Z()
            com.carrefour.fid.android.domain.models.r r7 = r38.mo118936H()
            com.carrefour.fid.android.core.constants.OrderStatus r7 = r7.mo118956a0()
            boolean r7 = com.carrefour.fid.android.core.extension.C36306e.m148952d(r7)
            java.util.List r6 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d.m108903b(r6, r7)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r3.iterator()
        L_0x01af:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01c5
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.carrefour.fid.android.presentation.ui.orders.online.model.b r10 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b) r10
            boolean r10 = r10 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x01af
            r7.add(r9)
            goto L_0x01af
        L_0x01c5:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r6.iterator()
        L_0x01d0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01e6
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.carrefour.fid.android.presentation.ui.orders.online.model.b r11 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b) r11
            boolean r11 = r11 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x01d0
            r8.add(r10)
            goto L_0x01d0
        L_0x01e6:
            java.util.List r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40718y4(r7, r8)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0204
            com.carrefour.fid.android.presentation.ui.orders.online.model.a$b r8 = new com.carrefour.fid.android.presentation.ui.orders.online.model.a$b
            java.lang.String r9 = r38.mo118951W()
            java.util.List r7 = com.carrefour.fid.android.presentation.p035ui.orders.online.extension.OrdersOnlineDetailsProductModelKt.m108879a(r7, r1)
            r8.<init>(r9, r7)
            r2.add(r8)
        L_0x0204:
            java.lang.String r11 = r38.mo118951W()
            java.text.SimpleDateFormat r7 = r0.f62104a
            java.lang.String r8 = r38.mo118950V()
            java.util.Date r7 = r7.parse(r8)
            java.lang.String r8 = "parse(entity.orderCreationDateTime)"
            if (r7 == 0) goto L_0x0220
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.text.SimpleDateFormat r9 = r0.f62105b
            java.lang.String r7 = r9.format(r7)
            goto L_0x0221
        L_0x0220:
            r7 = 0
        L_0x0221:
            if (r7 != 0) goto L_0x0228
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x0228:
            r12 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r3.iterator()
        L_0x0232:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0244
            java.lang.Object r10 = r9.next()
            boolean r13 = r10 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel
            if (r13 == 0) goto L_0x0232
            r7.add(r10)
            goto L_0x0232
        L_0x0244:
            java.util.Iterator r7 = r7.iterator()
            r17 = 0
            r13 = r17
        L_0x024c:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0262
            java.lang.Object r9 = r7.next()
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel r9 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel) r9
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r9 = r9.mo73422K()
            double r9 = r9.mo116379f()
            double r13 = r13 + r9
            goto L_0x024c
        L_0x0262:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x026b:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x027d
            java.lang.Object r9 = r3.next()
            boolean r10 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel
            if (r10 == 0) goto L_0x026b
            r7.add(r9)
            goto L_0x026b
        L_0x027d:
            r3 = 3
            com.carrefour.fid.android.core.constants.OrderStatus[] r9 = new com.carrefour.fid.android.core.constants.OrderStatus[r3]
            com.carrefour.fid.android.core.constants.OrderStatus$ReadyToPick r10 = com.carrefour.fid.android.core.constants.OrderStatus.ReadyToPick.f89262e
            r19 = 0
            r9[r19] = r10
            com.carrefour.fid.android.core.constants.OrderStatus$Delivered r10 = com.carrefour.fid.android.core.constants.OrderStatus.Delivered.f89256e
            r9[r4] = r10
            com.carrefour.fid.android.core.constants.OrderStatus$Closed r10 = com.carrefour.fid.android.core.constants.OrderStatus.Closed.f89254e
            r20 = 2
            r9[r20] = r10
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            com.carrefour.fid.android.core.constants.OrderStatus r10 = r38.mo118956a0()
            boolean r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40558R1(r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x02aa
            r9 = r1
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            java.lang.String r15 = "telecharger-ma-facture"
            java.lang.String r10 = "details-commande"
            if (r9 == 0) goto L_0x02b6
            java.lang.String r9 = com.carrefour.fid.android.domain.extension.C37509j.m153966h(r9, r10, r15)
            goto L_0x02b7
        L_0x02b6:
            r9 = 0
        L_0x02b7:
            com.carrefour.fid.android.presentation.ui.orders.online.model.a$c r5 = new com.carrefour.fid.android.presentation.ui.orders.online.model.a$c
            r35 = r10
            r10 = r5
            r36 = r15
            r15 = r9
            r16 = r7
            r10.<init>(r11, r12, r13, r15, r16)
            r2.add(r5)
            java.lang.Long r5 = r38.mo118938J()
            if (r5 == 0) goto L_0x02d3
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x02d8
        L_0x02d3:
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x02d8:
            r10 = r5
            java.text.SimpleDateFormat r5 = r0.f62104a
            java.lang.String r7 = r38.mo118950V()
            java.util.Date r5 = r5.parse(r7)
            if (r5 == 0) goto L_0x02ef
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            java.text.SimpleDateFormat r7 = r0.f62105b
            java.lang.String r5 = r7.format(r5)
            goto L_0x02f0
        L_0x02ef:
            r5 = 0
        L_0x02f0:
            if (r5 != 0) goto L_0x02f7
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x02f7:
            r11 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r6.iterator()
        L_0x0301:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0313
            java.lang.Object r8 = r7.next()
            boolean r9 = r8 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel
            if (r9 == 0) goto L_0x0301
            r5.add(r8)
            goto L_0x0301
        L_0x0313:
            java.util.Iterator r5 = r5.iterator()
            r12 = r17
        L_0x0319:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x032f
            java.lang.Object r7 = r5.next()
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel r7 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel) r7
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r7 = r7.mo73422K()
            double r7 = r7.mo116379f()
            double r12 = r12 + r7
            goto L_0x0319
        L_0x032f:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r5 = r6.iterator()
        L_0x0338:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x034a
            java.lang.Object r6 = r5.next()
            boolean r7 = r6 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel
            if (r7 == 0) goto L_0x0338
            r15.add(r6)
            goto L_0x0338
        L_0x034a:
            com.carrefour.fid.android.domain.models.r r1 = r38.mo118936H()
            com.carrefour.fid.android.core.constants.OrderStatus[] r3 = new com.carrefour.fid.android.core.constants.OrderStatus[r3]
            com.carrefour.fid.android.core.constants.OrderStatus$ReadyToPick r5 = com.carrefour.fid.android.core.constants.OrderStatus.ReadyToPick.f89262e
            r3[r19] = r5
            com.carrefour.fid.android.core.constants.OrderStatus$Delivered r5 = com.carrefour.fid.android.core.constants.OrderStatus.Delivered.f89256e
            r3[r4] = r5
            com.carrefour.fid.android.core.constants.OrderStatus$Closed r4 = com.carrefour.fid.android.core.constants.OrderStatus.Closed.f89254e
            r3[r20] = r4
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.carrefour.fid.android.core.constants.OrderStatus r4 = r1.mo118956a0()
            boolean r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40558R1(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0375
            goto L_0x0376
        L_0x0375:
            r1 = 0
        L_0x0376:
            if (r1 == 0) goto L_0x0382
            r4 = r35
            r3 = r36
            java.lang.String r5 = com.carrefour.fid.android.domain.extension.C37509j.m153966h(r1, r4, r3)
            r14 = r5
            goto L_0x0383
        L_0x0382:
            r14 = 0
        L_0x0383:
            com.carrefour.fid.android.presentation.ui.orders.online.model.a$a r1 = new com.carrefour.fid.android.presentation.ui.orders.online.model.a$a
            r9 = r1
            r9.<init>(r10, r11, r12, r14, r15)
            r2.add(r1)
        L_0x038c:
            java.util.List r1 = kotlin.collections.C10976s.m41409a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a.mo73294a(com.carrefour.fid.android.domain.models.r, boolean):java.util.List");
    }
}
