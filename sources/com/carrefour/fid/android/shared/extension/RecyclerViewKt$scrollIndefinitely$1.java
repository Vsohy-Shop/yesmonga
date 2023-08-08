package com.carrefour.fid.android.shared.extension;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.RecyclerViewKt", mo22502f = "RecyclerView.kt", mo22503i = {0, 0}, mo22504l = {133, 143}, mo22505m = "scrollIndefinitely", mo22506n = {"$this$scrollIndefinitely", "interval"}, mo22507s = {"L$0", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class RecyclerViewKt$scrollIndefinitely$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public RecyclerViewKt$scrollIndefinitely$1(C11045c<? super RecyclerViewKt$scrollIndefinitely$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RecyclerViewKt.m118874m((RecyclerView) null, 0, this);
    }
}
