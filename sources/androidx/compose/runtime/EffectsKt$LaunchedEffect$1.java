package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class EffectsKt$LaunchedEffect$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C12074o0, C11045c<? super C11079d2>, Object> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectsKt$LaunchedEffect$1(C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, int i) {
        super(2);
        this.$block = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        EffectsKt.m29897i(this.$block, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
