package com.onetrust.otpublishers.headless.p052UI.TVUI.fragments;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.core.widget.C18472d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Network.C35001a;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35056n;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35071e;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.C12983b;
import retrofit2.C13008d;
import retrofit2.C13091w;
import retrofit2.C13092x;
import retrofit2.converter.scalars.C13006c;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.p */
public class C35091p extends Fragment implements C35056n.C35058b, View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: E0 */
    public OTPublishersHeadlessSDK f85560E0;

    /* renamed from: F0 */
    public JSONObject f85561F0;

    /* renamed from: G0 */
    public C35093b f85562G0;

    /* renamed from: H0 */
    public C35069c f85563H0;

    /* renamed from: I0 */
    public CheckBox f85564I0;

    /* renamed from: J0 */
    public CheckBox f85565J0;

    /* renamed from: K0 */
    public JSONObject f85566K0;

    /* renamed from: L0 */
    public C35056n f85567L0;

    /* renamed from: M0 */
    public C34962a f85568M0;

    /* renamed from: N0 */
    public boolean f85569N0 = true;

    /* renamed from: O0 */
    public boolean f85570O0 = true;

    /* renamed from: P0 */
    public ScrollView f85571P0;

    /* renamed from: Q0 */
    public String f85572Q0;

    /* renamed from: X */
    public View f85573X;

    /* renamed from: Y */
    public RecyclerView f85574Y;

    /* renamed from: Z */
    public Context f85575Z;

    /* renamed from: a */
    public TextView f85576a;

    /* renamed from: b */
    public TextView f85577b;

    /* renamed from: c */
    public TextView f85578c;

    /* renamed from: d */
    public TextView f85579d;

    /* renamed from: e */
    public TextView f85580e;

    /* renamed from: f */
    public TextView f85581f;

    /* renamed from: g */
    public TextView f85582g;

    /* renamed from: v */
    public RelativeLayout f85583v;

    /* renamed from: w */
    public CardView f85584w;

    /* renamed from: x */
    public CardView f85585x;

    /* renamed from: y */
    public LinearLayout f85586y;

    /* renamed from: z */
    public LinearLayout f85587z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.p$a */
    public class C35092a implements C13008d<String> {
        public C35092a() {
        }

        /* renamed from: a */
        public void mo30434a(@C0359n0 C12983b<String> bVar, @C0359n0 Throwable th) {
            OTLogger.m143457l("TV Vendor", "IAB Vendor Disclosure API Failed :  " + th.getMessage());
        }

        /* renamed from: b */
        public void mo30435b(@C0359n0 C12983b<String> bVar, @C0359n0 C13091w<String> wVar) {
            OTLogger.m143458m("TV Vendor", "IAB Vendor Disclosure API Success : " + wVar.mo30572a());
            try {
                if (wVar.mo30572a() != null) {
                    C35091p.this.f85567L0.mo104337r(C35091p.this.mo104578M0(C35071e.m143968m(), new JSONObject(wVar.mo30572a())));
                    C35091p.this.f85567L0.notifyDataSetChanged();
                }
            } catch (JSONException e) {
                OTLogger.m143457l("TV Vendor", "Error while fetching IAB Vendor Disclosure details:  " + e.getMessage());
            }
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.p$b */
    public interface C35093b {
        /* renamed from: b */
        void mo104597b(int i);

        /* renamed from: j */
        void mo104598j(boolean z);
    }

    @C0359n0
    /* renamed from: L0 */
    public static C35091p m144143L0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0359n0 String str2, C35093b bVar, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35091p pVar = new C35091p();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        pVar.setArguments(bundle);
        pVar.mo104582S0(bVar);
        pVar.mo104581R0(oTPublishersHeadlessSDK);
        pVar.mo104585Y0(str2);
        pVar.mo104580Q0(aVar);
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ void m144145P0(CompoundButton compoundButton, boolean z) {
        mo104594j(z);
        this.f85562G0.mo104598j(z);
    }

    /* renamed from: T0 */
    public static void m144146T0(@C0359n0 String str, @C0359n0 TextView textView) {
        textView.setTextColor(Color.parseColor(str));
    }

    /* renamed from: V0 */
    public static void m144147V0(@C0363p0 JSONArray jSONArray, @C0359n0 String str, @C0359n0 JSONObject jSONObject, boolean z) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    jSONObject.put(str, 1);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jSONObject.put(z ? jSONArray.optJSONObject(i).toString() : jSONArray.optJSONObject(i).optString("name"), z ? 3 : 2);
                    }
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "exception thrown while constructing vendor purpose data, err: " + e.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m144148X0(CompoundButton compoundButton, boolean z) {
        mo104587a1(z);
    }

    /* renamed from: E */
    public final void mo104577E(int i) {
        this.f85585x.setVisibility(this.f85563H0.mo104412l(i));
    }

    @C0359n0
    /* renamed from: M0 */
    public final JSONObject mo104578M0(@C0359n0 C35071e eVar, @C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.f85561F0;
        if (jSONObject3 != null) {
            m144147V0(jSONObject3.optJSONArray("purposes"), eVar.mo104450r(), jSONObject2, false);
            m144147V0(this.f85561F0.optJSONArray("legIntPurposes"), eVar.mo104446n(), jSONObject2, false);
            m144147V0(jSONObject.optJSONArray("disclosures"), eVar.mo104442i(), jSONObject2, true);
            m144147V0(this.f85561F0.optJSONArray("specialFeatures"), eVar.mo104451s(), jSONObject2, false);
            m144147V0(this.f85561F0.optJSONArray("specialPurposes"), eVar.mo104452t(), jSONObject2, false);
            m144147V0(this.f85561F0.optJSONArray("features"), eVar.mo104445l(), jSONObject2, false);
            OTLogger.m143460o("OneTrust", "vendor purposes:" + jSONObject2.toString());
        }
        return jSONObject2;
    }

    /* renamed from: O0 */
    public final void mo104579O0(@C0359n0 View view) {
        this.f85576a = (TextView) view.findViewById(C35265a.C35273h.vendor_name_tv);
        this.f85577b = (TextView) view.findViewById(C35265a.C35273h.vendors_privacy_notice_tv);
        this.f85578c = (TextView) view.findViewById(C35265a.C35273h.lifespan_label_tv);
        this.f85579d = (TextView) view.findViewById(C35265a.C35273h.VD_lifespan_value);
        this.f85583v = (RelativeLayout) view.findViewById(C35265a.C35273h.vd_linearLyt_tv);
        this.f85584w = (CardView) view.findViewById(C35265a.C35273h.tv_vd_card_consent);
        this.f85585x = (CardView) view.findViewById(C35265a.C35273h.tv_vd_card_li);
        this.f85586y = (LinearLayout) view.findViewById(C35265a.C35273h.vd_consent_lyt);
        this.f85587z = (LinearLayout) view.findViewById(C35265a.C35273h.vd_li_lyt);
        this.f85580e = (TextView) view.findViewById(C35265a.C35273h.vd_consent_label_tv);
        this.f85581f = (TextView) view.findViewById(C35265a.C35273h.vd_li_label_tv);
        this.f85582g = (TextView) view.findViewById(C35265a.C35273h.lifespan_desc_tv);
        this.f85573X = view.findViewById(C35265a.C35273h.tv_vd_cb_div);
        this.f85574Y = (RecyclerView) view.findViewById(C35265a.C35273h.vd_purpose_rv);
        this.f85564I0 = (CheckBox) view.findViewById(C35265a.C35273h.tv_vd_consent_cb);
        this.f85565J0 = (CheckBox) view.findViewById(C35265a.C35273h.tv_vd_li_cb);
        this.f85571P0 = (ScrollView) view.findViewById(C35265a.C35273h.bg_main);
        this.f85564I0.setOnCheckedChangeListener(new C35089n(this));
        this.f85565J0.setOnCheckedChangeListener(new C35090o(this));
        this.f85584w.setOnKeyListener(this);
        this.f85585x.setOnKeyListener(this);
        this.f85584w.setOnFocusChangeListener(this);
        this.f85585x.setOnFocusChangeListener(this);
    }

    /* renamed from: Q0 */
    public void mo104580Q0(@C0359n0 C34962a aVar) {
        this.f85568M0 = aVar;
    }

    /* renamed from: R0 */
    public void mo104581R0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85560E0 = oTPublishersHeadlessSDK;
    }

    /* renamed from: S0 */
    public void mo104582S0(C35093b bVar) {
        this.f85562G0 = bVar;
    }

    /* renamed from: U0 */
    public final void mo104583U0(String str, String str2) {
        C18472d.m83648d(this.f85564I0, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str)}));
        this.f85580e.setTextColor(Color.parseColor(str));
        this.f85586y.setBackgroundColor(Color.parseColor(str2));
    }

    /* renamed from: W0 */
    public final void mo104584W0(boolean z, @C0359n0 String str, int i) {
        C34963b bVar = new C34963b(i);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        new UIUtils().mo104267E(bVar, this.f85568M0);
    }

    /* renamed from: Y0 */
    public void mo104585Y0(@C0359n0 String str) {
        this.f85561F0 = this.f85560E0.getVendorDetails(Integer.parseInt(str));
    }

    /* renamed from: Z0 */
    public final void mo104586Z0(String str, String str2) {
        C18472d.m83648d(this.f85565J0, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str)}));
        this.f85581f.setTextColor(Color.parseColor(str));
        this.f85587z.setBackgroundColor(Color.parseColor(str2));
    }

    /* renamed from: a */
    public void mo104338a() {
        this.f85562G0.mo104597b(24);
    }

    /* renamed from: a1 */
    public final void mo104587a1(boolean z) {
        String trim = this.f85561F0.optString("id").trim();
        this.f85560E0.updateVendorLegitInterest(trim, z);
        if (this.f85570O0) {
            mo104584W0(z, trim, 16);
        }
    }

    /* renamed from: b */
    public final void mo104589b(int i) {
        this.f85584w.setVisibility(this.f85563H0.mo104403a(i));
    }

    /* renamed from: b1 */
    public void mo104590b1() {
        CardView cardView;
        CardView cardView2 = this.f85584w;
        if (cardView2 == null || cardView2.getVisibility() != 0) {
            CardView cardView3 = this.f85585x;
            if (cardView3 != null && cardView3.getVisibility() == 0) {
                cardView = this.f85585x;
            } else {
                return;
            }
        } else {
            cardView = this.f85584w;
        }
        cardView.requestFocus();
    }

    /* renamed from: c1 */
    public final void mo104591c1(int i) {
        boolean z = false;
        this.f85569N0 = false;
        this.f85570O0 = false;
        this.f85565J0.setChecked(i == 1);
        int optInt = this.f85561F0.optInt(OTVendorUtils.CONSENT_TYPE);
        CheckBox checkBox = this.f85564I0;
        if (optInt == 1) {
            z = true;
        }
        checkBox.setChecked(z);
    }

    /* renamed from: d */
    public void mo104592d(@C0359n0 String str) {
        OTLogger.m143447b("TV Vendor", "IAB Vendor Disclosure API called ");
        ((C35001a) new C13092x.C13094b().mo30599c("https://geolocation.1trust.app/").mo30598b(C13006c.m56324f()).mo30606j(new OkHttpClient.Builder().build()).mo30602f().mo30586g(C35001a.class)).mo103939d(str).mo30458k1(new C35092a());
    }

    /* renamed from: d1 */
    public final void mo104593d1() {
        this.f85572Q0 = new C35036e().mo104304f(this.f85563H0.mo104419s());
        String A = this.f85563H0.mo104393A();
        m144146T0(A, this.f85576a);
        m144146T0(A, this.f85577b);
        m144146T0(A, this.f85582g);
        m144146T0(A, this.f85578c);
        m144146T0(A, this.f85579d);
        this.f85583v.setBackgroundColor(Color.parseColor(this.f85563H0.mo104419s()));
        this.f85573X.setBackgroundColor(Color.parseColor(A));
        this.f85584w.setCardElevation(1.0f);
        this.f85585x.setCardElevation(1.0f);
        mo104583U0(A, this.f85572Q0);
        mo104586Z0(A, this.f85572Q0);
    }

    /* renamed from: j */
    public final void mo104594j(boolean z) {
        String trim = this.f85561F0.optString("id").trim();
        this.f85560E0.updateVendorConsent(trim, z);
        if (this.f85569N0) {
            mo104584W0(z, trim, 15);
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85575Z = getContext();
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85575Z, layoutInflater, viewGroup, C35265a.C35276k.ot_vendor_details_tv_fragment);
        this.f85566K0 = new JSONObject();
        mo104579O0(e);
        mo104588b();
        return e;
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.tv_vd_card_consent) {
            C35069c cVar = this.f85563H0;
            if (z) {
                mo104583U0(cVar.mo104421u().mo104710m(), this.f85563H0.mo104421u().mo104708k());
                this.f85584w.setCardElevation(6.0f);
            } else {
                mo104583U0(cVar.mo104393A(), this.f85572Q0);
                this.f85584w.setCardElevation(1.0f);
            }
        }
        if (view.getId() == C35265a.C35273h.tv_vd_card_li) {
            C35069c cVar2 = this.f85563H0;
            if (z) {
                mo104586Z0(cVar2.mo104421u().mo104710m(), this.f85563H0.mo104421u().mo104708k());
                this.f85585x.setCardElevation(6.0f);
                return;
            }
            mo104586Z0(cVar2.mo104393A(), this.f85572Q0);
            this.f85585x.setCardElevation(1.0f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKey(android.view.View r5, int r6, android.view.KeyEvent r7) {
        /*
            r4 = this;
            int r0 = r5.getId()
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.tv_vd_card_consent
            r2 = 21
            r3 = 1
            if (r0 != r1) goto L_0x001a
            int r0 = com.onetrust.otpublishers.headless.p052UI.Helper.C35036e.m143801a(r6, r7)
            if (r0 != r2) goto L_0x001a
            r4.f85569N0 = r3
            android.widget.CheckBox r5 = r4.f85564I0
        L_0x0015:
            boolean r0 = r5.isChecked()
            goto L_0x002d
        L_0x001a:
            int r5 = r5.getId()
            int r0 = com.onetrust.otpublishers.headless.C35265a.C35273h.tv_vd_card_li
            if (r5 != r0) goto L_0x0031
            int r5 = com.onetrust.otpublishers.headless.p052UI.Helper.C35036e.m143801a(r6, r7)
            if (r5 != r2) goto L_0x0031
            r4.f85570O0 = r3
            android.widget.CheckBox r5 = r4.f85565J0
            goto L_0x0015
        L_0x002d:
            r0 = r0 ^ r3
            r5.setChecked(r0)
        L_0x0031:
            r5 = 4
            if (r6 != r5) goto L_0x0041
            int r5 = r7.getAction()
            if (r5 != r3) goto L_0x0041
            com.onetrust.otpublishers.headless.UI.TVUI.fragments.p$b r5 = r4.f85562G0
            r0 = 23
            r5.mo104597b(r0)
        L_0x0041:
            int r5 = com.onetrust.otpublishers.headless.p052UI.Helper.C35036e.m143801a(r6, r7)
            r6 = 24
            if (r5 != r6) goto L_0x004e
            com.onetrust.otpublishers.headless.UI.TVUI.fragments.p$b r5 = r4.f85562G0
            r5.mo104597b(r6)
        L_0x004e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35091p.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    /* renamed from: b */
    public final void mo104588b() {
        C35071e m = C35071e.m143968m();
        m.mo104441h(this.f85561F0);
        this.f85563H0 = C35069c.m143925y();
        this.f85571P0.setSmoothScrollingEnabled(true);
        this.f85576a.setText(m.mo104453u());
        this.f85577b.setText(m.mo104454v());
        this.f85578c.setText(m.mo104448p());
        this.f85579d.setText(m.mo104449q());
        this.f85580e.setText(this.f85563H0.mo104422v());
        this.f85581f.setText(this.f85563H0.mo104425z());
        this.f85582g.setText(m.mo104447o());
        if (!C35020d.m143605J(m.mo104444k())) {
            mo104592d(m.mo104444k());
        }
        this.f85567L0 = new C35056n(mo104578M0(m, this.f85566K0), this);
        this.f85574Y.setLayoutManager(new LinearLayoutManager(this.f85575Z));
        this.f85574Y.setAdapter(this.f85567L0);
        JSONObject jSONObject = this.f85561F0;
        if (jSONObject != null) {
            mo104591c1(jSONObject.optInt(OTVendorUtils.LEGITIMATE_CONSENT_TYPE));
            mo104577E(this.f85561F0.optInt(OTVendorUtils.LEGITIMATE_CONSENT_TYPE));
            mo104589b(this.f85561F0.optInt(OTVendorUtils.CONSENT_TYPE));
        }
        mo104593d1();
    }
}
