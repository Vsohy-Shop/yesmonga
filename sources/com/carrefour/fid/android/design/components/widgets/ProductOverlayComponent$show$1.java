package com.carrefour.fid.android.design.components.widgets;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductOverlayComponent$show$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $autoHide;
    final /* synthetic */ ProductOverlayComponent this$0;

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 ProductOverlayComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ProductOverlayComponent$show$1\n*L\n1#1,148:1\n141#2:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent$show$1$a */
    public static final class C37163a extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ ProductOverlayComponent f93148a;

        public C37163a(ProductOverlayComponent productOverlayComponent) {
            this.f93148a = productOverlayComponent;
        }

        public void run() {
            boolean unused = this.f93148a.mo113011B();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductOverlayComponent$show$1(boolean z, ProductOverlayComponent productOverlayComponent) {
        super(0);
        this.$autoHide = z;
        this.this$0 = productOverlayComponent;
    }

    public final void invoke() {
        if (this.$autoHide) {
            ProductOverlayComponent productOverlayComponent = this.this$0;
            Timer timer = new Timer();
            timer.schedule(new C37163a(this.this$0), 7000);
            productOverlayComponent.f93139a = timer;
        }
    }
}
