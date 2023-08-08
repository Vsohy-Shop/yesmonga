package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1747#2,3:175\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n173#1:175,3\n*E\n"})
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @C8540g
    @C12579k
    /* renamed from: b */
    public static final <T extends R, R> C8578k2<R> m30171b(@C12579k C11907e<? extends T> eVar, R r, @C12580l CoroutineContext coroutineContext, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        oVar.mo14918M(-606625098);
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        int i3 = i >> 3;
        C8578k2<R> o = C8415c2.m30246o(r, eVar, coroutineContext2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(coroutineContext2, eVar, (C11045c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1>) null), oVar, (i3 & 8) | 4672 | (i3 & 14));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return o;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final <T> C8578k2<T> m30172c(@C12579k C11952u<? extends T> uVar, @C12580l CoroutineContext coroutineContext, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        oVar.mo14918M(-1439883919);
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        C8578k2<T> a = C8415c2.m30232a(uVar, uVar.getValue(), coroutineContext2, oVar, 520, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    /* renamed from: d */
    public static final <T> boolean m30173d(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            Iterable<Object> iterable = set;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (Object contains : iterable) {
                    if (set2.contains(contains)) {
                        return true;
                    }
                }
            }
        } else {
            Iterable<Object> iterable2 = set2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (Object contains2 : iterable2) {
                    if (set.contains(contains2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m30174e(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        return C11909g.m47376J0(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, (C11045c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1>) null));
    }
}
