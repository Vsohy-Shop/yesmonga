package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35206f1;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35263h;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.e */
public class C35139e extends RecyclerView.Adapter<C35141b> implements C35206f1.C35208b, Filterable {

    /* renamed from: X */
    public String f85871X;

    /* renamed from: Y */
    public String f85872Y;

    /* renamed from: Z */
    public String f85873Z;

    /* renamed from: a */
    public final C34962a f85874a;

    /* renamed from: b */
    public final OTConfiguration f85875b;

    /* renamed from: c */
    public JSONObject f85876c;

    /* renamed from: d */
    public final OTVendorUtils.ItemListener f85877d;

    /* renamed from: e */
    public final OTPublishersHeadlessSDK f85878e;

    /* renamed from: f */
    public String f85879f = "";

    /* renamed from: g */
    public final Context f85880g;

    /* renamed from: v */
    public boolean f85881v;

    /* renamed from: w */
    public boolean f85882w;

    /* renamed from: x */
    public final OTVendorUtils f85883x;

    /* renamed from: y */
    public boolean f85884y;

    /* renamed from: z */
    public final C35263h f85885z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.e$a */
    public class C35140a extends Filter {
        public C35140a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            String unused = C35139e.this.f85879f = charSequence2;
            String lowerCase = charSequence2.toLowerCase(Locale.ENGLISH);
            JSONObject jSONObject = new JSONObject();
            JSONObject n = C35139e.this.mo105125z();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            try {
                JSONArray names = n.names();
                if (lowerCase.isEmpty() || names == null) {
                    filterResults.values = n;
                } else {
                    C35139e.m144741C(lowerCase, jSONObject, n, names);
                    filterResults.values = jSONObject;
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while performing filtering of  vendor " + e.getMessage());
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C35139e.this.mo105123v(filterResults.values.toString());
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.e$b */
    public static class C35141b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final TextView f85887a;

        /* renamed from: b */
        public final SwitchCompat f85888b;

        /* renamed from: c */
        public final View f85889c;

        public C35141b(View view) {
            super(view);
            this.f85887a = (TextView) view.findViewById(C35265a.C35273h.vendor_name);
            this.f85888b = (SwitchCompat) view.findViewById(C35265a.C35273h.switchButton);
            this.f85889c = view.findViewById(C35265a.C35273h.view3);
        }
    }

    public C35139e(@C0359n0 OTVendorUtils.ItemListener itemListener, @C0359n0 Context context, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 C34962a aVar, boolean z, Map<String, String> map, @C0359n0 OTVendorUtils oTVendorUtils, @C0359n0 C35263h hVar, @C0359n0 OTConfiguration oTConfiguration) {
        this.f85877d = itemListener;
        this.f85880g = context;
        this.f85878e = oTPublishersHeadlessSDK;
        this.f85874a = aVar;
        this.f85882w = z;
        this.f85883x = oTVendorUtils;
        this.f85885z = hVar;
        oTVendorUtils.refreshList(OTVendorListMode.GOOGLE);
        oTVendorUtils.setVendorsListObject(OTVendorListMode.GOOGLE, mo105125z(), false);
        this.f85875b = oTConfiguration;
    }

    /* renamed from: C */
    public static void m144741C(@C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(string);
            if (jSONObject3.getString("name").toLowerCase(Locale.ENGLISH).contains(str)) {
                jSONObject.put(string, jSONObject3);
            }
        }
    }

    /* renamed from: o */
    public static void m144745o(View view, @C0359n0 String str) {
        if (!C35020d.m143605J(str)) {
            view.setBackgroundColor(Color.parseColor(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m144747x(JSONObject jSONObject, C35141b bVar, CompoundButton compoundButton, boolean z) {
        try {
            String string = jSONObject.getString("id");
            this.f85878e.updateVendorConsent(OTVendorListMode.GOOGLE, string, z);
            C34963b bVar2 = new C34963b(15);
            bVar2.mo103581c(string);
            bVar2.mo103580b(z ? 1 : 0);
            new UIUtils().mo104267E(bVar2, this.f85874a);
            bVar2.mo103585g(OTVendorListMode.GOOGLE);
            new UIUtils().mo104267E(bVar2, this.f85874a);
            if (z) {
                mo105109A(bVar.f85888b);
                this.f85883x.updateSelectAllButtonStatus(OTVendorListMode.GOOGLE);
                return;
            }
            this.f85877d.onItemClick(OTVendorListMode.GOOGLE, false);
            mo105118q(bVar.f85888b);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "onCheckedChanged: " + e.getMessage());
        }
    }

    /* renamed from: A */
    public final void mo105109A(@C0359n0 SwitchCompat switchCompat) {
        new UIUtils().mo104280s(this.f85880g, switchCompat, this.f85871X, this.f85872Y);
    }

    /* renamed from: D */
    public void mo105110D(boolean z) {
        OTLogger.m143458m("OneTrust", "dataFilter ? = " + z);
        this.f85881v = z;
    }

    /* renamed from: E */
    public void mo105111E(boolean z) {
        this.f85878e.updateAllVendorsConsentLocal(OTVendorListMode.GOOGLE, z);
        if (this.f85881v) {
            getFilter().filter(this.f85879f);
        } else {
            mo105113G();
        }
    }

    /* renamed from: F */
    public final boolean mo105112F() {
        return this.f85882w;
    }

    /* renamed from: G */
    public final void mo105113G() {
        this.f85883x.setVendorsListObject(OTVendorListMode.GOOGLE, mo105125z(), true);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo105114a() {
        if (this.f85881v) {
            getFilter().filter(this.f85879f);
            return;
        }
        this.f85883x.updateSelectAllButtonStatus(OTVendorListMode.GOOGLE);
        notifyDataSetChanged();
    }

    public Filter getFilter() {
        return new C35140a();
    }

    public int getItemCount() {
        return this.f85883x.getVendorsListObject(OTVendorListMode.GOOGLE).length();
    }

    @C0359n0
    /* renamed from: l */
    public C35141b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35141b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_google_vendor_list_item, viewGroup, false));
    }

    /* renamed from: p */
    public final void mo105117p(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f85875b);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        if (!C35020d.m143605J(b0Var.mo104667k())) {
            textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: q */
    public final void mo105118q(@C0359n0 SwitchCompat switchCompat) {
        new UIUtils().mo104280s(this.f85880g, switchCompat, this.f85871X, this.f85873Z);
    }

    /* renamed from: r */
    public void mo105119r(@C0359n0 OTVendorUtils oTVendorUtils) {
        OTLogger.m143447b("OneTrust", "OT Google vendor list item count = " + oTVendorUtils.getVendorsListObject(OTVendorListMode.GOOGLE).length());
        oTVendorUtils.setSelectAllButtonListener(this.f85877d);
        oTVendorUtils.updateSelectAllButtonStatus(OTVendorListMode.GOOGLE);
    }

    /* renamed from: s */
    public final void mo105120s(@C0359n0 C35141b bVar) {
        C35263h hVar = this.f85885z;
        if (hVar != null) {
            this.f85871X = hVar.mo105628v();
            this.f85872Y = this.f85885z.mo105627u();
            this.f85873Z = this.f85885z.mo105626t();
            mo105117p(bVar.f85887a, this.f85885z.mo105630x());
            if (!C35020d.m143605J(this.f85885z.mo105619m())) {
                m144745o(bVar.f85889c, this.f85885z.mo105619m());
            }
            bVar.f85888b.setContentDescription(this.f85885z.mo105618l());
        }
    }

    /* renamed from: t */
    public void onBindViewHolder(@C0359n0 C35141b bVar, int i) {
        OTLogger.m143447b("OneTrust", "On bind called, isDataFiltered? = " + this.f85881v + " is purpose filter? = " + mo105112F());
        JSONObject vendorsListObject = this.f85883x.getVendorsListObject(OTVendorListMode.GOOGLE);
        this.f85876c = vendorsListObject;
        JSONArray names = vendorsListObject.names();
        if (names != null) {
            try {
                bVar.setIsRecyclable(false);
                mo105120s(bVar);
                JSONObject jSONObject = this.f85876c.getJSONObject((String) names.get(bVar.getAdapterPosition()));
                bVar.f85887a.setText(jSONObject.getString("name"));
                if (jSONObject.getInt(OTVendorUtils.CONSENT_TYPE) == 1) {
                    bVar.f85888b.setChecked(true);
                    mo105109A(bVar.f85888b);
                } else {
                    bVar.f85888b.setChecked(false);
                    mo105118q(bVar.f85888b);
                }
                mo105122u(bVar, jSONObject);
            } catch (JSONException e) {
                OTLogger.m143458m("OneTrust", "error while toggling vendor " + e.getMessage());
            }
        }
    }

    /* renamed from: u */
    public final void mo105122u(@C0359n0 C35141b bVar, @C0359n0 JSONObject jSONObject) {
        bVar.f85888b.setOnCheckedChangeListener(new C35136d(this, jSONObject, bVar));
    }

    /* renamed from: v */
    public final void mo105123v(@C0359n0 String str) {
        try {
            this.f85883x.setVendorsListObject(OTVendorListMode.GOOGLE, new JSONObject(str), true);
            if (!this.f85884y) {
                notifyDataSetChanged();
            } else {
                mo105124y(false);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OneTrust", "error while searching vendor " + e.getMessage());
        }
    }

    /* renamed from: y */
    public void mo105124y(boolean z) {
        this.f85884y = z;
    }

    @C0359n0
    /* renamed from: z */
    public final JSONObject mo105125z() {
        JSONObject jSONObject = new JSONObject();
        JSONObject vendorListUI = this.f85878e.getVendorListUI(OTVendorListMode.GOOGLE);
        return vendorListUI != null ? vendorListUI : jSONObject;
    }
}
