package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import androidx.core.content.C17318d;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.target.C22584p;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34966b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTConsentUICallback;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35115o;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import org.json.JSONException;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.g */
public class C35209g extends C31185b implements View.OnClickListener, C35127a {

    /* renamed from: X */
    public OTConsentUICallback f86330X;

    /* renamed from: a */
    public Context f86331a;

    /* renamed from: b */
    public TextView f86332b;

    /* renamed from: c */
    public TextView f86333c;

    /* renamed from: d */
    public Button f86334d;

    /* renamed from: e */
    public Button f86335e;

    /* renamed from: f */
    public ImageView f86336f;

    /* renamed from: g */
    public C31178a f86337g;

    /* renamed from: v */
    public RelativeLayout f86338v;

    /* renamed from: w */
    public UIUtils f86339w;

    /* renamed from: x */
    public OTConfiguration f86340x;

    /* renamed from: y */
    public OTPublishersHeadlessSDK f86341y;

    /* renamed from: z */
    public C35115o f86342z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.g$a */
    public class C35210a implements C22560g<Drawable> {
        public C35210a() {
        }

        /* renamed from: a */
        public boolean mo66827f(Drawable drawable, Object obj, C22584p<Drawable> pVar, DataSource dataSource, boolean z) {
            OTLogger.m143447b("OTAgeGateFragment", "Logo shown for Age Gate Prompt for url " + C35209g.this.f86342z.mo104823j());
            return false;
        }

        /* renamed from: e */
        public boolean mo66826e(@C0363p0 GlideException glideException, Object obj, C22584p<Drawable> pVar, boolean z) {
            OTLogger.m143447b("OTAgeGateFragment", "Logo shown for Age Gate Prompt failed for url " + C35209g.this.f86342z.mo104823j());
            return false;
        }
    }

    @C0359n0
    /* renamed from: P0 */
    public static C35209g m145145P0(@C0359n0 String str, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 OTConsentUICallback oTConsentUICallback) {
        C35209g gVar = new C35209g();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        gVar.mo105359V0(oTConfiguration);
        gVar.mo105360W0(oTConsentUICallback);
        gVar.setArguments(bundle);
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m145146Q0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86337g = aVar;
        this.f86339w.mo104281t(this.f86331a, aVar);
        this.f86337g.setCancelable(false);
        this.f86337g.setOnKeyListener(new C35204f());
    }

    /* renamed from: X0 */
    public static /* synthetic */ boolean m145147X0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return true;
    }

    /* renamed from: R0 */
    public final void mo105355R0(@C0359n0 View view) {
        this.f86334d = (Button) view.findViewById(C35265a.C35273h.btn_accept);
        this.f86335e = (Button) view.findViewById(C35265a.C35273h.btn_not_now);
        this.f86338v = (RelativeLayout) view.findViewById(C35265a.C35273h.age_gate_parent_layout);
        this.f86332b = (TextView) view.findViewById(C35265a.C35273h.age_gate_title);
        this.f86333c = (TextView) view.findViewById(C35265a.C35273h.age_gate_description);
        this.f86336f = (ImageView) view.findViewById(C35265a.C35273h.age_gate_logo);
    }

    /* renamed from: S0 */
    public final void mo105356S0(@C0359n0 Button button, @C0359n0 C35105e eVar, int i, int i2) {
        C35110j o = eVar.mo104712o();
        this.f86339w.mo104283v(button, o, this.f86340x);
        if (!C35020d.m143605J(o.mo104757f())) {
            button.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        button.setText(eVar.mo104295s());
        if (!C35020d.m143605J(eVar.mo104296u())) {
            i2 = Color.parseColor(eVar.mo104296u());
        } else if (button.equals(this.f86335e)) {
            i2 = C17318d.m79723f(this.f86331a, C35265a.C35270e.blackOT);
        }
        button.setTextColor(i2);
        if (!C35020d.m143605J(eVar.mo104699a())) {
            UIUtils.m143755p(this.f86331a, button, eVar, eVar.mo104699a(), eVar.mo104702e());
        } else if (button.equals(this.f86335e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(Integer.parseInt("3"), C17318d.m79723f(this.f86331a, C35265a.C35270e.blackOT));
            gradientDrawable.setColor(C17318d.m79723f(this.f86331a, C35265a.C35270e.whiteOT));
            button.setBackground(gradientDrawable);
        } else {
            button.setBackgroundColor(i);
        }
    }

    /* renamed from: T0 */
    public final void mo105357T0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var, @C0363p0 String str) {
        C35110j a = b0Var.mo104657a();
        textView.setText(b0Var.mo104663g());
        this.f86339w.mo104264A(textView, b0Var.mo104657a(), this.f86340x);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
        textView.setTextColor(!C35020d.m143605J(str) ? Color.parseColor(str) : C17318d.m79723f(this.f86331a, C35265a.C35270e.blackOT));
    }

    /* renamed from: U0 */
    public final void mo105358U0(@C0359n0 C34966b bVar, @C0359n0 String str) {
        bVar.mo103632b(str);
        dismiss();
        OTLogger.m143447b("OTAgeGateFragment", "Age-Gate Consent Status: " + this.f86341y.getAgeGatePromptValue());
        OTConsentUICallback oTConsentUICallback = this.f86330X;
        if (oTConsentUICallback != null) {
            oTConsentUICallback.onCompletion();
        }
    }

    /* renamed from: V0 */
    public void mo105359V0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86340x = oTConfiguration;
    }

    /* renamed from: W0 */
    public void mo105360W0(@C0363p0 OTConsentUICallback oTConsentUICallback) {
        this.f86330X = oTConsentUICallback;
    }

    /* renamed from: Y0 */
    public final void mo105361Y0() {
        this.f86334d.setOnClickListener(this);
        this.f86335e.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo105362a() {
        int i;
        RelativeLayout relativeLayout;
        C35115o oVar = this.f86342z;
        if (oVar != null) {
            if (!C35020d.m143605J(oVar.mo104814a())) {
                relativeLayout = this.f86338v;
                i = Color.parseColor(this.f86342z.mo104814a());
            } else {
                relativeLayout = this.f86338v;
                i = C17318d.m79723f(this.f86331a, C35265a.C35270e.whiteOT);
            }
            relativeLayout.setBackgroundColor(i);
            int f = C17318d.m79723f(this.f86331a, C35265a.C35270e.groupItemSelectedBGOT);
            int f2 = C17318d.m79723f(this.f86331a, C35265a.C35270e.whiteOT);
            C35102b0 o = this.f86342z.mo104828o();
            String str = "";
            mo105357T0(this.f86332b, o, !C35020d.m143605J(o.mo104667k()) ? o.mo104667k() : str);
            C35102b0 f3 = this.f86342z.mo104819f();
            if (!C35020d.m143605J(f3.mo104667k())) {
                str = f3.mo104667k();
            }
            mo105357T0(this.f86333c, f3, str);
            mo105356S0(this.f86334d, this.f86342z.mo104825l(), f, f2);
            mo105356S0(this.f86335e, this.f86342z.mo104826m(), f, f2);
            C35210a aVar = new C35210a();
            if (!this.f86342z.mo104829p()) {
                this.f86336f.getLayoutParams().height = 20;
            } else if (!C35020d.m143605J(this.f86342z.mo104823j())) {
                ((C22090i) ((C22090i) ((C22090i) C22038b.m100352G(this).mo65605u(this.f86342z.mo104823j()).mo66750K()).mo65677O1(aVar).mo66746I(C35265a.C35272g.ic_ag)).mo66785e1(10000)).mo65675K1(this.f86336f);
            } else {
                this.f86336f.setImageResource(C35265a.C35272g.ic_ag);
            }
        }
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        dismiss();
    }

    public void onClick(View view) {
        String str;
        int id = view.getId();
        C34966b bVar = new C34966b(this.f86331a);
        if (id == C35265a.C35273h.btn_accept) {
            str = "OPT_IN";
        } else if (id == C35265a.C35273h.btn_not_now) {
            str = "OPT_OUT";
        } else {
            return;
        }
        mo105358U0(bVar, str);
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86339w.mo104281t(this.f86331a, this.f86337g);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f86341y = new OTPublishersHeadlessSDK(getContext().getApplicationContext());
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35200e(this));
        return onCreateDialog;
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86331a = context;
        UIUtils uIUtils = new UIUtils();
        this.f86339w = uIUtils;
        View e = uIUtils.mo104271e(context, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_age_gate);
        mo105355R0(e);
        mo105361Y0();
        mo105363b();
        try {
            mo105362a();
        } catch (JSONException e2) {
            OTLogger.m143457l("OTAgeGateFragment", "error while populating Age-Gate UI " + e2.getMessage());
        }
        return e;
    }

    /* renamed from: b */
    public void mo105363b() {
        try {
            this.f86342z = new C35124x(this.f86331a).mo105010a();
        } catch (JSONException e) {
            OTLogger.m143457l("OTAgeGateFragment", "Error in ui property object, error message = " + e.getMessage());
        }
    }
}
