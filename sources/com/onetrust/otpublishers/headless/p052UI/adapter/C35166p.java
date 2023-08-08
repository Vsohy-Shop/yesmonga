package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.C19232h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.installations.C33124s;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34967b0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35033b;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35120t;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35192b0;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35259d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.p */
public class C35166p extends RecyclerView.Adapter<C35167a> implements C35127a {

    /* renamed from: a */
    public final C35127a f86019a;

    /* renamed from: b */
    public final OTConfiguration f86020b;

    /* renamed from: c */
    public OTPublishersHeadlessSDK f86021c;

    /* renamed from: d */
    public JSONArray f86022d;

    /* renamed from: e */
    public Context f86023e;

    /* renamed from: f */
    public final C34962a f86024f;

    /* renamed from: g */
    public C35192b0 f86025g;

    /* renamed from: v */
    public C35120t f86026v;

    /* renamed from: w */
    public String f86027w;

    /* renamed from: x */
    public String f86028x;

    /* renamed from: y */
    public String f86029y;

    /* renamed from: z */
    public C35259d f86030z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.p$a */
    public static class C35167a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f86031a;

        /* renamed from: b */
        public TextView f86032b;

        /* renamed from: c */
        public SwitchCompat f86033c;

        /* renamed from: d */
        public ImageView f86034d;

        /* renamed from: e */
        public View f86035e;

        /* renamed from: f */
        public RelativeLayout f86036f;

        public C35167a(View view) {
            super(view);
            this.f86031a = (TextView) view.findViewById(C35265a.C35273h.group_name);
            this.f86033c = (SwitchCompat) view.findViewById(C35265a.C35273h.consent_switch);
            this.f86032b = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveText);
            this.f86035e = view.findViewById(C35265a.C35273h.view3);
            this.f86034d = (ImageView) view.findViewById(C35265a.C35273h.show_more);
            this.f86036f = (RelativeLayout) view.findViewById(C35265a.C35273h.items);
        }
    }

    public C35166p(@C0359n0 Context context, @C0359n0 C35259d dVar, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 C34962a aVar, @C0363p0 C35127a aVar2, @C0363p0 OTConfiguration oTConfiguration) {
        this.f86030z = dVar;
        this.f86022d = dVar.mo105537I();
        this.f86023e = context;
        this.f86021c = oTPublishersHeadlessSDK;
        this.f86024f = aVar;
        this.f86019a = aVar2;
        this.f86026v = dVar.mo105534F();
        this.f86020b = oTConfiguration;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m144873p(int i, JSONObject jSONObject, View view) {
        mo105190o(i, jSONObject);
    }

    /* renamed from: q */
    public static void m144874q(View view, @C0363p0 String str) {
        if (!C35020d.m143605J(str)) {
            view.setBackgroundColor(Color.parseColor(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m144875w(JSONObject jSONObject, C35167a aVar, CompoundButton compoundButton, boolean z) {
        try {
            String string = jSONObject.getString("CustomGroupId");
            this.f86021c.updatePurposeConsent(string, z);
            OTLogger.m143447b("OTPCGroupsAdapter", "updated consent of group : " + string + C33124s.f80355c + this.f86021c.getPurposeConsentLocal(string));
            C34963b bVar = new C34963b(7);
            bVar.mo103581c(string);
            bVar.mo103580b(z ? 1 : 0);
            new UIUtils().mo104267E(bVar, this.f86024f);
            if (z) {
                mo105197z(aVar.f86033c);
            } else {
                mo105192s(aVar.f86033c);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while updating parent " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m144876x(JSONObject jSONObject, C35167a aVar, String str, View view) {
        try {
            if (jSONObject.has("SubGroups")) {
                mo105195v(jSONObject.getJSONArray("SubGroups"), aVar.f86033c.isChecked());
            }
            mo105196y(aVar.f86033c.isChecked(), str);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error in setting subgroup consent parent " + e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 4) {
            notifyDataSetChanged();
        }
        C35127a aVar = this.f86019a;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    public int getItemCount() {
        return this.f86022d.length();
    }

    @C0359n0
    /* renamed from: n */
    public C35167a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35167a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_preference_center_item, viewGroup, false));
    }

    /* renamed from: o */
    public final void mo105190o(int i, @C0359n0 JSONObject jSONObject) {
        if (!this.f86025g.isAdded()) {
            Bundle bundle = new Bundle();
            bundle.putString("SUBGROUP_ARRAY", jSONObject.toString());
            if (jSONObject.has("SubGroups")) {
                bundle.putInt("PARENT_POSITION", i);
            }
            bundle.putString("sdkLevelOptOutShow", this.f86030z.mo105545Q());
            this.f86025g.setArguments(bundle);
            this.f86025g.show(((C19232h) this.f86023e).mo57175g0(), OTFragmentTags.OT_PREFERENCE_CENTER_DETAILS_FRAGMENT_TAG);
        }
    }

    @C0376v0(api = 17)
    /* renamed from: r */
    public final void mo105191r(@C0359n0 TextView textView, String str, C35033b bVar) {
        textView.setText(str);
        textView.setTextColor(Color.parseColor(bVar.mo104296u()));
        if (!C35020d.m143605J(bVar.mo104293H())) {
            textView.setTextSize(Float.parseFloat(bVar.mo104293H()));
        }
        textView.setTextAlignment(bVar.mo104292G());
        textView.setVisibility(bVar.mo104297w());
        new UIUtils().mo104264A(textView, bVar.mo104712o(), this.f86020b);
    }

    /* renamed from: s */
    public final void mo105192s(@C0359n0 SwitchCompat switchCompat) {
        new UIUtils().mo104280s(this.f86023e, switchCompat, this.f86027w, this.f86029y);
    }

    @C0376v0(api = 17)
    /* renamed from: t */
    public void onBindViewHolder(@C0359n0 C35167a aVar, int i) {
        try {
            int adapterPosition = aVar.getAdapterPosition();
            JSONObject jSONObject = this.f86022d.getJSONObject(adapterPosition);
            this.f86027w = this.f86026v.mo104934b();
            this.f86028x = this.f86026v.mo104932a();
            this.f86029y = this.f86026v.mo104945g0();
            String P = this.f86030z.mo105544P();
            if (!C35020d.m143605J(P)) {
                UIUtils.m143757x(aVar.f86034d, P);
            }
            boolean z = jSONObject.getBoolean("HasConsentOptOut");
            String string = jSONObject.getString("CustomGroupId");
            C35033b q = this.f86030z.mo105560q();
            mo105191r(aVar.f86032b, q.mo104295s(), q);
            mo105191r(aVar.f86031a, new UIUtils().mo104274j(jSONObject), this.f86030z.mo105531C());
            m144874q(aVar.f86035e, this.f86030z.mo105566w());
            mo105194u(aVar, adapterPosition, z);
            aVar.f86033c.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            aVar.f86033c.setOnClickListener((View.OnClickListener) null);
            aVar.f86033c.setContentDescription(this.f86030z.mo105565v());
            aVar.f86033c.setChecked(this.f86021c.getPurposeConsentLocal(string) == 1);
            if (this.f86021c.getPurposeConsentLocal(string) == 1) {
                mo105197z(aVar.f86033c);
            } else {
                mo105192s(aVar.f86033c);
            }
            aVar.f86033c.setOnClickListener(new C35163m(this, jSONObject, aVar, string));
            aVar.f86033c.setOnCheckedChangeListener(new C35164n(this, jSONObject, aVar));
            C35192b0 a1 = C35192b0.m145029a1(OTFragmentTags.OT_PREFERENCE_CENTER_DETAILS_FRAGMENT_TAG, this.f86024f, this.f86020b, this.f86030z);
            this.f86025g = a1;
            a1.mo105302k1(this);
            this.f86025g.mo105301j1(this.f86021c);
            aVar.f86036f.setOnClickListener(new C35165o(this, adapterPosition, jSONObject));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error in rendering groups " + e.getMessage());
        }
    }

    /* renamed from: u */
    public final void mo105194u(@C0359n0 C35167a aVar, int i, boolean z) {
        View g;
        if (this.f86022d.getJSONObject(i).getString(PersistedInstallation.f80251i).contains("always")) {
            aVar.f86033c.setVisibility(8);
            g = aVar.f86032b;
        } else {
            aVar.f86032b.setVisibility(4);
            g = aVar.f86033c;
            if (!z) {
                g.setVisibility(8);
                return;
            }
        }
        g.setVisibility(0);
    }

    /* renamed from: v */
    public final void mo105195v(@C0359n0 JSONArray jSONArray, boolean z) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("CustomGroupId");
            if (jSONObject.getBoolean("HasConsentOptOut")) {
                mo105196y(z, string);
                this.f86021c.updatePurposeConsent(string, z);
            }
        }
    }

    /* renamed from: y */
    public final void mo105196y(boolean z, @C0359n0 String str) {
        JSONArray l = new C34967b0(this.f86023e).mo103644l(str);
        if (l != null) {
            for (int i = 0; i < l.length(); i++) {
                this.f86021c.updateSDKConsentStatus(l.get(i).toString(), z);
            }
        }
    }

    /* renamed from: z */
    public final void mo105197z(@C0359n0 SwitchCompat switchCompat) {
        new UIUtils().mo104280s(this.f86023e, switchCompat, this.f86027w, this.f86028x);
    }
}
