package com.carrefour.fid.android.product.presentation.models.extensions;

import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.product.AllergenType;
import com.carrefour.fid.android.domain.models.product.NutritionalItem;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.product.presentation.models.ProductDetailsModel;
import com.carrefour.fid.android.product.presentation.models.ProductEcoScore;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsSubComponentType;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.AllergoBoxSubComponent;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductAdvice;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductCharacteristics;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductComposition;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDescription;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductTraceability;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductDetailsModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsModelDataMapper.kt\ncom/carrefour/fid/android/product/presentation/models/extensions/ProductDetailsModelDataMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n766#2:113\n857#2,2:114\n*S KotlinDebug\n*F\n+ 1 ProductDetailsModelDataMapper.kt\ncom/carrefour/fid/android/product/presentation/models/extensions/ProductDetailsModelDataMapperKt\n*L\n110#1:113\n110#1:114,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.g */
public final class C27665g {
    /* renamed from: a */
    public static final List<ProductDetailsComponent> m116399a(Product product) {
        ArrayList arrayList = new ArrayList();
        String O = product.mo118414O();
        if (O != null) {
            arrayList.add(new ProductDetailsComponent(ProductDetailsComponentType.DESCRITPION, C10976s.m41419k(new ProductDescription(StringKt.m118913V(O)))));
        }
        String I = product.mo118408I();
        if (I != null) {
            ProductDetailsComponentType productDetailsComponentType = ProductDetailsComponentType.COMPOSITION;
            ProductDetailsSubComponentType productDetailsSubComponentType = ProductDetailsSubComponentType.INGREDIENTS;
            String V = StringKt.m118913V(I);
            ProductDetailsSubComponentType productDetailsSubComponentType2 = ProductDetailsSubComponentType.NUTRITIONALS;
            List<NutritionalItem> U = product.mo118420U();
            ProductDetailsSubComponentType productDetailsSubComponentType3 = ProductDetailsSubComponentType.ALLERGENS;
            List<AllergenType> F = product.mo118405F();
            ProductDetailsSubComponentType productDetailsSubComponentType4 = ProductDetailsSubComponentType.ALCOHOL_VOLUME_LABEL;
            String E = product.mo118404E();
            if (E == null) {
                E = "";
            }
            arrayList.add(new ProductDetailsComponent(productDetailsComponentType, C10976s.m41419k(new ProductComposition(productDetailsSubComponentType, V, productDetailsSubComponentType2, U, productDetailsSubComponentType3, F, productDetailsSubComponentType4, E, new AllergoBoxSubComponent(product.mo118439f0())))));
        }
        if (!product.mo118431c0().isEmpty()) {
            arrayList.add(new ProductDetailsComponent(ProductDetailsComponentType.TRACEABILITY, C10976s.m41419k(new ProductTraceability(product.mo118431c0()))));
        }
        List<OfferFlag> b = m116400b(product);
        if (!b.isEmpty()) {
            arrayList.add(new ProductDetailsComponent(ProductDetailsComponentType.CHARACTERISTICS, C10976s.m41419k(new ProductCharacteristics(CollectionsKt___CollectionsKt.m40557Q5(b)))));
        }
        if (!C27666h.m116402a(product).isEmpty()) {
            arrayList.add(new ProductDetailsComponent(ProductDetailsComponentType.ADVICE, C10976s.m41419k(new ProductAdvice(C27666h.m116402a(product)))));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<OfferFlag> m116400b(Product product) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : product.mo118412M()) {
            if (((OfferFlag) next).mo118128y() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: c */
    public static final ProductDetailsModel m116401c(@C12579k Product product) {
        String str;
        Intrinsics.checkNotNullParameter(product, "<this>");
        boolean f0 = product.mo118439f0();
        List<ProductDetailsComponent> a = m116399a(product);
        ProductEcoScore.C27645a aVar = ProductEcoScore.f67159a;
        com.carrefour.fid.android.domain.models.offer.ProductEcoScore L = product.mo118411L();
        if (L != null) {
            str = L.name();
        } else {
            str = null;
        }
        return new ProductDetailsModel(f0, a, aVar.mo80319a(str));
    }
}
