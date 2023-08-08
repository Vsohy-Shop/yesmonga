package com.carrefour.fid.android.presentation.p035ui.orders.online.extension;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C11363r0({"SMAP\nOrdersOnlineItemModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineItemModel.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/extension/OrdersOnlineItemModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n766#2:70\n857#2,2:71\n766#2:73\n857#2,2:74\n2333#2,14:76\n288#2,2:90\n288#2,2:92\n288#2,2:94\n766#2:96\n857#2,2:97\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineItemModel.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/extension/OrdersOnlineItemModelKt\n*L\n44#1:70\n44#1:71,2\n46#1:73\n46#1:74,2\n60#1:76,14\n62#1:90,2\n64#1:92,2\n66#1:94,2\n68#1:96\n68#1:97,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.extension.c */
public final class C25198c {
    @C12579k
    /* renamed from: a */
    public static final String m108891a(@C12579k OrdersOnlineItemModel ordersOnlineItemModel, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String string = context.getString(R.string.order_txt_order_number, new Object[]{ordersOnlineItemModel.mo73495z()});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…xt_order_number, orderId)");
        return string;
    }

    @C12579k
    /* renamed from: b */
    public static final List<OrdersOnlineItemModel> m108892b(@C12579k List<OrdersOnlineItemModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (m108900j((OrdersOnlineItemModel) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel m108893c(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel> r6) {
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
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel r2 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel) r2
            com.carrefour.fid.android.core.constants.OrderStatus r3 = r2.mo73380g()
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
            java.lang.String r2 = r2.mo73494y()     // Catch:{ IllegalArgumentException -> 0x0069 }
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
            goto L_0x00a8
        L_0x007b:
            java.lang.Object r0 = r6.next()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L_0x0087
        L_0x0085:
            r6 = r0
            goto L_0x00a8
        L_0x0087:
            r1 = r0
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel r1 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel) r1
            java.lang.String r1 = r1.mo73493x()
        L_0x008e:
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel r3 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel) r3
            java.lang.String r3 = r3.mo73493x()
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L_0x00a1
            r0 = r2
            r1 = r3
        L_0x00a1:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x008e
            goto L_0x0085
        L_0x00a8:
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel r6 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25198c.m108893c(java.util.List):com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineItemModel");
    }

    @C12580l
    /* renamed from: d */
    public static final OrdersOnlineItemModel m108894d(@C12579k List<OrdersOnlineItemModel> list) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            OrdersOnlineItemModel ordersOnlineItemModel = (OrdersOnlineItemModel) obj;
            if (!(ordersOnlineItemModel.mo73378f() instanceof OrderType.Clcv) || !m108901k(ordersOnlineItemModel)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (OrdersOnlineItemModel) obj;
    }

    @C12580l
    /* renamed from: e */
    public static final OrdersOnlineItemModel m108895e(@C12579k List<OrdersOnlineItemModel> list) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            OrdersOnlineItemModel ordersOnlineItemModel = (OrdersOnlineItemModel) obj;
            if (!(ordersOnlineItemModel.mo73378f() instanceof OrderType.C28690b) || !m108901k(ordersOnlineItemModel)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (OrdersOnlineItemModel) obj;
    }

    @C12580l
    /* renamed from: f */
    public static final OrdersOnlineItemModel m108896f(@C12579k List<OrdersOnlineItemModel> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m108901k((OrdersOnlineItemModel) obj)) {
                break;
            }
        }
        return (OrdersOnlineItemModel) obj;
    }

    @C12579k
    /* renamed from: g */
    public static final String m108897g(@C12579k OrdersOnlineItemModel ordersOnlineItemModel, @C12579k String str) {
        String str2;
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "<this>");
        Intrinsics.checkNotNullParameter(str, "dateFormat");
        try {
            String format = new SimpleDateFormat(str, Locale.ENGLISH).format(DateTime.m51195N2(ordersOnlineItemModel.mo73493x()).mo28744O0());
            Intrinsics.checkNotNullExpressionValue(format, "{\n    SimpleDateFormat(\n…ginSlot).toDate()\n    )\n}");
            return format;
        } catch (Exception e) {
            Exception exc = e;
            C28935i iVar = C28935i.f70940a;
            String message = exc.getMessage();
            if (message == null) {
                str2 = "";
            } else {
                str2 = message;
            }
            C28935i.m119705e(iVar, str2, exc, 0, 4, (Object) null);
            return "";
        }
    }

    @C12579k
    /* renamed from: h */
    public static final List<OrdersOnlineItemModel> m108898h(@C12579k List<OrdersOnlineItemModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (m108901k((OrdersOnlineItemModel) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static final boolean m108899i(@C12579k OrdersOnlineItemModel ordersOnlineItemModel) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "<this>");
        OrderStatus g = ordersOnlineItemModel.mo73380g();
        if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Cancelled.f89252e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Closed.f89254e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Delivered.f89256e);
        }
        if (z2) {
            return true;
        }
        return Intrinsics.areEqual((Object) g, (Object) OrderStatus.ReadyToPick.f89262e);
    }

    /* renamed from: j */
    public static final boolean m108900j(@C12579k OrdersOnlineItemModel ordersOnlineItemModel) {
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "<this>");
        return ordersOnlineItemModel.mo73380g() instanceof OrderStatus.Delivered;
    }

    /* renamed from: k */
    public static final boolean m108901k(@C12579k OrdersOnlineItemModel ordersOnlineItemModel) {
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "<this>");
        if ((ordersOnlineItemModel.mo73380g() instanceof OrderStatus.Cancelled) || (ordersOnlineItemModel.mo73380g() instanceof OrderStatus.Unknown)) {
            return false;
        }
        return true;
    }
}
