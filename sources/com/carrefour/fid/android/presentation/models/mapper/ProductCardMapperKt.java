package com.carrefour.fid.android.presentation.models.mapper;

import android.content.res.Resources;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.type.ProductOverlayType;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.C37382a;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.extension.C28759i;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductCardMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductCardMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/ProductCardMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n766#2:129\n857#2,2:130\n1855#2,2:132\n*S KotlinDebug\n*F\n+ 1 ProductCardMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/ProductCardMapperKt\n*L\n67#1:129\n67#1:130,2\n69#1:132,2\n*E\n"})
public final class ProductCardMapperKt {
    @C12580l
    /* renamed from: a */
    public static final Double m159728a(@C12580l OfferPriceDomain offerPriceDomain) {
        if (offerPriceDomain == null) {
            return null;
        }
        if (offerPriceDomain.mo116006k() == null || Intrinsics.areEqual(offerPriceDomain.mo116006k(), 0.0d)) {
            return offerPriceDomain.mo116007l();
        }
        return offerPriceDomain.mo116006k();
    }

    @C12579k
    /* renamed from: b */
    public static final String m159729b(@C12579k OfferProductModel offerProductModel) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        ProductModel o0 = offerProductModel.mo121517o0();
        String str3 = null;
        if (o0 != null) {
            str = o0.mo121896x();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        if (m0 != null) {
            str2 = m0.mo116005j();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str4;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str3 = o02.mo121894w();
        }
        if (str3 != null) {
            str4 = str3;
        }
        return StringsKt__IndentKt.trimIndent("\n        " + str + "\n        " + str2 + "\n        " + str4 + "\n    ");
    }

    /* renamed from: c */
    public static final double m159730c(@C12579k OfferProductModel offerProductModel, boolean z) {
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        OfferDiscountType offerDiscountType3;
        Double d;
        Double d2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Double d3 = null;
        if (z) {
            Double j0 = offerProductModel.mo121741j0();
            if (j0 == null) {
                OfferPriceDomain m0 = offerProductModel.mo121514m0();
                if (m0 != null) {
                    d3 = m0.mo116006k();
                }
            } else {
                d3 = j0;
            }
            return C28782t.m119111h(d3);
        }
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType == OfferDiscountType.PF) {
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (w2 != null) {
                d3 = w2.mo115952s();
            }
            return C28782t.m119111h(d3);
        }
        OfferDiscountDomain w3 = offerProductModel.mo121523w();
        if (w3 != null) {
            offerDiscountType2 = w3.mo115961z();
        } else {
            offerDiscountType2 = null;
        }
        if (offerDiscountType2 == OfferDiscountType.RD) {
            OfferDiscountDomain w4 = offerProductModel.mo121523w();
            if (w4 != null) {
                d3 = w4.mo115952s();
            }
            return C28782t.m119111h(d3);
        }
        OfferDiscountDomain w5 = offerProductModel.mo121523w();
        if (w5 != null) {
            offerDiscountType3 = w5.mo115961z();
        } else {
            offerDiscountType3 = null;
        }
        if (offerDiscountType3 == OfferDiscountType.RI) {
            OfferPriceDomain m02 = offerProductModel.mo121514m0();
            if (m02 != null) {
                d3 = m02.mo116007l();
            }
            return C28782t.m119111h(d3);
        }
        OfferPriceDomain m03 = offerProductModel.mo121514m0();
        if (m03 != null) {
            d = m03.mo116006k();
        } else {
            d = null;
        }
        if (C28759i.m119064a(d, Double.valueOf(0.0d))) {
            OfferPriceDomain m04 = offerProductModel.mo121514m0();
            if (m04 != null) {
                d3 = m04.mo116006k();
            }
            return C28782t.m119111h(d3);
        }
        OfferPriceDomain m05 = offerProductModel.mo121514m0();
        if (m05 != null) {
            d2 = m05.mo116007l();
        } else {
            d2 = null;
        }
        if (!C28759i.m119064a(d2, Double.valueOf(0.0d))) {
            return C28782t.m119111h(m159728a(offerProductModel.mo121514m0()));
        }
        OfferPriceDomain m06 = offerProductModel.mo121514m0();
        if (m06 != null) {
            d3 = m06.mo116007l();
        }
        return C28782t.m119111h(d3);
    }

    @C12580l
    /* renamed from: d */
    public static final String m159731d(@C12579k OfferProductModel offerProductModel, @C12579k Resources resources) {
        Double d;
        Double d2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        Double d3 = null;
        if (m0 != null) {
            d = m0.mo116002h();
        } else {
            d = null;
        }
        if (d != null) {
            OfferPriceDomain m02 = offerProductModel.mo121514m0();
            if (m02 != null) {
                d2 = m02.mo116002h();
            } else {
                d2 = null;
            }
            if (!Intrinsics.areEqual(d2, 0.0d)) {
                Object[] objArr = new Object[1];
                OfferPriceDomain m03 = offerProductModel.mo121514m0();
                if (m03 != null) {
                    d3 = m03.mo116002h();
                }
                objArr[0] = C28782t.m119105b(d3);
                return resources.getString(R.string.basket_price_discount_ri, objArr);
            }
        }
        return null;
    }

    @C12580l
    /* renamed from: e */
    public static final String m159732e(@C12579k OfferProductModel offerProductModel, @C12579k Resources resources) {
        Double d;
        Double d2;
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        Double d3 = null;
        if (m0 != null) {
            d = m0.mo116004i();
        } else {
            d = null;
        }
        if (d != null) {
            OfferPriceDomain m02 = offerProductModel.mo121514m0();
            if (m02 != null) {
                d2 = m02.mo116004i();
            } else {
                d2 = null;
            }
            if (!Intrinsics.areEqual(d2, 0.0d)) {
                OfferDiscountDomain w = offerProductModel.mo121523w();
                if (w == null || !w.mo115955u()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return null;
                }
                Object[] objArr = new Object[1];
                OfferPriceDomain m03 = offerProductModel.mo121514m0();
                if (m03 != null) {
                    d3 = m03.mo116004i();
                }
                objArr[0] = C28782t.m119105b(d3);
                return resources.getString(R.string.basket_price_discount_rd, objArr);
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: f */
    public static final LozengeListComponent.C37381a m159733f(@C12579k OfferProductModel offerProductModel) {
        List<OfferFlag> t;
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        ArrayList arrayList = new ArrayList();
        String Z = offerProductModel.mo121505Z();
        if (Z != null && (!C11622t.isBlank(Z))) {
            arrayList.add(new C37382a.C37383a(Z));
        }
        ProductModel o0 = offerProductModel.mo121517o0();
        if (!(o0 == null || (t = o0.mo121890t()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : t) {
                if (((OfferFlag) next).mo118127w() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            List<OfferFlag> E5 = CollectionsKt___CollectionsKt.m40497E5(arrayList2, 3);
            if (E5 != null) {
                for (OfferFlag offerFlag : E5) {
                    if (offerFlag.mo118127w() != 0) {
                        arrayList.add(new C37382a.C37384b(offerFlag.mo118127w(), offerFlag.mo118128y()));
                    }
                }
            }
        }
        return new LozengeListComponent.C37381a(arrayList);
    }

    @C12580l
    /* renamed from: g */
    public static final String m159734g(@C12579k OfferProductModel offerProductModel, @C12579k Resources resources) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (offerProductModel.mo121515n0() == null) {
            return null;
        }
        return resources.getString(R.string.basket_price_discount_ri, new Object[]{C28782t.m119105b(offerProductModel.mo121515n0())});
    }

    @C12580l
    /* renamed from: h */
    public static final ProductOverlayComponent.C37161b m159735h(@C12579k OfferProductModel offerProductModel, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2) {
        boolean z;
        List<String> t;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (aVar == null || aVar2 == null) {
            return null;
        }
        OfferDiscountDomain w = offerProductModel.mo121523w();
        boolean z2 = false;
        if (w == null || (t = w.mo115953t()) == null) {
            z = false;
        } else {
            z = !t.isEmpty();
        }
        Boolean A0 = offerProductModel.mo121726A0();
        if (A0 != null) {
            z2 = A0.booleanValue();
        }
        if (!z || !z2 || offerProductModel.mo121519p0() != 1) {
            return null;
        }
        return new ProductOverlayComponent.C37161b(OfferProductModelKt.m159570S(offerProductModel), (String) null, ProductOverlayType.HORIZONTAL, new ProductCardMapperKt$getProductOverlayInfo$1(aVar), new ProductCardMapperKt$getProductOverlayInfo$2(aVar2), false, 32, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: i */
    public static final Double m159736i(@C12579k OfferProductModel offerProductModel) {
        OfferPriceDomain m0;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (OfferProductModelKt.m159554C(offerProductModel) || !OfferProductModelKt.m159599u(offerProductModel) || !OfferProductModelKt.m159600v(offerProductModel) || (m0 = offerProductModel.mo121514m0()) == null) {
            return null;
        }
        return m0.mo116007l();
    }

    /* renamed from: j */
    public static final boolean m159737j(@C12579k OfferProductModel offerProductModel) {
        CriteoProductModel criteoProductModel;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (offerProductModel instanceof CriteoProductModel) {
            criteoProductModel = (CriteoProductModel) offerProductModel;
        } else {
            criteoProductModel = null;
        }
        if (criteoProductModel == null || !criteoProductModel.mo121522r2()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final boolean m159738k(@C12579k OfferProductModel offerProductModel) {
        List<String> t;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w == null || (t = w.mo115953t()) == null) {
            return false;
        }
        return !t.isEmpty();
    }
}
