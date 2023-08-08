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
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35021a;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35123w;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35239s0;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.z */
public class C35185z extends RecyclerView.Adapter<C35186a> implements C35127a {

    /* renamed from: a */
    public final C35127a f86118a;

    /* renamed from: b */
    public String f86119b;

    /* renamed from: c */
    public Context f86120c;

    /* renamed from: d */
    public String f86121d;

    /* renamed from: e */
    public String f86122e;

    /* renamed from: f */
    public String f86123f;

    /* renamed from: g */
    public C34964a f86124g;

    /* renamed from: v */
    public ArrayList<C35021a> f86125v;

    /* renamed from: w */
    public C35124x f86126w;

    /* renamed from: x */
    public C35123w f86127x;

    /* renamed from: y */
    public boolean f86128y;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.z$a */
    public static class C35186a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f86129a;

        /* renamed from: b */
        public TextView f86130b;

        /* renamed from: c */
        public LinearLayout f86131c;

        public C35186a(View view) {
            super(view);
            this.f86130b = (TextView) view.findViewById(C35265a.C35273h.item_title);
            this.f86129a = (TextView) view.findViewById(C35265a.C35273h.item_status);
            this.f86131c = (LinearLayout) view.findViewById(C35265a.C35273h.main_layout);
        }
    }

    public C35185z(@C0359n0 Context context, @C0359n0 ArrayList<C35021a> arrayList, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4, @C0359n0 C35127a aVar, @C0359n0 C34964a aVar2, boolean z) {
        this.f86120c = context;
        this.f86125v = arrayList;
        this.f86123f = str;
        this.f86122e = str2;
        this.f86119b = str3;
        this.f86121d = str4;
        this.f86118a = aVar;
        this.f86124g = aVar2;
        this.f86128y = z;
        try {
            C35124x xVar = new C35124x(context);
            this.f86126w = xVar;
            this.f86127x = xVar.mo105013d(this.f86124g);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error in parsing ucp data " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m144962n(C35239s0 s0Var, C35186a aVar, View view) {
        if (!s0Var.isAdded()) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("CUSTOM_PREF_ARRAY", this.f86125v);
            bundle.putString("ITEM_LABEL", this.f86123f);
            bundle.putString("ITEM_DESC", this.f86122e);
            bundle.putInt("ITEM_POSITION", aVar.getAdapterPosition());
            bundle.putString("DESC_TEXT_COLOR", this.f86119b);
            bundle.putString("TITLE_TEXT_COLOR", this.f86121d);
            bundle.putBoolean("PURPOSE_TOGGLE_STATE", this.f86128y);
            s0Var.setArguments(bundle);
            s0Var.mo105463T0(this.f86124g);
            s0Var.mo105464U0(this.f86118a);
            C19232h hVar = (C19232h) this.f86120c;
            Objects.requireNonNull(hVar);
            s0Var.show(hVar.mo57175g0(), OTFragmentTags.OT_CONSENT_PREF_OPTION_FRAGMENT_TAG);
        }
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        C35127a aVar = this.f86118a;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    public int getItemCount() {
        return this.f86125v.size();
    }

    @C0359n0
    /* renamed from: l */
    public C35186a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35186a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_uc_purposes_item_list, viewGroup, false));
    }

    /* renamed from: m */
    public void onBindViewHolder(C35186a aVar, int i) {
        aVar.f86130b.setText(this.f86125v.get(aVar.getAdapterPosition()).mo104197a());
        aVar.f86130b.setTextColor(Color.parseColor(this.f86119b));
        if (!C35020d.m143605J(this.f86127x.mo105003i())) {
            aVar.f86129a.setText(this.f86127x.mo105003i());
        } else {
            aVar.f86129a.setText(C35265a.C35278m.str_ot_options);
        }
        aVar.f86131c.setOnClickListener(new C35184y(this, C35239s0.m145276Q0(OTFragmentTags.OT_CONSENT_PREF_OPTION_FRAGMENT_TAG), aVar));
    }
}
