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
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34983o;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35126z;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35169r;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35264i;
import java.util.Map;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.h0 */
public class C35213h0 extends C31185b implements C35169r.C35170a, View.OnClickListener, C35127a {

    /* renamed from: E0 */
    public int f86346E0;

    /* renamed from: F0 */
    public String f86347F0;

    /* renamed from: X */
    public OTConfiguration f86348X;

    /* renamed from: Y */
    public View f86349Y;

    /* renamed from: Z */
    public C35257c f86350Z;

    /* renamed from: a */
    public TextView f86351a;

    /* renamed from: b */
    public RecyclerView f86352b;

    /* renamed from: c */
    public Button f86353c;

    /* renamed from: d */
    public C31178a f86354d;

    /* renamed from: e */
    public C35169r f86355e;

    /* renamed from: f */
    public RelativeLayout f86356f;

    /* renamed from: g */
    public Context f86357g;

    /* renamed from: v */
    public RelativeLayout f86358v;

    /* renamed from: w */
    public OTPublishersHeadlessSDK f86359w;

    /* renamed from: x */
    public C35214a f86360x;

    /* renamed from: y */
    public Map<String, String> f86361y;

    /* renamed from: z */
    public C35126z f86362z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.h0$a */
    public interface C35214a {
        /* renamed from: c */
        void mo105381c(@C0359n0 Map<String, String> map);
    }

    @C0359n0
    /* renamed from: P0 */
    public static C35213h0 m145163P0(@C0359n0 String str, @C0359n0 Map<String, String> map, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 String str2) {
        C35213h0 h0Var = new C35213h0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        h0Var.setArguments(bundle);
        h0Var.mo105374Y0(map);
        h0Var.mo105371U0(oTConfiguration);
        h0Var.mo105379d(str2);
        return h0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m145164Q0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86354d = aVar;
        this.f86350Z.mo105528b(this.f86357g, aVar);
        this.f86354d.setCancelable(false);
        this.f86354d.setCanceledOnTouchOutside(false);
        this.f86354d.setOnKeyListener(new C35205f0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ boolean m145165X0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (!C35257c.m145353e(i, keyEvent)) {
            return false;
        }
        dismiss();
        return false;
    }

    /* renamed from: R0 */
    public final void mo105368R0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.filter_list);
        this.f86352b = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f86352b.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f86351a = (TextView) view.findViewById(C35265a.C35273h.ot_cancel_filter);
        int i = C35265a.C35273h.footer_layout;
        this.f86358v = (RelativeLayout) view.findViewById(i);
        this.f86353c = (Button) view.findViewById(C35265a.C35273h.btn_apply_filter);
        this.f86358v = (RelativeLayout) view.findViewById(i);
        this.f86356f = (RelativeLayout) view.findViewById(C35265a.C35273h.filter_layout);
        this.f86349Y = view.findViewById(C35265a.C35273h.cancel_divider);
    }

    /* renamed from: S0 */
    public final void mo105369S0(@C0359n0 Button button, @C0359n0 C35105e eVar) {
        button.setText(eVar.mo104295s());
        C35110j o = eVar.mo104712o();
        new UIUtils().mo104283v(button, o, this.f86348X);
        if (!C35020d.m143605J(o.mo104757f())) {
            button.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        if (!C35020d.m143605J(eVar.mo104296u())) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        }
        UIUtils.m143755p(this.f86357g, button, eVar, eVar.mo104699a(), eVar.mo104702e());
    }

    /* renamed from: T0 */
    public final void mo105370T0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        textView.setText(b0Var.mo104663g());
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f86348X);
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

    /* renamed from: U0 */
    public void mo105371U0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86348X = oTConfiguration;
    }

    /* renamed from: V0 */
    public void mo105372V0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86359w = oTPublishersHeadlessSDK;
    }

    /* renamed from: W0 */
    public void mo105373W0(C35214a aVar) {
        this.f86360x = aVar;
    }

    /* renamed from: Y0 */
    public final void mo105374Y0(@C0359n0 Map<String, String> map) {
        this.f86361y = map;
    }

    /* renamed from: Z0 */
    public final void mo105375Z0() {
        if (this.f86362z != null) {
            mo105377a1();
            mo105370T0(this.f86351a, this.f86362z.mo105074u());
            C35105e g = this.f86362z.mo105059g();
            if (!C35020d.m143605J(this.f86362z.mo105043C())) {
                this.f86349Y.setBackgroundColor(Color.parseColor(this.f86362z.mo105043C()));
            }
            mo105369S0(this.f86353c, g);
        }
    }

    /* renamed from: a */
    public void mo105376a() {
        this.f86360x.mo105381c(this.f86355e.mo105200m());
        dismiss();
    }

    /* renamed from: a1 */
    public final void mo105377a1() {
        this.f86356f.setBackgroundColor(Color.parseColor(this.f86362z.mo105066n()));
        this.f86358v.setBackgroundColor(Color.parseColor(this.f86362z.mo105066n()));
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 1) {
            mo105376a();
        }
    }

    /* renamed from: c */
    public void mo105204c(@C0359n0 Map<String, String> map) {
        mo105374Y0(map);
    }

    /* renamed from: d */
    public void mo105379d(@C0359n0 String str) {
        this.f86347F0 = str;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.btn_apply_filter) {
            mo105376a();
        } else if (id == C35265a.C35273h.ot_cancel_filter) {
            dismiss();
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86350Z.mo105528b(this.f86357g, this.f86354d);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.f86359w == null) {
            dismiss();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35211g0(this));
        return onCreateDialog;
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86357g = context;
        this.f86350Z = new C35257c();
        View e = new UIUtils().mo104271e(context, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_purpose_list);
        int b = UIUtils.m143749b(this.f86357g, this.f86348X);
        this.f86346E0 = b;
        C35264i iVar = new C35264i();
        iVar.mo105632b(this.f86357g, b, this.f86359w);
        mo105368R0(e);
        mo105378b();
        this.f86362z = iVar.mo105633c();
        C35169r rVar = new C35169r(OTVendorListMode.GENERAL.equalsIgnoreCase(this.f86347F0) ? new C34983o(this.f86357g).mo103832c() : new UIUtils().mo104275m(iVar.mo105631a()), this.f86361y, this.f86362z, this.f86348X, this);
        this.f86355e = rVar;
        this.f86352b.setAdapter(rVar);
        mo105375Z0();
        return e;
    }

    /* renamed from: b */
    public final void mo105378b() {
        this.f86353c.setOnClickListener(this);
        this.f86351a.setOnClickListener(this);
    }
}
