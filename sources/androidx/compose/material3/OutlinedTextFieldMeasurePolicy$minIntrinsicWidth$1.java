package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15580l;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/ui/layout/l;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/l;I)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 extends Lambda implements C11304p<C15580l, Integer, Integer> {

    /* renamed from: f */
    public static final OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 f19547f = new OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1();

    public OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo11776a(@C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "intrinsicMeasurable");
        return Integer.valueOf(lVar.mo44322o0(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo11776a((C15580l) obj, ((Number) obj2).intValue());
    }
}
