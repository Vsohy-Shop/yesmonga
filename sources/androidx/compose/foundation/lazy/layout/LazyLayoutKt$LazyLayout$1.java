package androidx.compose.foundation.lazy.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.saveable.C8623b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,122:1\n25#2:123\n25#2:130\n50#2:137\n49#2:138\n1114#3,6:124\n1114#3,6:131\n1114#3,6:139\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$1\n*L\n51#1:123\n54#1:130\n68#1:137\n68#1:138\n51#1:124,6\n54#1:131,6\n68#1:139,6\n*E\n"})
public final class LazyLayoutKt$LazyLayout$1 extends Lambda implements C11305q<C8623b, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8578k2<C2549h> $currentItemProvider;
    final /* synthetic */ C11304p<C2552k, C16476b, C15564g0> $measurePolicy;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C2557o $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1(C2557o oVar, C8767m mVar, C11304p<? super C2552k, ? super C16476b, ? extends C15564g0> pVar, int i, C8578k2<? extends C2549h> k2Var) {
        super(3);
        this.$prefetchState = oVar;
        this.$modifier = mVar;
        this.$measurePolicy = pVar;
        this.$$dirty = i;
        this.$currentItemProvider = k2Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8690a(@org.jetbrains.annotations.C12579k androidx.compose.runtime.saveable.C8623b r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "saveableStateHolder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0014
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)"
            r2 = 1342877611(0x500aafab, float:9.3070735E9)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r12, r0, r1)
        L_0x0014:
            androidx.compose.runtime.k2<androidx.compose.foundation.lazy.layout.h> r12 = r9.$currentItemProvider
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r1 = r11.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r2.mo16277a()
            if (r1 != r3) goto L_0x0035
            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 r3 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
            r3.<init>(r12)
            r1.<init>(r10, r3)
            r11.mo14893C(r1)
        L_0x0035:
            r11.mo15002m0()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r1 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory) r1
            r11.mo14918M(r0)
            java.lang.Object r10 = r11.mo14921N()
            java.lang.Object r12 = r2.mo16277a()
            if (r10 != r12) goto L_0x0054
            androidx.compose.ui.layout.SubcomposeLayoutState r10 = new androidx.compose.ui.layout.SubcomposeLayoutState
            androidx.compose.foundation.lazy.layout.j r12 = new androidx.compose.foundation.lazy.layout.j
            r12.<init>(r1)
            r10.<init>((androidx.compose.p004ui.layout.C15565g1) r12)
            r11.mo14893C(r10)
        L_0x0054:
            r11.mo15002m0()
            r3 = r10
            androidx.compose.ui.layout.SubcomposeLayoutState r3 = (androidx.compose.p004ui.layout.SubcomposeLayoutState) r3
            androidx.compose.foundation.lazy.layout.o r10 = r9.$prefetchState
            r12 = -1523808544(0xffffffffa52c86e0, float:-1.4964319E-16)
            r11.mo14918M(r12)
            if (r10 != 0) goto L_0x0065
            goto L_0x0079
        L_0x0065:
            androidx.compose.foundation.lazy.layout.o r10 = r9.$prefetchState
            int r12 = r9.$$dirty
            int r12 = r12 >> 6
            r12 = r12 & 14
            r12 = r12 | 64
            int r0 = androidx.compose.p004ui.layout.SubcomposeLayoutState.f38676f
            int r0 = r0 << 6
            r12 = r12 | r0
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt.m11356a(r10, r1, r3, r11, r12)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
        L_0x0079:
            r11.mo15002m0()
            androidx.compose.ui.m r4 = r9.$modifier
            kotlin.jvm.functions.p<androidx.compose.foundation.lazy.layout.k, androidx.compose.ui.unit.b, androidx.compose.ui.layout.g0> r10 = r9.$measurePolicy
            r12 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo14918M(r12)
            boolean r12 = r11.mo15006n0(r1)
            boolean r0 = r11.mo15006n0(r10)
            r12 = r12 | r0
            java.lang.Object r0 = r11.mo14921N()
            if (r12 != 0) goto L_0x009b
            java.lang.Object r12 = r2.mo16277a()
            if (r0 != r12) goto L_0x00a3
        L_0x009b:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1 r0 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
            r0.<init>(r1, r10)
            r11.mo14893C(r0)
        L_0x00a3:
            r11.mo15002m0()
            r5 = r0
            kotlin.jvm.functions.p r5 = (kotlin.jvm.functions.C11304p) r5
            int r10 = androidx.compose.p004ui.layout.SubcomposeLayoutState.f38676f
            int r12 = r9.$$dirty
            r12 = r12 & 112(0x70, float:1.57E-43)
            r7 = r10 | r12
            r8 = 0
            r6 = r11
            androidx.compose.p004ui.layout.SubcomposeLayoutKt.m69022b(r3, r4, r5, r6, r7, r8)
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x00bf
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1.mo8690a(androidx.compose.runtime.saveable.b, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo8690a((C8623b) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
