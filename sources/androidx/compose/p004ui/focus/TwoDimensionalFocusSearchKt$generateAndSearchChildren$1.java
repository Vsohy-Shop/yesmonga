package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.layout.C15535b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/b$a;", "", "a", "(Landroidx/compose/ui/layout/b$a;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 */
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements C11300l<C15535b.C15536a, Boolean> {
    final /* synthetic */ int $direction;
    final /* synthetic */ FocusTargetModifierNode $focusedItem;
    final /* synthetic */ C11300l<FocusTargetModifierNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetModifierNode $this_generateAndSearchChildren;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        super(1);
        this.$this_generateAndSearchChildren = focusTargetModifierNode;
        this.$focusedItem = focusTargetModifierNode2;
        this.$direction = i;
        this.$onFound = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final Boolean invoke(@C12579k C15535b.C15536a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m64676r(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound));
        if (valueOf.booleanValue() || !aVar.mo8737a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return valueOf;
        }
        return null;
    }
}
