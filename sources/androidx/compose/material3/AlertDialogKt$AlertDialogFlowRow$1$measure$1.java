package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1864#2,2:222\n1864#2,3:224\n1866#2:227\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n*L\n191#1:222,2\n202#1:224,3\n191#1:227\n*E\n"})
public final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ List<List<C15611w0>> $sequences;
    final /* synthetic */ C15568h0 $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<C15611w0>> list, C15568h0 h0Var, float f, int i, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = h0Var;
        this.$mainAxisSpacing = f;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisPositions = list2;
    }

    /* renamed from: a */
    public final void mo11126a(@C12579k C15611w0.C15612a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15568h0 h0Var = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i2 = this.$mainAxisLayoutSize;
        List<Integer> list = this.$crossAxisPositions;
        int i3 = 0;
        for (Object next : this.$sequences) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            List list2 = (List) next;
            int size = list2.size();
            int[] iArr = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                int K0 = ((C15611w0) list2.get(i5)).mo44471K0();
                if (i5 < CollectionsKt__CollectionsKt.m40443G(list2)) {
                    i = h0Var.mo7429n2(f);
                } else {
                    i = 0;
                }
                iArr[i5] = K0 + i;
            }
            Arrangement.C2269d h = Arrangement.f6010a.mo7626h();
            int[] iArr2 = new int[size];
            for (int i6 = 0; i6 < size; i6++) {
                iArr2[i6] = 0;
            }
            int[] iArr3 = iArr2;
            h.mo7649e(h0Var, i2, iArr, h0Var.getLayoutDirection(), iArr2);
            int i7 = 0;
            for (Object next2 : list2) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C15611w0.C15612a.m69412p(aVar, (C15611w0) next2, iArr3[i7], list.get(i3).intValue(), 0.0f, 4, (Object) null);
                i7 = i8;
            }
            i3 = i4;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11126a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
