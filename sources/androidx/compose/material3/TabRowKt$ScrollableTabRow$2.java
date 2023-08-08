package androidx.compose.material3;

import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,505:1\n474#2,4:506\n478#2,2:514\n482#2:520\n25#3:510\n50#3:521\n49#3:522\n1114#4,3:511\n1117#4,3:517\n1114#4,6:523\n474#5:516\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2\n*L\n250#1:506,4\n250#1:514,2\n250#1:520\n250#1:510\n251#1:521\n251#1:522\n250#1:511,3\n250#1:517,3\n251#1:523,6\n250#1:516\n*E\n"})
public final class TabRowKt$ScrollableTabRow$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ C11305q<List<C8184c3>, C8592o, Integer, C11079d2> $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$2(float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i, C11305q<? super List<C8184c3>, ? super C8592o, ? super Integer, C11079d2> qVar, int i2) {
        super(2);
        this.$edgePadding = f;
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$selectedTabIndex = i;
        this.$indicator = qVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.compose.material3.ScrollableTabData} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r2 & 11
            r4 = 2
            if (r3 != r4) goto L_0x0017
            boolean r3 = r19.mo15011p()
            if (r3 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r19.mo14958a0()
            goto L_0x00cd
        L_0x0017:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0026
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:247)"
            r6 = 286469328(0x11132cd0, float:1.1610064E-28)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r2, r3, r5)
        L_0x0026:
            r2 = 0
            r3 = 1
            androidx.compose.foundation.ScrollState r6 = androidx.compose.foundation.ScrollKt.m9056c(r2, r1, r2, r3)
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.mo14918M(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r5)
            java.lang.Object r5 = r19.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r7.mo16277a()
            if (r5 != r8) goto L_0x0053
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r5 = androidx.compose.runtime.EffectsKt.m29901m(r5, r1)
            androidx.compose.runtime.w r8 = new androidx.compose.runtime.w
            r8.<init>(r5)
            r1.mo14893C(r8)
            r5 = r8
        L_0x0053:
            r19.mo15002m0()
            androidx.compose.runtime.w r5 = (androidx.compose.runtime.C8690w) r5
            kotlinx.coroutines.o0 r5 = r5.mo16831a()
            r19.mo15002m0()
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r8)
            boolean r8 = r1.mo15006n0(r6)
            boolean r9 = r1.mo15006n0(r5)
            r8 = r8 | r9
            java.lang.Object r9 = r19.mo14921N()
            if (r8 != 0) goto L_0x007a
            java.lang.Object r7 = r7.mo16277a()
            if (r9 != r7) goto L_0x0082
        L_0x007a:
            androidx.compose.material3.ScrollableTabData r9 = new androidx.compose.material3.ScrollableTabData
            r9.<init>(r6, r5)
            r1.mo14893C(r9)
        L_0x0082:
            r19.mo15002m0()
            r14 = r9
            androidx.compose.material3.ScrollableTabData r14 = (androidx.compose.material3.ScrollableTabData) r14
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r7 = 0
            r8 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r7, r3, r8)
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r5 = r5.mo17069o()
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10098N(r3, r5, r2, r4, r8)
            r7 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.ScrollKt.m9055b(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.m r3 = androidx.compose.foundation.selection.SelectableGroupKt.m12057a(r3)
            androidx.compose.ui.m r3 = androidx.compose.p004ui.draw.C8744d.m32515b(r3)
            androidx.compose.material3.TabRowKt$ScrollableTabRow$2$1 r4 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$2$1
            float r11 = r0.$edgePadding
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r12 = r0.$tabs
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r13 = r0.$divider
            int r15 = r0.$selectedTabIndex
            kotlin.jvm.functions.q<java.util.List<androidx.compose.material3.c3>, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r5 = r0.$indicator
            int r6 = r0.$$dirty
            r10 = r4
            r16 = r5
            r17 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.p004ui.layout.SubcomposeLayoutKt.m69021a(r3, r4, r1, r2, r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00cd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
