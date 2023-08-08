package com.onetrust.otpublishers.headless.p052UI.TVUI.fragments;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.exifinterface.media.C19135a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35063q;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35070d;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35091p;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35094q;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.s */
public class C35097s extends Fragment implements C35063q.C35065b, View.OnKeyListener, C35091p.C35093b, C35094q.C35095a, OTVendorUtils.ItemListener, View.OnFocusChangeListener {

    /* renamed from: S0 */
    public static final /* synthetic */ boolean f85600S0 = true;

    /* renamed from: E0 */
    public C35063q f85601E0;

    /* renamed from: F0 */
    public View f85602F0;

    /* renamed from: G0 */
    public TextView f85603G0;

    /* renamed from: H0 */
    public C35091p f85604H0;

    /* renamed from: I0 */
    public Button f85605I0;

    /* renamed from: J0 */
    public Button f85606J0;

    /* renamed from: K0 */
    public Button f85607K0;

    /* renamed from: L0 */
    public Button f85608L0;

    /* renamed from: M0 */
    public Button f85609M0;

    /* renamed from: N0 */
    public Button f85610N0;

    /* renamed from: O0 */
    public Button f85611O0;

    /* renamed from: P0 */
    public ImageView f85612P0;

    /* renamed from: Q0 */
    public ArrayList<String> f85613Q0;

    /* renamed from: R0 */
    public String f85614R0;

    /* renamed from: X */
    public Map<String, String> f85615X = new HashMap();

    /* renamed from: Y */
    public boolean f85616Y;

    /* renamed from: Z */
    public OTVendorUtils f85617Z;

    /* renamed from: a */
    public Context f85618a;

    /* renamed from: b */
    public OTPublishersHeadlessSDK f85619b;

    /* renamed from: c */
    public C35098a f85620c;

    /* renamed from: d */
    public C34962a f85621d;

    /* renamed from: e */
    public RecyclerView f85622e;

    /* renamed from: f */
    public C35069c f85623f;

    /* renamed from: g */
    public C35070d f85624g;

    /* renamed from: v */
    public RelativeLayout f85625v;

    /* renamed from: w */
    public LinearLayout f85626w;

    /* renamed from: x */
    public ImageView f85627x;

    /* renamed from: y */
    public ImageView f85628y;

    /* renamed from: z */
    public View f85629z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.s$a */
    public interface C35098a {
        /* renamed from: b */
        void mo104472b(int i);
    }

    @C0359n0
    /* renamed from: J0 */
    public static C35097s m144184J0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0359n0 C35098a aVar2, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0363p0 Map<String, String> map, boolean z) {
        C35097s sVar = new C35097s();
        Bundle bundle = new Bundle();
        bundle.putString("TV_PC_CONTENT", str);
        sVar.setArguments(bundle);
        sVar.mo104610M0(aVar);
        sVar.mo104612O0(aVar2);
        sVar.mo104611N0(oTPublishersHeadlessSDK);
        sVar.mo104617V0(z, map);
        return sVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ void m144185L0(C19499w wVar, Lifecycle.C19372Event event) {
        if (event.compareTo(Lifecycle.C19372Event.ON_RESUME) == 0) {
            this.f85607K0.clearFocus();
            this.f85606J0.clearFocus();
            this.f85605I0.clearFocus();
        }
    }

    @C0376v0(api = 21)
    /* renamed from: P0 */
    public static void m144186P0(@C0359n0 C35105e eVar, @C0359n0 Button button) {
        button.setText(eVar.mo104295s());
        if (eVar.mo104296u() != null) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        }
        button.getBackground().setTint(Color.parseColor(eVar.mo104699a()));
        button.setVisibility(eVar.mo104297w());
        button.setElevation(0.0f);
    }

    @C0376v0(api = 21)
    /* renamed from: R0 */
    public static void m144187R0(@C0363p0 String str, @C0363p0 String str2, @C0359n0 Button button) {
        if (str != null && str2 != null) {
            button.getBackground().setTint(Color.parseColor(str));
            button.setTextColor(Color.parseColor(str2));
        }
    }

    /* renamed from: K0 */
    public final void mo104609K0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.tv_grp_list);
        this.f85622e = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f85622e.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f85625v = (RelativeLayout) view.findViewById(C35265a.C35273h.tv_vl_main_lyt);
        this.f85626w = (LinearLayout) view.findViewById(C35265a.C35273h.tv_btn_vl_layout);
        this.f85627x = (ImageView) view.findViewById(C35265a.C35273h.ot_vl_logo);
        this.f85629z = view.findViewById(C35265a.C35273h.ot_vl_list_div_tv);
        this.f85628y = (ImageView) view.findViewById(C35265a.C35273h.ot_vl_back);
        this.f85602F0 = view.findViewById(C35265a.C35273h.vl_logo_div);
        this.f85603G0 = (TextView) view.findViewById(C35265a.C35273h.tv_vl_title);
        this.f85605I0 = (Button) view.findViewById(C35265a.C35273h.tv_btn_vl_confirm);
        this.f85606J0 = (Button) view.findViewById(C35265a.C35273h.tv_btn_vl_accept);
        this.f85607K0 = (Button) view.findViewById(C35265a.C35273h.tv_btn_vl_reject);
        this.f85612P0 = (ImageView) view.findViewById(C35265a.C35273h.ot_vl_tv_filter);
        this.f85608L0 = (Button) view.findViewById(C35265a.C35273h.ot_tv_alphabet_a_f);
        this.f85609M0 = (Button) view.findViewById(C35265a.C35273h.ot_tv_alphabet_g_l);
        this.f85610N0 = (Button) view.findViewById(C35265a.C35273h.ot_tv_alphabet_m_r);
        this.f85611O0 = (Button) view.findViewById(C35265a.C35273h.ot_tv_alphabet_s_z);
    }

    /* renamed from: M0 */
    public void mo104610M0(@C0359n0 C34962a aVar) {
        this.f85621d = aVar;
    }

    /* renamed from: N0 */
    public void mo104611N0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85619b = oTPublishersHeadlessSDK;
        this.f85617Z = oTPublishersHeadlessSDK.getOtVendorUtils();
    }

    /* renamed from: O0 */
    public void mo104612O0(@C0359n0 C35098a aVar) {
        this.f85620c = aVar;
    }

    /* renamed from: Q0 */
    public final void mo104613Q0(@C0359n0 String str, @C0359n0 Button button) {
        String str2;
        button.setSelected(!button.isSelected());
        if (!button.isSelected()) {
            this.f85613Q0.remove(str);
            m144187R0(this.f85623f.mo104421u().mo104699a(), this.f85623f.mo104421u().mo104296u(), button);
            if (this.f85613Q0.size() == 0) {
                str2 = "A_F";
            } else if (!this.f85613Q0.contains(this.f85614R0)) {
                ArrayList<String> arrayList = this.f85613Q0;
                str2 = arrayList.get(arrayList.size() - 1);
            }
            this.f85614R0 = str2;
        } else {
            this.f85614R0 = str;
            this.f85613Q0.add(str);
            m144187R0(this.f85623f.mo104402J().mo104778a(), this.f85623f.mo104402J().mo104780c(), button);
        }
        this.f85601E0.mo104345r(this.f85613Q0);
        this.f85601E0.mo104350x();
        this.f85601E0.mo104349w();
        this.f85601E0.notifyDataSetChanged();
    }

    /* renamed from: S0 */
    public final void mo104614S0(boolean z, Button button, C35105e eVar) {
        String str;
        if (z) {
            button.setElevation(6.0f);
            if (!C35020d.m143605J(eVar.mo104708k()) && !C35020d.m143605J(eVar.mo104710m())) {
                button.getBackground().setTint(Color.parseColor(eVar.mo104708k()));
                str = eVar.mo104710m();
            } else {
                return;
            }
        } else {
            button.setElevation(0.0f);
            if (mo104618W0(button)) {
                button.getBackground().setTint(Color.parseColor(this.f85623f.mo104402J().mo104778a()));
                str = this.f85623f.mo104402J().mo104780c();
            } else {
                button.getBackground().setTint(Color.parseColor(eVar.mo104699a()));
                str = eVar.mo104296u();
            }
        }
        button.setTextColor(Color.parseColor(str));
    }

    @C0376v0(api = 21)
    /* renamed from: T0 */
    public final void mo104615T0(boolean z, @C0359n0 ImageView imageView) {
        Drawable drawable;
        String a;
        if (z) {
            drawable = imageView.getDrawable();
            a = this.f85624g.mo104429d().mo104708k();
        } else {
            Map<String, String> map = this.f85615X;
            if (map == null || map.isEmpty()) {
                drawable = imageView.getDrawable();
                a = this.f85624g.mo104429d().mo104699a();
            } else {
                drawable = imageView.getDrawable();
                a = this.f85624g.mo104429d().mo104296u();
            }
        }
        drawable.setTint(Color.parseColor(a));
    }

    @C0376v0(api = 21)
    /* renamed from: U0 */
    public final void mo104616U0(boolean z, @C0359n0 C35105e eVar, @C0359n0 ImageView imageView) {
        String str;
        Drawable drawable;
        if (z) {
            imageView.getBackground().setTint(Color.parseColor(eVar.mo104708k()));
            drawable = imageView.getDrawable();
            str = eVar.mo104710m();
        } else {
            imageView.getBackground().setTint(Color.parseColor(this.f85623f.mo104393A()));
            drawable = imageView.getDrawable();
            str = this.f85623f.mo104419s();
        }
        drawable.setTint(Color.parseColor(str));
    }

    /* renamed from: V0 */
    public void mo104617V0(boolean z, @C0363p0 Map<String, String> map) {
        this.f85616Y = z;
        this.f85615X = map;
    }

    /* renamed from: W0 */
    public final boolean mo104618W0(@C0359n0 Button button) {
        return mo104619X0(button, "A_F", "A") || mo104619X0(button, "G_L", EnergyLabelKt.f67712j) || mo104619X0(button, "M_R", "M") || mo104619X0(button, "S_Z", C19135a.f48823R4);
    }

    /* renamed from: X0 */
    public final boolean mo104619X0(@C0359n0 Button button, @C0359n0 String str, @C0359n0 String str2) {
        return this.f85613Q0.contains(str) && button.getText().toString().startsWith(str2);
    }

    /* renamed from: Y0 */
    public final void mo104620Y0(@C0359n0 String str) {
        if (this.f85619b.getVendorDetails(Integer.parseInt(str)) == null) {
            this.f85619b.reInitVendorArray();
        }
        if (!C35020d.m143605J(str)) {
            this.f85604H0 = C35091p.m144143L0(OTFragmentTags.OT_VENDOR_DETAILS_FRAGMENT_TAG, this.f85621d, str, this, this.f85619b);
            getChildFragmentManager().mo56909u().mo57201C(C35265a.C35273h.ot_vl_detail_container, this.f85604H0).mo57225o((String) null).mo57052q();
            this.f85604H0.getLifecycle().mo57464a(new C35096r(this));
        }
    }

    @C0376v0(api = 21)
    /* renamed from: Z0 */
    public final void mo104621Z0() {
        String s = this.f85623f.mo104419s();
        String A = this.f85623f.mo104393A();
        C35105e u = this.f85623f.mo104421u();
        String a = u.mo104699a();
        String u2 = u.mo104296u();
        m144186P0(u, this.f85605I0);
        m144186P0(this.f85623f.mo104405c(), this.f85606J0);
        m144186P0(this.f85623f.mo104398F(), this.f85607K0);
        this.f85625v.setBackgroundColor(Color.parseColor(s));
        this.f85626w.setBackgroundColor(Color.parseColor(s));
        this.f85629z.setBackgroundColor(Color.parseColor(A));
        this.f85602F0.setBackgroundColor(Color.parseColor(A));
        this.f85603G0.setTextColor(Color.parseColor(A));
        m144187R0(a, u2, this.f85608L0);
        m144187R0(a, u2, this.f85609M0);
        m144187R0(a, u2, this.f85610N0);
        m144187R0(a, u2, this.f85611O0);
        mo104616U0(false, u, this.f85628y);
        mo104615T0(false, this.f85612P0);
        mo104626e1();
    }

    /* renamed from: a */
    public void mo104353a() {
        this.f85604H0.mo104590b1();
        this.f85607K0.clearFocus();
        this.f85606J0.clearFocus();
        this.f85605I0.clearFocus();
    }

    /* renamed from: a1 */
    public final void mo104622a1() {
        this.f85628y.setOnKeyListener(this);
        this.f85607K0.setOnKeyListener(this);
        this.f85606J0.setOnKeyListener(this);
        this.f85605I0.setOnKeyListener(this);
        this.f85612P0.setOnKeyListener(this);
        this.f85608L0.setOnKeyListener(this);
        this.f85609M0.setOnKeyListener(this);
        this.f85610N0.setOnKeyListener(this);
        this.f85611O0.setOnKeyListener(this);
        this.f85628y.setOnFocusChangeListener(this);
        this.f85607K0.setOnFocusChangeListener(this);
        this.f85606J0.setOnFocusChangeListener(this);
        this.f85605I0.setOnFocusChangeListener(this);
        this.f85612P0.setOnFocusChangeListener(this);
        this.f85608L0.setOnFocusChangeListener(this);
        this.f85609M0.setOnFocusChangeListener(this);
        this.f85610N0.setOnFocusChangeListener(this);
        this.f85611O0.setOnFocusChangeListener(this);
    }

    /* renamed from: b */
    public void mo104597b(int i) {
        if (i == 24) {
            this.f85601E0.notifyDataSetChanged();
        } else {
            getChildFragmentManager().mo56912v1();
        }
    }

    /* renamed from: b1 */
    public final void mo104623b1() {
        JSONObject vendorsByPurpose = this.f85616Y ? this.f85617Z.getVendorsByPurpose(this.f85615X, this.f85619b.getVendorListUI()) : this.f85619b.getVendorListUI();
        if (!f85600S0 && vendorsByPurpose == null) {
            throw new AssertionError();
        } else if (vendorsByPurpose.length() > 0) {
            JSONArray names = vendorsByPurpose.names();
            Objects.requireNonNull(names);
            mo104620Y0(names.getString(0));
        }
    }

    /* renamed from: c */
    public void mo104608c(@C0359n0 Map<String, String> map) {
        Drawable drawable;
        String str;
        mo104617V0(!map.isEmpty(), map);
        C35105e d = this.f85624g.mo104429d();
        if (!map.isEmpty()) {
            drawable = this.f85612P0.getDrawable();
            str = d.mo104296u();
        } else {
            drawable = this.f85612P0.getDrawable();
            str = d.mo104699a();
        }
        drawable.setTint(Color.parseColor(str));
        this.f85601E0.mo104348u(!map.isEmpty());
        this.f85601E0.mo104347t(map);
        this.f85601E0.mo104350x();
        this.f85601E0.mo104349w();
        this.f85601E0.notifyDataSetChanged();
        try {
            mo104623b1();
        } catch (JSONException e) {
            OTLogger.m143457l("TVVendorList", "error while setting first vendor detail,err " + e.toString());
        }
    }

    /* renamed from: c1 */
    public final void mo104624c1() {
        try {
            this.f85603G0.setText(this.f85624g.mo104433i());
            C35063q qVar = new C35063q(this.f85617Z, this, this.f85619b, this.f85616Y, this.f85615X);
            this.f85601E0 = qVar;
            qVar.mo104350x();
            this.f85622e.setAdapter(this.f85601E0);
            mo104623b1();
        } catch (JSONException e) {
            OTLogger.m143457l("TVVendorList", "error while populating VL fields" + e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo104355d(@C0359n0 String str) {
        mo104620Y0(str);
    }

    /* renamed from: d1 */
    public final void mo104625d1() {
        getChildFragmentManager().mo56909u().mo57201C(C35265a.C35273h.ot_vl_detail_container, C35094q.m144172I0(OTFragmentTags.OT_VENDOR_LIST_FILTER_FRAGMENT_TAG, this.f85621d, this, this.f85619b, this.f85615X, this.f85616Y)).mo57225o((String) null).mo57052q();
    }

    /* renamed from: e1 */
    public final void mo104626e1() {
        if (this.f85623f.mo104396D().mo104776e()) {
            ((C22090i) ((C22090i) ((C22090i) C22038b.m100352G(this).mo65605u(this.f85623f.mo104396D().mo104774c()).mo66750K()).mo66785e1(10000)).mo66746I(C35265a.C35272g.ic_ot)).mo65675K1(this.f85627x);
            return;
        }
        this.f85627x.setVisibility(8);
        this.f85602F0.setVisibility(8);
    }

    /* renamed from: j */
    public void mo104598j(boolean z) {
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85618a = getActivity();
        this.f85623f = C35069c.m143925y();
        this.f85624g = C35070d.m143959g();
        this.f85613Q0 = new ArrayList<>();
        this.f85614R0 = "A_F";
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85618a, layoutInflater, viewGroup, C35265a.C35276k.ot_vendor_list_tvfragment);
        mo104609K0(e);
        mo104622a1();
        mo104621Z0();
        mo104624c1();
        return e;
    }

    @C0376v0(api = 21)
    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.tv_btn_vl_confirm) {
            C35036e.m143803e(z, this.f85605I0, this.f85623f.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.tv_btn_vl_reject) {
            C35036e.m143803e(z, this.f85607K0, this.f85623f.mo104398F());
        }
        if (view.getId() == C35265a.C35273h.tv_btn_vl_accept) {
            C35036e.m143803e(z, this.f85606J0, this.f85623f.mo104405c());
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_a_f) {
            mo104614S0(z, this.f85608L0, this.f85623f.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_g_l) {
            mo104614S0(z, this.f85609M0, this.f85623f.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_m_r) {
            mo104614S0(z, this.f85610N0, this.f85623f.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_s_z) {
            mo104614S0(z, this.f85611O0, this.f85623f.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.ot_vl_tv_filter) {
            mo104615T0(z, this.f85612P0);
        }
        if (view.getId() == C35265a.C35273h.ot_vl_back) {
            mo104616U0(z, this.f85623f.mo104421u(), this.f85628y);
        }
    }

    public void onItemClick(@C0359n0 String str, boolean z) {
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view.getId() == C35265a.C35273h.ot_vl_back && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85620c.mo104472b(23);
        }
        int id = view.getId();
        int i2 = C35265a.C35273h.tv_btn_vl_confirm;
        if (id == i2 && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85620c.mo104472b(33);
        }
        if (view.getId() == i2 && C35036e.m143801a(i, keyEvent) == 25) {
            this.f85601E0.notifyDataSetChanged();
            return true;
        }
        if (view.getId() == C35265a.C35273h.tv_btn_vl_accept && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85620c.mo104472b(31);
        }
        if (view.getId() == C35265a.C35273h.tv_btn_vl_reject && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85620c.mo104472b(32);
        }
        if (view.getId() == C35265a.C35273h.ot_vl_tv_filter && C35036e.m143801a(i, keyEvent) == 21) {
            mo104625d1();
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_a_f && C35036e.m143801a(i, keyEvent) == 21) {
            mo104613Q0("A_F", this.f85608L0);
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_g_l && C35036e.m143801a(i, keyEvent) == 21) {
            mo104613Q0("G_L", this.f85609M0);
        }
        if (view.getId() == C35265a.C35273h.ot_tv_alphabet_m_r && C35036e.m143801a(i, keyEvent) == 21) {
            mo104613Q0("M_R", this.f85610N0);
        }
        if (view.getId() != C35265a.C35273h.ot_tv_alphabet_s_z || C35036e.m143801a(i, keyEvent) != 21) {
            return false;
        }
        mo104613Q0("S_Z", this.f85611O0);
        return false;
    }

    /* renamed from: b */
    public void mo104354b() {
        Button button;
        Button button2;
        if (this.f85614R0.equals("A_F")) {
            button2 = this.f85608L0;
        } else if (this.f85614R0.equals("G_L")) {
            button2 = this.f85609M0;
        } else {
            if (this.f85614R0.equals("M_R")) {
                button = this.f85610N0;
            } else if (this.f85614R0.equals("S_Z")) {
                button = this.f85611O0;
            } else {
                return;
            }
            button.requestFocus();
            return;
        }
        button2.requestFocus();
    }
}
