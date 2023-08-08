package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37036c1;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/StepBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/StepBarView$STEP;", "step", "Lkotlin/d2;", "u", "Lcom/carrefour/fid/android/design/components/databinding/c1;", "a", "Lcom/carrefour/fid/android/design/components/databinding/c1;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "STEP", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nStepBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepBarView.kt\ncom/carrefour/fid/android/design/components/widgets/StepBarView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,71:1\n262#2,2:72\n262#2,2:74\n262#2,2:76\n262#2,2:78\n262#2,2:80\n262#2,2:82\n262#2,2:84\n262#2,2:86\n262#2,2:88\n*S KotlinDebug\n*F\n+ 1 StepBarView.kt\ncom/carrefour/fid/android/design/components/widgets/StepBarView\n*L\n30#1:72,2\n31#1:74,2\n32#1:76,2\n42#1:78,2\n43#1:80,2\n44#1:82,2\n50#1:84,2\n51#1:86,2\n52#1:88,2\n*E\n"})
public final class StepBarView extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93230b = 8;
    @C12579k

    /* renamed from: a */
    public final C37036c1 f93231a;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/StepBarView$STEP;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum STEP {
        STEP_ONE(1),
        STEP_TWO(2),
        STEP_THREE(3);
        
        @C12579k

        /* renamed from: a */
        public static final C37176a f93232a = null;
        private final int value;

        @C11363r0({"SMAP\nStepBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepBarView.kt\ncom/carrefour/fid/android/design/components/widgets/StepBarView$STEP$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
        /* renamed from: com.carrefour.fid.android.design.components.widgets.StepBarView$STEP$a */
        public static final class C37176a {
            public /* synthetic */ C37176a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12580l
            /* renamed from: a */
            public final STEP mo113180a(int i) {
                for (STEP step : STEP.values()) {
                    if (step.mo113179q() == i) {
                        return step;
                    }
                }
                return null;
            }

            public C37176a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            f93232a = new C37176a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        STEP(int i) {
            this.value = i;
        }

        /* renamed from: q */
        public final int mo113179q() {
            return this.value;
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.StepBarView$a */
    public /* synthetic */ class C37177a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP[] r0 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP r1 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.STEP_ONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP r1 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.STEP_TWO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP r1 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.STEP_THREE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.StepBarView.C37177a.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StepBarView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: u */
    public final void mo113178u(@C12579k STEP step) {
        Intrinsics.checkNotNullParameter(step, "step");
        int i = C37177a.$EnumSwitchMapping$0[step.ordinal()];
        if (i == 1) {
            this.f93231a.f92590e.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_5));
            AppCompatTextView appCompatTextView = this.f93231a.f92593h;
            Context context = getContext();
            int i2 = C36896b.C36902f.ds_grey_20;
            appCompatTextView.setTextColor(C17318d.m79723f(context, i2));
            this.f93231a.f92591f.setTextColor(C17318d.m79723f(getContext(), i2));
            AppCompatTextView appCompatTextView2 = this.f93231a.f92590e;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.validateStepOneText");
            appCompatTextView2.setVisibility(0);
            AppCompatTextView appCompatTextView3 = this.f93231a.f92593h;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.validateStepTwoText");
            appCompatTextView3.setVisibility(0);
            AppCompatTextView appCompatTextView4 = this.f93231a.f92591f;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "binding.validateStepThreeText");
            appCompatTextView4.setVisibility(0);
            this.f93231a.f92587b.setProgress(0, true);
            this.f93231a.f92588c.setProgress(0, true);
        } else if (i == 2) {
            this.f93231a.f92590e.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_green));
            this.f93231a.f92593h.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_5));
            this.f93231a.f92591f.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_20));
            this.f93231a.f92587b.setProgress(100, true);
            this.f93231a.f92588c.setProgress(0, true);
            AppCompatTextView appCompatTextView5 = this.f93231a.f92590e;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "binding.validateStepOneText");
            appCompatTextView5.setVisibility(8);
            AppCompatTextView appCompatTextView6 = this.f93231a.f92593h;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "binding.validateStepTwoText");
            appCompatTextView6.setVisibility(0);
            AppCompatTextView appCompatTextView7 = this.f93231a.f92591f;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "binding.validateStepThreeText");
            appCompatTextView7.setVisibility(0);
        } else if (i == 3) {
            AppCompatTextView appCompatTextView8 = this.f93231a.f92590e;
            Context context2 = getContext();
            int i3 = C36896b.C36902f.ds_green;
            appCompatTextView8.setTextColor(C17318d.m79723f(context2, i3));
            this.f93231a.f92593h.setTextColor(C17318d.m79723f(getContext(), i3));
            this.f93231a.f92591f.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_5));
            AppCompatTextView appCompatTextView9 = this.f93231a.f92590e;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView9, "binding.validateStepOneText");
            appCompatTextView9.setVisibility(8);
            AppCompatTextView appCompatTextView10 = this.f93231a.f92593h;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView10, "binding.validateStepTwoText");
            appCompatTextView10.setVisibility(8);
            AppCompatTextView appCompatTextView11 = this.f93231a.f92591f;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView11, "binding.validateStepThreeText");
            appCompatTextView11.setVisibility(0);
            this.f93231a.f92588c.setProgress(100, true);
            this.f93231a.f92587b.setProgress(100, true);
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
        C37036c1 b = C37036c1.m151950b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f93231a = b;
        mo113178u(STEP.STEP_ONE);
    }
}
