package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.SeekBar;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u00108\u001a\u00020\f¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u001b\u0010%\u001a\u00020\u00028TX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8F@FX\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R$\u0010+\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8F@FX\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00103\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0017¨\u0006;"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/SliderSeekBar;", "Lcom/usabilla/sdk/ubform/customViews/AccessibilitySeekView;", "Landroid/widget/SeekBar;", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Lkotlin/d2;", "onPopulateAccessibilityEvent", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onSeekBarChangeListener", "setOnSeekBarChangeListener", "", "c", "", "b", "I", "getMin", "()I", "setMin", "(I)V", "min", "value", "Ljava/lang/String;", "getTextHigh", "()Ljava/lang/String;", "setTextHigh", "(Ljava/lang/String;)V", "textHigh", "d", "getTextLow", "setTextLow", "textLow", "e", "sliderTheme", "f", "Lkotlin/z;", "getView", "()Landroid/widget/SeekBar;", "view", "getProgress", "setProgress", "progress", "getMax", "setMax", "max", "Landroid/graphics/drawable/Drawable;", "getProgressDrawable", "()Landroid/graphics/drawable/Drawable;", "progressDrawable", "getThumb", "thumb", "getDescriptionString", "descriptionString", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class SliderSeekBar extends AccessibilitySeekView<SeekBar> {

    /* renamed from: b */
    public int f26764b;
    @C12579k

    /* renamed from: c */
    public String f26765c;
    @C12579k

    /* renamed from: d */
    public String f26766d;

    /* renamed from: e */
    public final int f26767e;
    @C12579k

    /* renamed from: f */
    public final C11677z f26768f;

    /* renamed from: com.usabilla.sdk.ubform.customViews.SliderSeekBar$a */
    public static final class C9770a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ SliderSeekBar f26769a;

        /* renamed from: b */
        public final /* synthetic */ SeekBar.OnSeekBarChangeListener f26770b;

        public C9770a(SliderSeekBar sliderSeekBar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            this.f26769a = sliderSeekBar;
            this.f26770b = onSeekBarChangeListener;
        }

        public void onProgressChanged(@C12580l SeekBar seekBar, int i, boolean z) {
            if (seekBar != null) {
                seekBar.setContentDescription(String.valueOf(this.f26769a.getMin() + i));
            }
            this.f26769a.sendAccessibilityEvent(16384);
            this.f26770b.onProgressChanged(seekBar, i, z);
        }

        public void onStartTrackingTouch(@C12580l SeekBar seekBar) {
            this.f26770b.onStartTrackingTouch(seekBar);
        }

        public void onStopTrackingTouch(@C12580l SeekBar seekBar) {
            this.f26770b.onStopTrackingTouch(seekBar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SliderSeekBar(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: c */
    public final String mo19980c(String str) {
        return new Regex("[^A-Za-z0-9]").mo23336m(str, "");
    }

    @C12579k
    public String getDescriptionString() {
        String string = getContext().getString(C9747c.C9761n.ub_element_slider_select_rating, new Object[]{Integer.valueOf(this.f26764b), this.f26766d, Integer.valueOf(getView().getMax() + this.f26764b), this.f26765c});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n            R.string.ub_element_slider_select_rating, min, textLow, view.max + min, textHigh\n        )");
        return string;
    }

    public final int getMax() {
        return getView().getMax();
    }

    public final int getMin() {
        return this.f26764b;
    }

    public final int getProgress() {
        return getView().getProgress();
    }

    @C12579k
    public final Drawable getProgressDrawable() {
        Drawable progressDrawable = getView().getProgressDrawable();
        Intrinsics.checkNotNullExpressionValue(progressDrawable, "view.progressDrawable");
        return progressDrawable;
    }

    @C12579k
    public final String getTextHigh() {
        return this.f26765c;
    }

    @C12579k
    public final String getTextLow() {
        return this.f26766d;
    }

    @C12579k
    public final Drawable getThumb() {
        Drawable thumb = getView().getThumb();
        Intrinsics.checkNotNullExpressionValue(thumb, "view.thumb");
        return thumb;
    }

    public void onPopulateAccessibilityEvent(@C12580l AccessibilityEvent accessibilityEvent) {
        setContentDescription(getDescriptionString());
        C11079d2 d2Var = C11079d2.f28267a;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void setMax(int i) {
        getView().setMax(i);
    }

    public final void setMin(int i) {
        this.f26764b = i;
    }

    public final void setOnSeekBarChangeListener(@C12579k SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        Intrinsics.checkNotNullParameter(onSeekBarChangeListener, "onSeekBarChangeListener");
        getView().setOnSeekBarChangeListener(new C9770a(this, onSeekBarChangeListener));
    }

    public final void setProgress(int i) {
        getView().setProgress(i);
    }

    public final void setTextHigh(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f26765c = mo19980c(str);
    }

    public final void setTextLow(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f26766d = mo19980c(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public SliderSeekBar(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    public SeekBar getView() {
        return (SeekBar) this.f26768f.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public SliderSeekBar(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26765c = "";
        this.f26766d = "";
        this.f26767e = 16974372;
        this.f26768f = C10864b0.m38748c(new SliderSeekBar$view$2(context, this));
        addView(getView());
    }
}
