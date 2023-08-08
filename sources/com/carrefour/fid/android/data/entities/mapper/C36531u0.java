package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.core.type.OrderServiceType;
import com.carrefour.fid.android.data.entities.C36419b;
import com.carrefour.fid.android.data.entities.OrderV3;
import com.carrefour.fid.android.data.entities.OrderV3Address;
import com.carrefour.fid.android.data.entities.OrderV3Amounts;
import com.carrefour.fid.android.data.entities.OrderV3DeliveryOption;
import com.carrefour.fid.android.data.entities.OrderV3Offer;
import com.carrefour.fid.android.data.entities.OrderV3OfferPrices;
import com.carrefour.fid.android.data.entities.OrderV3PaymentInfo;
import com.carrefour.fid.android.data.entities.OrderV3Promotion;
import com.carrefour.fid.android.data.entities.OrderV3ShippingDetails;
import com.carrefour.fid.android.data.entities.OrderV3ShippingType;
import com.carrefour.fid.android.data.entities.OrderV3SlotInfo;
import com.carrefour.fid.android.data.entities.OrderV3SubOrder;
import com.carrefour.fid.android.domain.models.AddressCategory;
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
import com.carrefour.fid.android.domain.models.OrderConfirmationDomain;
import com.carrefour.fid.android.domain.models.OrderOffer;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrderConfirmationCheckoutV3Mapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderConfirmationCheckoutV3Mapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OrderConfirmationCheckoutV3Mapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1549#2:129\n1620#2,3:130\n1549#2:133\n1620#2,3:134\n*S KotlinDebug\n*F\n+ 1 OrderConfirmationCheckoutV3Mapper.kt\ncom/carrefour/fid/android/data/entities/mapper/OrderConfirmationCheckoutV3Mapper\n*L\n47#1:129\n47#1:130,3\n68#1:133\n68#1:134,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.u0 */
public final class C36531u0 extends C28486g<C36532a, OrderConfirmationDomain> {

    /* renamed from: b */
    public static final int f90225b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.u0$a */
    public static final class C36532a {

        /* renamed from: d */
        public static final int f90226d = 8;
        @C12579k

        /* renamed from: a */
        public final OrderV3 f90227a;
        @C12580l

        /* renamed from: b */
        public final BasketDomain f90228b;
        @C12580l

        /* renamed from: c */
        public final StoreService f90229c;

        public C36532a(@C12579k OrderV3 orderV3, @C12580l BasketDomain basketDomain, @C12580l StoreService storeService) {
            Intrinsics.checkNotNullParameter(orderV3, "orderV3");
            this.f90227a = orderV3;
            this.f90228b = basketDomain;
            this.f90229c = storeService;
        }

        /* renamed from: e */
        public static /* synthetic */ C36532a m149768e(C36532a aVar, OrderV3 orderV3, BasketDomain basketDomain, StoreService storeService, int i, Object obj) {
            if ((i & 1) != 0) {
                orderV3 = aVar.f90227a;
            }
            if ((i & 2) != 0) {
                basketDomain = aVar.f90228b;
            }
            if ((i & 4) != 0) {
                storeService = aVar.f90229c;
            }
            return aVar.mo111333d(orderV3, basketDomain, storeService);
        }

        @C12579k
        /* renamed from: a */
        public final OrderV3 mo111330a() {
            return this.f90227a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketDomain mo111331b() {
            return this.f90228b;
        }

        @C12580l
        /* renamed from: c */
        public final StoreService mo111332c() {
            return this.f90229c;
        }

        @C12579k
        /* renamed from: d */
        public final C36532a mo111333d(@C12579k OrderV3 orderV3, @C12580l BasketDomain basketDomain, @C12580l StoreService storeService) {
            Intrinsics.checkNotNullParameter(orderV3, "orderV3");
            return new C36532a(orderV3, basketDomain, storeService);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36532a)) {
                return false;
            }
            C36532a aVar = (C36532a) obj;
            return Intrinsics.areEqual((Object) this.f90227a, (Object) aVar.f90227a) && Intrinsics.areEqual((Object) this.f90228b, (Object) aVar.f90228b) && Intrinsics.areEqual((Object) this.f90229c, (Object) aVar.f90229c);
        }

        @C12580l
        /* renamed from: f */
        public final BasketDomain mo111335f() {
            return this.f90228b;
        }

        @C12579k
        /* renamed from: g */
        public final OrderV3 mo111336g() {
            return this.f90227a;
        }

        @C12580l
        /* renamed from: h */
        public final StoreService mo111337h() {
            return this.f90229c;
        }

        public int hashCode() {
            int hashCode = this.f90227a.hashCode() * 31;
            BasketDomain basketDomain = this.f90228b;
            int i = 0;
            int hashCode2 = (hashCode + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
            StoreService storeService = this.f90229c;
            if (storeService != null) {
                i = storeService.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            OrderV3 orderV3 = this.f90227a;
            BasketDomain basketDomain = this.f90228b;
            StoreService storeService = this.f90229c;
            return "Params(orderV3=" + orderV3 + ", basket=" + basketDomain + ", storeService=" + storeService + ")";
        }
    }

    /* renamed from: d */
    public final Double mo111327d(OrderV3PaymentInfo orderV3PaymentInfo) {
        if (Intrinsics.areEqual((Object) orderV3PaymentInfo.getPaymentChoice(), (Object) C36178i.f89320o)) {
            return Double.valueOf(orderV3PaymentInfo.getPaymentAmount().getScaledAmount());
        }
        return null;
    }

    /* renamed from: e */
    public final Address mo111328e(OrderV3Address orderV3Address) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        String str9;
        String country = orderV3Address.getCountry();
        if (country == null) {
            str = "";
        } else {
            str = country;
        }
        String streetAddressOne = orderV3Address.getStreetAddressOne();
        if (streetAddressOne == null) {
            str2 = "";
        } else {
            str2 = streetAddressOne;
        }
        String streetAddressTwo = orderV3Address.getStreetAddressTwo();
        if (streetAddressTwo == null) {
            str3 = "";
        } else {
            str3 = streetAddressTwo;
        }
        String streetAddressThree = orderV3Address.getStreetAddressThree();
        if (streetAddressThree == null) {
            str4 = "";
        } else {
            str4 = streetAddressThree;
        }
        String city = orderV3Address.getCity();
        if (city == null) {
            str5 = "";
        } else {
            str5 = city;
        }
        String cityCode = orderV3Address.getCityCode();
        if (cityCode == null) {
            str6 = "";
        } else {
            str6 = cityCode;
        }
        Boolean elevator = orderV3Address.getElevator();
        if (elevator != null) {
            z = elevator.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = z;
        AddressCategory addressCategory = AddressCategory.DELIVERY;
        String buildingName = orderV3Address.getBuildingName();
        if (buildingName == null) {
            str7 = "";
        } else {
            str7 = buildingName;
        }
        String digicode = orderV3Address.getDigicode();
        if (digicode == null) {
            str8 = "";
        } else {
            str8 = digicode;
        }
        String interphone = orderV3Address.getInterphone();
        if (interphone == null) {
            str9 = "";
        } else {
            str9 = interphone;
        }
        return new Address(str, str4, str3, str5, str2, str6, str8, str9, z2, str7, orderV3Address.getFloor(), "", "", addressCategory, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 786432, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: f */
    public OrderConfirmationDomain mo72340a(@C12579k C36532a aVar) {
        String str;
        String str2;
        Address address;
        String str3;
        OrderServiceType orderServiceType;
        String str4;
        String str5;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        String str6;
        Double d5;
        Double d6;
        Double d7;
        String str7;
        String str8;
        String str9;
        Double d8;
        Double d9;
        String str10;
        BasketType basketType;
        ArrayList arrayList;
        ArrayList arrayList2;
        double d10;
        Double d11;
        Double d12;
        Double d13;
        Double d14;
        String str11;
        String str12;
        Double d15;
        String str13;
        boolean z;
        BasketAmounts v;
        BasketPromotionCode E;
        BasketSlot J;
        BasketAmounts v2;
        BasketAmounts v3;
        BasketAmounts v4;
        BasketAmounts v5;
        List<BasketOfferDomain> B;
        String str14;
        Double d16;
        Iterator it;
        String str15;
        Double d17;
        Double d18;
        String str16;
        ArrayList arrayList3;
        Double d19;
        Double d20;
        OfferDiscountType z2;
        BasketServiceType I;
        BasketService d21;
        BasketAmounts v6;
        BasketAmounts v7;
        Float f;
        Iterator it2;
        Float f2;
        OrderV3Amounts standardPrice;
        OrderV3Amounts salePrice;
        BasketAmounts v8;
        BasketAmounts v9;
        OrderV3PaymentInfo orderV3PaymentInfo;
        OrderV3PaymentInfo orderV3PaymentInfo2;
        OrderV3Promotion orderV3Promotion;
        OrderV3Amounts discountAmount;
        OrderV3Promotion orderV3Promotion2;
        BasketPromotionCode E2;
        OrderV3ShippingType shippingType;
        OrderV3ShippingDetails details;
        OrderV3SlotInfo slotInfo;
        OrderV3SlotInfo slotInfo2;
        Intrinsics.checkNotNullParameter(aVar, "entity");
        OrderV3SubOrder orderV3SubOrder = (OrderV3SubOrder) CollectionsKt___CollectionsKt.m40479B2(aVar.mo111336g().getSubOrders());
        if (orderV3SubOrder == null) {
            return null;
        }
        String valueOf = String.valueOf(aVar.mo111336g().getOneOrderId());
        String valueOf2 = String.valueOf(orderV3SubOrder.getSubOrderId());
        OrderV3DeliveryOption deliveryOption = orderV3SubOrder.getDeliveryOption();
        if (deliveryOption == null || (slotInfo2 = deliveryOption.getSlotInfo()) == null) {
            str = null;
        } else {
            str = slotInfo2.getSlotDateBegin();
        }
        Date z3 = DateExtensionsKt.m118780z(str);
        OrderV3DeliveryOption deliveryOption2 = orderV3SubOrder.getDeliveryOption();
        if (deliveryOption2 == null || (slotInfo = deliveryOption2.getSlotInfo()) == null) {
            str2 = null;
        } else {
            str2 = slotInfo.getSlotDateEnd();
        }
        Date z4 = DateExtensionsKt.m118780z(str2);
        OrderV3Address deliveryAddress = aVar.mo111336g().getDeliveryAddress();
        if (deliveryAddress != null) {
            address = mo111328e(deliveryAddress);
        } else {
            address = null;
        }
        OrderV3DeliveryOption deliveryOption3 = orderV3SubOrder.getDeliveryOption();
        if (deliveryOption3 == null || (shippingType = deliveryOption3.getShippingType()) == null || (details = shippingType.getDetails()) == null) {
            str3 = null;
        } else {
            str3 = details.getPickupPointName();
        }
        String subOrderType = orderV3SubOrder.getSubOrderType();
        OrderServiceType orderServiceType2 = OrderServiceType.DELIVERY;
        if (Intrinsics.areEqual((Object) subOrderType, (Object) orderServiceType2.mo108570q())) {
            orderServiceType = orderServiceType2;
        } else {
            orderServiceType = OrderServiceType.DRIVE;
        }
        BasketDomain f3 = aVar.mo111335f();
        if (f3 == null || (E2 = f3.mo115462E()) == null) {
            str4 = null;
        } else {
            str4 = E2.mo115623f();
        }
        List<OrderV3Promotion> promotions = orderV3SubOrder.getPromotions();
        if (promotions == null || (orderV3Promotion2 = (OrderV3Promotion) CollectionsKt___CollectionsKt.m40479B2(promotions)) == null) {
            str5 = null;
        } else {
            str5 = orderV3Promotion2.getPromotionCode();
        }
        List<OrderV3Promotion> promotions2 = orderV3SubOrder.getPromotions();
        if (promotions2 == null || (orderV3Promotion = (OrderV3Promotion) CollectionsKt___CollectionsKt.m40479B2(promotions2)) == null || (discountAmount = orderV3Promotion.getDiscountAmount()) == null) {
            d = null;
        } else {
            d = Double.valueOf(discountAmount.getScaledAmount());
        }
        OrderV3Amounts subOrderAmount = orderV3SubOrder.getSubOrderAmount();
        if (subOrderAmount != null) {
            d2 = Double.valueOf(subOrderAmount.getScaledAmount());
        } else {
            d2 = null;
        }
        OrderV3Amounts subOrderDiscountAmount = orderV3SubOrder.getSubOrderDiscountAmount();
        if (subOrderDiscountAmount != null) {
            d3 = Double.valueOf(subOrderDiscountAmount.getScaledAmount());
        } else {
            d3 = null;
        }
        List<OrderV3PaymentInfo> paymentInfo = aVar.mo111336g().getPaymentInfo();
        if (paymentInfo == null || (orderV3PaymentInfo2 = (OrderV3PaymentInfo) CollectionsKt___CollectionsKt.m40479B2(paymentInfo)) == null) {
            d4 = null;
        } else {
            d4 = mo111327d(orderV3PaymentInfo2);
        }
        List<OrderV3PaymentInfo> paymentInfo2 = aVar.mo111336g().getPaymentInfo();
        if (paymentInfo2 == null || (orderV3PaymentInfo = (OrderV3PaymentInfo) CollectionsKt___CollectionsKt.m40479B2(paymentInfo2)) == null) {
            str6 = null;
        } else {
            str6 = orderV3PaymentInfo.getPaymentChoice();
        }
        BasketDomain f4 = aVar.mo111335f();
        if (f4 == null || (v9 = f4.mo115498v()) == null) {
            d5 = null;
        } else {
            d5 = Double.valueOf(v9.mo115443r());
        }
        BasketDomain f5 = aVar.mo111335f();
        if (f5 == null || (v8 = f5.mo115498v()) == null) {
            d6 = null;
        } else {
            d6 = Double.valueOf(v8.mo115447u());
        }
        OrderV3Amounts oneOrderAmount = aVar.mo111336g().getOneOrderAmount();
        if (oneOrderAmount != null) {
            d7 = Double.valueOf(oneOrderAmount.getScaledAmount());
        } else {
            d7 = null;
        }
        int size = orderV3SubOrder.getOffers().size();
        Iterable offers = orderV3SubOrder.getOffers();
        ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(offers, 10));
        Iterator it3 = offers.iterator();
        while (it3.hasNext()) {
            OrderV3Offer orderV3Offer = (OrderV3Offer) it3.next();
            String name = orderV3Offer.getName();
            String offerId = orderV3Offer.getOfferId();
            String gtin = orderV3Offer.getGtin();
            Integer quantity = orderV3Offer.getQuantity();
            OrderV3OfferPrices prices = orderV3Offer.getPrices();
            if (prices == null || (salePrice = prices.getSalePrice()) == null) {
                it2 = it3;
                f = null;
            } else {
                it2 = it3;
                f = Float.valueOf((float) salePrice.getScaledAmount());
            }
            OrderV3OfferPrices prices2 = orderV3Offer.getPrices();
            if (prices2 == null || (standardPrice = prices2.getStandardPrice()) == null) {
                f2 = null;
            } else {
                f2 = Float.valueOf((float) standardPrice.getScaledAmount());
            }
            arrayList4.add(new OrderOffer(name, offerId, gtin, (String) null, quantity, f, f2));
            it3 = it2;
        }
        StoreService h = aVar.mo111337h();
        if (h != null) {
            str7 = h.mo119170N();
        } else {
            str7 = null;
        }
        BasketDomain f6 = aVar.mo111335f();
        if (f6 != null) {
            str8 = f6.mo115469L();
        } else {
            str8 = null;
        }
        StoreService h2 = aVar.mo111337h();
        if (h2 != null) {
            str9 = h2.mo119164H();
        } else {
            str9 = null;
        }
        BasketDomain f7 = aVar.mo111335f();
        if (f7 == null || (v7 = f7.mo115498v()) == null) {
            d8 = null;
        } else {
            d8 = Double.valueOf(v7.mo115452y());
        }
        BasketDomain f8 = aVar.mo111335f();
        if (f8 == null || (v6 = f8.mo115498v()) == null) {
            d9 = null;
        } else {
            d9 = Double.valueOf(v6.mo115449w());
        }
        BasketDomain f9 = aVar.mo111335f();
        if (f9 == null || (I = f9.mo115466I()) == null || (d21 = I.mo115633d()) == null) {
            str10 = null;
        } else {
            str10 = d21.mo108474q();
        }
        BasketDomain f10 = aVar.mo111335f();
        if (f10 != null) {
            basketType = f10.mo115499w();
        } else {
            basketType = null;
        }
        BasketDomain f11 = aVar.mo111335f();
        if (f11 == null || (B = f11.mo115459B()) == null) {
            arrayList = arrayList4;
            arrayList2 = null;
        } else {
            Iterable iterable = B;
            ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it4 = iterable.iterator();
            while (it4.hasNext()) {
                BasketOfferDomain basketOfferDomain = (BasketOfferDomain) it4.next();
                ProductDomain A = basketOfferDomain.mo115540A();
                if (A != null) {
                    str14 = A.mo116552y();
                } else {
                    str14 = null;
                }
                Integer valueOf3 = Integer.valueOf(basketOfferDomain.mo115541B());
                Integer t = basketOfferDomain.mo115568t();
                if (t != null) {
                    int intValue = t.intValue();
                    it = it4;
                    d16 = Double.valueOf((double) intValue);
                } else {
                    it = it4;
                    d16 = null;
                }
                ProductDomain A2 = basketOfferDomain.mo115540A();
                if (A2 != null) {
                    str15 = A2.mo116544s();
                } else {
                    str15 = null;
                }
                BasketOfferPriceDomain y = basketOfferDomain.mo115575y();
                if (y != null) {
                    d17 = y.mo115608l();
                } else {
                    d17 = null;
                }
                BasketOfferPriceDomain y2 = basketOfferDomain.mo115575y();
                if (y2 != null) {
                    d18 = y2.mo115609m();
                } else {
                    d18 = null;
                }
                OfferDiscountDomain q = basketOfferDomain.mo115565q();
                if (q == null || (z2 = q.mo115961z()) == null) {
                    str16 = null;
                } else {
                    str16 = z2.mo118123y();
                }
                OfferDiscountDomain q2 = basketOfferDomain.mo115565q();
                if (q2 != null) {
                    arrayList3 = arrayList4;
                    d19 = q2.mo115952s();
                } else {
                    arrayList3 = arrayList4;
                    d19 = null;
                }
                DiscountDomain discountDomain = new DiscountDomain(str16, d19);
                BasketOfferPriceDomain y3 = basketOfferDomain.mo115575y();
                if (y3 != null) {
                    d20 = y3.mo115610n();
                } else {
                    d20 = null;
                }
                arrayList5.add(new BasketOffer(str14, (String) null, valueOf3, d16, str15, d17, d18, discountDomain, d20));
                C36532a aVar2 = aVar;
                it4 = it;
                arrayList4 = arrayList3;
            }
            arrayList = arrayList4;
            arrayList2 = arrayList5;
        }
        BasketDomain f12 = aVar.mo111335f();
        if (f12 != null) {
            d10 = (double) f12.mo115461D();
        } else {
            d10 = 0.0d;
        }
        double d22 = d10;
        BasketDomain f13 = aVar.mo111335f();
        if (f13 == null || (v5 = f13.mo115498v()) == null) {
            d11 = null;
        } else {
            d11 = Double.valueOf(v5.mo115445t());
        }
        BasketDomain f14 = aVar.mo111335f();
        if (f14 == null || (v4 = f14.mo115498v()) == null) {
            d12 = null;
        } else {
            d12 = Double.valueOf(v4.mo115444s());
        }
        BasketDomain f15 = aVar.mo111335f();
        if (f15 == null || (v3 = f15.mo115498v()) == null) {
            d13 = null;
        } else {
            d13 = Double.valueOf(v3.mo115442q());
        }
        BasketDomain f16 = aVar.mo111335f();
        if (f16 == null || (v2 = f16.mo115498v()) == null) {
            d14 = null;
        } else {
            d14 = Double.valueOf(v2.mo115453z());
        }
        BasketDomain f17 = aVar.mo111335f();
        if (f17 == null || (J = f17.mo115467J()) == null) {
            str11 = null;
        } else {
            str11 = J.mo115651h();
        }
        BasketDomain f18 = aVar.mo111335f();
        if (f18 == null || (E = f18.mo115462E()) == null) {
            str12 = null;
        } else {
            str12 = E.mo115623f();
        }
        BasketDomain f19 = aVar.mo111335f();
        if (f19 == null || (v = f19.mo115498v()) == null) {
            d15 = null;
        } else {
            d15 = Double.valueOf(v.mo115443r());
        }
        OrderBasketDomain orderBasketDomain = new OrderBasketDomain(d8, d9, str10, basketType, arrayList2, d22, d11, d12, d13, d14, str11, str12, d15);
        OrderV3DeliveryOption deliveryOption4 = orderV3SubOrder.getDeliveryOption();
        if (deliveryOption4 != null) {
            str13 = deliveryOption4.getMode();
        } else {
            str13 = null;
        }
        boolean areEqual = Intrinsics.areEqual((Object) str13, (Object) "NON_FOOD_DELIVERY");
        OrderV3DeliveryOption deliveryOption5 = orderV3SubOrder.getDeliveryOption();
        if (deliveryOption5 != null) {
            z = C36419b.m149379a(deliveryOption5);
        } else {
            z = false;
        }
        return new OrderConfirmationDomain(valueOf, valueOf2, z3, z4, address, str3, orderServiceType, str7, str8, str9, str4, str5, d, d2, d3, d4, str6, d5, d6, (Double) null, (Double) null, d7, size, arrayList, 0, false, orderBasketDomain, areEqual, z);
    }
}
