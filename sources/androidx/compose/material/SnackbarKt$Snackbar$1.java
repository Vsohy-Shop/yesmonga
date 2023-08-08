package androidx.compose.material;

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
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i, boolean z) {
        super(2);
        this.$action = pVar;
        this.$content = pVar2;
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
                ComposerKt.m29845w0(-2084221700, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
            }
            C8572j1[] j1VarArr = {ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C7904r.f18969a.mo10992c(oVar, 6)))};
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$action;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$content;
            final int i2 = this.$$dirty;
            final boolean z = this.$actionOnNewLine;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 1939362236, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1939362236, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                        }
                        C16361p0 d = C7933t0.f19075a.mo11077c(oVar, 6).mo11089d();
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final C11304p<C8592o, Integer, C11079d2> pVar2 = pVar2;
                        final int i2 = i2;
                        final boolean z = z;
                        TextKt.m14194a(d, C8553b.m31048b(oVar, 225114541, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(225114541, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                    }
                                    if (pVar == null) {
                                        oVar.mo14918M(59708346);
                                        SnackbarKt.m13865e(pVar2, oVar, (i2 >> 21) & 14);
                                        oVar.mo15002m0();
                                    } else if (z) {
                                        oVar.mo14918M(59708411);
                                        C11304p<C8592o, Integer, C11079d2> pVar = pVar2;
                                        C11304p<C8592o, Integer, C11079d2> pVar2 = pVar;
                                        int i2 = i2;
                                        SnackbarKt.m13861a(pVar, pVar2, oVar, (i2 & 112) | ((i2 >> 21) & 14));
                                        oVar.mo15002m0();
                                    } else {
                                        oVar.mo14918M(59708478);
                                        C11304p<C8592o, Integer, C11079d2> pVar3 = pVar2;
                                        C11304p<C8592o, Integer, C11079d2> pVar4 = pVar;
                                        int i3 = i2;
                                        SnackbarKt.m13862b(pVar3, pVar4, oVar, (i3 & 112) | ((i3 >> 21) & 14));
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
                        }), oVar, 48);
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
