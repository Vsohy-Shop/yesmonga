package androidx.compose.material3;

import androidx.compose.material3.tokens.C8308h0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,637:1\n76#2:638\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n*L\n183#1:638\n*E\n"})
public final class NavigationBarKt$NavigationBarItem$styledLabel$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8252n1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$styledLabel$1$1(C8252n1 n1Var, boolean z, boolean z2, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(2);
        this.$colors = n1Var;
        this.$selected = z;
        this.$enabled = z2;
        this.$$dirty = i;
        this.$label = pVar;
    }

    /* renamed from: a */
    public static final long m25931a(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
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
                ComposerKt.m29845w0(1644987592, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
            }
            final C16361p0 a = TypographyKt.m26914a(C8215i1.f20180a.mo12654c(oVar, 6), C8308h0.f21270a.mo13668A());
            C8252n1 n1Var = this.$colors;
            boolean z = this.$selected;
            boolean z2 = this.$enabled;
            int i2 = this.$$dirty;
            C8572j1[] j1VarArr = {ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(m25931a(n1Var.mo12869c(z, z2, oVar, ((i2 >> 18) & 896) | ((i2 >> 3) & 14) | ((i2 >> 12) & 112)))))};
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$label;
            final int i3 = this.$$dirty;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 2061683080, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(2061683080, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                        }
                        TextKt.m26698a(a, pVar, oVar, (i3 >> 15) & 112);
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
