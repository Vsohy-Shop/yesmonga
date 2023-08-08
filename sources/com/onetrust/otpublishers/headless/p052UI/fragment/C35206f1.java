package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Network.C35006f;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35125y;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35147g0;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35150h0;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35256b;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.f1 */
public class C35206f1 extends C31185b implements View.OnClickListener {

    /* renamed from: E0 */
    public RelativeLayout f86283E0;

    /* renamed from: F0 */
    public C31178a f86284F0;

    /* renamed from: G0 */
    public ImageView f86285G0;

    /* renamed from: H0 */
    public Context f86286H0;

    /* renamed from: I0 */
    public OTPublishersHeadlessSDK f86287I0;

    /* renamed from: J0 */
    public JSONObject f86288J0;

    /* renamed from: K0 */
    public SwitchCompat f86289K0;

    /* renamed from: L0 */
    public SwitchCompat f86290L0;

    /* renamed from: M0 */
    public RecyclerView f86291M0;

    /* renamed from: N0 */
    public RecyclerView f86292N0;

    /* renamed from: O0 */
    public RecyclerView f86293O0;

    /* renamed from: P0 */
    public RecyclerView f86294P0;

    /* renamed from: Q0 */
    public RecyclerView f86295Q0;

    /* renamed from: R0 */
    public RecyclerView f86296R0;

    /* renamed from: S0 */
    public RelativeLayout f86297S0;

    /* renamed from: T0 */
    public RelativeLayout f86298T0;

    /* renamed from: U0 */
    public LinearLayout f86299U0;

    /* renamed from: V0 */
    public LinearLayout f86300V0;

    /* renamed from: W0 */
    public String f86301W0;

    /* renamed from: X */
    public TextView f86302X;

    /* renamed from: X0 */
    public C35208b f86303X0;

    /* renamed from: Y */
    public TextView f86304Y;

    /* renamed from: Y0 */
    public View f86305Y0;

    /* renamed from: Z */
    public TextView f86306Z;

    /* renamed from: Z0 */
    public View f86307Z0;

    /* renamed from: a */
    public String f86308a;

    /* renamed from: a1 */
    public String f86309a1;

    /* renamed from: b */
    public TextView f86310b;

    /* renamed from: b1 */
    public String f86311b1;

    /* renamed from: c */
    public TextView f86312c;

    /* renamed from: c1 */
    public String f86313c1 = null;

    /* renamed from: d */
    public TextView f86314d;

    /* renamed from: d1 */
    public String f86315d1 = null;

    /* renamed from: e */
    public TextView f86316e;

    /* renamed from: e1 */
    public String f86317e1 = null;

    /* renamed from: f */
    public TextView f86318f;

    /* renamed from: f1 */
    public C35125y f86319f1;

    /* renamed from: g */
    public TextView f86320g;

    /* renamed from: g1 */
    public OTConfiguration f86321g1;

    /* renamed from: h1 */
    public C35118r f86322h1;

    /* renamed from: i1 */
    public UIUtils f86323i1;

    /* renamed from: j1 */
    public C34962a f86324j1;

    /* renamed from: v */
    public TextView f86325v;

    /* renamed from: w */
    public TextView f86326w;

    /* renamed from: x */
    public TextView f86327x;

    /* renamed from: y */
    public TextView f86328y;

    /* renamed from: z */
    public TextView f86329z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.f1$a */
    public interface C35207a {
        /* renamed from: a */
        void mo105354a(JSONObject jSONObject);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.f1$b */
    public interface C35208b {
        /* renamed from: a */
        void mo105114a();
    }

    /* renamed from: U0 */
    public static C35206f1 m145115U0(@C0359n0 String str, @C0363p0 OTConfiguration oTConfiguration) {
        C35206f1 f1Var = new C35206f1();
        Bundle bundle = new Bundle();
        bundle.putString(C16717v.C16719b.f42182e, str);
        f1Var.setArguments(bundle);
        f1Var.mo105337Z0(oTConfiguration);
        return f1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m145116V0(DialogInterface dialogInterface) {
        JSONObject jSONObject;
        C31178a aVar = (C31178a) dialogInterface;
        this.f86284F0 = aVar;
        this.f86323i1.mo104281t(this.f86286H0, aVar);
        this.f86284F0.setCancelable(false);
        C31178a aVar2 = this.f86284F0;
        if (!(aVar2 == null || (jSONObject = this.f86288J0) == null)) {
            aVar2.setTitle((CharSequence) jSONObject.optString("name"));
        }
        this.f86284F0.setOnKeyListener(new C35254z0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m145117X0(CompoundButton compoundButton, boolean z) {
        Context context;
        String str;
        String str2;
        SwitchCompat switchCompat;
        this.f86287I0.updateVendorConsent(OTVendorListMode.IAB, this.f86301W0, z);
        UIUtils uIUtils = this.f86323i1;
        if (z) {
            context = this.f86286H0;
            switchCompat = this.f86289K0;
            str2 = this.f86317e1;
            str = this.f86313c1;
        } else {
            context = this.f86286H0;
            switchCompat = this.f86289K0;
            str2 = this.f86317e1;
            str = this.f86315d1;
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m145118c1(JSONObject jSONObject) {
        C35150h0 h0Var = new C35150h0(jSONObject, this.f86287I0, this.f86319f1);
        this.f86296R0.setLayoutManager(new LinearLayoutManager(this.f86286H0));
        this.f86296R0.setAdapter(h0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ boolean m145119e1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 4) {
            return false;
        }
        mo105346l1();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m145120f1(View view) {
        C34963b bVar = new C34963b(15);
        bVar.mo103581c(this.f86301W0);
        bVar.mo103580b(this.f86289K0.isChecked() ? 1 : 0);
        new UIUtils().mo104267E(bVar, this.f86324j1);
        bVar.mo103585g(OTVendorListMode.IAB);
        new UIUtils().mo104267E(bVar, this.f86324j1);
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m145121g1(CompoundButton compoundButton, boolean z) {
        Context context;
        String str;
        String str2;
        SwitchCompat switchCompat;
        this.f86287I0.updateVendorLegitInterest(OTVendorListMode.IAB, this.f86301W0, z);
        UIUtils uIUtils = this.f86323i1;
        if (z) {
            context = this.f86286H0;
            switchCompat = this.f86290L0;
            str2 = this.f86317e1;
            str = this.f86313c1;
        } else {
            context = this.f86286H0;
            switchCompat = this.f86290L0;
            str2 = this.f86317e1;
            str = this.f86315d1;
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m145122j1(View view) {
        C34963b bVar = new C34963b(16);
        bVar.mo103581c(this.f86301W0);
        bVar.mo103580b(this.f86290L0.isChecked() ? 1 : 0);
        new UIUtils().mo104267E(bVar, this.f86324j1);
    }

    /* renamed from: W0 */
    public final void mo105335W0(@C0359n0 View view) {
        this.f86310b = (TextView) view.findViewById(C35265a.C35273h.VD_vendor_name);
        this.f86312c = (TextView) view.findViewById(C35265a.C35273h.VD_vendors_privacy_notice);
        this.f86297S0 = (RelativeLayout) view.findViewById(C35265a.C35273h.vendor_detail_header);
        this.f86298T0 = (RelativeLayout) view.findViewById(C35265a.C35273h.vendor_detail_RL);
        this.f86326w = (TextView) view.findViewById(C35265a.C35273h.VD_page_title);
        this.f86285G0 = (ImageView) view.findViewById(C35265a.C35273h.vendor_detail_back);
        this.f86289K0 = (SwitchCompat) view.findViewById(C35265a.C35273h.VD_consent_switch);
        this.f86290L0 = (SwitchCompat) view.findViewById(C35265a.C35273h.VD_LI_switch);
        this.f86299U0 = (LinearLayout) view.findViewById(C35265a.C35273h.vd_linearLyt);
        this.f86327x = (TextView) view.findViewById(C35265a.C35273h.VD_consent_title);
        this.f86328y = (TextView) view.findViewById(C35265a.C35273h.VD_LISwitch_title);
        this.f86305Y0 = view.findViewById(C35265a.C35273h.name_view);
        this.f86307Z0 = view.findViewById(C35265a.C35273h.consent_title_view);
        this.f86291M0 = (RecyclerView) view.findViewById(C35265a.C35273h.vd_purpose_rv);
        this.f86292N0 = (RecyclerView) view.findViewById(C35265a.C35273h.vd_liPurpose_rv);
        this.f86293O0 = (RecyclerView) view.findViewById(C35265a.C35273h.vd_feature_rv);
        this.f86294P0 = (RecyclerView) view.findViewById(C35265a.C35273h.vd_spFeature_rv);
        this.f86295Q0 = (RecyclerView) view.findViewById(C35265a.C35273h.vd_SpPurpose_rv);
        this.f86314d = (TextView) view.findViewById(C35265a.C35273h.VD_purpose_title);
        this.f86316e = (TextView) view.findViewById(C35265a.C35273h.VD_LIPurpose_title);
        this.f86318f = (TextView) view.findViewById(C35265a.C35273h.VD_Feature_title);
        this.f86325v = (TextView) view.findViewById(C35265a.C35273h.VD_SpFeature_title);
        this.f86320g = (TextView) view.findViewById(C35265a.C35273h.VD_SpPurpose_title);
        this.f86329z = (TextView) view.findViewById(C35265a.C35273h.VD_lifespan_label);
        this.f86302X = (TextView) view.findViewById(C35265a.C35273h.VD_lifespan_value);
        this.f86304Y = (TextView) view.findViewById(C35265a.C35273h.VD_lifespan_desc);
        this.f86283E0 = (RelativeLayout) view.findViewById(C35265a.C35273h.disclosure_RL);
        this.f86306Z = (TextView) view.findViewById(C35265a.C35273h.VD_disclosure_title);
        this.f86296R0 = (RecyclerView) view.findViewById(C35265a.C35273h.VD_disclosure_rv);
        this.f86300V0 = (LinearLayout) view.findViewById(C35265a.C35273h.scrollable_content);
    }

    /* renamed from: Y0 */
    public void mo105336Y0(C34962a aVar) {
        this.f86324j1 = aVar;
    }

    /* renamed from: Z0 */
    public void mo105337Z0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86321g1 = oTConfiguration;
    }

    /* renamed from: a */
    public final void mo105338a() {
        if (!C35020d.m143605J(this.f86319f1.mo105037s().mo104657a().mo104757f())) {
            this.f86310b.setTextSize(Float.parseFloat(this.f86319f1.mo105037s().mo104657a().mo104757f()));
        }
        if (!C35020d.m143605J(this.f86319f1.mo105026h().mo104657a().mo104757f())) {
            this.f86327x.setTextSize(Float.parseFloat(this.f86319f1.mo105026h().mo104657a().mo104757f()));
        }
        if (!C35020d.m143605J(this.f86319f1.mo105035q().mo104657a().mo104757f())) {
            this.f86328y.setTextSize(Float.parseFloat(this.f86319f1.mo105035q().mo104657a().mo104757f()));
        }
        String f = this.f86319f1.mo105036r().mo104763a().mo104657a().mo104757f();
        if (!C35020d.m143605J(f)) {
            this.f86312c.setTextSize(Float.parseFloat(f));
        }
        if (!C35020d.m143605J(this.f86319f1.mo105032n().mo104657a().mo104757f())) {
            float parseFloat = Float.parseFloat(this.f86319f1.mo105032n().mo104657a().mo104757f());
            this.f86314d.setTextSize(parseFloat);
            this.f86316e.setTextSize(parseFloat);
            this.f86320g.setTextSize(parseFloat);
            this.f86325v.setTextSize(parseFloat);
            this.f86318f.setTextSize(parseFloat);
            this.f86329z.setTextSize(parseFloat);
            this.f86306Z.setTextSize(parseFloat);
        }
        if (!C35020d.m143605J(this.f86319f1.mo105029k().mo104657a().mo104757f())) {
            float parseFloat2 = Float.parseFloat(this.f86319f1.mo105029k().mo104657a().mo104757f());
            this.f86302X.setTextSize(parseFloat2);
            this.f86304Y.setTextSize(parseFloat2);
        }
    }

    /* renamed from: a1 */
    public void mo105339a1(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86287I0 = oTPublishersHeadlessSDK;
    }

    /* renamed from: b */
    public final void mo105340b() {
        if (!C35020d.m143605J(this.f86319f1.mo105037s().mo104665i())) {
            this.f86310b.setTextAlignment(Integer.parseInt(this.f86319f1.mo105037s().mo104665i()));
        }
        if (!C35020d.m143605J(this.f86319f1.mo105026h().mo104665i())) {
            this.f86327x.setTextAlignment(Integer.parseInt(this.f86319f1.mo105026h().mo104665i()));
        }
        if (!C35020d.m143605J(this.f86319f1.mo105035q().mo104665i())) {
            this.f86328y.setTextAlignment(Integer.parseInt(this.f86319f1.mo105035q().mo104665i()));
        }
        if (!C35020d.m143605J(this.f86319f1.mo105032n().mo104665i())) {
            int parseInt = Integer.parseInt(this.f86319f1.mo105032n().mo104665i());
            this.f86314d.setTextAlignment(parseInt);
            this.f86318f.setTextAlignment(parseInt);
            this.f86325v.setTextAlignment(parseInt);
            this.f86320g.setTextAlignment(parseInt);
            this.f86316e.setTextAlignment(parseInt);
            this.f86329z.setTextAlignment(parseInt);
            this.f86306Z.setTextAlignment(parseInt);
        }
        if (!C35020d.m143605J(this.f86319f1.mo105029k().mo104665i())) {
            int parseInt2 = Integer.parseInt(this.f86319f1.mo105029k().mo104665i());
            this.f86302X.setTextAlignment(parseInt2);
            this.f86304Y.setTextAlignment(parseInt2);
        }
    }

    /* renamed from: b1 */
    public void mo105341b1(@C0359n0 C35208b bVar) {
        this.f86303X0 = bVar;
    }

    /* renamed from: d1 */
    public final void mo105342d1(@C0359n0 JSONObject jSONObject, TextView textView, String str, int i) {
        textView.setText(jSONObject.optString(str, getString(i)));
        C18196h2.m82478C1(textView, true);
    }

    /* renamed from: h1 */
    public final void mo105343h1(@C0359n0 JSONObject jSONObject) {
        if (this.f86288J0.getJSONArray("purposes").length() > 0) {
            this.f86314d.setVisibility(0);
            mo105342d1(jSONObject, this.f86314d, "BConsentPurposesText", C35265a.C35278m.ot_vd_purposes_consent_title);
            this.f86291M0.setVisibility(0);
            this.f86291M0.setLayoutManager(new LinearLayoutManager(this.f86286H0));
            this.f86291M0.setAdapter(new C35147g0(this.f86288J0.getJSONArray("purposes"), this.f86309a1, this.f86319f1, this.f86321g1, OTVendorListMode.IAB));
            this.f86291M0.setNestedScrollingEnabled(false);
        }
        if (this.f86288J0.getJSONArray("legIntPurposes").length() > 0) {
            this.f86316e.setVisibility(0);
            mo105342d1(jSONObject, this.f86316e, "BLegitimateInterestPurposesText", C35265a.C35278m.ot_vd_LIPurposes_consent_title);
            this.f86292N0.setVisibility(0);
            this.f86292N0.setLayoutManager(new LinearLayoutManager(this.f86286H0));
            this.f86292N0.setAdapter(new C35147g0(this.f86288J0.getJSONArray("legIntPurposes"), this.f86309a1, this.f86319f1, this.f86321g1, OTVendorListMode.IAB));
            this.f86292N0.setNestedScrollingEnabled(false);
        }
        if (this.f86288J0.getJSONArray("features").length() > 0) {
            this.f86318f.setVisibility(0);
            mo105342d1(jSONObject, this.f86318f, "BFeaturesText", C35265a.C35278m.ot_vd_feature_consent_title);
            this.f86293O0.setVisibility(0);
            this.f86293O0.setLayoutManager(new LinearLayoutManager(this.f86286H0));
            this.f86293O0.setAdapter(new C35147g0(this.f86288J0.getJSONArray("features"), this.f86309a1, this.f86319f1, this.f86321g1, OTVendorListMode.IAB));
            this.f86293O0.setNestedScrollingEnabled(false);
        }
        if (this.f86288J0.getJSONArray("specialFeatures").length() > 0) {
            this.f86325v.setVisibility(0);
            mo105342d1(jSONObject, this.f86325v, "BSpecialFeaturesText", C35265a.C35278m.ot_vd_SpFeature_consent_title);
            this.f86294P0.setVisibility(0);
            this.f86294P0.setLayoutManager(new LinearLayoutManager(this.f86286H0));
            this.f86294P0.setAdapter(new C35147g0(this.f86288J0.getJSONArray("specialFeatures"), this.f86309a1, this.f86319f1, this.f86321g1, OTVendorListMode.IAB));
            this.f86294P0.setNestedScrollingEnabled(false);
        }
        if (this.f86288J0.getJSONArray("specialPurposes").length() > 0) {
            this.f86320g.setVisibility(0);
            mo105342d1(jSONObject, this.f86320g, "BSpecialPurposesText", C35265a.C35278m.ot_vd_SpPurposes_consent_title);
            this.f86295Q0.setVisibility(0);
            this.f86295Q0.setLayoutManager(new LinearLayoutManager(this.f86286H0));
            this.f86295Q0.setAdapter(new C35147g0(this.f86288J0.getJSONArray("specialPurposes"), this.f86309a1, this.f86319f1, this.f86321g1, OTVendorListMode.IAB));
            this.f86295Q0.setNestedScrollingEnabled(false);
        }
    }

    /* renamed from: i1 */
    public final void mo105344i1() {
        C35118r rVar = this.f86322h1;
        if (rVar == null || rVar.mo104873d()) {
            TextView textView = this.f86312c;
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }

    /* renamed from: k1 */
    public final void mo105345k1(@C0359n0 JSONObject jSONObject) {
        C35102b0 s = this.f86319f1.mo105037s();
        this.f86311b1 = !C35020d.m143605J(s.mo104667k()) ? s.mo104667k() : jSONObject.optString("PcTextColor");
        C35102b0 k = this.f86319f1.mo105029k();
        this.f86309a1 = !C35020d.m143605J(k.mo104667k()) ? k.mo104667k() : jSONObject.optString("PcTextColor");
    }

    /* renamed from: l1 */
    public final void mo105346l1() {
        dismiss();
        this.f86303X0.mo105114a();
    }

    /* renamed from: m1 */
    public final void mo105347m1(@C0359n0 JSONObject jSONObject) {
        try {
            int b = UIUtils.m143749b(this.f86286H0, this.f86321g1);
            C35124x xVar = new C35124x(this.f86286H0, b);
            this.f86319f1 = xVar.mo105018i();
            this.f86322h1 = xVar.mo105014e();
            C35256b bVar = new C35256b(b);
            mo105345k1(jSONObject);
            String b2 = bVar.mo105526b(this.f86319f1.mo105032n().mo104667k(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            String b3 = bVar.mo105526b(this.f86319f1.mo105026h().mo104667k(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            String b4 = bVar.mo105526b(this.f86319f1.mo105035q().mo104667k(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            String b5 = bVar.mo105526b(this.f86319f1.mo105023e(), jSONObject.optString("PcBackgroundColor"), "#FFFFFF", "#2F2F2F");
            String b6 = bVar.mo105526b(this.f86319f1.mo105019a(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            mo105353r1();
            String h = this.f86323i1.mo104273h(this.f86322h1, this.f86319f1.mo105036r().mo104763a(), jSONObject.optString("PcLinksTextColor"));
            mo105344i1();
            mo105338a();
            mo105340b();
            this.f86323i1.mo104264A(this.f86310b, this.f86319f1.mo105037s().mo104657a(), this.f86321g1);
            this.f86323i1.mo104264A(this.f86312c, this.f86319f1.mo105036r().mo104763a().mo104657a(), this.f86321g1);
            C35110j a = this.f86319f1.mo105032n().mo104657a();
            this.f86323i1.mo104264A(this.f86314d, a, this.f86321g1);
            this.f86323i1.mo104264A(this.f86316e, a, this.f86321g1);
            this.f86323i1.mo104264A(this.f86320g, a, this.f86321g1);
            this.f86323i1.mo104264A(this.f86325v, a, this.f86321g1);
            this.f86323i1.mo104264A(this.f86318f, a, this.f86321g1);
            this.f86323i1.mo104264A(this.f86329z, a, this.f86321g1);
            this.f86323i1.mo104264A(this.f86306Z, a, this.f86321g1);
            C35110j a2 = this.f86319f1.mo105029k().mo104657a();
            this.f86323i1.mo104264A(this.f86302X, a2, this.f86321g1);
            this.f86323i1.mo104264A(this.f86304Y, a2, this.f86321g1);
            this.f86323i1.mo104264A(this.f86327x, this.f86319f1.mo105026h().mo104657a(), this.f86321g1);
            this.f86323i1.mo104264A(this.f86328y, this.f86319f1.mo105035q().mo104657a(), this.f86321g1);
            this.f86310b.setTextColor(Color.parseColor(this.f86311b1));
            this.f86326w.setTextColor(Color.parseColor(this.f86311b1));
            this.f86327x.setTextColor(Color.parseColor(b3));
            this.f86328y.setTextColor(Color.parseColor(b4));
            this.f86298T0.setBackgroundColor(Color.parseColor(b5));
            this.f86297S0.setBackgroundColor(Color.parseColor(b5));
            this.f86300V0.setBackgroundColor(Color.parseColor(b5));
            this.f86299U0.setBackgroundColor(Color.parseColor(b5));
            this.f86285G0.setColorFilter(Color.parseColor(b6), PorterDuff.Mode.SRC_IN);
            this.f86312c.setTextColor(Color.parseColor(h));
            this.f86314d.setTextColor(Color.parseColor(b2));
            this.f86320g.setTextColor(Color.parseColor(b2));
            this.f86325v.setTextColor(Color.parseColor(b2));
            this.f86318f.setTextColor(Color.parseColor(b2));
            this.f86316e.setTextColor(Color.parseColor(b2));
            this.f86329z.setTextColor(Color.parseColor(b2));
            this.f86304Y.setTextColor(Color.parseColor(this.f86309a1));
            this.f86302X.setTextColor(Color.parseColor(this.f86309a1));
            this.f86306Z.setTextColor(Color.parseColor(b2));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error while applying styles to Vendor details, err : " + e.getMessage());
        }
    }

    /* renamed from: n1 */
    public final void mo105348n1() {
        this.f86312c.setOnClickListener(this);
        this.f86285G0.setOnClickListener(this);
        this.f86289K0.setOnCheckedChangeListener(new C35193b1(this));
        this.f86290L0.setOnCheckedChangeListener(new C35196c1(this));
        this.f86289K0.setOnClickListener(new C35199d1(this));
        this.f86290L0.setOnClickListener(new C35203e1(this));
    }

    /* renamed from: o1 */
    public final void mo105349o1(@C0359n0 JSONObject jSONObject) {
        if (this.f86288J0.has("deviceStorageDisclosureUrl")) {
            this.f86283E0.setVisibility(0);
            this.f86306Z.setText(String.format("%s:", new Object[]{jSONObject.optString("PCenterVendorListDisclosure")}));
            new C35006f(this.f86286H0).mo103948p(this.f86288J0.getString("deviceStorageDisclosureUrl"), new C35252y0(this));
            return;
        }
        this.f86283E0.setVisibility(8);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.vendor_detail_back) {
            mo105346l1();
        } else if (id == C35265a.C35273h.VD_vendors_privacy_notice) {
            C35020d.m143600B(this.f86286H0, this.f86308a);
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86323i1.mo104281t(this.f86286H0, this.f86284F0);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.f86287I0 == null) {
            dismiss();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35190a1(this));
        return onCreateDialog;
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86286H0 = context;
        View e = new UIUtils().mo104271e(context, layoutInflater, viewGroup, C35265a.C35276k.ot_vendors_details_fragment);
        mo105335W0(e);
        this.f86323i1 = new UIUtils();
        mo105348n1();
        mo105352q1();
        return e;
    }

    public void onResume() {
        super.onResume();
        mo105351p1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e A[Catch:{ JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c A[Catch:{ JSONException -> 0x0081 }] */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105351p1() {
        /*
            r9 = this;
            org.json.JSONObject r0 = r9.f86288J0     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r1 = "consent"
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r1 = r9.f86288J0     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r2 = "legIntStatus"
            int r1 = r1.getInt(r2)     // Catch:{ JSONException -> 0x0081 }
            r2 = 0
            r3 = 1
            r4 = 8
            if (r0 == 0) goto L_0x0038
            if (r0 == r3) goto L_0x0028
            androidx.appcompat.widget.SwitchCompat r0 = r9.f86289K0     // Catch:{ JSONException -> 0x0081 }
            r0.setVisibility(r4)     // Catch:{ JSONException -> 0x0081 }
            android.widget.TextView r0 = r9.f86327x     // Catch:{ JSONException -> 0x0081 }
            r0.setVisibility(r4)     // Catch:{ JSONException -> 0x0081 }
            android.view.View r0 = r9.f86305Y0     // Catch:{ JSONException -> 0x0081 }
            r0.setVisibility(r4)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x004a
        L_0x0028:
            androidx.appcompat.widget.SwitchCompat r0 = r9.f86289K0     // Catch:{ JSONException -> 0x0081 }
            r0.setChecked(r3)     // Catch:{ JSONException -> 0x0081 }
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r9.f86323i1     // Catch:{ JSONException -> 0x0081 }
            android.content.Context r5 = r9.f86286H0     // Catch:{ JSONException -> 0x0081 }
            androidx.appcompat.widget.SwitchCompat r6 = r9.f86289K0     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r7 = r9.f86317e1     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r8 = r9.f86313c1     // Catch:{ JSONException -> 0x0081 }
            goto L_0x0047
        L_0x0038:
            androidx.appcompat.widget.SwitchCompat r0 = r9.f86289K0     // Catch:{ JSONException -> 0x0081 }
            r0.setChecked(r2)     // Catch:{ JSONException -> 0x0081 }
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r9.f86323i1     // Catch:{ JSONException -> 0x0081 }
            android.content.Context r5 = r9.f86286H0     // Catch:{ JSONException -> 0x0081 }
            androidx.appcompat.widget.SwitchCompat r6 = r9.f86289K0     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r7 = r9.f86317e1     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r8 = r9.f86315d1     // Catch:{ JSONException -> 0x0081 }
        L_0x0047:
            r0.mo104280s(r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0081 }
        L_0x004a:
            if (r1 == 0) goto L_0x006e
            if (r1 == r3) goto L_0x005e
            androidx.appcompat.widget.SwitchCompat r0 = r9.f86290L0     // Catch:{ JSONException -> 0x0081 }
            r0.setVisibility(r4)     // Catch:{ JSONException -> 0x0081 }
            android.widget.TextView r0 = r9.f86328y     // Catch:{ JSONException -> 0x0081 }
            r0.setVisibility(r4)     // Catch:{ JSONException -> 0x0081 }
            android.view.View r0 = r9.f86307Z0     // Catch:{ JSONException -> 0x0081 }
            r0.setVisibility(r4)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x009c
        L_0x005e:
            androidx.appcompat.widget.SwitchCompat r0 = r9.f86290L0     // Catch:{ JSONException -> 0x0081 }
            r0.setChecked(r3)     // Catch:{ JSONException -> 0x0081 }
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r9.f86323i1     // Catch:{ JSONException -> 0x0081 }
            android.content.Context r1 = r9.f86286H0     // Catch:{ JSONException -> 0x0081 }
            androidx.appcompat.widget.SwitchCompat r2 = r9.f86290L0     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r3 = r9.f86317e1     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r4 = r9.f86313c1     // Catch:{ JSONException -> 0x0081 }
            goto L_0x007d
        L_0x006e:
            androidx.appcompat.widget.SwitchCompat r0 = r9.f86290L0     // Catch:{ JSONException -> 0x0081 }
            r0.setChecked(r2)     // Catch:{ JSONException -> 0x0081 }
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r9.f86323i1     // Catch:{ JSONException -> 0x0081 }
            android.content.Context r1 = r9.f86286H0     // Catch:{ JSONException -> 0x0081 }
            androidx.appcompat.widget.SwitchCompat r2 = r9.f86290L0     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r3 = r9.f86317e1     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r4 = r9.f86315d1     // Catch:{ JSONException -> 0x0081 }
        L_0x007d:
            r0.mo104280s(r1, r2, r3, r4)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x009c
        L_0x0081:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error while setting toggle values"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "VendorDetail"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r1, r0)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.fragment.C35206f1.mo105351p1():void");
    }

    /* renamed from: q1 */
    public final void mo105352q1() {
        try {
            JSONObject preferenceCenterData = this.f86287I0.getPreferenceCenterData();
            mo105347m1(preferenceCenterData);
            String optString = preferenceCenterData.optString("BConsentText");
            this.f86327x.setText(optString);
            this.f86289K0.setContentDescription(optString);
            String optString2 = preferenceCenterData.optString("BLegitInterestText");
            this.f86328y.setText(optString2);
            this.f86290L0.setContentDescription(optString2);
            if (preferenceCenterData.has("PCenterViewPrivacyPolicyText")) {
                this.f86312c.setText(preferenceCenterData.getString("PCenterViewPrivacyPolicyText"));
                C35257c.m145352d(this.f86312c);
            }
            if (getArguments() != null) {
                String string = getArguments().getString("vendorId");
                this.f86301W0 = string;
                JSONObject vendorDetails = this.f86287I0.getVendorDetails(OTVendorListMode.IAB, string);
                this.f86288J0 = vendorDetails;
                if (vendorDetails != null) {
                    this.f86310b.setText(vendorDetails.getString("name"));
                    C18196h2.m82478C1(this.f86310b, true);
                    this.f86308a = this.f86288J0.getString("policyUrl");
                    TextView textView = this.f86329z;
                    textView.setText(String.format("%s:", new Object[]{preferenceCenterData.optString("PCenterVendorListLifespan")}));
                    this.f86304Y.setText(preferenceCenterData.optString("PCenterVendorListNonCookieUsage"));
                    this.f86302X.setText(new UIUtils().mo104272g(this.f86288J0.optLong("cookieMaxAgeSeconds"), preferenceCenterData));
                    mo105349o1(preferenceCenterData);
                    mo105343h1(preferenceCenterData);
                }
            }
        } catch (Exception e) {
            OTLogger.m143457l("VendorDetail", "error while populating Vendor Detail fields" + e.getMessage());
        }
    }

    /* renamed from: r1 */
    public final void mo105353r1() {
        if (this.f86319f1.mo105038t() != null && !C35020d.m143605J(this.f86319f1.mo105038t())) {
            this.f86315d1 = this.f86319f1.mo105038t();
        }
        if (this.f86319f1.mo105039u() != null && !C35020d.m143605J(this.f86319f1.mo105039u())) {
            this.f86313c1 = this.f86319f1.mo105039u();
        }
        if (this.f86319f1.mo105040v() != null && !C35020d.m143605J(this.f86319f1.mo105040v())) {
            this.f86317e1 = this.f86319f1.mo105040v();
        }
    }
}
