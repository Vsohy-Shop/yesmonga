package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.fragment.app.C19232h;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35025d;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35123w;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35239s0;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.f0 */
public class C35144f0 extends RecyclerView.Adapter<C35145a> implements C35127a {

    /* renamed from: a */
    public String f85896a;

    /* renamed from: b */
    public Context f85897b;

    /* renamed from: c */
    public String f85898c;

    /* renamed from: d */
    public String f85899d;

    /* renamed from: e */
    public String f85900e;

    /* renamed from: f */
    public ArrayList<C35025d> f85901f;

    /* renamed from: g */
    public final C35127a f85902g;

    /* renamed from: v */
    public C34964a f85903v;

    /* renamed from: w */
    public C35124x f85904w;

    /* renamed from: x */
    public C35123w f85905x;

    /* renamed from: y */
    public boolean f85906y;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.f0$a */
    public static class C35145a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f85907a;

        /* renamed from: b */
        public TextView f85908b;

        /* renamed from: c */
        public LinearLayout f85909c;

        public C35145a(View view) {
            super(view);
            this.f85908b = (TextView) view.findViewById(C35265a.C35273h.item_title);
            this.f85907a = (TextView) view.findViewById(C35265a.C35273h.item_status);
            this.f85909c = (LinearLayout) view.findViewById(C35265a.C35273h.main_layout);
        }
    }

    public C35144f0(@C0359n0 Context context, @C0359n0 ArrayList<C35025d> arrayList, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4, @C0359n0 C35127a aVar, @C0359n0 C34964a aVar2, boolean z) {
        this.f85897b = context;
        this.f85901f = arrayList;
        this.f85900e = str;
        this.f85899d = str2;
        this.f85896a = str3;
        this.f85898c = str4;
        this.f85902g = aVar;
        this.f85903v = aVar2;
        this.f85906y = z;
        try {
            C35124x xVar = new C35124x(context);
            this.f85904w = xVar;
            this.f85905x = xVar.mo105013d(this.f85903v);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error in parsing ucp data " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m144768n(C35239s0 s0Var, C35145a aVar, View view) {
        if (!s0Var.isAdded()) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("TOPIC_PREF_ARRAY", this.f85901f);
            bundle.putString("ITEM_LABEL", this.f85900e);
            bundle.putString("ITEM_DESC", this.f85899d);
            bundle.putInt("ITEM_POSITION", aVar.getAdapterPosition());
            bundle.putString("DESC_TEXT_COLOR", this.f85896a);
            bundle.putString("TITLE_TEXT_COLOR", this.f85898c);
            bundle.putBoolean("PURPOSE_TOGGLE_STATE", this.f85906y);
            s0Var.setArguments(bundle);
            s0Var.mo105463T0(this.f85903v);
            s0Var.mo105464U0(this.f85902g);
            C19232h hVar = (C19232h) this.f85897b;
            Objects.requireNonNull(hVar);
            s0Var.show(hVar.mo57175g0(), OTFragmentTags.OT_CONSENT_PREF_FRAGMENT_TAG);
        }
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        C35127a aVar = this.f85902g;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    public int getItemCount() {
        return this.f85901f.size();
    }

    @C0359n0
    /* renamed from: l */
    public C35145a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35145a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_uc_purposes_item_list, viewGroup, false));
    }

    /* renamed from: m */
    public void onBindViewHolder(C35145a aVar, int i) {
        aVar.f85908b.setText(this.f85901f.get(aVar.getAdapterPosition()).mo104252a());
        aVar.f85908b.setTextColor(Color.parseColor(this.f85896a));
        if (!C35020d.m143605J(this.f85905x.mo105003i())) {
            aVar.f85907a.setText(this.f85905x.mo105003i());
        } else {
            aVar.f85907a.setText(C35265a.C35278m.str_ot_options);
        }
        aVar.f85909c.setOnClickListener(new C35142e0(this, C35239s0.m145276Q0(OTFragmentTags.OT_CONSENT_PREF_FRAGMENT_TAG), aVar));
    }
}
