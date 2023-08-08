package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.AppBarKt", mo22502f = "AppBar.kt", mo22503i = {0, 0, 0, 1}, mo22504l = {1622, 1638}, mo22505m = "settleAppBar", mo22506n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, mo22507s = {"L$0", "L$1", "L$2", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$settleAppBar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public AppBarKt$settleAppBar$1(C11045c<? super AppBarKt$settleAppBar$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppBarKt.m25404x((TopAppBarState) null, 0.0f, (C2013v<Float>) null, (C1968g<Float>) null, this);
    }
}
