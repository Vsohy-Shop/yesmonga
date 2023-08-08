package com.usabilla.sdk.ubform.sdk.page.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.C10016a;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.C10040b;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import com.usabilla.sdk.ubform.sdk.page.presenter.C10067a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONException;

@SuppressLint({"ViewConstructor"})
@C11076d0(mo22515d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u00109\u001a\u00028\u0000¢\u0006\u0004\bQ\u0010RJ2\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J$\u0010\u0016\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\u0017\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0014J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010+\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0016J\"\u00100\u001a\u00020\u000e2\u0010\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0,2\u0006\u0010/\u001a\u00020)H\u0016J\u0010\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0016J\u0018\u00105\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u00104\u001a\u00020)H\u0016J\u0010\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0005H\u0016R\u0014\u00109\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00108R\u001b\u0010>\u001a\u00020:8@X\u0002¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b?\u0010@R\u001b\u0010C\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\bB\u0010@R\u001b\u0010F\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\bD\u0010ER\u001b\u0010H\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\bG\u0010ER\u0014\u0010J\u001a\u00020\u00058\u0002XD¢\u0006\u0006\n\u0004\b&\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006S"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/view/PageView;", "Lcom/usabilla/sdk/ubform/sdk/page/presenter/a;", "V", "Landroid/widget/LinearLayout;", "Lcom/usabilla/sdk/ubform/sdk/page/contract/a$b;", "", "fieldValue", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "", "resSizeDim", "Landroid/graphics/Typeface;", "font", "margin", "Lkotlin/d2;", "s", "id", "text", "Landroid/widget/Button;", "r", "buttonId", "textString", "t", "u", "onAttachedToWindow", "onDetachedFromWindow", "backgroundColor", "m", "title", "j", "paragraph", "c", "e", "h", "d", "k", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "config", "g", "errorMessage", "b", "", "isLastPage", "l", "", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/FieldModel;", "fieldModels", "isBanner", "a", "Landroid/view/View;", "view", "f", "isVisible", "setComponentVisibility", "type", "i", "Lcom/usabilla/sdk/ubform/sdk/page/presenter/a;", "presenter", "Landroid/widget/ScrollView;", "Lkotlin/z;", "getScrollView$ubform_sdkRelease", "()Landroid/widget/ScrollView;", "scrollView", "getPageContent", "()Landroid/widget/LinearLayout;", "pageContent", "getPageButtons", "pageButtons", "getButtonPaddingSides", "()I", "buttonPaddingSides", "getButtonPaddingTopBottom", "buttonPaddingTopBottom", "Ljava/lang/String;", "getFeedbackUrl", "Landroid/view/ViewGroup;", "getFieldsContainer", "()Landroid/view/ViewGroup;", "fieldsContainer", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/page/presenter/a;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public class PageView<V extends C10067a> extends LinearLayout implements C10061a.C10063b {
    @C12579k

    /* renamed from: a */
    public final V f27686a;
    @C12579k

    /* renamed from: b */
    public final C11677z f27687b = C10864b0.m38748c(new PageView$scrollView$2(this));
    @C12579k

    /* renamed from: c */
    public final C11677z f27688c = C10864b0.m38748c(new PageView$pageContent$2(this));
    @C12579k

    /* renamed from: d */
    public final C11677z f27689d = C10864b0.m38748c(new PageView$pageButtons$2(this));
    @C12579k

    /* renamed from: e */
    public final C11677z f27690e;
    @C12579k

    /* renamed from: f */
    public final C11677z f27691f;
    @C12579k

    /* renamed from: g */
    public final String f27692g;

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.view.PageView$a */
    public static final class C10070a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f27693a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatButton f27694b;

        /* renamed from: c */
        public final /* synthetic */ AppCompatButton f27695c;

        public C10070a(ViewGroup viewGroup, AppCompatButton appCompatButton, AppCompatButton appCompatButton2) {
            this.f27693a = viewGroup;
            this.f27694b = appCompatButton;
            this.f27695c = appCompatButton2;
        }

        public boolean onPreDraw() {
            this.f27693a.getViewTreeObserver().removeOnPreDrawListener(this);
            int max = Math.max(this.f27694b.getWidth(), this.f27695c.getWidth());
            this.f27695c.setWidth(max);
            this.f27694b.setWidth(max);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageView(@C12579k Context context, @C12579k V v) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(v, "presenter");
        this.f27686a = v;
        this.f27690e = C10864b0.m38748c(new PageView$buttonPaddingSides$2(context));
        this.f27691f = C10864b0.m38748c(new PageView$buttonPaddingTopBottom$2(context));
        this.f27692g = "https://www.getfeedback.com/digital/?utm_medium=powered-link&utm_source=apps_";
        View.inflate(context, v.mo20714X(), this);
        getScrollView$ubform_sdkRelease().fullScroll(33);
        setClickable(true);
        setOrientation(1);
    }

    private final int getButtonPaddingSides() {
        return ((Number) this.f27690e.getValue()).intValue();
    }

    private final int getButtonPaddingTopBottom() {
        return ((Number) this.f27691f.getValue()).intValue();
    }

    private final LinearLayout getPageButtons() {
        Object value = this.f27689d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-pageButtons>(...)");
        return (LinearLayout) value;
    }

    private final LinearLayout getPageContent() {
        Object value = this.f27688c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-pageContent>(...)");
        return (LinearLayout) value;
    }

    /* renamed from: q */
    public static final void m38131q(PageView pageView, View view) {
        Intrinsics.checkNotNullParameter(pageView, "this$0");
        pageView.f27686a.mo20712T();
    }

    /* renamed from: v */
    public static final void m38132v(PageView pageView, View view) {
        Intrinsics.checkNotNullParameter(pageView, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        pageView.getScrollView$ubform_sdkRelease().smoothScrollTo(0, view.getTop());
    }

    /* renamed from: a */
    public void mo21382a(@C12579k List<? extends FieldModel<?>> list, boolean z) throws JSONException {
        Intrinsics.checkNotNullParameter(list, "fieldModels");
        for (FieldModel fieldModel : list) {
            if (fieldModel.mo20972c() != FieldType.CONTINUE) {
                FieldPresenter<?, ?> a = C10016a.m37748a(fieldModel, this.f27686a);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                FieldView<?> a2 = C10040b.m37931a(context, a);
                if (z) {
                    a2.mo20832d();
                }
                this.f27686a.mo21379J(a2.getPresenter());
                getPageContent().addView(a2);
            }
        }
    }

    /* renamed from: b */
    public void mo21383b(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, C9874a.f27073r);
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            Resources resources = textView.getContext().getResources();
            int i = C9747c.C9754g.ub_element_margin_bottom;
            layoutParams.rightMargin = resources.getDimensionPixelSize(i);
            layoutParams.leftMargin = textView.getContext().getResources().getDimensionPixelSize(i);
            layoutParams.bottomMargin = textView.getContext().getResources().getDimensionPixelSize(i);
            C11079d2 d2Var = C11079d2.f28267a;
            textView.setLayoutParams(layoutParams);
            textView.setText(str);
            textView.setTypeface(ubInternalTheme.getTypefaceRegular());
            textView.setTextSize((float) ubInternalTheme.getFonts().getMiniSize());
            textView.setId(C9747c.C9756i.ub_top_error);
            textView.setTextColor(ubInternalTheme.getColors().getHint());
            textView.setImportantForAccessibility(2);
            getPageContent().addView(textView);
        }
    }

    /* renamed from: c */
    public void mo21384c(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "paragraph");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        mo21453s(str, ubInternalTheme, C9747c.C9754g.ub_thankyou_page_textParagraph_size, ubInternalTheme.getTypefaceRegular(), getResources().getDimensionPixelSize(C9747c.C9754g.ub_thankyou_page_text_marginTop));
    }

    @C12579k
    /* renamed from: d */
    public Button mo21385d(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        Button r = mo21452r(C9747c.C9756i.ub_page_button_proceed, str, ubInternalTheme);
        r.setPadding(getButtonPaddingSides() / 2, getButtonPaddingTopBottom(), getButtonPaddingSides(), getButtonPaddingTopBottom());
        mo21455u(r, ubInternalTheme);
        getPageButtons().addView(r);
        return r;
    }

    /* renamed from: e */
    public void mo21386e(int i, @C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        Button button = new Button(getContext(), (AttributeSet) null, C9747c.C9762o.UbNavigationButtonsStyle);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = button.getResources().getDimensionPixelSize(C9747c.C9754g.ub_page_last_buttons_topMargin);
        layoutParams.gravity = 8388627;
        C11079d2 d2Var = C11079d2.f28267a;
        button.setLayoutParams(layoutParams);
        mo21454t(button, i, str, ubInternalTheme);
        button.setTextColor(ubInternalTheme.getColors().getAccent());
        mo21455u(button, ubInternalTheme);
        getPageContent().addView(button);
    }

    /* renamed from: f */
    public void mo21387f(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        post(new C10074b(this, view));
    }

    @C12579k
    /* renamed from: g */
    public Button mo21388g(@C12579k BannerConfigNavigation bannerConfigNavigation, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(bannerConfigNavigation, "config");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        ViewGroup viewGroup = (ViewGroup) findViewById(C9747c.C9756i.container_buttons);
        viewGroup.removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        AppCompatButton t = bannerConfigNavigation.mo20614t(context);
        t.setTypeface(ubInternalTheme.getTypefaceRegular());
        ExtensionViewKt.m38320d(t, new C10072x4754259c(this));
        Space space = new Space(getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(1, bannerConfigNavigation.mo20620y()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
        AppCompatButton o = bannerConfigNavigation.mo20610o(context2);
        o.setTypeface(ubInternalTheme.getTypefaceRegular());
        ExtensionViewKt.m38320d(o, new C10071x352e09ef(this));
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new C10070a(viewGroup, o, t));
        viewGroup.addView(t);
        viewGroup.addView(space);
        viewGroup.addView(o);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_padding);
        viewGroup.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        return t;
    }

    @C12579k
    public ViewGroup getFieldsContainer() {
        return getPageContent();
    }

    @C12579k
    public final ScrollView getScrollView$ubform_sdkRelease() {
        Object value = this.f27687b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-scrollView>(...)");
        return (ScrollView) value;
    }

    /* renamed from: h */
    public void mo21390h(int i) {
        getPageButtons().setBackgroundColor(i);
    }

    /* renamed from: i */
    public void mo21391i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus(this.f27692g, str))));
    }

    /* renamed from: j */
    public void mo21392j(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        mo21453s(str, ubInternalTheme, C9747c.C9754g.ub_thankyou_page_text_size, ubInternalTheme.getTypefaceRegular(), 0);
    }

    @C12579k
    /* renamed from: k */
    public Button mo21393k(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        Button r = mo21452r(C9747c.C9756i.ub_page_button_cancel, str, ubInternalTheme);
        r.setPadding(getButtonPaddingSides(), getButtonPaddingTopBottom(), getButtonPaddingSides() / 2, getButtonPaddingTopBottom());
        r.setTypeface(ubInternalTheme.getTypefaceRegular());
        getPageButtons().addView(r);
        return r;
    }

    /* renamed from: l */
    public void mo21394l(@C12579k UbInternalTheme ubInternalTheme, boolean z) {
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(appCompatImageView.getResources().getDimensionPixelOffset(C9747c.C9754g.ub_page_getfeedback_logo_width), appCompatImageView.getResources().getDimensionPixelOffset(C9747c.C9754g.ub_page_getfeedback_logo_height));
        layoutParams.setMargins(0, appCompatImageView.getContext().getResources().getDimensionPixelSize(C9747c.C9754g.ub_page_footer_margin_top), 0, appCompatImageView.getContext().getResources().getDimensionPixelSize(C9747c.C9754g.ub_page_footer_margin_bottom));
        C11079d2 d2Var = C11079d2.f28267a;
        appCompatImageView.setLayoutParams(layoutParams);
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        appCompatImageView.setBackground(C10133g.m38356r(context, C9747c.C9755h.gf_getfeedback_logo, ubInternalTheme.getColors().getHint(), true));
        appCompatImageView.setOnClickListener(new C10075c(this));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setScrollContainer(true);
        linearLayout.setGravity(17);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-2, 0, 1.0f));
        linearLayout.addView(view);
        linearLayout.addView(appCompatImageView);
        linearLayout.setId(C9747c.C9756i.ub_footer);
        getPageContent().addView(linearLayout);
        if (z) {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
            return;
        }
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatImageView.setContentDescription(getContext().getResources().getString(C9747c.C9761n.ub_usabilla_logo));
    }

    /* renamed from: m */
    public void mo21395m(int i) {
        setBackgroundColor(i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C9747c.C9754g.ub_form_padding);
        getPageContent().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27686a.mo20465L(this);
        this.f27686a.mo20469u();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27686a.mo20466O();
    }

    /* renamed from: r */
    public final Button mo21452r(int i, String str, UbInternalTheme ubInternalTheme) {
        Button button = new Button(new ContextThemeWrapper(getContext(), C9747c.C9762o.UbNavigationButtonsStyle));
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        mo21454t(button, i, str, ubInternalTheme);
        return button;
    }

    /* renamed from: s */
    public final void mo21453s(String str, UbInternalTheme ubInternalTheme, int i, Typeface typeface, int i2) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i2;
        C11079d2 d2Var = C11079d2.f28267a;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(0, textView.getResources().getDimension(i));
        textView.setText(str);
        textView.setTypeface(typeface);
        textView.setTextColor(ubInternalTheme.getColors().getText());
        getPageContent().addView(textView);
    }

    public void setComponentVisibility(int i, boolean z) {
        int i2;
        if (getPageContent().findViewById(i) != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            setVisibility(i2);
        }
    }

    /* renamed from: t */
    public final void mo21454t(Button button, int i, String str, UbInternalTheme ubInternalTheme) {
        button.setId(i);
        button.setBackground((Drawable) null);
        button.setTextSize((float) ubInternalTheme.getFonts().getMiniSize());
        button.setText(str);
        button.setSingleLine();
        button.setAllCaps(true);
        button.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        button.setIncludeFontPadding(false);
        button.setTextColor(ubInternalTheme.getColors().getAccentedText());
        ExtensionViewKt.m38320d(button, new PageView$customizeButton$1(this));
    }

    /* renamed from: u */
    public final void mo21455u(Button button, UbInternalTheme ubInternalTheme) {
        Typeface create = Typeface.create(ubInternalTheme.getTypefaceRegular(), 1);
        Typeface create2 = Typeface.create(UbInternalTheme.defaultFont, 0);
        if (create == null && create2 != null) {
            create = create2;
        }
        button.setTypeface(create);
    }
}
