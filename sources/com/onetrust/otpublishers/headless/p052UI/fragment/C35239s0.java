package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.content.C17318d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35021a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35025d;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35137d0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.s0 */
public class C35239s0 extends C31185b {

    /* renamed from: E0 */
    public UIUtils f86486E0;

    /* renamed from: F0 */
    public int f86487F0;

    /* renamed from: G0 */
    public C34964a f86488G0;

    /* renamed from: H0 */
    public boolean f86489H0;

    /* renamed from: I0 */
    public List<C35025d> f86490I0 = new ArrayList();

    /* renamed from: J0 */
    public List<C35021a> f86491J0 = new ArrayList();

    /* renamed from: X */
    public String f86492X;

    /* renamed from: Y */
    public String f86493Y;

    /* renamed from: Z */
    public C34962a f86494Z = new C34962a();

    /* renamed from: a */
    public TextView f86495a;

    /* renamed from: b */
    public TextView f86496b;

    /* renamed from: c */
    public TextView f86497c;

    /* renamed from: d */
    public TextView f86498d;

    /* renamed from: e */
    public RecyclerView f86499e;

    /* renamed from: f */
    public C31178a f86500f;

    /* renamed from: g */
    public ImageView f86501g;

    /* renamed from: v */
    public C35137d0 f86502v;

    /* renamed from: w */
    public Context f86503w;

    /* renamed from: x */
    public OTPublishersHeadlessSDK f86504x;

    /* renamed from: y */
    public C35127a f86505y;

    /* renamed from: z */
    public String f86506z;

    @C0359n0
    /* renamed from: Q0 */
    public static C35239s0 m145276Q0(@C0359n0 String str) {
        C35239s0 s0Var = new C35239s0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        s0Var.setArguments(bundle);
        return s0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m145277R0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86500f = aVar;
        this.f86486E0.mo104281t(this.f86503w, aVar);
        this.f86500f.setCancelable(false);
        this.f86500f.setCanceledOnTouchOutside(false);
        this.f86500f.setOnKeyListener(new C35237r0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ boolean m145278V0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.f86494Z.mo103577b(new C34963b(6));
            mo105467b(6);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m145279W0(View view) {
        mo105467b(6);
    }

    /* renamed from: S0 */
    public final void mo105462S0(@C0359n0 View view) {
        this.f86495a = (TextView) view.findViewById(C35265a.C35273h.title);
        this.f86496b = (TextView) view.findViewById(C35265a.C35273h.selected_item_title);
        this.f86497c = (TextView) view.findViewById(C35265a.C35273h.selected_item_description);
        this.f86498d = (TextView) view.findViewById(C35265a.C35273h.list_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.consent_preferences_selection_list);
        this.f86499e = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f86499e.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f86501g = (ImageView) view.findViewById(C35265a.C35273h.back_cp);
    }

    /* renamed from: T0 */
    public void mo105463T0(C34964a aVar) {
        this.f86488G0 = aVar;
    }

    /* renamed from: U0 */
    public void mo105464U0(C35127a aVar) {
        this.f86505y = aVar;
    }

    /* renamed from: a */
    public final void mo105465a() {
        this.f86501g.setOnClickListener(new C35233p0(this));
    }

    /* renamed from: b */
    public void mo105467b(int i) {
        dismiss();
        C35127a aVar = this.f86505y;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86486E0.mo104281t(this.f86503w, this.f86500f);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext != null && this.f86504x == null) {
            this.f86504x = new OTPublishersHeadlessSDK(applicationContext);
        }
        this.f86486E0 = new UIUtils();
        if (getArguments() != null) {
            if (getArguments().getParcelableArrayList("CUSTOM_PREF_ARRAY") != null) {
                this.f86491J0 = getArguments().getParcelableArrayList("CUSTOM_PREF_ARRAY");
            } else if (getArguments().getParcelableArrayList("TOPIC_PREF_ARRAY") != null) {
                this.f86490I0 = getArguments().getParcelableArrayList("TOPIC_PREF_ARRAY");
            }
            this.f86506z = getArguments().getString("ITEM_LABEL");
            this.f86492X = getArguments().getString("ITEM_DESC");
            this.f86487F0 = getArguments().getInt("ITEM_POSITION");
            this.f86493Y = getArguments().getString("TITLE_TEXT_COLOR");
            this.f86489H0 = getArguments().getBoolean("PURPOSE_TOGGLE_STATE");
        }
    }

    @C0359n0
    @C0376v0(api = 17)
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35235q0(this));
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86503w = context;
        View e = new UIUtils().mo104271e(context, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_uc_purposes_options);
        mo105462S0(e);
        mo105465a();
        mo105466b();
        return e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86505y = null;
    }

    /* renamed from: b */
    public final void mo105466b() {
        C35137d0 d0Var;
        this.f86496b.setText(this.f86506z);
        this.f86497c.setText(this.f86492X);
        TextView textView = this.f86496b;
        Context context = this.f86503w;
        int i = C35265a.C35270e.layoutBgDarkOT;
        textView.setTextColor(C17318d.m79723f(context, i));
        this.f86497c.setTextColor(C17318d.m79723f(this.f86503w, i));
        this.f86495a.setTextColor(Color.parseColor(this.f86493Y));
        this.f86501g.setColorFilter(Color.parseColor(this.f86493Y));
        this.f86498d.setTextColor(C17318d.m79723f(this.f86503w, i));
        if (this.f86491J0.size() > 0) {
            this.f86498d.setText(this.f86491J0.get(this.f86487F0).mo104197a());
            this.f86495a.setText(this.f86491J0.get(this.f86487F0).mo104197a());
            d0Var = new C35137d0(this.f86491J0.get(this.f86487F0).mo104200d(), "customPrefOptionType", this.f86491J0.get(this.f86487F0).mo104203f(), this.f86488G0, this.f86489H0);
        } else {
            if (this.f86490I0.size() > 0) {
                this.f86498d.setText(this.f86490I0.get(this.f86487F0).mo104252a());
                this.f86495a.setText(this.f86490I0.get(this.f86487F0).mo104252a());
                d0Var = new C35137d0(this.f86490I0.get(this.f86487F0).mo104255d(), "topicOptionType", "null", this.f86488G0, this.f86489H0);
            }
            this.f86499e.setAdapter(this.f86502v);
        }
        this.f86502v = d0Var;
        this.f86499e.setAdapter(this.f86502v);
    }
}
