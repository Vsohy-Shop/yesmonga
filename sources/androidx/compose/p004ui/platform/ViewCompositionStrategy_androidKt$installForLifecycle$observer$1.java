package androidx.compose.p004ui.platform;

import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, mo22516d2 = {"Landroidx/lifecycle/w;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 */
public final class ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 implements C19470t {

    /* renamed from: a */
    public final /* synthetic */ AbstractComposeView f39404a;

    public ViewCompositionStrategy_androidKt$installForLifecycle$observer$1(AbstractComposeView abstractComposeView) {
        this.f39404a = abstractComposeView;
    }

    /* renamed from: i */
    public final void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_DESTROY) {
            this.f39404a.mo45282g();
        }
    }
}
