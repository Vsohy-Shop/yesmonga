package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.field.contract.common.C9964a;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 V*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u00020\u00032\u00020\u0004:\u0001!B\u0017\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\bT\u0010UJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\b\u0010 \u001a\u00020\u0007H\u0002R\u001a\u0010%\u001a\u00028\u00008\u0004X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010+\u001a\u0004\u0018\u00010&8TX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u00101\u001a\n -*\u0004\u0018\u00010,0,8@X\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u0002028DX\u0002¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098FX\u0002¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010<R\"\u0010C\u001a\u00020\u000b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010F\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010<R\u001b\u0010K\u001a\u00020G8BX\u0002¢\u0006\f\n\u0004\bH\u0010(\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8BX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0019\u0010Q\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00018F¢\u0006\u0006\u001a\u0004\bP\u0010$¨\u0006W"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "P", "Landroid/widget/LinearLayout;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/common/a$b;", "", "margin", "Lkotlin/d2;", "setCardSpacing", "onAttachedToWindow", "onDetachedFromWindow", "", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "isVisible", "setErrorVisible", "e", "", "tag", "g", "setFieldVisible", "title", "isRequired", "setDefaultContentDescription", "requiredText", "setTitleText", "d", "padding", "setCardInternalPadding", "m", "a", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "getFieldPresenter", "()Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "fieldPresenter", "Landroid/graphics/drawable/Drawable;", "b", "Lkotlin/z;", "getNormalBackground", "()Landroid/graphics/drawable/Drawable;", "normalBackground", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "kotlin.jvm.PlatformType", "c", "getTheme$ubform_sdkRelease", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "getColors", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "colors", "getRootView", "()Landroid/widget/LinearLayout;", "rootView", "Landroid/widget/TextView;", "f", "getTitleLabel", "()Landroid/widget/TextView;", "titleLabel", "Z", "l", "()Z", "setCreated", "(Z)V", "isCreated", "v", "getHiddenErrorLabel", "hiddenErrorLabel", "Landroid/graphics/drawable/GradientDrawable;", "w", "getErrorBackground", "()Landroid/graphics/drawable/GradientDrawable;", "errorBackground", "Landroid/widget/LinearLayout$LayoutParams;", "getParametersMatchWrap", "()Landroid/widget/LinearLayout$LayoutParams;", "parametersMatchWrap", "getPresenter", "presenter", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;)V", "x", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class FieldView<P extends FieldPresenter<?, ?>> extends LinearLayout implements C9964a.C9966b {
    @C12579k

    /* renamed from: x */
    public static final C10037a f27603x = new C10037a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final float f27604y = 0.5f;

    /* renamed from: z */
    public static final int f27605z = 3;
    @C12579k

    /* renamed from: a */
    public final P f27606a;
    @C12579k

    /* renamed from: b */
    public final C11677z f27607b = C10864b0.m38748c(new FieldView$normalBackground$2(this));
    @C12579k

    /* renamed from: c */
    public final C11677z f27608c = C10864b0.m38748c(new FieldView$theme$2(this));
    @C12579k

    /* renamed from: d */
    public final C11677z f27609d = C10864b0.m38748c(new FieldView$colors$2(this));
    @C12579k

    /* renamed from: e */
    public final C11677z f27610e;
    @C12579k

    /* renamed from: f */
    public final C11677z f27611f;

    /* renamed from: g */
    public boolean f27612g;
    @C12579k

    /* renamed from: v */
    public final C11677z f27613v;
    @C12579k

    /* renamed from: w */
    public final C11677z f27614w;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.common.FieldView$a */
    public static final class C10037a {
        public /* synthetic */ C10037a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10037a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldView(@C12579k Context context, @C12579k P p) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(p, "fieldPresenter");
        this.f27606a = p;
        this.f27610e = C10864b0.m38748c(new FieldView$rootView$2(context));
        this.f27611f = C10864b0.m38748c(new FieldView$titleLabel$2(context, this));
        this.f27613v = C10864b0.m38748c(new FieldView$hiddenErrorLabel$2(context, this));
        this.f27614w = C10864b0.m38748c(new FieldView$errorBackground$2(this));
        setOrientation(1);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private final GradientDrawable getErrorBackground() {
        return (GradientDrawable) this.f27614w.getValue();
    }

    private final TextView getHiddenErrorLabel() {
        return (TextView) this.f27613v.getValue();
    }

    /* access modifiers changed from: private */
    public final LinearLayout.LayoutParams getParametersMatchWrap() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    private final void setCardSpacing(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, i);
            C11079d2 d2Var = C11079d2.f28267a;
            setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: d */
    public void mo20832d() {
    }

    /* renamed from: e */
    public void mo20833e() {
        setCardSpacing(getContext().getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_margin_bottom));
        setCardInternalPadding(getContext().getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_padding));
        setBackground(getNormalBackground());
        addView(getHiddenErrorLabel());
        mo21129m();
        addView(getTitleLabel());
        addView(getRootView());
        this.f27612g = true;
    }

    /* renamed from: g */
    public void mo20834g(@C12580l String str) {
        getRootView().setTag(str);
    }

    @C12579k
    public final UbColors getColors() {
        return (UbColors) this.f27609d.getValue();
    }

    @C12579k
    public final P getFieldPresenter() {
        return this.f27606a;
    }

    @C12580l
    public Drawable getNormalBackground() {
        return (Drawable) this.f27607b.getValue();
    }

    @C12579k
    public final FieldPresenter<?, ?> getPresenter() {
        return this.f27606a;
    }

    @C12579k
    public final LinearLayout getRootView() {
        return (LinearLayout) this.f27610e.getValue();
    }

    public final UbInternalTheme getTheme$ubform_sdkRelease() {
        return (UbInternalTheme) this.f27608c.getValue();
    }

    @C12579k
    public final TextView getTitleLabel() {
        return (TextView) this.f27611f.getValue();
    }

    /* renamed from: l */
    public final boolean mo21128l() {
        return this.f27612g;
    }

    /* renamed from: m */
    public final void mo21129m() {
        TextView titleLabel = getTitleLabel();
        UbInternalTheme theme$ubform_sdkRelease = getTheme$ubform_sdkRelease();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        titleLabel.setTypeface(theme$ubform_sdkRelease.getTitleFont(context));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27606a.mo20465L(this);
        this.f27606a.mo20469u();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27606a.mo20466O();
    }

    public void onFocusChanged(boolean z, int i, @C12580l Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            return;
        }
        if (this instanceof FieldTextView) {
            ((FieldTextView) this).mo20840a();
        } else {
            ExtensionViewKt.m38318b(this);
        }
    }

    public void setCardInternalPadding(int i) {
        setPadding(i, i, i, i);
    }

    public final void setCreated(boolean z) {
        this.f27612g = z;
    }

    public void setDefaultContentDescription(@C12580l String str, boolean z) {
        if (z) {
            setContentDescription(str + ". " + getContext().getString(C9747c.C9761n.ub_element_required));
            return;
        }
        setContentDescription(str);
    }

    public void setErrorVisible(boolean z) {
        ExtensionViewKt.m38321e(getHiddenErrorLabel(), z);
        if (z) {
            setBackground(getErrorBackground());
        } else {
            setBackground(getNormalBackground());
        }
    }

    public void setFieldVisible(boolean z) {
        setDescendantFocusability(393216);
        int i = 0;
        setFocusable(false);
        if (!z) {
            i = 8;
        }
        setVisibility(i);
        setFocusable(true);
        setDescendantFocusability(262144);
    }

    public void setTitleText(@C12580l String str, @C12580l String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null) {
            spannableStringBuilder.append(str);
        }
        if (str2 != null) {
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.argb(Math.round(((float) Color.alpha(getColors().getTitle())) * 0.5f), Color.red(getColors().getTitle()), Color.green(getColors().getTitle()), Color.blue(getColors().getTitle()))), 0, spannableString.length(), 18);
            spannableStringBuilder.append(spannableString);
        }
        getTitleLabel().setText(spannableStringBuilder);
    }
}
