package androidx.compose.foundation;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/foundation/ScrollState;", "a", "(I)Landroidx/compose/foundation/ScrollState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollState$Companion$Saver$2 extends Lambda implements C11300l<Integer, ScrollState> {

    /* renamed from: f */
    public static final ScrollState$Companion$Saver$2 f5791f = new ScrollState$Companion$Saver$2();

    public ScrollState$Companion$Saver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final ScrollState mo7266a(int i) {
        return new ScrollState(i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo7266a(((Number) obj).intValue());
    }
}
