package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35125y;
import org.json.JSONArray;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.g0 */
public class C35147g0 extends RecyclerView.Adapter<C35148a> {

    /* renamed from: a */
    public final OTConfiguration f85913a;

    /* renamed from: b */
    public JSONArray f85914b;

    /* renamed from: c */
    public String f85915c;

    /* renamed from: d */
    public C35125y f85916d;

    /* renamed from: e */
    public String f85917e;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.g0$a */
    public static class C35148a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85918a;

        public C35148a(View view) {
            super(view);
            this.f85918a = (TextView) view.findViewById(C35265a.C35273h.vd_purpose_item);
        }
    }

    public C35147g0(@C0359n0 JSONArray jSONArray, @C0359n0 String str, @C0363p0 C35125y yVar, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 String str2) {
        this.f85914b = jSONArray;
        this.f85915c = str;
        this.f85916d = yVar;
        this.f85913a = oTConfiguration;
        this.f85917e = str2;
    }

    /* renamed from: l */
    public static void m144775l(@C0359n0 TextView textView, @C0359n0 String str) {
        for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public int getItemCount() {
        return this.f85914b.length();
    }

    @C0359n0
    /* renamed from: k */
    public C35148a onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return new C35148a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_vendor_details_purpose_item, viewGroup, false));
    }

    /* renamed from: m */
    public final void mo105134m(@C0359n0 C35148a aVar) {
        if (!C35020d.m143605J(this.f85916d.mo105029k().mo104657a().mo104757f())) {
            aVar.f85918a.setTextSize(Float.parseFloat(this.f85916d.mo105029k().mo104657a().mo104757f()));
        }
        if (!C35020d.m143605J(this.f85916d.mo105029k().mo104665i())) {
            aVar.f85918a.setTextAlignment(Integer.parseInt(this.f85916d.mo105029k().mo104665i()));
        }
        new UIUtils().mo104264A(aVar.f85918a, this.f85916d.mo105029k().mo104657a(), this.f85913a);
    }

    /* renamed from: n */
    public void onBindViewHolder(@C0359n0 C35148a aVar, int i) {
        aVar.setIsRecyclable(false);
        try {
            aVar.f85918a.setText(this.f85914b.getJSONObject(aVar.getAdapterPosition()).getString(OTVendorListMode.GENERAL.equalsIgnoreCase(this.f85917e) ? C13758b.f33475u0 : "name"));
            aVar.f85918a.setTextColor(Color.parseColor(this.f85915c));
            m144775l(aVar.f85918a, this.f85915c);
            if (this.f85916d != null) {
                mo105134m(aVar);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OneTrust", "error while rendering purpose items in Vendor detail screen " + e.getMessage());
        }
    }
}
