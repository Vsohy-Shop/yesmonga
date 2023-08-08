package com.onetrust.otpublishers.headless.p052UI.TVUI.adapter;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.j */
public class C35050j extends RecyclerView.Adapter<C35052b> {

    /* renamed from: a */
    public final C35051a f85323a;

    /* renamed from: b */
    public JSONArray f85324b;

    /* renamed from: c */
    public String f85325c;

    /* renamed from: d */
    public Map<String, String> f85326d = new HashMap();

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.j$a */
    public interface C35051a {
        /* renamed from: c */
        void mo104330c(@C0359n0 Map<String, String> map);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.j$b */
    public static class C35052b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final TextView f85327a;

        /* renamed from: b */
        public final CheckBox f85328b;

        /* renamed from: c */
        public final LinearLayout f85329c;

        /* renamed from: d */
        public CardView f85330d;

        public C35052b(View view) {
            super(view);
            this.f85327a = (TextView) view.findViewById(C35265a.C35273h.ot_tv_filter_purpose);
            this.f85328b = (CheckBox) view.findViewById(C35265a.C35273h.ot_tv_filter_item_cb);
            this.f85329c = (LinearLayout) view.findViewById(C35265a.C35273h.ot_tv_filter_item_layout);
            this.f85330d = (CardView) view.findViewById(C35265a.C35273h.ot_tv_filter_item_card);
        }
    }

    public C35050j(@C0359n0 JSONArray jSONArray, @C0359n0 String str, @C0359n0 Map<String, String> map, @C0359n0 C35051a aVar) {
        this.f85324b = jSONArray;
        this.f85325c = str;
        this.f85323a = aVar;
        this.f85326d = new HashMap(map);
    }

    /* renamed from: p */
    public static void m143837p(@C0359n0 C35051a aVar, @C0359n0 Map<String, String> map) {
        aVar.mo104330c(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m143838r(C35052b bVar, C35069c cVar, String str, View view, boolean z) {
        float f;
        CardView cardView;
        if (z) {
            bVar.f85329c.setBackgroundColor(Color.parseColor(cVar.mo104421u().mo104708k()));
            bVar.f85327a.setTextColor(Color.parseColor(cVar.mo104421u().mo104710m()));
            mo104327o(bVar.f85328b, Color.parseColor(cVar.mo104421u().mo104710m()));
            cardView = bVar.f85330d;
            f = 6.0f;
        } else {
            bVar.f85329c.setBackgroundColor(Color.parseColor(str));
            bVar.f85327a.setTextColor(Color.parseColor(this.f85325c));
            mo104327o(bVar.f85328b, Color.parseColor(this.f85325c));
            cardView = bVar.f85330d;
            f = 1.0f;
        }
        cardView.setCardElevation(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m143839s(C35052b bVar, String str, String str2, CompoundButton compoundButton, boolean z) {
        String str3;
        StringBuilder sb;
        if (!bVar.f85328b.isChecked()) {
            this.f85326d.remove(str);
            m143837p(this.f85323a, this.f85326d);
            sb = new StringBuilder();
            str3 = "Purposes Removed : ";
        } else if (!this.f85326d.containsKey(str)) {
            this.f85326d.put(str, str2);
            m143837p(this.f85323a, this.f85326d);
            sb = new StringBuilder();
            str3 = "Purposes Added : ";
        } else {
            return;
        }
        sb.append(str3);
        sb.append(str);
        OTLogger.m143458m("OneTrust", sb.toString());
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m143840u(C35052b bVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) != 21) {
            return false;
        }
        bVar.f85328b.setChecked(!bVar.f85328b.isChecked());
        return false;
    }

    public int getItemCount() {
        return this.f85324b.length();
    }

    @C0359n0
    /* renamed from: m */
    public C35052b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35052b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_tv_purpose_filter_item, viewGroup, false));
    }

    @C0363p0
    /* renamed from: n */
    public Map<String, String> mo104326n() {
        OTLogger.m143458m("OneTrust", "Purposes to pass on apply filters : " + this.f85326d);
        return this.f85326d;
    }

    /* renamed from: o */
    public void mo104327o(@C0359n0 CheckBox checkBox, int i) {
        checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i}));
    }

    /* renamed from: q */
    public void onBindViewHolder(C35052b bVar, int i) {
        boolean z = false;
        bVar.setIsRecyclable(false);
        try {
            C35069c y = C35069c.m143925y();
            JSONObject jSONObject = this.f85324b.getJSONObject(bVar.getAdapterPosition());
            String string = jSONObject.getString("Type");
            bVar.f85327a.setText(jSONObject.getString("GroupName"));
            String string2 = jSONObject.getString("CustomGroupId");
            if (mo104326n() != null) {
                z = mo104326n().containsKey(string2);
            }
            bVar.f85328b.setChecked(z);
            String f = new C35036e().mo104304f(y.mo104419s());
            bVar.f85329c.setBackgroundColor(Color.parseColor(f));
            bVar.f85327a.setTextColor(Color.parseColor(this.f85325c));
            mo104327o(bVar.f85328b, Color.parseColor(this.f85325c));
            bVar.f85330d.setCardElevation(1.0f);
            bVar.itemView.setOnFocusChangeListener(new C35047g(this, bVar, y, f));
            bVar.f85330d.setOnKeyListener(new C35048h(bVar));
            bVar.f85328b.setOnCheckedChangeListener(new C35049i(this, bVar, string2, string));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while parsing " + e.getMessage());
        }
    }

    /* renamed from: t */
    public void mo104329t(@C0359n0 Map<String, String> map) {
        this.f85326d = new HashMap(map);
    }
}
