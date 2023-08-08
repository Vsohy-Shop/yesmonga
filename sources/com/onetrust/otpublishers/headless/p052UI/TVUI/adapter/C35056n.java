package com.onetrust.otpublishers.headless.p052UI.TVUI.adapter;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35070d;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35071e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.n */
public class C35056n extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: a */
    public JSONObject f85337a;

    /* renamed from: b */
    public final C35070d f85338b = C35070d.m143959g();

    /* renamed from: c */
    public C35058b f85339c;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.n$a */
    public static class C35057a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85340a;

        /* renamed from: b */
        public TextView f85341b;

        /* renamed from: c */
        public TextView f85342c;

        /* renamed from: d */
        public TextView f85343d;

        /* renamed from: e */
        public TextView f85344e;

        /* renamed from: f */
        public TextView f85345f;

        /* renamed from: g */
        public TextView f85346g;

        /* renamed from: h */
        public TextView f85347h;

        /* renamed from: i */
        public TextView f85348i;

        /* renamed from: j */
        public TextView f85349j;

        /* renamed from: k */
        public LinearLayout f85350k;

        /* renamed from: l */
        public LinearLayout f85351l;

        /* renamed from: m */
        public LinearLayout f85352m;

        /* renamed from: n */
        public LinearLayout f85353n;

        /* renamed from: o */
        public LinearLayout f85354o;

        public C35057a(View view) {
            super(view);
            this.f85340a = (TextView) view.findViewById(C35265a.C35273h.disclosure_id_label);
            this.f85341b = (TextView) view.findViewById(C35265a.C35273h.disclosure_type_label);
            this.f85342c = (TextView) view.findViewById(C35265a.C35273h.disclosure_ls_label);
            this.f85343d = (TextView) view.findViewById(C35265a.C35273h.disclosure_domain_label);
            this.f85344e = (TextView) view.findViewById(C35265a.C35273h.disclosure_purpose_label);
            this.f85345f = (TextView) view.findViewById(C35265a.C35273h.disclosure_id_val);
            this.f85346g = (TextView) view.findViewById(C35265a.C35273h.disclosure_type_val);
            this.f85347h = (TextView) view.findViewById(C35265a.C35273h.disclosure_ls_val);
            this.f85348i = (TextView) view.findViewById(C35265a.C35273h.disclosure_domain_val);
            this.f85349j = (TextView) view.findViewById(C35265a.C35273h.disclosure_purpose_val);
            this.f85350k = (LinearLayout) view.findViewById(C35265a.C35273h.disclosure_id_lyt);
            this.f85351l = (LinearLayout) view.findViewById(C35265a.C35273h.disclosure_type_lyt);
            this.f85352m = (LinearLayout) view.findViewById(C35265a.C35273h.disclosure_ls_lyt);
            this.f85353n = (LinearLayout) view.findViewById(C35265a.C35273h.disclosure_domain_lyt);
            this.f85354o = (LinearLayout) view.findViewById(C35265a.C35273h.disclosure_purpose_lyt);
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.n$b */
    public interface C35058b {
        /* renamed from: a */
        void mo104338a();
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.n$c */
    public static class C35059c extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85355a;

        public C35059c(View view) {
            super(view);
            this.f85355a = (TextView) view.findViewById(C35265a.C35273h.tv_vd_purpose_item);
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.n$d */
    public static class C35060d extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85356a;

        public C35060d(View view) {
            super(view);
            this.f85356a = (TextView) view.findViewById(C35265a.C35273h.tv_vd_purpose_title);
        }
    }

    public C35056n(@C0359n0 JSONObject jSONObject, C35058b bVar) {
        this.f85337a = jSONObject;
        this.f85339c = bVar;
    }

    /* renamed from: n */
    public static void m143854n(@C0359n0 TextView textView, @C0359n0 String str, @C0359n0 TextView textView2, @C0359n0 String str2, @C0359n0 LinearLayout linearLayout) {
        if (!C35020d.m143605J(str2)) {
            textView.setText(str);
            textView2.setText(str2);
            return;
        }
        linearLayout.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ boolean m143855s(C35057a aVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) == 24) {
            this.f85339c.mo104338a();
            aVar.itemView.setFocusable(false);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ boolean m143856t(C35059c cVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) == 24) {
            this.f85339c.mo104338a();
            cVar.itemView.setFocusable(false);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ boolean m143857u(C35060d dVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) == 24) {
            this.f85339c.mo104338a();
            dVar.itemView.setFocusable(false);
        }
        return false;
    }

    public int getItemCount() {
        JSONObject jSONObject = this.f85337a;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.length();
    }

    public int getItemViewType(int i) {
        try {
            JSONObject jSONObject = this.f85337a;
            return jSONObject.getInt(jSONObject.names().get(i).toString());
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while getting view type " + e.getMessage());
            return 0;
        }
    }

    /* renamed from: o */
    public final void mo104334o(C35057a aVar, int i) {
        String optString = this.f85337a.names().optString(i);
        C35071e m = C35071e.m143968m();
        String h = this.f85338b.mo104432h();
        aVar.itemView.setFocusable(true);
        try {
            JSONObject jSONObject = new JSONObject(optString);
            long optLong = jSONObject.optLong("maxAgeSeconds");
            m143854n(aVar.f85344e, m.mo104440g(), aVar.f85349j, m.mo104437d(jSONObject), aVar.f85354o);
            m143854n(aVar.f85340a, m.mo104436c(), aVar.f85345f, m.mo104435b(jSONObject), aVar.f85350k);
            m143854n(aVar.f85341b, m.mo104443j(), aVar.f85346g, jSONObject.optString("type"), aVar.f85351l);
            m143854n(aVar.f85343d, m.mo104434a(), aVar.f85348i, jSONObject.optString("domain"), aVar.f85353n);
            m143854n(aVar.f85342c, m.mo104438e(), aVar.f85347h, new UIUtils().mo104272g(optLong, this.f85338b.mo104427b(aVar.itemView.getContext())), aVar.f85352m);
            aVar.f85344e.setTextColor(Color.parseColor(h));
            aVar.f85340a.setTextColor(Color.parseColor(h));
            aVar.f85343d.setTextColor(Color.parseColor(h));
            aVar.f85342c.setTextColor(Color.parseColor(h));
            aVar.f85341b.setTextColor(Color.parseColor(h));
            aVar.f85349j.setTextColor(Color.parseColor(h));
            aVar.f85345f.setTextColor(Color.parseColor(h));
            aVar.f85348i.setTextColor(Color.parseColor(h));
            aVar.f85347h.setTextColor(Color.parseColor(h));
            aVar.f85346g.setTextColor(Color.parseColor(h));
            aVar.itemView.setOnKeyListener(new C35054l(this, aVar));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "exception thrown while populating disclosure items, err : " + e.toString());
        }
    }

    public void onBindViewHolder(RecyclerView.C20061e0 e0Var, int i) {
        int itemViewType = e0Var.getItemViewType();
        if (itemViewType == 1) {
            mo104336q((C35060d) e0Var, i);
        } else if (itemViewType == 2) {
            mo104335p((C35059c) e0Var, i);
        } else if (itemViewType == 3) {
            mo104334o((C35057a) e0Var, i);
        }
    }

    @C0359n0
    public RecyclerView.C20061e0 onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C35060d(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_tv_vendor_details_purpose_title_item, viewGroup, false));
        }
        if (i == 2) {
            return new C35059c(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_tv_vendor_details_purpose_item, viewGroup, false));
        }
        if (i == 3) {
            return new C35057a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_tv_vendor_disclosure_item, viewGroup, false));
        }
        throw new RuntimeException("Invalid view type found");
    }

    /* renamed from: p */
    public final void mo104335p(C35059c cVar, int i) {
        cVar.f85355a.setText(this.f85337a.names().optString(i));
        cVar.f85355a.setTextColor(Color.parseColor(this.f85338b.mo104432h()));
        C35036e.m143802d(cVar.f85355a, this.f85338b.mo104432h());
        cVar.itemView.setFocusable(true);
        cVar.itemView.setOnKeyListener(new C35053k(this, cVar));
    }

    /* renamed from: q */
    public final void mo104336q(C35060d dVar, int i) {
        dVar.f85356a.setText(this.f85337a.names().optString(i));
        dVar.f85356a.setTextColor(Color.parseColor(this.f85338b.mo104432h()));
        dVar.itemView.setFocusable(true);
        dVar.itemView.setOnKeyListener(new C35055m(this, dVar));
    }

    /* renamed from: r */
    public void mo104337r(@C0359n0 JSONObject jSONObject) {
        this.f85337a = jSONObject;
    }
}
