package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/unit/q;", "it", "a", "(J)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class EnterExitTransitionKt$expandVertically$2 extends Lambda implements C11300l<C16500q, C16500q> {
    final /* synthetic */ C11300l<Integer, Integer> $initialHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$expandVertically$2(C11300l<? super Integer, Integer> lVar) {
        super(1);
        this.$initialHeight = lVar;
    }

    /* renamed from: a */
    public final long mo6526a(long j) {
        return C16502r.m74668a(C16500q.m74662m(j), this.$initialHeight.invoke(Integer.valueOf(C16500q.m74659j(j))).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C16500q.m74651b(mo6526a(((C16500q) obj).mo47895q()));
    }
}
