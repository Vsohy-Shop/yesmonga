package com.onetrust.otpublishers.headless.p052UI.TVUI.adapter;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.q */
public class C35063q extends RecyclerView.Adapter<C35066c> {

    /* renamed from: a */
    public C35065b f85362a;

    /* renamed from: b */
    public OTPublishersHeadlessSDK f85363b;

    /* renamed from: c */
    public OTVendorUtils f85364c;

    /* renamed from: d */
    public C35069c f85365d;

    /* renamed from: e */
    public boolean f85366e;

    /* renamed from: f */
    public Map<String, String> f85367f = new HashMap();

    /* renamed from: g */
    public int f85368g;

    /* renamed from: v */
    public JSONObject f85369v;

    /* renamed from: w */
    public List<JSONObject> f85370w;

    /* renamed from: x */
    public ArrayList<String> f85371x;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.q$a */
    public class C35064a implements Comparator<JSONObject> {
        public C35064a(C35063q qVar) {
        }

        /* renamed from: a */
        public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
            String str;
            String str2 = "";
            try {
                String string = jSONObject.getString("name");
                Locale locale = Locale.ENGLISH;
                str = string.toLowerCase(locale);
                try {
                    str2 = jSONObject2.getString("name").toLowerCase(locale);
                } catch (JSONException e) {
                    e = e;
                    OTLogger.m143457l("TVVendorlist", "error while sorting VL json object lists,err : " + e.toString());
                    return str.compareTo(str2);
                }
            } catch (JSONException e2) {
                e = e2;
                str = str2;
                OTLogger.m143457l("TVVendorlist", "error while sorting VL json object lists,err : " + e.toString());
                return str.compareTo(str2);
            }
            return str.compareTo(str2);
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.q$b */
    public interface C35065b {
        /* renamed from: a */
        void mo104353a();

        /* renamed from: b */
        void mo104354b();

        /* renamed from: d */
        void mo104355d(String str);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.q$c */
    public static class C35066c extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final TextView f85372a;

        /* renamed from: b */
        public final LinearLayout f85373b;

        public C35066c(View view) {
            super(view);
            this.f85372a = (TextView) view.findViewById(C35265a.C35273h.tv_grp_name);
            this.f85373b = (LinearLayout) view.findViewById(C35265a.C35273h.tv_grp_layout);
        }
    }

    public C35063q(@C0359n0 OTVendorUtils oTVendorUtils, @C0359n0 C35065b bVar, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, boolean z, @C0363p0 Map<String, String> map) {
        this.f85364c = oTVendorUtils;
        this.f85362a = bVar;
        this.f85363b = oTPublishersHeadlessSDK;
        this.f85365d = C35069c.m143925y();
        this.f85366e = z;
        this.f85367f = map;
        oTVendorUtils.refreshList(OTVendorListMode.IAB);
        oTVendorUtils.setVendorsListObject(OTVendorListMode.IAB, mo104342n(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m143865q(String str, C35066c cVar, View view, boolean z) {
        String str2;
        LinearLayout linearLayout;
        if (z) {
            this.f85362a.mo104355d(str);
            cVar.f85372a.setTextColor(Color.parseColor(this.f85365d.mo104402J().mo104784g()));
            linearLayout = cVar.f85373b;
            str2 = this.f85365d.mo104402J().mo104782e();
        } else {
            cVar.f85372a.setTextColor(Color.parseColor(this.f85365d.mo104402J().mo104788k()));
            linearLayout = cVar.f85373b;
            str2 = this.f85365d.mo104402J().mo104786i();
        }
        linearLayout.setBackgroundColor(Color.parseColor(str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ boolean m143866v(C35066c cVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) == 22) {
            this.f85368g = cVar.getAdapterPosition();
            this.f85362a.mo104353a();
            cVar.f85372a.setTextColor(Color.parseColor(this.f85365d.mo104402J().mo104780c()));
            cVar.f85373b.setBackgroundColor(Color.parseColor(this.f85365d.mo104402J().mo104778a()));
        }
        if (cVar.getAdapterPosition() != 0 || C35036e.m143801a(i, keyEvent) != 25) {
            return false;
        }
        this.f85362a.mo104354b();
        return false;
    }

    public int getItemCount() {
        return this.f85370w.size();
    }

    @C0359n0
    /* renamed from: m */
    public C35066c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35066c(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_pc_list_item_tv, viewGroup, false));
    }

    @C0359n0
    /* renamed from: n */
    public final JSONObject mo104342n() {
        StringBuilder sb;
        String str;
        JSONObject jSONObject = new JSONObject();
        if (this.f85366e) {
            jSONObject = this.f85364c.getVendorsByPurpose(this.f85367f, this.f85363b.getVendorListUI(OTVendorListMode.IAB));
            sb = new StringBuilder();
            str = "Total vendors count with filtered purpose : ";
        } else {
            JSONObject vendorListUI = this.f85363b.getVendorListUI(OTVendorListMode.IAB);
            if (vendorListUI != null) {
                jSONObject = vendorListUI;
            }
            sb = new StringBuilder();
            str = "Total IAB vendors count without filter : ";
        }
        sb.append(str);
        sb.append(jSONObject.length());
        OTLogger.m143447b("TVVendorlist", sb.toString());
        return jSONObject;
    }

    /* renamed from: o */
    public void onViewAttachedToWindow(@C0359n0 C35066c cVar) {
        super.onViewAttachedToWindow(cVar);
        if (cVar.getAdapterPosition() == this.f85368g) {
            cVar.itemView.requestFocus();
        }
    }

    /* renamed from: p */
    public void onBindViewHolder(@C0359n0 C35066c cVar, int i) {
        int adapterPosition = cVar.getAdapterPosition();
        OTLogger.m143460o("TVVendorlist", "filtered vendors count " + this.f85370w.size());
        String str = "";
        if (this.f85369v.names() != null) {
            try {
                cVar.setIsRecyclable(false);
                JSONObject jSONObject = this.f85370w.get(adapterPosition);
                str = jSONObject.getString("id");
                cVar.f85372a.setText(jSONObject.getString("name"));
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "exception thrown when rendering vendors, err : " + e.getMessage());
            }
        }
        cVar.f85372a.setTextColor(Color.parseColor(this.f85365d.mo104402J().mo104788k()));
        cVar.f85373b.setBackgroundColor(Color.parseColor(this.f85365d.mo104402J().mo104786i()));
        cVar.itemView.setOnFocusChangeListener(new C35061o(this, str, cVar));
        cVar.itemView.setOnKeyListener(new C35062p(this, cVar));
    }

    /* renamed from: r */
    public void mo104345r(@C0359n0 ArrayList<String> arrayList) {
        this.f85371x = arrayList;
    }

    /* renamed from: s */
    public final void mo104346s(@C0359n0 List<JSONObject> list, @C0359n0 JSONObject jSONObject) {
        String lowerCase = jSONObject.getString("name").toLowerCase(Locale.ENGLISH);
        if (this.f85371x.contains("A_F") && lowerCase.matches("(a|b|c|d|e|f]).*")) {
            list.add(jSONObject);
        }
        if (this.f85371x.contains("G_L") && lowerCase.matches("(g|h|i|j|k|l]).*")) {
            list.add(jSONObject);
        }
        if (this.f85371x.contains("M_R") && lowerCase.matches("(m|n|o|p|q|r]).*")) {
            list.add(jSONObject);
        }
        if (this.f85371x.contains("S_Z") && lowerCase.matches("(s|t|u|v|w|x|y|z]).*")) {
            list.add(jSONObject);
        }
    }

    /* renamed from: t */
    public void mo104347t(@C0359n0 Map<String, String> map) {
        this.f85367f = map;
    }

    /* renamed from: u */
    public void mo104348u(boolean z) {
        this.f85366e = z;
    }

    /* renamed from: w */
    public void mo104349w() {
        this.f85368g = 0;
    }

    /* renamed from: x */
    public void mo104350x() {
        this.f85364c.setVendorsListObject(OTVendorListMode.IAB, mo104342n(), false);
        this.f85369v = new JSONObject();
        this.f85369v = this.f85364c.getVendorsListObject(OTVendorListMode.IAB);
        this.f85370w = new ArrayList();
        if (this.f85371x == null) {
            this.f85371x = new ArrayList<>();
        }
        for (int i = 0; i < this.f85369v.length(); i++) {
            try {
                JSONObject jSONObject = this.f85369v;
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (this.f85371x.isEmpty()) {
                    this.f85370w.add(jSONObject2);
                } else {
                    mo104346s(this.f85370w, jSONObject2);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("TVVendorlist", "error while constructing VL json object lists,err : " + e.toString());
            }
        }
        Collections.sort(this.f85370w, new C35064a(this));
    }
}
