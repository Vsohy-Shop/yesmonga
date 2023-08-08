package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8667t;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n1#2:299\n25#3:300\n1114#4,6:301\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n295#1:300\n295#1:301,6\n*E\n"})
/* renamed from: androidx.compose.runtime.f2 */
public final /* synthetic */ class C8539f2 {
    /* renamed from: a */
    public static final <T> T m30975a(@C12579k C8578k2<? extends T> k2Var, @C12580l Object obj, @C12579k C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return k2Var.getValue();
    }

    @C12579k
    /* renamed from: b */
    public static final <T> SnapshotStateList<T> m30976b() {
        return new SnapshotStateList<>();
    }

    @C12579k
    /* renamed from: c */
    public static final <T> SnapshotStateList<T> m30977c(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ArraysKt___ArraysKt.m39955kz(tArr));
        return snapshotStateList;
    }

    @C12579k
    /* renamed from: d */
    public static final <K, V> C8667t<K, V> m30978d() {
        return new C8667t<>();
    }

    @C12579k
    /* renamed from: e */
    public static final <K, V> C8667t<K, V> m30979e(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        C8667t<K, V> tVar = new C8667t<>();
        tVar.putAll(C10977s0.m41438H0(pairArr));
        return tVar;
    }

    @C12579k
    /* renamed from: f */
    public static final <T> C8700z0<T> m30980f(T t, @C12579k C8410b2<T> b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "policy");
        return ActualAndroid_androidKt.m29480a(t, b2Var);
    }

    /* renamed from: g */
    public static /* synthetic */ C8700z0 m30981g(Object obj, C8410b2 b2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            b2Var = C8415c2.m30254w();
        }
        return C8415c2.m30241j(obj, b2Var);
    }

    @C8540g
    @C12579k
    /* renamed from: h */
    public static final <T> C8578k2<T> m30982h(T t, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1058319986);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:294)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = m30981g(t, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        z0Var.setValue(t);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return z0Var;
    }

    /* renamed from: i */
    public static final <T> void m30983i(@C12579k C8700z0<T> z0Var, @C12580l Object obj, @C12579k C11510n<?> nVar, T t) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        z0Var.setValue(t);
    }

    @C12579k
    /* renamed from: j */
    public static final <T> SnapshotStateList<T> m30984j(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @C12579k
    /* renamed from: k */
    public static final <K, V> C8667t<K, V> m30985k(@C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        C8667t<K, V> tVar = new C8667t<>();
        tVar.putAll(C10977s0.m41426B0(iterable));
        return tVar;
    }
}
