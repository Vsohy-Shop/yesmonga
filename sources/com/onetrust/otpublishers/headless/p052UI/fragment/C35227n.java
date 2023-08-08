package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34983o;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35125y;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35147g0;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35256b;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.n */
public class C35227n extends C31185b implements View.OnClickListener {

    /* renamed from: E0 */
    public LinearLayout f86428E0;

    /* renamed from: F0 */
    public String f86429F0;

    /* renamed from: G0 */
    public C35228a f86430G0;

    /* renamed from: H0 */
    public View f86431H0;

    /* renamed from: I0 */
    public String f86432I0;

    /* renamed from: J0 */
    public String f86433J0;

    /* renamed from: K0 */
    public String f86434K0;

    /* renamed from: L0 */
    public String f86435L0;

    /* renamed from: M0 */
    public C35125y f86436M0;

    /* renamed from: N0 */
    public OTConfiguration f86437N0;

    /* renamed from: O0 */
    public C35118r f86438O0;

    /* renamed from: P0 */
    public UIUtils f86439P0;

    /* renamed from: Q0 */
    public String f86440Q0;

    /* renamed from: R0 */
    public String f86441R0;

    /* renamed from: S0 */
    public C34962a f86442S0;

    /* renamed from: X */
    public SwitchCompat f86443X;

    /* renamed from: Y */
    public RelativeLayout f86444Y;

    /* renamed from: Z */
    public RelativeLayout f86445Z;

    /* renamed from: a */
    public String f86446a;

    /* renamed from: b */
    public TextView f86447b;

    /* renamed from: c */
    public TextView f86448c;

    /* renamed from: d */
    public TextView f86449d;

    /* renamed from: e */
    public TextView f86450e;

    /* renamed from: f */
    public TextView f86451f;

    /* renamed from: g */
    public RecyclerView f86452g;

    /* renamed from: v */
    public C31178a f86453v;

    /* renamed from: w */
    public ImageView f86454w;

    /* renamed from: x */
    public Context f86455x;

    /* renamed from: y */
    public OTPublishersHeadlessSDK f86456y;

    /* renamed from: z */
    public JSONObject f86457z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.n$a */
    public interface C35228a {
        /* renamed from: a */
        void mo105091a();
    }

    /* renamed from: Q0 */
    public static C35227n m145234Q0(@C0359n0 String str, @C0363p0 OTConfiguration oTConfiguration) {
        C35227n nVar = new C35227n();
        Bundle bundle = new Bundle();
        bundle.putString(C16717v.C16719b.f42182e, str);
        nVar.setArguments(bundle);
        nVar.mo105428V0(oTConfiguration);
        return nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m145235R0(DialogInterface dialogInterface) {
        JSONObject jSONObject;
        C31178a aVar = (C31178a) dialogInterface;
        this.f86453v = aVar;
        this.f86439P0.mo104281t(this.f86455x, aVar);
        this.f86453v.setCancelable(false);
        C31178a aVar2 = this.f86453v;
        if (!(aVar2 == null || (jSONObject = this.f86457z) == null)) {
            aVar2.setTitle((CharSequence) jSONObject.optString(C13758b.f33475u0));
        }
        this.f86453v.setOnKeyListener(new C35223l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ boolean m145236Z0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (!C35257c.m145353e(i, keyEvent)) {
            return false;
        }
        mo105438f1();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m145237a1(View view) {
        this.f86456y.updateVendorConsent(OTVendorListMode.GENERAL, this.f86429F0, this.f86443X.isChecked());
        if (this.f86443X.isChecked()) {
            mo105434b1(this.f86443X);
        } else {
            mo105426T0(this.f86443X);
        }
        String optString = this.f86457z.optString("VendorCustomId");
        C34963b bVar = new C34963b(15);
        bVar.mo103581c(optString);
        bVar.mo103580b(this.f86443X.isChecked() ? 1 : 0);
        bVar.mo103585g(OTVendorListMode.GENERAL);
        new UIUtils().mo104267E(bVar, this.f86442S0);
    }

    /* renamed from: S0 */
    public final void mo105425S0(@C0359n0 View view) {
        this.f86447b = (TextView) view.findViewById(C35265a.C35273h.general_vendor_name);
        this.f86448c = (TextView) view.findViewById(C35265a.C35273h.general_vendors_privacy_notice);
        this.f86444Y = (RelativeLayout) view.findViewById(C35265a.C35273h.general_vendor_detail_header);
        this.f86445Z = (RelativeLayout) view.findViewById(C35265a.C35273h.general_vendor_detail_RL);
        this.f86454w = (ImageView) view.findViewById(C35265a.C35273h.general_vendor_detail_back);
        this.f86443X = (SwitchCompat) view.findViewById(C35265a.C35273h.general_consent_switch);
        this.f86428E0 = (LinearLayout) view.findViewById(C35265a.C35273h.gvd_linearLyt);
        this.f86449d = (TextView) view.findViewById(C35265a.C35273h.general_consent_title);
        this.f86431H0 = view.findViewById(C35265a.C35273h.general_vendor_name_view);
        this.f86450e = (TextView) view.findViewById(C35265a.C35273h.general_vendor_description);
        this.f86451f = (TextView) view.findViewById(C35265a.C35273h.general_vendor_sdk_list_title);
        this.f86452g = (RecyclerView) view.findViewById(C35265a.C35273h.general_vendor_sdk_list);
    }

    @C0376v0(api = 21)
    /* renamed from: T0 */
    public final void mo105426T0(SwitchCompat switchCompat) {
        int i;
        Drawable drawable;
        if (this.f86435L0 != null) {
            drawable = switchCompat.getTrackDrawable();
            i = Color.parseColor(this.f86435L0);
        } else {
            drawable = switchCompat.getTrackDrawable();
            i = C17318d.m79723f(this.f86455x, C35265a.C35270e.light_greyOT);
        }
        drawable.setTint(i);
        switchCompat.getThumbDrawable().setTint(this.f86434K0 != null ? Color.parseColor(this.f86434K0) : C17318d.m79723f(this.f86455x, C35265a.C35270e.contentTextColorOT));
    }

    /* renamed from: U0 */
    public void mo105427U0(C34962a aVar) {
        this.f86442S0 = aVar;
    }

    /* renamed from: V0 */
    public void mo105428V0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86437N0 = oTConfiguration;
    }

    /* renamed from: W0 */
    public void mo105429W0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86456y = oTPublishersHeadlessSDK;
    }

    /* renamed from: X0 */
    public void mo105430X0(@C0359n0 C35228a aVar) {
        this.f86430G0 = aVar;
    }

    /* renamed from: Y0 */
    public final void mo105431Y0(@C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = this.f86457z;
        if (jSONObject2 != null) {
            this.f86447b.setText(jSONObject2.getString(C13758b.f33475u0));
            C18196h2.m82478C1(this.f86447b, true);
            this.f86446a = this.f86457z.getString("PrivacyPolicyUrl");
            String string = this.f86457z.getString("Description");
            if (!C35020d.m143605J(string)) {
                this.f86439P0.mo104279r(this.f86455x, this.f86450e, string);
            } else {
                this.f86450e.setVisibility(8);
            }
            JSONArray jSONArray = this.f86457z.getJSONArray("Sdks");
            if (!C35017a.m143592b(jSONArray)) {
                this.f86451f.setText(jSONObject.optString("PCenterCookiesListText"));
                C18196h2.m82478C1(this.f86451f, true);
                this.f86451f.setTextColor(Color.parseColor(this.f86441R0));
                this.f86452g.setLayoutManager(new LinearLayoutManager(this.f86455x));
                this.f86452g.setAdapter(new C35147g0(jSONArray, this.f86440Q0, this.f86436M0, this.f86437N0, OTVendorListMode.GENERAL));
                return;
            }
            this.f86451f.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo105432a() {
        if (!C35020d.m143605J(this.f86436M0.mo105037s().mo104657a().mo104757f())) {
            this.f86447b.setTextSize(Float.parseFloat(this.f86436M0.mo105037s().mo104657a().mo104757f()));
        }
        if (!C35020d.m143605J(this.f86436M0.mo105029k().mo104657a().mo104757f())) {
            this.f86450e.setTextSize(Float.parseFloat(this.f86436M0.mo105029k().mo104657a().mo104757f()));
        }
        if (!C35020d.m143605J(this.f86436M0.mo105032n().mo104657a().mo104757f())) {
            this.f86451f.setTextSize(Float.parseFloat(this.f86436M0.mo105032n().mo104657a().mo104757f()));
        }
        if (!C35020d.m143605J(this.f86436M0.mo105026h().mo104657a().mo104757f())) {
            this.f86449d.setTextSize(Float.parseFloat(this.f86436M0.mo105026h().mo104657a().mo104757f()));
        }
        String f = this.f86436M0.mo105036r().mo104763a().mo104657a().mo104757f();
        if (!C35020d.m143605J(f)) {
            this.f86448c.setTextSize(Float.parseFloat(f));
        }
    }

    /* renamed from: b */
    public final void mo105433b() {
        if (!C35020d.m143605J(this.f86436M0.mo105037s().mo104665i())) {
            this.f86447b.setTextAlignment(Integer.parseInt(this.f86436M0.mo105037s().mo104665i()));
        }
        if (!C35020d.m143605J(this.f86436M0.mo105026h().mo104665i())) {
            this.f86449d.setTextAlignment(Integer.parseInt(this.f86436M0.mo105026h().mo104665i()));
        }
        if (!C35020d.m143605J(this.f86436M0.mo105029k().mo104665i())) {
            this.f86450e.setTextAlignment(Integer.parseInt(this.f86436M0.mo105029k().mo104665i()));
        }
        if (!C35020d.m143605J(this.f86436M0.mo105032n().mo104665i())) {
            this.f86451f.setTextAlignment(Integer.parseInt(this.f86436M0.mo105032n().mo104665i()));
        }
    }

    @C0376v0(api = 21)
    /* renamed from: b1 */
    public final void mo105434b1(SwitchCompat switchCompat) {
        int i;
        Drawable drawable;
        if (this.f86435L0 != null) {
            drawable = switchCompat.getTrackDrawable();
            i = Color.parseColor(this.f86435L0);
        } else {
            drawable = switchCompat.getTrackDrawable();
            i = C17318d.m79723f(this.f86455x, C35265a.C35270e.light_greyOT);
        }
        drawable.setTint(i);
        switchCompat.getThumbDrawable().setTint(this.f86433J0 != null ? Color.parseColor(this.f86433J0) : C17318d.m79723f(this.f86455x, C35265a.C35270e.colorPrimaryOT));
    }

    /* renamed from: c1 */
    public final void mo105435c1(@C0359n0 JSONObject jSONObject) {
        C35102b0 s = this.f86436M0.mo105037s();
        this.f86432I0 = !C35020d.m143605J(s.mo104667k()) ? s.mo104667k() : jSONObject.optString("PcTextColor");
    }

    /* renamed from: d1 */
    public final void mo105436d1() {
        C35118r rVar = this.f86438O0;
        if (rVar == null || rVar.mo104873d()) {
            TextView textView = this.f86448c;
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }

    /* renamed from: e1 */
    public final void mo105437e1(@C0359n0 JSONObject jSONObject) {
        try {
            int b = UIUtils.m143749b(this.f86455x, this.f86437N0);
            C35124x xVar = new C35124x(this.f86455x, b);
            this.f86436M0 = xVar.mo105018i();
            this.f86438O0 = xVar.mo105014e();
            C35256b bVar = new C35256b(b);
            mo105435c1(jSONObject);
            String b2 = bVar.mo105526b(this.f86436M0.mo105029k().mo104667k(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            this.f86440Q0 = b2;
            this.f86441R0 = bVar.mo105526b(this.f86436M0.mo105032n().mo104667k(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            String b3 = bVar.mo105526b(this.f86436M0.mo105026h().mo104667k(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            String b4 = bVar.mo105526b(this.f86436M0.mo105023e(), jSONObject.optString("PcBackgroundColor"), "#FFFFFF", "#2F2F2F");
            String b5 = bVar.mo105526b(this.f86436M0.mo105019a(), jSONObject.optString("PcTextColor"), "#696969", "#FFFFFF");
            mo105443k1();
            String h = this.f86439P0.mo104273h(this.f86438O0, this.f86436M0.mo105036r().mo104763a(), jSONObject.optString("PcLinksTextColor"));
            mo105436d1();
            mo105432a();
            mo105433b();
            this.f86439P0.mo104264A(this.f86447b, this.f86436M0.mo105037s().mo104657a(), this.f86437N0);
            this.f86439P0.mo104264A(this.f86448c, this.f86436M0.mo105036r().mo104763a().mo104657a(), this.f86437N0);
            this.f86439P0.mo104264A(this.f86449d, this.f86436M0.mo105026h().mo104657a(), this.f86437N0);
            this.f86439P0.mo104264A(this.f86450e, this.f86436M0.mo105029k().mo104657a(), this.f86437N0);
            this.f86439P0.mo104264A(this.f86451f, this.f86436M0.mo105032n().mo104657a(), this.f86437N0);
            this.f86447b.setTextColor(Color.parseColor(this.f86432I0));
            this.f86449d.setTextColor(Color.parseColor(b3));
            this.f86445Z.setBackgroundColor(Color.parseColor(b4));
            this.f86444Y.setBackgroundColor(Color.parseColor(b4));
            this.f86428E0.setBackgroundColor(Color.parseColor(b4));
            this.f86454w.setColorFilter(Color.parseColor(b5));
            this.f86448c.setTextColor(Color.parseColor(h));
            this.f86450e.setTextColor(Color.parseColor(b2));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error while applying styles to Vendor details, err : " + e.getMessage());
        }
    }

    /* renamed from: f1 */
    public final void mo105438f1() {
        dismiss();
        this.f86430G0.mo105091a();
    }

    /* renamed from: g1 */
    public final void mo105439g1() {
        this.f86443X.setVisibility(8);
        this.f86449d.setVisibility(8);
        this.f86431H0.setVisibility(8);
    }

    @C0376v0(api = 21)
    /* renamed from: h1 */
    public final void mo105440h1() {
        this.f86448c.setOnClickListener(this);
        this.f86454w.setOnClickListener(this);
        this.f86443X.setOnClickListener(new C35225m(this));
    }

    @C0376v0(api = 21)
    /* renamed from: i1 */
    public final void mo105441i1() {
        try {
            if (!new C35015e(this.f86455x).f85172b.mo103963h()) {
                mo105439g1();
                return;
            }
            int i = this.f86457z.getInt(OTVendorUtils.CONSENT_TYPE);
            if (i == 0) {
                this.f86443X.setChecked(false);
                mo105426T0(this.f86443X);
            } else if (i != 1) {
                mo105439g1();
            } else {
                this.f86443X.setChecked(true);
                mo105434b1(this.f86443X);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("VendorDetail", "error while setting toggle values" + e.getMessage());
        }
    }

    /* renamed from: j1 */
    public final void mo105442j1() {
        try {
            JSONObject preferenceCenterData = this.f86456y.getPreferenceCenterData();
            mo105437e1(preferenceCenterData);
            String optString = preferenceCenterData.optString("BConsentText");
            this.f86449d.setText(optString);
            this.f86443X.setContentDescription(optString);
            C34983o j = new C34983o(this.f86455x).mo103835j();
            if (getArguments() != null) {
                String string = getArguments().getString("vendorId");
                this.f86429F0 = string;
                this.f86457z = this.f86456y.getVendorDetails(OTVendorListMode.GENERAL, string);
                mo105431Y0(preferenceCenterData);
                if (!C35020d.m143605J(j.mo103836k())) {
                    if (!C35020d.m143605J(this.f86446a)) {
                        this.f86448c.setText(j.mo103836k());
                        return;
                    }
                }
                this.f86448c.setVisibility(8);
            }
        } catch (Exception e) {
            OTLogger.m143457l("VendorDetail", "error while populating Vendor Detail fields" + e.getMessage());
        }
    }

    /* renamed from: k1 */
    public final void mo105443k1() {
        if (this.f86436M0.mo105038t() != null && !C35020d.m143605J(this.f86436M0.mo105038t())) {
            this.f86434K0 = this.f86436M0.mo105038t();
        }
        if (this.f86436M0.mo105039u() != null && !C35020d.m143605J(this.f86436M0.mo105039u())) {
            this.f86433J0 = this.f86436M0.mo105039u();
        }
        if (this.f86436M0.mo105040v() != null && !C35020d.m143605J(this.f86436M0.mo105040v())) {
            this.f86435L0 = this.f86436M0.mo105040v();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.general_vendor_detail_back) {
            mo105438f1();
        } else if (id == C35265a.C35273h.general_vendors_privacy_notice) {
            C35020d.m143600B(this.f86455x, this.f86446a);
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86439P0.mo104281t(this.f86455x, this.f86453v);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.f86456y == null) {
            dismiss();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35220k(this));
        return onCreateDialog;
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86455x = context;
        View e = new UIUtils().mo104271e(context, layoutInflater, viewGroup, C35265a.C35276k.ot_general_vendors_details_fragment);
        mo105425S0(e);
        this.f86439P0 = new UIUtils();
        mo105442j1();
        mo105440h1();
        return e;
    }

    @C0376v0(api = 21)
    public void onResume() {
        super.onResume();
        mo105441i1();
    }
}
