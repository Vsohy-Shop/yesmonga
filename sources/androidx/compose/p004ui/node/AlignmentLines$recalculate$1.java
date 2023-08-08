package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15531a;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/node/a;", "childOwner", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n215#2,2:247\n1855#3,2:249\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:247,2\n170#1:249,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.AlignmentLines$recalculate$1 */
public final class AlignmentLines$recalculate$1 extends Lambda implements C11300l<C15665a, C11079d2> {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    /* renamed from: a */
    public final void mo44548a(@C12579k C15665a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "childOwner");
        if (aVar.mo44784p()) {
            if (aVar.mo44789w().mo44528g()) {
                aVar.mo44767Y();
            }
            Map b = aVar.mo44789w().f38785i;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : b.entrySet()) {
                alignmentLines.mo44524c((C15531a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.mo44775g0());
            }
            NodeCoordinator z4 = aVar.mo44775g0().mo44894z4();
            Intrinsics.checkNotNull(z4);
            while (!Intrinsics.areEqual((Object) z4, (Object) this.this$0.mo44527f().mo44775g0())) {
                AlignmentLines alignmentLines2 = this.this$0;
                for (C15531a aVar2 : this.this$0.mo44526e(z4).keySet()) {
                    alignmentLines2.mo44524c(aVar2, alignmentLines2.mo44530i(z4, aVar2), z4);
                }
                z4 = z4.mo44894z4();
                Intrinsics.checkNotNull(z4);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44548a((C15665a) obj);
        return C11079d2.f28267a;
    }
}
