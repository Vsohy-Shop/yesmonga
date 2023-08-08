package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.view.C18196h2;
import androidx.fragment.app.C19232h;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.target.C22584p;
import com.google.android.material.C31076a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35018b;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTBannerHeightRatio;
import com.onetrust.otpublishers.headless.Public.OTConsentInteractionType;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35106f;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35111k;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35112l;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35117q;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35255a;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.j */
public class C35217j extends C31185b implements View.OnClickListener, C35127a {

    /* renamed from: E0 */
    public FrameLayout f86365E0;

    /* renamed from: F0 */
    public C31178a f86366F0;

    /* renamed from: G0 */
    public C35249x0 f86367G0;

    /* renamed from: H0 */
    public RelativeLayout f86368H0;

    /* renamed from: I0 */
    public RelativeLayout f86369I0;

    /* renamed from: J0 */
    public LinearLayout f86370J0;

    /* renamed from: K0 */
    public LinearLayout f86371K0;

    /* renamed from: L0 */
    public ImageView f86372L0;

    /* renamed from: M0 */
    public TextView f86373M0;

    /* renamed from: N0 */
    public ScrollView f86374N0;

    /* renamed from: O0 */
    public OTPublishersHeadlessSDK f86375O0;

    /* renamed from: P0 */
    public C34962a f86376P0 = new C34962a();

    /* renamed from: Q0 */
    public JSONObject f86377Q0;

    /* renamed from: R0 */
    public String f86378R0 = "";

    /* renamed from: S0 */
    public Context f86379S0;

    /* renamed from: T0 */
    public SharedPreferences f86380T0;

    /* renamed from: U0 */
    public UIUtils f86381U0;

    /* renamed from: V0 */
    public C35117q f86382V0;

    /* renamed from: W0 */
    public OTConfiguration f86383W0;

    /* renamed from: X */
    public Button f86384X;

    /* renamed from: X0 */
    public C35118r f86385X0;

    /* renamed from: Y */
    public C35201e0 f86386Y;

    /* renamed from: Y0 */
    public C35255a f86387Y0;

    /* renamed from: Z */
    public BottomSheetBehavior<View> f86388Z;

    /* renamed from: Z0 */
    public ImageView f86389Z0;

    /* renamed from: a */
    public TextView f86390a;

    /* renamed from: a1 */
    public Button f86391a1;

    /* renamed from: b */
    public TextView f86392b;

    /* renamed from: b1 */
    public ImageView f86393b1;

    /* renamed from: c */
    public TextView f86394c;

    /* renamed from: c1 */
    public TextView f86395c1;

    /* renamed from: d */
    public TextView f86396d;

    /* renamed from: e */
    public TextView f86397e;

    /* renamed from: f */
    public TextView f86398f;

    /* renamed from: g */
    public TextView f86399g;

    /* renamed from: v */
    public TextView f86400v;

    /* renamed from: w */
    public TextView f86401w;

    /* renamed from: x */
    public TextView f86402x;

    /* renamed from: y */
    public Button f86403y;

    /* renamed from: z */
    public Button f86404z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.j$a */
    public class C35218a implements C22560g<Drawable> {

        /* renamed from: a */
        public final /* synthetic */ C35112l f86405a;

        public C35218a(C35217j jVar, C35112l lVar) {
            this.f86405a = lVar;
        }

        /* renamed from: a */
        public boolean mo66827f(Drawable drawable, Object obj, C22584p<Drawable> pVar, DataSource dataSource, boolean z) {
            OTLogger.m143447b("OTSDKBanner", "Logo shown for Banner for url " + this.f86405a.mo104774c());
            return false;
        }

        /* renamed from: e */
        public boolean mo66826e(@C0363p0 GlideException glideException, Object obj, C22584p<Drawable> pVar, boolean z) {
            OTLogger.m143447b("OTSDKBanner", "Logo shown for Banner failed for url " + this.f86405a.mo104774c());
            return false;
        }
    }

    @C0359n0
    /* renamed from: P0 */
    public static C35217j m145183P0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        C35217j jVar = new C35217j();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        jVar.setArguments(bundle);
        jVar.mo105393a1(aVar);
        jVar.mo105395b1(oTConfiguration);
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m145184R0(DialogInterface dialogInterface) {
        this.f86366F0 = (C31178a) dialogInterface;
        mo105391Z0(this.f86366F0, getResources().getConfiguration().orientation);
        this.f86365E0 = (FrameLayout) this.f86366F0.findViewById(C31076a.C31084h.design_bottom_sheet);
        this.f86366F0.setCancelable(false);
        this.f86366F0.setOnKeyListener(new C35212h(this));
    }

    /* renamed from: X0 */
    public static void m145185X0(@C0359n0 TextView textView, @C0363p0 C35118r rVar) {
        if (rVar == null || rVar.mo104873d()) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ boolean m145186f1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            OTConfiguration oTConfiguration = this.f86383W0;
            if (oTConfiguration == null || oTConfiguration.isBannerBackButtonDisabled()) {
                C34963b bVar = new C34963b(18);
                bVar.mo103583e(OTConsentInteractionType.BANNER_BACK);
                this.f86381U0.mo104267E(bVar, this.f86376P0);
            } else {
                if (this.f86383W0.isBannerBackButtonDisMissUI()) {
                    mo105397d1(this.f86381U0, false, OTConsentInteractionType.BANNER_BACK);
                } else if (this.f86383W0.isBannerBackButtonCloseBanner()) {
                    mo105397d1(this.f86381U0, true, OTConsentInteractionType.BANNER_CLOSE);
                }
                dismiss();
                return true;
            }
        }
        return false;
    }

    /* renamed from: h1 */
    public static boolean m145187h1(int i) {
        return i == C35265a.C35273h.small_banner_close || i == C35265a.C35273h.close_banner;
    }

    /* renamed from: k1 */
    public static boolean m145188k1(int i) {
        return i == C35265a.C35273h.close_banner_text || i == C35265a.C35273h.close_banner_button;
    }

    @C0363p0
    /* renamed from: Q0 */
    public final String mo105384Q0(@C0363p0 String str, @C0359n0 String str2) {
        if (!C35020d.m143605J(str)) {
            return str;
        }
        JSONObject jSONObject = this.f86377Q0;
        if (jSONObject != null) {
            return jSONObject.getString(str2);
        }
        return null;
    }

    /* renamed from: S0 */
    public final void mo105385S0(@C0359n0 View view) {
        this.f86403y = (Button) view.findViewById(C35265a.C35273h.btn_accept_cookies);
        this.f86390a = (TextView) view.findViewById(C35265a.C35273h.cookies_setting);
        this.f86396d = (TextView) view.findViewById(C35265a.C35273h.show_vendors_list);
        this.f86368H0 = (RelativeLayout) view.findViewById(C35265a.C35273h.banner_layout);
        this.f86393b1 = (ImageView) view.findViewById(C35265a.C35273h.close_banner);
        this.f86395c1 = (TextView) view.findViewById(C35265a.C35273h.close_banner_text);
        this.f86391a1 = (Button) view.findViewById(C35265a.C35273h.close_banner_button);
        this.f86404z = (Button) view.findViewById(C35265a.C35273h.btn_reject_cookies);
        this.f86372L0 = (ImageView) view.findViewById(C35265a.C35273h.banner_logo);
        this.f86384X = (Button) view.findViewById(C35265a.C35273h.cookies_setting_button);
        this.f86399g = (TextView) view.findViewById(C35265a.C35273h.cookie_policy_banner);
        this.f86400v = (TextView) view.findViewById(C35265a.C35273h.banner_additional_desc_after_title);
        this.f86401w = (TextView) view.findViewById(C35265a.C35273h.banner_additional_desc_after_desc);
        this.f86402x = (TextView) view.findViewById(C35265a.C35273h.banner_additional_desc_after_dpd);
        this.f86394c = (TextView) view.findViewById(C35265a.C35273h.banner_title);
        this.f86392b = (TextView) view.findViewById(C35265a.C35273h.alert_notice_text);
        this.f86397e = (TextView) view.findViewById(C35265a.C35273h.banner_IAB_title);
        this.f86398f = (TextView) view.findViewById(C35265a.C35273h.banner_IAB_desc);
        this.f86370J0 = (LinearLayout) view.findViewById(C35265a.C35273h.banner_top_layout);
        this.f86369I0 = (RelativeLayout) view.findViewById(C35265a.C35273h.small_banner_top_layout);
        this.f86389Z0 = (ImageView) view.findViewById(C35265a.C35273h.small_banner_close);
        this.f86373M0 = (TextView) view.findViewById(C35265a.C35273h.small_banner_title);
        this.f86374N0 = (ScrollView) view.findViewById(C35265a.C35273h.cookies_text_layout);
        this.f86371K0 = (LinearLayout) view.findViewById(C35265a.C35273h.button_layout);
        this.f86403y.setOnClickListener(this);
        this.f86396d.setOnClickListener(this);
        this.f86393b1.setOnClickListener(this);
        this.f86389Z0.setOnClickListener(this);
        this.f86395c1.setOnClickListener(this);
        this.f86391a1.setOnClickListener(this);
        this.f86404z.setOnClickListener(this);
        this.f86384X.setOnClickListener(this);
        this.f86390a.setOnClickListener(this);
        this.f86399g.setOnClickListener(this);
    }

    /* renamed from: T0 */
    public final void mo105386T0(@C0359n0 Button button, @C0359n0 C35105e eVar, @C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        C35110j o = eVar.mo104712o();
        this.f86381U0.mo104283v(button, o, this.f86383W0);
        if (!C35020d.m143605J(o.mo104757f())) {
            button.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        if (!C35020d.m143605J(str2)) {
            button.setTextColor(Color.parseColor(str2));
        }
        UIUtils.m143755p(this.f86379S0, button, eVar, str, str3);
    }

    /* renamed from: U0 */
    public final void mo105387U0(@C0359n0 TextView textView, int i, @C0359n0 String str) {
        textView.setVisibility(i);
        this.f86381U0.mo104279r(this.f86379S0, textView, str);
    }

    /* renamed from: V0 */
    public final void mo105388V0(@C0359n0 TextView textView, @C0359n0 C35105e eVar, @C0363p0 C35118r rVar) {
        C35110j o = eVar.mo104712o();
        this.f86381U0.mo104264A(textView, o, this.f86383W0);
        if (!C35020d.m143605J(o.mo104757f())) {
            textView.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        String Q0 = mo105384Q0(eVar.mo104296u(), "BannerMPButtonTextColor");
        if (!C35020d.m143605J(Q0)) {
            textView.setTextColor(Color.parseColor(Q0));
        }
        m145185X0(textView, rVar);
    }

    /* renamed from: W0 */
    public final void mo105389W0(@C0359n0 TextView textView, @C0359n0 C35111k kVar, @C0363p0 C35118r rVar) {
        C35102b0 a = kVar.mo104763a();
        mo105390Y0(textView, a, this.f86381U0.mo104273h(rVar, a, this.f86377Q0.optString("BannerLinksTextColor")), false);
        m145185X0(textView, rVar);
    }

    /* renamed from: Y0 */
    public final void mo105390Y0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var, @C0363p0 String str, boolean z) {
        C35110j a = b0Var.mo104657a();
        this.f86381U0.mo104264A(textView, a, this.f86383W0);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
        if (!C35020d.m143605J(str)) {
            textView.setTextColor(Color.parseColor(str));
        }
        C18196h2.m82478C1(textView, z);
    }

    /* renamed from: Z0 */
    public final void mo105391Z0(C31178a aVar, int i) {
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(C35265a.C35273h.design_bottom_sheet);
        this.f86365E0 = frameLayout;
        if (frameLayout != null) {
            this.f86388Z = BottomSheetBehavior.m125237i0(frameLayout);
            ViewGroup.LayoutParams layoutParams = this.f86365E0.getLayoutParams();
            int m1 = mo105403m1();
            double a = this.f86387Y0.mo105506a(this.f86382V0.mo104864u());
            if (!(layoutParams == null || 2 == i)) {
                layoutParams.height = (int) (((double) m1) * a);
            }
            this.f86365E0.setLayoutParams(layoutParams);
            this.f86388Z.mo88414S0(m1);
        }
    }

    @C0376v0(api = 21)
    /* renamed from: a */
    public final void mo105392a() {
        C35106f n = this.f86382V0.mo104856n();
        if (!C35019c.m143598c(n.mo104725f(), false)) {
            this.f86393b1.setVisibility(8);
        } else if (OTBannerHeightRatio.ONE_THIRD.equals(this.f86382V0.mo104864u())) {
            this.f86389Z0.setColorFilter(Color.parseColor(mo105384Q0(this.f86382V0.mo104856n().mo104723d(), "TextColor")));
            this.f86389Z0.setVisibility(0);
        } else if (!C35019c.m143598c(n.mo104727h(), false) || C35020d.m143605J(n.mo104729j())) {
            this.f86393b1.setVisibility(0);
        } else {
            C35105e a = n.mo104720a();
            if (C35019c.m143598c(a.mo104719x(), false)) {
                this.f86391a1.setText(n.mo104729j());
                this.f86391a1.setVisibility(0);
                String u = a.mo104296u();
                if (C35020d.m143605J(u)) {
                    u = n.mo104731l();
                }
                mo105386T0(this.f86391a1, a, mo105384Q0(a.mo104699a(), "ButtonColor"), mo105384Q0(u, "ButtonTextColor"), a.mo104702e());
                return;
            }
            this.f86395c1.setText(n.mo104729j());
            String a2 = C35018b.m143595a(this.f86385X0, mo105384Q0(n.mo104731l(), "TextColor"));
            if (!C35020d.m143605J(a2)) {
                this.f86395c1.setTextColor(Color.parseColor(a2));
            }
            this.f86395c1.setVisibility(0);
            m145185X0(this.f86395c1, this.f86385X0);
        }
    }

    /* renamed from: a1 */
    public void mo105393a1(@C0359n0 C34962a aVar) {
        this.f86376P0 = aVar;
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 1) {
            dismiss();
        }
        if (i == 2) {
            C35201e0 P0 = C35201e0.m145086P0(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG, this.f86376P0, this.f86383W0);
            this.f86386Y = P0;
            P0.mo105321X0(this.f86375O0);
        }
        if (i == 3) {
            C35249x0 R0 = C35249x0.m145291R0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f86376P0, this.f86383W0);
            this.f86367G0 = R0;
            R0.mo105487c1(this.f86375O0);
        }
    }

    /* renamed from: b1 */
    public void mo105395b1(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86383W0 = oTConfiguration;
    }

    /* renamed from: c1 */
    public final void mo105396c1(@C0359n0 UIUtils uIUtils, @C0359n0 String str) {
        C34963b bVar = new C34963b(17);
        bVar.mo103583e(str);
        uIUtils.mo104267E(bVar, this.f86376P0);
    }

    /* renamed from: d1 */
    public final void mo105397d1(@C0359n0 UIUtils uIUtils, boolean z, @C0359n0 String str) {
        if (z) {
            this.f86375O0.saveConsent(str);
        }
        uIUtils.mo104267E(new C34963b(2), this.f86376P0);
        mo105396c1(uIUtils, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105398e1(@androidx.annotation.C0359n0 com.onetrust.otpublishers.headless.p052UI.UIProperty.C35117q r6) {
        /*
            r5 = this;
            com.onetrust.otpublishers.headless.UI.mobiledatautils.a r0 = r5.f86387Y0
            java.lang.String r0 = r0.mo105513h()
            com.onetrust.otpublishers.headless.UI.UIProperty.b0 r6 = r6.mo104869z()
            java.lang.String r1 = r6.mo104663g()
            boolean r6 = r6.mo104669m()
            if (r6 == 0) goto L_0x005e
            boolean r6 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r1)
            if (r6 != 0) goto L_0x005e
            int r6 = r0.hashCode()
            r2 = -769568260(0xffffffffd22151fc, float:-1.73216301E11)
            r3 = 1
            r4 = 0
            if (r6 == r2) goto L_0x0044
            r2 = -278828896(0xffffffffef6168a0, float:-6.976061E28)
            if (r6 == r2) goto L_0x003a
            r2 = 1067338236(0x3f9e49fc, float:1.2366328)
            if (r6 == r2) goto L_0x0030
            goto L_0x004e
        L_0x0030:
            java.lang.String r6 = "AfterDPD"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x004e
            r6 = r3
            goto L_0x004f
        L_0x003a:
            java.lang.String r6 = "AfterDescription"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x004e
            r6 = 3
            goto L_0x004f
        L_0x0044:
            java.lang.String r6 = "AfterTitle"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x004e
            r6 = r4
            goto L_0x004f
        L_0x004e:
            r6 = -1
        L_0x004f:
            if (r6 == 0) goto L_0x0059
            if (r6 == r3) goto L_0x0056
            android.widget.TextView r6 = r5.f86401w
            goto L_0x005b
        L_0x0056:
            android.widget.TextView r6 = r5.f86402x
            goto L_0x005b
        L_0x0059:
            android.widget.TextView r6 = r5.f86400v
        L_0x005b:
            r5.mo105387U0(r6, r4, r1)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.fragment.C35217j.mo105398e1(com.onetrust.otpublishers.headless.UI.UIProperty.q):void");
    }

    /* renamed from: g1 */
    public final void mo105399g1(@C0359n0 C35117q qVar) {
        Resources resources;
        int i;
        C35102b0 B = qVar.mo104841B();
        int l = B.mo104668l();
        if (OTBannerHeightRatio.ONE_THIRD.equals(qVar.mo104864u())) {
            this.f86394c.setVisibility(8);
            this.f86373M0.setVisibility(l);
            mo105390Y0(this.f86373M0, B, mo105384Q0(B.mo104667k(), "TextColor"), true);
            this.f86381U0.mo104279r(this.f86379S0, this.f86373M0, B.mo104663g());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(3, this.f86369I0.getId());
            layoutParams.addRule(2, C35265a.C35273h.button_layout);
            this.f86374N0.setLayoutParams(layoutParams);
            if (getResources().getConfiguration().orientation == 2) {
                resources = getResources();
                i = C35265a.C35271f.ot_button_layout_padding;
            } else {
                resources = getResources();
                i = C35265a.C35271f.ot_margin_very_small;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C35265a.C35271f.ot_margin_text);
            this.f86371K0.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize);
            return;
        }
        mo105387U0(this.f86394c, l, B.mo104663g());
    }

    /* renamed from: i1 */
    public final void mo105400i1() {
        C35102b0 a = this.f86382V0.mo104842C().mo104763a();
        this.f86396d.setText(a.mo104663g());
        this.f86396d.setVisibility(a.mo104668l());
        this.f86397e.setVisibility(this.f86387Y0.mo105518m());
        this.f86398f.setVisibility(this.f86387Y0.mo105519n());
        this.f86381U0.mo104279r(this.f86379S0, this.f86397e, this.f86387Y0.mo105517l());
        String str = this.f86378R0;
        if (UIUtils.m143746M(str)) {
            String replace = str.replace("\\/", "/");
            if (replace.startsWith("[") || replace.endsWith("]")) {
                replace = this.f86387Y0.mo105512g(replace);
            }
            this.f86381U0.mo104279r(this.f86379S0, this.f86398f, replace);
            return;
        }
        this.f86398f.setText(this.f86387Y0.mo105512g(str));
    }

    /* renamed from: j1 */
    public final void mo105401j1(@C0359n0 C35117q qVar) {
        C35102b0 A = qVar.mo104840A();
        String g = A.mo104663g();
        if (!A.mo104669m() || C35020d.m143605J(g)) {
            this.f86392b.setVisibility(8);
        } else {
            this.f86381U0.mo104279r(this.f86379S0, this.f86392b, g);
        }
    }

    /* renamed from: l1 */
    public void mo105402l1() {
        if (this.f86377Q0 != null) {
            mo105399g1(this.f86382V0);
            mo105392a();
            mo105394b();
            mo105400i1();
        }
    }

    /* renamed from: m1 */
    public final int mo105403m1() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C19232h activity = getActivity();
        Objects.requireNonNull(activity);
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: n1 */
    public final void mo105404n1() {
        if (OTBannerHeightRatio.ONE_THIRD.equals(this.f86382V0.mo104864u())) {
            this.f86372L0.setVisibility(8);
            return;
        }
        C35112l v = this.f86382V0.mo104865v();
        if (v.mo104776e()) {
            ((C22090i) ((C22090i) ((C22090i) C22038b.m100352G(this).mo65605u(v.mo104774c()).mo66750K()).mo66746I(C35265a.C35272g.ic_ot)).mo65677O1(new C35218a(this, v)).mo66785e1(10000)).mo65675K1(this.f86372L0);
            return;
        }
        this.f86372L0.getLayoutParams().height = -2;
        this.f86372L0.setVisibility(4);
    }

    @C0376v0(api = 21)
    /* renamed from: o1 */
    public final void mo105405o1() {
        if (OTBannerHeightRatio.ONE_THIRD.equals(this.f86382V0.mo104864u())) {
            this.f86370J0.setVisibility(8);
            this.f86369I0.setVisibility(0);
        }
        String Q0 = mo105384Q0(this.f86382V0.mo104851i(), "BackgroundColor");
        if (!C35020d.m143605J(Q0)) {
            this.f86368H0.setBackgroundColor(Color.parseColor(Q0));
        }
        this.f86393b1.getDrawable().setTint(Color.parseColor(mo105384Q0(this.f86382V0.mo104856n().mo104723d(), "TextColor")));
        C35102b0 B = this.f86382V0.mo104841B();
        mo105390Y0(this.f86394c, B, mo105384Q0(B.mo104667k(), "TextColor"), true);
        mo105390Y0(this.f86397e, this.f86382V0.mo104861s(), mo105384Q0(B.mo104667k(), "TextColor"), true);
        C35102b0 A = this.f86382V0.mo104840A();
        mo105390Y0(this.f86392b, A, mo105384Q0(A.mo104667k(), "TextColor"), false);
        mo105390Y0(this.f86398f, this.f86382V0.mo104859q(), mo105384Q0(A.mo104667k(), "TextColor"), false);
        C35102b0 z = this.f86382V0.mo104869z();
        mo105390Y0(this.f86400v, z, mo105384Q0(z.mo104667k(), "TextColor"), false);
        mo105390Y0(this.f86401w, z, mo105384Q0(z.mo104667k(), "TextColor"), false);
        mo105390Y0(this.f86402x, z, mo105384Q0(z.mo104667k(), "TextColor"), false);
        mo105389W0(this.f86396d, this.f86382V0.mo104842C(), this.f86385X0);
        mo105389W0(this.f86399g, this.f86382V0.mo104866w(), this.f86385X0);
        C35257c.m145352d(this.f86399g);
        C35105e a = this.f86382V0.mo104843a();
        mo105386T0(this.f86403y, a, mo105384Q0(a.mo104699a(), "ButtonColor"), mo105384Q0(a.mo104296u(), "ButtonTextColor"), a.mo104702e());
        C35105e x = this.f86382V0.mo104867x();
        mo105386T0(this.f86404z, x, mo105384Q0(x.mo104699a(), "ButtonColor"), mo105384Q0(x.mo104296u(), "ButtonTextColor"), x.mo104702e());
        C35105e y = this.f86382V0.mo104868y();
        mo105386T0(this.f86384X, y, mo105384Q0(y.mo104699a(), "BannerMPButtonColor"), mo105384Q0(y.mo104296u(), "BannerMPButtonTextColor"), mo105384Q0(y.mo104702e(), "BannerMPButtonTextColor"));
        mo105388V0(this.f86390a, y, this.f86385X0);
    }

    public void onClick(View view) {
        String str;
        UIUtils uIUtils;
        String str2;
        UIUtils uIUtils2;
        C34963b bVar;
        int id = view.getId();
        if (id == C35265a.C35273h.btn_accept_cookies) {
            OTPublishersHeadlessSDK oTPublishersHeadlessSDK = this.f86375O0;
            str = OTConsentInteractionType.BANNER_ALLOW_ALL;
            oTPublishersHeadlessSDK.saveConsent(str);
            this.f86381U0.mo104267E(new C34963b(3), this.f86376P0);
        } else {
            if (id == C35265a.C35273h.cookies_setting_button) {
                this.f86386Y.mo105326b1(this);
                this.f86388Z.mo88418W0(3);
                if (!this.f86386Y.isAdded()) {
                    C35201e0 e0Var = this.f86386Y;
                    C19232h activity = getActivity();
                    Objects.requireNonNull(activity);
                    e0Var.show(activity.mo57175g0(), OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG);
                    uIUtils2 = this.f86381U0;
                    bVar = new C34963b(5);
                } else {
                    return;
                }
            } else if (id == C35265a.C35273h.cookies_setting) {
                this.f86386Y.mo105326b1(this);
                this.f86388Z.mo88418W0(3);
                if (!this.f86386Y.isAdded() && getActivity() != null) {
                    this.f86386Y.show(getActivity().mo57175g0(), OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG);
                    uIUtils2 = this.f86381U0;
                    bVar = new C34963b(5);
                } else {
                    return;
                }
            } else if (id != C35265a.C35273h.show_vendors_list) {
                if (m145187h1(id)) {
                    uIUtils = this.f86381U0;
                    str2 = OTConsentInteractionType.BANNER_CLOSE;
                } else if (m145188k1(id)) {
                    uIUtils = this.f86381U0;
                    str2 = OTConsentInteractionType.BANNER_CONTINUE_WITHOUT_ACCEPTING;
                } else if (id == C35265a.C35273h.btn_reject_cookies) {
                    OTPublishersHeadlessSDK oTPublishersHeadlessSDK2 = this.f86375O0;
                    str = OTConsentInteractionType.BANNER_REJECT_ALL;
                    oTPublishersHeadlessSDK2.saveConsent(str);
                    this.f86381U0.mo104267E(new C34963b(4), this.f86376P0);
                } else if (id == C35265a.C35273h.cookie_policy_banner) {
                    try {
                        C35020d.m143600B(this.f86379S0, this.f86377Q0.getString("BannerLink"));
                        return;
                    } catch (JSONException e) {
                        OTLogger.m143457l("OTSDKBanner", "Error in Configuring Banner policy link. Error msg = " + e.getMessage());
                        return;
                    }
                } else {
                    return;
                }
                mo105397d1(uIUtils, true, str2);
                dismiss();
            } else if (!this.f86367G0.isAdded() && getActivity() != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("IS_FILTERED_VENDOR_LIST", false);
                this.f86367G0.setArguments(bundle);
                this.f86367G0.mo105488d1(this);
                this.f86367G0.show(getActivity().mo57175g0(), OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG);
                uIUtils2 = this.f86381U0;
                bVar = new C34963b(12);
            } else {
                return;
            }
            uIUtils2.mo104267E(bVar, this.f86376P0);
            return;
        }
        mo105396c1(this.f86381U0, str);
        dismiss();
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo105391Z0(this.f86366F0, configuration.orientation);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getContext() != null) {
            Context applicationContext = getContext().getApplicationContext();
            this.f86375O0 = new OTPublishersHeadlessSDK(applicationContext);
            this.f86380T0 = new C35014d(applicationContext, "OTT_DEFAULT_USER").mo103965b();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35215i(this));
        return onCreateDialog;
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f86379S0 = getContext();
        C35201e0 P0 = C35201e0.m145086P0(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG, this.f86376P0, this.f86383W0);
        this.f86386Y = P0;
        P0.mo105321X0(this.f86375O0);
        C35249x0 R0 = C35249x0.m145291R0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f86376P0, this.f86383W0);
        this.f86367G0 = R0;
        R0.mo105487c1(this.f86375O0);
        this.f86382V0 = new C35117q();
        this.f86385X0 = new C35118r();
        UIUtils uIUtils = new UIUtils();
        this.f86381U0 = uIUtils;
        this.f86387Y0 = new C35255a();
        View e = uIUtils.mo104271e(this.f86379S0, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_banner);
        mo105385S0(e);
        String string = this.f86380T0.getString("OTT_BANNER_POSITION", "");
        this.f86377Q0 = this.f86387Y0.mo105509d(this.f86379S0, UIUtils.m143749b(this.f86379S0, this.f86383W0), this.f86375O0, string);
        this.f86382V0 = this.f86387Y0.mo105521p();
        this.f86385X0 = this.f86387Y0.mo105522q();
        mo105407p1();
        try {
            mo105405o1();
        } catch (JSONException e2) {
            OTLogger.m143457l("OTSDKBanner", "Error in populating the Banner UI, error message = " + e2.getMessage());
        }
        try {
            mo105402l1();
        } catch (JSONException e3) {
            OTLogger.m143457l("OTSDKBanner", "Error in Configuring Banner. Error msg = " + e3.getMessage());
        }
        this.f86367G0.mo105488d1(this);
        this.f86386Y.mo105326b1(this);
        return e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86376P0 = null;
    }

    /* renamed from: p1 */
    public final void mo105407p1() {
        if (this.f86377Q0 != null) {
            try {
                this.f86399g.setVisibility(this.f86387Y0.mo105515j());
                this.f86399g.setText(this.f86387Y0.mo105514i());
                this.f86378R0 = this.f86387Y0.mo105516k();
                mo105401j1(this.f86382V0);
                mo105398e1(this.f86382V0);
                this.f86384X.setText(this.f86387Y0.mo105520o());
                this.f86390a.setText(this.f86387Y0.mo105520o());
                this.f86403y.setText(this.f86387Y0.mo105508c());
                mo105404n1();
            } catch (JSONException e) {
                OTLogger.m143457l("OTSDKBanner", "error while rendering banner. error = " + e.getMessage());
            }
        } else {
            OTLogger.m143458m("OTSDKBanner", "Unable to access SDK Data!!");
        }
    }

    /* renamed from: b */
    public final void mo105394b() {
        this.f86403y.setVisibility(this.f86387Y0.mo105510e());
        this.f86404z.setVisibility(this.f86387Y0.mo105524s());
        this.f86404z.setText(this.f86387Y0.mo105523r());
        this.f86384X.setVisibility(this.f86387Y0.mo105507b(1));
        this.f86390a.setVisibility(this.f86387Y0.mo105507b(0));
    }
}
