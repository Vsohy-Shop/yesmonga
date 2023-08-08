package androidx.compose.p004ui.text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n33#2,6:290\n33#2,6:296\n33#2,6:302\n33#2,6:308\n33#2,6:314\n33#2,6:320\n1#3:326\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n37#1:290,6\n59#1:296,6\n110#1:302,6\n129#1:308,6\n148#1:314,6\n164#1:320,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.e0 */
public final class C16163e0 {
    /* renamed from: a */
    public static final <T> void m72796a(Appendable appendable, T t, C11300l<? super T, ? extends CharSequence> lVar) {
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

    @C12579k
    /* renamed from: b */
    public static final <T, K> List<T> m72797b(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (hashSet.add(lVar.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: c */
    public static final <T> List<T> m72798c(@C12579k List<? extends T> list, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return list;
        } else {
            int size = list.size() - i;
            if (size <= 0) {
                return CollectionsKt__CollectionsKt.m40441E();
            }
            if (size == 1) {
                return C10976s.m41419k(CollectionsKt___CollectionsKt.m40653k3(list));
            }
            ArrayList arrayList = new ArrayList(size);
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
            return arrayList;
        }
    }

    @C12579k
    /* renamed from: d */
    public static final <T> List<T> m72799d(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (lVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: e */
    public static final <T> List<T> m72800e(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!lVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: f */
    public static final <T> List<T> m72801f(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: g */
    public static final <T, R> List<R> m72802g(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(list.get(i)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m72803h(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r3, R r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r3.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x001c
            java.lang.Object r2 = r3.get(r1)
            java.lang.Object r4 = r5.invoke(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.C16163e0.m72803h(java.util.List, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* renamed from: i */
    public static final <T, A extends Appendable> A m72804i(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l<? super T, ? extends CharSequence> lVar) {
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
            m72796a(a, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: j */
    public static /* synthetic */ Appendable m72805j(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
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
        return m72804i(list, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, lVar2);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> String m72806k(@C12579k List<? extends T> list, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        String sb = ((StringBuilder) m72804i(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb;
    }

    /* renamed from: l */
    public static /* synthetic */ String m72807l(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
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
        return m72806k(list, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    @C12580l
    /* renamed from: m */
    public static final <T, R extends Comparable<? super R>> T m72808m(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
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
                if (comparable.compareTo(comparable2) > 0) {
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

    @C12579k
    /* renamed from: n */
    public static final <T> List<T> m72809n(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!lVar.invoke(obj).booleanValue()) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
