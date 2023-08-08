package com.usabilla.sdk.ubform.sdk.page.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration;
import com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ViewConstructor", "ClickableViewAccessibility"})
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/view/BannerConfigurablePageView;", "Lcom/usabilla/sdk/ubform/sdk/page/view/PageView;", "Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "", "backgroundColor", "Lkotlin/d2;", "m", "v", "Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "bannerPresenter", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerConfigurablePageView extends PageView<BannerPresenter> {
    @C12579k

    /* renamed from: v */
    public final BannerPresenter f27683v;

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.view.BannerConfigurablePageView$a */
    public static final class C10068a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ BannerConfigurablePageView f27684a;

        public C10068a(BannerConfigurablePageView bannerConfigurablePageView) {
            this.f27684a = bannerConfigurablePageView;
        }

        public boolean onPreDraw() {
            TextView textView;
            this.f27684a.getViewTreeObserver().removeOnPreDrawListener(this);
            int childCount = this.f27684a.getFieldsContainer().getChildCount();
            if (childCount > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    View childAt = this.f27684a.getFieldsContainer().getChildAt(i);
                    childAt.setPadding(0, 0, 0, 0);
                    if (childAt instanceof FieldView) {
                        FieldView fieldView = (FieldView) childAt;
                        fieldView.getTitleLabel().setGravity(1);
                        int childCount2 = fieldView.getRootView().getChildCount();
                        if (childCount2 > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                View childAt2 = fieldView.getRootView().getChildAt(i3);
                                if (childAt2 instanceof TextView) {
                                    textView = (TextView) childAt2;
                                } else {
                                    textView = null;
                                }
                                if (textView != null) {
                                    textView.setGravity(1);
                                }
                                if (i4 >= childCount2) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                    }
                    if (i2 >= childCount) {
                        break;
                    }
                    i = i2;
                }
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerConfigurablePageView(@C12579k Context context, @C12579k BannerPresenter bannerPresenter) {
        super(context, bannerPresenter);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bannerPresenter, "bannerPresenter");
        this.f27683v = bannerPresenter;
        setClickable(true);
        setGravity(17);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getScrollView$ubform_sdkRelease().setOnTouchListener(new C10073a());
        getScrollView$ubform_sdkRelease().setVerticalScrollBarEnabled(false);
    }

    /* renamed from: x */
    public static final boolean m38122x(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: m */
    public void mo21395m(int i) {
        float f;
        int i2;
        int i3;
        int i4;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i5 = 0;
        gradientDrawable.setShape(0);
        BannerConfiguration e0 = this.f27683v.mo20722e0();
        if (e0 == null) {
            f = 0.0f;
        } else {
            int e = e0.mo20665e();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            f = (float) Intrinsics.checkNotNullParameter(context, "<this>");
        }
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        C11079d2 d2Var = C11079d2.f28267a;
        setBackground(gradientDrawable);
        BannerConfiguration e02 = this.f27683v.mo20722e0();
        if (e02 == null) {
            i2 = 0;
        } else {
            int h = e02.mo20668h();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
            i2 = Intrinsics.checkNotNullParameter(context2, "<this>");
        }
        BannerConfiguration e03 = this.f27683v.mo20722e0();
        if (e03 == null) {
            i3 = 0;
        } else {
            int p = e03.mo20676p();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
            i3 = Intrinsics.checkNotNullParameter(context3, "<this>");
        }
        BannerConfiguration e04 = this.f27683v.mo20722e0();
        if (e04 == null) {
            i4 = 0;
        } else {
            int n = e04.mo20674n();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, C9175a.f24932Y);
            i4 = Intrinsics.checkNotNullParameter(context4, "<this>");
        }
        BannerConfiguration e05 = this.f27683v.mo20722e0();
        if (e05 != null) {
            int b = e05.mo20661b();
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, C9175a.f24932Y);
            i5 = Intrinsics.checkNotNullParameter(context5, "<this>");
        }
        setPadding(i2, i3, i4, i5);
        getViewTreeObserver().addOnPreDrawListener(new C10068a(this));
    }
}
