package com.usabilla.sdk.ubform.sdk.form;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.C19232h;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.firebase.remoteconfig.C33585u;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.screenshot.UbScreenshotActivity;
import com.usabilla.sdk.ubform.sdk.C9927c;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel;
import com.usabilla.sdk.ubform.sdk.form.contract.C10053a;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10057b;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10058c;
import com.usabilla.sdk.ubform.sdk.form.view.C10060a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.ext.C10128b;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import com.usabilla.sdk.ubform.utils.ext.C10134h;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b \u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u0007¢\u0006\u0004\bN\u0010OJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002R\"\u0010*\u001a\u00020!8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010A\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0004X\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006Q"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/BaseForm;", "Landroidx/fragment/app/c;", "Lcom/usabilla/sdk/ubform/sdk/form/a;", "Lcom/usabilla/sdk/ubform/sdk/form/b;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onResume", "Landroid/app/Dialog;", "onCreateDialog", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/b;", "K0", "onDestroy", "outState", "onSaveInstanceState", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "Lcom/usabilla/sdk/ubform/sdk/UbScreenshot;", "screenshot", "W", "Lcom/usabilla/sdk/ubform/sdk/entity/FeedbackResult;", "feedbackResult", "", "entries", "L", "T", "m0", "text", "C", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "model", "Q0", "a", "Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "O0", "()Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "U0", "(Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;)V", "formModel", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/ClientModel;", "b", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/ClientModel;", "L0", "()Lcom/usabilla/sdk/ubform/sdk/field/model/common/ClientModel;", "S0", "(Lcom/usabilla/sdk/ubform/sdk/field/model/common/ClientModel;)V", "clientModel", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;", "c", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;", "P0", "()Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;", "V0", "(Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;)V", "presenter", "d", "Ljava/lang/String;", "N0", "()Ljava/lang/String;", "T0", "(Ljava/lang/String;)V", "formId", "Lcom/usabilla/sdk/ubform/sdk/form/view/a;", "e", "Lcom/usabilla/sdk/ubform/sdk/form/view/a;", "M0", "()Lcom/usabilla/sdk/ubform/sdk/form/view/a;", "formAdapter", "", "f", "Lkotlin/z;", "R0", "()Z", "isPlayStoreAvailable", "<init>", "()V", "g", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class BaseForm extends C19215c implements C10048a, C10049b {
    @C12579k

    /* renamed from: g */
    public static final C10042a f27615g = new C10042a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: v */
    public static final String f27616v = "formModel";
    @C12579k

    /* renamed from: w */
    public static final String f27617w = "is PlayStore available";
    @C12579k

    /* renamed from: x */
    public static final String f27618x = "savedFormId";
    @C12579k

    /* renamed from: y */
    public static final String f27619y = "savedModel";
    @C12579k

    /* renamed from: z */
    public static final String f27620z = "savedClientModel";

    /* renamed from: a */
    public FormModel f27621a;

    /* renamed from: b */
    public ClientModel f27622b;
    @C12580l

    /* renamed from: c */
    public C10058c f27623c;
    @C12580l

    /* renamed from: d */
    public String f27624d;
    @C12579k

    /* renamed from: e */
    public final C10060a f27625e = new C10060a();
    @C12579k

    /* renamed from: f */
    public final C11677z f27626f = C10864b0.m38748c(new BaseForm$isPlayStoreAvailable$2(this));

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.BaseForm$a */
    public static final class C10042a {
        public /* synthetic */ C10042a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final Bundle mo21152a(@C12579k FormModel formModel, boolean z) {
            Intrinsics.checkNotNullParameter(formModel, C40045d.f102104u);
            Bundle bundle = new Bundle();
            bundle.putParcelable(BaseForm.f27616v, formModel);
            bundle.putBoolean(BaseForm.f27617w, z);
            return bundle;
        }

        public C10042a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.BaseForm$b */
    public static final class C10043b extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ BaseForm f27627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10043b(BaseForm baseForm) {
            super(true);
            this.f27627d = baseForm;
        }

        /* renamed from: f */
        public void mo792f() {
            C10058c P0 = this.f27627d.mo21144P0();
            if (P0 != null) {
                P0.mo21177e();
            }
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.BaseForm$c */
    public static final class C10044c extends Dialog {

        /* renamed from: a */
        public final /* synthetic */ BaseForm f27628a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10044c(BaseForm baseForm, C19232h hVar, int i) {
            super(hVar, i);
            this.f27628a = baseForm;
        }

        public void onBackPressed() {
            C10058c P0 = this.f27628a.mo21144P0();
            if (P0 != null) {
                P0.mo21177e();
            }
        }
    }

    /* renamed from: C */
    public void mo20557C(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        C9927c cVar = C9927c.f27338a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        cVar.mo20738b(requireContext, str, 1, mo21143O0().getCampaignBannerPosition());
    }

    @C12579k
    /* renamed from: K0 */
    public abstract C10057b mo21139K0();

    /* renamed from: L */
    public void mo20558L(@C12579k FeedbackResult feedbackResult, @C12579k String str) {
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C10128b.m38327b(requireActivity, mo21143O0().getFormType(), feedbackResult, str);
    }

    @C12579k
    /* renamed from: L0 */
    public final ClientModel mo21140L0() {
        ClientModel clientModel = this.f27622b;
        if (clientModel != null) {
            return clientModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clientModel");
        throw null;
    }

    @C12579k
    /* renamed from: M0 */
    public final C10060a mo21141M0() {
        return this.f27625e;
    }

    @C12580l
    /* renamed from: N0 */
    public final String mo21142N0() {
        return this.f27624d;
    }

    @C12579k
    /* renamed from: O0 */
    public final FormModel mo21143O0() {
        FormModel formModel = this.f27621a;
        if (formModel != null) {
            return formModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException(f27616v);
        throw null;
    }

    @C12580l
    /* renamed from: P0 */
    public final C10058c mo21144P0() {
        return this.f27623c;
    }

    /* renamed from: Q0 */
    public final FormModel mo21145Q0(FormModel formModel) {
        FormModel formModel2;
        if (C11622t.isBlank(formModel.getTextButtonClose())) {
            String string = getResources().getString(C9747c.C9761n.ub_button_close_default);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.ub_button_close_default)");
            formModel2 = FormModel.copy$default(formModel, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, string, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048447, (Object) null);
        } else {
            formModel2 = formModel;
        }
        if (C11622t.isBlank(formModel2.getTitleScreenshot())) {
            String string2 = getResources().getString(C9747c.C9761n.ub_element_screenshot_title);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.ub_element_screenshot_title)");
            formModel2 = FormModel.copy$default(formModel2, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, string2, (String) null, false, false, false, false, false, false, 0, 1046527, (Object) null);
        }
        FormModel formModel3 = formModel2;
        if (C11622t.isBlank(formModel3.getTextButtonPlayStore())) {
            String string3 = getResources().getString(C9747c.C9761n.ub_button_playStore_default);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.ub_button_playStore_default)");
            formModel3 = FormModel.copy$default(formModel3, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, string3, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048063, (Object) null);
        }
        FormModel formModel4 = formModel3;
        if (C11622t.isBlank(formModel4.getTextButtonNext())) {
            String string4 = getResources().getString(C9747c.C9761n.ub_button_continue_default);
            Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.ub_button_continue_default)");
            formModel4 = FormModel.copy$default(formModel4, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, string4, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048319, (Object) null);
        }
        FormModel formModel5 = formModel4;
        if (!C11622t.isBlank(formModel5.getTextButtonSubmit())) {
            return formModel5;
        }
        String string5 = getResources().getString(C9747c.C9761n.ub_button_submit_default);
        Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.string.ub_button_submit_default)");
        return FormModel.copy$default(formModel5, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, string5, (String) null, (String) null, false, false, false, false, false, false, 0, 1047551, (Object) null);
    }

    /* renamed from: R0 */
    public final boolean mo21146R0() {
        return ((Boolean) this.f27626f.getValue()).booleanValue();
    }

    /* renamed from: S0 */
    public final void mo21147S0(@C12579k ClientModel clientModel) {
        Intrinsics.checkNotNullParameter(clientModel, "<set-?>");
        this.f27622b = clientModel;
    }

    /* renamed from: T */
    public void mo20559T(@C12579k FeedbackResult feedbackResult) {
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C10134h.m38360a(requireContext, mo21143O0().getFormType(), feedbackResult);
    }

    /* renamed from: T0 */
    public final void mo21148T0(@C12580l String str) {
        this.f27624d = str;
    }

    /* renamed from: U0 */
    public final void mo21149U0(@C12579k FormModel formModel) {
        Intrinsics.checkNotNullParameter(formModel, "<set-?>");
        this.f27621a = formModel;
    }

    /* renamed from: V0 */
    public final void mo21150V0(@C12580l C10058c cVar) {
        this.f27623c = cVar;
    }

    /* renamed from: W */
    public void mo21151W(@C12579k UbInternalTheme ubInternalTheme, @C12580l UbScreenshot ubScreenshot) {
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        UbScreenshotActivity.f27094c1.mo20370a(this, 1001, ubInternalTheme, ubScreenshot);
    }

    /* renamed from: m0 */
    public void mo20560m0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C10134h.m38361b(requireContext, str);
    }

    public void onCreate(@C12580l Bundle bundle) {
        FormModel formModel;
        ClientModel clientModel;
        OnBackPressedDispatcher Z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            formModel = null;
        } else {
            formModel = (FormModel) arguments.getParcelable(f27616v);
        }
        if (formModel != null) {
            mo21149U0(formModel);
            if (bundle == null) {
                clientModel = null;
            } else {
                clientModel = (ClientModel) bundle.getParcelable(f27620z);
            }
            if (clientModel == null) {
                clientModel = new ClientModel((String) null, 1, (DefaultConstructorMarker) null);
            }
            mo21147S0(clientModel);
            mo21145Q0(mo21143O0());
            C19232h activity = getActivity();
            if (activity != null && (Z = activity.mo702Z()) != null) {
                Z.mo764c(this, new C10043b(this));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @C12579k
    public Dialog onCreateDialog(@C12580l Bundle bundle) {
        return new C10044c(this, requireActivity(), getTheme());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f27623c = null;
    }

    public void onResume() {
        super.onResume();
        UbInternalTheme theme = mo21143O0().getTheme();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        theme.setDarkModeActive$ubform_sdkRelease(C10133g.m38351m(requireContext));
    }

    public void onSaveInstanceState(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f27619y, mo21143O0());
        bundle.putParcelable(f27620z, mo21140L0());
        bundle.putString(f27618x, this.f27624d);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        C10053a.C10055b bVar;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C10058c cVar = new C10058c(this, mo21143O0(), mo21139K0(), mo21140L0(), mo21146R0());
        this.f27623c = cVar;
        if (view instanceof C10053a.C10055b) {
            bVar = (C10053a.C10055b) view;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.setFormPresenter(cVar);
        }
    }
}
