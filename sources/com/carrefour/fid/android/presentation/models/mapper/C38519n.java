package com.carrefour.fid.android.presentation.models.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C37941a0;
import com.carrefour.fid.android.domain.models.C38187y;
import com.carrefour.fid.android.domain.models.C38188z;
import com.carrefour.fid.android.presentation.models.C38528t;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.models.SuggestionType;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSuggestionListModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionListModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/SuggestionListModelDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1655#2,8:41\n1549#2:49\n1620#2,3:50\n1549#2:53\n1620#2,3:54\n*S KotlinDebug\n*F\n+ 1 SuggestionListModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/SuggestionListModelDataMapper\n*L\n15#1:41,8\n16#1:49\n16#1:50,3\n27#1:53\n27#1:54,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.mapper.n */
public final class C38519n extends C28486g<C37941a0, C38529u> {

    /* renamed from: b */
    public static final int f97651b = 0;

    @C12579k
    /* renamed from: d */
    public C38529u mo72340a(@C12579k C37941a0 a0Var) {
        ArrayList arrayList;
        C38528t tVar;
        C38528t tVar2;
        Intrinsics.checkNotNullParameter(a0Var, "entity");
        SuggestionType suggestionType = SuggestionType.SUGGESTION;
        List<C38187y> e = a0Var.mo116639e();
        ArrayList arrayList2 = null;
        if (e != null) {
            HashSet hashSet = new HashSet();
            ArrayList<C38187y> arrayList3 = new ArrayList<>();
            for (Object next : e) {
                C38187y yVar = (C38187y) next;
                if (hashSet.add(new Pair(yVar.mo119602j(), yVar.mo119599h()))) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList(C10978t.m41495Y(arrayList3, 10));
            for (C38187y yVar2 : arrayList3) {
                SuggestionType suggestionType2 = SuggestionType.SUGGESTION;
                String obj = StringsKt__StringsKt.trim(yVar2.mo119599h()).toString();
                String obj2 = StringsKt__StringsKt.trim(yVar2.mo119602j()).toString();
                List<String> i = yVar2.mo119601i();
                C38188z g = yVar2.mo119598g();
                if (g != null) {
                    String d = g.mo119606d();
                    if (d == null) {
                        d = "";
                    }
                    tVar2 = new C38528t(d);
                } else {
                    tVar2 = null;
                }
                arrayList.add(new C38530v(suggestionType2, obj2, obj, i, tVar2));
            }
        } else {
            arrayList = null;
        }
        List<C38187y> f = a0Var.mo116641f();
        if (f != null) {
            Iterable<C38187y> iterable = f;
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38187y yVar3 : iterable) {
                SuggestionType suggestionType3 = SuggestionType.SUGGESTION;
                String obj3 = StringsKt__StringsKt.trim(yVar3.mo119599h()).toString();
                String obj4 = StringsKt__StringsKt.trim(yVar3.mo119602j()).toString();
                List<String> i2 = yVar3.mo119601i();
                C38188z g2 = yVar3.mo119598g();
                if (g2 != null) {
                    String d2 = g2.mo119606d();
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
