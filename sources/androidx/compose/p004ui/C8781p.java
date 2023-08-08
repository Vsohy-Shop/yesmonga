package androidx.compose.p004ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n33#2,6:214\n33#2,4:220\n38#2:225\n1#3:224\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n94#1:214,6\n137#1:220,4\n137#1:225\n*E\n"})
/* renamed from: androidx.compose.ui.p */
public final class C8781p {
    /* renamed from: a */
    public static final <T> void m32646a(Appendable appendable, T t, C11300l<? super T, ? extends CharSequence> lVar) {
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
    public static final <T, K, V> Map<K, V> m32647b(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) lVar.invoke(list.get(i));
            linkedHashMap.put(pair.mo21849e(), pair.mo21851f());
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final <T, A extends Appendable> A m32648c(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l<? super T, ? extends CharSequence> lVar) {
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
            m32646a(a, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: d */
    public static /* synthetic */ Appendable m32649d(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
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
        return m32648c(list, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, lVar2);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> String m32650e(@C12579k List<? extends T> list, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        String sb = ((StringBuilder) m32648c(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb;
    }

    /* renamed from: f */
    public static /* synthetic */ String m32651f(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
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
        return m32650e(list, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T, R> List<R> m32652g(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
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

    /* renamed from: h */
    public static final <S, T extends S> S m32653h(@C12579k List<? extends T> list, @C12579k C11304p<? super S, ? super T, ? extends S> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (!list.isEmpty()) {
            S w2 = CollectionsKt___CollectionsKt.m40706w2(list);
            int G = CollectionsKt__CollectionsKt.m40443G(list);
            int i = 1;
            if (1 <= G) {
                while (true) {
                    w2 = pVar.invoke(w2, list.get(i));
                    if (i == G) {
                        break;
                    }
                    i++;
                }
            }
            return w2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @C12579k
    /* renamed from: i */
    public static final <T, R, V> List<V> m32654i(@C12579k List<? extends T> list, @C12579k List<? extends R> list2, @C12579k C11304p<? super T, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: j */
    public static final <T, R> List<R> m32655j(@C12579k List<? extends T> list, @C12579k C11304p<? super T, ? super T, ? extends R> pVar) {
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
