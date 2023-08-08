package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.runtime.collection.C8423g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n685#2:1238\n686#2,2:1247\n685#2:1265\n686#2,2:1274\n163#3:1239\n163#3:1253\n163#3:1266\n460#4,7:1240\n467#4,4:1249\n460#4,11:1254\n460#4,7:1267\n467#4,4:1276\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n707#1:1238\n707#1:1247,2\n729#1:1265\n729#1:1274,2\n707#1:1239\n711#1:1253\n729#1:1266\n707#1:1240,7\n707#1:1249,4\n711#1:1254,11\n729#1:1267,7\n729#1:1276,4\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C15697j0 $lookaheadDelegate;
    final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, C15697j0 j0Var) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
        this.this$1 = layoutNodeLayoutDelegate;
        this.$lookaheadDelegate = j0Var;
    }

    public final void invoke() {
        C8423g<LayoutNode> I0 = this.this$0.f38891H0.f38876a.mo44627I0();
        int h0 = I0.mo15469h0();
        int i = 0;
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i2 = 0;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate w = ((LayoutNode) d0[i2]).mo44687k0().mo44758w();
                Intrinsics.checkNotNull(w);
                w.f38892X = w.mo44784p();
                w.mo44772d2(false);
                i2++;
            } while (i2 < h0);
        }
        C8423g<LayoutNode> I02 = this.this$1.f38876a.mo44627I0();
        int h02 = I02.mo15469h0();
        if (h02 > 0) {
            Object[] d02 = I02.mo15462d0();
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) d02[i3];
                if (layoutNode.mo44709v0() == LayoutNode.UsageByParent.InLayoutBlock) {
                    layoutNode.mo44642O1(LayoutNode.UsageByParent.NotUsed);
                }
                i3++;
            } while (i3 < h02);
        }
        this.this$0.mo44790y0(C156513.f38915f);
        this.$lookaheadDelegate.mo44862e1().mo8594x();
        this.this$0.mo44790y0(C156524.f38916f);
        C8423g<LayoutNode> I03 = this.this$0.f38891H0.f38876a.mo44627I0();
        int h03 = I03.mo15469h0();
        if (h03 > 0) {
            Object[] d03 = I03.mo15462d0();
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate w2 = ((LayoutNode) d03[i]).mo44687k0().mo44758w();
                Intrinsics.checkNotNull(w2);
                if (!w2.mo44784p()) {
                    w2.mo44782k1();
                }
                i++;
            } while (i < h03);
        }
    }
}
