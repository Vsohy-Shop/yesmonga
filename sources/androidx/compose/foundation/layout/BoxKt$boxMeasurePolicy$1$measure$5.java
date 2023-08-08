package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,287:1\n13644#2,3:288\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n*L\n164#1:288,3\n*E\n"})
public final class BoxKt$boxMeasurePolicy$1$measure$5 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ Ref.IntRef $boxHeight;
    final /* synthetic */ Ref.IntRef $boxWidth;
    final /* synthetic */ List<C15557e0> $measurables;
    final /* synthetic */ C15611w0[] $placeables;
    final /* synthetic */ C15568h0 $this_MeasurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxKt$boxMeasurePolicy$1$measure$5(C15611w0[] w0VarArr, List<? extends C15557e0> list, C15568h0 h0Var, Ref.IntRef intRef, Ref.IntRef intRef2, C8734c cVar) {
        super(1);
        this.$placeables = w0VarArr;
        this.$measurables = list;
        this.$this_MeasurePolicy = h0Var;
        this.$boxWidth = intRef;
        this.$boxHeight = intRef2;
        this.$alignment = cVar;
    }

    /* renamed from: a */
    public final void mo7700a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0[] w0VarArr = this.$placeables;
        List<C15557e0> list = this.$measurables;
        C15568h0 h0Var = this.$this_MeasurePolicy;
        Ref.IntRef intRef = this.$boxWidth;
        Ref.IntRef intRef2 = this.$boxHeight;
        C8734c cVar = this.$alignment;
        int length = w0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            C15611w0 w0Var = w0VarArr[i2];
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.m9848j(aVar, w0Var, list.get(i), h0Var.getLayoutDirection(), intRef.element, intRef2.element, cVar);
            i2++;
            i++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7700a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
