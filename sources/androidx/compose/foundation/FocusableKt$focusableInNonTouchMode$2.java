package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15077q;
import androidx.compose.p004ui.focus.FocusProperties;
import androidx.compose.p004ui.input.C15430a;
import androidx.compose.p004ui.input.C15432b;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,227:1\n76#2:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n*L\n218#1:228\n*E\n"})
public final class FocusableKt$focusableInNonTouchMode$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusableInNonTouchMode$2(boolean z, C2243g gVar) {
        super(3);
        this.$enabled = z;
        this.$interactionSource = gVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7182a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-618949501);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-618949501, i, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)");
        }
        final C15432b bVar = (C15432b) oVar.mo15032w(CompositionLocalsKt.m71017o());
        C8767m b = FocusableKt.m8919b(C15077q.m64794a(C8767m.f23478j, new C11300l<FocusProperties, C11079d2>() {
            /* renamed from: a */
            public final void mo7183a(@C12579k FocusProperties focusProperties) {
                Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                focusProperties.mo42102h(!C15430a.m67354f(bVar.mo43614b(), C15430a.f38121b.mo43612b()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo7183a((FocusProperties) obj);
                return C11079d2.f28267a;
            }
        }), this.$enabled, this.$interactionSource);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7182a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
