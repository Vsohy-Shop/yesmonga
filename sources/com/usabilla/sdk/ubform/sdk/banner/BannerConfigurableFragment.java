package com.usabilla.sdk.ubform.sdk.banner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.C8698y1;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.firebase.remoteconfig.C33585u;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.C9911a;
import com.usabilla.sdk.ubform.sdk.C9927c;
import com.usabilla.sdk.ubform.sdk.banner.contract.C9924a;
import com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.CampaignFormFragment;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.page.view.BannerConfigurablePageView;
import com.usabilla.sdk.ubform.utils.ext.C10128b;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import com.usabilla.sdk.ubform.utils.ext.C10134h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\bd\u0010eJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0014\u0010\u0019\u001a\u00020\t*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\f\u0010\u001a\u001a\u00020\t*\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010#\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0010\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020\tH\u0016J\u0018\u0010-\u001a\u00020\t2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010.\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020+H\u0016J\b\u00102\u001a\u00020\tH\u0016J\b\u00103\u001a\u00020\tH\u0016J\u0010\u00104\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u00108\u001a\u00020\t2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0015H\u0016R\u0016\u0010<\u001a\u0002098\u0002@\u0002X.¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0002¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bV\u0010?\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010`¨\u0006g"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigurableFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/usabilla/sdk/ubform/sdk/a;", "Lcom/usabilla/sdk/ubform/sdk/banner/contract/a$b;", "Landroid/view/View;", "view", "Landroid/widget/LinearLayout;", "S0", "banner", "Lkotlin/d2;", "g1", "T0", "Landroid/widget/ImageView;", "Z0", "Lcom/usabilla/sdk/ubform/sdk/page/view/BannerConfigurablePageView;", "pageView", "Q0", "R0", "", "showForm", "f1", "", "Y0", "Landroid/widget/RelativeLayout$LayoutParams;", "rotation", "c1", "d1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "onResume", "Lcom/usabilla/sdk/ubform/sdk/page/model/PageModel;", "pageModel", "j0", "y0", "Lcom/usabilla/sdk/ubform/sdk/entity/FeedbackResult;", "feedbackResult", "", "entries", "L", "T", "m0", "text", "C", "t", "onDestroyView", "B", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "containerId", "K", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;", "a", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;", "campaignManager", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "b", "Lkotlin/z;", "W0", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "config", "c", "e1", "()Z", "isPlayStoreAvailable", "d", "V0", "()Ljava/lang/String;", "campaignId", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "e", "X0", "()Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "formModel", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignSubmissionManager;", "f", "b1", "()Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignSubmissionManager;", "submissionManager", "Lkotlinx/coroutines/o0;", "g", "a1", "()Lkotlinx/coroutines/o0;", "scope", "Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "v", "U0", "()Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "bannerPresenter", "w", "I", "animIn", "x", "animOut", "<init>", "()V", "y", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerConfigurableFragment extends Fragment implements C9911a, C9924a.C9926b {
    @C12579k

    /* renamed from: E0 */
    public static final String f27258E0 = "configuration";
    @C12579k

    /* renamed from: X */
    public static final String f27259X = "campaign ID";
    @C12579k

    /* renamed from: Y */
    public static final String f27260Y = "play store info";
    @C12579k

    /* renamed from: Z */
    public static final String f27261Z = "form model";
    @C12579k

    /* renamed from: y */
    public static final C9915a f27262y = new C9915a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: z */
    public static final String f27263z = "CAMPAIGN_BANNER_FRAGMENT_TAG";

    /* renamed from: a */
    public CampaignManager f27264a;
    @C12579k

    /* renamed from: b */
    public final C11677z f27265b = C10864b0.m38748c(new BannerConfigurableFragment$config$2(this));
    @C12579k

    /* renamed from: c */
    public final C11677z f27266c = C10864b0.m38748c(new BannerConfigurableFragment$isPlayStoreAvailable$2(this));
    @C12579k

    /* renamed from: d */
    public final C11677z f27267d = C10864b0.m38748c(new BannerConfigurableFragment$campaignId$2(this));
    @C12579k

    /* renamed from: e */
    public final C11677z f27268e = C10864b0.m38748c(new BannerConfigurableFragment$formModel$2(this));
    @C12579k

    /* renamed from: f */
    public final C11677z f27269f = C10864b0.m38748c(BannerConfigurableFragment$submissionManager$2.f27278f);
    @C12579k

    /* renamed from: g */
    public final C11677z f27270g = C10864b0.m38748c(BannerConfigurableFragment$scope$2.f27277f);
    @C12579k

    /* renamed from: v */
    public final C11677z f27271v = C10864b0.m38748c(new BannerConfigurableFragment$bannerPresenter$2(this));

    /* renamed from: w */
    public int f27272w = 17432576;

    /* renamed from: x */
    public int f27273x = 17432577;

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment$a */
    public static final class C9915a {
        public /* synthetic */ C9915a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo20650a(boolean z, String str, FormModel formModel, BannerConfiguration bannerConfiguration) {
            Bundle bundle = new Bundle();
            bundle.putString("campaign ID", str);
            bundle.putBoolean(BannerConfigurableFragment.f27260Y, z);
            bundle.putParcelable("form model", formModel);
            bundle.putParcelable(BannerConfigurableFragment.f27258E0, bannerConfiguration);
            return bundle;
        }

        @C12579k
        /* renamed from: b */
        public final BannerConfigurableFragment mo20651b(boolean z, @C12579k CampaignManager campaignManager, @C12579k FormModel formModel, @C12579k String str, @C12579k BannerConfiguration bannerConfiguration) {
            Intrinsics.checkNotNullParameter(campaignManager, "manager");
            Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
            Intrinsics.checkNotNullParameter(str, "campaignId");
            Intrinsics.checkNotNullParameter(bannerConfiguration, "bannerConfig");
            BannerConfigurableFragment bannerConfigurableFragment = new BannerConfigurableFragment();
            bannerConfigurableFragment.f27264a = campaignManager;
            bannerConfigurableFragment.setArguments(BannerConfigurableFragment.f27262y.mo20650a(z, str, formModel, bannerConfiguration));
            return bannerConfigurableFragment;
        }

        public C9915a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment$b */
    public static final class C9916b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ LinearLayout f27274a;

        /* renamed from: b */
        public final /* synthetic */ BannerConfigurableFragment f27275b;

        public C9916b(LinearLayout linearLayout, BannerConfigurableFragment bannerConfigurableFragment) {
            this.f27274a = linearLayout;
            this.f27275b = bannerConfigurableFragment;
        }

        public boolean onPreDraw() {
            this.f27274a.getViewTreeObserver().removeOnPreDrawListener(this);
            BannerConfigurableFragment bannerConfigurableFragment = this.f27275b;
            LinearLayout linearLayout = this.f27274a;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "banner");
            bannerConfigurableFragment.mo20647g1(linearLayout);
            LinearLayout linearLayout2 = this.f27274a;
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                BannerConfigurableFragment bannerConfigurableFragment2 = this.f27275b;
                Context requireContext = bannerConfigurableFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                int c = Intrinsics.checkNotNullParameter(requireContext, "<this>");
                Context requireContext2 = bannerConfigurableFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                int c2 = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
                Context requireContext3 = bannerConfigurableFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext()");
                int c3 = Intrinsics.checkNotNullParameter(requireContext3, "<this>");
                Context requireContext4 = bannerConfigurableFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext()");
                layoutParams2.setMargins(c, c2, c3, Intrinsics.checkNotNullParameter(requireContext4, "<this>"));
                C11079d2 d2Var = C11079d2.f28267a;
                linearLayout2.setLayoutParams(layoutParams2);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment$c */
    public static final class C9917c extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ BannerConfigurableFragment f27276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9917c(BannerConfigurableFragment bannerConfigurableFragment) {
            super(true);
            this.f27276d = bannerConfigurableFragment;
        }

        /* renamed from: f */
        public void mo792f() {
            this.f27276d.mo20635U0().mo20721e();
        }
    }

    /* renamed from: B */
    public void mo20629B(int i) {
        LinearLayout linearLayout;
        View view = getView();
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(C9747c.C9756i.banner_container)) != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                if (C10133g.m38352n(requireContext)) {
                    mo20644d1(layoutParams2);
                } else {
                    mo20643c1(layoutParams2, i);
                }
                C11079d2 d2Var = C11079d2.f28267a;
                linearLayout.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: C */
    public void mo20557C(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        mo20642b1().mo20787i(true);
        C9927c cVar = C9927c.f27338a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        cVar.mo20738b(requireContext, str, 1, BannerPosition.BOTTOM);
    }

    /* renamed from: K */
    public void mo20630K(@C12579k FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        fragmentManager.mo56909u().mo57211M(this.f27272w, 0).mo57202D(i, this, f27263z).mo57053r();
    }

    /* renamed from: L */
    public void mo20558L(@C12579k FeedbackResult feedbackResult, @C12579k String str) {
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C10128b.m38327b(requireActivity, mo20638X0().getFormType(), feedbackResult, str);
    }

    /* renamed from: Q0 */
    public final void mo20631Q0(BannerConfigurablePageView bannerConfigurablePageView) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        int c = Intrinsics.checkNotNullParameter(requireContext, "<this>");
        C11466l W1 = C11479u.m44378W1(0, bannerConfigurablePageView.getFieldsContainer().getChildCount() * 2);
        ArrayList<Number> arrayList = new ArrayList<>();
        Iterator it = W1.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() % 2 != 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            ViewGroup fieldsContainer = bannerConfigurablePageView.getFieldsContainer();
            Space space = new Space(requireContext());
            space.setLayoutParams(new LinearLayout.LayoutParams(1, c));
            C11079d2 d2Var = C11079d2.f28267a;
            fieldsContainer.addView(space, intValue2);
        }
    }

    /* renamed from: R0 */
    public final void mo20632R0() {
        Display display;
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            display = requireContext().getDisplay();
        } else {
            Object systemService = requireContext().getSystemService("window");
            if (systemService != null) {
                display = ((WindowManager) systemService).getDefaultDisplay();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        if ((requireActivity().getWindow().getAttributes().flags & C8698y1.f23301m) != 0 || (requireActivity().getWindow().getDecorView().getSystemUiVisibility() & 512) != 0) {
            if (display == null) {
                i = 0;
            } else {
                i = display.getRotation();
            }
            mo20629B(i);
        }
    }

    /* renamed from: S0 */
    public final LinearLayout mo20633S0(View view) {
        Drawable drawable;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C9747c.C9756i.banner_contour);
        relativeLayout.setClickable(!mo20637W0().mo20666f());
        String d = mo20637W0().mo20663d();
        if (d == null) {
            drawable = null;
        } else {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            drawable = C10133g.m38339a(requireContext, d);
        }
        relativeLayout.setBackground(drawable);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C9747c.C9756i.banner_container);
        linearLayout.getViewTreeObserver().addOnPreDrawListener(new C9916b(linearLayout, this));
        Intrinsics.checkNotNullExpressionValue(linearLayout, "banner");
        return linearLayout;
    }

    /* renamed from: T */
    public void mo20559T(@C12579k FeedbackResult feedbackResult) {
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C10134h.m38360a(requireContext, mo20638X0().getFormType(), feedbackResult);
    }

    /* renamed from: T0 */
    public final void mo20634T0(LinearLayout linearLayout) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        BannerConfigurablePageView bannerConfigurablePageView = new BannerConfigurablePageView(requireContext, mo20635U0());
        linearLayout.addView(bannerConfigurablePageView);
        ImageView Z0 = mo20640Z0();
        if (Z0 != null) {
            bannerConfigurablePageView.getFieldsContainer().addView(Z0, 0);
        }
        mo20631Q0(bannerConfigurablePageView);
    }

    /* renamed from: U0 */
    public final BannerPresenter mo20635U0() {
        return (BannerPresenter) this.f27271v.getValue();
    }

    /* renamed from: V0 */
    public final String mo20636V0() {
        Object value = this.f27267d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-campaignId>(...)");
        return (String) value;
    }

    /* renamed from: W0 */
    public final BannerConfiguration mo20637W0() {
        return (BannerConfiguration) this.f27265b.getValue();
    }

    /* renamed from: X0 */
    public final FormModel mo20638X0() {
        return (FormModel) this.f27268e.getValue();
    }

    /* renamed from: Y0 */
    public final int mo20639Y0() {
        int identifier = getResources().getIdentifier(BannerFragment.f27307X, BannerFragment.f27308Y, "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: Z0 */
    public final ImageView mo20640Z0() {
        BannerConfigLogo i = mo20637W0().mo20669i();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        Drawable k = i.mo20576k(requireContext);
        if (k == null) {
            return null;
        }
        ImageView imageView = new ImageView(requireContext());
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        int c = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
        int c2 = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
        int c3 = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
        int c4 = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
        int c5 = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
        int c6 = Intrinsics.checkNotNullParameter(requireContext2, "<this>");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c, c2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(c3, c4, c5, c6);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(k);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    /* renamed from: a1 */
    public final C12074o0 mo20641a1() {
        return (C12074o0) this.f27270g.getValue();
    }

    /* renamed from: b1 */
    public final CampaignSubmissionManager mo20642b1() {
        return (CampaignSubmissionManager) this.f27269f.getValue();
    }

    /* renamed from: c1 */
    public final void mo20643c1(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i != 0) {
            if (i == 1) {
                layoutParams.setMargins(0, 0, mo20639Y0(), 0);
                return;
            } else if (i != 2) {
                if (i == 3) {
                    layoutParams.setMargins(mo20639Y0(), 0, 0, 0);
                    return;
                }
                return;
            }
        }
        layoutParams.setMargins(0, 0, 0, mo20639Y0());
    }

    /* renamed from: d1 */
    public final void mo20644d1(RelativeLayout.LayoutParams layoutParams) {
        layoutParams.setMargins(0, 0, 0, mo20639Y0());
    }

    /* renamed from: e1 */
    public final boolean mo20645e1() {
        return ((Boolean) this.f27266c.getValue()).booleanValue();
    }

    /* renamed from: f1 */
    public final void mo20646f1(boolean z) {
        int i;
        if (z) {
            i = C9747c.C9748a.ub_fade_out;
        } else {
            i = this.f27273x;
        }
        requireActivity().mo57175g0().mo56909u().mo57211M(0, i).mo57038B(this).mo57052q();
    }

    /* renamed from: g1 */
    public final void mo20647g1(LinearLayout linearLayout) {
        Integer num;
        int i;
        Integer j = mo20637W0().mo20670j();
        if (j != null) {
            int intValue = j.intValue();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            int c = Intrinsics.checkNotNullParameter(requireContext, "<this>");
            if (linearLayout.getHeight() > c) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = c;
                C11079d2 d2Var = C11079d2.f28267a;
                linearLayout.setLayoutParams(layoutParams);
            }
        }
        Integer k = mo20637W0().mo20671k();
        if (k == null) {
            num = null;
        } else {
            int intValue2 = k.intValue();
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            num = Integer.valueOf(Intrinsics.checkNotNullParameter(requireContext2, "<this>"));
        }
        if (num == null) {
            i = getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_max_width);
        } else {
            i = num.intValue();
        }
        if (linearLayout.getWidth() > i) {
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.width = i;
            C11079d2 d2Var2 = C11079d2.f28267a;
            linearLayout.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: j0 */
    public void mo20648j0(@C12579k PageModel pageModel) {
        Intrinsics.checkNotNullParameter(pageModel, "pageModel");
        mo20646f1(true);
        if (isAdded()) {
            mo20642b1().mo20787i(false);
            mo20638X0().setCurrentPageIndex(mo20638X0().getPages().indexOf(pageModel));
            CampaignFormFragment.f27629F0.mo21161a(mo20638X0(), mo20645e1(), BannerPosition.BOTTOM).show(getParentFragmentManager(), f27263z);
        }
    }

    /* renamed from: m0 */
    public void mo20560m0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C10134h.m38361b(requireContext, str);
    }

    public void onCreate(@C12580l Bundle bundle) {
        OnBackPressedDispatcher Z;
        super.onCreate(bundle);
        C19232h activity = getActivity();
        if (activity != null && (Z = activity.mo702Z()) != null) {
            Z.mo764c(this, new C9917c(this));
        }
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        mo20635U0().mo20710f(this);
        mo20635U0().mo20732n0(mo20637W0());
        return layoutInflater.inflate(C9747c.C9759l.banner_configurable, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo20635U0().mo20711g();
    }

    public void onResume() {
        super.onResume();
        BannerPresenter U0 = mo20635U0();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        U0.mo20731m0(C10133g.m38351m(requireContext));
        View view = getView();
        if (view != null) {
            mo20634T0(mo20633S0(view));
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            C11723c2 unused = C12038j.m48061f(mo20641a1(), (CoroutineContext) null, (CoroutineStart) null, new BannerConfigurableFragment$onViewCreated$1(this, (C11045c<? super BannerConfigurableFragment$onViewCreated$1>) null), 3, (Object) null);
        }
        mo20632R0();
    }

    /* renamed from: t */
    public void mo20649t() {
        mo20642b1().mo20791m(mo20638X0());
    }

    /* renamed from: y0 */
    public void mo20561y0() {
        mo20646f1(false);
    }
}
