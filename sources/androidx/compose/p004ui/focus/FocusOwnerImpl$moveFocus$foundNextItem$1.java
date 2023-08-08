package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "destination", "", "a", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,275:1\n87#2:276\n324#3:277\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n*L\n152#1:276\n152#1:277\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1 */
public final class FocusOwnerImpl$moveFocus$foundNextItem$1 extends Lambda implements C11300l<FocusTargetModifierNode, Boolean> {
    final /* synthetic */ FocusTargetModifierNode $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$foundNextItem$1(FocusTargetModifierNode focusTargetModifierNode) {
        super(1);
        this.$source = focusTargetModifierNode;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, FirebaseAnalytics.C32532b.f78977z);
        if (Intrinsics.areEqual((Object) focusTargetModifierNode, (Object) this.$source)) {
            return Boolean.FALSE;
        }
        C8767m.C8772d m = C15681e.m70232m(focusTargetModifierNode, C15739v0.m70597b(1024));
        if (!(m instanceof FocusTargetModifierNode)) {
            m = null;
        }
        if (((FocusTargetModifierNode) m) != null) {
            return Boolean.valueOf(FocusTransactionsKt.m64643h(focusTargetModifierNode));
        }
        throw new IllegalStateException("Focus search landed at the root.".toString());
    }
}
