package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NavigationBarKt$placeLabelAndIcon$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ int $containerWidth;
    final /* synthetic */ C15611w0 $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ C15611w0 $indicatorPlaceable;
    final /* synthetic */ C15611w0 $indicatorRipplePlaceable;
    final /* synthetic */ C15611w0 $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $selectedIconY;
    final /* synthetic */ C15568h0 $this_placeLabelAndIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeLabelAndIcon$1(C15611w0 w0Var, boolean z, float f, C15611w0 w0Var2, int i, int i2, int i3, C15611w0 w0Var3, int i4, int i5, C15611w0 w0Var4, int i6, int i7, int i8, C15568h0 h0Var) {
        super(1);
        this.$indicatorPlaceable = w0Var;
        this.$alwaysShowLabel = z;
        this.$animationProgress = f;
        this.$labelPlaceable = w0Var2;
        this.$labelX = i;
        this.$labelY = i2;
        this.$offset = i3;
        this.$iconPlaceable = w0Var3;
        this.$iconX = i4;
        this.$selectedIconY = i5;
        this.$indicatorRipplePlaceable = w0Var4;
        this.$rippleX = i6;
        this.$rippleY = i7;
        this.$containerWidth = i8;
        this.$this_placeLabelAndIcon = h0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0 == false) goto L_0x003a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11702a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15611w0.C15612a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.compose.ui.layout.w0 r2 = r8.$indicatorPlaceable
            if (r2 == 0) goto L_0x002a
            int r0 = r8.$containerWidth
            int r1 = r8.$selectedIconY
            androidx.compose.ui.layout.h0 r3 = r8.$this_placeLabelAndIcon
            int r4 = r8.$offset
            int r5 = r2.mo44471K0()
            int r0 = r0 - r5
            int r0 = r0 / 2
            float r5 = androidx.compose.material3.NavigationBarKt.f19499j
            int r3 = r3.mo7429n2(r5)
            int r1 = r1 - r3
            int r4 = r4 + r1
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r9
            r3 = r0
            androidx.compose.p004ui.layout.C15611w0.C15612a.m69414v(r1, r2, r3, r4, r5, r6, r7)
        L_0x002a:
            boolean r0 = r8.$alwaysShowLabel
            if (r0 != 0) goto L_0x003a
            float r0 = r8.$animationProgress
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 != 0) goto L_0x004b
        L_0x003a:
            androidx.compose.ui.layout.w0 r2 = r8.$labelPlaceable
            int r3 = r8.$labelX
            int r0 = r8.$labelY
            int r1 = r8.$offset
            int r4 = r0 + r1
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r9
            androidx.compose.p004ui.layout.C15611w0.C15612a.m69414v(r1, r2, r3, r4, r5, r6, r7)
        L_0x004b:
            androidx.compose.ui.layout.w0 r2 = r8.$iconPlaceable
            int r3 = r8.$iconX
            int r0 = r8.$selectedIconY
            int r1 = r8.$offset
            int r4 = r0 + r1
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r9
            androidx.compose.p004ui.layout.C15611w0.C15612a.m69414v(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.layout.w0 r2 = r8.$indicatorRipplePlaceable
            int r3 = r8.$rippleX
            int r0 = r8.$rippleY
            int r1 = r8.$offset
            int r4 = r0 + r1
            r1 = r9
            androidx.compose.p004ui.layout.C15611w0.C15612a.m69414v(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1.mo11702a(androidx.compose.ui.layout.w0$a):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11702a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
