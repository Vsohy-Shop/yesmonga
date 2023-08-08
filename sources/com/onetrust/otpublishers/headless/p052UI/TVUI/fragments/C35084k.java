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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.cardview.widget.CardView;
import androidx.core.widget.C18472d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.C35265a;
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
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.k */
public class C35084k extends Fragment implements C35044f.C35045a, View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: E0 */
    public boolean f85511E0;

    /* renamed from: F0 */
    public C35044f f85512F0;

    /* renamed from: G0 */
    public View f85513G0;

    /* renamed from: H0 */
    public C35069c f85514H0;

    /* renamed from: I0 */
    public CardView f85515I0;

    /* renamed from: J0 */
    public CardView f85516J0;

    /* renamed from: K0 */
    public TextView f85517K0;

    /* renamed from: L0 */
    public CheckBox f85518L0;

    /* renamed from: M0 */
    public CheckBox f85519M0;

    /* renamed from: N0 */
    public ImageView f85520N0;

    /* renamed from: O0 */
    public int f85521O0;

    /* renamed from: P0 */
    public CardView f85522P0;

    /* renamed from: Q0 */
    public LinearLayout f85523Q0;

    /* renamed from: R0 */
    public TextView f85524R0;

    /* renamed from: S0 */
    public String f85525S0;

    /* renamed from: X */
    public LinearLayout f85526X;

    /* renamed from: Y */
    public C34962a f85527Y;

    /* renamed from: Z */
    public C35085a f85528Z;

    /* renamed from: a */
    public TextView f85529a;

    /* renamed from: b */
    public TextView f85530b;

    /* renamed from: c */
    public TextView f85531c;

    /* renamed from: d */
    public TextView f85532d;

    /* renamed from: e */
    public TextView f85533e;

    /* renamed from: f */
    public RecyclerView f85534f;

    /* renamed from: g */
    public Context f85535g;

    /* renamed from: v */
    public LinearLayout f85536v;

    /* renamed from: w */
    public LinearLayout f85537w;

    /* renamed from: x */
    public TextView f85538x;

    /* renamed from: y */
    public OTPublishersHeadlessSDK f85539y;

    /* renamed from: z */
    public JSONObject f85540z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.k$a */
    public interface C35085a {
        /* renamed from: b */
        void mo104560b();

        /* renamed from: c */
        void mo104561c(Map<String, String> map);

        /* renamed from: e */
        void mo104562e(JSONObject jSONObject, boolean z);

        /* renamed from: w */
        void mo104563w(int i, boolean z, boolean z2);
    }

    @C0359n0
    @C0376v0(api = 21)
    /* renamed from: K0 */
    public static C35084k m144079K0(@C0359n0 String str, @C0359n0 C34962a aVar, JSONObject jSONObject, C35085a aVar2, boolean z, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35084k kVar = new C35084k();
        Bundle bundle = new Bundle();
        bundle.putString("GroupDetails", str);
        kVar.setArguments(bundle);
        kVar.mo104541X0(jSONObject);
        kVar.mo104535Q0(aVar);
        kVar.mo104538U0(aVar2);
        kVar.mo104549f1(z);
        kVar.mo104536R0(oTPublishersHeadlessSDK);
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ void m144080O0(CompoundButton compoundButton, boolean z) {
        mo104547d1(z);
        int i = 1;
        if (this.f85521O0 > 1) {
            i = 3;
        }
        this.f85521O0 = i;
    }

    /* renamed from: S0 */
    public static void m144081S0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 JSONObject jSONObject, boolean z) {
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
    /* renamed from: b1 */
    public /* synthetic */ void m144082b1(CompoundButton compoundButton, boolean z) {
        mo104551h1(z);
        int i = this.f85521O0;
        int i2 = 2;
        if (!(i == 0 || i == 2)) {
            i2 = 3;
        }
        this.f85521O0 = i2;
    }

    /* renamed from: L0 */
    public final void mo104531L0(int i, int i2) {
        boolean z = false;
        if (i == 0) {
            this.f85519M0.setChecked(i2 == 1);
        }
        int purposeConsentLocal = this.f85539y.getPurposeConsentLocal(this.f85540z.optString("CustomGroupId"));
        CheckBox checkBox = this.f85518L0;
        if (purposeConsentLocal == 1) {
            z = true;
        }
        checkBox.setChecked(z);
    }

    /* renamed from: M0 */
    public final void mo104532M0(@C0359n0 View view) {
        this.f85529a = (TextView) view.findViewById(C35265a.C35273h.tv_category_title);
        this.f85530b = (TextView) view.findViewById(C35265a.C35273h.tv_category_desc);
        this.f85536v = (LinearLayout) view.findViewById(C35265a.C35273h.group_status_on);
        this.f85537w = (LinearLayout) view.findViewById(C35265a.C35273h.group_status_off);
        this.f85534f = (RecyclerView) view.findViewById(C35265a.C35273h.tv_subgroup_list);
        this.f85531c = (TextView) view.findViewById(C35265a.C35273h.subgroup_list_title);
        this.f85513G0 = view.findViewById(C35265a.C35273h.ot_grp_dtl_sg_div);
        this.f85526X = (LinearLayout) view.findViewById(C35265a.C35273h.tv_grp_detail_lyt);
        this.f85515I0 = (CardView) view.findViewById(C35265a.C35273h.tv_sg_card_on);
        this.f85516J0 = (CardView) view.findViewById(C35265a.C35273h.tv_sg_card_off);
        this.f85532d = (TextView) view.findViewById(C35265a.C35273h.group_status_on_tv);
        this.f85533e = (TextView) view.findViewById(C35265a.C35273h.group_status_off_tv);
        this.f85538x = (TextView) view.findViewById(C35265a.C35273h.ot_iab_legal_desc_tv);
        this.f85517K0 = (TextView) view.findViewById(C35265a.C35273h.always_active_status_iab);
        this.f85518L0 = (CheckBox) view.findViewById(C35265a.C35273h.tv_consent_cb);
        this.f85519M0 = (CheckBox) view.findViewById(C35265a.C35273h.tv_li_cb);
        this.f85520N0 = (ImageView) view.findViewById(C35265a.C35273h.tv_sub_grp_back);
        this.f85534f.setHasFixedSize(true);
        this.f85534f.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f85515I0.setOnKeyListener(this);
        this.f85516J0.setOnKeyListener(this);
        this.f85515I0.setOnFocusChangeListener(this);
        this.f85516J0.setOnFocusChangeListener(this);
        this.f85520N0.setOnKeyListener(this);
        this.f85538x.setOnKeyListener(this);
        this.f85520N0.setOnFocusChangeListener(this);
        this.f85518L0.setOnCheckedChangeListener(new C35082i(this));
        this.f85519M0.setOnCheckedChangeListener(new C35083j(this));
        this.f85522P0 = (CardView) view.findViewById(C35265a.C35273h.card_list_of_partners);
        this.f85523Q0 = (LinearLayout) view.findViewById(C35265a.C35273h.list_of_partners_lyt);
        this.f85524R0 = (TextView) view.findViewById(C35265a.C35273h.list_of_partners_tv);
        this.f85522P0.setOnKeyListener(this);
        this.f85522P0.setOnFocusChangeListener(this);
    }

    /* renamed from: N0 */
    public final void mo104533N0(@C0359n0 View view, int i, @C0359n0 KeyEvent keyEvent) {
        CheckBox checkBox;
        if (view.getId() == C35265a.C35273h.tv_sg_card_on && C35036e.m143801a(i, keyEvent) == 21) {
            checkBox = this.f85518L0;
        } else if (view.getId() == C35265a.C35273h.tv_sg_card_off && C35036e.m143801a(i, keyEvent) == 21) {
            checkBox = this.f85519M0;
        } else {
            return;
        }
        checkBox.setChecked(!checkBox.isChecked());
    }

    /* renamed from: P0 */
    public final void mo104534P0(TextView textView) {
        this.f85533e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f85532d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, C35265a.C35272g.ot_tv_tickmark_white, 0);
        if (this.f85514H0.mo104421u().mo104710m() != null && !C35020d.m143605J(this.f85514H0.mo104421u().mo104710m())) {
            C35036e.m143802d(textView, this.f85514H0.mo104421u().mo104710m());
        }
    }

    /* renamed from: Q0 */
    public void mo104535Q0(C34962a aVar) {
        this.f85527Y = aVar;
    }

    /* renamed from: R0 */
    public void mo104536R0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85539y = oTPublishersHeadlessSDK;
    }

    @C0376v0(api = 21)
    /* renamed from: T0 */
    public final void mo104537T0(@C0359n0 C35069c cVar) {
        this.f85525S0 = new C35036e().mo104304f(cVar.mo104419s());
        String A = cVar.mo104393A();
        this.f85530b.setTextColor(Color.parseColor(A));
        this.f85529a.setTextColor(Color.parseColor(A));
        this.f85526X.setBackgroundColor(Color.parseColor(cVar.mo104419s()));
        this.f85513G0.setBackgroundColor(Color.parseColor(A));
        this.f85531c.setTextColor(Color.parseColor(A));
        this.f85538x.setTextColor(Color.parseColor(A));
        mo104542Y0(false, cVar.mo104421u());
        mo104539V0(A, this.f85525S0);
        mo104546c1(A, this.f85525S0);
        this.f85515I0.setCardElevation(1.0f);
        this.f85516J0.setCardElevation(1.0f);
        mo104553j(false);
    }

    /* renamed from: U0 */
    public void mo104538U0(C35085a aVar) {
        this.f85528Z = aVar;
    }

    /* renamed from: V0 */
    public final void mo104539V0(String str, String str2) {
        C18472d.m83648d(this.f85518L0, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str)}));
        this.f85517K0.setTextColor(Color.parseColor(str));
        this.f85532d.setTextColor(Color.parseColor(str));
        this.f85536v.setBackgroundColor(Color.parseColor(str2));
        C35036e.m143802d(this.f85532d, str);
    }

    /* renamed from: W0 */
    public final void mo104540W0(@C0359n0 String str, boolean z) {
        if (!z) {
            this.f85539y.updatePurposeLegitInterest(str, false);
            return;
        }
        try {
            if (C35069c.m143925y().mo104411k(str, this.f85539y)) {
                this.f85539y.updatePurposeLegitInterest(str, true);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while updating parent LI status on TV, err: " + e.getMessage());
        }
    }

    @C0376v0(api = 21)
    /* renamed from: X0 */
    public void mo104541X0(@C0359n0 JSONObject jSONObject) {
        boolean z = this.f85540z != null;
        this.f85540z = jSONObject;
        if (z) {
            mo104545b();
        }
    }

    /* renamed from: Y0 */
    public final void mo104542Y0(boolean z, C35105e eVar) {
        String str;
        TextView textView;
        if (z) {
            this.f85522P0.setElevation(6.0f);
            if (!C35020d.m143605J(eVar.mo104708k()) && !C35020d.m143605J(eVar.mo104710m())) {
                this.f85523Q0.setBackgroundColor(Color.parseColor(eVar.mo104708k()));
                textView = this.f85524R0;
                str = eVar.mo104710m();
            } else {
                return;
            }
        } else {
            this.f85522P0.setElevation(1.0f);
            this.f85523Q0.setBackgroundColor(Color.parseColor(this.f85525S0));
            textView = this.f85524R0;
            str = this.f85514H0.mo104393A();
        }
        textView.setTextColor(Color.parseColor(str));
    }

    /* renamed from: Z0 */
    public final void mo104543Z0(boolean z, @C0359n0 String str, int i) {
        C34963b bVar = new C34963b(i);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        new UIUtils().mo104267E(bVar, this.f85527Y);
    }

    /* renamed from: a */
    public void mo104320a() {
    }

    /* renamed from: a1 */
    public final void mo104544a1(@C0359n0 View view, int i, KeyEvent keyEvent) {
        TextView textView;
        if (view.getId() == C35265a.C35273h.tv_sg_card_on && C35036e.m143801a(i, keyEvent) == 21) {
            mo104547d1(true);
            textView = this.f85532d;
        } else if (view.getId() == C35265a.C35273h.tv_sg_card_off && C35036e.m143801a(i, keyEvent) == 21) {
            mo104547d1(false);
            textView = this.f85533e;
        } else {
            return;
        }
        mo104534P0(textView);
    }

    @C0376v0(api = 21)
    /* renamed from: b */
    public final void mo104545b() {
        UIUtils uIUtils = new UIUtils();
        this.f85514H0 = C35069c.m143925y();
        C35068b i = C35068b.m143905i();
        uIUtils.mo104279r(this.f85535g, this.f85529a, new C35036e().mo104303c(this.f85540z));
        this.f85532d.setText(i.mo104376a());
        this.f85533e.setText(i.mo104383h());
        this.f85538x.setVisibility(this.f85514H0.mo104418r(this.f85540z));
        uIUtils.mo104279r(this.f85535g, this.f85538x, this.f85514H0.mo104414n(this.f85540z));
        this.f85524R0.setText(this.f85514H0.mo104400H().mo104663g());
        this.f85520N0.setVisibility(0);
        if (!C35020d.m143605J(this.f85514H0.mo104406d(this.f85540z))) {
            uIUtils.mo104279r(this.f85535g, this.f85530b, this.f85514H0.mo104406d(this.f85540z));
        } else {
            this.f85530b.setVisibility(8);
        }
        mo104537T0(this.f85514H0);
        mo104555k1();
        mo104556l1();
        mo104557m1();
        if (this.f85540z.optString(PersistedInstallation.f80251i).contains("always")) {
            mo104548e1();
        } else {
            mo104552i1();
        }
        this.f85531c.setVisibility(8);
        this.f85513G0.setVisibility(this.f85522P0.getVisibility());
        if (!this.f85511E0 && !this.f85514H0.mo104423w(this.f85540z)) {
            JSONArray optJSONArray = this.f85540z.optJSONArray("SubGroups");
            Objects.requireNonNull(optJSONArray);
            C35044f fVar = new C35044f(optJSONArray, this.f85535g, this.f85539y, this);
            this.f85512F0 = fVar;
            this.f85534f.setAdapter(fVar);
            this.f85531c.setText(i.mo104392r());
            this.f85531c.setVisibility(0);
            this.f85513G0.setVisibility(this.f85516J0.getVisibility());
        }
    }

    /* renamed from: c1 */
    public final void mo104546c1(String str, String str2) {
        C18472d.m83648d(this.f85519M0, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str)}));
        this.f85533e.setTextColor(Color.parseColor(str));
        this.f85537w.setBackgroundColor(Color.parseColor(str2));
        C35036e.m143802d(this.f85533e, str);
    }

    /* renamed from: d1 */
    public final void mo104547d1(boolean z) {
        String optString = this.f85540z.optString("CustomGroupId");
        mo104543Z0(z, optString, 7);
        this.f85539y.updatePurposeConsent(optString, z);
    }

    /* renamed from: e */
    public void mo104321e(JSONObject jSONObject, boolean z) {
        this.f85528Z.mo104562e(jSONObject, z);
    }

    /* renamed from: e1 */
    public final void mo104548e1() {
        if (!this.f85540z.optBoolean("isAlertNotice")) {
            this.f85515I0.setVisibility(0);
        }
        if (this.f85514H0.mo104401I()) {
            this.f85532d.setText(this.f85514H0.mo104422v());
            this.f85532d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f85517K0.setVisibility(0);
            this.f85517K0.setText(this.f85514H0.mo104413m());
            return;
        }
        this.f85532d.setText(this.f85514H0.mo104413m());
        mo104555k1();
    }

    /* renamed from: f1 */
    public void mo104549f1(boolean z) {
        this.f85511E0 = z;
    }

    /* renamed from: g1 */
    public void mo104550g1() {
        CardView cardView;
        CardView cardView2 = this.f85515I0;
        if (cardView2 == null || cardView2.getVisibility() != 0) {
            CardView cardView3 = this.f85516J0;
            if (cardView3 == null || cardView3.getVisibility() != 0) {
                TextView textView = this.f85530b;
                if (textView != null) {
                    textView.requestFocus();
                    return;
                }
                return;
            }
            cardView = this.f85516J0;
        } else {
            cardView = this.f85515I0;
        }
        cardView.requestFocus();
    }

    /* renamed from: h1 */
    public final void mo104551h1(boolean z) {
        String optString = this.f85540z.optString("CustomGroupId");
        this.f85539y.updatePurposeLegitInterest(optString, z);
        mo104543Z0(z, optString, 11);
        if (this.f85540z.has("SubGroups") && C35020d.m143605J(this.f85540z.optString("Parent"))) {
            m144081S0(this.f85539y, this.f85540z, z);
        } else if (!this.f85540z.has("SubGroups") && !C35020d.m143605J(this.f85540z.optString("Parent"))) {
            mo104540W0(this.f85540z.optString("Parent"), z);
        }
        C35044f fVar = this.f85512F0;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: i1 */
    public final void mo104552i1() {
        if (this.f85514H0.mo104401I() && !this.f85540z.optBoolean("isAlertNotice")) {
            this.f85532d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f85533e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f85532d.setText(this.f85514H0.mo104422v());
            this.f85533e.setText(this.f85514H0.mo104425z());
            int purposeLegitInterestLocal = this.f85539y.getPurposeLegitInterestLocal(this.f85540z.optString("CustomGroupId"));
            int l = this.f85514H0.mo104412l(purposeLegitInterestLocal);
            this.f85516J0.setVisibility(l);
            this.f85519M0.setVisibility(l);
            this.f85518L0.setVisibility(0);
            mo104531L0(l, purposeLegitInterestLocal);
        }
    }

    @C0376v0(api = 21)
    /* renamed from: j */
    public final void mo104553j(boolean z) {
        Drawable drawable;
        String str;
        if (z) {
            this.f85520N0.getBackground().setTint(Color.parseColor(this.f85514H0.mo104421u().mo104708k()));
            drawable = this.f85520N0.getDrawable();
            str = this.f85514H0.mo104421u().mo104710m();
        } else {
            this.f85520N0.getBackground().setTint(Color.parseColor(this.f85514H0.mo104393A()));
            drawable = this.f85520N0.getDrawable();
            str = this.f85514H0.mo104419s();
        }
        drawable.setTint(Color.parseColor(str));
    }

    /* renamed from: j1 */
    public final void mo104554j1() {
        this.f85515I0.setVisibility(this.f85540z.optBoolean("HasConsentOptOut") ? 0 : 8);
    }

    /* renamed from: k1 */
    public final void mo104555k1() {
        TextView textView;
        if (this.f85539y.getPurposeConsentLocal(this.f85540z.optString("CustomGroupId")) == 1) {
            this.f85532d.setCompoundDrawablesWithIntrinsicBounds(0, 0, C35265a.C35272g.ot_tv_tickmark, 0);
            textView = this.f85532d;
        } else {
            this.f85533e.setCompoundDrawablesWithIntrinsicBounds(0, 0, C35265a.C35272g.ot_tv_tickmark, 0);
            textView = this.f85533e;
        }
        C35036e.m143802d(textView, this.f85514H0.mo104393A());
    }

    /* renamed from: l1 */
    public final void mo104556l1() {
        CardView cardView;
        int i = 8;
        if (!this.f85540z.optBoolean("isAlertNotice")) {
            this.f85515I0.setVisibility(this.f85514H0.mo104420t(this.f85540z));
            this.f85516J0.setVisibility(this.f85514H0.mo104420t(this.f85540z));
            if (this.f85540z.optBoolean("IsIabPurpose")) {
                mo104554j1();
                cardView = this.f85516J0;
                if (this.f85540z.optBoolean("HasLegIntOptOut")) {
                    i = 0;
                }
            } else {
                return;
            }
        } else {
            this.f85515I0.setVisibility(8);
            cardView = this.f85516J0;
        }
        cardView.setVisibility(i);
    }

    /* renamed from: m1 */
    public final void mo104557m1() {
        this.f85522P0.setVisibility(this.f85514H0.mo104404b(this.f85540z.optBoolean("IsIabPurpose")));
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85535g = getContext();
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85535g, layoutInflater, viewGroup, C35265a.C35276k.ot_pc_subgroupdetail_tv);
        mo104532M0(e);
        mo104545b();
        return e;
    }

    @C0376v0(api = 21)
    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.tv_sg_card_on) {
            C35069c cVar = this.f85514H0;
            if (z) {
                mo104539V0(cVar.mo104421u().mo104710m(), this.f85514H0.mo104421u().mo104708k());
                this.f85515I0.setCardElevation(6.0f);
            } else {
                mo104539V0(cVar.mo104393A(), this.f85525S0);
                this.f85515I0.setCardElevation(1.0f);
            }
        }
        if (view.getId() == C35265a.C35273h.tv_sg_card_off) {
            C35069c cVar2 = this.f85514H0;
            if (z) {
                mo104546c1(cVar2.mo104421u().mo104710m(), this.f85514H0.mo104421u().mo104708k());
                this.f85516J0.setCardElevation(6.0f);
            } else {
                mo104546c1(cVar2.mo104393A(), this.f85525S0);
                this.f85516J0.setCardElevation(1.0f);
            }
        }
        if (view.getId() == C35265a.C35273h.card_list_of_partners) {
            mo104542Y0(z, this.f85514H0.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.tv_sub_grp_back) {
            mo104553j(z);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!this.f85514H0.mo104401I()) {
            mo104544a1(view, i, keyEvent);
        } else {
            mo104533N0(view, i, keyEvent);
        }
        if (view.getId() == C35265a.C35273h.card_list_of_partners && C35036e.m143801a(i, keyEvent) == 21) {
            HashMap hashMap = new HashMap();
            hashMap.put(this.f85540z.optString("CustomGroupId"), this.f85540z.optString("Type"));
            this.f85528Z.mo104561c(hashMap);
        }
        if (view.getId() == C35265a.C35273h.tv_sub_grp_back && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85528Z.mo104563w(this.f85521O0, this.f85539y.getPurposeConsentLocal(this.f85540z.optString("CustomGroupId")) == 1, this.f85539y.getPurposeLegitInterestLocal(this.f85540z.optString("CustomGroupId")) == 1);
        }
        if (view.getId() != C35265a.C35273h.ot_iab_legal_desc_tv || keyEvent.getKeyCode() != 20) {
            return false;
        }
        this.f85528Z.mo104560b();
        return true;
    }
}
