package androidx.compose.material;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomNavigationKt$BottomNavigationTransition$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $activeColor;
    final /* synthetic */ C11305q<Float, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $inactiveColor;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationTransition$2(long j, long j2, boolean z, C11305q<? super Float, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$activeColor = j;
        this.$inactiveColor = j2;
        this.$selected = z;
        this.$content = qVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BottomNavigationKt.m13277d(this.$activeColor, this.$inactiveColor, this.$selected, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}