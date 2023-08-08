package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014R\u001b\u0010\u000b\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/BoundedLinearLayout;", "Landroid/widget/LinearLayout;", "", "wMeasureSpec", "heightMeasureSpec", "Lkotlin/d2;", "onMeasure", "a", "Lkotlin/z;", "getMaxWidth", "()I", "maxWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BoundedLinearLayout extends LinearLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f26741a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BoundedLinearLayout(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final int getMaxWidth() {
        return ((Number) this.f26741a.getValue()).intValue();
    }

    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i) > getMaxWidth()) {
            i = View.MeasureSpec.makeMeasureSpec(getMaxWidth(), View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BoundedLinearLayout(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoundedLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public BoundedLinearLayout(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26741a = C10864b0.m38748c(new BoundedLinearLayout$maxWidth$2(context));
    }
}
