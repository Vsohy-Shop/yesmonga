package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.node.C15703k1;
import androidx.compose.p004ui.node.C15706l1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.C16040m;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 */
public final class C15780x7245ac5 extends Lambda implements C11300l<LayoutNode, Boolean> {

    /* renamed from: f */
    public static final C15780x7245ac5 f39262f = new C15780x7245ac5();

    public C15780x7245ac5() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k LayoutNode layoutNode) {
        C16035j a;
        Intrinsics.checkNotNullParameter(layoutNode, "it");
        C15703k1 j = C16040m.m72168j(layoutNode);
        boolean z = false;
        if (!(j == null || (a = C15706l1.m70387a(j)) == null || !a.mo46153M())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
