package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.presentation.models.TermModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTermModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TermModel.kt\ncom/carrefour/fid/android/presentation/models/extension/TermModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,10:1\n1549#2:11\n1620#2,3:12\n1774#2,4:15\n1855#2,2:19\n766#2:21\n857#2,2:22\n*S KotlinDebug\n*F\n+ 1 TermModel.kt\ncom/carrefour/fid/android/presentation/models/extension/TermModelKt\n*L\n5#1:11\n5#1:12,3\n6#1:15,4\n7#1:19,2\n8#1:21\n8#1:22,2\n*E\n"})
public final class TermModelKt {
    @C12579k
    /* renamed from: a */
    public static final List<TermModel> m159609a(@C12579k List<TermModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<TermModel> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (TermModel e : iterable) {
            arrayList.add(TermModel.m159489e(e, (String) null, (String) null, false, 7, (Object) null));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: b */
    public static final String m159610b(@C12579k List<TermModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((TermModel) next).mo121965g()) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.m40639h3(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, TermModelKt$prettySelectedTerms$2.f97594f, 30, (Object) null);
    }

    /* renamed from: c */
    public static final void m159611c(@C12579k List<TermModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        for (TermModel i : list) {
            i.mo121968i(false);
        }
    }

    /* renamed from: d */
    public static final int m159612d(@C12579k List<TermModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<TermModel> iterable = list;
        int i = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (TermModel g : iterable) {
                if (g.mo121965g() && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.m40458V();
                }
            }
        }
        return i;
    }
}
