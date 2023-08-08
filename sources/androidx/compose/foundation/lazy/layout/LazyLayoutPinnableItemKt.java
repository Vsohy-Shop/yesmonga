package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.layout.C15608v0;
import androidx.compose.p004ui.layout.PinnableContainerKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n50#2:162\n49#2:163\n36#2:171\n1114#3,6:164\n1114#3,6:172\n76#4:170\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n49#1:162\n49#1:163\n52#1:171\n49#1:164,6\n52#1:172,6\n51#1:170\n*E\n"})
public final class LazyLayoutPinnableItemKt {
    @C8540g
    @C2855v
    /* renamed from: a */
    public static final void m11353a(@C12580l Object obj, int i, @C12579k C2555n nVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(nVar, "pinnedItemList");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-2079116560);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2079116560, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:42)");
        }
        o.mo14918M(511388516);
        boolean n0 = o.mo15006n0(obj) | o.mo15006n0(nVar);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2554m(obj, nVar);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C2554m mVar = (C2554m) N;
        mVar.mo8749g(i);
        mVar.mo8753i((C15608v0) o.mo15032w(PinnableContainerKt.m69012a()));
        o.mo14918M(1157296644);
        boolean n02 = o.mo15006n0(mVar);
        Object N2 = o.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(mVar);
            o.mo14893C(N2);
        }
        o.mo15002m0();
        EffectsKt.m29891c(mVar, (C11300l) N2, o, 0);
        CompositionLocalKt.m29856b(new C8572j1[]{PinnableContainerKt.m69012a().mo16141f(mVar)}, pVar, o, ((i2 >> 6) & 112) | 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(obj, i, nVar, pVar, i2));
        }
    }
}
