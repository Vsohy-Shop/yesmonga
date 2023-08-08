package androidx.compose.p004ui.layout;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.C11407b;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements C11304p<Integer, Integer, Integer> {

    /* renamed from: a */
    public static final AlignmentLineKt$LastBaseline$1 f38611a = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, C11407b.class, "max", "max(II)I", 1);
    }

    @C12579k
    /* renamed from: d */
    public final Integer mo44245d(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo44245d(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
