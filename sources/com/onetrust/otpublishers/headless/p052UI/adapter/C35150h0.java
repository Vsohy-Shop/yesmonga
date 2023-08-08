package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35125y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.h0 */
public class C35150h0 extends RecyclerView.Adapter<C35151a> {

    /* renamed from: a */
    public JSONObject f85922a;

    /* renamed from: b */
    public OTPublishersHeadlessSDK f85923b;

    /* renamed from: c */
    public C35125y f85924c;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.h0$a */
    public static class C35151a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85925a;

        /* renamed from: b */
        public TextView f85926b;

        /* renamed from: c */
        public TextView f85927c;

        /* renamed from: d */
        public TextView f85928d;

        /* renamed from: e */
        public TextView f85929e;

        /* renamed from: f */
        public TextView f85930f;

        /* renamed from: g */
        public TextView f85931g;

        /* renamed from: h */
        public TextView f85932h;

        /* renamed from: i */
        public TextView f85933i;

        /* renamed from: j */
        public TextView f85934j;

        public C35151a(View view) {
            super(view);
            this.f85926b = (TextView) view.findViewById(C35265a.C35273h.disclosure_id_label);
            this.f85929e = (TextView) view.findViewById(C35265a.C35273h.disclosure_type_label);
            this.f85927c = (TextView) view.findViewById(C35265a.C35273h.disclosure_ls_label);
            this.f85928d = (TextView) view.findViewById(C35265a.C35273h.disclosure_domain_label);
            this.f85925a = (TextView) view.findViewById(C35265a.C35273h.disclosure_purpose_label);
            this.f85930f = (TextView) view.findViewById(C35265a.C35273h.disclosure_id_val);
            this.f85931g = (TextView) view.findViewById(C35265a.C35273h.disclosure_type_val);
            this.f85932h = (TextView) view.findViewById(C35265a.C35273h.disclosure_ls_val);
            this.f85933i = (TextView) view.findViewById(C35265a.C35273h.disclosure_domain_val);
            this.f85934j = (TextView) view.findViewById(C35265a.C35273h.disclosure_purpose_val);
        }
    }

    public C35150h0(@C0359n0 JSONObject jSONObject, OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 C35125y yVar) {
        this.f85922a = jSONObject;
        this.f85923b = oTPublishersHeadlessSDK;
        this.f85924c = yVar;
    }

    public int getItemCount() {
        try {
            return this.f85922a.getJSONArray("disclosures").length();
        } catch (JSONException unused) {
            OTLogger.m143457l("OneTrust", "Error on populating disclosures");
            return 0;
        }
    }

    @C0359n0
    /* renamed from: k */
    public C35151a onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return new C35151a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_vendor_disclosure_item, viewGroup, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0093 A[Catch:{ JSONException -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a3 A[Catch:{ JSONException -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c8 A[Catch:{ JSONException -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d8 A[Catch:{ JSONException -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0132 A[Catch:{ JSONException -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0152 A[Catch:{ JSONException -> 0x0161 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(@androidx.annotation.C0359n0 com.onetrust.otpublishers.headless.p052UI.adapter.C35150h0.C35151a r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "domain"
            java.lang.String r2 = "type"
            java.lang.String r3 = "name"
            java.lang.String r4 = "identifier"
            java.lang.String r5 = "purposes"
            com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK r6 = r11.f85923b     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r6 = r6.getPreferenceCenterData()     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r7 = r11.f85922a     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r8 = "disclosures"
            org.json.JSONArray r7 = r7.getJSONArray(r8)     // Catch:{ JSONException -> 0x0161 }
            if (r6 == 0) goto L_0x017c
            r11.mo105140n(r6, r12)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r8 = r12.f85926b     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r9 = "PCenterVendorListStorageIdentifier"
            java.lang.String r9 = r6.optString(r9)     // Catch:{ JSONException -> 0x0161 }
            r8.setText(r9)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r8 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r8 = r8.optString(r4)     // Catch:{ JSONException -> 0x0161 }
            boolean r8 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r8)     // Catch:{ JSONException -> 0x0161 }
            r9 = 8
            if (r8 != 0) goto L_0x0049
            android.widget.TextView r3 = r12.f85930f     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r8 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r4 = r8.optString(r4)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x0066
        L_0x0049:
            org.json.JSONObject r4 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r4 = r4.optString(r3)     // Catch:{ JSONException -> 0x0161 }
            boolean r4 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r4)     // Catch:{ JSONException -> 0x0161 }
            if (r4 != 0) goto L_0x006a
            android.widget.TextView r4 = r12.f85930f     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r8 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r3 = r8.optString(r3)     // Catch:{ JSONException -> 0x0161 }
            r10 = r4
            r4 = r3
            r3 = r10
        L_0x0066:
            r3.setText(r4)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x0078
        L_0x006a:
            android.widget.TextView r3 = r12.f85930f     // Catch:{ JSONException -> 0x0161 }
            r3.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r3 = r12.f85926b     // Catch:{ JSONException -> 0x0161 }
            r3.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
        L_0x0078:
            android.widget.TextView r3 = r12.f85929e     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r4 = "PCenterVendorListStorageType"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0161 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r3 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r3 = r3.optString(r2)     // Catch:{ JSONException -> 0x0161 }
            boolean r3 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r3)     // Catch:{ JSONException -> 0x0161 }
            if (r3 != 0) goto L_0x00a3
            android.widget.TextView r3 = r12.f85931g     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r4 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r2 = r4.optString(r2)     // Catch:{ JSONException -> 0x0161 }
            r3.setText(r2)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x00b1
        L_0x00a3:
            android.widget.TextView r2 = r12.f85931g     // Catch:{ JSONException -> 0x0161 }
            r2.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r2 = r12.f85929e     // Catch:{ JSONException -> 0x0161 }
            r2.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
        L_0x00b1:
            android.widget.TextView r2 = r12.f85928d     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r3 = "PCenterVendorListStorageDomain"
            java.lang.String r3 = r6.optString(r3)     // Catch:{ JSONException -> 0x0161 }
            r2.setText(r3)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r2 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            boolean r2 = r2.has(r1)     // Catch:{ JSONException -> 0x0161 }
            if (r2 == 0) goto L_0x00d8
            android.widget.TextView r2 = r12.f85933i     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r3 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r1 = r3.optString(r1)     // Catch:{ JSONException -> 0x0161 }
            r2.setText(r1)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x00e6
        L_0x00d8:
            android.widget.TextView r1 = r12.f85928d     // Catch:{ JSONException -> 0x0161 }
            r1.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r1 = r12.f85933i     // Catch:{ JSONException -> 0x0161 }
            r1.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
        L_0x00e6:
            android.widget.TextView r1 = r12.f85927c     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r2 = "PCenterVendorListLifespan"
            java.lang.String r2 = r6.optString(r2)     // Catch:{ JSONException -> 0x0161 }
            r1.setText(r2)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r1 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r2 = "maxAgeSeconds"
            long r1 = r1.optLong(r2)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r3 = r12.f85932h     // Catch:{ JSONException -> 0x0161 }
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r4 = new com.onetrust.otpublishers.headless.UI.Helper.UIUtils     // Catch:{ JSONException -> 0x0161 }
            r4.<init>()     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r1 = r4.mo104272g(r1, r6)     // Catch:{ JSONException -> 0x0161 }
            r3.setText(r1)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r1 = r12.f85925a     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r2 = "PCenterVendorListStoragePurposes"
            java.lang.String r2 = r6.optString(r2)     // Catch:{ JSONException -> 0x0161 }
            r1.setText(r2)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r1 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONArray r1 = r1.optJSONArray(r5)     // Catch:{ JSONException -> 0x0161 }
            if (r1 == 0) goto L_0x0152
            org.json.JSONObject r1 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONArray r1 = r1.optJSONArray(r5)     // Catch:{ JSONException -> 0x0161 }
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0161 }
            if (r1 <= 0) goto L_0x0152
            org.json.JSONObject r13 = r7.getJSONObject(r13)     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONArray r13 = r13.getJSONArray(r5)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r13 = r13.toString()     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r1 = "["
            java.lang.String r13 = r13.replace(r1, r0)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r1 = "]"
            java.lang.String r13 = r13.replace(r1, r0)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r12 = r12.f85934j     // Catch:{ JSONException -> 0x0161 }
            r12.setText(r13)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x017c
        L_0x0152:
            android.widget.TextView r13 = r12.f85934j     // Catch:{ JSONException -> 0x0161 }
            r13.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
            android.widget.TextView r12 = r12.f85925a     // Catch:{ JSONException -> 0x0161 }
            r12.setVisibility(r9)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x017c
        L_0x0161:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Error on populating disclosures, err : "
            r13.append(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "OneTrust"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r13, r12)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.adapter.C35150h0.onBindViewHolder(com.onetrust.otpublishers.headless.UI.adapter.h0$a, int):void");
    }

    /* renamed from: m */
    public final void mo105139m(@C0359n0 C35151a aVar, C35125y yVar) {
        if (!C35020d.m143605J(yVar.mo105029k().mo104665i())) {
            int parseInt = Integer.parseInt(yVar.mo105029k().mo104665i());
            aVar.f85926b.setTextAlignment(parseInt);
            aVar.f85930f.setTextAlignment(parseInt);
            aVar.f85929e.setTextAlignment(parseInt);
            aVar.f85931g.setTextAlignment(parseInt);
            aVar.f85928d.setTextAlignment(parseInt);
            aVar.f85933i.setTextAlignment(parseInt);
            aVar.f85927c.setTextAlignment(parseInt);
            aVar.f85932h.setTextAlignment(parseInt);
            aVar.f85925a.setTextAlignment(parseInt);
            aVar.f85934j.setTextAlignment(parseInt);
        }
    }

    /* renamed from: n */
    public final void mo105140n(@C0359n0 JSONObject jSONObject, @C0359n0 C35151a aVar) {
        String str;
        try {
            C35125y yVar = this.f85924c;
            if (yVar != null) {
                C35102b0 k = yVar.mo105029k();
                str = !C35020d.m143605J(k.mo104667k()) ? k.mo104667k() : jSONObject.optString("PcTextColor");
                if (!C35020d.m143605J(this.f85924c.mo105029k().mo104657a().mo104757f())) {
                    float parseFloat = Float.parseFloat(this.f85924c.mo105029k().mo104657a().mo104757f());
                    aVar.f85926b.setTextSize(parseFloat);
                    aVar.f85930f.setTextSize(parseFloat);
                    aVar.f85929e.setTextSize(parseFloat);
                    aVar.f85931g.setTextSize(parseFloat);
                    aVar.f85928d.setTextSize(parseFloat);
                    aVar.f85933i.setTextSize(parseFloat);
                    aVar.f85927c.setTextSize(parseFloat);
                    aVar.f85932h.setTextSize(parseFloat);
                    aVar.f85925a.setTextSize(parseFloat);
                    aVar.f85934j.setTextSize(parseFloat);
                }
                mo105139m(aVar, this.f85924c);
                UIUtils uIUtils = new UIUtils();
                C35110j a = this.f85924c.mo105029k().mo104657a();
                uIUtils.mo104264A(aVar.f85926b, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85930f, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85929e, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85931g, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85928d, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85933i, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85927c, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85932h, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85925a, a, (OTConfiguration) null);
                uIUtils.mo104264A(aVar.f85934j, a, (OTConfiguration) null);
            } else {
                str = jSONObject.optString("PcTextColor");
            }
            aVar.f85926b.setTextColor(Color.parseColor(str));
            aVar.f85930f.setTextColor(Color.parseColor(str));
            aVar.f85929e.setTextColor(Color.parseColor(str));
            aVar.f85931g.setTextColor(Color.parseColor(str));
            aVar.f85928d.setTextColor(Color.parseColor(str));
            aVar.f85933i.setTextColor(Color.parseColor(str));
            aVar.f85927c.setTextColor(Color.parseColor(str));
            aVar.f85932h.setTextColor(Color.parseColor(str));
            aVar.f85925a.setTextColor(Color.parseColor(str));
            aVar.f85934j.setTextColor(Color.parseColor(str));
        } catch (Exception e) {
            OTLogger.m143457l("OneTrust", "Error while applying styles to Vendor disclosures, err : " + e.getMessage());
        }
    }
}
