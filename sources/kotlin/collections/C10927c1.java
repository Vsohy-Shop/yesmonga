package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.collections.builders.SetBuilder;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.c1 */
public class C10927c1 {
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: a */
    public static final <E> Set<E> m40878a(@C12579k Set<E> set) {
        Intrinsics.checkNotNullParameter(set, "builder");
        return ((SetBuilder) set).mo22203h();
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: b */
    public static final <E> Set<E> m40879b(int i, C11300l<? super Set<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Set e = m40882e(i);
        lVar.invoke(e);
        return m40878a(e);
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: c */
    public static final <E> Set<E> m40880c(C11300l<? super Set<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Set d = m40881d();
        lVar.invoke(d);
        return m40878a(d);
    }

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: d */
    public static final <E> Set<E> m40881d() {
        return new SetBuilder();
    }

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: e */
    public static final <E> Set<E> m40882e(int i) {
        return new SetBuilder(i);
    }

    @C12579k
    /* renamed from: f */
    public static final <T> Set<T> m40883f(T t) {
        Set<T> singleton = Collections.singleton(t);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(element)");
        return singleton;
    }

    @C12579k
    /* renamed from: g */
    public static final <T> TreeSet<T> m40884g(@C12579k Comparator<? super T> comparator, @C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return (TreeSet) ArraysKt___ArraysKt.m39287Py(tArr, new TreeSet(comparator));
    }

    @C12579k
    /* renamed from: h */
    public static final <T> TreeSet<T> m40885h(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return (TreeSet) ArraysKt___ArraysKt.m39287Py(tArr, new TreeSet());
    }
}
