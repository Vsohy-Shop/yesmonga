package com.usabilla.sdk.ubform.sdk.page.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0014"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/view/BannerPageView;", "Lcom/usabilla/sdk/ubform/sdk/page/view/PageView;", "Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "", "backgroundColor", "Lkotlin/d2;", "m", "h", "", "text", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "Landroid/widget/Button;", "k", "d", "Landroid/content/Context;", "context", "bannerPresenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerPageView extends PageView<BannerPresenter> {

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.view.BannerPageView$a */
    public static final class C10069a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ BannerPageView f27685a;

        public C10069a(BannerPageView bannerPageView) {
            this.f27685a = bannerPageView;
        }

        public boolean onPreDraw() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            this.f27685a.getFieldsContainer().getViewTreeObserver().removeOnPreDrawListener(this);
            View childAt = this.f27685a.getFieldsContainer().getChildAt(0);
            if (childAt != null) {
                childAt.setPadding(0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                }
            }
            int dimensionPixelSize = this.f27685a.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_padding);
            this.f27685a.getFieldsContainer().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerPageView(@C12579k Context context, @C12579k BannerPresenter bannerPresenter) {
        super(context, bannerPresenter);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bannerPresenter, "bannerPresenter");
    }

    @C12579k
    /* renamed from: d */
    public Button mo21385d(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        Button d = super.mo21385d(str, ubInternalTheme);
        d.setTextColor(ubInternalTheme.getColors().getAccent());
        return d;
    }

    /* renamed from: h */
    public void mo21390h(int i) {
    }

    @C12579k
    /* renamed from: k */
    public Button mo21393k(@C12579k String str, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        Button k = super.mo21393k(str, ubInternalTheme);
        k.setTextColor(ubInternalTheme.getColors().getText());
        return k;
    }

    /* renamed from: m */
    public void mo21395m(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getResources().getDimension(C9747c.C9754g.ub_card_radius));
        gradientDrawable.setColor(i);
        C11079d2 d2Var = C11079d2.f28267a;
        setBackground(gradientDrawable);
        getFieldsContainer().getViewTreeObserver().addOnPreDrawListener(new C10069a(this));
    }
}
