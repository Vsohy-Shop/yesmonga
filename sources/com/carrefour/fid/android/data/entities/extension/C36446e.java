package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APIMRecommendedNeeds;
import com.carrefour.fid.android.data.entities.APIMRecommendedNeedsItem;
import com.carrefour.fid.android.data.entities.APIMRecommendedNeedsItems;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAPIMRecommendedNeeds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMRecommendedNeeds.kt\ncom/carrefour/fid/android/data/entities/extension/APIMRecommendedNeedsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1855#2:29\n1855#2,2:30\n1856#2:32\n766#2:33\n857#2,2:34\n1054#2:36\n1549#2:37\n1620#2,3:38\n766#2:41\n857#2,2:42\n1054#2:44\n*S KotlinDebug\n*F\n+ 1 APIMRecommendedNeeds.kt\ncom/carrefour/fid/android/data/entities/extension/APIMRecommendedNeedsKt\n*L\n9#1:29\n10#1:30,2\n9#1:32\n20#1:33\n20#1:34,2\n21#1:36\n22#1:37\n22#1:38,3\n25#1:41\n25#1:42,2\n26#1:44\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.extension.e */
public final class C36446e {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 APIMRecommendedNeeds.kt\ncom/carrefour/fid/android/data/entities/extension/APIMRecommendedNeedsKt\n*L\n1#1,328:1\n26#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.data.entities.extension.e$a */
    public static final class C36447a<T> implements Comparator {
        public final int compare(T t, T t2) {
            double d;
            Double score = ((APIMRecommendedNeedsItem) t2).getScore();
            double d2 = 0.0d;
            if (score != null) {
                d = score.doubleValue();
            } else {
                d = 0.0d;
            }
            Double valueOf = Double.valueOf(d);
            Double score2 = ((APIMRecommendedNeedsItem) t).getScore();
            if (score2 != null) {
                d2 = score2.doubleValue();
            }
            return C11006g.m42424l(valueOf, Double.valueOf(d2));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 APIMRecommendedNeeds.kt\ncom/carrefour/fid/android/data/entities/extension/APIMRecommendedNeedsKt\n*L\n1#1,328:1\n21#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.data.entities.extension.e$b */
    public static final class C36448b<T> implements Comparator {
        public final int compare(T t, T t2) {
            double d;
            Double score = ((APIMRecommendedNeedsItem) t2).getScore();
            double d2 = 0.0d;
            if (score != null) {
                d = score.doubleValue();
            } else {
                d = 0.0d;
            }
            Double valueOf = Double.valueOf(d);
            Double score2 = ((APIMRecommendedNeedsItem) t).getScore();
            if (score2 != null) {
                d2 = score2.doubleValue();
            }
            return C11006g.m42424l(valueOf, Double.valueOf(d2));
        }
    }

    @C12579k
    /* renamed from: a */
    public static final HashMap<String, List<String>> m149515a(@C12579k APIMRecommendedNeeds aPIMRecommendedNeeds) {
        Set<String> keySet;
        List<APIMRecommendedNeedsItem> items;
        List<String> c;
        Intrinsics.checkNotNullParameter(aPIMRecommendedNeeds, "<this>");
        HashMap<String, List<String>> hashMap = new HashMap<>();
        List<Map<String, APIMRecommendedNeedsItems>> data = aPIMRecommendedNeeds.getData();
        if (data != null) {
            for (Map map : data) {
                if (!(map == null || (keySet = map.keySet()) == null)) {
                    for (String str : keySet) {
                        APIMRecommendedNeedsItems aPIMRecommendedNeedsItems = (APIMRecommendedNeedsItems) map.get(str);
                        if (!(aPIMRecommendedNeedsItems == null || (items = aPIMRecommendedNeedsItems.getItems()) == null || (c = m149517c(items)) == null)) {
                            hashMap.put(str, c);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    @C12579k
    /* renamed from: b */
    public static final String m149516b(@C12579k List<APIMRecommendedNeedsItem> list) {
        String gtin;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            String gtin2 = ((APIMRecommendedNeedsItem) next).getGtin();
            if (gtin2 == null || gtin2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        APIMRecommendedNeedsItem aPIMRecommendedNeedsItem = (APIMRecommendedNeedsItem) CollectionsKt___CollectionsKt.m40479B2(CollectionsKt___CollectionsKt.m40675p5(arrayList, new C36447a()));
        if (aPIMRecommendedNeedsItem == null || (gtin = aPIMRecommendedNeedsItem.getGtin()) == null) {
            return "";
        }
        return gtin;
    }

    @C12579k
    /* renamed from: c */
    public static final List<String> m149517c(@C12579k List<APIMRecommendedNeedsItem> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            String gtin = ((APIMRecommendedNeedsItem) next).getGtin();
            if (gtin == null || gtin.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        Iterable<APIMRecommendedNeedsItem> p5 = CollectionsKt___CollectionsKt.m40675p5(arrayList, new C36448b());
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(p5, 10));
        for (APIMRecommendedNeedsItem gtin2 : p5) {
            String gtin3 = gtin2.getGtin();
            if (gtin3 == null) {
                gtin3 = "";
            }
            arrayList2.add(gtin3);
        }
        return arrayList2;
    }
}
