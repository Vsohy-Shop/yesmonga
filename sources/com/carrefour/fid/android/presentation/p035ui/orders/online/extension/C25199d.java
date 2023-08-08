package com.carrefour.fid.android.presentation.p035ui.orders.online.extension;

import android.webkit.URLUtil;
import com.carrefour.fid.android.domain.models.C38079p;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsAllowanceModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28560l0;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOrdersOnlineModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineModel.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/extension/OrdersOnlineModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n766#2:147\n857#2,2:148\n1549#2:150\n1620#2,2:151\n1622#2:154\n1549#2:155\n1620#2,3:156\n1#3:153\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineModel.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/extension/OrdersOnlineModelKt\n*L\n41#1:147\n41#1:148,2\n44#1:150\n44#1:151,2\n44#1:154\n136#1:155\n136#1:156,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.extension.d */
public final class C25199d {
    @C12579k
    /* renamed from: a */
    public static final List<OrdersOnlineDetailsAllowanceModel> m108902a(@C12579k List<C38079p> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<C38079p> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C38079p pVar : iterable) {
            String j = pVar.mo118266j();
            String l = pVar.mo118268l();
            arrayList.add(new OrdersOnlineDetailsAllowanceModel(pVar.mo118265i(), pVar.mo118267k(), l, j, pVar.mo118270n(), pVar.mo118269m()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r39v1, types: [com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel] */
    /* JADX WARNING: type inference failed for: r19v2, types: [com.carrefour.fid.android.presentation.ui.orders.online.model.i] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.carrefour.fid.android.presentation.ui.orders.online.model.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b> m108903b(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.C38121s> r67, boolean r68) {
        /*
            r0 = r67
            java.lang.String r1 = "<this>"
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
            if (r3 == 0) goto L_0x023d
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.domain.models.s r3 = (com.carrefour.fid.android.domain.models.C38121s) r3
            boolean r4 = com.carrefour.fid.android.domain.extension.C37510k.m153977e(r3)
            if (r4 == 0) goto L_0x00ab
            if (r68 == 0) goto L_0x00ab
            com.carrefour.fid.android.presentation.ui.orders.online.model.d r4 = new com.carrefour.fid.android.presentation.ui.orders.online.model.d
            com.carrefour.fid.android.core.type.OrderCategoryType r5 = com.carrefour.fid.android.core.type.OrderCategoryType.MISSING_PRODUCTS
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = r3.mo119013D()
            double r8 = com.carrefour.fid.android.domain.extension.C37510k.m153975c(r3)
            double r10 = com.carrefour.fid.android.domain.extension.C37510k.m153976d(r3)
            java.lang.String r12 = r3.mo119018I()
            java.lang.String r13 = r3.mo119020K()
            java.lang.String r5 = r3.mo119021L()
            java.lang.String r14 = m108904c(r5)
            int r5 = r3.mo119022M()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r5 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r16 = r3.mo119023N()
            r67 = r0
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
            goto L_0x0234
        L_0x00ab:
            r67 = r0
            r18 = r1
            boolean r0 = com.carrefour.fid.android.domain.extension.C37510k.m153979g(r3)
            if (r0 == 0) goto L_0x01c0
            if (r68 == 0) goto L_0x01c0
            java.util.Iterator r0 = r18.iterator()
        L_0x00bb:
            boolean r1 = r0.hasNext()
            r4 = 0
            if (r1 == 0) goto L_0x00d8
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.carrefour.fid.android.domain.models.s r5 = (com.carrefour.fid.android.domain.models.C38121s) r5
            java.lang.String r5 = r5.mo119010A()
            java.lang.String r6 = r3.mo119019J()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x00bb
            goto L_0x00d9
        L_0x00d8:
            r1 = r4
        L_0x00d9:
            com.carrefour.fid.android.domain.models.s r1 = (com.carrefour.fid.android.domain.models.C38121s) r1
            com.carrefour.fid.android.core.type.OrderCategoryType r0 = com.carrefour.fid.android.core.type.OrderCategoryType.REPLACEMENT_PRODUCTS
            java.lang.String r20 = r0.toString()
            java.lang.String r21 = r3.mo119013D()
            java.lang.String r22 = r3.mo119010A()
            double r23 = r3.mo119014E()
            double r25 = com.carrefour.fid.android.domain.extension.C37510k.m153975c(r3)
            java.lang.String r27 = r3.mo119018I()
            java.lang.String r28 = r3.mo119020K()
            java.lang.String r0 = r3.mo119021L()
            java.lang.String r29 = m108904c(r0)
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
            if (r6 == 0) goto L_0x0133
            boolean r6 = kotlin.text.C11622t.isBlank(r6)
            r6 = r6 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0134
        L_0x0133:
            r6 = r4
        L_0x0134:
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0142
            java.lang.String r6 = "REPLACEMENT_PRODUCT_BOTTOM"
            goto L_0x0144
        L_0x0142:
            java.lang.String r6 = "REPLACEMENT_PRODUCT_TOP"
        L_0x0144:
            r34 = r6
            if (r1 == 0) goto L_0x014f
            java.lang.String r6 = com.carrefour.fid.android.domain.extension.C37510k.m153982j(r3, r1)
            r35 = r6
            goto L_0x0151
        L_0x014f:
            r35 = r4
        L_0x0151:
            if (r1 == 0) goto L_0x015e
            double r6 = com.carrefour.fid.android.domain.extension.C37510k.m153973a(r3, r1)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r37 = r6
            goto L_0x0160
        L_0x015e:
            r37 = r4
        L_0x0160:
            if (r1 == 0) goto L_0x016d
            double r6 = com.carrefour.fid.android.domain.extension.C37510k.m153974b(r3, r1)
            java.lang.Double r3 = java.lang.Double.valueOf(r6)
            r36 = r3
            goto L_0x016f
        L_0x016d:
            r36 = r4
        L_0x016f:
            if (r1 == 0) goto L_0x0176
            java.lang.String r3 = r1.mo119013D()
            goto L_0x0177
        L_0x0176:
            r3 = r4
        L_0x0177:
            java.lang.String r6 = ""
            if (r3 != 0) goto L_0x017d
            r8 = r6
            goto L_0x017e
        L_0x017d:
            r8 = r3
        L_0x017e:
            if (r1 == 0) goto L_0x0185
            java.lang.String r3 = r1.mo119021L()
            goto L_0x0186
        L_0x0185:
            r3 = r4
        L_0x0186:
            if (r3 != 0) goto L_0x0189
            r3 = r6
        L_0x0189:
            java.lang.String r9 = m108904c(r3)
            if (r1 == 0) goto L_0x0193
            java.lang.String r4 = r1.mo119020K()
        L_0x0193:
            if (r4 != 0) goto L_0x0197
            r10 = r6
            goto L_0x0198
        L_0x0197:
            r10 = r4
        L_0x0198:
            if (r1 == 0) goto L_0x019f
            int r3 = r1.mo119027R()
            goto L_0x01a0
        L_0x019f:
            r3 = -1
        L_0x01a0:
            r11 = r3
            if (r1 == 0) goto L_0x01a8
            double r3 = com.carrefour.fid.android.domain.extension.C37510k.m153976d(r1)
            goto L_0x01aa
        L_0x01a8:
            r3 = 0
        L_0x01aa:
            r12 = r3
            com.carrefour.fid.android.presentation.ui.orders.online.model.g r7 = new com.carrefour.fid.android.presentation.ui.orders.online.model.g
            r38 = r7
            r7.<init>(r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.ui.orders.online.model.i r4 = new com.carrefour.fid.android.presentation.ui.orders.online.model.i
            r19 = r4
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)
            r32 = r5
            r19.<init>(r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0234
        L_0x01c0:
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
            java.lang.String r0 = r3.mo119021L()
            java.lang.String r56 = m108904c(r0)
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
        L_0x0234:
            r0 = r67
            r0.add(r4)
            r1 = r18
            goto L_0x003b
        L_0x023d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25199d.m108903b(java.util.List, boolean):java.util.List");
    }

    @C12579k
    /* renamed from: c */
    public static final String m108904c(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || URLUtil.isNetworkUrl(str)) {
            return str;
        }
        String c0 = StringKt.m118923c0(C28560l0.f69498b);
        return C28547h2.f69317e + c0 + "/" + str;
    }

    @C12579k
    /* renamed from: d */
    public static final String m108905d(@C12579k C25234b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String c0 = StringKt.m118923c0(C28560l0.f69498b);
        String c = bVar.mo73434c();
        return C28547h2.f69317e + c0 + c;
    }
}
