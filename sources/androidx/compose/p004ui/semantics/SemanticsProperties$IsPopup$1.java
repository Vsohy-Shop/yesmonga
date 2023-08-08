package androidx.compose.p004ui.semantics;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/d2;Lkotlin/d2;)Lkotlin/d2;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1 */
public final class SemanticsProperties$IsPopup$1 extends Lambda implements C11304p<C11079d2, C11079d2, C11079d2> {

    /* renamed from: f */
    public static final SemanticsProperties$IsPopup$1 f39754f = new SemanticsProperties$IsPopup$1();

    public SemanticsProperties$IsPopup$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final C11079d2 invoke(@C12580l C11079d2 d2Var, @C12579k C11079d2 d2Var2) {
        Intrinsics.checkNotNullParameter(d2Var2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
