package com.onetrust.otpublishers.headless.p052UI.TVUI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35068b;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.f */
public class C35044f extends RecyclerView.Adapter<C35046b> {

    /* renamed from: a */
    public C35045a f85303a;

    /* renamed from: b */
    public JSONArray f85304b;

    /* renamed from: c */
    public Context f85305c;

    /* renamed from: d */
    public OTPublishersHeadlessSDK f85306d;

    /* renamed from: e */
    public C35068b f85307e = C35068b.m143905i();

    /* renamed from: f */
    public C35069c f85308f = C35069c.m143925y();

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.f$a */
    public interface C35045a {
        /* renamed from: a */
        void mo104320a();

        /* renamed from: e */
        void mo104321e(JSONObject jSONObject, boolean z);
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.f$b */
    public static class C35046b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85309a;

        /* renamed from: b */
        public TextView f85310b;

        /* renamed from: c */
        public TextView f85311c;

        /* renamed from: d */
        public ImageView f85312d;

        /* renamed from: e */
        public LinearLayout f85313e;

        public C35046b(View view) {
            super(view);
            this.f85310b = (TextView) view.findViewById(C35265a.C35273h.tv_grp_name);
            this.f85311c = (TextView) view.findViewById(C35265a.C35273h.always_active_textview);
            this.f85309a = (TextView) view.findViewById(C35265a.C35273h.group_status_text);
            this.f85312d = (ImageView) view.findViewById(C35265a.C35273h.group_show_more);
            this.f85313e = (LinearLayout) view.findViewById(C35265a.C35273h.tv_grp_layout);
        }
    }

    public C35044f(@C0359n0 JSONArray jSONArray, @C0359n0 Context context, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, C35045a aVar) {
        this.f85305c = context;
        this.f85304b = jSONArray;
        this.f85306d = oTPublishersHeadlessSDK;
        this.f85303a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m143823o(C35046b bVar, String str, View view, boolean z) {
        if (z) {
            mo104319p(bVar, this.f85308f.mo104402J().mo104784g(), this.f85308f.mo104402J().mo104782e());
        } else {
            mo104319p(bVar, this.f85308f.mo104393A(), str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ boolean m143824q(C35046b bVar, View view, int i, KeyEvent keyEvent) {
        if (C35036e.m143801a(i, keyEvent) == 22 || C35036e.m143801a(i, keyEvent) == 21) {
            try {
                this.f85303a.mo104321e(this.f85304b.getJSONObject(bVar.getAdapterPosition()), true);
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "Error in navigating to subgroups : " + e.getMessage());
            }
        }
        if (C35036e.m143801a(i, keyEvent) != 24) {
            return false;
        }
        this.f85303a.mo104320a();
        return false;
    }

    public int getItemCount() {
        JSONArray jSONArray = this.f85304b;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: m */
    public C35046b onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return new C35046b(LayoutInflater.from(this.f85305c).inflate(C35265a.C35276k.ot_pc_groupitem_tv, viewGroup, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b3 A[Catch:{ JSONException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ba A[Catch:{ JSONException -> 0x00ea }] */
    @androidx.annotation.C0376v0(api = 21)
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(@androidx.annotation.C0359n0 com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35044f.C35046b r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Type"
            org.json.JSONArray r1 = r7.f85304b     // Catch:{ JSONException -> 0x00ea }
            int r2 = r8.getAdapterPosition()     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r2 = "Status"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r2 = "always"
            boolean r1 = r1.contains(r2)     // Catch:{ JSONException -> 0x00ea }
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L_0x0059
            org.json.JSONArray r1 = r7.f85304b     // Catch:{ JSONException -> 0x00ea }
            int r4 = r8.getAdapterPosition()     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONObject r1 = r1.getJSONObject(r4)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r4 = "IAB2_SPL_PURPOSE"
            boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x00ea }
            if (r1 != 0) goto L_0x0059
            org.json.JSONArray r1 = r7.f85304b     // Catch:{ JSONException -> 0x00ea }
            int r4 = r8.getAdapterPosition()     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONObject r1 = r1.getJSONObject(r4)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r1 = "IAB2_FEATURE"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x00ea }
            if (r0 == 0) goto L_0x004a
            goto L_0x0059
        L_0x004a:
            android.widget.TextView r0 = r8.f85311c     // Catch:{ JSONException -> 0x00ea }
            r0.setVisibility(r2)     // Catch:{ JSONException -> 0x00ea }
            android.widget.TextView r0 = r8.f85309a     // Catch:{ JSONException -> 0x00ea }
            r0.setVisibility(r3)     // Catch:{ JSONException -> 0x00ea }
            goto L_0x0076
        L_0x0059:
            android.widget.TextView r0 = r8.f85311c     // Catch:{ JSONException -> 0x00ea }
            r0.setVisibility(r3)     // Catch:{ JSONException -> 0x00ea }
            android.widget.TextView r0 = r8.f85311c     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.UI.TVUI.datautils.c r1 = com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c.m143925y()     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r1 = r1.mo104413m()     // Catch:{ JSONException -> 0x00ea }
            r0.setText(r1)     // Catch:{ JSONException -> 0x00ea }
            android.widget.TextView r0 = r8.f85309a     // Catch:{ JSONException -> 0x00ea }
            r0.setVisibility(r2)     // Catch:{ JSONException -> 0x00ea }
        L_0x0076:
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = new com.onetrust.otpublishers.headless.UI.Helper.UIUtils     // Catch:{ JSONException -> 0x00ea }
            r0.<init>()     // Catch:{ JSONException -> 0x00ea }
            android.content.Context r1 = r7.f85305c     // Catch:{ JSONException -> 0x00ea }
            android.widget.TextView r2 = r8.f85310b     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.UI.Helper.e r4 = new com.onetrust.otpublishers.headless.UI.Helper.e     // Catch:{ JSONException -> 0x00ea }
            r4.<init>()     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONArray r5 = r7.f85304b     // Catch:{ JSONException -> 0x00ea }
            int r6 = r8.getAdapterPosition()     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r4 = r4.mo104303c(r5)     // Catch:{ JSONException -> 0x00ea }
            r0.mo104279r(r1, r2, r4)     // Catch:{ JSONException -> 0x00ea }
            android.widget.ImageView r0 = r8.f85312d     // Catch:{ JSONException -> 0x00ea }
            r0.setVisibility(r3)     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK r0 = r7.f85306d     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONArray r1 = r7.f85304b     // Catch:{ JSONException -> 0x00ea }
            org.json.JSONObject r9 = r1.getJSONObject(r9)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r1 = "CustomGroupId"
            java.lang.String r9 = r9.getString(r1)     // Catch:{ JSONException -> 0x00ea }
            int r9 = r0.getPurposeConsentLocal(r9)     // Catch:{ JSONException -> 0x00ea }
            r0 = 1
            if (r9 != r0) goto L_0x00ba
            com.onetrust.otpublishers.headless.UI.TVUI.datautils.b r9 = r7.f85307e     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r9 = r9.mo104376a()     // Catch:{ JSONException -> 0x00ea }
            goto L_0x00c0
        L_0x00ba:
            com.onetrust.otpublishers.headless.UI.TVUI.datautils.b r9 = r7.f85307e     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r9 = r9.mo104383h()     // Catch:{ JSONException -> 0x00ea }
        L_0x00c0:
            android.widget.TextView r0 = r8.f85309a     // Catch:{ JSONException -> 0x00ea }
            r0.setText(r9)     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.UI.Helper.e r9 = new com.onetrust.otpublishers.headless.UI.Helper.e     // Catch:{ JSONException -> 0x00ea }
            r9.<init>()     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.UI.TVUI.datautils.c r0 = r7.f85308f     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r0 = r0.mo104419s()     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r9 = r9.mo104304f(r0)     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.UI.TVUI.datautils.c r0 = r7.f85308f     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r0 = r0.mo104393A()     // Catch:{ JSONException -> 0x00ea }
            r7.mo104319p(r8, r0, r9)     // Catch:{ JSONException -> 0x00ea }
            android.view.View r0 = r8.itemView     // Catch:{ JSONException -> 0x00ea }
            com.onetrust.otpublishers.headless.UI.TVUI.adapter.d r1 = new com.onetrust.otpublishers.headless.UI.TVUI.adapter.d     // Catch:{ JSONException -> 0x00ea }
            r1.<init>(r7, r8, r9)     // Catch:{ JSONException -> 0x00ea }
            r0.setOnFocusChangeListener(r1)     // Catch:{ JSONException -> 0x00ea }
            goto L_0x0105
        L_0x00ea:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error while rendering subgroup "
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "OneTrust"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r0, r9)
        L_0x0105:
            android.view.View r9 = r8.itemView
            com.onetrust.otpublishers.headless.UI.TVUI.adapter.e r0 = new com.onetrust.otpublishers.headless.UI.TVUI.adapter.e
            r0.<init>(r7, r8)
            r9.setOnKeyListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35044f.onBindViewHolder(com.onetrust.otpublishers.headless.UI.TVUI.adapter.f$b, int):void");
    }

    @C0376v0(api = 21)
    /* renamed from: p */
    public final void mo104319p(@C0359n0 C35046b bVar, @C0359n0 String str, @C0359n0 String str2) {
        bVar.f85313e.setBackgroundColor(Color.parseColor(str2));
        bVar.f85310b.setTextColor(Color.parseColor(str));
        bVar.f85309a.setTextColor(Color.parseColor(str));
        bVar.f85311c.setTextColor(Color.parseColor(str));
        bVar.f85312d.getDrawable().setTint(Color.parseColor(str));
    }
}
