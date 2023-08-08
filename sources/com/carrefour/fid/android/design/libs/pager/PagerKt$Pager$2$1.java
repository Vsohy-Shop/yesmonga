package com.carrefour.fid.android.design.libs.pager;

import androidx.compose.foundation.gestures.C2195g;
import com.carrefour.fid.android.design.libs.pager.snapper.SnapperFlingBehavior;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerKt$Pager$2$1 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ C2195g $flingBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$2$1(C2195g gVar) {
        super(0);
        this.$flingBehavior = gVar;
    }

    @C12580l
    public final Integer invoke() {
        C2195g gVar = this.$flingBehavior;
        SnapperFlingBehavior snapperFlingBehavior = gVar instanceof SnapperFlingBehavior ? (SnapperFlingBehavior) gVar : null;
        if (snapperFlingBehavior != null) {
            return snapperFlingBehavior.mo114156k();
        }
        return null;
    }
}
