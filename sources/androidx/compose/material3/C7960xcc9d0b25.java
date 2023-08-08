package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
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
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1 */
public final class C7960xcc9d0b25 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $body;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $sheetPeekHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7960xcc9d0b25(C8767m mVar, long j, long j2, int i, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, float f) {
        super(2);
        this.$modifier = mVar;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$$dirty = i;
        this.$body = qVar;
        this.$sheetPeekHeight = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1459220575, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:346)");
            }
            C8767m mVar = this.$modifier;
            long j = this.$containerColor;
            long j2 = this.$contentColor;
            final C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = this.$body;
            final float f = this.$sheetPeekHeight;
            final int i3 = this.$$dirty;
            C8552a b = C8553b.m31048b(oVar, 1725620860, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1725620860, i, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:351)");
                        }
                        qVar.invoke(PaddingKt.m10018e(0.0f, 0.0f, 0.0f, f, 7, (Object) null), oVar, Integer.valueOf((i3 >> 3) & 112));
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            });
            int i4 = this.$$dirty;
            SurfaceKt.m26352a(mVar, (C15218g4) null, j, j2, 0.0f, 0.0f, (C2223i) null, b, oVar, (i4 & 14) | 12582912 | ((i4 >> 18) & 896) | ((i4 >> 18) & 7168), 114);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
