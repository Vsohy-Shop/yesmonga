package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsParamsModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRecommendedProductsModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendedProductsModel.kt\ncom/carrefour/fid/android/presentation/models/extension/RecommendedProductsModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1655#2,8:24\n1045#2:32\n1549#2:33\n1620#2,3:34\n*S KotlinDebug\n*F\n+ 1 RecommendedProductsModel.kt\ncom/carrefour/fid/android/presentation/models/extension/RecommendedProductsModelKt\n*L\n13#1:24,8\n16#1:32\n18#1:33\n18#1:34,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.o */
public final class C38479o {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RecommendedProductsModel.kt\ncom/carrefour/fid/android/presentation/models/extension/RecommendedProductsModelKt\n*L\n1#1,328:1\n16#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.o$a */
    public static final class C38480a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(((OfferProductModel) t).mo121749t0(), ((OfferProductModel) t2).mo121749t0());
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<OfferProductModel> m159656a(@C12579k List<? extends OfferProductModel> list, @C12580l List<? extends OfferProductModel> list2, @C12580l BasketDomain basketDomain) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable iterable = list;
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt___CollectionsKt.m40592X5(iterable, list2)) {
            ProductModel o0 = ((OfferProductModel) next).mo121517o0();
            if (o0 != null) {
                str = o0.mo121889s();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                arrayList.add(next);
            }
        }
        Iterable<OfferProductModel> S4 = CollectionsKt___CollectionsKt.m40566S4(CollectionsKt___CollectionsKt.m40675p5(OfferProductModelKt.m159572U(CollectionsKt___CollectionsKt.m40557Q5(arrayList), basketDomain), new C38480a()));
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(S4, 10));
        for (OfferProductModel offerProductModel : S4) {
            offerProductModel.mo121735X1(Boolean.FALSE);
            arrayList2.add(offerProductModel);
        }
        return arrayList2;
    }

    @C12579k
    /* renamed from: b */
    public static final List<OfferProductModel> m159657b(@C12579k RecommendedProductsParamsModel recommendedProductsParamsModel) {
        Intrinsics.checkNotNullParameter(recommendedProductsParamsModel, "<this>");
        List<OfferProductModel> j = recommendedProductsParamsModel.mo121928j();
        if (j == null) {
            j = CollectionsKt__CollectionsKt.m40441E();
        }
        Collection collection = j;
        List<OfferProductModel> k = recommendedProductsParamsModel.mo121929k();
        if (k == null) {
            k = CollectionsKt__CollectionsKt.m40441E();
        }
        return CollectionsKt___CollectionsKt.m40718y4(collection, k);
    }
}
