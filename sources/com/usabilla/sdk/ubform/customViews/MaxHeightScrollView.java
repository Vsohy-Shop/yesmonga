package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002XD¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u001b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/MaxHeightScrollView;", "Landroid/widget/ScrollView;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/d2;", "onMeasure", "", "scale", "a", "I", "maxHeight", "", "b", "F", "defaultFontScale", "c", "D", "bigBannerScale", "d", "smallBannerScale", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    public int f26755a;

    /* renamed from: b */
    public final float f26756b = 1.0f;

    /* renamed from: c */
    public final double f26757c = 0.75d;

    /* renamed from: d */
    public final double f26758d = 0.5d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(@C12579k Context context, @C12579k AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        if (context.getResources().getConfiguration().fontScale <= 1.0f || context.getResources().getConfiguration().orientation != 1) {
            i = mo19968a(0.5d);
        } else {
            i = mo19968a(0.75d);
        }
        this.f26755a = i;
    }

    /* renamed from: a */
    public final int mo19968a(double d) {
        return (int) (((double) getContext().getResources().getDisplayMetrics().heightPixels) * d);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f26755a;
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
