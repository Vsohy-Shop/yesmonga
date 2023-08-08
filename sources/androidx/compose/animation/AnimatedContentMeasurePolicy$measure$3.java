package androidx.compose.animation;

import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,780:1\n13579#2,2:781\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n748#1:781,2\n*E\n"})
public final class AnimatedContentMeasurePolicy$measure$3 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ C15611w0[] $placeables;
    final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(C15611w0[] w0VarArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i, int i2) {
        super(1);
        this.$placeables = w0VarArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    /* renamed from: a */
    public final void mo6405a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0[] w0VarArr = this.$placeables;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.this$0;
        int i = this.$maxWidth;
        int i2 = this.$maxHeight;
        for (C15611w0 w0Var : w0VarArr) {
            if (w0Var != null) {
                long a = animatedContentMeasurePolicy.mo6402j().mo6414l().mo17059a(C16502r.m74668a(w0Var.mo44471K0(), w0Var.mo44468G0()), C16502r.m74668a(i, i2), LayoutDirection.Ltr);
                C15611w0.C15612a.m69412p(aVar, w0Var, C16494m.m74581m(a), C16494m.m74583o(a), 0.0f, 4, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo6405a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
