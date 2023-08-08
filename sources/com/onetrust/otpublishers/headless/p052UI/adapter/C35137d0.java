package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35024c;
import java.util.List;
import java.util.Objects;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.d0 */
public class C35137d0 extends RecyclerView.Adapter<C35138a> implements C35127a {

    /* renamed from: a */
    public String f85862a;

    /* renamed from: b */
    public String f85863b;

    /* renamed from: c */
    public int f85864c = -1;

    /* renamed from: d */
    public RadioButton f85865d = null;

    /* renamed from: e */
    public List<C35024c> f85866e;

    /* renamed from: f */
    public C34964a f85867f;

    /* renamed from: g */
    public boolean f85868g;

    /* renamed from: com.onetrust.otpublishers.headless.UI.adapter.d0$a */
    public static class C35138a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public CheckBox f85869a;

        /* renamed from: b */
        public RadioButton f85870b;

        public C35138a(View view) {
            super(view);
            this.f85869a = (CheckBox) view.findViewById(C35265a.C35273h.multi_selection);
            this.f85870b = (RadioButton) view.findViewById(C35265a.C35273h.single_selection);
        }
    }

    public C35137d0(@C0359n0 List<C35024c> list, @C0359n0 String str, String str2, @C0359n0 C34964a aVar, boolean z) {
        this.f85866e = list;
        this.f85863b = str;
        this.f85862a = str2;
        this.f85867f = aVar;
        this.f85868g = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m144732p(C35138a aVar, int i, View view) {
        String str;
        C35024c cVar;
        if (aVar.f85869a.isChecked()) {
            this.f85867f.mo103609f(this.f85866e.get(i).mo104231a(), this.f85866e.get(i).mo104241k(), true, this.f85866e.get(i).mo104233c());
            cVar = this.f85866e.get(i);
            str = "OPT_IN";
        } else {
            this.f85867f.mo103609f(this.f85866e.get(i).mo104231a(), this.f85866e.get(i).mo104241k(), false, this.f85866e.get(i).mo104233c());
            cVar = this.f85866e.get(i);
            str = "OPT_OUT";
        }
        cVar.mo104250t(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m144733q(C35138a aVar, View view) {
        RadioButton radioButton = this.f85865d;
        if (radioButton != null) {
            radioButton.setChecked(false);
        }
        aVar.f85870b.setChecked(true);
        this.f85865d = aVar.f85870b;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m144734r(C35138a aVar, int i, View view) {
        String str;
        C35024c cVar;
        if (aVar.f85869a.isChecked()) {
            C34964a aVar2 = this.f85867f;
            String m = this.f85866e.get(i).mo104243m();
            String c = this.f85866e.get(i).mo104233c();
            Objects.requireNonNull(c);
            aVar2.mo103593F(m, c, true);
            cVar = this.f85866e.get(i);
            str = "OPT_IN";
        } else {
            C34964a aVar3 = this.f85867f;
            String m2 = this.f85866e.get(i).mo104243m();
            String c2 = this.f85866e.get(i).mo104233c();
            Objects.requireNonNull(c2);
            aVar3.mo103593F(m2, c2, false);
            cVar = this.f85866e.get(i);
            str = "OPT_OUT";
        }
        cVar.mo104250t(str);
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 4) {
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        return this.f85866e.size();
    }

    @C0359n0
    /* renamed from: n */
    public C35138a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C35138a(LayoutInflater.from(viewGroup.getContext()).inflate(C35265a.C35276k.ot_uc_purposes_options_item, viewGroup, false));
    }

    /* renamed from: o */
    public void onBindViewHolder(C35138a aVar, int i) {
        int adapterPosition = aVar.getAdapterPosition();
        aVar.f85869a.setEnabled(this.f85868g);
        boolean z = true;
        if (this.f85863b.equals("customPrefOptionType")) {
            if ("MULTI_CHOICE".equals(this.f85862a)) {
                aVar.f85870b.setVisibility(8);
                aVar.f85869a.setVisibility(0);
                aVar.f85869a.setText(this.f85866e.get(adapterPosition).mo104235e());
                CheckBox c = aVar.f85869a;
                if (this.f85867f.mo103605b(this.f85866e.get(adapterPosition).mo104233c(), this.f85866e.get(adapterPosition).mo104239i(), this.f85866e.get(adapterPosition).mo104231a()) != 1) {
                    z = false;
                }
                c.setChecked(z);
                aVar.f85869a.setOnClickListener(new C35129a0(this, aVar, adapterPosition));
            } else if ("SINGLE_CHOICE".equals(this.f85862a)) {
                aVar.f85870b.setText(this.f85866e.get(adapterPosition).mo104235e());
                aVar.f85870b.setTag(Integer.valueOf(adapterPosition));
                RadioButton d = aVar.f85870b;
                if (adapterPosition != this.f85864c) {
                    z = false;
                }
                d.setChecked(z);
                aVar.f85869a.setVisibility(8);
                aVar.f85870b.setVisibility(0);
                if (this.f85865d == null) {
                    aVar.f85870b.setChecked(this.f85866e.get(adapterPosition).mo104245o().equals("OPT_IN"));
                    this.f85865d = aVar.f85870b;
                }
            }
            aVar.f85870b.setOnClickListener(new C35131b0(this, aVar));
        } else if (this.f85863b.equals("topicOptionType") && this.f85862a.equals("null")) {
            aVar.f85870b.setVisibility(8);
            aVar.f85869a.setVisibility(0);
            aVar.f85869a.setText(this.f85866e.get(adapterPosition).mo104237g());
            CheckBox c2 = aVar.f85869a;
            if (this.f85867f.mo103604a(this.f85866e.get(adapterPosition).mo104233c(), this.f85866e.get(adapterPosition).mo104239i()) != 1) {
                z = false;
            }
            c2.setChecked(z);
            aVar.f85869a.setOnClickListener(new C35135c0(this, aVar, adapterPosition));
        }
    }
}
