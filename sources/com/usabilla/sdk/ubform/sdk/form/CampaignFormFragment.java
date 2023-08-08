package com.usabilla.sdk.ubform.sdk.form;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.p007db.campaign.CampaignTable;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10056a;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10057b;
import com.usabilla.sdk.ubform.sdk.form.view.FormView;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006*"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/CampaignFormFragment;", "Lcom/usabilla/sdk/ubform/sdk/form/BaseForm;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "i", "y0", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/b;", "K0", "Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignSubmissionManager;", "X", "Lkotlin/z;", "X0", "()Lcom/usabilla/sdk/ubform/sdk/campaign/CampaignSubmissionManager;", "campaignSubmissionManager", "", "Y", "W0", "()Ljava/lang/Integer;", "animExit", "Z", "Z0", "()I", "style", "E0", "Lcom/usabilla/sdk/ubform/sdk/form/CampaignFormFragment;", "Y0", "()Lcom/usabilla/sdk/ubform/sdk/form/CampaignFormFragment;", "fragment", "<init>", "()V", "F0", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class CampaignFormFragment extends BaseForm {
    @C12579k

    /* renamed from: F0 */
    public static final C10045a f27629F0 = new C10045a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: G0 */
    public static final String f27630G0 = "style";
    @C12579k

    /* renamed from: H0 */
    public static final String f27631H0 = "exit animation";
    @C12579k

    /* renamed from: E0 */
    public final CampaignFormFragment f27632E0 = this;
    @C12579k

    /* renamed from: X */
    public final C11677z f27633X = C10864b0.m38748c(CampaignFormFragment$campaignSubmissionManager$2.f27636f);
    @C12579k

    /* renamed from: Y */
    public final C11677z f27634Y = C10864b0.m38748c(new CampaignFormFragment$animExit$2(this));
    @C12579k

    /* renamed from: Z */
    public final C11677z f27635Z = C10864b0.m38748c(new CampaignFormFragment$style$2(this));

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.CampaignFormFragment$a */
    public static final class C10045a {

        /* renamed from: com.usabilla.sdk.ubform.sdk.form.CampaignFormFragment$a$a */
        public /* synthetic */ class C10046a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BannerPosition.values().length];
                iArr[BannerPosition.TOP.ordinal()] = 1;
                iArr[BannerPosition.BOTTOM.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C10045a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final CampaignFormFragment mo21161a(@C12579k FormModel formModel, boolean z, @C12579k BannerPosition bannerPosition) {
            Pair pair;
            Intrinsics.checkNotNullParameter(formModel, "formCampaignModel");
            Intrinsics.checkNotNullParameter(bannerPosition, CampaignTable.f26813m);
            CampaignFormFragment campaignFormFragment = new CampaignFormFragment();
            Bundle a = BaseForm.f27615g.mo21152a(formModel, z);
            int i = C10046a.$EnumSwitchMapping$0[bannerPosition.ordinal()];
            if (i == 1) {
                pair = C11078d1.m42659a(Integer.valueOf(C9747c.C9762o.CampaignDialogTheme_Top), Integer.valueOf(C9747c.C9748a.ub_top_dialog_exit));
            } else if (i == 2) {
                pair = C11078d1.m42659a(Integer.valueOf(C9747c.C9762o.CampaignDialogTheme_Bottom), Integer.valueOf(C9747c.C9748a.ub_bottom_dialog_exit));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int intValue = ((Number) pair.mo21846a()).intValue();
            int intValue2 = ((Number) pair.mo21847b()).intValue();
            a.putInt("style", intValue);
            a.putInt(CampaignFormFragment.f27631H0, intValue2);
            C11079d2 d2Var = C11079d2.f28267a;
            campaignFormFragment.setArguments(a);
            return campaignFormFragment;
        }

        public C10045a() {
        }
    }

    @C12579k
    /* renamed from: K0 */
    public C10057b mo21139K0() {
        return new C10056a(mo21143O0().getPages(), mo21156X0());
    }

    /* renamed from: W0 */
    public final Integer mo21155W0() {
        return (Integer) this.f27634Y.getValue();
    }

    /* renamed from: X0 */
    public final CampaignSubmissionManager mo21156X0() {
        return (CampaignSubmissionManager) this.f27633X.getValue();
    }

    @C12579k
    /* renamed from: Y0 */
    public CampaignFormFragment mo21160u() {
        return this.f27632E0;
    }

    /* renamed from: Z0 */
    public final int mo21158Z0() {
        return ((Number) this.f27635Z.getValue()).intValue();
    }

    /* renamed from: i */
    public void mo21159i() {
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (!C10133g.m38352n(requireContext)) {
            setStyle(0, mo21158Z0());
        }
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        if (bundle != null) {
            if (bundle.containsKey(BaseForm.f27619y)) {
                Parcelable parcelable = bundle.getParcelable(BaseForm.f27619y);
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "it.getParcelable(SAVED_MODEL)!!");
                mo21149U0((FormModel) parcelable);
            }
            if (mo21142N0() == null) {
                mo21148T0(bundle.getString(BaseForm.f27618x));
            }
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(19);
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return new FormView(requireContext, mo21141M0());
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null) {
            window = null;
        } else {
            window = dialog2.getWindow();
        }
        if (window != null) {
            window.setStatusBarColor(mo21143O0().getTheme().getColors().getAccent());
        }
    }

    /* renamed from: y0 */
    public void mo20561y0() {
        Integer num;
        Integer W0 = mo21155W0();
        if (W0 == null) {
            num = null;
        } else {
            num = Integer.valueOf(requireActivity().mo57175g0().mo56909u().mo57211M(0, W0.intValue()).mo57038B(this).mo57053r());
        }
        if (num == null) {
            dismiss();
        }
    }
}
