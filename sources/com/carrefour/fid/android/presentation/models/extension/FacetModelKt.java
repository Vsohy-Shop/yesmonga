package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.presentation.models.FacetModel;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFacetModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetModel.kt\ncom/carrefour/fid/android/presentation/models/extension/FacetModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1549#2:15\n1620#2,3:16\n1774#2,4:19\n1855#2,2:23\n766#2:25\n857#2,2:26\n*S KotlinDebug\n*F\n+ 1 FacetModel.kt\ncom/carrefour/fid/android/presentation/models/extension/FacetModelKt\n*L\n5#1:15\n5#1:16,3\n6#1:19,4\n7#1:23,2\n12#1:25\n12#1:26,2\n*E\n"})
public final class FacetModelKt {
    @C12579k
    /* renamed from: a */
    public static final List<FacetModel> m159547a(@C12579k List<FacetModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<FacetModel> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (FacetModel facetModel : iterable) {
            arrayList.add(FacetModel.m159191Q(facetModel, (String) null, (String) null, 0, TermModelKt.m159609a(facetModel.mo121578e0()), (String) null, false, 55, (Object) null));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: b */
    public static final String m159548b(@C12579k List<FacetModel> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (TermModelKt.m159612d(((FacetModel) next).mo121578e0()) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.m40639h3(arrayList, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, FacetModelKt$prettySelectedFacets$2.f97589f, 30, (Object) null);
    }

    /* renamed from: c */
    public static final void m159549c(@C12579k List<FacetModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        for (FacetModel facetModel : list) {
            facetModel.mo121584i0(false);
            TermModelKt.m159611c(facetModel.mo121578e0());
        }
    }

    /* renamed from: d */
    public static final int m159550d(@C12579k List<FacetModel> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<FacetModel> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        int i = 0;
        for (FacetModel facetModel : iterable) {
            if (facetModel.mo121574Z() || TermModelKt.m159612d(facetModel.mo121578e0()) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        return i;
    }
}
