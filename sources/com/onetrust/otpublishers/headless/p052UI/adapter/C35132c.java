package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35012b;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35227n;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35263h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.c */
public class C35132c extends RecyclerView.Adapter<C35134b> implements C35227n.C35228a, Filterable {

    /* renamed from: E0 */
    public boolean f85833E0;

    /* renamed from: F0 */
    public Map<String, String> f85834F0;

    /* renamed from: G0 */
    public C34962a f85835G0;

    /* renamed from: X */
    public String f85836X;

    /* renamed from: Y */
    public boolean f85837Y;

    /* renamed from: Z */
    public boolean f85838Z;

    /* renamed from: a */
    public Context f85839a;

    /* renamed from: b */
    public boolean f85840b;

    /* renamed from: c */
    public JSONObject f85841c = mo105086C();

    /* renamed from: d */
    public C35263h f85842d;

    /* renamed from: e */
    public String f85843e;

    /* renamed from: f */
    public String f85844f;

    /* renamed from: g */
    public String f85845g;

    /* renamed from: v */
    public OTConfiguration f85846v;

    /* renamed from: w */
    public OTPublishersHeadlessSDK f85847w;

    /* renamed from: x */
    public OTVendorUtils.ItemListener f85848x;

    /* renamed from: y */
    public OTVendorUtils f85849y;

    /* renamed from: z */
    public C35227n f85850z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.c$a */
    public class C35133a extends Filter {
        public C35133a() {
        }

        /* renamed from: a */
        public final void mo105102a(String str, JSONObject jSONObject, JSONObject jSONObject2, Filter.FilterResults filterResults) {
            try {
                JSONArray names = jSONObject2.names();
                if (str.isEmpty() || names == null) {
                    filterResults.values = jSONObject2;
                    return;
                }
                C35132c.m144700G(str, jSONObject, jSONObject2, names);
                filterResults.values = jSONObject;
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while performing filtering of vendor " + e.getMessage());
            }
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            String unused = C35132c.this.f85836X = charSequence2;
            String lowerCase = charSequence2.toLowerCase(Locale.ENGLISH);
            JSONObject jSONObject = new JSONObject();
            JSONObject o = C35132c.this.mo105086C();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            mo105102a(lowerCase, jSONObject, o, filterResults);
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C35132c.this.mo105100w(filterResults.values.toString());
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.c$b */
    public static class C35134b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final TextView f85852a;

        /* renamed from: b */
        public final SwitchCompat f85853b;

        /* renamed from: c */
        public final View f85854c;

        /* renamed from: d */
        public final ImageView f85855d;

        public C35134b(View view) {
            super(view);
            this.f85852a = (TextView) view.findViewById(C35265a.C35273h.vendor_name);
            this.f85853b = (SwitchCompat) view.findViewById(C35265a.C35273h.switchButton);
            this.f85854c = view.findViewById(C35265a.C35273h.view3);
            this.f85855d = (ImageView) view.findViewById(C35265a.C35273h.gv_show_more);
        }
    }

    public C35132c(@C0359n0 OTVendorUtils.ItemListener itemListener, @C0359n0 Context context, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 OTVendorUtils oTVendorUtils, @C0359n0 C35263h hVar, @C0359n0 OTConfiguration oTConfiguration, @C0359n0 C34962a aVar, boolean z, Map<String, String> map) {
        new HashMap();
        this.f85839a = context;
        this.f85842d = hVar;
        this.f85846v = oTConfiguration;
        this.f85848x = itemListener;
        this.f85847w = oTPublishersHeadlessSDK;
        this.f85849y = oTVendorUtils;
        this.f85833E0 = z;
        this.f85834F0 = map;
        this.f85835G0 = aVar;
        this.f85850z = C35227n.m145234Q0(OTFragmentTags.OT_GENERAL_VENDOR_DETAILS_TAG, oTConfiguration);
        oTVendorUtils.refreshList(OTVendorListMode.GENERAL);
        oTVendorUtils.setVendorsListObject(OTVendorListMode.GENERAL, mo105086C(), false);
        this.f85850z.mo105430X0(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m144698A(JSONObject jSONObject, SwitchCompat switchCompat, CompoundButton compoundButton, boolean z) {
        try {
            String string = jSONObject.getString("VendorCustomId");
            this.f85847w.updateVendorConsent(OTVendorListMode.GENERAL, string, z);
            C34963b bVar = new C34963b(15);
            bVar.mo103581c(string);
            bVar.mo103580b(z ? 1 : 0);
            bVar.mo103585g(OTVendorListMode.GENERAL);
            new UIUtils().mo104267E(bVar, this.f85835G0);
            if (z) {
                mo105087D(switchCompat);
                this.f85849y.updateSelectAllButtonStatus(OTVendorListMode.GENERAL);
                return;
            }
            this.f85848x.onItemClick(OTVendorListMode.GENERAL, false);
            mo105095r(switchCompat);
        } catch (JSONException e) {
            OTLogger.m143457l("GeneralVendors", "onCheckedChanged: " + e.getMessage());
        }
    }

    /* renamed from: G */
    public static void m144700G(@C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(string);
            if (jSONObject3.getString(C13758b.f33475u0).toLowerCase(Locale.ENGLISH).contains(str)) {
                jSONObject.put(string, jSONObject3);
            }
        }
    }

    /* renamed from: p */
    public static void m144705p(View view, @C0359n0 String str) {
        if (!C35020d.m143605J(str)) {
            view.setBackgroundColor(Color.parseColor(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m144706x(String str, View view) {
        if (!this.f85850z.isAdded()) {
            Bundle bundle = new Bundle();
            bundle.putString("vendorId", str);
            this.f85850z.setArguments(bundle);
            this.f85850z.mo105429W0(this.f85847w);
            this.f85850z.mo105427U0(this.f85835G0);
            this.f85850z.show(((C19232h) this.f85839a).mo57175g0(), OTFragmentTags.OT_GENERAL_VENDOR_DETAILS_TAG);
        }
    }

    /* renamed from: B */
    public void mo105085B(boolean z) {
        this.f85838Z = z;
    }

    /* renamed from: C */
    public final JSONObject mo105086C() {
        this.f85840b = new C35015e(this.f85839a).f85172b.mo103963h();
        if (!this.f85833E0) {
            return this.f85847w.getVendorListUI(OTVendorListMode.GENERAL);
        }
        JSONObject b = C35012b.m143531b(this.f85834F0, this.f85847w.getVendorListUI(OTVendorListMode.GENERAL));
        OTLogger.m143447b("GeneralVendors", "Total vendors count with filtered purpose : " + b.length());
        return b;
    }

    @C0376v0(api = 21)
    /* renamed from: D */
    public final void mo105087D(@C0359n0 SwitchCompat switchCompat) {
        int i;
        Drawable drawable;
        if (!C35020d.m143605J(this.f85843e)) {
            drawable = switchCompat.getTrackDrawable();
            i = Color.parseColor(this.f85843e);
        } else {
            drawable = switchCompat.getTrackDrawable();
            i = C17318d.m79723f(this.f85839a, C35265a.C35270e.light_greyOT);
        }
        drawable.setTint(i);
        switchCompat.getThumbDrawable().setTint(!C35020d.m143605J(this.f85844f) ? Color.parseColor(this.f85844f) : C17318d.m79723f(this.f85839a, C35265a.C35270e.colorPrimaryOT));
    }

    @C0376v0(api = 21)
    /* renamed from: E */
    public final void mo105088E(@C0359n0 SwitchCompat switchCompat, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.getInt(OTVendorUtils.CONSENT_TYPE) == 1) {
            switchCompat.setChecked(true);
            mo105087D(switchCompat);
            return;
        }
        switchCompat.setChecked(false);
        mo105095r(switchCompat);
    }

    /* renamed from: H */
    public void mo105089H(boolean z) {
        OTLogger.m143458m("OneTrust", "dataFilter ? = " + z);
        this.f85837Y = z;
    }

    /* renamed from: I */
    public void mo105090I(boolean z) {
        this.f85847w.updateAllVendorsConsentLocal(OTVendorListMode.GENERAL, z);
        if (this.f85837Y) {
            getFilter().filter(this.f85836X);
            return;
        }
        this.f85849y.setVendorsListObject(OTVendorListMode.GENERAL, mo105086C(), true);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo105091a() {
        if (this.f85837Y) {
            getFilter().filter(this.f85836X);
        } else {
            this.f85849y.setVendorsListObject(OTVendorListMode.GENERAL, mo105086C(), true);
            this.f85849y.updateSelectAllButtonStatus(OTVendorListMode.GENERAL);
            notifyDataSetChanged();
        }
        OTLogger.m143447b("GeneralVendors", "Back clicked from General Vendor detail");
    }

    public Filter getFilter() {
        return new C35133a();
    }

    public int getItemCount() {
        return this.f85849y.getVendorsListObject(OTVendorListMode.GENERAL).length();
    }

    @C0359n0
    /* renamed from: m */
    public C35134b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35134b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_google_vendor_list_item, viewGroup, false));
    }

    /* renamed from: q */
    public final void mo105094q(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f85846v);
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

    @C0376v0(api = 21)
    /* renamed from: r */
    public final void mo105095r(@C0359n0 SwitchCompat switchCompat) {
        int i;
        Drawable drawable;
        if (!C35020d.m143605J(this.f85843e)) {
            drawable = switchCompat.getTrackDrawable();
            i = Color.parseColor(this.f85843e);
        } else {
            drawable = switchCompat.getTrackDrawable();
            i = C17318d.m79723f(this.f85839a, C35265a.C35270e.light_greyOT);
        }
        drawable.setTint(i);
        switchCompat.getThumbDrawable().setTint(!C35020d.m143605J(this.f85845g) ? Color.parseColor(this.f85845g) : C17318d.m79723f(this.f85839a, C35265a.C35270e.contentTextColorOT));
    }

    @C0376v0(api = 21)
    /* renamed from: s */
    public final void mo105096s(@C0359n0 SwitchCompat switchCompat, @C0359n0 JSONObject jSONObject) {
        switchCompat.setOnCheckedChangeListener(new C35130b(this, jSONObject, switchCompat));
    }

    /* renamed from: t */
    public void mo105097t(@C0359n0 OTVendorUtils oTVendorUtils) {
        oTVendorUtils.setSelectAllButtonListener(this.f85848x);
        oTVendorUtils.updateSelectAllButtonStatus(OTVendorListMode.GENERAL);
    }

    /* renamed from: u */
    public final void mo105098u(@C0359n0 C35134b bVar) {
        C35263h hVar = this.f85842d;
        if (hVar != null) {
            this.f85843e = hVar.mo105628v();
            this.f85844f = this.f85842d.mo105627u();
            this.f85845g = this.f85842d.mo105626t();
            mo105094q(bVar.f85852a, this.f85842d.mo105630x());
            if (!C35020d.m143605J(this.f85842d.mo105619m())) {
                m144705p(bVar.f85854c, this.f85842d.mo105619m());
            }
            bVar.f85853b.setContentDescription(this.f85842d.mo105618l());
        }
    }

    @C0376v0(api = 21)
    /* renamed from: v */
    public void onBindViewHolder(@C0359n0 C35134b bVar, int i) {
        JSONObject vendorsListObject = this.f85849y.getVendorsListObject(OTVendorListMode.GENERAL);
        this.f85841c = vendorsListObject;
        JSONArray names = vendorsListObject.names();
        if (names != null) {
            try {
                bVar.setIsRecyclable(false);
                String string = names.getString(bVar.getAdapterPosition());
                mo105098u(bVar);
                JSONObject jSONObject = this.f85841c.getJSONObject(string);
                bVar.f85852a.setText(jSONObject.getString(C13758b.f33475u0));
                bVar.f85855d.setVisibility(0);
                bVar.f85855d.setColorFilter(Color.parseColor(this.f85842d.mo105624r()));
                if (!this.f85840b) {
                    bVar.f85853b.setVisibility(8);
                } else {
                    mo105088E(bVar.f85853b, jSONObject);
                }
                mo105096s(bVar.f85853b, jSONObject);
                bVar.itemView.setOnClickListener(new C35128a(this, string));
            } catch (JSONException e) {
                OTLogger.m143457l("GeneralVendors", "error while toggling vendor " + e.getMessage());
            }
        }
    }

    /* renamed from: w */
    public final void mo105100w(@C0359n0 String str) {
        try {
            this.f85849y.setVendorsListObject(OTVendorListMode.GENERAL, new JSONObject(str), true);
            if (!this.f85838Z) {
                notifyDataSetChanged();
            } else {
                mo105085B(false);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OneTrust", "error while searching vendor " + e.getMessage());
        }
    }

    /* renamed from: z */
    public void mo105101z(@C0359n0 Map<String, String> map) {
        if (map.size() > 0) {
            this.f85833E0 = true;
            this.f85834F0.clear();
            this.f85834F0.putAll(map);
            OTLogger.m143447b("OneTrust", "Purposes passed in filter , filter size : " + map.size());
        } else {
            this.f85834F0.clear();
            this.f85833E0 = false;
        }
        this.f85849y.setVendorsListObject(OTVendorListMode.GENERAL, mo105086C(), true ^ this.f85837Y);
        if (!this.f85837Y) {
            notifyDataSetChanged();
        } else {
            getFilter().filter(this.f85836X);
        }
    }
}
