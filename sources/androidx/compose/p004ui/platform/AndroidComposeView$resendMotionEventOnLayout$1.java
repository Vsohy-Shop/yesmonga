package androidx.compose.p004ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1 */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    public final void invoke() {
        MotionEvent P = this.this$0.f39174w1;
        if (P != null) {
            int actionMasked = P.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.f39176x1 = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.post(androidComposeView.f39113A1);
            }
        }
    }
}
