package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.customViews.SliderSeekBar;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10023h;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\"\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\"R\u001b\u0010,\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016¨\u00064"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/SliderView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/h;", "Lkotlin/d2;", "j", "c", "Landroid/widget/TextView;", "view", "", "text", "", "alpha", "t", "v", "", "E0", "I", "sliderTheme", "Landroid/widget/LinearLayout;", "F0", "Lkotlin/z;", "getMainContainer", "()Landroid/widget/LinearLayout;", "mainContainer", "G0", "getSeekBarContainer", "seekBarContainer", "Lcom/usabilla/sdk/ubform/customViews/SliderSeekBar;", "H0", "getSeekBar", "()Lcom/usabilla/sdk/ubform/customViews/SliderSeekBar;", "seekBar", "I0", "getLeftLabel", "()Landroid/widget/TextView;", "leftLabel", "J0", "getRightLabel", "rightLabel", "K0", "getResultLabel", "resultLabel", "L0", "getSeekBarLabels", "seekBarLabels", "Landroid/content/Context;", "context", "field", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/h;)V", "M0", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class SliderView extends FieldView<C10023h> {
    @C12579k

    /* renamed from: M0 */
    public static final C10031a f27556M0 = new C10031a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: N0 */
    public static final float f27557N0 = 10.0f;

    /* renamed from: E0 */
    public final int f27558E0 = 16974372;
    @C12579k

    /* renamed from: F0 */
    public final C11677z f27559F0;
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27560G0;
    @C12579k

    /* renamed from: H0 */
    public final C11677z f27561H0;
    @C12579k

    /* renamed from: I0 */
    public final C11677z f27562I0;
    @C12579k

    /* renamed from: J0 */
    public final C11677z f27563J0;
    @C12579k

    /* renamed from: K0 */
    public final C11677z f27564K0;
    @C12579k

    /* renamed from: L0 */
    public final C11677z f27565L0;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.SliderView$a */
    public static final class C10031a {
        public /* synthetic */ C10031a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10031a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView(@C12579k Context context, @C12579k C10023h hVar) {
        super(context, hVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(hVar, "field");
        this.f27559F0 = C10864b0.m38748c(new SliderView$mainContainer$2(context));
        this.f27560G0 = C10864b0.m38748c(new SliderView$seekBarContainer$2(context));
        this.f27561H0 = C10864b0.m38748c(new SliderView$seekBar$2(context, this));
        this.f27562I0 = C10864b0.m38748c(new SliderView$leftLabel$2(context, this));
        this.f27563J0 = C10864b0.m38748c(new SliderView$rightLabel$2(context, this));
        this.f27564K0 = C10864b0.m38748c(new SliderView$resultLabel$2(context, this));
        this.f27565L0 = C10864b0.m38748c(new SliderView$seekBarLabels$2(context, this));
    }

    /* access modifiers changed from: private */
    public final TextView getLeftLabel() {
        return (TextView) this.f27562I0.getValue();
    }

    private final LinearLayout getMainContainer() {
        return (LinearLayout) this.f27559F0.getValue();
    }

    /* access modifiers changed from: private */
    public final TextView getResultLabel() {
        return (TextView) this.f27564K0.getValue();
    }

    /* access modifiers changed from: private */
    public final TextView getRightLabel() {
        return (TextView) this.f27563J0.getValue();
    }

    private final SliderSeekBar getSeekBar() {
        return (SliderSeekBar) this.f27561H0.getValue();
    }

    private final LinearLayout getSeekBarContainer() {
        return (LinearLayout) this.f27560G0.getValue();
    }

    private final LinearLayout getSeekBarLabels() {
        return (LinearLayout) this.f27565L0.getValue();
    }

    /* renamed from: o */
    public static final /* synthetic */ C10023h m37865o(SliderView sliderView) {
        return (C10023h) sliderView.getFieldPresenter();
    }

    /* renamed from: u */
    public static /* synthetic */ void m37870u(SliderView sliderView, TextView textView, String str, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        sliderView.mo21092t(textView, str, f);
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            getSeekBar().setProgress(((C10023h) getFieldPresenter()).getProgress());
            getSeekBar().setMax(((C10023h) getFieldPresenter()).mo20864S());
            m37870u(this, getResultLabel(), ((C10023h) getFieldPresenter()).mo20862G(), 0.0f, 4, (Object) null);
        }
    }

    /* renamed from: j */
    public void mo20835j() {
        getSeekBarContainer().addView(getSeekBar());
        getSeekBarContainer().addView(getSeekBarLabels());
        getMainContainer().addView(getSeekBarContainer());
        getMainContainer().addView(getResultLabel());
        getRootView().addView(getMainContainer());
        mo21093v();
    }

    /* renamed from: t */
    public final void mo21092t(TextView textView, String str, float f) {
        textView.setText(str);
        textView.setTextColor(Color.argb(Math.round(((float) Color.alpha(getColors().getText())) * f), Color.red(getColors().getText()), Color.green(getColors().getText()), Color.blue(getColors().getText())));
        textView.setTypeface(getTheme$ubform_sdkRelease().getTypefaceRegular());
        textView.setTextSize((float) getTheme$ubform_sdkRelease().getFonts().getMiniSize());
    }

    /* renamed from: v */
    public final void mo21093v() {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        int accent = getColors().getAccent();
        LayerDrawable layerDrawable = (LayerDrawable) getSeekBar().getProgressDrawable().getCurrent();
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908303);
        Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(16908288);
        getSeekBar().getThumb().setColorFilter(accent, mode);
        findDrawableByLayerId.setColorFilter(accent, mode);
        findDrawableByLayerId2.setColorFilter(accent, mode);
        findDrawableByLayerId3.setColorFilter(accent, mode);
        layerDrawable.setDrawableByLayerId(16908301, findDrawableByLayerId);
        layerDrawable.setDrawableByLayerId(16908303, findDrawableByLayerId2);
        layerDrawable.setDrawableByLayerId(16908288, findDrawableByLayerId3);
    }
}
