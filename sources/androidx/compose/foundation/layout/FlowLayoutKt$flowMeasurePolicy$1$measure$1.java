package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.runtime.collection.C8423g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,724:1\n476#2,11:725\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1$measure$1\n*L\n265#1:725,11\n*E\n"})
public final class FlowLayoutKt$flowMeasurePolicy$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C2406s $flowResult;
    final /* synthetic */ C2407s0 $measureHelper;
    final /* synthetic */ int[] $outPosition;
    final /* synthetic */ C15568h0 $this_measure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$flowMeasurePolicy$1$measure$1(C2406s sVar, C2407s0 s0Var, int[] iArr, C15568h0 h0Var) {
        super(1);
        this.$flowResult = sVar;
        this.$measureHelper = s0Var;
        this.$outPosition = iArr;
        this.$this_measure = h0Var;
    }

    /* renamed from: a */
    public final void mo7751a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C8423g<C2404r0> b = this.$flowResult.mo8162b();
        C2407s0 s0Var = this.$measureHelper;
        int[] iArr = this.$outPosition;
        C15568h0 h0Var = this.$this_measure;
        int h0 = b.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = b.mo15462d0();
            int i = 0;
            do {
                s0Var.mo8176m(aVar, (C2404r0) d0[i], iArr[i], h0Var.getLayoutDirection());
                i++;
            } while (i < h0);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7751a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
