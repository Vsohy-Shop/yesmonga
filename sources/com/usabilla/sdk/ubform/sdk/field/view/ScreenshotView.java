package com.usabilla.sdk.ubform.sdk.field.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.field.contract.C9980h;
import com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10022g;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u00100\u001a\u00020\u000f\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u001eR\u001b\u0010*\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u001eR\u001b\u0010/\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010.¨\u00064"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/ScreenshotView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/g;", "Landroid/view/View$OnClickListener;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/h$b;", "Lkotlin/d2;", "onAttachedToWindow", "", "hasWindowFocus", "onWindowFocusChanged", "onDetachedFromWindow", "j", "Landroid/view/View;", "v", "onClick", "Landroid/content/Context;", "b", "setupScreenshot", "c", "p", "o", "kotlin.jvm.PlatformType", "E0", "Lkotlin/z;", "getView", "()Landroid/view/View;", "view", "Landroid/widget/ImageView;", "F0", "getScreenshotImage", "()Landroid/widget/ImageView;", "screenshotImage", "Landroid/widget/TextView;", "G0", "getAddScreenshotText", "()Landroid/widget/TextView;", "addScreenshotText", "H0", "getEditButton", "editButton", "I0", "getDeleteButton", "deleteButton", "Landroid/widget/RelativeLayout;", "J0", "getManageImageLayout", "()Landroid/widget/RelativeLayout;", "manageImageLayout", "context", "fieldPresenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/g;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class ScreenshotView extends FieldView<C10022g> implements View.OnClickListener, C9980h.C9982b {
    @C12579k

    /* renamed from: E0 */
    public final C11677z f27550E0;
    @C12579k

    /* renamed from: F0 */
    public final C11677z f27551F0 = C10864b0.m38748c(new ScreenshotView$screenshotImage$2(this));
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27552G0 = C10864b0.m38748c(new ScreenshotView$addScreenshotText$2(this));
    @C12579k

    /* renamed from: H0 */
    public final C11677z f27553H0 = C10864b0.m38748c(new ScreenshotView$editButton$2(this));
    @C12579k

    /* renamed from: I0 */
    public final C11677z f27554I0 = C10864b0.m38748c(new ScreenshotView$deleteButton$2(this));
    @C12579k

    /* renamed from: J0 */
    public final C11677z f27555J0 = C10864b0.m38748c(new ScreenshotView$manageImageLayout$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenshotView(@C12579k Context context, @C12579k C10022g gVar) {
        super(context, gVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(gVar, "fieldPresenter");
        this.f27550E0 = C10864b0.m38748c(new ScreenshotView$view$2(context, this));
    }

    private final TextView getAddScreenshotText() {
        Object value = this.f27552G0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-addScreenshotText>(...)");
        return (TextView) value;
    }

    private final ImageView getDeleteButton() {
        Object value = this.f27554I0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-deleteButton>(...)");
        return (ImageView) value;
    }

    private final ImageView getEditButton() {
        Object value = this.f27553H0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-editButton>(...)");
        return (ImageView) value;
    }

    private final RelativeLayout getManageImageLayout() {
        Object value = this.f27555J0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-manageImageLayout>(...)");
        return (RelativeLayout) value;
    }

    private final ImageView getScreenshotImage() {
        Object value = this.f27551F0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-screenshotImage>(...)");
        return (ImageView) value;
    }

    /* access modifiers changed from: private */
    public final View getView() {
        return (View) this.f27550E0.getValue();
    }

    @C12579k
    /* renamed from: b */
    public Context mo20860b() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        return context;
    }

    /* renamed from: c */
    public void mo20831c() {
    }

    /* renamed from: j */
    public void mo20835j() {
        setLayoutTransition(new LayoutTransition());
        String Z = ((C10022g) getFieldPresenter()).mo20858Z();
        if (!TextUtils.isEmpty(Z)) {
            getTitleLabel().setText(Z);
        }
        getAddScreenshotText().setTextSize((float) getTheme$ubform_sdkRelease().getFonts().getTitleSize());
        getAddScreenshotText().setTextColor(getColors().getText());
        getAddScreenshotText().setTypeface(getTheme$ubform_sdkRelease().getTypefaceRegular());
        addView(getView());
        mo21080o();
    }

    /* renamed from: o */
    public final void mo21080o() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        Drawable u = C10133g.m38359u(context, C9747c.C9755h.ub_shape_oval, getColors().getAccent(), false, 4, (Object) null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
        Drawable r = C10133g.m38356r(context2, C9747c.C9755h.ub_button_screenshot_add, getColors().getAccent(), true);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
        Drawable r2 = C10133g.m38356r(context3, C9747c.C9755h.ub_ic_pencil, getColors().getAccentedText(), true);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, C9175a.f24932Y);
        Drawable r3 = C10133g.m38356r(context4, C9747c.C9755h.ub_ic_trash, getColors().getAccentedText(), true);
        getEditButton().setBackground(u);
        getEditButton().setImageDrawable(r2);
        getDeleteButton().setBackground(u);
        getDeleteButton().setImageDrawable(r3);
        getAddScreenshotText().setCompoundDrawablesWithIntrinsicBounds(r, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupScreenshot();
    }

    public void onClick(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        int id = view.getId();
        boolean z = true;
        if (!(id == C9747c.C9756i.ub_screenshot_add_text || id == C9747c.C9756i.ub_screenshot_edit_icon)) {
            z = false;
        }
        if (z) {
            ((C10022g) getFieldPresenter()).mo20859a((UbScreenshot) ((ScreenshotModel) ((C10022g) getFieldPresenter()).mo20826p()).mo20973d());
        } else if (id == C9747c.C9756i.ub_screenshot_delete_icon) {
            mo21085p();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getScreenshotImage().setImageBitmap((Bitmap) null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo21080o();
        }
    }

    /* renamed from: p */
    public final void mo21085p() {
        ((C10022g) getFieldPresenter()).mo20856I();
        getScreenshotImage().setImageBitmap((Bitmap) null);
        getManageImageLayout().setVisibility(8);
        getAddScreenshotText().setVisibility(0);
    }

    public void setupScreenshot() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        Bitmap P = ((C10022g) getFieldPresenter()).mo20857P(context);
        if (P == null) {
            mo21085p();
            return;
        }
        getScreenshotImage().setImageBitmap(P);
        getManageImageLayout().setVisibility(0);
        getAddScreenshotText().setVisibility(8);
    }
}
