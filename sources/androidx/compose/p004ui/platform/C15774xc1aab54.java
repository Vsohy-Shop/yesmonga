package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.semantics.SemanticsNode;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "it", "", "a", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Comparable;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$1 */
public final class C15774xc1aab54 extends Lambda implements C11300l<SemanticsNode, Comparable<?>> {

    /* renamed from: f */
    public static final C15774xc1aab54 f39258f = new C15774xc1aab54();

    public C15774xc1aab54() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final Comparable<?> invoke(@C12579k SemanticsNode semanticsNode) {
        Intrinsics.checkNotNullParameter(semanticsNode, "it");
        return Float.valueOf(semanticsNode.mo46020h().mo42279t());
    }
}
