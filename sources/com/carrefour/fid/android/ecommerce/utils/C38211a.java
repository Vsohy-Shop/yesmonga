package com.carrefour.fid.android.ecommerce.utils;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.google.firebase.installations.local.C33093b;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketUtils.kt\ncom/carrefour/fid/android/ecommerce/utils/BasketUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1774#2,4:53\n1#3:57\n*S KotlinDebug\n*F\n+ 1 BasketUtils.kt\ncom/carrefour/fid/android/ecommerce/utils/BasketUtils\n*L\n33#1:53,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.ecommerce.utils.a */
public final class C38211a {
    @C12579k

    /* renamed from: a */
    public static final C38211a f96779a = new C38211a();

    /* renamed from: b */
    public static final int f96780b = 0;

    @C12579k
    /* renamed from: a */
    public final String mo119636a(@C12580l OfferPriceDomain offerPriceDomain) {
        String str;
        if (offerPriceDomain == null) {
            str = null;
        } else if (offerPriceDomain.mo116006k() == null || Intrinsics.areEqual(offerPriceDomain.mo116006k(), 0.0d)) {
            str = String.valueOf(offerPriceDomain.mo116007l());
        } else {
            str = offerPriceDomain.mo116006k().toString();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @C12579k
    /* renamed from: b */
    public final HashMap<String, String> mo119637b(@C12579k List<? extends OfferProductModel> list) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "offers");
        int size = list.size();
        Iterable<OfferProductModel> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            i = 0;
            for (OfferProductModel g : iterable) {
                if (g.mo121509g() == OfferAvailability.AVAILABLE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.m40458V();
                }
            }
        } else {
            i = 0;
        }
        return C10977s0.m41446M(C11078d1.m42659a("checkout_step", "1"), C11078d1.m42659a("list_name_product", "basket"), C11078d1.m42659a("list_size_product", String.valueOf(size)), C11078d1.m42659a("list_size_productDispo", String.valueOf(i)), C11078d1.m42659a("list_size_productIndispo", String.valueOf(size - i)));
    }

    @C12579k
    /* renamed from: c */
    public final String mo119638c(@C12580l String str, @C12579k String str2, @C12580l OfferPriceDomain offerPriceDomain) {
        boolean z;
        String str3;
        Intrinsics.checkNotNullParameter(str2, "discountType");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && C11622t.equals(OfferDiscountType.PF.mo118123y(), str2, true)) {
            return C33093b.f80279g;
        }
        if (offerPriceDomain != null) {
            str3 = f96779a.mo119636a(offerPriceDomain);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
