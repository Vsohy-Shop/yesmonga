package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.lifecycle.C19456p0;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,255:1\n125#2:256\n152#2,3:257\n37#3,2:260\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n250#1:256\n250#1:257,3\n251#1:260,2\n*E\n"})
public final class CompositionLocalKt {
    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m29855a(@C12579k C8685v vVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(vVar, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(1853897736);
        if ((i & 14) == 0) {
            if (o.mo15006n0(vVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1853897736, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:246)");
            }
            C8452h<C8682u<Object>, C8578k2<Object>> a = vVar.mo16775a();
            ArrayList arrayList = new ArrayList(a.size());
            for (Map.Entry next : a.entrySet()) {
                Object key = next.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((C8550i1) key).mo16141f(((C8578k2) next.getValue()).getValue()));
            }
            C8572j1[] j1VarArr = (C8572j1[]) arrayList.toArray(new C8572j1[0]);
            m29856b((C8572j1[]) Arrays.copyOf(j1VarArr, j1VarArr.length), pVar, o, (i2 & 112) | 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CompositionLocalKt$CompositionLocalProvider$3(vVar, pVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: b */
    public static final void m29856b(@C12579k C8572j1<?>[] j1VarArr, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(j1VarArr, C19456p0.f49833g);
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-1390796515);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        o.mo15012p0(j1VarArr);
        pVar.invoke(o, Integer.valueOf((i >> 3) & 14));
        o.mo14973e0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CompositionLocalKt$CompositionLocalProvider$1(j1VarArr, pVar, i));
        }
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C8550i1<T> m29857c(@C12579k C8410b2<T> b2Var, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(b2Var, "policy");
        Intrinsics.checkNotNullParameter(aVar, "defaultFactory");
        return new C8537f0(b2Var, aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C8550i1 m29858d(C8410b2 b2Var, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            b2Var = C8415c2.m30254w();
        }
        return m29857c(b2Var, aVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C8550i1<T> m29859e(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "defaultFactory");
        return new C8583l2(aVar);
    }
}
