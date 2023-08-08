package androidx.compose.material3;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.material3.tokens.C8289b;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BadgeKt$Badge$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2411u0 $this_Row;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$1$1(C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C2411u0 u0Var, int i, int i2) {
        super(2);
        this.$content = qVar;
        this.$this_Row = u0Var;
        this.$$changed = i;
        this.$$dirty = i2;
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
                ComposerKt.m29845w0(5609066, i, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
            }
            C16361p0 a = C8377z0.m29474a(TypographyKt.m26914a(C8215i1.f20180a.mo12654c(oVar, 6), C8289b.f20724a.mo13189d()), false);
            final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$content;
            final C2411u0 u0Var = this.$this_Row;
            final int i2 = this.$$changed;
            final int i3 = this.$$dirty;
            TextKt.m26698a(a, C8553b.m31048b(oVar, -1175098791, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1175098791, i, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:179)");
                        }
                        qVar.invoke(u0Var, oVar, Integer.valueOf((i2 & 14) | ((i3 >> 6) & 112)));
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
