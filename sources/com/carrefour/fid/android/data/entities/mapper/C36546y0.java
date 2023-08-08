package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.data.entities.InitPaymentResponse;
import com.carrefour.fid.android.data.entities.RemainingAmountToPay;
import com.carrefour.fid.android.domain.models.BasketAmounts;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOffer;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.BasketOfferPriceDomain;
import com.carrefour.fid.android.domain.models.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.BasketServiceType;
import com.carrefour.fid.android.domain.models.BasketSlot;
import com.carrefour.fid.android.domain.models.DiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OrderBasketDomain;
import com.carrefour.fid.android.domain.models.OrderDomain;
import com.carrefour.fid.android.domain.models.PaymentMethodDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrderV3DomainMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderV3DomainMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OrderV3DomainMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1549#2:64\n1620#2,3:65\n*S KotlinDebug\n*F\n+ 1 OrderV3DomainMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OrderV3DomainMapper\n*L\n31#1:64\n31#1:65,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.y0 */
public final class C36546y0 extends C28486g<C36547a, OrderDomain> {

    /* renamed from: b */
    public static final int f90259b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.y0$a */
    public static final class C36547a {

        /* renamed from: d */
        public static final int f90260d = 8;
        @C12580l

        /* renamed from: a */
        public final InitPaymentResponse f90261a;
        @C12580l

        /* renamed from: b */
        public final BasketDomain f90262b;
        @C12580l

        /* renamed from: c */
        public final String f90263c;

        public C36547a(@C12580l InitPaymentResponse initPaymentResponse, @C12580l BasketDomain basketDomain, @C12580l String str) {
            this.f90261a = initPaymentResponse;
            this.f90262b = basketDomain;
            this.f90263c = str;
        }

        /* renamed from: e */
        public static /* synthetic */ C36547a m149833e(C36547a aVar, InitPaymentResponse initPaymentResponse, BasketDomain basketDomain, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                initPaymentResponse = aVar.f90261a;
            }
            if ((i & 2) != 0) {
                basketDomain = aVar.f90262b;
            }
            if ((i & 4) != 0) {
                str = aVar.f90263c;
            }
            return aVar.mo111388d(initPaymentResponse, basketDomain, str);
        }

        @C12580l
        /* renamed from: a */
        public final InitPaymentResponse mo111385a() {
            return this.f90261a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketDomain mo111386b() {
            return this.f90262b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo111387c() {
            return this.f90263c;
        }

        @C12579k
        /* renamed from: d */
        public final C36547a mo111388d(@C12580l InitPaymentResponse initPaymentResponse, @C12580l BasketDomain basketDomain, @C12580l String str) {
            return new C36547a(initPaymentResponse, basketDomain, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36547a)) {
                return false;
            }
            C36547a aVar = (C36547a) obj;
            return Intrinsics.areEqual((Object) this.f90261a, (Object) aVar.f90261a) && Intrinsics.areEqual((Object) this.f90262b, (Object) aVar.f90262b) && Intrinsics.areEqual((Object) this.f90263c, (Object) aVar.f90263c);
        }

        @C12580l
        /* renamed from: f */
        public final BasketDomain mo111390f() {
            return this.f90262b;
        }

        @C12580l
        /* renamed from: g */
        public final InitPaymentResponse mo111391g() {
            return this.f90261a;
        }

        @C12580l
        /* renamed from: h */
        public final String mo111392h() {
            return this.f90263c;
        }

        public int hashCode() {
            InitPaymentResponse initPaymentResponse = this.f90261a;
            int i = 0;
            int hashCode = (initPaymentResponse == null ? 0 : initPaymentResponse.hashCode()) * 31;
            BasketDomain basketDomain = this.f90262b;
            int hashCode2 = (hashCode + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
            String str = this.f90263c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            InitPaymentResponse initPaymentResponse = this.f90261a;
            BasketDomain basketDomain = this.f90262b;
            String str = this.f90263c;
            return "Params(order=" + initPaymentResponse + ", basket=" + basketDomain + ", storeName=" + str + ")";
        }
    }

    @C12579k
    /* renamed from: d */
    public OrderDomain mo72340a(@C12579k C36547a aVar) {
        String str;
        String str2;
        RemainingAmountToPay remainingAmountToPay;
        String str3;
        Double d;
        Double d2;
        String str4;
        BasketType basketType;
        ArrayList arrayList;
        double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        String str5;
        String str6;
        Double d8;
        BasketAmounts v;
        BasketPromotionCode E;
        BasketSlot J;
        BasketAmounts v2;
        BasketAmounts v3;
        BasketAmounts v4;
        BasketAmounts v5;
        List<BasketOfferDomain> B;
        String str7;
        Double d9;
        String str8;
        Double d10;
        Double d11;
        String str9;
        Double d12;
        Double d13;
        OfferDiscountType z;
        BasketServiceType I;
        BasketService d14;
        BasketAmounts v6;
        BasketAmounts v7;
        Intrinsics.checkNotNullParameter(aVar, "entity");
        InitPaymentResponse g = aVar.mo111391g();
        if (g != null) {
            str = g.getPsp();
        } else {
            str = null;
        }
        InitPaymentResponse g2 = aVar.mo111391g();
        if (g2 != null) {
            str2 = g2.getPspToken();
        } else {
            str2 = null;
        }
        InitPaymentResponse g3 = aVar.mo111391g();
        if (g3 != null) {
            remainingAmountToPay = g3.getRemainingAmountToPay();
        } else {
            remainingAmountToPay = null;
        }
        PaymentMethodDomain paymentMethodDomain = new PaymentMethodDomain(str, (List<String>) null, (String) null, str2, remainingAmountToPay);
        InitPaymentResponse g4 = aVar.mo111391g();
        if (g4 == null || (str3 = g4.getOneOrderId()) == null) {
            str3 = new String();
        }
        String h = aVar.mo111392h();
        BasketDomain f = aVar.mo111390f();
        if (f == null || (v7 = f.mo115498v()) == null) {
            d = null;
        } else {
            d = Double.valueOf(v7.mo115452y());
        }
        BasketDomain f2 = aVar.mo111390f();
        if (f2 == null || (v6 = f2.mo115498v()) == null) {
            d2 = null;
        } else {
            d2 = Double.valueOf(v6.mo115449w());
        }
        BasketDomain f3 = aVar.mo111390f();
        if (f3 == null || (I = f3.mo115466I()) == null || (d14 = I.mo115633d()) == null) {
            str4 = null;
        } else {
            str4 = d14.mo108474q();
        }
        BasketDomain f4 = aVar.mo111390f();
        if (f4 != null) {
            basketType = f4.mo115499w();
        } else {
            basketType = null;
        }
        BasketDomain f5 = aVar.mo111390f();
        if (f5 == null || (B = f5.mo115459B()) == null) {
            arrayList = null;
        } else {
            Iterable<BasketOfferDomain> iterable = B;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BasketOfferDomain basketOfferDomain : iterable) {
                ProductDomain A = basketOfferDomain.mo115540A();
                if (A != null) {
                    str7 = A.mo116552y();
                } else {
                    str7 = null;
                }
                Integer valueOf = Integer.valueOf(basketOfferDomain.mo115541B());
                Integer t = basketOfferDomain.mo115568t();
                if (t != null) {
                    d9 = Double.valueOf((double) t.intValue());
                } else {
                    d9 = null;
                }
                ProductDomain A2 = basketOfferDomain.mo115540A();
                if (A2 != null) {
                    str8 = A2.mo116544s();
                } else {
                    str8 = null;
                }
                BasketOfferPriceDomain y = basketOfferDomain.mo115575y();
                if (y != null) {
                    d10 = y.mo115608l();
                } else {
                    d10 = null;
                }
                BasketOfferPriceDomain y2 = basketOfferDomain.mo115575y();
                if (y2 != null) {
                    d11 = y2.mo115609m();
                } else {
                    d11 = null;
                }
                OfferDiscountDomain q = basketOfferDomain.mo115565q();
                if (q == null || (z = q.mo115961z()) == null) {
                    str9 = null;
                } else {
                    str9 = z.mo118123y();
                }
                OfferDiscountDomain q2 = basketOfferDomain.mo115565q();
                if (q2 != null) {
                    d12 = q2.mo115952s();
                } else {
                    d12 = null;
                }
                DiscountDomain discountDomain = new DiscountDomain(str9, d12);
                BasketOfferPriceDomain y3 = basketOfferDomain.mo115575y();
                if (y3 != null) {
                    d13 = y3.mo115610n();
                } else {
                    d13 = null;
                }
                arrayList2.add(new BasketOffer(str7, "", valueOf, d9, str8, d10, d11, discountDomain, d13));
            }
            arrayList = arrayList2;
        }
        BasketDomain f6 = aVar.mo111390f();
        if (f6 != null) {
            d3 = (double) f6.mo115461D();
        } else {
            d3 = 0.0d;
        }
        double d15 = d3;
        BasketDomain f7 = aVar.mo111390f();
        if (f7 == null || (v5 = f7.mo115498v()) == null) {
            d4 = null;
        } else {
            d4 = Double.valueOf(v5.mo115445t());
        }
        BasketDomain f8 = aVar.mo111390f();
        if (f8 == null || (v4 = f8.mo115498v()) == null) {
            d5 = null;
        } else {
            d5 = Double.valueOf(v4.mo115444s());
        }
        BasketDomain f9 = aVar.mo111390f();
        if (f9 == null || (v3 = f9.mo115498v()) == null) {
            d6 = null;
        } else {
            d6 = Double.valueOf(v3.mo115442q());
        }
        BasketDomain f10 = aVar.mo111390f();
        if (f10 == null || (v2 = f10.mo115498v()) == null) {
            d7 = null;
        } else {
            d7 = Double.valueOf(v2.mo115453z());
        }
        BasketDomain f11 = aVar.mo111390f();
        if (f11 == null || (J = f11.mo115467J()) == null) {
            str5 = null;
        } else {
            str5 = J.mo115651h();
        }
        BasketDomain f12 = aVar.mo111390f();
        if (f12 == null || (E = f12.mo115462E()) == null) {
            str6 = null;
        } else {
            str6 = E.mo115623f();
        }
        BasketDomain f13 = aVar.mo111390f();
        if (f13 == null || (v = f13.mo115498v()) == null) {
            d8 = null;
        } else {
            d8 = Double.valueOf(v.mo115443r());
        }
        return new OrderDomain(str3, paymentMethodDomain, h, new OrderBasketDomain(d, d2, str4, basketType, arrayList, d15, d4, d5, d6, d7, str5, str6, d8), (String) null);
    }
}
