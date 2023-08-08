package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.core.type.InfoProductsReplacementType;
import com.carrefour.fid.android.domain.models.C38120r;
import com.carrefour.fid.android.domain.models.InvoicesInfoDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.NotificationModel;
import com.carrefour.fid.android.shared.constant.C28554j1;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C11363r0({"SMAP\nOrdersOnlineDetailsDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsDomain.kt\ncom/carrefour/fid/android/domain/extension/OrdersOnlineDetailsDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n288#2,2:187\n288#2,2:189\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsDomain.kt\ncom/carrefour/fid/android/domain/extension/OrdersOnlineDetailsDomainKt\n*L\n82#1:187,2\n98#1:189,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.j */
public final class C37509j {
    @C12579k

    /* renamed from: a */
    public static final String f94245a = "DIGITAL_SERVICE_INVOICE";
    @C12579k

    /* renamed from: b */
    public static final String f94246b = "INVOICE";

    /* renamed from: c */
    public static final int f94247c = 14;

    @C12580l
    /* renamed from: a */
    public static final NotificationModel m153959a(@C12579k C38120r rVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (m153962d(rVar).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new NotificationModel(R.string.order_digital_item_card_title, Integer.valueOf(R.string.order_digital_item_card_content), false, false, (Integer) null);
        }
        if (!Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Lad.f70288e)) {
            return new NotificationModel(R.string.order_digital_item_card_info_details_title, Integer.valueOf(R.string.order_digital_item_card_info_details_content), true, true, Integer.valueOf(R.string.order_digital_item_card_info_action));
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m153960b(@C12579k C38120r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return C28932h.f70914a.mo84236f(rVar.mo118947S(), 14);
    }

    @C12579k
    /* renamed from: c */
    public static final String m153961c(@C12579k C38120r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (rVar.mo118953Y() != null) {
            return C28782t.m119105b(rVar.mo118953Y());
        }
        return C28782t.m119105b(Double.valueOf(rVar.mo118949U()));
    }

    @C12579k
    /* renamed from: d */
    public static final String m153962d(@C12579k C38120r rVar) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Iterator it = rVar.mo118946R().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((InvoicesInfoDomain) obj).mo115850e(), (Object) f94245a)) {
                break;
            }
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StringKt.m118911T("https://www.carrefour.fr/mon-compte/mes-achats/en-ligne/", "details-commande", C28554j1.f69444k);
        }
        return "";
    }

    @C12579k
    /* renamed from: e */
    public static final String m153963e(@C12579k C38120r rVar) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Iterator it = rVar.mo118946R().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((InvoicesInfoDomain) obj).mo115850e(), (Object) f94246b)) {
                break;
            }
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StringKt.m118911T("https://www.carrefour.fr/mon-compte/mes-achats/en-ligne/", "details-commande", C28554j1.f69444k);
        }
        return "";
    }

    @C12579k
    /* renamed from: f */
    public static final InfoProductsReplacementType m153964f(@C12579k C38120r rVar) {
        InfoProductsReplacementType f;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (!C37510k.m153980h(rVar.mo118954Z())) {
            C38120r H = rVar.mo118936H();
            if (H == null || (f = m153964f(H)) == null) {
                return InfoProductsReplacementType.Unknown;
            }
            return f;
        } else if (C36306e.m148954f(rVar.mo118956a0())) {
            return InfoProductsReplacementType.PreparedReplacement;
        } else {
            if (C36306e.m148953e(rVar.mo118956a0()) && (Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Clcv.f70280e) || (Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Drive.f70282e) && DateTime.m51195N2(rVar.mo118950V()).mo27726S2(30).mo28754o0()))) {
                return InfoProductsReplacementType.BilledReplacement;
            }
            if (!C36306e.m148953e(rVar.mo118956a0()) || !Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Drive.f70282e) || DateTime.m51195N2(rVar.mo118950V()).mo27726S2(30).mo28754o0()) {
                return InfoProductsReplacementType.Unknown;
            }
            return InfoProductsReplacementType.BilledReplacementOutDated;
        }
    }

    @C12579k
    /* renamed from: g */
    public static final String m153965g(@C12579k C38120r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String j = rVar.mo118942N().mo118926j();
        String l = rVar.mo118942N().mo118928l();
        String obj = StringsKt__StringsKt.trim(j + " " + l).toString();
        String k = rVar.mo118942N().mo118927k();
        String obj2 = StringsKt__StringsKt.trim(obj + " " + k).toString();
        String i = rVar.mo118942N().mo118925i();
        String h = rVar.mo118942N().mo118923h();
        String obj3 = StringsKt__StringsKt.trim(i + " " + h).toString();
        return obj2 + "\n" + obj3;
    }

    @C12579k
    /* renamed from: h */
    public static final String m153966h(@C12579k C38120r rVar, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "downloadBillButtonName");
        return StringKt.m118911T(C36178i.f89315j, str, str2);
    }

    @C12579k
    /* renamed from: i */
    public static final String m153967i(@C12579k C38120r rVar, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "buttonName");
        String W = rVar.mo118951W();
        return StringKt.m118911T("https://www.carrefour.fr/mon-compte/mes-achats/en-ligne/" + W, str, str2);
    }

    @C12579k
    /* renamed from: j */
    public static final Pair<Integer, Integer> m153968j(@C12579k C38120r rVar) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        OrderType b0 = rVar.mo118958b0();
        int i2 = 2;
        int i3 = 1;
        if (b0 instanceof OrderType.C28690b) {
            i = 1;
        } else {
            if (b0 instanceof OrderType.Lad) {
                z4 = true;
            } else {
                z4 = Intrinsics.areEqual((Object) b0, (Object) OrderType.Clcv.f70280e);
            }
            if (z4) {
                z5 = true;
            } else {
                z5 = Intrinsics.areEqual((Object) b0, (Object) OrderType.H1h3.f70286e);
            }
            if (z5) {
                i = 2;
            } else {
                i = -1;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        OrderStatus a0 = rVar.mo118956a0();
        if (Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Validated.f89268e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Affected.f89246e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z2) {
            i2 = 0;
        } else {
            if (Intrinsics.areEqual((Object) a0, (Object) OrderStatus.PreparationInProgress.f89258e)) {
                z3 = true;
            } else {
                z3 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Prepared.f89260e);
            }
            if (!z3) {
                if (!Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Shipped.f89264e)) {
                    i3 = 3;
                    if (!Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Arrived.f89248e) && (!Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Delivered.f89256e) || !Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Lad.f70288e))) {
                        i2 = -1;
                    }
                }
            }
            i2 = i3;
        }
        return new Pair<>(valueOf, Integer.valueOf(i2));
    }

    @C12579k
    /* renamed from: k */
    public static final String m153969k(@C12579k C38120r rVar, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "askRefundButtonName");
        String W = rVar.mo118951W();
        return StringKt.m118911T(C36178i.f89317l + W, str, str2);
    }

    /* renamed from: l */
    public static final boolean m153970l(@C12579k C38120r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (!C37510k.m153978f(rVar.mo118954Z()) || !C36306e.m148952d(rVar.mo118956a0()) || (!Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Clcv.f70280e) && (!Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Drive.f70282e) || !DateTime.m51195N2(rVar.mo118950V()).mo27726S2(30).mo28754o0()))) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m153971m(@C12579k C38120r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (Intrinsics.areEqual((Object) rVar.mo118956a0(), (Object) OrderStatus.Cancelled.f89252e) || Intrinsics.areEqual((Object) rVar.mo118956a0(), (Object) OrderStatus.Unknown.f89266e)) {
            return false;
        }
        if (Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Clcv.f70280e)) {
            if (!C36306e.m148953e(rVar.mo118956a0())) {
                return false;
            }
            if (!C37510k.m153980h(rVar.mo118954Z()) && !C37510k.m153978f(rVar.mo118954Z())) {
                return false;
            }
        } else if (!Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Drive.f70282e) || !C36306e.m148953e(rVar.mo118956a0())) {
            return false;
        } else {
            if ((!C37510k.m153980h(rVar.mo118954Z()) && !C37510k.m153978f(rVar.mo118954Z())) || !DateTime.m51195N2(rVar.mo118950V()).mo27726S2(30).mo28754o0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m153972n(@C12579k C38120r rVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        OrderStatus a0 = rVar.mo118956a0();
        if (Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Validated.f89268e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Affected.f89246e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.PreparationInProgress.f89258e);
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Prepared.f89260e);
        }
        if (z4) {
            z5 = true;
        } else {
            z5 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Arrived.f89248e);
        }
        if (z5) {
            z6 = true;
        } else {
            z6 = Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Shipped.f89264e);
        }
        if (z6) {
            return true;
        }
        if (Intrinsics.areEqual((Object) a0, (Object) OrderStatus.Delivered.f89256e)) {
            return Intrinsics.areEqual((Object) rVar.mo118958b0(), (Object) OrderType.Lad.f70288e);
        }
        return false;
    }
}
