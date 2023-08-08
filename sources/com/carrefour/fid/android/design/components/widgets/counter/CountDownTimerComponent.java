package com.carrefour.fid.android.design.components.widgets.counter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37046g;
import com.carrefour.fid.android.design.components.utils.C37137d;
import com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer;
import com.google.firebase.installations.C33124s;
import com.urbanairship.iam.events.C9175a;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bJ\u001c\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0002R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/counter/CountDownTimerComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isExpiredTimer", "Lkotlin/d2;", "setBackground", "", "amount", "Lkotlin/Function0;", "onFinishTimerClickListener", "B", "x", "onCancelTimerClickListener", "setOnCancelTimerClickListener", "minutes", "seconds", "z", "millisUntilFinished", "w", "Lcom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer;", "a", "Lcom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer;", "countDownTimer", "Lcom/carrefour/fid/android/design/components/databinding/g;", "b", "Lcom/carrefour/fid/android/design/components/databinding/g;", "binding", "Lcom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer$CountDownState;", "getState", "()Lcom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer$CountDownState;", "state", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCountDownTimerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountDownTimerComponent.kt\ncom/carrefour/fid/android/design/components/widgets/counter/CountDownTimerComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class CountDownTimerComponent extends ConstraintLayout {

    /* renamed from: c */
    public static final int f93333c = 8;
    @C12580l

    /* renamed from: a */
    public CustomCountDownTimer f93334a;
    @C12579k

    /* renamed from: b */
    public final C37046g f93335b;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent$a */
    public /* synthetic */ class C37210a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState[] r0 = com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer.CountDownState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState r1 = com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer.CountDownState.IDLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState r1 = com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer.CountDownState.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState r1 = com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer.CountDownState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent.C37210a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent$b */
    public static final class C37211b implements CustomCountDownTimer.C37213b {

        /* renamed from: a */
        public final /* synthetic */ CountDownTimerComponent f93336a;

        /* renamed from: b */
        public final /* synthetic */ C11289a<C11079d2> f93337b;

        public C37211b(CountDownTimerComponent countDownTimerComponent, C11289a<C11079d2> aVar) {
            this.f93336a = countDownTimerComponent;
            this.f93337b = aVar;
        }

        /* renamed from: a */
        public void mo113331a() {
            C11289a<C11079d2> aVar = this.f93337b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: b */
        public void mo113332b(long j) {
            this.f93336a.mo113328w(j);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CountDownTimerComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static /* synthetic */ void m152789A(CountDownTimerComponent countDownTimerComponent, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        countDownTimerComponent.mo113330z(j, j2);
    }

    /* renamed from: C */
    public static /* synthetic */ void m152790C(CountDownTimerComponent countDownTimerComponent, long j, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            aVar = null;
        }
        countDownTimerComponent.mo113325B(j, aVar);
    }

    private final void setBackground(boolean z) {
        Drawable drawable;
        View view = this.f93335b.f92650c;
        if (z) {
            drawable = C17318d.m79726i(getContext(), C36896b.C36902f.ds_red_extra_light);
        } else {
            drawable = C17318d.m79726i(getContext(), C36896b.C36902f.ds_yellow_extra_light);
        }
        view.setBackground(drawable);
    }

    public static /* synthetic */ void setOnCancelTimerClickListener$default(CountDownTimerComponent countDownTimerComponent, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        countDownTimerComponent.setOnCancelTimerClickListener(aVar);
    }

    /* renamed from: y */
    public static final void m152793y(C11289a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: B */
    public final void mo113325B(long j, @C12580l C11289a<C11079d2> aVar) {
        long j2;
        Calendar instance = Calendar.getInstance();
        long time = instance.getTime().getTime();
        instance.add(12, (int) j);
        CustomCountDownTimer a = CustomCountDownTimer.f93338d.mo113339a(instance.getTime().getTime() - time, 1000);
        a.mo113336f(new C37211b(this, aVar));
        this.f93334a = a;
        int i = C37210a.$EnumSwitchMapping$0[getState().ordinal()];
        if (i == 1) {
            CustomCountDownTimer customCountDownTimer = this.f93334a;
            if (customCountDownTimer != null) {
                customCountDownTimer.start();
            }
        } else if (i == 2) {
            CustomCountDownTimer customCountDownTimer2 = this.f93334a;
            if (customCountDownTimer2 != null) {
                j2 = customCountDownTimer2.mo113334d();
            } else {
                j2 = 0;
            }
            mo113328w(j2);
        } else if (i == 3) {
            mo113329x();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo113335e();
     */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer.CountDownState getState() {
        /*
            r1 = this;
            com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer r0 = r1.f93334a
            if (r0 == 0) goto L_0x000a
            com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState r0 = r0.mo113335e()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState r0 = com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer.CountDownState.IDLE
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent.getState():com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$CountDownState");
    }

    public final void setOnCancelTimerClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93335b.f92649b.setOnClickListener(new C37214a(aVar));
    }

    /* renamed from: w */
    public final void mo113328w(long j) {
        long j2;
        boolean z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        if (minutes >= 1) {
            j2 = timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j));
        } else {
            j2 = timeUnit.toSeconds(j);
        }
        mo113330z(minutes, j2);
        if (minutes < 5) {
            z = true;
        } else {
            z = false;
        }
        setBackground(z);
    }

    /* renamed from: x */
    public final void mo113329x() {
        CustomCountDownTimer customCountDownTimer = this.f93334a;
        if (customCountDownTimer != null) {
            customCountDownTimer.mo113333c();
        }
    }

    /* renamed from: z */
    public final void mo113330z(long j, long j2) {
        AppCompatTextView appCompatTextView = this.f93335b.f92652e;
        Context context = getContext();
        int i = C36896b.C36912p.additional_order_time_counter;
        String a = C37137d.m152209a(j);
        String a2 = C37137d.m152209a(j2);
        SpannableString spannableString = new SpannableString(context.getString(i, new Object[]{a + C33124s.f80355c + a2}));
        spannableString.setSpan(new StyleSpan(1), 9, 14, 33);
        appCompatTextView.setText(spannableString);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CountDownTimerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountDownTimerComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CountDownTimerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37046g b = C37046g.m151972b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.f93335b = b;
        setBackground(false);
    }
}
