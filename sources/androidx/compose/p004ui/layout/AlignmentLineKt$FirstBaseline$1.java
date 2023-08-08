package androidx.compose.p004ui.layout;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.C11407b;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$FirstBaseline$1 */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements C11304p<Integer, Integer, Integer> {

    /* renamed from: a */
    public static final AlignmentLineKt$FirstBaseline$1 f38610a = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, C11407b.class, "min", "min(II)I", 1);
    }

    @C12579k
    /* renamed from: d */
    public final Integer mo44244d(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo44244d(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
