package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOrdersOnlineDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDomain.kt\ncom/carrefour/fid/android/domain/extension/OrdersOnlineDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1747#2,3:34\n766#2:37\n857#2,2:38\n1963#2,14:40\n766#2:54\n857#2,2:55\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDomain.kt\ncom/carrefour/fid/android/domain/extension/OrdersOnlineDomainKt\n*L\n11#1:34,3\n17#1:37\n17#1:38,2\n31#1:40,14\n33#1:54\n33#1:55,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.l */
public final class C37511l {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.carrefour.fid.android.domain.models.OrdersOnlineDomain} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.OrdersOnlineDomain m153983a(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.OrdersOnlineDomain> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0010:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r2 = (com.carrefour.fid.android.domain.models.OrdersOnlineDomain) r2
            com.carrefour.fid.android.core.constants.OrderStatus r3 = r2.getOrderStatus()
            com.carrefour.fid.android.core.constants.OrderStatus$Affected r4 = com.carrefour.fid.android.core.constants.OrderStatus.Affected.f89246e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            r5 = 1
            if (r4 == 0) goto L_0x002c
            r4 = r5
            goto L_0x0032
        L_0x002c:
            com.carrefour.fid.android.core.constants.OrderStatus$Validated r4 = com.carrefour.fid.android.core.constants.OrderStatus.Validated.f89268e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
        L_0x0032:
            if (r4 == 0) goto L_0x0036
            r4 = r5
            goto L_0x003c
        L_0x0036:
            com.carrefour.fid.android.core.constants.OrderStatus$AwaitingPreparation r4 = com.carrefour.fid.android.core.constants.OrderStatus.AwaitingPreparation.f89250e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
        L_0x003c:
            if (r4 == 0) goto L_0x0040
            r4 = r5
            goto L_0x0046
        L_0x0040:
            com.carrefour.fid.android.core.constants.OrderStatus$Shipped r4 = com.carrefour.fid.android.core.constants.OrderStatus.Shipped.f89264e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
        L_0x0046:
            if (r4 == 0) goto L_0x004a
            r4 = r5
            goto L_0x0050
        L_0x004a:
            com.carrefour.fid.android.core.constants.OrderStatus$PreparationInProgress r4 = com.carrefour.fid.android.core.constants.OrderStatus.PreparationInProgress.f89258e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
        L_0x0050:
            if (r4 == 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            com.carrefour.fid.android.core.constants.OrderStatus$Prepared r4 = com.carrefour.fid.android.core.constants.OrderStatus.Prepared.f89260e
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
        L_0x0059:
            r3 = 0
            if (r5 == 0) goto L_0x0069
            java.lang.String r2 = r2.getSlotEndDate()     // Catch:{ IllegalArgumentException -> 0x0069 }
            org.joda.time.DateTime r2 = org.joda.time.DateTime.m51195N2(r2)     // Catch:{ IllegalArgumentException -> 0x0069 }
            boolean r2 = r2.mo28754o0()     // Catch:{ IllegalArgumentException -> 0x0069 }
            r3 = r2
        L_0x0069:
            if (r3 == 0) goto L_0x0010
            r0.add(r1)
            goto L_0x0010
        L_0x006f:
            java.util.Iterator r6 = r0.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x007b
            r6 = 0
            goto L_0x00b0
        L_0x007b:
            java.lang.Object r0 = r6.next()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L_0x0087
        L_0x0085:
            r6 = r0
            goto L_0x00b0
        L_0x0087:
            r1 = r0
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r1 = (com.carrefour.fid.android.domain.models.OrdersOnlineDomain) r1
            java.lang.String r1 = r1.getOrderCreationDateTime()
            org.joda.time.DateTime r1 = org.joda.time.DateTime.m51195N2(r1)
        L_0x0092:
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r3 = (com.carrefour.fid.android.domain.models.OrdersOnlineDomain) r3
            java.lang.String r3 = r3.getOrderCreationDateTime()
            org.joda.time.DateTime r3 = org.joda.time.DateTime.m51195N2(r3)
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L_0x00a9
            r0 = r2
            r1 = r3
        L_0x00a9:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x0092
            goto L_0x0085
        L_0x00b0:
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r6 = (com.carrefour.fid.android.domain.models.OrdersOnlineDomain) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.extension.C37511l.m153983a(java.util.List):com.carrefour.fid.android.domain.models.OrdersOnlineDomain");
    }

    @C12579k
    /* renamed from: b */
    public static final List<OrdersOnlineDomain> m153984b(@C12579k List<OrdersOnlineDomain> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (m153986d((OrdersOnlineDomain) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final boolean m153985c(@C12579k List<OrdersOnlineDomain> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<OrdersOnlineDomain> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (OrdersOnlineDomain ordersOnlineDomain : iterable) {
            if ((ordersOnlineDomain.getOrderStatus() instanceof OrderStatus.ReadyToPick) || (ordersOnlineDomain.getOrderStatus() instanceof OrderStatus.Delivered) || (ordersOnlineDomain.getOrderStatus() instanceof OrderStatus.Closed)) {
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

    /* renamed from: d */
    public static final boolean m153986d(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "<this>");
        if ((ordersOnlineDomain.getOrderStatus() instanceof OrderStatus.Cancelled) || (ordersOnlineDomain.getOrderStatus() instanceof OrderStatus.Unknown)) {
            return false;
        }
        return true;
    }
}
