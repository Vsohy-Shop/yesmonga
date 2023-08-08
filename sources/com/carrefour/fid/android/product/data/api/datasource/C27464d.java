package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38112f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFilterSelectionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterSelectionMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/FilterSelectionMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,8:1\n1360#2:9\n1446#2,2:10\n1549#2:12\n1620#2,3:13\n1448#2,3:16\n*S KotlinDebug\n*F\n+ 1 FilterSelectionMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/FilterSelectionMapperKt\n*L\n6#1:9\n6#1:10,2\n6#1:12\n6#1:13,3\n6#1:16,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.d */
public final class C27464d {
    @C12579k
    /* renamed from: a */
    public static final List<String> m115610a(@C12579k List<C38105d> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (C38105d dVar : list) {
            Iterable<C38112f> f = dVar.mo118672f();
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(f, 10));
            for (C38112f h : f) {
                String h2 = h.mo118787h();
                String e = dVar.mo118670e();
                arrayList2.add(e + "=" + h2);
            }
            C10994x.m42360n0(arrayList, arrayList2);
        }
        return arrayList;
    }
}
