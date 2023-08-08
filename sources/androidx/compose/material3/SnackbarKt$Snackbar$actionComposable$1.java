package androidx.compose.material3;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,435:1\n36#2:436\n1114#3,6:437\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n*L\n214#1:436\n214#1:437,6\n*E\n"})
public final class SnackbarKt$Snackbar$actionComposable$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $actionColor;
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ C8269q2 $snackbarData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1(long j, int i, C8269q2 q2Var, String str) {
        super(2);
        this.$actionColor = j;
        this.$$dirty = i;
        this.$snackbarData = q2Var;
        this.$actionLabel = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            r13 = r16
            r1 = r17
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0016
            boolean r2 = r16.mo15011p()
            if (r2 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r16.mo14958a0()
            goto L_0x0090
        L_0x0016:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:210)"
            r4 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0025:
            androidx.compose.material3.k r1 = androidx.compose.material3.C8232k.f20254a
            r2 = 0
            long r4 = r0.$actionColor
            r6 = 0
            r8 = 0
            int r10 = r0.$$dirty
            int r10 = r10 >> 15
            r10 = r10 & 112(0x70, float:1.57E-43)
            r11 = r10 | 24576(0x6000, float:3.4438E-41)
            r12 = 13
            r10 = r16
            androidx.compose.material3.j r5 = r1.mo12750v(r2, r4, r6, r8, r10, r11, r12)
            androidx.compose.material3.q2 r1 = r0.$snackbarData
            r2 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r2)
            boolean r2 = r13.mo15006n0(r1)
            java.lang.Object r3 = r16.mo14921N()
            if (r2 != 0) goto L_0x0059
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0061
        L_0x0059:
            androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1 r3 = new androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
            r3.<init>(r1)
            r13.mo14893C(r3)
        L_0x0061:
            r16.mo15002m0()
            r1 = r3
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2 r10 = new androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2
            java.lang.String r11 = r0.$actionLabel
            r10.<init>(r11)
            r11 = 521110564(0x1f0f8424, float:3.0390732E-20)
            r12 = 1
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r11, r12, r10)
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r14 = 494(0x1ee, float:6.92E-43)
            r11 = r16
            r13 = r14
            androidx.compose.material3.ButtonKt.m25461e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0090
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
