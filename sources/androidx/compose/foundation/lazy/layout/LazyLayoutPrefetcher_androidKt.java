package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.layout.SubcomposeLayoutState;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n76#2:312\n67#3,3:313\n66#3:316\n1114#4,6:317\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n*L\n41#1:312\n42#1:313,3\n42#1:316\n42#1:317,6\n*E\n"})
public final class LazyLayoutPrefetcher_androidKt {
    @C8540g
    @C2855v
    /* renamed from: a */
    public static final void m11356a(@C12579k C2557o oVar, @C12579k LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @C12579k SubcomposeLayoutState subcomposeLayoutState, @C12580l C8592o oVar2, int i) {
        Intrinsics.checkNotNullParameter(oVar, "prefetchState");
        Intrinsics.checkNotNullParameter(lazyLayoutItemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        C8592o o = oVar2.mo15009o(1113453182);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1113453182, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:35)");
        }
        View view = (View) o.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        int i2 = SubcomposeLayoutState.f38676f;
        o.mo14918M(1618982084);
        boolean n0 = o.mo15006n0(subcomposeLayoutState) | o.mo15006n0(oVar) | o.mo15006n0(view);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            o.mo14893C(new C2560p(oVar, subcomposeLayoutState, lazyLayoutItemContentFactory, view));
        }
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(oVar, lazyLayoutItemContentFactory, subcomposeLayoutState, i));
        }
    }
}
