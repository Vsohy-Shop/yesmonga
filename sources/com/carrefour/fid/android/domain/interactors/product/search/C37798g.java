package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.domain.models.product.search.C38116a;
import com.carrefour.fid.android.domain.models.product.search.C38117b;
import com.carrefour.fid.android.domain.models.product.search.C38118c;
import com.carrefour.fid.android.presentation.models.C38528t;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.models.SuggestionType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSearchSuggestionDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSuggestionDataMapper.kt\ncom/carrefour/fid/android/domain/interactors/product/search/SearchSuggestionDataMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1655#2,8:36\n1549#2:44\n1620#2,3:45\n1549#2:48\n1620#2,3:49\n*S KotlinDebug\n*F\n+ 1 SearchSuggestionDataMapper.kt\ncom/carrefour/fid/android/domain/interactors/product/search/SearchSuggestionDataMapperKt\n*L\n11#1:36,8\n12#1:44\n12#1:45,3\n23#1:48\n23#1:49,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.g */
public final class C37798g {
    @C12579k
    /* renamed from: a */
    public static final C38529u m154943a(@C12580l C38116a aVar) {
        ArrayList arrayList;
        List<C38117b> f;
        C38528t tVar;
        List<C38117b> e;
        C38528t tVar2;
        SuggestionType suggestionType = SuggestionType.SUGGESTION;
        ArrayList arrayList2 = null;
        if (aVar == null || (e = aVar.mo118893e()) == null) {
            arrayList = null;
        } else {
            HashSet hashSet = new HashSet();
            ArrayList<C38117b> arrayList3 = new ArrayList<>();
            for (Object next : e) {
                C38117b bVar = (C38117b) next;
                if (hashSet.add(new Pair(bVar.mo118908j(), bVar.mo118905h()))) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList(C10978t.m41495Y(arrayList3, 10));
            for (C38117b bVar2 : arrayList3) {
                SuggestionType suggestionType2 = SuggestionType.SUGGESTION;
                String obj = StringsKt__StringsKt.trim(bVar2.mo118905h()).toString();
                String obj2 = StringsKt__StringsKt.trim(bVar2.mo118908j()).toString();
                List<String> i = bVar2.mo118907i();
                C38118c g = bVar2.mo118904g();
                if (g != null) {
                    String d = g.mo118912d();
                    if (d == null) {
                        d = "";
                    }
                    tVar2 = new C38528t(d);
                } else {
                    tVar2 = null;
                }
                arrayList.add(new C38530v(suggestionType2, obj2, obj, i, tVar2));
            }
        }
        if (!(aVar == null || (f = aVar.mo118895f()) == null)) {
            Iterable<C38117b> iterable = f;
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38117b bVar3 : iterable) {
                SuggestionType suggestionType3 = SuggestionType.SUGGESTION;
                String obj3 = StringsKt__StringsKt.trim(bVar3.mo118905h()).toString();
                String obj4 = StringsKt__StringsKt.trim(bVar3.mo118908j()).toString();
                List<String> i2 = bVar3.mo118907i();
                C38118c g2 = bVar3.mo118904g();
                if (g2 != null) {
                    String d2 = g2.mo118912d();
                    if (d2 == null) {
                        d2 = "";
                    }
                    tVar = new C38528t(d2);
                } else {
                    tVar = null;
                }
                arrayList4.add(new C38530v(suggestionType3, obj4, obj3, i2, tVar));
            }
            arrayList2 = arrayList4;
        }
        return new C38529u(suggestionType, arrayList, arrayList2);
    }
}
