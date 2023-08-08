package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTConsentInteractionType;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35123w;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35182x;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.o0 */
public class C35231o0 extends C31185b implements View.OnClickListener, C35127a {

    /* renamed from: E0 */
    public C34964a f86460E0;

    /* renamed from: X */
    public C35123w f86461X;

    /* renamed from: Y */
    public OTConfiguration f86462Y;

    /* renamed from: Z */
    public UIUtils f86463Z;

    /* renamed from: a */
    public TextView f86464a;

    /* renamed from: b */
    public TextView f86465b;

    /* renamed from: c */
    public TextView f86466c;

    /* renamed from: d */
    public View f86467d;

    /* renamed from: e */
    public Button f86468e;

    /* renamed from: f */
    public RecyclerView f86469f;

    /* renamed from: g */
    public C31178a f86470g;

    /* renamed from: v */
    public ImageView f86471v;

    /* renamed from: w */
    public Context f86472w;

    /* renamed from: x */
    public OTPublishersHeadlessSDK f86473x;

    /* renamed from: y */
    public C35127a f86474y;

    /* renamed from: z */
    public JSONObject f86475z;

    @C0359n0
    /* renamed from: Q0 */
    public static C35231o0 m145261Q0(@C0359n0 String str, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35231o0 o0Var = new C35231o0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        o0Var.setArguments(bundle);
        o0Var.mo105451V0(oTPublishersHeadlessSDK);
        return o0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ void m145262S0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86470g = aVar;
        this.f86463Z.mo104281t(this.f86472w, aVar);
        this.f86470g.setCancelable(false);
        this.f86470g.setCanceledOnTouchOutside(false);
        this.f86470g.setOnKeyListener(new C35224l0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ boolean m145263W0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            mo105447E(2);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m145264X0(View view) {
        dismiss();
    }

    /* renamed from: E */
    public void mo105447E(int i) {
        dismiss();
        C35127a aVar = this.f86474y;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    /* renamed from: R0 */
    public void mo105448R0(Context context) {
        try {
            this.f86475z = this.f86473x.getPreferenceCenterData();
        } catch (JSONException e) {
            OTLogger.m143457l("OTUCPurposesFragment", "Error in PC data initialization. Error msg = " + e.getMessage());
        }
        try {
            this.f86461X = new C35124x(context).mo105013d(this.f86460E0);
        } catch (JSONException e2) {
            OTLogger.m143457l("OTUCPurposesFragment", "Error in ui property object, error message = " + e2.getMessage());
        }
    }

    /* renamed from: T0 */
    public final void mo105449T0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.consent_preferences_list);
        this.f86469f = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f86469f.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f86466c = (TextView) view.findViewById(C35265a.C35273h.title);
        this.f86468e = (Button) view.findViewById(C35265a.C35273h.btn_save_consent_preferences);
        this.f86465b = (TextView) view.findViewById(C35265a.C35273h.consent_preferences_title);
        this.f86464a = (TextView) view.findViewById(C35265a.C35273h.consent_preferences_description);
        this.f86471v = (ImageView) view.findViewById(C35265a.C35273h.close_cp);
        this.f86467d = view.findViewById(C35265a.C35273h.header_rv_divider);
        this.f86471v.setOnClickListener(new C35229n0(this));
    }

    /* renamed from: U0 */
    public final void mo105450U0(@C0359n0 Button button, @C0359n0 C35105e eVar) {
        C35110j o = eVar.mo104712o();
        this.f86463Z.mo104283v(button, o, this.f86462Y);
        if (!C35020d.m143605J(o.mo104757f())) {
            button.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        if (!C35020d.m143605J(eVar.mo104296u())) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        }
        UIUtils.m143755p(this.f86472w, button, eVar, !C35020d.m143605J(eVar.mo104699a()) ? eVar.mo104699a() : "", eVar.mo104702e());
    }

    /* renamed from: V0 */
    public void mo105451V0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86473x = oTPublishersHeadlessSDK;
    }

    /* renamed from: a */
    public final void mo105452a() {
        this.f86468e.setOnClickListener(this);
        this.f86471v.setOnClickListener(this);
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 1) {
            mo105447E(i);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.btn_save_consent_preferences) {
            this.f86473x.saveConsent(OTConsentInteractionType.UC_PC_CONFIRM);
        } else if (id != C35265a.C35273h.close_cp) {
            return;
        }
        mo105447E(2);
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86463Z.mo104281t(this.f86472w, this.f86470g);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext != null && this.f86473x == null) {
            this.f86473x = new OTPublishersHeadlessSDK(applicationContext);
        }
        OTPublishersHeadlessSDK oTPublishersHeadlessSDK = this.f86473x;
        if (oTPublishersHeadlessSDK != null) {
            this.f86460E0 = oTPublishersHeadlessSDK.getUcpHandler();
        }
        mo105448R0(applicationContext);
        this.f86463Z = new UIUtils();
    }

    @C0359n0
    @C0376v0(api = 17)
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35226m0(this));
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86472w = context;
        View e = new UIUtils().mo104271e(context, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_uc_purposes);
        mo105449T0(e);
        mo105452a();
        mo105453b();
        return e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86474y = null;
    }

    /* renamed from: b */
    public final void mo105453b() {
        C35123w wVar = this.f86461X;
        if (wVar != null) {
            if (!C35020d.m143605J(wVar.mo105005k())) {
                this.f86466c.setText(this.f86461X.mo105005k());
            } else {
                this.f86466c.setText(C35265a.C35278m.str_ot_ucp_title);
            }
            String k = !C35020d.m143605J(this.f86461X.mo105008n().mo104667k()) ? this.f86461X.mo105008n().mo104667k() : this.f86475z.optString("TextColor", "#000000");
            String k2 = !C35020d.m143605J(this.f86461X.mo104995a().mo104667k()) ? this.f86461X.mo104995a().mo104667k() : this.f86475z.optString("TextColor", "#000000");
            if (!C35020d.m143605J(this.f86461X.mo105008n().mo104663g())) {
                this.f86465b.setText(this.f86461X.mo105008n().mo104663g());
            }
            if (!this.f86461X.mo105008n().mo104669m()) {
                this.f86465b.setVisibility(8);
            }
            if (!this.f86461X.mo104995a().mo104669m()) {
                this.f86464a.setVisibility(8);
            }
            if (!C35020d.m143605J(this.f86461X.mo104995a().mo104663g())) {
                this.f86464a.setText(this.f86461X.mo104995a().mo104663g());
            }
            if (this.f86461X.mo105000f().size() == 0) {
                this.f86467d.setVisibility(8);
            }
            this.f86469f.setAdapter(new C35182x(this.f86472w, this.f86461X, k, k2, this, this.f86460E0));
            try {
                mo105450U0(this.f86468e, this.f86461X.mo105006l());
                this.f86468e.setText(this.f86461X.mo105006l().mo104295s());
                this.f86468e.setBackgroundColor(Color.parseColor(this.f86475z.getString("PcButtonColor")));
                this.f86468e.setTextColor(Color.parseColor(this.f86475z.getString("PcButtonTextColor")));
                this.f86466c.setTextColor(Color.parseColor(k));
                this.f86465b.setTextColor(Color.parseColor(k));
                this.f86464a.setTextColor(Color.parseColor(k2));
                this.f86471v.setColorFilter(Color.parseColor(k));
            } catch (JSONException e) {
                OTLogger.m143457l("OTUCPurposesFragment", "Error in populating UCP UI  :" + e.getMessage());
            }
        }
    }
}
