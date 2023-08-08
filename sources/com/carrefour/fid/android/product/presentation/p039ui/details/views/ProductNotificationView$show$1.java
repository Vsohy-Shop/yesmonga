package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView$show$1 */
public final class ProductNotificationView$show$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ProductNotificationView this$0;

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 ProductNotificationView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductNotificationView$show$1\n*L\n1#1,148:1\n136#2:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView$show$1$a */
    public static final class C27925a extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ ProductNotificationView f67733a;

        public C27925a(ProductNotificationView productNotificationView) {
            this.f67733a = productNotificationView;
        }

        public void run() {
            boolean unused = this.f67733a.mo81294D();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductNotificationView$show$1(ProductNotificationView productNotificationView) {
        super(0);
        this.this$0 = productNotificationView;
    }

    public final void invoke() {
        ProductNotificationView productNotificationView = this.this$0;
        Timer timer = new Timer();
        timer.schedule(new C27925a(this.this$0), 5000);
        productNotificationView.f67726b = timer;
    }
}
