package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.view.C18196h2;
import androidx.fragment.app.C19232h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.target.C22584p;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTConsentInteractionType;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35033b;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35166p;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35259d;
import java.util.Objects;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.e0 */
public class C35201e0 extends C31185b implements View.OnClickListener, C35127a {

    /* renamed from: E0 */
    public ImageView f86243E0;

    /* renamed from: F0 */
    public ImageView f86244F0;

    /* renamed from: G0 */
    public ImageView f86245G0;

    /* renamed from: H0 */
    public TextView f86246H0;

    /* renamed from: I0 */
    public Button f86247I0;

    /* renamed from: J0 */
    public RelativeLayout f86248J0;

    /* renamed from: K0 */
    public Context f86249K0;

    /* renamed from: L0 */
    public RelativeLayout f86250L0;

    /* renamed from: M0 */
    public OTPublishersHeadlessSDK f86251M0;

    /* renamed from: N0 */
    public C35249x0 f86252N0;

    /* renamed from: O0 */
    public C35127a f86253O0;

    /* renamed from: P0 */
    public C34962a f86254P0 = new C34962a();

    /* renamed from: Q0 */
    public OTConfiguration f86255Q0;

    /* renamed from: R0 */
    public UIUtils f86256R0;

    /* renamed from: S0 */
    public C35118r f86257S0;

    /* renamed from: T0 */
    public View f86258T0;

    /* renamed from: U0 */
    public View f86259U0;

    /* renamed from: V0 */
    public View f86260V0;

    /* renamed from: W0 */
    public View f86261W0;

    /* renamed from: X */
    public Button f86262X;

    /* renamed from: X0 */
    public View f86263X0;

    /* renamed from: Y */
    public Button f86264Y;

    /* renamed from: Y0 */
    public View f86265Y0;

    /* renamed from: Z */
    public C31178a f86266Z;

    /* renamed from: Z0 */
    public C35259d f86267Z0;

    /* renamed from: a */
    public TextView f86268a;

    /* renamed from: b */
    public TextView f86269b;

    /* renamed from: c */
    public TextView f86270c;

    /* renamed from: d */
    public TextView f86271d;

    /* renamed from: e */
    public TextView f86272e;

    /* renamed from: f */
    public TextView f86273f;

    /* renamed from: g */
    public TextView f86274g;

    /* renamed from: v */
    public TextView f86275v;

    /* renamed from: w */
    public TextView f86276w;

    /* renamed from: x */
    public TextView f86277x;

    /* renamed from: y */
    public RecyclerView f86278y;

    /* renamed from: z */
    public Button f86279z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.e0$a */
    public class C35202a implements C22560g<Drawable> {

        /* renamed from: a */
        public final /* synthetic */ C35033b f86280a;

        public C35202a(C35201e0 e0Var, C35033b bVar) {
            this.f86280a = bVar;
        }

        /* renamed from: a */
        public boolean mo66827f(Drawable drawable, Object obj, C22584p<Drawable> pVar, DataSource dataSource, boolean z) {
            OTLogger.m143447b("PreferenceCenter", "Logo shown for Preference Center for url " + this.f86280a.mo104295s());
            return false;
        }

        /* renamed from: e */
        public boolean mo66826e(@C0363p0 GlideException glideException, Object obj, C22584p<Drawable> pVar, boolean z) {
            OTLogger.m143447b("PreferenceCenter", "Logo shown for Preference Center failed for url " + this.f86280a.mo104295s());
            return false;
        }
    }

    @C0359n0
    /* renamed from: P0 */
    public static C35201e0 m145086P0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        C35201e0 e0Var = new C35201e0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        e0Var.setArguments(bundle);
        e0Var.mo105319V0(aVar);
        e0Var.mo105320W0(oTConfiguration);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m145087R0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86266Z = aVar;
        this.f86256R0.mo104281t(this.f86249K0, aVar);
        this.f86266Z.setCancelable(false);
        this.f86266Z.setCanceledOnTouchOutside(false);
        this.f86266Z.setOnKeyListener(new C35198d0(this));
    }

    /* renamed from: T0 */
    public static void m145088T0(@C0359n0 View view, @C0359n0 String str) {
        view.setBackgroundColor(Color.parseColor(str));
    }

    /* renamed from: U0 */
    public static void m145089U0(@C0359n0 TextView textView, @C0363p0 C35118r rVar) {
        if (rVar == null || rVar.mo104873d()) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ boolean m145090d1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f86256R0.mo104267E(new C34963b(6), this.f86254P0);
        mo105317Q0(2, true);
        return true;
    }

    /* renamed from: Q0 */
    public void mo105317Q0(int i, boolean z) {
        dismiss();
        C35127a aVar = this.f86253O0;
        if (aVar != null) {
            aVar.mo105080b(i);
        } else if (z) {
            mo105328d(OTConsentInteractionType.PC_CLOSE);
        }
    }

    /* renamed from: S0 */
    public final void mo105318S0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.preferences_list);
        this.f86278y = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f86278y.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f86278y.setNestedScrollingEnabled(false);
        this.f86248J0 = (RelativeLayout) view.findViewById(C35265a.C35273h.pc_layout);
        this.f86250L0 = (RelativeLayout) view.findViewById(C35265a.C35273h.footer_layout);
        this.f86269b = (TextView) view.findViewById(C35265a.C35273h.main_text);
        this.f86270c = (TextView) view.findViewById(C35265a.C35273h.preferences_header);
        this.f86262X = (Button) view.findViewById(C35265a.C35273h.btn_confirm_choices);
        this.f86268a = (TextView) view.findViewById(C35265a.C35273h.main_info_text);
        this.f86243E0 = (ImageView) view.findViewById(C35265a.C35273h.close_pc);
        this.f86246H0 = (TextView) view.findViewById(C35265a.C35273h.close_pc_text);
        this.f86247I0 = (Button) view.findViewById(C35265a.C35273h.close_pc_button);
        this.f86271d = (TextView) view.findViewById(C35265a.C35273h.view_all_vendors);
        this.f86264Y = (Button) view.findViewById(C35265a.C35273h.btn_reject_PC);
        this.f86279z = (Button) view.findViewById(C35265a.C35273h.btn_allow_all);
        this.f86272e = (TextView) view.findViewById(C35265a.C35273h.cookie_policy_link);
        this.f86244F0 = (ImageView) view.findViewById(C35265a.C35273h.pc_logo);
        this.f86245G0 = (ImageView) view.findViewById(C35265a.C35273h.text_copy);
        View findViewById = view.findViewById(C35265a.C35273h.ot_pc_vendor_list_top_divider);
        this.f86258T0 = findViewById;
        findViewById.setVisibility(8);
        this.f86265Y0 = view.findViewById(C35265a.C35273h.dsId_divider);
        this.f86259U0 = view.findViewById(C35265a.C35273h.ot_pc_allow_all_layout_top_divider);
        this.f86260V0 = view.findViewById(C35265a.C35273h.ot_pc_preferences_header_top_divider);
        this.f86261W0 = view.findViewById(C35265a.C35273h.ot_pc_preferences_list_top_divider);
        this.f86263X0 = view.findViewById(C35265a.C35273h.pc_title_divider);
        this.f86273f = (TextView) view.findViewById(C35265a.C35273h.dsid_title);
        this.f86274g = (TextView) view.findViewById(C35265a.C35273h.dsid);
        this.f86275v = (TextView) view.findViewById(C35265a.C35273h.time_stamp);
        this.f86276w = (TextView) view.findViewById(C35265a.C35273h.time_stamp_title);
        this.f86277x = (TextView) view.findViewById(C35265a.C35273h.dsid_description);
        this.f86256R0.mo104282u(this.f86250L0, this.f86249K0);
        this.f86279z.setOnClickListener(this);
        this.f86243E0.setOnClickListener(this);
        this.f86246H0.setOnClickListener(this);
        this.f86247I0.setOnClickListener(this);
        this.f86262X.setOnClickListener(this);
        this.f86264Y.setOnClickListener(this);
        this.f86272e.setOnClickListener(this);
        this.f86271d.setOnClickListener(this);
        this.f86245G0.setOnClickListener(this);
    }

    /* renamed from: V0 */
    public void mo105319V0(@C0359n0 C34962a aVar) {
        this.f86254P0 = aVar;
    }

    /* renamed from: W0 */
    public void mo105320W0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86255Q0 = oTConfiguration;
    }

    /* renamed from: X0 */
    public void mo105321X0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86251M0 = oTPublishersHeadlessSDK;
    }

    /* renamed from: Y0 */
    public final void mo105322Y0(@C0359n0 C35033b bVar, @C0359n0 Button button) {
        button.setText(bVar.mo104295s());
        button.setVisibility(bVar.mo104297w());
        button.setTextColor(Color.parseColor(bVar.mo104296u()));
        if (!C35020d.m143605J(bVar.mo104712o().mo104757f())) {
            button.setTextSize(Float.parseFloat(bVar.mo104293H()));
        }
        this.f86256R0.mo104283v(button, bVar.mo104712o(), this.f86255Q0);
        UIUtils.m143755p(this.f86249K0, button, bVar.mo104289D(), bVar.mo104699a(), bVar.mo104702e());
    }

    /* renamed from: Z0 */
    public final void mo105323Z0(@C0359n0 C35033b bVar, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 Button button) {
        imageView.setVisibility(bVar.mo104297w());
        textView.setVisibility(bVar.mo104291F());
        imageView.getDrawable().setTint(Color.parseColor(bVar.mo104296u()));
        int i = 0;
        if (bVar.mo104290E() == 0) {
            button.setVisibility(0);
            mo105329e1(bVar, button);
        } else if (bVar.mo104291F() == 0) {
            textView.setText(bVar.mo104295s());
            textView.setTextColor(Color.parseColor(bVar.mo104296u()));
            m145089U0(textView, this.f86257S0);
        }
        View view = this.f86263X0;
        if (bVar.mo104291F() == 8 && bVar.mo104297w() == 8 && bVar.mo104290E() == 8) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @C0376v0(api = 17)
    /* renamed from: a */
    public final void mo105324a() {
        try {
            mo105325a1(this.f86267Z0.mo105541M(), this.f86269b);
            C18196h2.m82478C1(this.f86269b, true);
            mo105325a1(this.f86267Z0.mo105536H(), this.f86268a);
            mo105325a1(this.f86267Z0.mo105540L(), this.f86272e);
            C35257c.m145352d(this.f86272e);
            m145089U0(this.f86272e, this.f86257S0);
            C35033b N = this.f86267Z0.mo105542N();
            mo105325a1(N, this.f86271d);
            String P = this.f86267Z0.mo105544P();
            if (!C35020d.m143605J(P)) {
                C35036e.m143802d(this.f86271d, P);
                UIUtils.m143757x(this.f86245G0, P);
            }
            int i = 8;
            if (this.f86267Z0.mo105529A() != null) {
                mo105327c1(this.f86267Z0, this.f86273f);
                if (this.f86267Z0.mo105568y() != null) {
                    mo105327c1(this.f86267Z0, this.f86277x);
                } else {
                    this.f86277x.setVisibility(8);
                }
                mo105327c1(this.f86267Z0, this.f86274g);
            } else {
                this.f86273f.setVisibility(8);
                this.f86274g.setVisibility(8);
                this.f86277x.setVisibility(8);
                this.f86245G0.setVisibility(8);
                this.f86265Y0.setVisibility(8);
            }
            if (C13758b.f33436b.equals(this.f86267Z0.mo105547b())) {
                mo105327c1(this.f86267Z0, this.f86276w);
                mo105327c1(this.f86267Z0, this.f86275v);
            } else {
                this.f86276w.setVisibility(8);
                this.f86275v.setVisibility(8);
            }
            C35033b D = this.f86267Z0.mo105532D();
            C35202a aVar = new C35202a(this, D);
            this.f86244F0.setVisibility(D.mo104297w());
            if (D.mo104297w() == 0) {
                ((C22090i) ((C22090i) ((C22090i) C22038b.m100352G(this).mo65605u(D.mo104295s()).mo66750K()).mo66746I(C35265a.C35272g.ic_ot)).mo65677O1(aVar).mo66785e1(10000)).mo65675K1(this.f86244F0);
            }
            C35033b K = this.f86267Z0.mo105539K();
            mo105325a1(K, this.f86270c);
            C18196h2.m82478C1(this.f86270c, true);
            this.f86261W0.setVisibility(K.mo104297w());
            C35033b e = this.f86267Z0.mo105550e();
            mo105322Y0(e, this.f86279z);
            C35033b O = this.f86267Z0.mo105543O();
            mo105322Y0(O, this.f86264Y);
            View view = this.f86260V0;
            if (e.mo104297w() != 8 || O.mo104297w() != 8) {
                i = 0;
            }
            view.setVisibility(i);
            mo105322Y0(this.f86267Z0.mo105564u(), this.f86262X);
            this.f86278y.setAdapter(new C35166p(this.f86249K0, this.f86267Z0, this.f86251M0, this.f86254P0, this, this.f86255Q0));
            String G = this.f86267Z0.mo105535G();
            this.f86248J0.setBackgroundColor(Color.parseColor(G));
            this.f86278y.setBackgroundColor(Color.parseColor(G));
            this.f86250L0.setBackgroundColor(Color.parseColor(G));
            String w = this.f86267Z0.mo105566w();
            m145088T0(this.f86258T0, w);
            m145088T0(this.f86259U0, w);
            m145088T0(this.f86260V0, w);
            m145088T0(this.f86261W0, w);
            m145088T0(this.f86263X0, w);
            m145088T0(this.f86265Y0, w);
            mo105323Z0(this.f86267Z0.mo105563t(), this.f86243E0, this.f86246H0, this.f86247I0);
            this.f86260V0.setVisibility(N.mo104297w());
        } catch (RuntimeException e2) {
            OTLogger.m143457l("PreferenceCenter", "error while populating  PC fields" + e2.getMessage());
        }
    }

    @C0376v0(api = 17)
    /* renamed from: a1 */
    public final void mo105325a1(C35033b bVar, TextView textView) {
        this.f86256R0.mo104279r(this.f86249K0, textView, bVar.mo104295s());
        textView.setVisibility(bVar.mo104297w());
        textView.setTextColor(Color.parseColor(bVar.mo104296u()));
        UIUtils.m143758y(textView, bVar.mo104292G());
        if (!C35020d.m143605J(bVar.mo104293H())) {
            textView.setTextSize(Float.parseFloat(bVar.mo104293H()));
        }
        this.f86256R0.mo104264A(textView, bVar.mo104712o(), this.f86255Q0);
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 1) {
            mo105317Q0(i, false);
        }
        if (i == 3) {
            C35249x0 R0 = C35249x0.m145291R0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f86254P0, this.f86255Q0);
            this.f86252N0 = R0;
            R0.mo105487c1(this.f86251M0);
        }
    }

    /* renamed from: b1 */
    public void mo105326b1(C35127a aVar) {
        this.f86253O0 = aVar;
    }

    @C0376v0(api = 17)
    /* renamed from: c1 */
    public final void mo105327c1(@C0359n0 C35259d dVar, @C0359n0 TextView textView) {
        C35102b0 a;
        if (textView.equals(this.f86273f)) {
            dVar.mo105552h(textView, dVar.mo105529A(), dVar.mo105534F().mo104918M().mo104663g());
            textView.setText(dVar.mo105530B().mo104663g());
            dVar.mo105551g(textView, dVar.mo105530B(), this.f86255Q0);
            ImageView imageView = this.f86245G0;
            imageView.setContentDescription(textView.getContext().getResources().getString(C35265a.C35278m.str_ada_copy) + dVar.mo105530B().mo104663g());
            return;
        }
        if (textView.equals(this.f86277x)) {
            dVar.mo105552h(textView, dVar.mo105568y(), dVar.mo105534F().mo104909D().mo104663g());
            this.f86256R0.mo104279r(this.f86249K0, textView, dVar.mo105569z().mo104663g());
            a = dVar.mo105569z();
        } else if (textView.equals(this.f86274g)) {
            textView.setText(dVar.mo105567x().mo104663g());
            a = dVar.mo105567x();
        } else if (textView.equals(this.f86276w)) {
            textView.setText(dVar.mo105548c().mo104663g());
            a = dVar.mo105548c();
        } else if (textView.equals(this.f86275v)) {
            textView.setText(dVar.mo105546a().mo104663g());
            a = dVar.mo105546a();
        } else {
            return;
        }
        dVar.mo105551g(textView, a, this.f86255Q0);
    }

    /* renamed from: d */
    public final void mo105328d(@C0359n0 String str) {
        C34963b bVar = new C34963b(17);
        bVar.mo103583e(str);
        this.f86256R0.mo104267E(bVar, this.f86254P0);
    }

    /* renamed from: e1 */
    public final void mo105329e1(@C0359n0 C35033b bVar, @C0359n0 Button button) {
        button.setText(bVar.mo104295s());
        button.setTextColor(Color.parseColor(bVar.mo104296u()));
        if (!C35020d.m143605J(bVar.mo104712o().mo104757f())) {
            button.setTextSize(Float.parseFloat(bVar.mo104293H()));
        }
        this.f86256R0.mo104283v(button, bVar.mo104712o(), this.f86255Q0);
        UIUtils.m143755p(this.f86249K0, button, bVar.mo104289D(), bVar.mo104699a(), bVar.mo104702e());
    }

    public void onClick(View view) {
        String str;
        UIUtils uIUtils;
        C34963b bVar;
        int id = view.getId();
        if (id == C35265a.C35273h.btn_allow_all) {
            OTPublishersHeadlessSDK oTPublishersHeadlessSDK = this.f86251M0;
            str = OTConsentInteractionType.PC_ALLOW_ALL;
            oTPublishersHeadlessSDK.saveConsent(str);
            uIUtils = this.f86256R0;
            bVar = new C34963b(8);
        } else if (id == C35265a.C35273h.btn_confirm_choices) {
            OTPublishersHeadlessSDK oTPublishersHeadlessSDK2 = this.f86251M0;
            str = OTConsentInteractionType.PC_CONFIRM;
            oTPublishersHeadlessSDK2.saveConsent(str);
            uIUtils = this.f86256R0;
            bVar = new C34963b(10);
        } else if (id == C35265a.C35273h.close_pc || id == C35265a.C35273h.close_pc_text || id == C35265a.C35273h.close_pc_button) {
            this.f86256R0.mo104267E(new C34963b(6), this.f86254P0);
            mo105317Q0(2, true);
            return;
        } else if (id == C35265a.C35273h.btn_reject_PC) {
            OTPublishersHeadlessSDK oTPublishersHeadlessSDK3 = this.f86251M0;
            str = OTConsentInteractionType.PC_REJECT_ALL;
            oTPublishersHeadlessSDK3.saveConsent(str);
            uIUtils = this.f86256R0;
            bVar = new C34963b(9);
        } else if (id == C35265a.C35273h.view_all_vendors) {
            if (!this.f86252N0.isAdded()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("IS_FILTERED_VENDOR_LIST", false);
                this.f86252N0.setArguments(bundle);
                this.f86252N0.mo105488d1(this);
                C35249x0 x0Var = this.f86252N0;
                C19232h activity = getActivity();
                Objects.requireNonNull(activity);
                x0Var.show(activity.mo57175g0(), OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG);
                this.f86256R0.mo104267E(new C34963b(12), this.f86254P0);
                return;
            }
            return;
        } else if (id == C35265a.C35273h.cookie_policy_link) {
            C35020d.m143600B(this.f86249K0, this.f86267Z0.mo105538J());
            return;
        } else if (id == C35265a.C35273h.text_copy) {
            new UIUtils().mo104278q(this.f86249K0, this.f86274g);
            return;
        } else {
            return;
        }
        uIUtils.mo104267E(bVar, this.f86254P0);
        mo105328d(str);
        mo105317Q0(1, false);
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86256R0.mo104281t(this.f86249K0, this.f86266Z);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Context context = getContext();
        Objects.requireNonNull(context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null && this.f86251M0 == null) {
            this.f86251M0 = new OTPublishersHeadlessSDK(applicationContext);
        }
    }

    @C0359n0
    @C0376v0(api = 17)
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35195c0(this));
        return onCreateDialog;
    }

    @C0376v0(api = 17)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f86249K0 = getContext();
        C35249x0 R0 = C35249x0.m145291R0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f86254P0, this.f86255Q0);
        this.f86252N0 = R0;
        R0.mo105487c1(this.f86251M0);
        UIUtils uIUtils = new UIUtils();
        this.f86256R0 = uIUtils;
        View e = uIUtils.mo104271e(this.f86249K0, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_pc);
        mo105318S0(e);
        this.f86267Z0 = new C35259d();
        this.f86267Z0.mo105553i(this.f86251M0, this.f86249K0, UIUtils.m143749b(this.f86249K0, this.f86255Q0));
        this.f86257S0 = this.f86267Z0.mo105533E();
        mo105324a();
        return e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86254P0 = null;
    }
}
