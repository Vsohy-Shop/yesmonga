package com.carrefour.fid.android.shared.extension;

import androidx.core.widget.NestedScrollView;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.NestedScrollViewKt", mo22502f = "NestedScrollView.kt", mo22503i = {0, 1}, mo22504l = {10, 50}, mo22505m = "awaitScrollEnd", mo22506n = {"$this$awaitScrollEnd", "$this$awaitScrollEnd"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NestedScrollViewKt$awaitScrollEnd$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public NestedScrollViewKt$awaitScrollEnd$1(C11045c<? super NestedScrollViewKt$awaitScrollEnd$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NestedScrollViewKt.m118857b((NestedScrollView) null, this);
    }
}
