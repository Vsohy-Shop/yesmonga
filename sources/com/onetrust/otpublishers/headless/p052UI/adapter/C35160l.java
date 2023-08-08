package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34967b0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34976h;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35119s;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35260e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.l */
public class C35160l extends RecyclerView.Adapter<C35162b> {

    /* renamed from: E0 */
    public String f85976E0;

    /* renamed from: F0 */
    public String f85977F0;

    /* renamed from: G0 */
    public C35119s f85978G0;

    /* renamed from: H0 */
    public JSONObject f85979H0;

    /* renamed from: I0 */
    public C35260e f85980I0;

    /* renamed from: J0 */
    public String f85981J0;

    /* renamed from: K0 */
    public String f85982K0;

    /* renamed from: L0 */
    public String f85983L0;

    /* renamed from: X */
    public boolean f85984X;

    /* renamed from: Y */
    public boolean f85985Y;

    /* renamed from: Z */
    public C34962a f85986Z = new C34962a();

    /* renamed from: a */
    public final OTConfiguration f85987a;

    /* renamed from: b */
    public JSONArray f85988b;

    /* renamed from: c */
    public String f85989c;

    /* renamed from: d */
    public Boolean f85990d;

    /* renamed from: e */
    public Boolean f85991e;

    /* renamed from: f */
    public Boolean f85992f;

    /* renamed from: g */
    public OTPublishersHeadlessSDK f85993g;

    /* renamed from: v */
    public Context f85994v;

    /* renamed from: w */
    public int f85995w;

    /* renamed from: x */
    public C35161a f85996x;

    /* renamed from: y */
    public boolean f85997y;

    /* renamed from: z */
    public boolean f85998z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.l$a */
    public interface C35161a {
        /* renamed from: I */
        void mo105185I(String str, int i, boolean z, boolean z2);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.l$b */
    public static class C35162b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85999a;

        /* renamed from: b */
        public TextView f86000b;

        /* renamed from: c */
        public TextView f86001c;

        /* renamed from: d */
        public TextView f86002d;

        /* renamed from: e */
        public TextView f86003e;

        /* renamed from: f */
        public TextView f86004f;

        /* renamed from: g */
        public SwitchCompat f86005g;

        /* renamed from: h */
        public SwitchCompat f86006h;

        /* renamed from: i */
        public SwitchCompat f86007i;

        /* renamed from: j */
        public View f86008j;

        public C35162b(View view) {
            super(view);
            this.f86001c = (TextView) view.findViewById(C35265a.C35273h.sub_group_name);
            this.f86002d = (TextView) view.findViewById(C35265a.C35273h.sub_group_desc);
            this.f86005g = (SwitchCompat) view.findViewById(C35265a.C35273h.consent_toggle);
            this.f86006h = (SwitchCompat) view.findViewById(C35265a.C35273h.legitInt_toggle);
            this.f85999a = (TextView) view.findViewById(C35265a.C35273h.tv_consent);
            this.f86000b = (TextView) view.findViewById(C35265a.C35273h.tv_legit_Int);
            this.f86003e = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveTextChild);
            this.f86004f = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveText_non_iab);
            this.f86007i = (SwitchCompat) view.findViewById(C35265a.C35273h.consent_toggle_non_iab);
            this.f86008j = view.findViewById(C35265a.C35273h.item_divider);
        }
    }

    public C35160l(C35161a aVar, @C0363p0 Context context, @C0359n0 int i, boolean z, @C0363p0 OTConfiguration oTConfiguration, C35260e eVar, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85980I0 = eVar;
        this.f85988b = eVar.mo105571b().optJSONArray("SubGroups");
        this.f85990d = Boolean.valueOf(z);
        this.f85991e = Boolean.valueOf(eVar.mo105587w());
        this.f85992f = Boolean.valueOf(eVar.mo105588x());
        this.f85997y = eVar.mo105586v();
        this.f85993g = oTPublishersHeadlessSDK;
        this.f85994v = context;
        this.f85995w = i;
        this.f85996x = aVar;
        this.f85977F0 = eVar.mo105577l();
        this.f85978G0 = eVar.mo105584t();
        this.f85987a = oTConfiguration;
        this.f85981J0 = eVar.mo105584t().mo104877C();
        this.f85982K0 = eVar.mo105584t().mo104876B();
        this.f85983L0 = eVar.mo105584t().mo104875A();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m144829B(JSONObject jSONObject, int i, C35162b bVar, View view) {
        try {
            mo105184z(jSONObject.getString("Parent"), this.f85988b.getJSONObject(i).getString("CustomGroupId"), bVar.f86006h.isChecked(), true);
        } catch (JSONException e) {
            OTLogger.m143457l("OTPCDetailsAdapter", "Error while updating parent status " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m144830C(JSONObject jSONObject, C35162b bVar, CompoundButton compoundButton, boolean z) {
        String str;
        Context context;
        SwitchCompat switchCompat;
        UIUtils uIUtils;
        String str2;
        try {
            String string = jSONObject.getString("CustomGroupId");
            this.f85993g.updatePurposeConsent(string, z);
            C34963b bVar2 = new C34963b(7);
            bVar2.mo103581c(string);
            bVar2.mo103580b(z ? 1 : 0);
            new UIUtils().mo104267E(bVar2, this.f85986Z);
            if (z) {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86005g;
                str = this.f85981J0;
                str2 = this.f85982K0;
            } else {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86005g;
                str = this.f85981J0;
                str2 = this.f85983L0;
            }
            uIUtils.mo104280s(context, switchCompat, str, str2);
        } catch (JSONException e) {
            OTLogger.m143457l("OTPCDetailsAdapter", "Error while updating consent status " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m144831F(int i, C35162b bVar, View view) {
        try {
            mo105184z(this.f85988b.getJSONObject(i).getString("Parent"), this.f85988b.getJSONObject(i).getString("CustomGroupId"), bVar.f86007i.isChecked(), false);
        } catch (JSONException e) {
            OTLogger.m143457l("OTPCDetailsAdapter", "Error while setting parent status " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m144832I(JSONObject jSONObject, C35162b bVar, CompoundButton compoundButton, boolean z) {
        try {
            String string = jSONObject.getString("CustomGroupId");
            this.f85993g.updatePurposeConsent(string, z);
            C34963b bVar2 = new C34963b(7);
            bVar2.mo103581c(string);
            bVar2.mo103580b(z ? 1 : 0);
            new UIUtils().mo104267E(bVar2, this.f85986Z);
            mo105169D(z, bVar);
        } catch (JSONException e) {
            OTLogger.m143457l("OTPCDetailsAdapter", "Error while updating consent status " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m144833L(JSONObject jSONObject, C35162b bVar, CompoundButton compoundButton, boolean z) {
        String str;
        Context context;
        SwitchCompat switchCompat;
        UIUtils uIUtils;
        String str2;
        try {
            String string = jSONObject.getString("CustomGroupId");
            this.f85993g.updatePurposeLegitInterest(string, z);
            C34963b bVar2 = new C34963b(11);
            bVar2.mo103581c(string);
            bVar2.mo103580b(z ? 1 : 0);
            new UIUtils().mo104267E(bVar2, this.f85986Z);
            if (z) {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86006h;
                str = this.f85981J0;
                str2 = this.f85982K0;
            } else {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86006h;
                str = this.f85981J0;
                str2 = this.f85983L0;
            }
            uIUtils.mo104280s(context, switchCompat, str, str2);
        } catch (JSONException e) {
            OTLogger.m143457l("OTPCDetailsAdapter", "Error while updating LI status " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m144840r(int i, C35162b bVar, View view) {
        try {
            mo105184z(this.f85988b.getJSONObject(i).getString("Parent"), this.f85988b.getJSONObject(i).getString("CustomGroupId"), bVar.f86005g.isChecked(), false);
        } catch (JSONException e) {
            OTLogger.m143457l("OTPCDetailsAdapter", "Error while setting parent status " + e.getMessage());
        }
    }

    /* renamed from: s */
    public static void m144841s(@C0359n0 TextView textView, int i, @C0363p0 View view) {
        textView.setVisibility(i);
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: A */
    public final void mo105168A(@C0359n0 String str, boolean z) {
        int purposeLegitInterestLocal;
        int length = this.f85988b.length();
        int i = 0;
        for (int i2 = 0; i2 < this.f85988b.length(); i2++) {
            OTPublishersHeadlessSDK oTPublishersHeadlessSDK = this.f85993g;
            JSONObject jSONObject = this.f85988b.getJSONObject(i2);
            if (!z) {
                purposeLegitInterestLocal = oTPublishersHeadlessSDK.getPurposeConsentLocal(jSONObject.getString("CustomGroupId"));
            } else if (oTPublishersHeadlessSDK.getPurposeLegitInterestLocal(jSONObject.getString("CustomGroupId")) >= 0) {
                purposeLegitInterestLocal = this.f85993g.getPurposeLegitInterestLocal(this.f85988b.getJSONObject(i2).getString("CustomGroupId"));
            } else {
                length--;
            }
            i += purposeLegitInterestLocal;
        }
        if (!z) {
            if (this.f85988b.length() == i) {
                this.f85996x.mo105185I(str, this.f85995w, true, false);
            }
        } else if (i == length) {
            this.f85996x.mo105185I(str, this.f85995w, true, true);
        }
    }

    /* renamed from: D */
    public final void mo105169D(boolean z, @C0359n0 C35162b bVar) {
        SwitchCompat switchCompat;
        UIUtils uIUtils;
        String str;
        String str2;
        Context context;
        if (z) {
            uIUtils = new UIUtils();
            context = this.f85994v;
            switchCompat = bVar.f86007i;
            str2 = this.f85981J0;
            str = this.f85982K0;
        } else {
            uIUtils = new UIUtils();
            context = this.f85994v;
            switchCompat = bVar.f86007i;
            str2 = this.f85981J0;
            str = this.f85983L0;
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    /* renamed from: E */
    public final void mo105170E(boolean z, @C0359n0 String str) {
        JSONArray l = new C34967b0(this.f85994v).mo103644l(str);
        OTLogger.m143458m("OTPCDetailsAdapter", "SDK Ids of  : " + str + " is " + l);
        if (l != null) {
            for (int i = 0; i < l.length(); i++) {
                try {
                    this.f85993g.updateSDKConsentStatus(l.get(i).toString(), z);
                } catch (JSONException e) {
                    OTLogger.m143457l("OneTrust", "Error in setting group sdk status " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo105171G(@C0359n0 C35162b bVar) {
        m144841s(bVar.f86002d, this.f85997y ? 0 : 8, (View) null);
    }

    /* renamed from: H */
    public final void mo105172H(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject) {
        TextView textView;
        if (!this.f85998z || !this.f85989c.equals("IAB2_PURPOSE") || !this.f85990d.booleanValue()) {
            m144841s(bVar.f86006h, 8, (View) null);
            m144841s(bVar.f86000b, 8, (View) null);
        } else {
            m144841s(bVar.f86006h, 0, (View) null);
            m144841s(bVar.f86000b, 0, (View) null);
        }
        if (!this.f85980I0.mo105571b().getString(PersistedInstallation.f80251i).contains("always") || !jSONObject.getString("Type").equals("COOKIE")) {
            if (!this.f85985Y) {
                m144841s(bVar.f86005g, 8, (View) null);
                m144841s(bVar.f85999a, 8, (View) null);
                m144841s(bVar.f86003e, 8, (View) null);
                textView = bVar.f86004f;
            } else if (this.f85984X) {
                m144841s(bVar.f86005g, 0, (View) null);
                textView = bVar.f86003e;
            } else {
                m144841s(bVar.f86005g, 8, (View) null);
                m144841s(bVar.f86003e, 8, (View) null);
                m144841s(bVar.f86007i, 0, (View) null);
                m144841s(bVar.f86004f, 8, (View) null);
            }
            m144841s(textView, 8, (View) null);
        } else if (this.f85984X) {
            m144841s(bVar.f86005g, 8, (View) null);
            m144841s(bVar.f86003e, 0, (View) null);
            return;
        } else {
            m144841s(bVar.f86005g, 8, (View) null);
            m144841s(bVar.f86003e, 8, (View) null);
            m144841s(bVar.f86004f, 0, (View) null);
        }
        textView = bVar.f85999a;
        m144841s(textView, 8, (View) null);
    }

    @C0376v0(api = 17)
    /* renamed from: J */
    public final void mo105173J(@C0359n0 C35162b bVar) {
        try {
            if (this.f85978G0 != null) {
                mo105178t(bVar.f86001c, this.f85978G0.mo104903x());
                mo105178t(bVar.f86002d, this.f85978G0.mo104904y());
                mo105178t(bVar.f85999a, this.f85978G0.mo104891m());
                mo105178t(bVar.f86000b, this.f85978G0.mo104897s());
                mo105178t(bVar.f86003e, this.f85978G0.mo104879a());
                mo105178t(bVar.f86004f, this.f85978G0.mo104879a());
                String v = this.f85978G0.mo104901v();
                if (!C35020d.m143605J(v)) {
                    bVar.f86008j.setBackgroundColor(Color.parseColor(v));
                }
                String g = this.f85978G0.mo104891m().mo104663g();
                bVar.f86005g.setContentDescription(g);
                bVar.f86007i.setContentDescription(g);
                bVar.f86006h.setContentDescription(this.f85978G0.mo104897s().mo104663g());
            }
        } catch (IllegalArgumentException e) {
            OTLogger.m143457l("OneTrust", "Error while applying Styles to PC Details view, err : " + e.getMessage());
        }
    }

    /* renamed from: K */
    public final void mo105174K(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject) {
        int i;
        TextView textView;
        if (!this.f85984X || !jSONObject.getString("Type").contains("IAB")) {
            textView = bVar.f86000b;
            i = 8;
        } else {
            textView = bVar.f86000b;
            i = 0;
        }
        m144841s(textView, i, (View) null);
    }

    /* renamed from: M */
    public final void mo105175M(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject) {
        UIUtils uIUtils;
        SwitchCompat switchCompat;
        String str;
        String str2;
        Context context;
        if (bVar.f86006h.getVisibility() == 0) {
            bVar.f86006h.setChecked(this.f85993g.getPurposeLegitInterestLocal(jSONObject.getString("CustomGroupId")) == 1);
            if (this.f85993g.getPurposeLegitInterestLocal(jSONObject.getString("CustomGroupId")) == 1) {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86006h;
                str2 = this.f85981J0;
                str = this.f85982K0;
            } else {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86006h;
                str2 = this.f85981J0;
                str = this.f85983L0;
            }
            uIUtils.mo104280s(context, switchCompat, str2, str);
        }
    }

    /* renamed from: N */
    public final void mo105176N(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject) {
        UIUtils uIUtils;
        SwitchCompat switchCompat;
        String str;
        String str2;
        Context context;
        UIUtils uIUtils2;
        Context context2;
        SwitchCompat g;
        boolean z = false;
        if (this.f85984X) {
            SwitchCompat f = bVar.f86005g;
            if (this.f85993g.getPurposeConsentLocal(jSONObject.getString("CustomGroupId")) == 1) {
                z = true;
            }
            f.setChecked(z);
            if (this.f85993g.getPurposeConsentLocal(jSONObject.getString("CustomGroupId")) == 1) {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86005g;
            } else {
                uIUtils2 = new UIUtils();
                context2 = this.f85994v;
                g = bVar.f86005g;
                str2 = this.f85981J0;
                str = this.f85983L0;
                uIUtils.mo104280s(context, switchCompat, str2, str);
            }
        } else {
            SwitchCompat g2 = bVar.f86007i;
            if (this.f85993g.getPurposeConsentLocal(jSONObject.getString("CustomGroupId")) == 1) {
                z = true;
            }
            g2.setChecked(z);
            if (this.f85993g.getPurposeConsentLocal(jSONObject.getString("CustomGroupId")) == 1) {
                uIUtils = new UIUtils();
                context = this.f85994v;
                switchCompat = bVar.f86007i;
            } else {
                uIUtils2 = new UIUtils();
                context2 = this.f85994v;
                g = bVar.f86007i;
                str2 = this.f85981J0;
                str = this.f85983L0;
                uIUtils.mo104280s(context, switchCompat, str2, str);
            }
        }
        str2 = this.f85981J0;
        str = this.f85982K0;
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    public int getItemCount() {
        JSONArray jSONArray = this.f85988b;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: q */
    public C35162b onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return new C35162b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_preference_center_details_item, viewGroup, false));
    }

    @C0376v0(api = 17)
    /* renamed from: t */
    public final void mo105178t(@C0359n0 TextView textView, C35102b0 b0Var) {
        textView.setText(b0Var.mo104663g());
        textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f85987a);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            textView.setTextAlignment(Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: u */
    public final void mo105179u(@C0359n0 C35162b bVar) {
        if (this.f85984X) {
            m144841s(bVar.f86005g, 8, (View) null);
            m144841s(bVar.f86006h, 8, (View) null);
            m144841s(bVar.f85999a, 0, (View) null);
            m144841s(bVar.f86000b, 8, (View) null);
            m144841s(bVar.f86003e, 0, (View) null);
            return;
        }
        m144841s(bVar.f86005g, 8, (View) null);
        m144841s(bVar.f86003e, 8, (View) null);
        m144841s(bVar.f86004f, 0, (View) null);
        m144841s(bVar.f85999a, 8, (View) null);
    }

    @C0376v0(api = 17)
    /* renamed from: v */
    public void onBindViewHolder(@C0359n0 C35162b bVar, int i) {
        bVar.setIsRecyclable(false);
        try {
            this.f85979H0 = this.f85993g.getPreferenceCenterData();
            this.f85984X = new C34976h().mo103751m(new C35014d(this.f85994v, "OTT_DEFAULT_USER"));
            mo105173J(bVar);
            JSONObject jSONObject = this.f85988b.getJSONObject(bVar.getAdapterPosition());
            this.f85998z = jSONObject.getBoolean("HasLegIntOptOut");
            this.f85985Y = jSONObject.getBoolean("HasConsentOptOut");
            this.f85989c = jSONObject.getString("Type");
            boolean z = jSONObject.getBoolean("HasLegIntOptOut");
            mo105174K(bVar, jSONObject);
            bVar.f86001c.setText(new UIUtils().mo104274j(jSONObject));
            C18196h2.m82478C1(bVar.f86001c, true);
            String optString = jSONObject.optString("GroupDescription");
            if (jSONObject.has("DescriptionLegal")) {
                this.f85976E0 = jSONObject.getString("DescriptionLegal");
            }
            bVar.f86003e.setText(this.f85978G0.mo104879a().mo104663g());
            bVar.f86004f.setText(this.f85978G0.mo104879a().mo104663g());
            mo105182x(bVar, jSONObject, optString);
            mo105176N(bVar, jSONObject);
            bVar.f86005g.setOnClickListener(new C35143f(this, i, bVar));
            bVar.f86007i.setOnClickListener(new C35146g(this, i, bVar));
            bVar.f86005g.setOnCheckedChangeListener(new C35149h(this, jSONObject, bVar));
            bVar.f86007i.setOnCheckedChangeListener(new C35152i(this, jSONObject, bVar));
            mo105175M(bVar, jSONObject);
            bVar.f86006h.setOnClickListener(new C35154j(this, jSONObject, i, bVar));
            bVar.f86006h.setOnCheckedChangeListener(new C35156k(this, jSONObject, bVar));
            mo105171G(bVar);
            if (this.f85992f.booleanValue()) {
                m144841s(bVar.f86001c, 0, bVar.f86008j);
                mo105181w(bVar, jSONObject);
                mo105183y(bVar, jSONObject, z);
                return;
            }
            m144841s(bVar.f86001c, 8, (View) null);
            m144841s(bVar.f86002d, 8, (View) null);
            m144841s(bVar.f86005g, 8, (View) null);
            m144841s(bVar.f86006h, 8, (View) null);
            m144841s(bVar.f86000b, 8, (View) null);
            m144841s(bVar.f85999a, 8, (View) null);
            m144841s(bVar.f86003e, 8, (View) null);
            m144841s(bVar.f86004f, 8, (View) null);
            m144841s(bVar.f86007i, 8, (View) null);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while rendering purpose items in Vendor detail screen " + e.getMessage());
        }
    }

    /* renamed from: w */
    public final void mo105181w(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.getString(PersistedInstallation.f80251i).contains("always") || jSONObject.getString("Type").equals("IAB2_SPL_PURPOSE") || jSONObject.getString("Type").equals("IAB2_FEATURE")) {
            mo105179u(bVar);
        } else {
            mo105172H(bVar, jSONObject);
        }
    }

    /* renamed from: x */
    public final void mo105182x(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        int i;
        TextView textView;
        Context context;
        TextView textView2;
        if (this.f85979H0 != null) {
            UIUtils uIUtils = new UIUtils();
            if (!C35020d.m143605J(str)) {
                textView = bVar.f86002d;
                i = 0;
            } else {
                textView = bVar.f86002d;
                i = 8;
            }
            m144841s(textView, i, (View) null);
            if (!this.f85977F0.equalsIgnoreCase("user_friendly")) {
                if (this.f85977F0.equalsIgnoreCase("legal")) {
                    if (!jSONObject.getString("Type").equals("COOKIE")) {
                        context = this.f85994v;
                        textView2 = bVar.f86002d;
                        str = this.f85976E0;
                        uIUtils.mo104279r(context, textView2, str);
                    }
                } else if (!this.f85979H0.isNull(this.f85977F0) && !C35020d.m143605J(this.f85977F0)) {
                    return;
                }
            }
            context = this.f85994v;
            textView2 = bVar.f86002d;
            uIUtils.mo104279r(context, textView2, str);
        }
    }

    /* renamed from: y */
    public final void mo105183y(@C0359n0 C35162b bVar, @C0359n0 JSONObject jSONObject, boolean z) {
        TextView textView;
        if (!this.f85991e.booleanValue()) {
            m144841s(bVar.f86005g, 8, (View) null);
            m144841s(bVar.f86006h, 8, (View) null);
            m144841s(bVar.f86000b, 8, (View) null);
            m144841s(bVar.f85999a, 8, (View) null);
            m144841s(bVar.f86003e, 8, (View) null);
            m144841s(bVar.f86004f, 8, (View) null);
            textView = bVar.f86007i;
        } else if (!z || !jSONObject.getString("CustomGroupId").startsWith("IABV2_") || !this.f85990d.booleanValue()) {
            m144841s(bVar.f86006h, 8, (View) null);
            textView = bVar.f86000b;
        } else {
            m144841s(bVar.f86006h, 0, (View) null);
            m144841s(bVar.f86000b, 0, (View) null);
            return;
        }
        m144841s(textView, 8, (View) null);
    }

    /* renamed from: z */
    public final void mo105184z(@C0359n0 String str, @C0359n0 String str2, boolean z, boolean z2) {
        if (!z) {
            this.f85996x.mo105185I(str, this.f85995w, false, z2);
        } else {
            mo105168A(str, z2);
        }
        mo105170E(z, str2);
    }
}
