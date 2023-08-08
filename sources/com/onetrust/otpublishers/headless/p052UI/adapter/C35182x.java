package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C17318d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35021a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35023b;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35024c;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35025d;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35123w;
import java.util.ArrayList;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.x */
public class C35182x extends RecyclerView.Adapter<C35183a> implements C35127a {

    /* renamed from: a */
    public final C35127a f86098a;

    /* renamed from: b */
    public String f86099b;

    /* renamed from: c */
    public String f86100c;

    /* renamed from: d */
    public String f86101d;

    /* renamed from: e */
    public Context f86102e;

    /* renamed from: f */
    public String f86103f;

    /* renamed from: g */
    public RecyclerView.C20087v f86104g;

    /* renamed from: v */
    public ArrayList<C35023b> f86105v;

    /* renamed from: w */
    public C35185z f86106w;

    /* renamed from: x */
    public C35144f0 f86107x;

    /* renamed from: y */
    public C35123w f86108y;

    /* renamed from: z */
    public C34964a f86109z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.x$a */
    public static class C35183a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public TextView f86110a;

        /* renamed from: b */
        public TextView f86111b;

        /* renamed from: c */
        public SwitchCompat f86112c;

        /* renamed from: d */
        public RecyclerView f86113d;

        /* renamed from: e */
        public RecyclerView f86114e;

        public C35183a(View view) {
            super(view);
            this.f86111b = (TextView) view.findViewById(C35265a.C35273h.purpose_name);
            this.f86110a = (TextView) view.findViewById(C35265a.C35273h.purpose_description);
            this.f86114e = (RecyclerView) view.findViewById(C35265a.C35273h.consent_preferences_list_child);
            this.f86113d = (RecyclerView) view.findViewById(C35265a.C35273h.consent_preferences_list_topic);
            this.f86112c = (SwitchCompat) view.findViewById(C35265a.C35273h.purpose_toggle);
        }
    }

    public C35182x(@C0359n0 Context context, @C0359n0 C35123w wVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 C35127a aVar, @C0359n0 C34964a aVar2) {
        this.f86102e = context;
        this.f86108y = wVar;
        this.f86105v = wVar.mo105000f();
        this.f86103f = str;
        this.f86099b = str2;
        this.f86098a = aVar;
        this.f86109z = aVar2;
    }

    /* renamed from: n */
    public static void m144947n(C35023b bVar) {
        ArrayList<C35021a> i = bVar.mo104222i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            ArrayList<C35024c> d = i.get(i2).mo104200d();
            for (int i3 = 0; i3 < d.size(); i3++) {
                d.get(i3).mo104250t("OPT_OUT");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m144948o(C35023b bVar, C35183a aVar, int i, View view) {
        this.f86109z.mo103627y(bVar.mo104217d(), aVar.f86112c.isChecked());
        if (aVar.f86112c.isChecked()) {
            mo105236r(aVar.f86112c);
            this.f86105v.get(i).mo104228o("ACTIVE");
            mo105235q(aVar, bVar, true);
            return;
        }
        mo105233m(aVar.f86112c);
        this.f86105v.get(i).mo104228o("OPT_OUT");
        mo105235q(aVar, bVar, false);
        m144949s(bVar);
        m144947n(bVar);
    }

    /* renamed from: s */
    public static void m144949s(C35023b bVar) {
        ArrayList<C35025d> k = bVar.mo104224k();
        for (int i = 0; i < k.size(); i++) {
            ArrayList<C35024c> d = k.get(i).mo104255d();
            for (int i2 = 0; i2 < d.size(); i2++) {
                d.get(i2).mo104250t("OPT_OUT");
            }
        }
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        C35127a aVar = this.f86098a;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    public int getItemCount() {
        return this.f86105v.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @C0359n0
    /* renamed from: l */
    public C35183a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35183a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_uc_purposes_list, viewGroup, false));
    }

    /* renamed from: m */
    public final void mo105233m(@C0359n0 SwitchCompat switchCompat) {
        switchCompat.getTrackDrawable().setTint(C17318d.m79723f(this.f86102e, C35265a.C35270e.light_greyOT));
        switchCompat.getThumbDrawable().setTint(C17318d.m79723f(this.f86102e, C35265a.C35270e.contentTextColorOT));
    }

    /* renamed from: p */
    public void onBindViewHolder(C35183a aVar, int i) {
        int adapterPosition = aVar.getAdapterPosition();
        C35023b bVar = this.f86105v.get(adapterPosition);
        boolean z = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(aVar.f86114e.getContext(), 1, false);
        linearLayoutManager.mo59402e3(bVar.mo104222i().size());
        aVar.f86114e.setLayoutManager(linearLayoutManager);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(aVar.f86113d.getContext(), 1, false);
        linearLayoutManager2.mo59402e3(bVar.mo104224k().size());
        aVar.f86113d.setLayoutManager(linearLayoutManager2);
        if (!C35020d.m143605J(bVar.mo104220g())) {
            this.f86100c = bVar.mo104220g();
        }
        if (!C35020d.m143605J(bVar.mo104214a())) {
            this.f86101d = bVar.mo104214a();
        }
        OTLogger.m143447b("OTConsentPreferencesAdapter", "error in setting subgroup consent parent " + bVar.mo104224k().size());
        aVar.f86114e.setRecycledViewPool(this.f86104g);
        aVar.f86113d.setRecycledViewPool(this.f86104g);
        if (this.f86109z.mo103596I(bVar.mo104217d()) != 1) {
            z = false;
        }
        aVar.f86112c.setChecked(z);
        SwitchCompat e = aVar.f86112c;
        if (z) {
            mo105236r(e);
        } else {
            mo105233m(e);
        }
        aVar.f86111b.setText(this.f86100c);
        aVar.f86111b.setTextColor(Color.parseColor(this.f86103f));
        aVar.f86110a.setText(this.f86101d);
        aVar.f86110a.setTextColor(Color.parseColor(this.f86099b));
        aVar.f86112c.setOnClickListener(new C35181w(this, bVar, aVar, adapterPosition));
        mo105235q(aVar, bVar, aVar.f86112c.isChecked());
    }

    /* renamed from: q */
    public final void mo105235q(C35183a aVar, C35023b bVar, boolean z) {
        this.f86107x = new C35144f0(this.f86102e, bVar.mo104224k(), this.f86100c, this.f86101d, this.f86099b, this.f86103f, this.f86098a, this.f86109z, z);
        this.f86106w = new C35185z(this.f86102e, bVar.mo104222i(), this.f86100c, this.f86101d, this.f86099b, this.f86103f, this.f86098a, this.f86109z, z);
        aVar.f86113d.setAdapter(this.f86107x);
        aVar.f86114e.setAdapter(this.f86106w);
    }

    /* renamed from: r */
    public final void mo105236r(@C0359n0 SwitchCompat switchCompat) {
        switchCompat.getTrackDrawable().setTint(C17318d.m79723f(this.f86102e, C35265a.C35270e.light_greyOT));
        switchCompat.getThumbDrawable().setTint(C17318d.m79723f(this.f86102e, C35265a.C35270e.colorPrimaryOT));
    }
}
