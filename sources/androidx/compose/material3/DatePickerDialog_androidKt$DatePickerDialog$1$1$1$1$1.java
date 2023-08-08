package androidx.compose.material3;

import androidx.compose.material3.tokens.C8313j;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $confirmButton;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dismissButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2) {
        super(2);
        this.$dismissButton = pVar;
        this.$$dirty = i;
        this.$confirmButton = pVar2;
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
                ComposerKt.m29845w0(-926980325, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:98)");
            }
            C16361p0 a = TypographyKt.m26914a(C8215i1.f20180a.mo12654c(oVar, 6), C8313j.f21402a.mo13799d());
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$dismissButton;
            final int i2 = this.$$dirty;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$confirmButton;
            TextKt.m26698a(a, C8553b.m31048b(oVar, -2020639284, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-2020639284, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                        }
                        float c = DatePickerDialog_androidKt.f19312b;
                        float b = DatePickerDialog_androidKt.f19313c;
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final int i2 = i2;
                        final C11304p<C8592o, Integer, C11079d2> pVar2 = pVar2;
                        AlertDialogKt.m25363b(c, b, C8553b.m31048b(oVar, -1863712509, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-1863712509, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                    }
                                    C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                                    oVar.mo14918M(1710961622);
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
            }), oVar, 48);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
