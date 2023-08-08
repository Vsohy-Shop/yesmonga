package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35126z;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.r */
public class C35169r extends RecyclerView.Adapter<C35171b> {

    /* renamed from: a */
    public final OTConfiguration f86041a;

    /* renamed from: b */
    public final C35170a f86042b;

    /* renamed from: c */
    public JSONArray f86043c;

    /* renamed from: d */
    public Map<String, String> f86044d = new HashMap();

    /* renamed from: e */
    public C35126z f86045e;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.r$a */
    public interface C35170a {
        /* renamed from: c */
        void mo105204c(@C0359n0 Map<String, String> map);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.r$b */
    public static class C35171b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f86046a;

        /* renamed from: b */
        public CheckBox f86047b;

        /* renamed from: c */
        public View f86048c;

        public C35171b(View view) {
            super(view);
            this.f86046a = (TextView) view.findViewById(C35265a.C35273h.purpose_name);
            this.f86047b = (CheckBox) view.findViewById(C35265a.C35273h.purpose_select);
            this.f86048c = view.findViewById(C35265a.C35273h.purpose_name_divider);
        }
    }

    public C35169r(@C0359n0 JSONArray jSONArray, @C0359n0 Map<String, String> map, @C0359n0 C35126z zVar, @C0359n0 OTConfiguration oTConfiguration, @C0359n0 C35170a aVar) {
        this.f86043c = jSONArray;
        this.f86045e = zVar;
        this.f86041a = oTConfiguration;
        this.f86042b = aVar;
        mo105203r(map);
    }

    /* renamed from: o */
    public static void m144894o(@C0359n0 C35170a aVar, @C0359n0 Map<String, String> map) {
        aVar.mo105204c(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m144895q(C35171b bVar, String str, String str2, View view) {
        String str3;
        StringBuilder sb;
        boolean isChecked = bVar.f86047b.isChecked();
        C35126z zVar = this.f86045e;
        if (zVar != null && !C35020d.m143605J(zVar.mo105041A()) && !C35020d.m143605J(this.f86045e.mo105071s().mo104667k())) {
            C35257c.m145351c(bVar.f86047b, Color.parseColor(this.f86045e.mo105041A()), Color.parseColor(this.f86045e.mo105071s().mo104667k()));
        }
        if (!isChecked) {
            this.f86044d.remove(str);
            m144894o(this.f86042b, this.f86044d);
            sb = new StringBuilder();
            str3 = "Purposes Removed : ";
        } else if (!this.f86044d.containsKey(str)) {
            this.f86044d.put(str, str2);
            m144894o(this.f86042b, this.f86044d);
            sb = new StringBuilder();
            str3 = "Purposes Added : ";
        } else {
            return;
        }
        sb.append(str3);
        sb.append(str);
        OTLogger.m143458m("OneTrust", sb.toString());
    }

    public int getItemCount() {
        return this.f86043c.length();
    }

    @C0359n0
    /* renamed from: l */
    public C35171b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35171b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_purpose_list_item, viewGroup, false));
    }

    @C0359n0
    /* renamed from: m */
    public Map<String, String> mo105200m() {
        OTLogger.m143458m("OneTrust", "Purposes to pass on apply filters : " + this.f86044d);
        return this.f86044d;
    }

    /* renamed from: n */
    public final void mo105201n(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f86041a);
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

    /* renamed from: p */
    public void onBindViewHolder(C35171b bVar, int i) {
        bVar.setIsRecyclable(false);
        try {
            JSONObject jSONObject = this.f86043c.getJSONObject(bVar.getAdapterPosition());
            String string = jSONObject.getString("Type");
            bVar.f86046a.setText(jSONObject.getString("GroupName"));
            String string2 = jSONObject.getString("CustomGroupId");
            boolean containsKey = mo105200m().containsKey(string2);
            OTLogger.m143447b("OTPurposeListAdapter", "purpose status : " + containsKey);
            bVar.f86047b.setChecked(containsKey);
            bVar.f86047b.setContentDescription("Filter");
            C35126z zVar = this.f86045e;
            if (zVar != null) {
                mo105201n(bVar.f86046a, zVar.mo105071s());
                if (!C35020d.m143605J(this.f86045e.mo105041A()) && !C35020d.m143605J(this.f86045e.mo105071s().mo104667k())) {
                    C35257c.m145351c(bVar.f86047b, Color.parseColor(this.f86045e.mo105041A()), Color.parseColor(this.f86045e.mo105071s().mo104667k()));
                }
                if (!C35020d.m143605J(this.f86045e.mo105043C())) {
                    bVar.f86048c.setBackgroundColor(Color.parseColor(this.f86045e.mo105043C()));
                }
            }
            bVar.f86047b.setOnClickListener(new C35168q(this, bVar, string2, string));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while parsing " + e.getMessage());
        }
    }

    /* renamed from: r */
    public final void mo105203r(@C0359n0 Map<String, String> map) {
        this.f86044d = new HashMap(map);
    }
}
