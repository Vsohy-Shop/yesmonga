package com.onetrust.otpublishers.headless.p052UI.TVUI.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35033b;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35067a;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35111k;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.a */
public class C35072a extends Fragment implements View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: E0 */
    public TextView f85434E0;

    /* renamed from: F0 */
    public TextView f85435F0;

    /* renamed from: G0 */
    public Button f85436G0;

    /* renamed from: H0 */
    public Button f85437H0;

    /* renamed from: I0 */
    public int f85438I0;

    /* renamed from: X */
    public ImageView f85439X;

    /* renamed from: Y */
    public ImageView f85440Y;

    /* renamed from: Z */
    public TextView f85441Z;

    /* renamed from: a */
    public TextView f85442a;

    /* renamed from: b */
    public TextView f85443b;

    /* renamed from: c */
    public Button f85444c;

    /* renamed from: d */
    public Button f85445d;

    /* renamed from: e */
    public Button f85446e;

    /* renamed from: f */
    public Context f85447f;

    /* renamed from: g */
    public C35067a f85448g;

    /* renamed from: v */
    public C35073a f85449v;

    /* renamed from: w */
    public LinearLayout f85450w;

    /* renamed from: x */
    public TextView f85451x;

    /* renamed from: y */
    public TextView f85452y;

    /* renamed from: z */
    public View f85453z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.a$a */
    public interface C35073a {
        /* renamed from: a */
        void mo104471a();

        /* renamed from: b */
        void mo104472b(int i);
    }

    @C0359n0
    /* renamed from: I0 */
    public static C35072a m143991I0(@C0359n0 String str, @C0359n0 C35073a aVar) {
        C35072a aVar2 = new C35072a();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        aVar2.setArguments(bundle);
        aVar2.mo104459M0(aVar);
        return aVar2;
    }

    @C0376v0(api = 21)
    /* renamed from: N0 */
    public static void m143992N0(@C0359n0 C35105e eVar, @C0359n0 Button button) {
        button.setText(eVar.mo104295s());
        if (eVar.mo104296u() != null) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        }
        button.getBackground().setTint(Color.parseColor(eVar.mo104699a()));
        button.setVisibility(eVar.mo104297w());
        button.setElevation(0.0f);
    }

    /* renamed from: R0 */
    public static boolean m143993R0(View view, int i, KeyEvent keyEvent) {
        return view.getId() == C35265a.C35273h.tv_close_banner && C35036e.m143801a(i, keyEvent) == 21;
    }

    /* renamed from: S0 */
    public static boolean m143994S0(View view, int i, KeyEvent keyEvent) {
        return view.getId() == C35265a.C35273h.tv_close_banner_text && C35036e.m143801a(i, keyEvent) == 21;
    }

    /* renamed from: J0 */
    public final void mo104456J0(@C0359n0 View view) {
        this.f85444c = (Button) view.findViewById(C35265a.C35273h.btn_accept_TV);
        this.f85445d = (Button) view.findViewById(C35265a.C35273h.btn_reject_TV);
        this.f85446e = (Button) view.findViewById(C35265a.C35273h.btn_mp_TV);
        this.f85442a = (TextView) view.findViewById(C35265a.C35273h.banner_title_tv);
        this.f85443b = (TextView) view.findViewById(C35265a.C35273h.banner_desc_tv);
        this.f85450w = (LinearLayout) view.findViewById(C35265a.C35273h.banner_tv_layout);
        this.f85451x = (TextView) view.findViewById(C35265a.C35273h.banner_iab_title_tv);
        this.f85452y = (TextView) view.findViewById(C35265a.C35273h.banner_iab_desc_tv);
        this.f85453z = view.findViewById(C35265a.C35273h.ot_tv_button_divider);
        this.f85439X = (ImageView) view.findViewById(C35265a.C35273h.tv_close_banner);
        this.f85440Y = (ImageView) view.findViewById(C35265a.C35273h.ot_tv_banner_logo);
        this.f85434E0 = (TextView) view.findViewById(C35265a.C35273h.banner_ad_after_desc_tv);
        this.f85441Z = (TextView) view.findViewById(C35265a.C35273h.banner_ad_after_title_tv);
        this.f85435F0 = (TextView) view.findViewById(C35265a.C35273h.banner_ad_after_dpd_tv);
        this.f85436G0 = (Button) view.findViewById(C35265a.C35273h.btn_VL_link_TV);
        this.f85437H0 = (Button) view.findViewById(C35265a.C35273h.tv_close_banner_text);
    }

    /* renamed from: K0 */
    public final void mo104457K0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        UIUtils uIUtils = new UIUtils();
        textView.setVisibility(0);
        textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        if (b0Var.mo104663g() != null) {
            uIUtils.mo104279r(this.f85447f, textView, b0Var.mo104663g());
        }
    }

    /* renamed from: L0 */
    public final void mo104458L0(@C0359n0 C35033b bVar) {
        View view;
        Button button;
        int w = this.f85448g.mo104357b().mo104297w();
        int w2 = this.f85448g.mo104371r().mo104297w();
        int w3 = this.f85448g.mo104370q().mo104297w();
        int w4 = bVar.mo104297w();
        int F = bVar.mo104291F();
        if (w == 0) {
            button = this.f85444c;
        } else if (w2 == 0) {
            button = this.f85445d;
        } else {
            if (w3 == 0) {
                view = this.f85446e;
            } else if (w4 == 0) {
                view = this.f85439X;
            } else if (F == 0) {
                view = this.f85437H0;
            } else {
                return;
            }
            view.requestFocus();
            return;
        }
        button.requestFocus();
    }

    /* renamed from: M0 */
    public final void mo104459M0(@C0359n0 C35073a aVar) {
        this.f85449v = aVar;
    }

    /* renamed from: O0 */
    public final void mo104460O0(@C0359n0 C35102b0 b0Var, @C0359n0 TextView textView) {
        textView.setVisibility(b0Var.mo104668l());
        textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        new UIUtils().mo104279r(this.f85447f, textView, b0Var.mo104663g());
    }

    @C0376v0(api = 21)
    /* renamed from: P0 */
    public final void mo104461P0(@C0363p0 String str, @C0359n0 Button button) {
        if (str != null && !C35020d.m143605J(str)) {
            button.setTextColor(Color.parseColor(str));
        }
        button.setPaintFlags(button.getPaintFlags() | 8);
        button.getBackground().setTint(Color.parseColor(this.f85448g.mo104365k()));
        button.setElevation(0.0f);
    }

    @C0376v0(api = 21)
    /* renamed from: Q0 */
    public final void mo104462Q0(boolean z, @C0359n0 Button button, @C0359n0 C35105e eVar, @C0363p0 String str) {
        if (z) {
            C35036e.m143803e(true, button, eVar);
            button.setPaintFlags(button.getPaintFlags() & -9);
            return;
        }
        mo104461P0(str, button);
    }

    @C0376v0(api = 21)
    /* renamed from: T0 */
    public final void mo104463T0() {
        mo104460O0(this.f85448g.mo104373t(), this.f85442a);
        mo104460O0(this.f85448g.mo104366l(), this.f85443b);
        mo104460O0(this.f85448g.mo104368n(), this.f85451x);
        mo104460O0(this.f85448g.mo104367m(), this.f85452y);
        mo104464U0();
        mo104467a();
    }

    /* renamed from: U0 */
    public final void mo104464U0() {
        C35102b0 g = this.f85448g.mo104361g();
        String g2 = g.mo104663g();
        String j = this.f85448g.mo104364j();
        if (!C35020d.m143605J(g2) && g.mo104669m()) {
            j.hashCode();
            mo104457K0(!j.equals("AfterTitle") ? !j.equals("AfterDPD") ? this.f85434E0 : this.f85435F0 : this.f85441Z, g);
        }
    }

    /* renamed from: V0 */
    public final void mo104465V0() {
        Button button;
        int i = this.f85438I0;
        if (i == 1) {
            button = this.f85446e;
        } else if (i == 2) {
            button = this.f85436G0;
        } else {
            return;
        }
        button.requestFocus();
    }

    /* renamed from: W0 */
    public final void mo104466W0() {
        if (this.f85448g.mo104369p().mo104776e()) {
            ((C22090i) ((C22090i) ((C22090i) C22038b.m100352G(this).mo65605u(this.f85448g.mo104369p().mo104774c()).mo66750K()).mo66785e1(10000)).mo66746I(C35265a.C35272g.ic_ot)).mo65675K1(this.f85440Y);
        }
    }

    @C0376v0(api = 21)
    /* renamed from: a */
    public final void mo104467a() {
        mo104466W0();
        this.f85453z.setBackgroundColor(Color.parseColor(this.f85448g.mo104366l().mo104667k()));
        this.f85450w.setBackgroundColor(Color.parseColor(this.f85448g.mo104365k()));
        m143992N0(this.f85448g.mo104357b(), this.f85444c);
        m143992N0(this.f85448g.mo104371r(), this.f85445d);
        C35105e q = this.f85448g.mo104370q();
        if (!C35019c.m143598c(q.mo104714q(), false)) {
            m143992N0(q, this.f85446e);
        } else {
            this.f85446e.setText(q.mo104295s());
            mo104461P0(q.mo104296u(), this.f85446e);
        }
        C35111k u = this.f85448g.mo104374u();
        this.f85436G0.setText(u.mo104763a().mo104663g());
        mo104462Q0(false, this.f85436G0, this.f85448g.mo104370q(), u.mo104763a().mo104667k());
        this.f85436G0.setVisibility(u.mo104770h());
        C35033b s = this.f85448g.mo104372s();
        this.f85439X.getBackground().setTint(Color.parseColor(this.f85448g.mo104366l().mo104667k()));
        this.f85439X.getDrawable().setTint(Color.parseColor(this.f85448g.mo104365k()));
        this.f85439X.setVisibility(s.mo104297w());
        if (!C35020d.m143605J(s.mo104295s())) {
            this.f85437H0.setText(s.mo104295s());
            mo104461P0(s.mo104296u(), this.f85437H0);
        }
        this.f85437H0.setVisibility(s.mo104291F());
        if (this.f85438I0 == 0) {
            mo104458L0(s);
        } else {
            mo104465V0();
        }
    }

    /* renamed from: b */
    public final void mo104468b() {
        this.f85444c.setOnKeyListener(this);
        this.f85445d.setOnKeyListener(this);
        this.f85446e.setOnKeyListener(this);
        this.f85439X.setOnKeyListener(this);
        this.f85436G0.setOnKeyListener(this);
        this.f85437H0.setOnKeyListener(this);
        this.f85444c.setOnFocusChangeListener(this);
        this.f85445d.setOnFocusChangeListener(this);
        this.f85446e.setOnFocusChangeListener(this);
        this.f85436G0.setOnFocusChangeListener(this);
        this.f85437H0.setOnFocusChangeListener(this);
        this.f85439X.setOnFocusChangeListener(this);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f85447f = getActivity();
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85447f, layoutInflater, viewGroup, C35265a.C35276k.ot_banner_tvfragment);
        mo104456J0(e);
        mo104468b();
        if (getArguments() != null && getArguments().containsKey("OT_TV_FOCUSED_BTN")) {
            this.f85438I0 = getArguments().getInt("OT_TV_FOCUSED_BTN");
        }
        this.f85448g = C35067a.m143884o();
        mo104463T0();
        return e;
    }

    @C0376v0(api = 21)
    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.btn_accept_TV) {
            C35036e.m143803e(z, this.f85444c, this.f85448g.mo104357b());
        }
        if (view.getId() == C35265a.C35273h.btn_reject_TV) {
            C35036e.m143803e(z, this.f85445d, this.f85448g.mo104371r());
        }
        if (view.getId() == C35265a.C35273h.btn_mp_TV) {
            if (C35019c.m143598c(this.f85448g.mo104370q().mo104714q(), false)) {
                mo104462Q0(z, this.f85446e, this.f85448g.mo104370q(), this.f85448g.mo104370q().mo104296u());
            } else {
                C35036e.m143803e(z, this.f85446e, this.f85448g.mo104370q());
            }
        }
        if (view.getId() == C35265a.C35273h.btn_VL_link_TV) {
            mo104462Q0(z, this.f85436G0, this.f85448g.mo104357b(), this.f85448g.mo104374u().mo104763a().mo104667k());
        }
        if (view.getId() == C35265a.C35273h.tv_close_banner_text) {
            mo104462Q0(z, this.f85437H0, this.f85448g.mo104372s().mo104289D(), this.f85448g.mo104372s().mo104296u());
        }
        if (view.getId() == C35265a.C35273h.tv_close_banner) {
            C35105e D = this.f85448g.mo104372s().mo104289D();
            if (!z) {
                this.f85439X.getBackground().setTint(Color.parseColor(this.f85448g.mo104366l().mo104667k()));
                this.f85439X.getDrawable().setTint(Color.parseColor(this.f85448g.mo104365k()));
            } else if (!C35020d.m143605J(D.mo104708k()) && !C35020d.m143605J(D.mo104710m())) {
                this.f85439X.getBackground().setTint(Color.parseColor(D.mo104708k()));
                this.f85439X.getDrawable().setTint(Color.parseColor(D.mo104710m()));
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view.getId() == C35265a.C35273h.btn_accept_TV && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85449v.mo104472b(11);
        }
        if (view.getId() == C35265a.C35273h.btn_reject_TV && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85449v.mo104472b(12);
        }
        if (view.getId() == C35265a.C35273h.btn_mp_TV && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85449v.mo104471a();
        }
        if (m143993R0(view, i, keyEvent)) {
            this.f85449v.mo104472b(13);
        }
        if (m143994S0(view, i, keyEvent)) {
            this.f85449v.mo104472b(16);
        }
        if (view.getId() != C35265a.C35273h.btn_VL_link_TV || C35036e.m143801a(i, keyEvent) != 21) {
            return false;
        }
        this.f85449v.mo104472b(15);
        return false;
    }
}
