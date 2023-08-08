package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,565:1\n76#2:566\n25#3:567\n1114#4,6:568\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n*L\n262#1:566\n263#1:567\n263#1:568,6\n*E\n"})
public final class ClickableKt$combinedClickable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C11289a<C11079d2> $onDoubleClick;
    final /* synthetic */ C11289a<C11079d2> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ C16031g $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickable$2(boolean z, String str, C16031g gVar, String str2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3) {
        super(3);
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = gVar;
        this.$onLongClickLabel = str2;
        this.$onLongClick = aVar;
        this.$onDoubleClick = aVar2;
        this.$onClick = aVar3;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7155a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1969174843);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1969174843, i, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C2104a0 a0Var = (C2104a0) oVar.mo15032w(IndicationKt.m8972a());
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C2242f.m9684a();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m f = ClickableKt.m8879f(aVar, (C2243g) N, a0Var, this.$enabled, this.$onClickLabel, this.$role, this.$onLongClickLabel, this.$onLongClick, this.$onDoubleClick, this.$onClick);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7155a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
