package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.appsflyer.AFInAppEventParameterName;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.core.type.OrderServiceType;
import com.carrefour.fid.android.domain.models.BasketOffer;
import com.carrefour.fid.android.domain.models.DiscountDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.domain.models.OrderOffer;
import com.carrefour.fid.android.domain.models.OrderOfferModel;
import com.carrefour.fid.android.domain.models.OrderProductModel;
import com.carrefour.fid.android.domain.models.TrackingData;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.ecommerce.utils.C38217g;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28586r;
import com.carrefour.fid.android.shared.constant.C28590s;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrderConfirmationModelMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderConfirmationModelMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OrderConfirmationModelMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1549#2:221\n1620#2,3:222\n1549#2:225\n1620#2,3:226\n1549#2:230\n1620#2,3:231\n1549#2:234\n1620#2,3:235\n1549#2:238\n1620#2,3:239\n1549#2:242\n1620#2,3:243\n1864#2,3:246\n1#3:229\n*S KotlinDebug\n*F\n+ 1 OrderConfirmationModelMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OrderConfirmationModelMapper\n*L\n51#1:221\n51#1:222,3\n52#1:225\n52#1:226,3\n68#1:230\n68#1:231,3\n69#1:234\n69#1:235,3\n70#1:238\n70#1:239,3\n71#1:242\n71#1:243,3\n170#1:246,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.w0 */
public final class C36540w0 extends C28486g<OrderConfirmationDomain, OrderConfirmationModel> {

    /* renamed from: b */
    public static final int f90241b = 0;

    /* renamed from: d */
    public final Map<String, String> mo111357d(OrderConfirmationDomain orderConfirmationDomain) {
        HashMap M = C10977s0.m41446M(C11078d1.m42659a(C13758b.f33485z0, orderConfirmationDomain.mo116123f()));
        Double i = orderConfirmationDomain.mo116126i();
        if (i != null) {
            M.put(C13758b.f33427T, String.valueOf(i.doubleValue()));
        }
        String H = C28932h.f70914a.mo84217H(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        if (orderConfirmationDomain.mo116136s() == OrderServiceType.DELIVERY) {
            M.put(C13758b.f33454k, "Oui");
            M.put(C13758b.f33456l, "");
            M.put(C13758b.f33433Z, H);
        } else {
            M.put(C13758b.f33454k, "");
            M.put(C13758b.f33456l, "Oui");
            M.put(C13758b.f33435a0, H);
        }
        return M;
    }

    /* renamed from: e */
    public final Map<String, String> mo111358e(OrderConfirmationDomain orderConfirmationDomain) {
        List list;
        List list2;
        List list3;
        List list4;
        Iterable c = orderConfirmationDomain.mo116119c();
        if (c != null) {
            Iterable<OrderOffer> iterable = c;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (OrderOffer b : iterable) {
                list.add(b.mo116187b());
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Iterable c2 = orderConfirmationDomain.mo116119c();
        if (c2 != null) {
            Iterable<OrderOffer> iterable2 = c2;
            list2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (OrderOffer f : iterable2) {
                list2.add(f.mo116192f());
            }
        } else {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        Iterable c3 = orderConfirmationDomain.mo116119c();
        if (c3 != null) {
            Iterable<OrderOffer> iterable3 = c3;
            list3 = new ArrayList(C10978t.m41495Y(iterable3, 10));
            for (OrderOffer e : iterable3) {
                list3.add(Double.valueOf(e.mo116191e()));
            }
        } else {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        }
        Iterable c4 = orderConfirmationDomain.mo116119c();
        if (c4 != null) {
            Iterable<OrderOffer> iterable4 = c4;
            list4 = new ArrayList(C10978t.m41495Y(iterable4, 10));
            for (OrderOffer orderOffer : iterable4) {
                String b2 = orderOffer.mo116187b();
                Integer f2 = orderOffer.mo116192f();
                String d = orderOffer.mo116189d();
                list4.add(C10977s0.m41456W(C11078d1.m42659a("\"content_id\"", "\"" + b2 + "\""), C11078d1.m42659a("\"quantity\"", "\"" + f2 + "\""), C11078d1.m42659a("\"brand\"", "\"" + d + "\"")));
            }
        } else {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        }
        return C10977s0.m41446M(C11078d1.m42659a("af_revenue", String.valueOf(orderConfirmationDomain.mo116126i())), C11078d1.m42659a(AFInAppEventParameterName.RECEIPT_ID, orderConfirmationDomain.mo116123f()), C11078d1.m42659a("af_order_id", orderConfirmationDomain.mo116123f()), C11078d1.m42659a(C13814a.f33687J0, orderConfirmationDomain.mo116136s().mo108570q()), C11078d1.m42659a("af_content_id", String.valueOf(list)), C11078d1.m42659a("af_quantity", String.valueOf(list2)), C11078d1.m42659a("af_price", String.valueOf(list3)), C11078d1.m42659a("af_content_type", "product"), C11078d1.m42659a("af_currency", "EUR"), C11078d1.m42659a("af_content", String.valueOf(list4)));
    }

    /* renamed from: f */
    public final Map<String, String> mo111359f(OrderConfirmationDomain orderConfirmationDomain) {
        double d;
        String str;
        String str2;
        String str3;
        String str4;
        Double i = orderConfirmationDomain.mo116126i();
        if (i != null) {
            d = i.doubleValue();
        } else {
            d = 0.0d;
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C11078d1.m42659a(C28586r.f69770h, String.valueOf(d));
        Double l = orderConfirmationDomain.mo116129l();
        if (l == null || (str = String.valueOf(d - l.doubleValue())) == null) {
            str = String.valueOf(d);
        }
        pairArr[1] = C11078d1.m42659a(C28586r.f69768f, str);
        pairArr[2] = C11078d1.m42659a(C28586r.f69764b, orderConfirmationDomain.mo116124g());
        pairArr[3] = C11078d1.m42659a(C28586r.f69766d, String.valueOf(orderConfirmationDomain.mo116120d()));
        Double l2 = orderConfirmationDomain.mo116129l();
        if (l2 == null || (str2 = l2.toString()) == null) {
            str2 = new String();
        }
        pairArr[4] = C11078d1.m42659a(C28586r.f69769g, str2);
        pairArr[5] = C11078d1.m42659a(C28586r.f69771i, C28782t.m119104a(orderConfirmationDomain.mo116129l()));
        if (orderConfirmationDomain.mo116113A()) {
            str3 = C28590s.f69805F;
        } else if (orderConfirmationDomain.mo116136s() == OrderServiceType.DELIVERY || orderConfirmationDomain.mo116117a().mo116102h() == BasketType.BASKET_V4_HOME_DELIVERY_NAL) {
            str3 = "HOME_DELIVERY";
        } else {
            str3 = "PICKING_DRIVE";
        }
        pairArr[6] = C11078d1.m42659a(C28586r.f69773k, str3);
        String o = orderConfirmationDomain.mo116132o();
        if (o != null) {
            str4 = o.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[7] = C11078d1.m42659a(C28586r.f69772j, str4);
        HashMap M = C10977s0.m41446M(pairArr);
        List<OrderOffer> c = orderConfirmationDomain.mo116119c();
        if (c != null) {
            M.put(C28586r.f69765c, String.valueOf(c.size()));
        }
        Double k = orderConfirmationDomain.mo116128k();
        if (k != null) {
            M.put(C28586r.f69767e, String.valueOf(k.doubleValue()));
        }
        String x = orderConfirmationDomain.mo116142x();
        if (x != null) {
            M.put(C28586r.f69774l, x);
        }
        String h = orderConfirmationDomain.mo116125h();
        if (h != null) {
            M.put(C28586r.f69775m, h);
        }
        Double j = orderConfirmationDomain.mo116127j();
        if (j != null) {
            M.put(C28586r.f69776n, C28782t.m119104a(Double.valueOf(j.doubleValue())));
        }
        Double m = orderConfirmationDomain.mo116130m();
        if (m != null) {
            M.put(C28586r.f69777o, String.valueOf(m.doubleValue()));
        }
        return M;
    }

    /* renamed from: g */
    public final String mo111360g(Double d, Double d2) {
        boolean z;
        if (d != null) {
            z = Double.isNaN(d.doubleValue());
        } else {
            z = true;
        }
        if (!z || Intrinsics.areEqual(d, 0.0d)) {
            return String.valueOf(d2);
        }
        return String.valueOf(d);
    }

    /* renamed from: h */
    public final String mo111361h(List<BasketOffer> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BasketOffer basketOffer = (BasketOffer) next;
                String c = basketOffer.mo115527c();
                Integer e = basketOffer.mo115530e();
                String i3 = mo111362i(basketOffer);
                sb.append("pr" + i2 + "id=" + c + "&pr" + i2 + "pr=" + i3 + "&pr" + i2 + "qt=" + e + "&");
                i = i2;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "orderItemsTagBuilder.toString()");
        return StringsKt__StringsKt.removeSuffix(sb2, (CharSequence) "&");
    }

    /* renamed from: i */
    public final String mo111362i(BasketOffer basketOffer) {
        return mo111363j(basketOffer.mo115526b(), basketOffer.mo115532g(), basketOffer.mo115533h());
    }

    /* renamed from: j */
    public final String mo111363j(DiscountDomain discountDomain, Double d, Double d2) {
        boolean z;
        if (discountDomain == null) {
            boolean z2 = true;
            if (d != null) {
                z = Double.isNaN(d.doubleValue());
            } else {
                z = true;
            }
            if (d != null) {
                z2 = Double.isNaN(d.doubleValue());
            }
            if (z || z2) {
                return mo111360g(d, d2);
            }
            return new String();
        } else if (Intrinsics.areEqual((Object) discountDomain.mo115789a(), (Object) C38217g.f96838b)) {
            return String.valueOf(discountDomain.mo115790b());
        } else {
            return new String();
        }
    }

    /* renamed from: k */
    public final OrderOfferModel mo111364k(BasketOffer basketOffer) {
        return new OrderOfferModel(basketOffer.mo115527c(), basketOffer.mo115530e(), basketOffer.mo115534i());
    }

    /* renamed from: l */
    public final OrderProductModel mo111365l(OrderOffer orderOffer) {
        return new OrderProductModel(orderOffer.mo116189d(), orderOffer.mo116187b(), orderOffer.mo116192f(), orderOffer.mo116193g(), orderOffer.mo116194h());
    }

    @C12579k
    /* renamed from: m */
    public OrderConfirmationModel mo72340a(@C12579k OrderConfirmationDomain orderConfirmationDomain) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str4;
        Intrinsics.checkNotNullParameter(orderConfirmationDomain, "entity");
        String f = orderConfirmationDomain.mo116123f();
        String g = orderConfirmationDomain.mo116124g();
        Double y = orderConfirmationDomain.mo116143y();
        Double z = orderConfirmationDomain.mo116144z();
        String q = orderConfirmationDomain.mo116134q();
        Double r = orderConfirmationDomain.mo116135r();
        Double n = orderConfirmationDomain.mo116131n();
        String w = orderConfirmationDomain.mo116140w();
        String v = orderConfirmationDomain.mo116139v();
        String o = orderConfirmationDomain.mo116132o();
        Date u = orderConfirmationDomain.mo116138u();
        if (u != null) {
            str = DateExtensionsKt.m118763i(u);
        } else {
            str = null;
        }
        Date t = orderConfirmationDomain.mo116137t();
        if (t != null) {
            str2 = DateExtensionsKt.m118763i(t);
        } else {
            str2 = null;
        }
        Address b = orderConfirmationDomain.mo116118b();
        String p = orderConfirmationDomain.mo116133p();
        List<BasketOffer> a = orderConfirmationDomain.mo116117a().mo116094a();
        if (a != null) {
            Iterable<BasketOffer> iterable = a;
            str3 = str2;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BasketOffer k : iterable) {
                arrayList.add(mo111364k(k));
            }
        } else {
            str3 = str2;
            arrayList = null;
        }
        List<OrderOffer> c = orderConfirmationDomain.mo116119c();
        if (c != null) {
            Iterable<OrderOffer> iterable2 = c;
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (OrderOffer l : iterable2) {
                arrayList3.add(mo111365l(l));
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        Double m = orderConfirmationDomain.mo116117a().mo116107m();
        String q2 = orderConfirmationDomain.mo116136s().mo108570q();
        Map<String, String> d = mo111357d(orderConfirmationDomain);
        Map<String, String> f2 = mo111359f(orderConfirmationDomain);
        Map<String, String> e = mo111358e(orderConfirmationDomain);
        Integer e2 = orderConfirmationDomain.mo116122e();
        if (e2 != null) {
            e2.intValue();
            str4 = orderConfirmationDomain.mo116122e().toString();
        } else {
            str4 = null;
        }
        TrackingData trackingData = r22;
        TrackingData trackingData2 = new TrackingData(q2, d, f2, e, str4);
        return new OrderConfirmationModel(f, g, y, z, q, r, n, w, v, o, str, str3, b, p, arrayList, arrayList2, m, trackingData, orderConfirmationDomain.mo116114B(), orderConfirmationDomain.mo116113A());
    }
}
