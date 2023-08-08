package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.a */
public final class C8634a {
    /* renamed from: a */
    public static final <T> void m31587a(Appendable appendable, T t, C11300l<? super T, ? extends CharSequence> lVar) {
        boolean z;
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    /* renamed from: b */
    public static final <T> boolean m31588b(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
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

    /* renamed from: c */
    public static final <T> boolean m31589c(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
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

    @C12579k
    /* renamed from: d */
    public static final <T> List<T> m31590d(@C12579k List<? extends T> list, @C12579k C11304p<? super Integer, ? super T, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (pVar.invoke(Integer.valueOf(i), obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final <T> void m31591e(@C12579k List<? extends T> list, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lVar.invoke(list.get(i));
        }
    }

    /* renamed from: f */
    public static final <T> void m31592f(@C12579k List<? extends T> list, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    @C12579k
    /* renamed from: g */
    public static final <T, K> Map<K, List<T>> m31593g(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object invoke = lVar.invoke(obj);
            Object obj2 = hashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(invoke, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        return hashMap;
    }

    /* renamed from: h */
    public static final <T, A extends Appendable> A m31594h(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l<? super T, ? extends CharSequence> lVar) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            m31587a(a, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: i */
    public static /* synthetic */ Appendable m31595i(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        C11300l lVar2;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return m31594h(list, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, lVar2);
    }

    @C12579k
    /* renamed from: j */
    public static final <T> String m31596j(@C12579k List<? extends T> list, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        String sb = ((StringBuilder) m31594h(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb;
    }

    /* renamed from: k */
    public static /* synthetic */ String m31597k(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m31596j(list, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    @C12579k
    /* renamed from: l */
    public static final <T, R> List<R> m31598l(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
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
    /* renamed from: m */
    public static final <T, R> List<R> m31599m(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = lVar.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: n */
    public static final <T> Set<T> m31600n(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
