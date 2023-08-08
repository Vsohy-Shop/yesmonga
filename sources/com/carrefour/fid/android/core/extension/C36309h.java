package com.carrefour.fid.android.core.extension;

import com.carrefour.fid.android.domain.models.ProductPictureDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28560l0;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.urbanairship.iam.C9168d0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductModel.kt\ncom/carrefour/fid/android/core/extension/ProductModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n2333#2,14:31\n1045#2:45\n1549#2:46\n1620#2,3:47\n*S KotlinDebug\n*F\n+ 1 ProductModel.kt\ncom/carrefour/fid/android/core/extension/ProductModelKt\n*L\n11#1:31,14\n22#1:45\n23#1:46\n23#1:47,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.core.extension.h */
public final class C36309h {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ProductModel.kt\ncom/carrefour/fid/android/core/extension/ProductModelKt\n*L\n1#1,328:1\n22#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.core.extension.h$a */
    public static final class C36310a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((ProductPictureDomain) t).getOrder()), Integer.valueOf(((ProductPictureDomain) t2).getOrder()));
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<String> m148961a(@C12579k OfferProductModel offerProductModel, @C12579k String str) {
        List<ProductPictureDomain> u;
        List p5;
        String str2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(str, C9168d0.f24889w);
        ProductModel o0 = offerProductModel.mo121517o0();
        ArrayList arrayList = null;
        if (!(o0 == null || (u = o0.mo121892u()) == null || (p5 = CollectionsKt___CollectionsKt.m40675p5(u, new C36310a())) == null)) {
            Iterable<ProductPictureDomain> iterable = p5;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (ProductPictureDomain productPictureDomain : iterable) {
                if (C11622t.startsWith$default(productPictureDomain.mo116585e(), "http", false, 2, (Object) null)) {
                    str2 = productPictureDomain.mo116585e();
                } else {
                    str2 = C28547h2.f69317e + StringKt.m118923c0(str) + productPictureDomain.mo116585e();
                }
                arrayList2.add(str2);
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return arrayList;
    }

    /* renamed from: b */
    public static /* synthetic */ List m148962b(OfferProductModel offerProductModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = C28560l0.f69499c;
        }
        return m148961a(offerProductModel, str);
    }

    @C12579k
    /* renamed from: c */
    public static final String m148963c(@C12579k OfferProductModel offerProductModel, @C12579k String str) {
        List<ProductPictureDomain> u;
        Object obj;
        String e;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(str, C9168d0.f24889w);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (!(o0 == null || (u = o0.mo121892u()) == null)) {
            Iterator it = u.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int order = ((ProductPictureDomain) obj).getOrder();
                    do {
                        Object next = it.next();
                        int order2 = ((ProductPictureDomain) next).getOrder();
                        if (order > order2) {
                            obj = next;
                            order = order2;
                        }
                    } while (it.hasNext());
                }
            }
            ProductPictureDomain productPictureDomain = (ProductPictureDomain) obj;
            if (!(productPictureDomain == null || (e = productPictureDomain.mo116585e()) == null)) {
                if (C11622t.startsWith$default(e, "http", false, 2, (Object) null)) {
                    return e;
                }
                return C28547h2.f69317e + StringKt.m118923c0(str) + e;
            }
        }
        return new String();
    }

    /* renamed from: d */
    public static /* synthetic */ String m148964d(OfferProductModel offerProductModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = C28560l0.f69498b;
        }
        return m148963c(offerProductModel, str);
    }
}
