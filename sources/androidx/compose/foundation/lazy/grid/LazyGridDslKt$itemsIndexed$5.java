package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/grid/k;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/grid/k;ILandroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5\n*L\n1#1,493:1\n*E\n"})
public final class LazyGridDslKt$itemsIndexed$5 extends Lambda implements C11306r<C2496k, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11307s<C2496k, Integer, T, C8592o, Integer, C11079d2> $itemContent;
    final /* synthetic */ List<T> $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$5(C11307s<? super C2496k, ? super Integer, ? super T, ? super C8592o, ? super Integer, C11079d2> sVar, List<? extends T> list) {
        super(4);
        this.$itemContent = sVar;
        this.$items = list;
    }

    @C8540g
    /* renamed from: a */
    public final void mo8425a(@C12579k C2496k kVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(kVar, "$this$items");
        if ((i2 & 14) == 0) {
            if (oVar.mo15006n0(kVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (oVar.mo14976f(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1229287273, i3, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:423)");
            }
            this.$itemContent.mo7709v5(kVar, Integer.valueOf(i), this.$items.get(i), oVar, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo8425a((C2496k) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
