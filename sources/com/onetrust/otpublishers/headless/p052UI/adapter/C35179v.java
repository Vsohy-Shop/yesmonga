package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35122v;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35262g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.v */
public class C35179v extends RecyclerView.Adapter<C35180a> {

    /* renamed from: a */
    public final OTConfiguration f86087a;

    /* renamed from: b */
    public JSONArray f86088b;

    /* renamed from: c */
    public List<String> f86089c;

    /* renamed from: d */
    public C35122v f86090d;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.v$a */
    public static class C35180a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f86091a;

        /* renamed from: b */
        public CheckBox f86092b;

        /* renamed from: c */
        public View f86093c;

        public C35180a(View view) {
            super(view);
            this.f86091a = (TextView) view.findViewById(C35265a.C35273h.category_name);
            this.f86092b = (CheckBox) view.findViewById(C35265a.C35273h.category_select);
            this.f86093c = view.findViewById(C35265a.C35273h.sdk_name_divider);
        }
    }

    public C35179v(@C0359n0 JSONArray jSONArray, @C0359n0 List<String> list, @C0363p0 OTConfiguration oTConfiguration, C35262g gVar) {
        this.f86088b = jSONArray;
        this.f86090d = gVar.mo105607e();
        this.f86087a = oTConfiguration;
        mo105229q(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m144936p(C35180a aVar, String str, String str2, String str3, View view) {
        String str4;
        boolean isChecked = aVar.f86092b.isChecked();
        C35257c.m145351c(aVar.f86092b, Color.parseColor(str), Color.parseColor(str2));
        List<String> list = this.f86089c;
        if (!isChecked) {
            str4 = "onClick remove:" + str3 + ", status : " + list.remove(str3);
        } else if (!list.contains(str3)) {
            this.f86089c.add(str3);
            str4 = "onClick add:" + str3;
        } else {
            return;
        }
        OTLogger.m143458m("OTPurposeListAdapter", str4);
    }

    public int getItemCount() {
        return this.f86088b.length();
    }

    @C0359n0
    /* renamed from: l */
    public C35180a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35180a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_sdk_list_filter_item, viewGroup, false));
    }

    @C0359n0
    /* renamed from: m */
    public List<String> mo105226m() {
        return this.f86089c;
    }

    /* renamed from: n */
    public final void mo105227n(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f86087a);
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

    /* renamed from: o */
    public void onBindViewHolder(C35180a aVar, int i) {
        aVar.setIsRecyclable(false);
        try {
            JSONObject jSONObject = this.f86088b.getJSONObject(aVar.getAdapterPosition());
            String string = jSONObject.getString("GroupName");
            aVar.f86091a.setText(string);
            String string2 = jSONObject.getString("CustomGroupId");
            boolean r = mo105230r(string2);
            C35122v vVar = this.f86090d;
            if (vVar != null) {
                String t = vVar.mo104987t();
                String k = this.f86090d.mo104985r().mo104667k();
                OTLogger.m143447b("OTPurposeListAdapter", "CategoryName : " + string + ", purpose status : " + r);
                aVar.f86092b.setChecked(r);
                mo105227n(aVar.f86091a, this.f86090d.mo104985r());
                C35257c.m145351c(aVar.f86092b, Color.parseColor(t), Color.parseColor(k));
                if (!C35020d.m143605J(this.f86090d.mo104991w())) {
                    aVar.f86093c.setBackgroundColor(Color.parseColor(this.f86090d.mo104991w()));
                }
                aVar.f86092b.setContentDescription("Filter");
                aVar.f86092b.setOnClickListener(new C35178u(this, aVar, t, k, string2));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while parsing " + e.getMessage());
        }
    }

    /* renamed from: q */
    public final void mo105229q(@C0359n0 List<String> list) {
        this.f86089c = new ArrayList(list);
    }

    /* renamed from: r */
    public final boolean mo105230r(String str) {
        for (int i = 0; i < mo105226m().size(); i++) {
            if (mo105226m().get(i).trim().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
