package kotlin.collections;

import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.C11110f;
import kotlin.internal.C11125m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* renamed from: kotlin.collections.s */
public class C10976s {
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: a */
    public static final <E> List<E> m41409a(@C12579k List<E> list) {
        Intrinsics.checkNotNullParameter(list, "builder");
        return ((ListBuilder) list).mo22085H();
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: b */
    public static final <E> List<E> m41410b(int i, C11300l<? super List<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        List j = m41418j(i);
        lVar.invoke(j);
        return m41409a(j);
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: c */
    public static final <E> List<E> m41411c(C11300l<? super List<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        List i = m41417i();
        lVar.invoke(i);
        return m41409a(i);
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: d */
    public static final int m41412d(int i) {
        if (i < 0) {
            if (C11125m.m42830a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.m40458V();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: e */
    public static final int m41413e(int i) {
        if (i < 0) {
            if (C11125m.m42830a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.m40459W();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i;
    }

    @C11110f
    /* renamed from: f */
    public static final Object[] m41414f(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return C11367t.m43656a(collection);
    }

    @C11110f
    /* renamed from: g */
    public static final <T> T[] m41415g(Collection<?> collection, T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(collection, tArr);
    }

    @C12579k
    /* renamed from: h */
    public static final <T> Object[] m41416h(@C12579k T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z && Intrinsics.areEqual((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: i */
    public static final <E> List<E> m41417i() {
        return new ListBuilder();
    }

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: j */
    public static final <E> List<E> m41418j(int i) {
        return new ListBuilder(i);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> List<T> m41419k(T t) {
        List<T> singletonList = Collections.singletonList(t);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(element)");
        return singletonList;
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: l */
    public static final <T> List<T> m41420l(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List<T> S5 = CollectionsKt___CollectionsKt.m40567S5(iterable);
        Collections.shuffle(S5);
        return S5;
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: m */
    public static final <T> List<T> m41421m(@C12579k Iterable<? extends T> iterable, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        List<T> S5 = CollectionsKt___CollectionsKt.m40567S5(iterable);
        Collections.shuffle(S5, random);
        return S5;
    }

    @C11110f
    /* renamed from: n */
    public static final <T> List<T> m41422n(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        ArrayList<T> list = Collections.list(enumeration);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        return list;
    }
}
