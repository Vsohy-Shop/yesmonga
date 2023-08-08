package androidx.compose.animation.core;

import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/unit/q;", "it", "Landroidx/compose/animation/core/l;", "a", "(J)Landroidx/compose/animation/core/l;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements C11300l<C16500q, C1986l> {

    /* renamed from: f */
    public static final VectorConvertersKt$IntSizeToVector$1 f5410f = new VectorConvertersKt$IntSizeToVector$1();

    public VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C1986l mo6781a(long j) {
        return new C1986l((float) C16500q.m74662m(j), (float) C16500q.m74659j(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6781a(((C16500q) obj).mo47895q());
    }
}
