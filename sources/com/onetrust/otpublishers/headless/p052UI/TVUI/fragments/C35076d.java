package com.onetrust.otpublishers.headless.p052UI.TVUI.fragments;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.core.widget.C18472d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35044f;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35068b;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35120t;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.d */
public class C35076d extends Fragment implements C35044f.C35045a, View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: E0 */
    public TextView f85456E0;

    /* renamed from: F0 */
    public View f85457F0;

    /* renamed from: G0 */
    public JSONObject f85458G0;

    /* renamed from: H0 */
    public LinearLayout f85459H0;

    /* renamed from: I0 */
    public C34962a f85460I0;

    /* renamed from: J0 */
    public C35077a f85461J0;

    /* renamed from: K0 */
    public boolean f85462K0;

    /* renamed from: L0 */
    public C35044f f85463L0;

    /* renamed from: M0 */
    public View f85464M0;

    /* renamed from: N0 */
    public C35069c f85465N0;

    /* renamed from: O0 */
    public CardView f85466O0;

    /* renamed from: P0 */
    public CardView f85467P0;

    /* renamed from: Q0 */
    public CardView f85468Q0;

    /* renamed from: R0 */
    public LinearLayout f85469R0;

    /* renamed from: S0 */
    public LinearLayout f85470S0;

    /* renamed from: T0 */
    public TextView f85471T0;

    /* renamed from: U0 */
    public RelativeLayout f85472U0;

    /* renamed from: V0 */
    public TextView f85473V0;

    /* renamed from: W0 */
    public CheckBox f85474W0;

    /* renamed from: X */
    public TextView f85475X;

    /* renamed from: X0 */
    public CheckBox f85476X0;

    /* renamed from: Y */
    public TextView f85477Y;

    /* renamed from: Y0 */
    public boolean f85478Y0 = true;

    /* renamed from: Z */
    public TextView f85479Z;

    /* renamed from: Z0 */
    public boolean f85480Z0 = true;

    /* renamed from: a */
    public TextView f85481a;

    /* renamed from: a1 */
    public String f85482a1;

    /* renamed from: b */
    public TextView f85483b;

    /* renamed from: c */
    public TextView f85484c;

    /* renamed from: d */
    public TextView f85485d;

    /* renamed from: e */
    public TextView f85486e;

    /* renamed from: f */
    public RecyclerView f85487f;

    /* renamed from: g */
    public Context f85488g;

    /* renamed from: v */
    public LinearLayout f85489v;

    /* renamed from: w */
    public LinearLayout f85490w;

    /* renamed from: x */
    public TextView f85491x;

    /* renamed from: y */
    public OTPublishersHeadlessSDK f85492y;

    /* renamed from: z */
    public TextView f85493z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.d$a */
    public interface C35077a {
        /* renamed from: b */
        void mo104510b(int i);

        /* renamed from: c */
        void mo104511c(Map<String, String> map);

        /* renamed from: e */
        void mo104512e(JSONObject jSONObject, boolean z);
    }

    @C0359n0
    /* renamed from: K0 */
    public static C35076d m144012K0(@C0359n0 String str, @C0359n0 C34962a aVar, JSONObject jSONObject, C35077a aVar2, boolean z, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35076d dVar = new C35076d();
        Bundle bundle = new Bundle();
        bundle.putString("GroupDetails", str);
        dVar.setArguments(bundle);
        dVar.mo104486Y0(jSONObject);
        dVar.mo104480R0(aVar);
        dVar.mo104483V0(aVar2);
        dVar.mo104499k1(z);
        dVar.mo104481S0(oTPublishersHeadlessSDK);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ void m144013O0(CompoundButton compoundButton, boolean z) {
        mo104496i1(z);
    }

    /* renamed from: T0 */
    public static void m144014T0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 JSONObject jSONObject, boolean z) {
        int i = 0;
        while (i < jSONObject.getJSONArray("SubGroups").length()) {
            try {
                oTPublishersHeadlessSDK.updatePurposeLegitInterest(jSONObject.getJSONArray("SubGroups").getJSONObject(i).optString("CustomGroupId"), z);
                i++;
            } catch (Exception e) {
                OTLogger.m143457l("OneTrust", "error while updating subgroup LI status on TV, err : " + e.getMessage());
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m144015c1(CompoundButton compoundButton, boolean z) {
        mo104501m1(z);
    }

    /* renamed from: d1 */
    public static void m144016d1(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 JSONObject jSONObject, boolean z) {
        int i = 0;
        while (i < jSONObject.getJSONArray("SubGroups").length()) {
            try {
                oTPublishersHeadlessSDK.updatePurposeConsent(jSONObject.getJSONArray("SubGroups").getJSONObject(i).optString("CustomGroupId"), z);
                i++;
            } catch (Exception e) {
                OTLogger.m143457l("OneTrust", "error while updating subgroup status on TV, err : " + e.getMessage());
                return;
            }
        }
    }

    /* renamed from: L0 */
    public final void mo104475L0(int i, int i2) {
        boolean z = false;
        if (i == 0) {
            this.f85476X0.setChecked(i2 == 1);
        }
        int purposeConsentLocal = this.f85492y.getPurposeConsentLocal(this.f85458G0.optString("CustomGroupId"));
        CheckBox checkBox = this.f85474W0;
        if (purposeConsentLocal == 1) {
            z = true;
        }
        checkBox.setChecked(z);
    }

    /* renamed from: M0 */
    public final void mo104476M0(@C0359n0 View view) {
        this.f85481a = (TextView) view.findViewById(C35265a.C35273h.tv_category_title);
        this.f85483b = (TextView) view.findViewById(C35265a.C35273h.tv_category_desc);
        this.f85489v = (LinearLayout) view.findViewById(C35265a.C35273h.group_status_on);
        this.f85490w = (LinearLayout) view.findViewById(C35265a.C35273h.group_status_off);
        this.f85487f = (RecyclerView) view.findViewById(C35265a.C35273h.tv_subgroup_list);
        this.f85484c = (TextView) view.findViewById(C35265a.C35273h.subgroup_list_title);
        this.f85464M0 = view.findViewById(C35265a.C35273h.ot_grp_dtl_sg_div);
        this.f85459H0 = (LinearLayout) view.findViewById(C35265a.C35273h.tv_grp_detail_lyt);
        this.f85466O0 = (CardView) view.findViewById(C35265a.C35273h.tv_sg_card_on);
        this.f85467P0 = (CardView) view.findViewById(C35265a.C35273h.tv_sg_card_off);
        this.f85487f.setHasFixedSize(true);
        this.f85487f.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f85466O0.setOnKeyListener(this);
        this.f85467P0.setOnKeyListener(this);
        this.f85466O0.setOnFocusChangeListener(this);
        this.f85467P0.setOnFocusChangeListener(this);
        this.f85485d = (TextView) view.findViewById(C35265a.C35273h.group_status_on_tv);
        this.f85486e = (TextView) view.findViewById(C35265a.C35273h.group_status_off_tv);
        this.f85491x = (TextView) view.findViewById(C35265a.C35273h.ot_iab_legal_desc_tv);
        this.f85473V0 = (TextView) view.findViewById(C35265a.C35273h.always_active_status_iab);
        this.f85474W0 = (CheckBox) view.findViewById(C35265a.C35273h.tv_consent_cb);
        this.f85476X0 = (CheckBox) view.findViewById(C35265a.C35273h.tv_li_cb);
        this.f85470S0 = (LinearLayout) view.findViewById(C35265a.C35273h.tv_dsid_layout);
        this.f85493z = (TextView) view.findViewById(C35265a.C35273h.tv_dsid_title);
        this.f85475X = (TextView) view.findViewById(C35265a.C35273h.tv_dsid);
        this.f85477Y = (TextView) view.findViewById(C35265a.C35273h.tv_timestamp_title);
        this.f85479Z = (TextView) view.findViewById(C35265a.C35273h.tv_timestamp);
        this.f85456E0 = (TextView) view.findViewById(C35265a.C35273h.tv_dsid_description);
        this.f85457F0 = view.findViewById(C35265a.C35273h.tv_dsid_divider);
        this.f85474W0.setOnCheckedChangeListener(new C35074b(this));
        this.f85476X0.setOnCheckedChangeListener(new C35075c(this));
        this.f85468Q0 = (CardView) view.findViewById(C35265a.C35273h.card_list_of_partners);
        this.f85469R0 = (LinearLayout) view.findViewById(C35265a.C35273h.list_of_partners_lyt);
        this.f85471T0 = (TextView) view.findViewById(C35265a.C35273h.list_of_partners_tv);
        this.f85472U0 = (RelativeLayout) view.findViewById(C35265a.C35273h.ot_tv_pc_detail_parent_lyt);
        this.f85468Q0.setOnKeyListener(this);
        this.f85468Q0.setOnFocusChangeListener(this);
        this.f85491x.setOnKeyListener(this);
        this.f85483b.setOnKeyListener(this);
        this.f85481a.setOnKeyListener(this);
    }

    /* renamed from: N0 */
    public final void mo104477N0(@C0359n0 View view, int i, KeyEvent keyEvent) {
        CheckBox checkBox;
        if (view.getId() == C35265a.C35273h.tv_sg_card_on && C35036e.m143801a(i, keyEvent) == 21) {
            checkBox = this.f85474W0;
        } else if (view.getId() == C35265a.C35273h.tv_sg_card_off && C35036e.m143801a(i, keyEvent) == 21) {
            checkBox = this.f85476X0;
        } else {
            return;
        }
        checkBox.setChecked(!checkBox.isChecked());
    }

    /* renamed from: P0 */
    public final void mo104478P0(TextView textView) {
        this.f85486e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f85485d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, C35265a.C35272g.ot_tv_tickmark_white, 0);
        if (this.f85465N0.mo104421u().mo104710m() != null && !C35020d.m143605J(this.f85465N0.mo104421u().mo104710m())) {
            C35036e.m143802d(textView, this.f85465N0.mo104421u().mo104710m());
        }
    }

    /* renamed from: Q0 */
    public final void mo104479Q0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        textView.setText(b0Var.mo104663g());
        textView.setTextColor(Color.parseColor(this.f85465N0.mo104393A()));
        textView.setVisibility(b0Var.mo104668l());
    }

    /* renamed from: R0 */
    public void mo104480R0(C34962a aVar) {
        this.f85460I0 = aVar;
    }

    /* renamed from: S0 */
    public void mo104481S0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85492y = oTPublishersHeadlessSDK;
    }

    /* renamed from: U0 */
    public final void mo104482U0(@C0359n0 C35069c cVar) {
        this.f85482a1 = new C35036e().mo104304f(cVar.mo104419s());
        String A = cVar.mo104393A();
        this.f85483b.setTextColor(Color.parseColor(A));
        this.f85481a.setTextColor(Color.parseColor(A));
        this.f85459H0.setBackgroundColor(Color.parseColor(cVar.mo104419s()));
        this.f85464M0.setBackgroundColor(Color.parseColor(A));
        this.f85484c.setTextColor(Color.parseColor(A));
        this.f85491x.setTextColor(Color.parseColor(A));
        mo104487Z0(false, cVar.mo104421u());
        mo104484W0(A, this.f85482a1);
        mo104492e1(A, this.f85482a1);
        this.f85466O0.setCardElevation(1.0f);
        this.f85467P0.setCardElevation(1.0f);
    }

    /* renamed from: V0 */
    public void mo104483V0(C35077a aVar) {
        this.f85461J0 = aVar;
    }

    /* renamed from: W0 */
    public final void mo104484W0(String str, String str2) {
        C18472d.m83648d(this.f85474W0, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str)}));
        this.f85473V0.setTextColor(Color.parseColor(str));
        this.f85485d.setTextColor(Color.parseColor(str));
        this.f85489v.setBackgroundColor(Color.parseColor(str2));
        C35036e.m143802d(this.f85485d, str);
    }

    /* renamed from: X0 */
    public final void mo104485X0(@C0359n0 String str, boolean z) {
        boolean z2 = false;
        this.f85480Z0 = false;
        if (!z) {
            this.f85492y.updatePurposeLegitInterest(str, false);
        } else {
            try {
                if (C35069c.m143925y().mo104411k(str, this.f85492y)) {
                    this.f85492y.updatePurposeLegitInterest(str, true);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while updating parent LI status on TV, err: " + e.getMessage());
            }
        }
        CheckBox checkBox = this.f85476X0;
        if (this.f85492y.getPurposeLegitInterestLocal(str) == 1) {
            z2 = true;
        }
        checkBox.setChecked(z2);
    }

    /* renamed from: Y0 */
    public void mo104486Y0(@C0359n0 JSONObject jSONObject) {
        boolean z = this.f85458G0 != null;
        this.f85458G0 = jSONObject;
        if (z) {
            mo104495h1();
        }
    }

    /* renamed from: Z0 */
    public final void mo104487Z0(boolean z, C35105e eVar) {
        String str;
        TextView textView;
        if (z) {
            this.f85468Q0.setElevation(6.0f);
            if (!C35020d.m143605J(eVar.mo104708k()) && !C35020d.m143605J(eVar.mo104710m())) {
                this.f85469R0.setBackgroundColor(Color.parseColor(eVar.mo104708k()));
                textView = this.f85471T0;
                str = eVar.mo104710m();
            } else {
                return;
            }
        } else {
            this.f85468Q0.setElevation(1.0f);
            this.f85469R0.setBackgroundColor(Color.parseColor(this.f85482a1));
            textView = this.f85471T0;
            str = this.f85465N0.mo104393A();
        }
        textView.setTextColor(Color.parseColor(str));
    }

    /* renamed from: a */
    public void mo104320a() {
        this.f85461J0.mo104510b(24);
    }

    /* renamed from: a1 */
    public final void mo104488a1(boolean z, @C0359n0 String str, int i) {
        C34963b bVar = new C34963b(i);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        new UIUtils().mo104267E(bVar, this.f85460I0);
    }

    /* renamed from: b */
    public final void mo104489b() {
        if (this.f85458G0.optBoolean("IsIabPurpose")) {
            mo104506p1();
            this.f85467P0.setVisibility(this.f85458G0.optBoolean("HasLegIntOptOut") ? 0 : 8);
        }
    }

    /* renamed from: b1 */
    public final void mo104490b1(@C0359n0 View view, int i, KeyEvent keyEvent) {
        TextView textView;
        if (view.getId() == C35265a.C35273h.tv_sg_card_on && C35036e.m143801a(i, keyEvent) == 21) {
            mo104496i1(true);
            textView = this.f85485d;
        } else if (view.getId() == C35265a.C35273h.tv_sg_card_off && C35036e.m143801a(i, keyEvent) == 21) {
            mo104496i1(false);
            textView = this.f85486e;
        } else {
            return;
        }
        mo104478P0(textView);
    }

    /* renamed from: c */
    public final void mo104491c(@C0359n0 Map<String, String> map) {
        if (this.f85458G0.optJSONArray("SubGroups") != null && this.f85458G0.optJSONArray("SubGroups").length() > 0) {
            JSONArray optJSONArray = this.f85458G0.optJSONArray("SubGroups");
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject.optBoolean("IsIabPurpose")) {
                    map.put(optJSONObject.optString("CustomGroupId"), optJSONObject.optString("Type"));
                }
            }
        }
    }

    /* renamed from: e */
    public void mo104321e(JSONObject jSONObject, boolean z) {
        this.f85461J0.mo104512e(jSONObject, z);
    }

    /* renamed from: e1 */
    public final void mo104492e1(String str, String str2) {
        C18472d.m83648d(this.f85476X0, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str)}));
        this.f85486e.setTextColor(Color.parseColor(str));
        this.f85490w.setBackgroundColor(Color.parseColor(str2));
        C35036e.m143802d(this.f85486e, str);
    }

    /* renamed from: f1 */
    public final void mo104493f1(@C0359n0 String str, boolean z) {
        boolean z2 = false;
        this.f85478Y0 = false;
        if (!z) {
            this.f85492y.updatePurposeConsent(str, false);
        } else {
            try {
                if (C35069c.m143925y().mo104417q(str, this.f85492y)) {
                    this.f85492y.updatePurposeConsent(str, true);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while updating parent category status on TV, err: " + e.getMessage());
            }
        }
        CheckBox checkBox = this.f85474W0;
        if (this.f85492y.getPurposeConsentLocal(str) == 1) {
            z2 = true;
        }
        checkBox.setChecked(z2);
    }

    /* renamed from: g1 */
    public void mo104494g1(boolean z) {
        if (!C35020d.m143605J(this.f85458G0.optString("CustomGroupId"))) {
            mo104485X0(this.f85458G0.optString("CustomGroupId"), z);
        }
    }

    /* renamed from: h1 */
    public final void mo104495h1() {
        UIUtils uIUtils = new UIUtils();
        this.f85465N0 = C35069c.m143925y();
        C35068b i = C35068b.m143905i();
        uIUtils.mo104279r(this.f85488g, this.f85481a, new C35036e().mo104303c(this.f85458G0));
        this.f85485d.setText(i.mo104376a());
        this.f85486e.setText(i.mo104383h());
        this.f85491x.setVisibility(this.f85465N0.mo104418r(this.f85458G0));
        uIUtils.mo104279r(this.f85488g, this.f85491x, this.f85465N0.mo104414n(this.f85458G0));
        this.f85471T0.setText(this.f85465N0.mo104400H().mo104663g());
        if (!C35020d.m143605J(this.f85465N0.mo104406d(this.f85458G0))) {
            uIUtils.mo104279r(this.f85488g, this.f85483b, this.f85465N0.mo104406d(this.f85458G0));
        } else {
            this.f85483b.setVisibility(8);
        }
        mo104482U0(this.f85465N0);
        mo104507q1();
        mo104508r1();
        mo104509s1();
        if (this.f85458G0.optString(PersistedInstallation.f80251i).contains("always")) {
            mo104498j1();
        } else {
            mo104503o1();
        }
        this.f85484c.setVisibility(8);
        this.f85464M0.setVisibility(this.f85468Q0.getVisibility());
        if (!this.f85462K0 && !this.f85465N0.mo104423w(this.f85458G0)) {
            JSONArray optJSONArray = this.f85458G0.optJSONArray("SubGroups");
            Objects.requireNonNull(optJSONArray);
            C35044f fVar = new C35044f(optJSONArray, this.f85488g, this.f85492y, this);
            this.f85463L0 = fVar;
            this.f85487f.setAdapter(fVar);
            this.f85484c.setText(i.mo104392r());
            this.f85484c.setVisibility(0);
            this.f85464M0.setVisibility(0);
        }
    }

    /* renamed from: i1 */
    public final void mo104496i1(boolean z) {
        String optString = this.f85458G0.optString("CustomGroupId");
        this.f85492y.updatePurposeConsent(optString, z);
        mo104488a1(z, optString, 7);
        if (this.f85458G0.has("SubGroups") && C35020d.m143605J(this.f85458G0.optString("Parent")) && this.f85478Y0) {
            m144016d1(this.f85492y, this.f85458G0, z);
        }
        C35044f fVar = this.f85463L0;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
        this.f85478Y0 = true;
    }

    /* renamed from: j */
    public void mo104497j(boolean z) {
        if (!C35020d.m143605J(this.f85458G0.optString("CustomGroupId"))) {
            mo104493f1(this.f85458G0.optString("CustomGroupId"), z);
        }
    }

    /* renamed from: j1 */
    public final void mo104498j1() {
        if (!this.f85458G0.optBoolean("isAlertNotice")) {
            this.f85466O0.setVisibility(0);
        }
        if (this.f85465N0.mo104401I()) {
            this.f85485d.setText(this.f85465N0.mo104422v());
            this.f85485d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f85473V0.setVisibility(0);
            this.f85473V0.setText(this.f85465N0.mo104413m());
            return;
        }
        this.f85485d.setText(this.f85465N0.mo104413m());
        mo104507q1();
    }

    /* renamed from: k1 */
    public void mo104499k1(boolean z) {
        this.f85462K0 = z;
    }

    /* renamed from: l1 */
    public void mo104500l1() {
        View view;
        if (this.f85466O0.getVisibility() == 0) {
            view = this.f85466O0;
        } else if (this.f85467P0.getVisibility() == 0) {
            view = this.f85467P0;
        } else if (this.f85483b.getVisibility() == 0) {
            view = this.f85483b;
        } else {
            return;
        }
        view.requestFocus();
    }

    /* renamed from: m1 */
    public final void mo104501m1(boolean z) {
        String optString = this.f85458G0.optString("CustomGroupId");
        this.f85492y.updatePurposeLegitInterest(optString, z);
        mo104488a1(z, optString, 11);
        if (this.f85458G0.has("SubGroups") && C35020d.m143605J(this.f85458G0.optString("Parent")) && this.f85480Z0) {
            m144014T0(this.f85492y, this.f85458G0, z);
        }
        C35044f fVar = this.f85463L0;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
        this.f85480Z0 = true;
    }

    /* renamed from: n1 */
    public void mo104502n1() {
        this.f85472U0.requestFocus();
    }

    /* renamed from: o1 */
    public final void mo104503o1() {
        if (this.f85465N0.mo104401I() && !this.f85458G0.optBoolean("isAlertNotice")) {
            this.f85485d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f85486e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f85485d.setText(this.f85465N0.mo104422v());
            this.f85486e.setText(this.f85465N0.mo104425z());
            int purposeLegitInterestLocal = this.f85492y.getPurposeLegitInterestLocal(this.f85458G0.optString("CustomGroupId"));
            int l = this.f85465N0.mo104412l(purposeLegitInterestLocal);
            this.f85467P0.setVisibility(l);
            this.f85476X0.setVisibility(l);
            this.f85474W0.setVisibility(0);
            mo104475L0(l, purposeLegitInterestLocal);
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85488g = getContext();
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85488g, layoutInflater, viewGroup, C35265a.C35276k.ot_pc_groupdetail_tv);
        mo104476M0(e);
        mo104495h1();
        return e;
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.tv_sg_card_on) {
            C35069c cVar = this.f85465N0;
            if (z) {
                mo104484W0(cVar.mo104421u().mo104710m(), this.f85465N0.mo104421u().mo104708k());
                this.f85466O0.setCardElevation(6.0f);
            } else {
                mo104484W0(cVar.mo104393A(), this.f85482a1);
                this.f85466O0.setCardElevation(1.0f);
            }
        }
        if (view.getId() == C35265a.C35273h.tv_sg_card_off) {
            C35069c cVar2 = this.f85465N0;
            if (z) {
                mo104492e1(cVar2.mo104421u().mo104710m(), this.f85465N0.mo104421u().mo104708k());
                this.f85467P0.setCardElevation(6.0f);
            } else {
                mo104492e1(cVar2.mo104393A(), this.f85482a1);
                this.f85467P0.setCardElevation(1.0f);
            }
        }
        if (view.getId() == C35265a.C35273h.card_list_of_partners) {
            mo104487Z0(z, this.f85465N0.mo104421u());
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!this.f85465N0.mo104401I()) {
            mo104490b1(view, i, keyEvent);
        } else {
            mo104477N0(view, i, keyEvent);
        }
        if (view.getId() == C35265a.C35273h.card_list_of_partners && C35036e.m143801a(i, keyEvent) == 21) {
            HashMap hashMap = new HashMap();
            if (!this.f85458G0.optString("Type").equals("IAB2_STACK")) {
                hashMap.put(this.f85458G0.optString("CustomGroupId"), this.f85458G0.optString("Type"));
            }
            mo104491c(hashMap);
            this.f85461J0.mo104511c(hashMap);
        }
        if (i == 4 && keyEvent.getAction() == 1) {
            this.f85461J0.mo104510b(1);
        }
        if (C35036e.m143801a(i, keyEvent) == 24) {
            this.f85461J0.mo104510b(24);
        }
        if (view.getId() == C35265a.C35273h.ot_iab_legal_desc_tv && C35036e.m143801a(i, keyEvent) == 24) {
            this.f85461J0.mo104510b(24);
        }
        if (view.getId() == C35265a.C35273h.tv_category_desc && C35036e.m143801a(i, keyEvent) == 24) {
            this.f85461J0.mo104510b(24);
        }
        if (view.getId() != C35265a.C35273h.tv_category_title || C35036e.m143801a(i, keyEvent) != 24) {
            return false;
        }
        this.f85461J0.mo104510b(24);
        return false;
    }

    /* renamed from: p1 */
    public final void mo104506p1() {
        this.f85466O0.setVisibility(this.f85458G0.optBoolean("HasConsentOptOut") ? 0 : 8);
    }

    /* renamed from: q1 */
    public final void mo104507q1() {
        TextView textView;
        if (this.f85492y.getPurposeConsentLocal(this.f85458G0.optString("CustomGroupId")) == 1) {
            this.f85485d.setCompoundDrawablesWithIntrinsicBounds(0, 0, C35265a.C35272g.ot_tv_tickmark, 0);
            textView = this.f85485d;
        } else {
            this.f85486e.setCompoundDrawablesWithIntrinsicBounds(0, 0, C35265a.C35272g.ot_tv_tickmark, 0);
            textView = this.f85486e;
        }
        C35036e.m143802d(textView, this.f85465N0.mo104393A());
    }

    /* renamed from: r1 */
    public final void mo104508r1() {
        if (!this.f85458G0.optBoolean("isAlertNotice")) {
            this.f85470S0.setVisibility(8);
            this.f85466O0.setVisibility(this.f85465N0.mo104420t(this.f85458G0));
            this.f85467P0.setVisibility(this.f85465N0.mo104420t(this.f85458G0));
            mo104489b();
            return;
        }
        this.f85466O0.setVisibility(8);
        this.f85467P0.setVisibility(8);
        C35120t E = this.f85465N0.mo104397E();
        if (C35019c.m143597b(E.mo104912G())) {
            mo104479Q0(this.f85493z, E.mo104918M());
            mo104479Q0(this.f85475X, E.mo104915J());
            mo104479Q0(this.f85477Y, E.mo104943f0());
            mo104479Q0(this.f85479Z, E.mo104941e0());
            mo104479Q0(this.f85456E0, E.mo104909D());
            this.f85457F0.setBackgroundColor(Color.parseColor(this.f85465N0.mo104393A()));
            return;
        }
        this.f85470S0.setVisibility(8);
    }

    /* renamed from: s1 */
    public final void mo104509s1() {
        this.f85468Q0.setVisibility(this.f85465N0.mo104404b(this.f85458G0.optBoolean("IsIabPurpose")));
    }
}
