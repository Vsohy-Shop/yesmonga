package androidx.compose.p004ui.platform;

import androidx.lifecycle.C19470t;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2 */
public final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ C19470t $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, C19470t tVar) {
        super(0);
        this.$lifecycle = lifecycle;
        this.$observer = tVar;
    }

    public final void invoke() {
        this.$lifecycle.mo57467d(this.$observer);
    }
}
