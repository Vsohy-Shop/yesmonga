package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.customview.poolingcontainer.C18537a;
import androidx.customview.poolingcontainer.C18538b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 */
public final class C15809x11b1833b extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.C15804a $listener;
    final /* synthetic */ C18538b $poolingContainerListener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15809x11b1833b(AbstractComposeView abstractComposeView, ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.C15804a aVar, C18538b bVar) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = aVar;
        this.$poolingContainerListener = bVar;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        C18537a.m83846g(this.$view, this.$poolingContainerListener);
    }
}
