package com.usabilla.sdk.ubform.sdk.banner;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
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
import com.usabilla.sdk.ubform.sdk.page.view.BannerPageView;
import com.usabilla.sdk.ubform.utils.ext.C10128b;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import com.usabilla.sdk.ubform.utils.ext.C10134h;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b]\u0010^J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\r\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\f\u0010\u000e\u001a\u00020\u0004*\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\tH\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0016R\u0016\u00103\u001a\u0002008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010<R\u001b\u0010A\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0002¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0002¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0002¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0002¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010W¨\u0006`"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/usabilla/sdk/ubform/sdk/a;", "Lcom/usabilla/sdk/ubform/sdk/banner/contract/a$b;", "Lkotlin/d2;", "a1", "", "showForm", "Z0", "", "T0", "Landroid/widget/FrameLayout$LayoutParams;", "rotation", "W0", "X0", "O0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onResume", "Lcom/usabilla/sdk/ubform/sdk/page/model/PageModel;", "pageModel", "j0", "y0", "Lcom/usabilla/sdk/ubform/sdk/entity/FeedbackResult;", "feedbackResult", "", "entries", "L", "T", "m0", "text", "C", "t", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "containerId", "K", "onDestroyView", "B", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;", "a", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignManager;", "campaignManager", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "b", "Lkotlin/z;", "P0", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "bannerPosition", "c", "Y0", "()Z", "isPlayStoreAvailable", "d", "R0", "()Ljava/lang/String;", "campaignId", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "e", "S0", "()Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "formModel", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignSubmissionManager;", "f", "V0", "()Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignSubmissionManager;", "submissionManager", "Lkotlinx/coroutines/o0;", "g", "U0", "()Lkotlinx/coroutines/o0;", "scope", "Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "v", "Q0", "()Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "bannerPresenter", "w", "I", "animIn", "x", "animOut", "y", "layout", "<init>", "()V", "z", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerFragment extends Fragment implements C9911a, C9924a.C9926b {
    @C12579k

    /* renamed from: E0 */
    public static final String f27303E0 = "USABILLA_CAMPAIGN_BANNER_FRAGMENT_TAG";
    @C12579k

    /* renamed from: F0 */
    public static final String f27304F0 = "campaign ID";
    @C12579k

    /* renamed from: G0 */
    public static final String f27305G0 = "playstore info";
    @C12579k

    /* renamed from: H0 */
    public static final String f27306H0 = "form model";
    @C12579k

    /* renamed from: X */
    public static final String f27307X = "navigation_bar_height";
    @C12579k

    /* renamed from: Y */
    public static final String f27308Y = "dimen";
    @C12579k

    /* renamed from: Z */
    public static final String f27309Z = "android";
    @C12579k

    /* renamed from: z */
    public static final C9919a f27310z = new C9919a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public CampaignManager f27311a;
    @C12579k

    /* renamed from: b */
    public final C11677z f27312b = C10864b0.m38748c(new BannerFragment$bannerPosition$2(this));
    @C12579k

    /* renamed from: c */
    public final C11677z f27313c = C10864b0.m38748c(new BannerFragment$isPlayStoreAvailable$2(this));
    @C12579k

    /* renamed from: d */
    public final C11677z f27314d = C10864b0.m38748c(new BannerFragment$campaignId$2(this));
    @C12579k

    /* renamed from: e */
    public final C11677z f27315e = C10864b0.m38748c(new BannerFragment$formModel$2(this));
    @C12579k

    /* renamed from: f */
    public final C11677z f27316f = C10864b0.m38748c(BannerFragment$submissionManager$2.f27324f);
    @C12579k

    /* renamed from: g */
    public final C11677z f27317g = C10864b0.m38748c(BannerFragment$scope$2.f27323f);
    @C12579k

    /* renamed from: v */
    public final C11677z f27318v = C10864b0.m38748c(new BannerFragment$bannerPresenter$2(this));

    /* renamed from: w */
    public int f27319w;

    /* renamed from: x */
    public int f27320x;

    /* renamed from: y */
    public int f27321y;

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerFragment$a */
    public static final class C9919a {
        public /* synthetic */ C9919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo20698a(boolean z, String str, FormModel formModel) {
            Bundle bundle = new Bundle();
            bundle.putString("campaign ID", str);
            bundle.putBoolean(BannerFragment.f27305G0, z);
            bundle.putParcelable("form model", formModel);
            return bundle;
        }

        @C12579k
        /* renamed from: b */
        public final BannerFragment mo20699b(boolean z, @C12579k CampaignManager campaignManager, @C12579k FormModel formModel, @C12579k String str) {
            Intrinsics.checkNotNullParameter(campaignManager, "manager");
            Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
            Intrinsics.checkNotNullParameter(str, "campaignId");
            BannerFragment bannerFragment = new BannerFragment();
            bannerFragment.f27311a = campaignManager;
            bannerFragment.setArguments(BannerFragment.f27310z.mo20698a(z, str, formModel));
            return bannerFragment;
        }

        public C9919a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerFragment$b */
    public /* synthetic */ class C9920b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerPosition.values().length];
            iArr[BannerPosition.TOP.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerFragment$c */
    public static final class C9921c extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ BannerFragment f27322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9921c(BannerFragment bannerFragment) {
            super(true);
            this.f27322d = bannerFragment;
        }

        /* renamed from: f */
        public void mo792f() {
            this.f27322d.mo20687Q0().mo20721e();
        }
    }

    /* renamed from: B */
    public void mo20629B(int i) {
        LinearLayout linearLayout;
        View view = getView();
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(C9747c.C9756i.banner_container)) != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                if (C10133g.m38352n(requireContext)) {
                    mo20694X0(layoutParams2);
                } else {
                    mo20693W0(layoutParams2, i);
                }
                C11079d2 d2Var = C11079d2.f28267a;
                linearLayout.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: C */
    public void mo20557C(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        mo20692V0().mo20787i(true);
        C9927c cVar = C9927c.f27338a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        cVar.mo20738b(requireContext, str, 1, mo20686P0());
    }

    /* renamed from: K */
    public void mo20630K(@C12579k FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        fragmentManager.mo56909u().mo57211M(this.f27319w, 0).mo57202D(i, this, f27303E0).mo57053r();
    }

    /* renamed from: L */
    public void mo20558L(@C12579k FeedbackResult feedbackResult, @C12579k String str) {
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C10128b.m38327b(requireActivity, mo20689S0().getFormType(), feedbackResult, str);
    }

    /* renamed from: O0 */
    public final void mo20685O0() {
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
        BannerPresenter Q0 = mo20687Q0();
        int systemUiVisibility = requireActivity().getWindow().getDecorView().getSystemUiVisibility();
        int i2 = requireActivity().getWindow().getAttributes().flags;
        if (display == null) {
            i = 0;
        } else {
            i = display.getRotation();
        }
        Q0.mo20709d(systemUiVisibility, i2, i);
    }

    /* renamed from: P0 */
    public final BannerPosition mo20686P0() {
        return (BannerPosition) this.f27312b.getValue();
    }

    /* renamed from: Q0 */
    public final BannerPresenter mo20687Q0() {
        return (BannerPresenter) this.f27318v.getValue();
    }

    /* renamed from: R0 */
    public final String mo20688R0() {
        Object value = this.f27314d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-campaignId>(...)");
        return (String) value;
    }

    /* renamed from: S0 */
    public final FormModel mo20689S0() {
        return (FormModel) this.f27315e.getValue();
    }

    /* renamed from: T */
    public void mo20559T(@C12579k FeedbackResult feedbackResult) {
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C10134h.m38360a(requireContext, mo20689S0().getFormType(), feedbackResult);
    }

    /* renamed from: T0 */
    public final int mo20690T0() {
        int identifier = getResources().getIdentifier(f27307X, f27308Y, "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: U0 */
    public final C12074o0 mo20691U0() {
        return (C12074o0) this.f27317g.getValue();
    }

    /* renamed from: V0 */
    public final CampaignSubmissionManager mo20692V0() {
        return (CampaignSubmissionManager) this.f27316f.getValue();
    }

    /* renamed from: W0 */
    public final void mo20693W0(FrameLayout.LayoutParams layoutParams, int i) {
        if (i != 0) {
            if (i == 1) {
                layoutParams.setMargins(0, 0, mo20690T0(), 0);
                return;
            } else if (i != 2) {
                if (i == 3) {
                    layoutParams.setMargins(mo20690T0(), 0, 0, 0);
                    return;
                }
                return;
            }
        }
        layoutParams.setMargins(0, 0, 0, mo20690T0());
    }

    /* renamed from: X0 */
    public final void mo20694X0(FrameLayout.LayoutParams layoutParams) {
        layoutParams.setMargins(0, 0, 0, mo20690T0());
    }

    /* renamed from: Y0 */
    public final boolean mo20695Y0() {
        return ((Boolean) this.f27313c.getValue()).booleanValue();
    }

    /* renamed from: Z0 */
    public final void mo20696Z0(boolean z) {
        int i;
        if (z) {
            i = C9747c.C9748a.ub_fade_out;
        } else {
            i = this.f27320x;
        }
        requireActivity().mo57175g0().mo56909u().mo57211M(0, i).mo57038B(this).mo57052q();
    }

    /* renamed from: a1 */
    public final void mo20697a1() {
        if (C9920b.$EnumSwitchMapping$0[mo20686P0().ordinal()] == 1) {
            this.f27321y = C9747c.C9759l.ub_top_banner;
            this.f27319w = C9747c.C9748a.ub_top_banner_enter;
            this.f27320x = C9747c.C9748a.ub_top_banner_exit;
            return;
        }
        this.f27321y = C9747c.C9759l.ub_bottom_banner;
        this.f27319w = C9747c.C9748a.ub_bottom_banner_enter;
        this.f27320x = C9747c.C9748a.ub_bottom_banner_exit;
    }

    /* renamed from: j0 */
    public void mo20648j0(@C12579k PageModel pageModel) {
        Intrinsics.checkNotNullParameter(pageModel, "pageModel");
        mo20696Z0(true);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            mo20692V0().mo20787i(false);
            mo20689S0().setCurrentPageIndex(mo20689S0().getPages().indexOf(pageModel));
            CampaignFormFragment.f27629F0.mo21161a(mo20689S0(), mo20695Y0(), mo20686P0()).show(fragmentManager, f27303E0);
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
        setRetainInstance(true);
        mo20697a1();
        C19232h activity = getActivity();
        if (activity != null && (Z = activity.mo702Z()) != null) {
            Z.mo764c(this, new C9921c(this));
        }
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        mo20687Q0().mo20710f(this);
        return layoutInflater.inflate(this.f27321y, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo20687Q0().mo20711g();
    }

    public void onResume() {
        super.onResume();
        BannerPresenter Q0 = mo20687Q0();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        Q0.mo20731m0(C10133g.m38351m(requireContext));
        mo20685O0();
        View view = getView();
        if (view != null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            BannerPageView bannerPageView = new BannerPageView(requireContext2, mo20687Q0());
            bannerPageView.setClickable(true);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C9747c.C9756i.banner_container);
            if (linearLayout.getBackground() instanceof LayerDrawable) {
                Drawable background = linearLayout.getBackground();
                if (background != null) {
                    ((LayerDrawable) background).findDrawableByLayerId(C9747c.C9756i.custom_background).setColorFilter(mo20689S0().getTheme().getColors().getBackground(), PorterDuff.Mode.SRC_ATOP);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                }
            }
            linearLayout.removeAllViews();
            linearLayout.addView(bannerPageView);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            C11723c2 unused = C12038j.m48061f(mo20691U0(), (CoroutineContext) null, (CoroutineStart) null, new BannerFragment$onViewCreated$1(this, (C11045c<? super BannerFragment$onViewCreated$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: t */
    public void mo20649t() {
        mo20692V0().mo20791m(mo20689S0());
    }

    /* renamed from: y0 */
    public void mo20561y0() {
        mo20696Z0(false);
    }
}
