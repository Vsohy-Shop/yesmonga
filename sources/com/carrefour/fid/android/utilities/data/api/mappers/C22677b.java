package com.carrefour.fid.android.utilities.data.api.mappers;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestions;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponseData;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTextSuggestions;
import com.carrefour.fid.android.domain.models.product.search.C38116a;
import com.carrefour.fid.android.domain.models.product.search.C38117b;
import com.carrefour.fid.android.domain.models.product.search.C38118c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductSuggestionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSuggestionMapper.kt\ncom/carrefour/fid/android/utilities/data/api/mappers/ProductSuggestionMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n1549#2:40\n1620#2,3:41\n*S KotlinDebug\n*F\n+ 1 ProductSuggestionMapper.kt\ncom/carrefour/fid/android/utilities/data/api/mappers/ProductSuggestionMapperKt\n*L\n14#1:36\n14#1:37,3\n26#1:40\n26#1:41,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.utilities.data.api.mappers.b */
public final class C22677b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.carrefour.fid.android.domain.models.product.search.C38117b> m102698a(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponseData r8) {
        /*
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestions r8 = r8.getSearchSuggestions()
            r0 = 0
            if (r8 == 0) goto L_0x0071
            java.util.List r8 = r8.getCategorySuggestions()
            if (r8 == 0) goto L_0x0071
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r8, r2)
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r8.next()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions r2 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions) r2
            java.lang.String r3 = r2.getHighlight()
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0033
            r3 = r4
        L_0x0033:
            java.lang.String r5 = r2.getText()
            if (r5 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = r5
        L_0x003b:
            java.util.List r5 = r2.getMatches()
            java.util.Map r2 = r2.getFacetFilter()
            if (r2 == 0) goto L_0x0066
            com.carrefour.fid.android.domain.models.product.search.c r6 = new com.carrefour.fid.android.domain.models.product.search.c
            java.util.Set r7 = r2.keySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40721z2(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0062
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40696u2(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0062:
            r6.<init>(r7)
            goto L_0x0067
        L_0x0066:
            r6 = r0
        L_0x0067:
            com.carrefour.fid.android.domain.models.product.search.b r2 = new com.carrefour.fid.android.domain.models.product.search.b
            r2.<init>(r3, r4, r5, r6)
            r1.add(r2)
            goto L_0x001e
        L_0x0070:
            r0 = r1
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.data.api.mappers.C22677b.m102698a(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponseData):java.util.List");
    }

    /* renamed from: b */
    public static final List<C38117b> m102699b(BffSearchSuggestionsResponseData bffSearchSuggestionsResponseData) {
        List<BffTextSuggestions> textSuggestions;
        BffSearchSuggestions searchSuggestions = bffSearchSuggestionsResponseData.getSearchSuggestions();
        if (searchSuggestions == null || (textSuggestions = searchSuggestions.getTextSuggestions()) == null) {
            return null;
        }
        Iterable<BffTextSuggestions> iterable = textSuggestions;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (BffTextSuggestions bffTextSuggestions : iterable) {
            String bffHighlight = bffTextSuggestions.getBffHighlight();
            String str = "";
            if (bffHighlight == null) {
                bffHighlight = str;
            }
            String bffText = bffTextSuggestions.getBffText();
            if (bffText != null) {
                str = bffText;
            }
            arrayList.add(new C38117b(bffHighlight, str, CollectionsKt__CollectionsKt.m40441E(), (C38118c) null));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: c */
    public static final C38116a m102700c(@C12579k BffSearchSuggestionsResponse bffSearchSuggestionsResponse) {
        List<C38117b> list;
        Intrinsics.checkNotNullParameter(bffSearchSuggestionsResponse, "<this>");
        BffSearchSuggestionsResponseData data = bffSearchSuggestionsResponse.getData();
        List<C38117b> list2 = null;
        if (data != null) {
            list = m102698a(data);
        } else {
            list = null;
        }
        BffSearchSuggestionsResponseData data2 = bffSearchSuggestionsResponse.getData();
        if (data2 != null) {
            list2 = m102699b(data2);
        }
        return new C38116a(list, list2);
    }
}
