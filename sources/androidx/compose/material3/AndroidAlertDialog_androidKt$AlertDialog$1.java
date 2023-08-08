package androidx.compose.material3;

import androidx.compose.material3.tokens.C8313j;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AndroidAlertDialog_androidKt$AlertDialog$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dismissButton;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C15218g4 g4Var, long j, float f, long j2, long j3, long j4, int i, int i2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5) {
        super(2);
        this.$icon = pVar;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$shape = g4Var;
        this.$containerColor = j;
        this.$tonalElevation = f;
        this.$iconContentColor = j2;
        this.$titleContentColor = j3;
        this.$textContentColor = j4;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$dismissButton = pVar4;
        this.$confirmButton = pVar5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(741647174, i2, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:91)");
            }
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$dismissButton;
            final int i3 = this.$$dirty;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$confirmButton;
            C8552a b = C8553b.m31048b(oVar2, -1873210524, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1873210524, i, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:93)");
                        }
                        float d = AndroidAlertDialog_androidKt.f19153a;
                        float c = AndroidAlertDialog_androidKt.f19154b;
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final int i2 = i3;
                        final C11304p<C8592o, Integer, C11079d2> pVar2 = pVar2;
                        AlertDialogKt.m25363b(d, c, C8553b.m31048b(oVar, 628285581, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(628285581, i, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:97)");
                                    }
                                    C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                                    oVar.mo14918M(-1969500715);
                                    if (pVar != null) {
                                        pVar.invoke(oVar, Integer.valueOf((i2 >> 9) & 14));
                                        C11079d2 d2Var = C11079d2.f28267a;
                                    }
                                    oVar.mo15002m0();
                                    pVar2.invoke(oVar, Integer.valueOf((i2 >> 3) & 14));
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), oVar, 438);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            });
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$icon;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$title;
            C11304p<C8592o, Integer, C11079d2> pVar5 = this.$text;
            C15218g4 g4Var = this.$shape;
            long j = this.$containerColor;
            float f = this.$tonalElevation;
            long k = ColorSchemeKt.m25524k(C8313j.f21402a.mo13798c(), oVar2, 6);
            long j2 = this.$iconContentColor;
            C11304p<C8592o, Integer, C11079d2> pVar6 = pVar3;
            long j3 = this.$titleContentColor;
            long j4 = this.$textContentColor;
            int i4 = this.$$dirty;
            C8552a aVar = b;
            int i5 = this.$$dirty1;
            int i6 = ((i4 >> 6) & 7168) | ((i4 >> 6) & 896) | 6 | ((i4 >> 6) & 57344) | ((i4 >> 6) & 458752) | ((i4 >> 6) & 3670016) | ((i5 << 15) & 29360128) | (i4 & 1879048192);
            int i7 = (i5 & 14) | (i5 & 112);
            C8552a aVar2 = aVar;
            AlertDialogKt.m25362a(aVar2, (C8767m) null, pVar6, pVar4, pVar5, g4Var, j, f, k, j2, j3, j4, oVar, i6, i7, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
