package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
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
public final class TextFieldImplKt$Decoration$colorAndEmphasis$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ Float $contentAlpha;
    final /* synthetic */ long $contentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$Decoration$colorAndEmphasis$1(long j, Float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$contentColor = j;
        this.$contentAlpha = f;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(494684590, i, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:237)");
            }
            C8572j1[] j1VarArr = {ContentColorKt.m13406a().mo16141f(C15240j2.m66071n(this.$contentColor))};
            final Float f = this.$contentAlpha;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            final int i2 = this.$$dirty;
            final long j = this.$contentColor;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, -1132188434, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1132188434, i, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:238)");
                        }
                        if (f != null) {
                            oVar.mo14918M(-452622131);
                            CompositionLocalKt.m29856b(new C8572j1[]{ContentAlphaKt.m13404a().mo16141f(f)}, pVar, oVar, ((i2 >> 6) & 112) | 8);
                            oVar.mo15002m0();
                        } else {
                            oVar.mo14918M(-452621951);
                            CompositionLocalKt.m29856b(new C8572j1[]{ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(j)))}, pVar, oVar, ((i2 >> 6) & 112) | 8);
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
