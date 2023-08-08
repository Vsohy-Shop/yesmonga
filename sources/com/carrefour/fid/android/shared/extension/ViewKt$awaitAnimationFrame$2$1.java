package com.carrefour.fid.android.shared.extension;

import android.view.View;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ViewKt$awaitAnimationFrame$2$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ Runnable $runnable;
    final /* synthetic */ View $this_awaitAnimationFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewKt$awaitAnimationFrame$2$1(View view, Runnable runnable) {
        super(1);
        this.$this_awaitAnimationFrame = view;
        this.$runnable = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        this.$this_awaitAnimationFrame.removeCallbacks(this.$runnable);
    }
}
