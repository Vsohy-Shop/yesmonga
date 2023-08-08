package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ClickableKt$PressedInteractionSourceDisposableEffect$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Map<C15434a, C2245i.C2247b> $currentKeyPressInteractions;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8700z0<C2245i.C2247b> $pressedInteraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$2(C2243g gVar, C8700z0<C2245i.C2247b> z0Var, Map<C15434a, C2245i.C2247b> map, int i) {
        super(2);
        this.$interactionSource = gVar;
        this.$pressedInteraction = z0Var;
        this.$currentKeyPressInteractions = map;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ClickableKt.m8874a(this.$interactionSource, this.$pressedInteraction, this.$currentKeyPressInteractions, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
