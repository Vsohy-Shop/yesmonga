package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8667t;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.c2 */
public final class C8415c2 {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final <T extends R, R> C8578k2<R> m30232a(@C12579k C11907e<? extends T> eVar, R r, @C12580l CoroutineContext coroutineContext, @C12580l C8592o oVar, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.m30171b(eVar, r, coroutineContext, oVar, i, i2);
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final <T> C8578k2<T> m30233b(@C12579k C11952u<? extends T> uVar, @C12580l CoroutineContext coroutineContext, @C12580l C8592o oVar, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.m30172c(uVar, coroutineContext, oVar, i, i2);
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C8578k2<T> m30234c(@C12579k C8410b2<T> b2Var, @C12579k C11289a<? extends T> aVar) {
        return C8432d2.m30440c(b2Var, aVar);
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C8578k2<T> m30235d(@C12579k C11289a<? extends T> aVar) {
        return C8432d2.m30441d(aVar);
    }

    /* renamed from: e */
    public static final <T> T m30236e(@C12579k C8578k2<? extends T> k2Var, @C12580l Object obj, @C12579k C11510n<?> nVar) {
        return C8539f2.m30975a(k2Var, obj, nVar);
    }

    @C12579k
    /* renamed from: f */
    public static final <T> SnapshotStateList<T> m30237f() {
        return C8539f2.m30976b();
    }

    @C12579k
    /* renamed from: g */
    public static final <T> SnapshotStateList<T> m30238g(@C12579k T... tArr) {
        return C8539f2.m30977c(tArr);
    }

    @C12579k
    /* renamed from: h */
    public static final <K, V> C8667t<K, V> m30239h() {
        return C8539f2.m30978d();
    }

    @C12579k
    /* renamed from: i */
    public static final <K, V> C8667t<K, V> m30240i(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        return C8539f2.m30979e(pairArr);
    }

    @C12579k
    /* renamed from: j */
    public static final <T> C8700z0<T> m30241j(T t, @C12579k C8410b2<T> b2Var) {
        return C8539f2.m30980f(t, b2Var);
    }

    @C12579k
    /* renamed from: l */
    public static final <T> C8410b2<T> m30243l() {
        return C8437e2.m30454a();
    }

    /* renamed from: m */
    public static final <R> void m30244m(@C12579k C11300l<? super C8578k2<?>, C11079d2> lVar, @C12579k C11300l<? super C8578k2<?>, C11079d2> lVar2, @C12579k C11289a<? extends R> aVar) {
        C8432d2.m30443f(lVar, lVar2, aVar);
    }

    @C8540g
    @C12579k
    /* renamed from: n */
    public static final <T> C8578k2<T> m30245n(T t, @C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12579k C11304p<? super C8546h1<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        return SnapshotStateKt__ProduceStateKt.m30165a(t, obj, obj2, obj3, pVar, oVar, i);
    }

    @C8540g
    @C12579k
    /* renamed from: o */
    public static final <T> C8578k2<T> m30246o(T t, @C12580l Object obj, @C12580l Object obj2, @C12579k C11304p<? super C8546h1<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        return SnapshotStateKt__ProduceStateKt.m30166b(t, obj, obj2, pVar, oVar, i);
    }

    @C8540g
    @C12579k
    /* renamed from: p */
    public static final <T> C8578k2<T> m30247p(T t, @C12580l Object obj, @C12579k C11304p<? super C8546h1<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        return SnapshotStateKt__ProduceStateKt.m30167c(t, obj, pVar, oVar, i);
    }

    @C8540g
    @C12579k
    /* renamed from: q */
    public static final <T> C8578k2<T> m30248q(T t, @C12579k C11304p<? super C8546h1<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        return SnapshotStateKt__ProduceStateKt.m30168d(t, pVar, oVar, i);
    }

    @C8540g
    @C12579k
    /* renamed from: r */
    public static final <T> C8578k2<T> m30249r(T t, @C12579k Object[] objArr, @C12579k C11304p<? super C8546h1<T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12580l C8592o oVar, int i) {
        return SnapshotStateKt__ProduceStateKt.m30169e(t, objArr, pVar, oVar, i);
    }

    @C12579k
    /* renamed from: s */
    public static final <T> C8410b2<T> m30250s() {
        return C8437e2.m30455b();
    }

    @C8540g
    @C12579k
    /* renamed from: t */
    public static final <T> C8578k2<T> m30251t(T t, @C12580l C8592o oVar, int i) {
        return C8539f2.m30982h(t, oVar, i);
    }

    /* renamed from: u */
    public static final <T> void m30252u(@C12579k C8700z0<T> z0Var, @C12580l Object obj, @C12579k C11510n<?> nVar, T t) {
        C8539f2.m30983i(z0Var, obj, nVar, t);
    }

    @C12579k
    /* renamed from: v */
    public static final <T> C11907e<T> m30253v(@C12579k C11289a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.m30174e(aVar);
    }

    @C12579k
    /* renamed from: w */
    public static final <T> C8410b2<T> m30254w() {
        return C8437e2.m30456c();
    }

    @C12579k
    /* renamed from: x */
    public static final <T> SnapshotStateList<T> m30255x(@C12579k Collection<? extends T> collection) {
        return C8539f2.m30984j(collection);
    }

    @C12579k
    /* renamed from: y */
    public static final <K, V> C8667t<K, V> m30256y(@C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return C8539f2.m30985k(iterable);
    }
}
