package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlin/Function0;", "Lkotlin/d2;", "command", "b", "(Lkotlin/jvm/functions/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1 */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements C11300l<C11289a<? extends C11079d2>, C11079d2> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* renamed from: c */
    public static final void m70787c(C11289a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$tmp0");
        aVar.invoke();
    }

    /* renamed from: b */
    public final void mo45376b(@C12579k C11289a<C11079d2> aVar) {
        Looper looper;
        Intrinsics.checkNotNullParameter(aVar, "command");
        Handler handler = this.this$0.getHandler();
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (looper == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new C15923m(aVar));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo45376b((C11289a) obj);
        return C11079d2.f28267a;
    }
}
