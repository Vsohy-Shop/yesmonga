package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMFilteredSuggestion;
import com.carrefour.fid.android.data.entities.APIMSuggestion;
import com.carrefour.fid.android.data.entities.APIMSuggestionFacetFilter;
import com.carrefour.fid.android.data.entities.APIMSuggestionList;
import com.carrefour.fid.android.domain.models.C37941a0;
import com.carrefour.fid.android.domain.models.C38187y;
import com.carrefour.fid.android.domain.models.C38188z;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMSuggestionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMSuggestionMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMSuggestionMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1549#2:35\n1620#2,3:36\n1549#2:39\n1620#2,3:40\n*S KotlinDebug\n*F\n+ 1 APIMSuggestionMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMSuggestionMapper\n*L\n12#1:35\n12#1:36,3\n22#1:39\n22#1:40,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.a0 */
public final class C36458a0 extends C28486g<APIMSuggestionList, C37941a0> {

    /* renamed from: b */
    public static final int f90133b = 0;

    @C12579k
    /* renamed from: d */
    public C37941a0 mo72340a(@C12579k APIMSuggestionList aPIMSuggestionList) {
        ArrayList arrayList;
        C38188z zVar;
        C38188z zVar2;
        Intrinsics.checkNotNullParameter(aPIMSuggestionList, "entity");
        List<APIMFilteredSuggestion> filteredSuggestions = aPIMSuggestionList.getFilteredSuggestions();
        ArrayList arrayList2 = null;
        if (filteredSuggestions != null) {
            Iterable<APIMFilteredSuggestion> iterable = filteredSuggestions;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (APIMFilteredSuggestion aPIMFilteredSuggestion : iterable) {
                String highlight = aPIMFilteredSuggestion.getHighlight();
                String text = aPIMFilteredSuggestion.getText();
                List<String> matches = aPIMFilteredSuggestion.getMatches();
                APIMSuggestionFacetFilter facetFilter = aPIMFilteredSuggestion.getFacetFilter();
                if (facetFilter != null) {
                    String category = facetFilter.getCategory();
                    if (category == null) {
                        category = facetFilter.getShop();
                    }
                    zVar2 = new C38188z(category);
                } else {
                    zVar2 = null;
                }
                arrayList.add(new C38187y(highlight, text, matches, zVar2));
            }
        } else {
            arrayList = null;
        }
        List<APIMSuggestion> suggestions = aPIMSuggestionList.getSuggestions();
        if (suggestions != null) {
            Iterable<APIMSuggestion> iterable2 = suggestions;
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (APIMSuggestion aPIMSuggestion : iterable2) {
                String str = (String) CollectionsKt___CollectionsKt.m40479B2(aPIMSuggestion.getHighlight());
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = (String) CollectionsKt___CollectionsKt.m40479B2(aPIMSuggestion.getText());
                if (str3 != null) {
                    str2 = str3;
                }
                List<String> matches2 = aPIMSuggestion.getMatches();
                APIMSuggestionFacetFilter facetFilter2 = aPIMSuggestion.getFacetFilter();
                if (facetFilter2 != null) {
                    String category2 = facetFilter2.getCategory();
                    if (category2 == null) {
                        category2 = facetFilter2.getShop();
                    }
                    zVar = new C38188z(category2);
                } else {
                    zVar = null;
                }
                arrayList3.add(new C38187y(str, str2, matches2, zVar));
            }
            arrayList2 = arrayList3;
        }
        return new C37941a0(arrayList, arrayList2);
    }
}
