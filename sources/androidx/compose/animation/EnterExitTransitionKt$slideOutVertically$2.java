package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/unit/q;", "it", "Landroidx/compose/ui/unit/m;", "a", "(J)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class EnterExitTransitionKt$slideOutVertically$2 extends Lambda implements C11300l<C16500q, C16494m> {
    final /* synthetic */ C11300l<Integer, Integer> $targetOffsetY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideOutVertically$2(C11300l<? super Integer, Integer> lVar) {
        super(1);
        this.$targetOffsetY = lVar;
    }

    /* renamed from: a */
    public final long mo6541a(long j) {
        return C16496n.m74593a(0, this.$targetOffsetY.invoke(Integer.valueOf(C16500q.m74659j(j))).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C16494m.m74570b(mo6541a(((C16500q) obj).mo47895q()));
    }
}
