package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$TwoRowsTopAppBar$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Ref.FloatRef $maxHeightPx;
    final /* synthetic */ Ref.FloatRef $pinnedHeightPx;
    final /* synthetic */ C8275r3 $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$2$1(C8275r3 r3Var, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(0);
        this.$scrollBehavior = r3Var;
        this.$pinnedHeightPx = floatRef;
        this.$maxHeightPx = floatRef2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getState();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r4 = this;
            androidx.compose.material3.r3 r0 = r4.$scrollBehavior
            r1 = 0
            if (r0 == 0) goto L_0x0014
            androidx.compose.material3.TopAppBarState r0 = r0.getState()
            if (r0 == 0) goto L_0x0014
            float r0 = r0.mo12414e()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            kotlin.jvm.internal.Ref$FloatRef r2 = r4.$pinnedHeightPx
            float r2 = r2.element
            kotlin.jvm.internal.Ref$FloatRef r3 = r4.$maxHeightPx
            float r3 = r3.element
            float r2 = r2 - r3
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Float) r0, (float) r2)
            if (r0 != 0) goto L_0x003b
            androidx.compose.material3.r3 r0 = r4.$scrollBehavior
            if (r0 == 0) goto L_0x002c
            androidx.compose.material3.TopAppBarState r1 = r0.getState()
        L_0x002c:
            if (r1 != 0) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            kotlin.jvm.internal.Ref$FloatRef r0 = r4.$pinnedHeightPx
            float r0 = r0.element
            kotlin.jvm.internal.Ref$FloatRef r2 = r4.$maxHeightPx
            float r2 = r2.element
            float r0 = r0 - r2
            r1.mo12418i(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1.invoke():void");
    }
}
