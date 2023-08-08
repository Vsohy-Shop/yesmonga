package com.carrefour.fid.android.presentation.p035ui.orders;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36845u6;
import com.carrefour.fid.android.shared.extension.C28775q;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0002J\u001c\u0010\u0015\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0006R\"\u0010(\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/OrdersDetailsProgressCustomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/ImageView;", "iv", "Lkotlin/d2;", "setDotConstraint", "D", "C", "", "dot", "dotDrawable", "", "isAnimated", "z", "J", "I", "B", "Landroidx/constraintlayout/widget/c;", "Landroid/view/View;", "view", "parentView", "H", "Lcom/carrefour/fid/android/databinding/u6;", "a", "Lcom/carrefour/fid/android/databinding/u6;", "binding", "b", "progressStatus", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "myHandler", "", "d", "progressBarEnd", "e", "getDotNumber", "()I", "setDotNumber", "(I)V", "dotNumber", "f", "getEndedPointNumber", "setEndedPointNumber", "endedPointNumber", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersDetailsProgressCustomView */
public final class OrdersDetailsProgressCustomView extends ConstraintLayout {

    /* renamed from: g */
    public static final int f61250g = 8;
    @C12579k

    /* renamed from: a */
    public final C36845u6 f61251a;

    /* renamed from: b */
    public int f61252b;
    @C12579k

    /* renamed from: c */
    public final Handler f61253c;

    /* renamed from: d */
    public double f61254d;

    /* renamed from: e */
    public int f61255e;

    /* renamed from: f */
    public int f61256f;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersDetailsProgressCustomView$a */
    public static final class C24663a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ OrdersDetailsProgressCustomView f61257a;

        public C24663a(OrdersDetailsProgressCustomView ordersDetailsProgressCustomView) {
            this.f61257a = ordersDetailsProgressCustomView;
        }

        public void onGlobalLayout() {
            this.f61257a.f61251a.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f61257a.mo72063C();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrdersDetailsProgressCustomView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static /* synthetic */ void m107722A(OrdersDetailsProgressCustomView ordersDetailsProgressCustomView, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        ordersDetailsProgressCustomView.mo72072z(i, i2, z);
    }

    /* renamed from: E */
    public static final void m107723E(OrdersDetailsProgressCustomView ordersDetailsProgressCustomView) {
        Intrinsics.checkNotNullParameter(ordersDetailsProgressCustomView, "this$0");
        while (true) {
            int i = ordersDetailsProgressCustomView.f61252b;
            if (((double) i) < ordersDetailsProgressCustomView.f61254d) {
                ordersDetailsProgressCustomView.f61252b = i + 1;
                try {
                    Thread.sleep(18);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ordersDetailsProgressCustomView.f61253c.post(new C24677d(ordersDetailsProgressCustomView));
                Context context = ordersDetailsProgressCustomView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                C28775q.m119094b(context).runOnUiThread(new C24678e(ordersDetailsProgressCustomView));
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    public static final void m107724F(OrdersDetailsProgressCustomView ordersDetailsProgressCustomView) {
        Intrinsics.checkNotNullParameter(ordersDetailsProgressCustomView, "this$0");
        ordersDetailsProgressCustomView.f61251a.f91769d.setProgress(ordersDetailsProgressCustomView.f61252b);
    }

    /* renamed from: G */
    public static final void m107725G(OrdersDetailsProgressCustomView ordersDetailsProgressCustomView) {
        Intrinsics.checkNotNullParameter(ordersDetailsProgressCustomView, "this$0");
        if (((double) ordersDetailsProgressCustomView.f61252b) >= ordersDetailsProgressCustomView.f61254d) {
            ordersDetailsProgressCustomView.mo72072z(ordersDetailsProgressCustomView.f61256f, R.drawable.dot_white_green, true);
        }
    }

    private final void setDotConstraint(ImageView imageView) {
        C16934c cVar = new C16934c();
        cVar.mo50824H(this);
        mo72065H(cVar, imageView, this);
        cVar.mo50900r(this);
    }

    /* renamed from: B */
    public final ImageView mo72062B(int i) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(i);
        imageView.setId(View.generateViewId());
        addView(imageView);
        return imageView;
    }

    /* renamed from: C */
    public final void mo72063C() {
        int i = this.f61255e;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                m107722A(this, i2, R.drawable.white_dot, false, 4, (Object) null);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        mo72067J();
        mo72064D();
    }

    /* renamed from: D */
    public final void mo72064D() {
        if (this.f61252b == 100) {
            this.f61252b = 0;
        }
        new Thread(new C24676c(this)).start();
    }

    /* renamed from: H */
    public final void mo72065H(C16934c cVar, View view, View view2) {
        cVar.mo50830K(view.getId(), 3, view2.getId(), 3);
        cVar.mo50830K(view.getId(), 6, view2.getId(), 6);
        cVar.mo50830K(view.getId(), 4, view2.getId(), 4);
    }

    /* renamed from: I */
    public final void mo72066I(int i, ImageView imageView) {
        ViewKt.m118983H(imageView, (int) (((float) (ViewKt.m119004q(this.f61251a.f91769d.getWidth() / (this.f61255e + 1)) * i)) * getContext().getResources().getDisplayMetrics().density), 0, 0, 0);
    }

    /* renamed from: J */
    public final void mo72067J() {
        Double d;
        try {
            Result.C10852a aVar = Result.f28060a;
            d = Result.m38702b(Double.valueOf((double) C11409d.m43849K0(((((double) 100) / (((double) this.f61255e) + ((double) 1))) * ((double) this.f61256f)) + 0.1d)));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            d = Result.m38702b(C11661u0.m45734a(th));
        }
        Double valueOf = Double.valueOf(0.0d);
        if (Result.m38709i(d)) {
            d = valueOf;
        }
        this.f61254d = ((Number) d).doubleValue();
    }

    public final int getDotNumber() {
        return this.f61255e;
    }

    public final int getEndedPointNumber() {
        return this.f61256f;
    }

    public final void setDotNumber(int i) {
        this.f61255e = i;
    }

    public final void setEndedPointNumber(int i) {
        this.f61256f = i;
    }

    /* renamed from: z */
    public final void mo72072z(int i, int i2, boolean z) {
        ImageView B = mo72062B(i2);
        mo72066I(i, B);
        setDotConstraint(B);
        if (z) {
            com.carrefour.fid.android.design.components.extension.ViewKt.m152123e(B, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrdersDetailsProgressCustomView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrdersDetailsProgressCustomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrdersDetailsProgressCustomView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36845u6 b = C36845u6.m151100b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f61251a = b;
        this.f61253c = new Handler(Looper.getMainLooper());
        this.f61255e = 2;
        b.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new C24663a(this));
    }
}
