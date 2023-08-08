package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1664:1\n76#2:1665\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n*L\n1088#1:1665\n*E\n"})
public final class AppBarKt$SingleRowTopAppBar$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ C8270q3 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $navigationIcon;
    final /* synthetic */ C8275r3 $scrollBehavior;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ C16361p0 $titleTextStyle;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$2(C2354e1 e1Var, C8270q3 q3Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i, C8275r3 r3Var) {
        super(2);
        this.$windowInsets = e1Var;
        this.$colors = q3Var;
        this.$title = pVar;
        this.$titleTextStyle = p0Var;
        this.$centeredTitle = z;
        this.$navigationIcon = pVar2;
        this.$actionsRow = pVar3;
        this.$$dirty = i;
        this.$scrollBehavior = r3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r2 = r2.getState();
     */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0015
            boolean r2 = r23.mo15011p()
            if (r2 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r23.mo14958a0()
            goto L_0x00ba
        L_0x0015:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0024
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1086)"
            r4 = 376925230(0x16776c2e, float:1.9986637E-25)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0024:
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            r14 = r23
            java.lang.Object r1 = r14.mo15032w(r1)
            androidx.compose.material3.r3 r2 = r0.$scrollBehavior
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            androidx.compose.material3.tokens.k1 r3 = androidx.compose.material3.tokens.C8318k1.f21543a
            float r3 = r3.mo13928c()
            float r1 = r1.mo7425g5(r3)
            if (r2 == 0) goto L_0x0049
            androidx.compose.material3.TopAppBarState r2 = r2.getState()
            if (r2 == 0) goto L_0x0049
            float r2 = r2.mo12413d()
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            float r3 = r1 + r2
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.e1 r2 = r0.$windowInsets
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.m10247g(r1, r2)
            androidx.compose.ui.m r2 = androidx.compose.p004ui.draw.C8744d.m32515b(r1)
            androidx.compose.material3.q3 r1 = r0.$colors
            long r4 = r1.mo12937c()
            androidx.compose.material3.q3 r1 = r0.$colors
            long r6 = r1.mo12938d()
            androidx.compose.material3.q3 r1 = r0.$colors
            long r8 = r1.mo12936b()
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r10 = r0.$title
            androidx.compose.ui.text.p0 r11 = r0.$titleTextStyle
            r12 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r13 = r1.mo7625f()
            boolean r15 = r0.$centeredTitle
            if (r15 == 0) goto L_0x007f
            androidx.compose.foundation.layout.Arrangement$e r1 = r1.mo7625f()
            goto L_0x0083
        L_0x007f:
            androidx.compose.foundation.layout.Arrangement$d r1 = r1.mo7630p()
        L_0x0083:
            r15 = 0
            r16 = 0
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r15 = r0.$navigationIcon
            r17 = r15
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r15 = r0.$actionsRow
            r18 = r15
            int r15 = r0.$$dirty
            int r19 = r15 << 12
            r20 = 458752(0x70000, float:6.42848E-40)
            r19 = r19 & r20
            r20 = 113246208(0x6c00000, float:7.2222373E-35)
            r19 = r19 | r20
            r20 = 3670016(0x380000, float:5.142788E-39)
            int r21 = r15 << 12
            r20 = r21 & r20
            r20 = r19 | r20
            int r15 = r15 >> 6
            r15 = r15 & 896(0x380, float:1.256E-42)
            r15 = r15 | 3126(0xc36, float:4.38E-42)
            r21 = r15
            r14 = r1
            r19 = r23
            r15 = 0
            androidx.compose.material3.AppBarKt.m25390j(r2, r3, r4, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00ba
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
