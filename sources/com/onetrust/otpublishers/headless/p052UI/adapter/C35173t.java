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
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34967b0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34970d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35122v;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35261f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.t */
public class C35173t extends RecyclerView.Adapter<C35177d> implements Filterable {

    /* renamed from: E0 */
    public String f86051E0;

    /* renamed from: F0 */
    public String f86052F0;

    /* renamed from: G0 */
    public String f86053G0;

    /* renamed from: H0 */
    public String f86054H0;

    /* renamed from: I0 */
    public String f86055I0;

    /* renamed from: J0 */
    public String f86056J0;

    /* renamed from: K0 */
    public JSONArray f86057K0 = new JSONArray();

    /* renamed from: L0 */
    public JSONObject f86058L0 = new JSONObject();

    /* renamed from: M0 */
    public C35176c f86059M0;

    /* renamed from: X */
    public JSONArray f86060X = new JSONArray();

    /* renamed from: Y */
    public C35122v f86061Y;

    /* renamed from: Z */
    public C35261f f86062Z;

    /* renamed from: a */
    public final OTConfiguration f86063a;

    /* renamed from: b */
    public JSONArray f86064b;

    /* renamed from: c */
    public JSONArray f86065c;

    /* renamed from: d */
    public OTPublishersHeadlessSDK f86066d;

    /* renamed from: e */
    public String f86067e;

    /* renamed from: f */
    public String f86068f;

    /* renamed from: g */
    public Context f86069g;

    /* renamed from: v */
    public int f86070v;

    /* renamed from: w */
    public boolean f86071w;

    /* renamed from: x */
    public boolean f86072x;

    /* renamed from: y */
    public List<String> f86073y = new ArrayList();

    /* renamed from: z */
    public List<String> f86074z = new ArrayList();

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.t$a */
    public class C35174a extends Filter {
        public C35174a() {
        }

        /* renamed from: a */
        public final void mo105219a(@C0359n0 String str, @C0359n0 List<JSONObject> list) {
            try {
                C35173t.m144905A(str, list, C35173t.this.mo105208D());
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while filtering sdk list " + e.getMessage());
            }
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            String unused = C35173t.this.f86068f = charSequence2;
            String lowerCase = charSequence2.toLowerCase(Locale.ENGLISH);
            ArrayList arrayList = new ArrayList();
            mo105219a(lowerCase, arrayList);
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                JSONArray unused = C35173t.this.f86065c = new JSONArray(filterResults.values.toString());
                C35173t.this.notifyDataSetChanged();
                C35173t tVar = C35173t.this;
                tVar.mo105206B(tVar.f86065c);
            } catch (Exception e) {
                OTLogger.m143457l("OneTrust", "error while searching sdk " + e.getMessage());
            }
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.t$b */
    public interface C35175b {
        /* renamed from: a */
        void mo105222a();
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.t$c */
    public interface C35176c {
        /* renamed from: j */
        void mo105223j(boolean z);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.t$d */
    public static class C35177d extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f86076a;

        /* renamed from: b */
        public TextView f86077b;

        /* renamed from: c */
        public TextView f86078c;

        /* renamed from: d */
        public SwitchCompat f86079d;

        /* renamed from: e */
        public SwitchCompat f86080e;

        /* renamed from: f */
        public View f86081f;

        public C35177d(View view) {
            super(view);
            this.f86076a = (TextView) view.findViewById(C35265a.C35273h.sdk_name);
            this.f86077b = (TextView) view.findViewById(C35265a.C35273h.sdk_description);
            this.f86079d = (SwitchCompat) view.findViewById(C35265a.C35273h.switchButton);
            this.f86080e = (SwitchCompat) view.findViewById(C35265a.C35273h.legit_int_switchButton);
            this.f86081f = view.findViewById(C35265a.C35273h.view3);
            this.f86078c = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveTextSdk);
        }
    }

    public C35173t(@C0359n0 C35176c cVar, @C0359n0 Context context, @C0359n0 String str, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 List<String> list, boolean z, @C0363p0 C35122v vVar, @C0359n0 C35261f fVar, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4) {
        this.f86059M0 = cVar;
        this.f86069g = context;
        this.f86067e = str;
        this.f86066d = oTPublishersHeadlessSDK;
        this.f86068f = "";
        this.f86073y = list;
        this.f86065c = mo105208D();
        this.f86072x = z;
        this.f86061Y = vVar;
        this.f86062Z = fVar;
        this.f86063a = oTConfiguration;
        this.f86051E0 = fVar.mo105602n();
        this.f86052F0 = fVar.mo105601m();
        this.f86053G0 = fVar.mo105600l();
        this.f86054H0 = str2;
        this.f86055I0 = str3;
        this.f86056J0 = str4;
    }

    /* renamed from: A */
    public static void m144905A(@C0359n0 String str, @C0359n0 List<JSONObject> list, JSONArray jSONArray) {
        int i = 0;
        if (!str.isEmpty()) {
            while (i < jSONArray.length()) {
                if (jSONArray.getJSONObject(i).getString(C13758b.f33475u0).toLowerCase(Locale.ENGLISH).contains(str)) {
                    list.add(jSONArray.getJSONObject(i));
                }
                i++;
            }
            return;
        }
        while (i < jSONArray.length()) {
            list.add(jSONArray.getJSONObject(i));
            i++;
        }
    }

    /* renamed from: p */
    public static void m144910p(View view, @C0363p0 String str) {
        if (!C35020d.m143605J(str)) {
            view.setBackgroundColor(Color.parseColor(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m144911s(C35177d dVar, CompoundButton compoundButton, boolean z) {
        UIUtils uIUtils;
        try {
            this.f86066d.updateSDKConsentStatus(this.f86064b.getJSONObject(dVar.getAdapterPosition()).getString("SdkId"), z);
            String string = this.f86064b.getJSONObject(dVar.getAdapterPosition()).getString("SdkId");
            this.f86057K0.put(string);
            String d = new C34967b0(this.f86069g).mo103636d(string);
            if (d != null) {
                this.f86058L0.put(d, this.f86057K0);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while updating SDK status " + e.getMessage());
        }
        if (z) {
            uIUtils.mo104280s(this.f86069g, dVar.f86079d, this.f86051E0, this.f86052F0);
            mo105206B(this.f86064b);
            return;
        }
        uIUtils = new UIUtils();
        uIUtils.mo104280s(this.f86069g, dVar.f86079d, this.f86051E0, this.f86053G0);
        this.f86059M0.mo105223j(false);
    }

    /* renamed from: B */
    public void mo105206B(@C0359n0 JSONArray jSONArray) {
        C35176c cVar = this.f86059M0;
        if (cVar != null) {
            cVar.mo105223j(mo105216w(jSONArray));
        }
    }

    /* renamed from: C */
    public void mo105207C(boolean z) {
        mo105209a();
        this.f86066d.updateAllSDKConsentStatus(this.f86057K0, z);
        if (this.f86071w) {
            getFilter().filter(this.f86068f);
        } else {
            notifyDataSetChanged();
        }
    }

    @C0359n0
    /* renamed from: D */
    public final JSONArray mo105208D() {
        C34970d dVar = new C34970d(this.f86069g);
        try {
            JSONObject preferenceCenterData = this.f86066d.getPreferenceCenterData();
            Objects.requireNonNull(preferenceCenterData);
            this.f86060X = preferenceCenterData.getJSONArray("Groups");
        } catch (JSONException e) {
            OTLogger.m143447b("OneTrust", "error while parsing SDK data : " + e.getMessage());
        }
        JSONArray a = dVar.mo103676a(this.f86073y, this.f86060X);
        this.f86070v = a.length();
        this.f86074z.clear();
        this.f86059M0.mo105223j(mo105216w(a));
        return a;
    }

    /* renamed from: a */
    public final void mo105209a() {
        this.f86057K0 = new JSONArray();
        this.f86058L0 = new JSONObject();
        int i = 0;
        while (i < this.f86064b.length()) {
            try {
                String optString = this.f86064b.getJSONObject(i).optString("SdkId");
                this.f86057K0.put(optString);
                String d = new C34967b0(this.f86069g).mo103636d(optString);
                if (!this.f86058L0.has(d) && d != null) {
                    this.f86058L0.put(d, this.f86057K0);
                }
                i++;
            } catch (JSONException e) {
                OTLogger.m143457l("OTSDKListItemAdapter", "Error while updating all sdk status " + e.getMessage());
                return;
            }
        }
    }

    public Filter getFilter() {
        return new C35174a();
    }

    public int getItemCount() {
        return this.f86071w ? this.f86065c.length() : this.f86070v;
    }

    @C0359n0
    /* renamed from: l */
    public C35177d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35177d(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_sdk_list_item, viewGroup, false));
    }

    /* renamed from: q */
    public final void mo105212q(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f86063a);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        textView.setTextColor(Color.parseColor(!C35020d.m143605J(b0Var.mo104667k()) ? b0Var.mo104667k() : this.f86067e));
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: r */
    public final void mo105213r(@C0359n0 C35177d dVar, int i) {
        UIUtils uIUtils;
        SwitchCompat switchCompat;
        String str;
        String str2;
        Context context;
        try {
            if (!new C35015e(this.f86069g).mo104008t(new C34967b0(this.f86069g).mo103636d(this.f86064b.getJSONObject(dVar.getAdapterPosition()).getString("SdkId")))) {
                dVar.f86078c.setVisibility(8);
                if (1 == i) {
                    dVar.f86079d.setChecked(true);
                    uIUtils = new UIUtils();
                    context = this.f86069g;
                    switchCompat = dVar.f86079d;
                    str2 = this.f86051E0;
                    str = this.f86052F0;
                } else if (i == 0) {
                    dVar.f86079d.setChecked(false);
                    uIUtils = new UIUtils();
                    context = this.f86069g;
                    switchCompat = dVar.f86079d;
                    str2 = this.f86051E0;
                    str = this.f86053G0;
                } else if (-1 == i) {
                    dVar.f86079d.setVisibility(8);
                    return;
                } else {
                    return;
                }
                uIUtils.mo104280s(context, switchCompat, str2, str);
                return;
            }
            dVar.f86079d.setVisibility(8);
            dVar.f86078c.setVisibility(0);
            dVar.f86078c.setText(this.f86055I0);
            dVar.f86078c.setTextColor(Color.parseColor(this.f86056J0));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while setting Always active text. " + e.getMessage());
        }
    }

    /* renamed from: u */
    public void mo105214u(@C0359n0 List<String> list) {
        this.f86073y = list;
        this.f86070v = new C34970d(this.f86069g).mo103676a(this.f86073y, this.f86060X).length();
        if (this.f86071w) {
            getFilter().filter(this.f86068f);
        } else {
            notifyDataSetChanged();
        }
        if (list.isEmpty()) {
            this.f86073y.clear();
        }
    }

    /* renamed from: v */
    public void mo105215v(boolean z) {
        OTLogger.m143458m("OneTrust", "data filtered ? = " + z);
        this.f86071w = z;
    }

    /* renamed from: w */
    public boolean mo105216w(@C0359n0 JSONArray jSONArray) {
        int i = 0;
        while (i < getItemCount()) {
            try {
                String optString = jSONArray.getJSONObject(i).optString("SdkId");
                if (this.f86066d.getConsentStatusForSDKId(optString) == 0) {
                    OTLogger.m143458m("OTSDKListItemAdapter", "consent status 0 for sdkID = " + optString);
                    return false;
                }
                continue;
                i++;
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "Sdk list data error " + e.getMessage());
            }
        }
        return true;
    }

    @C0359n0
    /* renamed from: y */
    public JSONObject mo105217y() {
        return this.f86058L0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f A[Catch:{ JSONException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c6 A[Catch:{ JSONException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca A[Catch:{ JSONException -> 0x00f9 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(@androidx.annotation.C0359n0 com.onetrust.otpublishers.headless.p052UI.adapter.C35173t.C35177d r8, int r9) {
        /*
            r7 = this;
            java.lang.String r9 = "Description"
            org.json.JSONArray r0 = r7.f86065c     // Catch:{ JSONException -> 0x00f9 }
            r7.f86064b = r0     // Catch:{ JSONException -> 0x00f9 }
            boolean r0 = r7.f86071w     // Catch:{ JSONException -> 0x00f9 }
            if (r0 != 0) goto L_0x0010
            org.json.JSONArray r0 = r7.mo105208D()     // Catch:{ JSONException -> 0x00f9 }
            r7.f86064b = r0     // Catch:{ JSONException -> 0x00f9 }
        L_0x0010:
            r0 = 0
            r8.setIsRecyclable(r0)     // Catch:{ JSONException -> 0x00f9 }
            int r1 = r8.getAdapterPosition()     // Catch:{ JSONException -> 0x00f9 }
            android.widget.TextView r2 = r8.f86076a     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONArray r3 = r7.f86064b     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONObject r3 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r4 = "Name"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ JSONException -> 0x00f9 }
            r2.setText(r3)     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONArray r2 = r7.f86064b     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONObject r2 = r2.getJSONObject(r1)     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r2 = r2.getString(r9)     // Catch:{ JSONException -> 0x00f9 }
            boolean r2 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r2)     // Catch:{ JSONException -> 0x00f9 }
            r3 = 8
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "null"
            org.json.JSONArray r4 = r7.f86064b     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONObject r4 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r4 = r4.getString(r9)     // Catch:{ JSONException -> 0x00f9 }
            boolean r2 = r2.equals(r4)     // Catch:{ JSONException -> 0x00f9 }
            if (r2 != 0) goto L_0x0074
            boolean r2 = r7.f86072x     // Catch:{ JSONException -> 0x00f9 }
            if (r2 != 0) goto L_0x0054
            goto L_0x0074
        L_0x0054:
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r2 = new com.onetrust.otpublishers.headless.UI.Helper.UIUtils     // Catch:{ JSONException -> 0x00f9 }
            r2.<init>()     // Catch:{ JSONException -> 0x00f9 }
            android.content.Context r4 = r7.f86069g     // Catch:{ JSONException -> 0x00f9 }
            android.widget.TextView r5 = r8.f86077b     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONArray r6 = r7.f86064b     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONObject r1 = r6.getJSONObject(r1)     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r9 = r1.optString(r9)     // Catch:{ JSONException -> 0x00f9 }
            r2.mo104279r(r4, r5, r9)     // Catch:{ JSONException -> 0x00f9 }
            android.widget.TextView r9 = r8.f86077b     // Catch:{ JSONException -> 0x00f9 }
            r9.setVisibility(r0)     // Catch:{ JSONException -> 0x00f9 }
            goto L_0x007b
        L_0x0074:
            android.widget.TextView r9 = r8.f86077b     // Catch:{ JSONException -> 0x00f9 }
            r9.setVisibility(r3)     // Catch:{ JSONException -> 0x00f9 }
        L_0x007b:
            com.onetrust.otpublishers.headless.UI.UIProperty.v r9 = r7.f86061Y     // Catch:{ JSONException -> 0x00f9 }
            if (r9 == 0) goto L_0x00a6
            com.onetrust.otpublishers.headless.UI.mobiledatautils.f r9 = r7.f86062Z     // Catch:{ JSONException -> 0x00f9 }
            com.onetrust.otpublishers.headless.UI.UIProperty.b0 r9 = r9.mo105599k()     // Catch:{ JSONException -> 0x00f9 }
            android.widget.TextView r0 = r8.f86076a     // Catch:{ JSONException -> 0x00f9 }
            r7.mo105212q(r0, r9)     // Catch:{ JSONException -> 0x00f9 }
            com.onetrust.otpublishers.headless.UI.mobiledatautils.f r9 = r7.f86062Z     // Catch:{ JSONException -> 0x00f9 }
            com.onetrust.otpublishers.headless.UI.UIProperty.b0 r9 = r9.mo105598j()     // Catch:{ JSONException -> 0x00f9 }
            android.widget.TextView r0 = r8.f86077b     // Catch:{ JSONException -> 0x00f9 }
            r7.mo105212q(r0, r9)     // Catch:{ JSONException -> 0x00f9 }
            android.view.View r9 = r8.f86081f     // Catch:{ JSONException -> 0x00f9 }
            com.onetrust.otpublishers.headless.UI.mobiledatautils.f r0 = r7.f86062Z     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r0 = r0.mo105594f()     // Catch:{ JSONException -> 0x00f9 }
            m144910p(r9, r0)     // Catch:{ JSONException -> 0x00f9 }
        L_0x00a6:
            com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK r9 = r7.f86066d     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONArray r0 = r7.f86064b     // Catch:{ JSONException -> 0x00f9 }
            int r1 = r8.getAdapterPosition()     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r1 = "SdkId"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00f9 }
            int r9 = r9.getConsentStatusForSDKId(r0)     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r0 = "true"
            java.lang.String r1 = r7.f86054H0     // Catch:{ JSONException -> 0x00f9 }
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x00f9 }
            if (r0 == 0) goto L_0x00ca
            r7.mo105213r(r8, r9)     // Catch:{ JSONException -> 0x00f9 }
            goto L_0x00d8
        L_0x00ca:
            androidx.appcompat.widget.SwitchCompat r9 = r8.f86079d     // Catch:{ JSONException -> 0x00f9 }
            r9.setVisibility(r3)     // Catch:{ JSONException -> 0x00f9 }
            android.widget.TextView r9 = r8.f86078c     // Catch:{ JSONException -> 0x00f9 }
            r9.setVisibility(r3)     // Catch:{ JSONException -> 0x00f9 }
        L_0x00d8:
            androidx.appcompat.widget.SwitchCompat r9 = r8.f86080e     // Catch:{ JSONException -> 0x00f9 }
            r9.setVisibility(r3)     // Catch:{ JSONException -> 0x00f9 }
            androidx.appcompat.widget.SwitchCompat r9 = r8.f86079d     // Catch:{ JSONException -> 0x00f9 }
            com.onetrust.otpublishers.headless.UI.mobiledatautils.f r0 = r7.f86062Z     // Catch:{ JSONException -> 0x00f9 }
            java.lang.String r0 = r0.mo105593e()     // Catch:{ JSONException -> 0x00f9 }
            r9.setContentDescription(r0)     // Catch:{ JSONException -> 0x00f9 }
            androidx.appcompat.widget.SwitchCompat r9 = r8.f86079d     // Catch:{ JSONException -> 0x00f9 }
            com.onetrust.otpublishers.headless.UI.adapter.s r0 = new com.onetrust.otpublishers.headless.UI.adapter.s     // Catch:{ JSONException -> 0x00f9 }
            r0.<init>(r7, r8)     // Catch:{ JSONException -> 0x00f9 }
            r9.setOnCheckedChangeListener(r0)     // Catch:{ JSONException -> 0x00f9 }
            goto L_0x0114
        L_0x00f9:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "error while rendering SDK list "
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "OneTrust"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r9, r8)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.adapter.C35173t.onBindViewHolder(com.onetrust.otpublishers.headless.UI.adapter.t$d, int):void");
    }
}
