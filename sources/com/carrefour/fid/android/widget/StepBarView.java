package com.carrefour.fid.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.C14032l0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36818s;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/widget/StepBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/widget/StepBarView$STEP;", "step", "Lkotlin/d2;", "v", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "u", "Lcom/carrefour/fid/android/databinding/s;", "a", "Lcom/carrefour/fid/android/databinding/s;", "binding", "b", "I", "progress", "c", "Lcom/carrefour/fid/android/widget/StepBarView$STEP;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "STEP", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class StepBarView extends ConstraintLayout {

    /* renamed from: d */
    public static final int f58410d = 8;
    @C12579k

    /* renamed from: a */
    public final C36818s f58411a;

    /* renamed from: b */
    public int f58412b;
    @C12579k

    /* renamed from: c */
    public STEP f58413c;

    @Keep
    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/widget/StepBarView$STEP;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "STEP_ONE", "STEP_TWO", "STEP_THREE", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum STEP {
        STEP_ONE(1),
        STEP_TWO(2),
        STEP_THREE(3);
        
        @C12579k
        public static final C22838a Companion = null;
        private final int value;

        @C11363r0({"SMAP\nStepBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepBarView.kt\ncom/carrefour/fid/android/widget/StepBarView$STEP$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
        /* renamed from: com.carrefour.fid.android.widget.StepBarView$STEP$a */
        public static final class C22838a {
            public /* synthetic */ C22838a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12580l
            /* renamed from: a */
            public final STEP mo67302a(int i) {
                for (STEP step : STEP.values()) {
                    if (step.getValue() == i) {
                        return step;
                    }
                }
                return null;
            }

            public C22838a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C22838a((DefaultConstructorMarker) null);
        }

        private STEP(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* renamed from: com.carrefour.fid.android.widget.StepBarView$a */
    public /* synthetic */ class C22839a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.widget.StepBarView$STEP[] r0 = com.carrefour.fid.android.widget.StepBarView.STEP.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.widget.StepBarView$STEP r1 = com.carrefour.fid.android.widget.StepBarView.STEP.STEP_ONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.widget.StepBarView$STEP r1 = com.carrefour.fid.android.widget.StepBarView.STEP.STEP_TWO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.widget.StepBarView$STEP r1 = com.carrefour.fid.android.widget.StepBarView.STEP.STEP_THREE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.widget.StepBarView.C22839a.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StepBarView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: u */
    public final void mo67299u(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14032l0.C14053u.StepBarView, i, 0);
            try {
                this.f58412b = obtainStyledAttributes.getInteger(0, 35);
                STEP a = STEP.Companion.mo67302a(obtainStyledAttributes.getInteger(1, 1));
                if (a == null) {
                    a = STEP.STEP_ONE;
                }
                this.f58413c = a;
                mo67300v(a);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: v */
    public final void mo67300v(@C12579k STEP step) {
        Intrinsics.checkNotNullParameter(step, "step");
        int i = C22839a.$EnumSwitchMapping$0[step.ordinal()];
        if (i == 1) {
            this.f58411a.f91601b.setTextColor(C17318d.m79723f(getContext(), R.color.ds_primary_dark));
            this.f58411a.f91604e.setTextColor(C17318d.m79723f(getContext(), R.color.ds_grey_20));
            this.f58411a.f91603d.setProgress(33);
        } else if (i == 2) {
            this.f58411a.f91601b.setTextColor(C17318d.m79723f(getContext(), R.color.ds_grey_20));
            this.f58411a.f91604e.setTextColor(C17318d.m79723f(getContext(), R.color.ds_primary_dark));
            this.f58411a.f91603d.setProgress(66);
        } else if (i == 3) {
            this.f58411a.f91601b.setTextColor(C17318d.m79723f(getContext(), R.color.ds_grey_20));
            this.f58411a.f91604e.setTextColor(C17318d.m79723f(getContext(), R.color.ds_grey_20));
            this.f58411a.f91605f.setTextColor(C17318d.m79723f(getContext(), R.color.ds_primary_dark));
            this.f58411a.f91603d.setProgress(100);
        }
        invalidate();
        requestLayout();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StepBarView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StepBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public StepBarView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36818s b = C36818s.m150996b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f58411a = b;
        this.f58412b = 35;
        this.f58413c = STEP.STEP_ONE;
        mo67299u(context, attributeSet, i);
    }
}
