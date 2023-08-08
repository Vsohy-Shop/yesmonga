package androidx.compose.material3;

import androidx.compose.material3.tokens.C8288a1;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarKt$Snackbar$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, long j, long j2, int i, boolean z) {
        super(2);
        this.$action = pVar;
        this.$content = pVar2;
        this.$dismissAction = pVar3;
        this.$actionContentColor = j;
        this.$dismissActionContentColor = j2;
        this.$$dirty = i;
        this.$actionOnNewLine = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1829663446, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:112)");
            }
            C8215i1 i1Var = C8215i1.f20180a;
            C8280s3 c = i1Var.mo12654c(oVar, 6);
            C8288a1 a1Var = C8288a1.f20706a;
            C16361p0 a = TypographyKt.m26914a(c, a1Var.mo13184p());
            final C16361p0 a2 = TypographyKt.m26914a(i1Var.mo12654c(oVar, 6), a1Var.mo13172d());
            C8572j1[] j1VarArr = {TextKt.m26703f().mo16141f(a)};
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$action;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$content;
            final C11304p<C8592o, Integer, C11079d2> pVar3 = this.$dismissAction;
            final long j = this.$actionContentColor;
            final long j2 = this.$dismissActionContentColor;
            final int i2 = this.$$dirty;
            final boolean z = this.$actionOnNewLine;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 835891690, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(835891690, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:115)");
                        }
                        if (pVar == null) {
                            oVar.mo14918M(-2104362496);
                            C11304p<C8592o, Integer, C11079d2> pVar = pVar2;
                            C11304p<C8592o, Integer, C11079d2> pVar2 = pVar3;
                            C16361p0 p0Var = a2;
                            long j = j;
                            long j2 = j2;
                            int i2 = i2;
                            C8592o oVar2 = oVar;
                            SnackbarKt.m26288b(pVar, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, pVar2, p0Var, j, j2, oVar2, (57344 & (i2 >> 9)) | ((i2 >> 27) & 14) | 48 | (i2 & 896) | ((i2 >> 9) & 458752));
                            oVar.mo15002m0();
                        } else if (z) {
                            oVar.mo14918M(-2104362182);
                            C11304p<C8592o, Integer, C11079d2> pVar3 = pVar2;
                            C11304p<C8592o, Integer, C11079d2> pVar4 = pVar;
                            C11304p<C8592o, Integer, C11079d2> pVar5 = pVar3;
                            C16361p0 p0Var2 = a2;
                            long j3 = j;
                            long j4 = j2;
                            int i3 = i2;
                            C8592o oVar3 = oVar;
                            SnackbarKt.m26287a(pVar3, pVar4, pVar5, p0Var2, j3, j4, oVar3, (57344 & (i3 >> 9)) | ((i3 >> 27) & 14) | (i3 & 112) | (i3 & 896) | ((i3 >> 9) & 458752));
                            oVar.mo15002m0();
                        } else {
                            oVar.mo14918M(-2104361902);
                            C11304p<C8592o, Integer, C11079d2> pVar6 = pVar2;
                            C11304p<C8592o, Integer, C11079d2> pVar7 = pVar;
                            C11304p<C8592o, Integer, C11079d2> pVar8 = pVar3;
                            C16361p0 p0Var3 = a2;
                            long j5 = j;
                            long j6 = j2;
                            int i4 = i2;
                            C8592o oVar4 = oVar;
                            SnackbarKt.m26288b(pVar6, pVar7, pVar8, p0Var3, j5, j6, oVar4, (57344 & (i4 >> 9)) | ((i4 >> 27) & 14) | (i4 & 112) | (i4 & 896) | ((i4 >> 9) & 458752));
                            oVar.mo15002m0();
                        }
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
