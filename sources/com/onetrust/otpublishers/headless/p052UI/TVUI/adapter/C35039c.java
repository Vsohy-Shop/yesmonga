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
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35113m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.c */
public class C35039c extends RecyclerView.Adapter<C35041b> {

    /* renamed from: a */
    public C35040a f85291a;

    /* renamed from: b */
    public JSONArray f85292b;

    /* renamed from: c */
    public C35069c f85293c = C35069c.m143925y();

    /* renamed from: d */
    public int f85294d;

    /* renamed from: e */
    public boolean f85295e;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.c$a */
    public interface C35040a {
        /* renamed from: E */
        void mo104312E(int i);

        /* renamed from: S */
        void mo104313S(JSONObject jSONObject, boolean z);

        /* renamed from: a */
        void mo104314a();
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.c$b */
    public static class C35041b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85296a;

        /* renamed from: b */
        public LinearLayout f85297b;

        public C35041b(View view) {
            super(view);
            this.f85296a = (TextView) view.findViewById(C35265a.C35273h.tv_grp_name);
            this.f85297b = (LinearLayout) view.findViewById(C35265a.C35273h.tv_grp_layout);
        }
    }

    public C35039c(@C0359n0 JSONArray jSONArray, @C0359n0 C35040a aVar) {
        this.f85292b = jSONArray;
        this.f85291a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m143811p(JSONObject jSONObject, C35041b bVar, C35113m mVar, View view, boolean z) {
        if (z) {
            this.f85291a.mo104313S(jSONObject, false);
            bVar.f85297b.setBackgroundColor(Color.parseColor(mVar.mo104782e()));
            bVar.f85296a.setTextColor(Color.parseColor(mVar.mo104784g()));
            this.f85295e = false;
        } else if (!this.f85295e) {
            bVar.f85297b.setBackgroundColor(Color.parseColor(mVar.mo104786i()));
            bVar.f85296a.setTextColor(Color.parseColor(mVar.mo104788k()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ boolean m143812q(C35041b bVar, C35113m mVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) == 22) {
            this.f85295e = false;
            int adapterPosition = bVar.getAdapterPosition();
            this.f85294d = adapterPosition;
            this.f85291a.mo104312E(adapterPosition);
            bVar.f85297b.setBackgroundColor(Color.parseColor(mVar.mo104778a()));
            bVar.f85296a.setTextColor(Color.parseColor(mVar.mo104780c()));
            return true;
        }
        if (C35036e.m143801a(i, keyEvent) == 24) {
            this.f85291a.mo104314a();
            this.f85295e = false;
        }
        if (bVar.getAdapterPosition() != 0 || C35036e.m143801a(i, keyEvent) != 25) {
            return false;
        }
        bVar.f85297b.requestFocus();
        return true;
    }

    public int getItemCount() {
        return this.f85292b.length();
    }

    @C0359n0
    /* renamed from: m */
    public C35041b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35041b(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_pc_list_item_tv, viewGroup, false));
    }

    /* renamed from: n */
    public void onViewAttachedToWindow(@C0359n0 C35041b bVar) {
        super.onViewAttachedToWindow(bVar);
        this.f85295e = false;
        if (bVar.getAdapterPosition() == this.f85294d) {
            bVar.itemView.requestFocus();
        }
    }

    /* renamed from: o */
    public void onBindViewHolder(C35041b bVar, int i) {
        StringBuilder sb;
        try {
            this.f85295e = false;
            C35113m J = this.f85293c.mo104402J();
            JSONObject jSONObject = this.f85292b.getJSONObject(bVar.getAdapterPosition());
            bVar.f85296a.setTextColor(Color.parseColor(this.f85293c.mo104402J().mo104788k()));
            bVar.f85297b.setBackgroundColor(Color.parseColor(J.mo104786i()));
            new UIUtils().mo104279r(bVar.f85297b.getContext(), bVar.f85296a, new C35036e().mo104303c(jSONObject));
            bVar.itemView.setOnFocusChangeListener(new C35037a(this, jSONObject, bVar, J));
            bVar.itemView.setOnKeyListener(new C35038b(this, bVar, J));
            return;
        } catch (JSONException e) {
            sb = new StringBuilder();
            sb.append("TV PC: error in rendering groups ");
            sb.append(e.getMessage());
        } catch (StringIndexOutOfBoundsException e2) {
            sb = new StringBuilder();
            sb.append("TV PC: error in rendering groups due to corrupted data,  ");
            sb.append(e2);
        }
        OTLogger.m143457l("OneTrust", sb.toString());
    }
}
