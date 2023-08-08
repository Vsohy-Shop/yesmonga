package com.carrefour.fid.android.presentation.components.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36827s8;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.models.C38524p;
import com.carrefour.fid.android.presentation.models.OfferNotificationType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.iam.events.C9175a;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ.\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0002J*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/notification/NotificationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/d2;", "onDetachedFromWindow", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "F", "", "messageResId", "G", "titleResId", "Lkotlin/Function0;", "dismissAction", "y", "", "title", "message", "z", "D", "H", "Lcom/carrefour/fid/android/databinding/s8;", "a", "Lcom/carrefour/fid/android/databinding/s8;", "binding", "Ljava/util/Timer;", "b", "Ljava/util/Timer;", "timer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class NotificationView extends ConstraintLayout {
    @C12579k

    /* renamed from: c */
    public static final C38380a f97189c = new C38380a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f97190d = 8;

    /* renamed from: e */
    public static final long f97191e = 5000;

    /* renamed from: f */
    public static final long f97192f = 200;
    @C12579k

    /* renamed from: g */
    public static final C38524p f97193g = new C38524p(5000);
    @C12579k

    /* renamed from: a */
    public final C36827s8 f97194a;
    @C12580l

    /* renamed from: b */
    public Timer f97195b;

    /* renamed from: com.carrefour.fid.android.presentation.components.notification.NotificationView$a */
    public static final class C38380a {
        public /* synthetic */ C38380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38380a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.components.notification.NotificationView$b */
    public /* synthetic */ class C38381b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfferNotificationType.values().length];
            try {
                iArr[OfferNotificationType.PROMO_MIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 NotificationView.kt\ncom/carrefour/fid/android/presentation/components/notification/NotificationView\n*L\n1#1,148:1\n90#2:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.components.notification.NotificationView$c */
    public static final class C38382c extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ NotificationView f97196a;

        public C38382c(NotificationView notificationView) {
            this.f97196a = notificationView;
        }

        public void run() {
            boolean unused = this.f97196a.mo121252D();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public NotificationView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static /* synthetic */ void m158897A(NotificationView notificationView, int i, int i2, C11289a aVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            aVar = null;
        }
        notificationView.mo121257y(i, i2, aVar);
    }

    /* renamed from: B */
    public static /* synthetic */ void m158898B(NotificationView notificationView, String str, String str2, C11289a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        notificationView.mo121258z(str, str2, aVar);
    }

    /* renamed from: C */
    public static final void m158899C(NotificationView notificationView, C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(notificationView, "this$0");
        Timer timer = notificationView.f97195b;
        if (timer != null) {
            timer.cancel();
        }
        if (aVar != null) {
            aVar.invoke();
        } else {
            notificationView.mo121252D();
        }
        f97193g.mo122140b();
    }

    /* renamed from: E */
    public static final void m158900E(NotificationView notificationView) {
        Intrinsics.checkNotNullParameter(notificationView, "this$0");
        ViewKt.m152126h(notificationView, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
    }

    /* renamed from: D */
    public final boolean mo121252D() {
        return post(new C38384a(this));
    }

    /* renamed from: F */
    public final boolean mo121253F(@C12579k OfferProductModel offerProductModel) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        clearAnimation();
        C38524p pVar = f97193g;
        OfferNotificationType i0 = offerProductModel.mo121511i0();
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str = o0.mo121889s();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        long a = pVar.mo122139a(i0, str);
        if (a <= 200) {
            setVisibility(8);
            return false;
        }
        OfferNotificationType i02 = offerProductModel.mo121511i0();
        if (i02 == null) {
            i = -1;
        } else {
            i = C38381b.$EnumSwitchMapping$0[i02.ordinal()];
        }
        if (i == 1) {
            m158897A(this, R.string.basket_notify_promo_mixed_title, R.string.basket_notify_promo_mixed_message, (C11289a) null, 4, (Object) null);
        }
        if (a == 5000) {
            mo121255H();
            return true;
        }
        setVisibility(0);
        Timer timer = new Timer();
        timer.schedule(new C38382c(this), a);
        this.f97195b = timer;
        return false;
    }

    /* renamed from: G */
    public final boolean mo121254G(@C0324b1 int i) {
        clearAnimation();
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(messageResId)");
        m158898B(this, "", string, (C11289a) null, 4, (Object) null);
        mo121255H();
        return true;
    }

    /* renamed from: H */
    public final void mo121255H() {
        ViewKt.m152123e(this, (Integer) null, false, new NotificationView$show$1(this), 3, (Object) null);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Timer timer = this.f97195b;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* renamed from: y */
    public final void mo121257y(@C0324b1 int i, @C0324b1 int i2, C11289a<C11079d2> aVar) {
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(titleResId)");
        String string2 = getContext().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(messageResId)");
        mo121258z(string, string2, aVar);
    }

    /* renamed from: z */
    public final void mo121258z(String str, String str2, C11289a<C11079d2> aVar) {
        this.f97194a.f91650b.setOnClickListener(new C38385b(this, aVar));
        TextView textView = this.f97194a.f91652d;
        textView.setText(str);
        if (C11622t.isBlank(str)) {
            textView.setVisibility(8);
        }
        this.f97194a.f91651c.setText(str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public NotificationView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public NotificationView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36827s8 d = C36827s8.m151031d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f97194a = d;
        setVisibility(8);
    }
}
