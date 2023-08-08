package androidx.compose.p004ui.text.android;

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

@C11363r0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,85:1\n34#1,6:86\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n55#1:86,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.o0 */
public final class C16103o0 {
    /* renamed from: a */
    public static final <T> void m72539a(@C12579k List<? extends T> list, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lVar.invoke(list.get(i));
        }
    }

    @C12579k
    /* renamed from: b */
    public static final <T, R, C extends Collection<? super R>> C m72540b(@C12579k List<? extends T> list, @C12579k C c, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(lVar.invoke(list.get(i)));
        }
        return c;
    }

    @C12579k
    /* renamed from: c */
    public static final <T, R> List<R> m72541c(@C12579k List<? extends T> list, @C12579k C11304p<? super T, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Object obj = list.get(0);
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        while (i < G) {
            i++;
            Object obj2 = list.get(i);
            arrayList.add(pVar.invoke(obj, obj2));
            obj = obj2;
        }
        return arrayList;
    }
}
