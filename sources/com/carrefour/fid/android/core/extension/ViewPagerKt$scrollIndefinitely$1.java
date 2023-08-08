package com.carrefour.fid.android.core.extension;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.core.extension.ViewPagerKt", mo22502f = "ViewPager.kt", mo22503i = {0, 0}, mo22504l = {22, 32}, mo22505m = "scrollIndefinitely", mo22506n = {"$this$scrollIndefinitely", "interval"}, mo22507s = {"L$0", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ViewPagerKt$scrollIndefinitely$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ViewPagerKt$scrollIndefinitely$1(C11045c<? super ViewPagerKt$scrollIndefinitely$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ViewPagerKt.m148934f((ViewPager2) null, 0, this);
    }
}
