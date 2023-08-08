package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
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

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001c"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/ShadowLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/d2;", "onDraw", "Landroid/graphics/Paint;", "a", "Lkotlin/z;", "getPaint", "()Landroid/graphics/Paint;", "paint", "", "b", "getRadius", "()F", "radius", "c", "getPadding", "padding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class ShadowLinearLayout extends LinearLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f26761a;
    @C12579k

    /* renamed from: b */
    public final C11677z f26762b;
    @C12579k

    /* renamed from: c */
    public final C11677z f26763c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ShadowLinearLayout(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final float getPadding() {
        return ((Number) this.f26763c.getValue()).floatValue();
    }

    private final Paint getPaint() {
        return (Paint) this.f26761a.getValue();
    }

    /* access modifiers changed from: private */
    public final float getRadius() {
        return ((Number) this.f26762b.getValue()).floatValue();
    }

    public void onDraw(@C12580l Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawRect(getPadding(), getPadding(), ((float) getWidth()) - getPadding(), ((float) getHeight()) - getPadding(), getPaint());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ShadowLinearLayout(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShadowLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ShadowLinearLayout(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26761a = C10864b0.m38748c(new ShadowLinearLayout$paint$2(this, context));
        this.f26762b = C10864b0.m38748c(new ShadowLinearLayout$radius$2(context));
        this.f26763c = C10864b0.m38748c(new ShadowLinearLayout$padding$2(context, this));
        setLayerType(1, getPaint());
        setWillNotDraw(false);
    }
}
