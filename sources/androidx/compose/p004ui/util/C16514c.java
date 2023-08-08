package androidx.compose.p004ui.util;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n33#1,6:207\n33#1,6:213\n33#1,6:219\n33#1,6:225\n33#1,6:231\n33#1,6:237\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:207,6\n102#1:213,6\n117#1:219,6\n134#1:225,6\n153#1:231,6\n201#1:237,6\n*E\n"})
/* renamed from: androidx.compose.ui.util.c */
public final class C16514c {
    /* renamed from: a */
    public static final <T> boolean m74771a(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!lVar.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final <T> boolean m74772b(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (lVar.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C12580l
    /* renamed from: c */
    public static final <T> T m74773c(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T> void m74774d(@C12579k List<? extends T> list, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lVar.invoke(list.get(i));
        }
    }

    /* renamed from: e */
    public static final <T> void m74775e(@C12579k List<? extends T> list, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    /* renamed from: f */
    public static final <T> void m74776f(@C12579k List<? extends T> list, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                lVar.invoke(list.get(size));
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    @C12579k
    /* renamed from: g */
    public static final <T, R> List<R> m74777g(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(lVar.invoke(list.get(i)));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: h */
    public static final <T, R, C extends Collection<? super R>> C m74778h(@C12579k List<? extends T> list, @C12579k C c, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(lVar.invoke(list.get(i)));
        }
        return c;
    }

    @C12580l
    /* renamed from: i */
    public static final <T, R extends Comparable<? super R>> T m74779i(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) lVar.invoke(t);
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        int i = 1;
        if (1 <= G) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) lVar.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == G) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    /* renamed from: j */
    public static final <T> int m74780j(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += lVar.invoke(list.get(i2)).intValue();
        }
        return i;
    }
}
