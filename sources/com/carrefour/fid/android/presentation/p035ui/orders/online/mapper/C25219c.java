package com.carrefour.fid.android.presentation.p035ui.orders.online.mapper;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsProductModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsProductModelDataMapper.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/mapper/OrdersOnlineDetailsProductModelDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n766#2:115\n857#2,2:116\n1549#2:118\n1620#2,2:119\n1622#2:122\n1#3:121\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsProductModelDataMapper.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/mapper/OrdersOnlineDetailsProductModelDataMapper\n*L\n29#1:115\n29#1:116,2\n32#1:118\n32#1:119,2\n32#1:122\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.mapper.c */
public final class C25219c {

    /* renamed from: a */
    public static final int f62107a = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r39v1, types: [com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel] */
    /* JADX WARNING: type inference failed for: r19v2, types: [com.carrefour.fid.android.presentation.ui.orders.online.model.i] */
    /* JADX WARNING: type inference failed for: r5v13, types: [com.carrefour.fid.android.presentation.ui.orders.online.model.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b> mo73296a(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.C38121s> r68, boolean r69) {
        /*
            r67 = this;
            r0 = r68
            java.lang.String r1 = "entityList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x0013:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002c
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.s r5 = (com.carrefour.fid.android.domain.models.C38121s) r5
            boolean r5 = com.carrefour.fid.android.domain.extension.C37510k.m153981i(r5, r0)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0013
            r2.add(r4)
            goto L_0x0013
        L_0x002c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r2, r3)
            r0.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x003b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x022f
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.domain.models.s r3 = (com.carrefour.fid.android.domain.models.C38121s) r3
            boolean r4 = com.carrefour.fid.android.domain.extension.C37510k.m153977e(r3)
            if (r4 == 0) goto L_0x00a7
            if (r69 == 0) goto L_0x00a7
            com.carrefour.fid.android.presentation.ui.orders.online.model.d r4 = new com.carrefour.fid.android.presentation.ui.orders.online.model.d
            com.carrefour.fid.android.core.type.OrderCategoryType r5 = com.carrefour.fid.android.core.type.OrderCategoryType.MISSING_PRODUCTS
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = r3.mo119013D()
            double r8 = com.carrefour.fid.android.domain.extension.C37510k.m153975c(r3)
            double r10 = com.carrefour.fid.android.domain.extension.C37510k.m153976d(r3)
            java.lang.String r12 = r3.mo119018I()
            java.lang.String r13 = r3.mo119020K()
            java.lang.String r14 = r3.mo119021L()
            int r5 = r3.mo119022M()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r5 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r16 = r3.mo119023N()
            r68 = r0
            r18 = r1
            double r0 = r16.mo116377e()
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r16 = r3.mo119023N()
            r17 = r14
            r19 = r15
            double r14 = r16.mo116379f()
            r5.<init>(r0, r14)
            int r0 = r3.mo119027R()
            r1 = r5
            r5 = r4
            r14 = r17
            r15 = r19
            r16 = r1
            r17 = r0
            r5.<init>(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17)
            goto L_0x0226
        L_0x00a7:
            r68 = r0
            r18 = r1
            boolean r0 = com.carrefour.fid.android.domain.extension.C37510k.m153979g(r3)
            if (r0 == 0) goto L_0x01b6
            if (r69 == 0) goto L_0x01b6
            java.util.Iterator r0 = r18.iterator()
        L_0x00b7:
            boolean r1 = r0.hasNext()
            r4 = 0
            if (r1 == 0) goto L_0x00d4
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.carrefour.fid.android.domain.models.s r5 = (com.carrefour.fid.android.domain.models.C38121s) r5
            java.lang.String r5 = r5.mo119010A()
            java.lang.String r6 = r3.mo119019J()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x00b7
            goto L_0x00d5
        L_0x00d4:
            r1 = r4
        L_0x00d5:
            com.carrefour.fid.android.domain.models.s r1 = (com.carrefour.fid.android.domain.models.C38121s) r1
            com.carrefour.fid.android.core.type.OrderCategoryType r0 = com.carrefour.fid.android.core.type.OrderCategoryType.REPLACEMENT_PRODUCTS
            java.lang.String r20 = r0.toString()
            java.lang.String r21 = r3.mo119013D()
            java.lang.String r22 = r3.mo119010A()
            double r23 = r3.mo119014E()
            double r25 = com.carrefour.fid.android.domain.extension.C37510k.m153975c(r3)
            java.lang.String r27 = r3.mo119018I()
            java.lang.String r28 = r3.mo119020K()
            java.lang.String r29 = r3.mo119021L()
            int r0 = r3.mo119022M()
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r5 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r6 = r3.mo119023N()
            double r6 = r6.mo116377e()
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r8 = r3.mo119023N()
            double r8 = r8.mo116379f()
            r5.<init>(r6, r8)
            int r33 = r3.mo119027R()
            java.lang.String r31 = r3.mo119019J()
            java.lang.String r6 = r3.mo119019J()
            if (r6 == 0) goto L_0x012b
            boolean r6 = kotlin.text.C11622t.isBlank(r6)
            r6 = r6 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x012c
        L_0x012b:
            r6 = r4
        L_0x012c:
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x013a
            java.lang.String r6 = "REPLACEMENT_PRODUCT_BOTTOM"
            goto L_0x013c
        L_0x013a:
            java.lang.String r6 = "REPLACEMENT_PRODUCT_TOP"
        L_0x013c:
            r34 = r6
            if (r1 == 0) goto L_0x0147
            java.lang.String r6 = com.carrefour.fid.android.domain.extension.C37510k.m153982j(r3, r1)
            r35 = r6
            goto L_0x0149
        L_0x0147:
            r35 = r4
        L_0x0149:
            if (r1 == 0) goto L_0x0156
            double r6 = com.carrefour.fid.android.domain.extension.C37510k.m153973a(r3, r1)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r37 = r6
            goto L_0x0158
        L_0x0156:
            r37 = r4
        L_0x0158:
            if (r1 == 0) goto L_0x0165
            double r6 = com.carrefour.fid.android.domain.extension.C37510k.m153974b(r3, r1)
            java.lang.Double r3 = java.lang.Double.valueOf(r6)
            r36 = r3
            goto L_0x0167
        L_0x0165:
            r36 = r4
        L_0x0167:
            if (r1 == 0) goto L_0x016e
            java.lang.String r3 = r1.mo119013D()
            goto L_0x016f
        L_0x016e:
            r3 = r4
        L_0x016f:
            java.lang.String r6 = ""
            if (r3 != 0) goto L_0x0175
            r8 = r6
            goto L_0x0176
        L_0x0175:
            r8 = r3
        L_0x0176:
            if (r1 == 0) goto L_0x017d
            java.lang.String r3 = r1.mo119021L()
            goto L_0x017e
        L_0x017d:
            r3 = r4
        L_0x017e:
            if (r3 != 0) goto L_0x0182
            r9 = r6
            goto L_0x0183
        L_0x0182:
            r9 = r3
        L_0x0183:
            if (r1 == 0) goto L_0x0189
            java.lang.String r4 = r1.mo119020K()
        L_0x0189:
            if (r4 != 0) goto L_0x018d
            r10 = r6
            goto L_0x018e
        L_0x018d:
            r10 = r4
        L_0x018e:
            if (r1 == 0) goto L_0x0195
            int r3 = r1.mo119027R()
            goto L_0x0196
        L_0x0195:
            r3 = -1
        L_0x0196:
            r11 = r3
            if (r1 == 0) goto L_0x019e
            double r3 = com.carrefour.fid.android.domain.extension.C37510k.m153976d(r1)
            goto L_0x01a0
        L_0x019e:
            r3 = 0
        L_0x01a0:
            r12 = r3
            com.carrefour.fid.android.presentation.ui.orders.online.model.g r7 = new com.carrefour.fid.android.presentation.ui.orders.online.model.g
            r38 = r7
            r7.<init>(r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.ui.orders.online.model.i r4 = new com.carrefour.fid.android.presentation.ui.orders.online.model.i
            r19 = r4
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)
            r32 = r5
            r19.<init>(r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0226
        L_0x01b6:
            java.lang.String r42 = r3.mo119061y()
            java.lang.String r40 = r3.mo119062z()
            java.lang.String r43 = r3.mo119010A()
            java.lang.String r44 = r3.mo119012C()
            java.lang.String r41 = r3.mo119013D()
            double r45 = r3.mo119014E()
            double r47 = r3.mo119015F()
            double r49 = r3.mo119016G()
            double r51 = r3.mo119017H()
            java.lang.String r53 = r3.mo119018I()
            java.lang.String r54 = r3.mo119019J()
            java.lang.String r55 = r3.mo119020K()
            java.lang.String r56 = r3.mo119021L()
            int r0 = r3.mo119022M()
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r1 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            r58 = r1
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r4 = r3.mo119023N()
            double r4 = r4.mo116377e()
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r6 = r3.mo119023N()
            double r6 = r6.mo116379f()
            r1.<init>(r4, r6)
            int r59 = r3.mo119027R()
            boolean r63 = r3.mo119028S()
            java.lang.String r64 = r3.mo119011B()
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel r4 = new com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel
            r39 = r4
            java.lang.Integer r57 = java.lang.Integer.valueOf(r0)
            r60 = 0
            r61 = 0
            r62 = 0
            r65 = 458752(0x70000, float:6.42848E-40)
            r66 = 0
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
        L_0x0226:
            r0 = r68
            r0.add(r4)
            r1 = r18
            goto L_0x003b
        L_0x022f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25219c.mo73296a(java.util.List, boolean):java.util.List");
    }
}
