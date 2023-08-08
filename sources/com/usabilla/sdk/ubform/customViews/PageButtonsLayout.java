package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/PageButtonsLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "child", "Lkotlin/d2;", "addView", "Landroid/widget/TextView;", "firstButton", "secondButton", "b", "button", "", "c", "view", "width", "d", "Landroid/widget/Space;", "a", "Lkotlin/z;", "getButtonSpace", "()Landroid/widget/Space;", "buttonSpace", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class PageButtonsLayout extends LinearLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f26759a;

    /* renamed from: com.usabilla.sdk.ubform.customViews.PageButtonsLayout$a */
    public static final class C9769a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ PageButtonsLayout f26760a;

        public C9769a(PageButtonsLayout pageButtonsLayout) {
            this.f26760a = pageButtonsLayout;
        }

        public boolean onPreDraw() {
            this.f26760a.getViewTreeObserver().removeOnPreDrawListener(this);
            PageButtonsLayout pageButtonsLayout = this.f26760a;
            View childAt = pageButtonsLayout.getChildAt(0);
            if (childAt != null) {
                TextView textView = (TextView) childAt;
                View childAt2 = this.f26760a.getChildAt(1);
                if (childAt2 != null) {
                    pageButtonsLayout.mo19971b(textView, (TextView) childAt2);
                    return true;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PageButtonsLayout(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final Space getButtonSpace() {
        return (Space) this.f26759a.getValue();
    }

    public void addView(@C12580l View view) {
        super.addView(view);
        if (getChildCount() == 2) {
            getViewTreeObserver().addOnPreDrawListener(new C9769a(this));
        }
    }

    /* renamed from: b */
    public final void mo19971b(TextView textView, TextView textView2) {
        int width = getWidth();
        int i = width / 2;
        int c = mo19972c(textView);
        int c2 = mo19972c(textView2);
        if (c + c2 <= width) {
            addView(getButtonSpace(), 1);
            return;
        }
        int min = Math.min(c, c2);
        if (min >= i) {
            mo19973d(textView, i);
            mo19973d(textView2, i);
        } else if (c >= c2) {
            mo19973d(textView2, min);
            mo19973d(textView, width - min);
        } else {
            mo19973d(textView, min);
            mo19973d(textView2, width - min);
        }
    }

    /* renamed from: c */
    public final int mo19972c(TextView textView) {
        TextPaint paint = textView.getPaint();
        String obj = textView.getText().toString();
        if (obj != null) {
            String upperCase = obj.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return ((int) paint.measureText(upperCase)) + textView.getPaddingLeft() + textView.getPaddingRight();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public final void mo19973d(View view, int i) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PageButtonsLayout(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageButtonsLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public PageButtonsLayout(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26759a = C10864b0.m38748c(new PageButtonsLayout$buttonSpace$2(context));
        setGravity(8388613);
        setOrientation(0);
    }
}
