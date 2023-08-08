package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
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

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.k0 */
public class C35157k0 extends RecyclerView.Adapter<C35159b> implements C35206f1.C35208b, Filterable {

    /* renamed from: E0 */
    public C35263h f85950E0;

    /* renamed from: F0 */
    public String f85951F0;

    /* renamed from: G0 */
    public String f85952G0;

    /* renamed from: H0 */
    public String f85953H0;

    /* renamed from: X */
    public Map<String, String> f85954X;

    /* renamed from: Y */
    public OTVendorUtils f85955Y;

    /* renamed from: Z */
    public boolean f85956Z;

    /* renamed from: a */
    public final C34962a f85957a;

    /* renamed from: b */
    public final OTConfiguration f85958b;

    /* renamed from: c */
    public final UIUtils f85959c;

    /* renamed from: d */
    public JSONObject f85960d;

    /* renamed from: e */
    public OTVendorUtils.ItemListener f85961e;

    /* renamed from: f */
    public OTPublishersHeadlessSDK f85962f;

    /* renamed from: g */
    public String f85963g = "";

    /* renamed from: v */
    public C35206f1 f85964v;

    /* renamed from: w */
    public Context f85965w;

    /* renamed from: x */
    public FragmentManager f85966x;

    /* renamed from: y */
    public boolean f85967y;

    /* renamed from: z */
    public boolean f85968z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.k0$a */
    public class C35158a extends Filter {
        public C35158a() {
        }

        /* renamed from: a */
        public final void mo105165a(String str, JSONObject jSONObject, JSONObject jSONObject2, Filter.FilterResults filterResults, JSONArray jSONArray) {
            if (str.isEmpty() || jSONArray == null) {
                filterResults.values = jSONObject2;
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(string);
                if (jSONObject3.getString("name").toLowerCase(Locale.ENGLISH).contains(str)) {
                    jSONObject.put(string, jSONObject3);
                }
            }
            filterResults.values = jSONObject;
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            String unused = C35157k0.this.f85963g = charSequence2;
            String lowerCase = charSequence2.toLowerCase(Locale.ENGLISH);
            JSONObject jSONObject = new JSONObject();
            JSONObject o = C35157k0.this.mo105148E();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            try {
                mo105165a(lowerCase, jSONObject, o, filterResults, o.names());
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while performing filtering of  vendor " + e.getMessage());
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                C35157k0.this.f85955Y.setVendorsListObject(OTVendorListMode.IAB, new JSONObject(filterResults.values.toString()), true);
                if (!C35157k0.this.f85956Z) {
                    C35157k0.this.notifyDataSetChanged();
                } else {
                    C35157k0.this.mo105147C(false);
                }
            } catch (Exception e) {
                OTLogger.m143457l("OneTrust", "error while searching vendor " + e.getMessage());
            }
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.k0$b */
    public static class C35159b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85970a;

        /* renamed from: b */
        public RelativeLayout f85971b;

        /* renamed from: c */
        public SwitchCompat f85972c;

        /* renamed from: d */
        public SwitchCompat f85973d;

        /* renamed from: e */
        public ImageView f85974e;

        /* renamed from: f */
        public View f85975f;

        public C35159b(View view) {
            super(view);
            this.f85970a = (TextView) view.findViewById(C35265a.C35273h.vendor_name);
            this.f85972c = (SwitchCompat) view.findViewById(C35265a.C35273h.switchButton);
            this.f85974e = (ImageView) view.findViewById(C35265a.C35273h.show_more);
            this.f85973d = (SwitchCompat) view.findViewById(C35265a.C35273h.legit_int_switchButton);
            this.f85975f = view.findViewById(C35265a.C35273h.view3);
            this.f85971b = (RelativeLayout) view.findViewById(C35265a.C35273h.vl_items);
        }
    }

    public C35157k0(@C0359n0 OTVendorUtils.ItemListener itemListener, @C0359n0 Context context, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 C34962a aVar, @C0363p0 FragmentManager fragmentManager, boolean z, Map<String, String> map, @C0359n0 OTVendorUtils oTVendorUtils, @C0359n0 C35263h hVar, @C0359n0 OTConfiguration oTConfiguration) {
        this.f85961e = itemListener;
        this.f85965w = context;
        this.f85962f = oTPublishersHeadlessSDK;
        this.f85964v = C35206f1.m145115U0(OTFragmentTags.OT_VENDOR_DETAILS_FRAGMENT_TAG, oTConfiguration);
        this.f85957a = aVar;
        this.f85966x = fragmentManager;
        this.f85954X = map;
        this.f85968z = z;
        this.f85955Y = oTVendorUtils;
        this.f85950E0 = hVar;
        oTVendorUtils.refreshList(OTVendorListMode.IAB);
        oTVendorUtils.setVendorsListObject(OTVendorListMode.IAB, mo105148E(), false);
        this.f85958b = oTConfiguration;
        this.f85964v.mo105341b1(this);
        this.f85959c = new UIUtils();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m144794A(String str, View view) {
        mo105164z(str);
    }

    /* renamed from: p */
    public static void m144801p(View view, @C0359n0 String str) {
        if (!C35020d.m143605J(str)) {
            view.setBackgroundColor(Color.parseColor(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m144802w(C35159b bVar, String str, CompoundButton compoundButton, boolean z) {
        mo105162x(bVar, str, z);
    }

    /* renamed from: B */
    public void mo105146B(@C0359n0 Map<String, String> map) {
        if (map.size() > 0) {
            this.f85968z = true;
            this.f85954X.clear();
            this.f85954X.putAll(map);
            OTLogger.m143447b("OneTrust", "Purposes passed in filter , filter size : " + map.size());
        } else {
            this.f85954X.clear();
            this.f85968z = false;
        }
        this.f85955Y.setVendorsListObject(OTVendorListMode.IAB, mo105148E(), true ^ this.f85967y);
        if (!this.f85967y) {
            notifyDataSetChanged();
        } else {
            getFilter().filter(this.f85963g);
        }
    }

    /* renamed from: C */
    public void mo105147C(boolean z) {
        this.f85956Z = z;
    }

    @C0359n0
    /* renamed from: E */
    public final JSONObject mo105148E() {
        StringBuilder sb;
        String str;
        JSONObject jSONObject = new JSONObject();
        if (this.f85968z) {
            jSONObject = this.f85955Y.getVendorsByPurpose(this.f85954X, this.f85962f.getVendorListUI(OTVendorListMode.IAB));
            sb = new StringBuilder();
            str = "Total vendors count with filtered purpose : ";
        } else {
            JSONObject vendorListUI = this.f85962f.getVendorListUI(OTVendorListMode.IAB);
            if (vendorListUI != null) {
                jSONObject = vendorListUI;
            }
            sb = new StringBuilder();
            str = "Total IAB vendors count without filter : ";
        }
        sb.append(str);
        sb.append(jSONObject.length());
        OTLogger.m143447b("ContentValues", sb.toString());
        return jSONObject;
    }

    /* renamed from: F */
    public final void mo105149F(@C0359n0 SwitchCompat switchCompat) {
        new UIUtils().mo104280s(this.f85965w, switchCompat, this.f85951F0, this.f85952G0);
    }

    /* renamed from: G */
    public void mo105150G(boolean z) {
        OTLogger.m143458m("OneTrust", "dataFilter ? = " + z);
        this.f85967y = z;
    }

    /* renamed from: H */
    public void mo105151H(boolean z) {
        this.f85962f.updateAllVendorsConsentLocal(OTVendorListMode.IAB, z);
        if (this.f85967y) {
            getFilter().filter(this.f85963g);
        } else {
            mo105153K();
        }
    }

    /* renamed from: I */
    public final boolean mo105152I() {
        return this.f85968z;
    }

    /* renamed from: K */
    public final void mo105153K() {
        this.f85955Y.setVendorsListObject(OTVendorListMode.IAB, mo105148E(), true);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo105114a() {
        if (this.f85967y) {
            getFilter().filter(this.f85963g);
            return;
        }
        this.f85955Y.updateSelectAllButtonStatus(OTVendorListMode.IAB);
        notifyDataSetChanged();
    }

    public Filter getFilter() {
        return new C35158a();
    }

    public int getItemCount() {
        return this.f85955Y.getVendorsListObject(OTVendorListMode.IAB).length();
    }

    @C0359n0
    /* renamed from: m */
    public C35159b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35159b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_vendors_list_item, viewGroup, false));
    }

    /* renamed from: q */
    public final void mo105156q(@C0359n0 ImageView imageView, @C0359n0 String str) {
        try {
            if (!C35020d.m143605J(str)) {
                this.f85959c.mo104269K(imageView, str);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OneTrust", "Error in applying tint to VL Disclosure icon, err: " + e.getMessage());
        }
    }

    /* renamed from: r */
    public final void mo105157r(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        C35110j a = b0Var.mo104657a();
        this.f85959c.mo104264A(textView, a, this.f85958b);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: s */
    public final void mo105158s(@C0359n0 SwitchCompat switchCompat) {
        new UIUtils().mo104280s(this.f85965w, switchCompat, this.f85951F0, this.f85953H0);
    }

    /* renamed from: t */
    public void mo105159t(@C0359n0 OTVendorUtils oTVendorUtils) {
        OTLogger.m143447b("OneTrust", "OT IAB vendor list item count = " + oTVendorUtils.getVendorsListObject(OTVendorListMode.IAB).length());
        oTVendorUtils.setSelectAllButtonListener(this.f85961e);
        oTVendorUtils.updateSelectAllButtonStatus(OTVendorListMode.IAB);
    }

    /* renamed from: u */
    public final void mo105160u(@C0359n0 C35159b bVar) {
        C35263h hVar = this.f85950E0;
        if (hVar != null) {
            this.f85951F0 = hVar.mo105628v();
            this.f85952G0 = this.f85950E0.mo105627u();
            this.f85953H0 = this.f85950E0.mo105626t();
            String r = !C35020d.m143605J(this.f85950E0.mo105624r()) ? this.f85950E0.mo105624r() : "";
            mo105157r(bVar.f85970a, this.f85950E0.mo105630x());
            mo105156q(bVar.f85974e, r);
            if (!C35020d.m143605J(this.f85950E0.mo105619m())) {
                m144801p(bVar.f85975f, this.f85950E0.mo105619m());
            }
        }
    }

    /* renamed from: v */
    public void onBindViewHolder(@C0359n0 C35159b bVar, int i) {
        OTLogger.m143447b("OneTrust", "On bind called, isDataFiltered? = " + this.f85967y + " is purpose filter? = " + mo105152I());
        JSONObject vendorsListObject = this.f85955Y.getVendorsListObject(OTVendorListMode.IAB);
        this.f85960d = vendorsListObject;
        JSONArray names = vendorsListObject.names();
        if (names != null) {
            mo105163y(bVar, names);
        }
    }

    /* renamed from: x */
    public final void mo105162x(@C0359n0 C35159b bVar, @C0359n0 String str, boolean z) {
        try {
            String string = this.f85960d.getJSONObject(str).getString("id");
            this.f85962f.updateVendorConsent(OTVendorListMode.IAB, string, z);
            C34963b bVar2 = new C34963b(15);
            bVar2.mo103581c(string);
            bVar2.mo103580b(z ? 1 : 0);
            this.f85959c.mo104267E(bVar2, this.f85957a);
            bVar2.mo103585g(OTVendorListMode.IAB);
            this.f85959c.mo104267E(bVar2, this.f85957a);
            if (z) {
                mo105149F(bVar.f85972c);
                this.f85955Y.updateSelectAllButtonStatus(OTVendorListMode.IAB);
                return;
            }
            this.f85961e.onItemClick(OTVendorListMode.IAB, false);
            mo105158s(bVar.f85972c);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "onCheckedChanged: " + e.getMessage());
        }
    }

    /* renamed from: y */
    public final void mo105163y(@C0359n0 C35159b bVar, JSONArray jSONArray) {
        try {
            bVar.setIsRecyclable(false);
            String str = (String) jSONArray.get(bVar.getAdapterPosition());
            mo105160u(bVar);
            bVar.f85970a.setText(this.f85960d.getJSONObject(str).getString("name"));
            if (this.f85960d.getJSONObject(str).getInt(OTVendorUtils.CONSENT_TYPE) == 1) {
                bVar.f85972c.setChecked(true);
                mo105149F(bVar.f85972c);
            } else if (this.f85960d.getJSONObject(str).getInt(OTVendorUtils.CONSENT_TYPE) == 0) {
                bVar.f85972c.setChecked(false);
                mo105158s(bVar.f85972c);
            } else if (this.f85960d.getJSONObject(str).getInt(OTVendorUtils.CONSENT_TYPE) == -1) {
                bVar.f85972c.setVisibility(8);
            }
            bVar.f85973d.setVisibility(8);
            bVar.f85972c.setOnCheckedChangeListener(new C35153i0(this, bVar, str));
            bVar.f85972c.setContentDescription(this.f85950E0.mo105618l());
            this.f85964v.mo105341b1(this);
            bVar.f85971b.setOnClickListener(new C35155j0(this, str));
        } catch (JSONException e) {
            OTLogger.m143458m("OneTrust", "error while toggling vendor " + e.getMessage());
        }
    }

    /* renamed from: z */
    public final void mo105164z(@C0359n0 String str) {
        try {
            if (this.f85966x != null && !this.f85964v.isAdded()) {
                String string = this.f85960d.getJSONObject(str).getString("id");
                if (this.f85962f.getVendorDetails(OTVendorListMode.IAB, string) == null) {
                    this.f85962f.reInitVendorArray();
                }
                this.f85964v.mo105339a1(this.f85962f);
                this.f85964v.mo105336Y0(this.f85957a);
                Bundle bundle = new Bundle();
                bundle.putString("vendorId", string);
                this.f85964v.setArguments(bundle);
                this.f85964v.show(this.f85966x, OTFragmentTags.OT_VENDOR_DETAILS_FRAGMENT_TAG);
            }
        } catch (JSONException e) {
            OTLogger.m143458m("OneTrust", "error while navigating to vendor detail " + e.getMessage());
        }
    }
}
