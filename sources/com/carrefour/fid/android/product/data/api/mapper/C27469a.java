package com.carrefour.fid.android.product.data.api.mapper;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffItemPicture;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBffPicturesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BffPicturesMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/BffPicturesMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1559#2:35\n1590#2,4:36\n1045#2:40\n1559#2:41\n1590#2,4:42\n1045#2:46\n1559#2:47\n1590#2,4:48\n1045#2:52\n*S KotlinDebug\n*F\n+ 1 BffPicturesMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/BffPicturesMapperKt\n*L\n9#1:35\n9#1:36,4\n13#1:40\n17#1:41\n17#1:42,4\n21#1:46\n25#1:47\n25#1:48,4\n29#1:52\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.data.api.mapper.a */
public final class C27469a {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BffPicturesMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/BffPicturesMapperKt\n*L\n1#1,328:1\n13#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.data.api.mapper.a$a */
    public static final class C27470a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((ProductPicture) t).getOrder()), Integer.valueOf(((ProductPicture) t2).getOrder()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BffPicturesMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/BffPicturesMapperKt\n*L\n1#1,328:1\n21#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.data.api.mapper.a$b */
    public static final class C27471b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((ProductPicture) t).getOrder()), Integer.valueOf(((ProductPicture) t2).getOrder()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BffPicturesMapper.kt\ncom/carrefour/fid/android/product/data/api/mapper/BffPicturesMapperKt\n*L\n1#1,328:1\n29#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.data.api.mapper.a$c */
    public static final class C27472c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((ProductPicture) t).getOrder()), Integer.valueOf(((ProductPicture) t2).getOrder()));
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Map<PictureSize, List<ProductPicture>> m115621a(@C12580l BffPictures bffPictures) {
        List<BffItemPicture> large;
        List<BffItemPicture> medium;
        List<BffItemPicture> small;
        Map g = C10975r0.m41397g();
        int i = 0;
        if (!(bffPictures == null || (small = bffPictures.getSmall()) == null)) {
            Iterable iterable = small;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture = (BffItemPicture) next;
                String path = bffItemPicture.getPath();
                if (path == null) {
                    path = "";
                }
                Integer order = bffItemPicture.getOrder();
                if (order != null) {
                    i2 = order.intValue();
                }
                arrayList.add(new ProductPicture(path, i2));
                i2 = i3;
            }
            List p5 = CollectionsKt___CollectionsKt.m40675p5(arrayList, new C27470a());
            if (p5 != null) {
                g.put(PictureSize.Small, p5);
            }
        }
        if (!(bffPictures == null || (medium = bffPictures.getMedium()) == null)) {
            Iterable iterable2 = medium;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            int i4 = 0;
            for (Object next2 : iterable2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture2 = (BffItemPicture) next2;
                String path2 = bffItemPicture2.getPath();
                if (path2 == null) {
                    path2 = "";
                }
                Integer order2 = bffItemPicture2.getOrder();
                if (order2 != null) {
                    i4 = order2.intValue();
                }
                arrayList2.add(new ProductPicture(path2, i4));
                i4 = i5;
            }
            List p52 = CollectionsKt___CollectionsKt.m40675p5(arrayList2, new C27471b());
            if (p52 != null) {
                g.put(PictureSize.Medium, p52);
            }
        }
        if (!(bffPictures == null || (large = bffPictures.getLarge()) == null)) {
            Iterable iterable3 = large;
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable3, 10));
            for (Object next3 : iterable3) {
                int i6 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture3 = (BffItemPicture) next3;
                String path3 = bffItemPicture3.getPath();
                if (path3 == null) {
                    path3 = "";
                }
                Integer order3 = bffItemPicture3.getOrder();
                if (order3 != null) {
                    i = order3.intValue();
                }
                arrayList3.add(new ProductPicture(path3, i));
                i = i6;
            }
            List p53 = CollectionsKt___CollectionsKt.m40675p5(arrayList3, new C27472c());
            if (p53 != null) {
                g.put(PictureSize.Large, p53);
            }
        }
        return C10975r0.m41394d(g);
    }
}
