package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.utils.C10140g;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

public final class CampaignSubmissionManager {
    @C12579k

    /* renamed from: a */
    public final AppInfo f27404a;
    @C12579k

    /* renamed from: b */
    public final CampaignService f27405b;
    @C12579k

    /* renamed from: c */
    public final C10140g f27406c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f27407d;
    @C12579k

    /* renamed from: e */
    public String f27408e = "";
    @C12579k

    /* renamed from: f */
    public String f27409f = "";

    /* renamed from: g */
    public boolean f27410g;

    public CampaignSubmissionManager(@C12579k AppInfo appInfo, @C12579k CampaignService campaignService, @C12579k C10140g gVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(campaignService, "service");
        Intrinsics.checkNotNullParameter(gVar, "payloadGenerator");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f27404a = appInfo;
        this.f27405b = campaignService;
        this.f27406c = gVar;
        this.f27407d = o0Var;
    }

    @C12579k
    /* renamed from: f */
    public final String mo20784f() {
        return this.f27409f;
    }

    /* renamed from: g */
    public final boolean mo20785g() {
        return this.f27410g;
    }

    /* renamed from: h */
    public final void mo20786h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f27409f = str;
    }

    /* renamed from: i */
    public final void mo20787i(boolean z) {
        this.f27410g = z;
    }

    /* renamed from: j */
    public final C11907e<C11079d2> mo20788j(JSONObject jSONObject) {
        return C11909g.m47494u(this.f27405b.mo20755k(this.f27408e, this.f27409f, jSONObject), new CampaignSubmissionManager$submitCampaignPatch$1(this, (C11045c<? super CampaignSubmissionManager$submitCampaignPatch$1>) null));
    }

    /* renamed from: k */
    public final void mo20789k(@C12579k FormModel formModel) {
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        JSONObject b = this.f27406c.mo21585b(formModel, true);
        if (b != null) {
            C11723c2 unused = C12038j.m48061f(this.f27407d, (CoroutineContext) null, (CoroutineStart) null, new CampaignSubmissionManager$submitCampaignPatchFinal$1$1(this, b, (C11045c<? super CampaignSubmissionManager$submitCampaignPatchFinal$1$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: l */
    public final void mo20790l(@C12579k FormModel formModel) {
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        JSONObject b = this.f27406c.mo21585b(formModel, false);
        if (b != null) {
            C11723c2 unused = C12038j.m48061f(this.f27407d, (CoroutineContext) null, (CoroutineStart) null, new CampaignSubmissionManager$submitCampaignPatchUpdate$1$1(this, b, (C11045c<? super CampaignSubmissionManager$submitCampaignPatchUpdate$1$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: m */
    public final void mo20791m(@C12579k FormModel formModel) {
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        JSONObject c = this.f27406c.mo21586c(this.f27404a, formModel, false);
        if (c == null) {
            c = new JSONObject();
        }
        C11723c2 unused = C12038j.m48061f(this.f27407d, (CoroutineContext) null, (CoroutineStart) null, new CampaignSubmissionManager$submitCampaignPost$1(this, c, formModel, (C11045c<? super CampaignSubmissionManager$submitCampaignPost$1>) null), 3, (Object) null);
    }
}
