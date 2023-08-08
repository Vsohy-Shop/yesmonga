package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.C0387a;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C19232h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34967b0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34982n;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35100a0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35122v;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35173t;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35221k0;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35261f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.OTSDKListFragment */
public class OTSDKListFragment extends C31185b implements View.OnClickListener, C35221k0.C35222a, C35173t.C35176c {

    /* renamed from: E0 */
    public SearchView f86132E0;

    /* renamed from: F0 */
    public List<String> f86133F0 = new ArrayList();

    /* renamed from: G0 */
    public C35122v f86134G0;

    /* renamed from: H0 */
    public EditText f86135H0;

    /* renamed from: I0 */
    public View f86136I0;

    /* renamed from: J0 */
    public OTConfiguration f86137J0;

    /* renamed from: K0 */
    public UIUtils f86138K0;

    /* renamed from: L0 */
    public boolean f86139L0;

    /* renamed from: M0 */
    public C35261f f86140M0;

    /* renamed from: N0 */
    public String f86141N0;

    /* renamed from: O0 */
    public String f86142O0;

    /* renamed from: P0 */
    public String f86143P0;

    /* renamed from: Q0 */
    public C35173t.C35175b f86144Q0;

    /* renamed from: R0 */
    public SwitchCompat f86145R0;

    /* renamed from: S0 */
    public TextView f86146S0;

    /* renamed from: T0 */
    public boolean f86147T0;

    /* renamed from: U0 */
    public String f86148U0;

    /* renamed from: X */
    public RelativeLayout f86149X;

    /* renamed from: Y */
    public CoordinatorLayout f86150Y;

    /* renamed from: Z */
    public OTPublishersHeadlessSDK f86151Z;

    /* renamed from: a */
    public TextView f86152a;

    /* renamed from: b */
    public TextView f86153b;

    /* renamed from: c */
    public RecyclerView f86154c;

    /* renamed from: d */
    public C31178a f86155d;

    /* renamed from: e */
    public ImageView f86156e;

    /* renamed from: f */
    public ImageView f86157f;

    /* renamed from: g */
    public ImageView f86158g;

    /* renamed from: v */
    public ImageView f86159v;

    /* renamed from: w */
    public C35173t f86160w;

    /* renamed from: x */
    public boolean f86161x;

    /* renamed from: y */
    public Context f86162y;

    /* renamed from: z */
    public C35221k0 f86163z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.OTSDKListFragment$CustomLinearLayoutManager */
    public static class CustomLinearLayoutManager extends LinearLayoutManager {
        public CustomLinearLayoutManager(Context context) {
            super(context);
        }

        /* renamed from: q1 */
        public void mo59341q1(RecyclerView.C20089w wVar, RecyclerView.C20055b0 b0Var) {
            try {
                super.mo59341q1(wVar, b0Var);
            } catch (IndexOutOfBoundsException e) {
                OTLogger.m143457l("OTSDKListFragment", "error in layoutManger" + e.getMessage());
            }
        }

        public CustomLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.OTSDKListFragment$a */
    public class C35187a implements SearchView.C0666m {
        public C35187a() {
        }

        /* renamed from: a */
        public boolean mo3026a(String str) {
            if (OTSDKListFragment.this.f86160w == null) {
                return false;
            }
            if (C35020d.m143605J(str)) {
                OTSDKListFragment.this.mo105254i1();
                return false;
            }
            OTSDKListFragment.this.f86160w.mo105215v(true);
            OTSDKListFragment.this.f86160w.getFilter().filter(str);
            return false;
        }

        /* renamed from: b */
        public boolean mo3027b(String str) {
            if (OTSDKListFragment.this.f86160w == null) {
                return false;
            }
            OTSDKListFragment.this.f86160w.mo105215v(true);
            OTSDKListFragment.this.f86160w.getFilter().filter(str);
            return false;
        }
    }

    @C0359n0
    /* renamed from: T0 */
    public static OTSDKListFragment m144974T0(@C0359n0 String str, @C0359n0 OTConfiguration oTConfiguration) {
        OTSDKListFragment oTSDKListFragment = new OTSDKListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        oTSDKListFragment.setArguments(bundle);
        oTSDKListFragment.mo105242X0(oTConfiguration);
        return oTSDKListFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m144975U0(DialogInterface dialogInterface) {
        C31178a aVar;
        C31178a aVar2 = (C31178a) dialogInterface;
        this.f86155d = aVar2;
        this.f86138K0.mo104281t(this.f86162y, aVar2);
        this.f86155d.setCancelable(false);
        this.f86155d.setCanceledOnTouchOutside(false);
        if (getArguments().containsKey("SDK_LIST_VIEW_TITLE") && (aVar = this.f86155d) != null) {
            aVar.setTitle((CharSequence) getArguments().getString("SDK_LIST_VIEW_TITLE"));
        }
        this.f86155d.setOnKeyListener(new C35194c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m144976W0(CompoundButton compoundButton, boolean z) {
        Context context;
        String str;
        String str2;
        SwitchCompat switchCompat;
        this.f86147T0 = z;
        UIUtils uIUtils = this.f86138K0;
        if (z) {
            context = this.f86162y;
            switchCompat = this.f86145R0;
            str2 = this.f86140M0.mo105602n();
            str = this.f86140M0.mo105601m();
        } else {
            context = this.f86162y;
            switchCompat = this.f86145R0;
            str2 = this.f86140M0.mo105602n();
            str = this.f86140M0.mo105600l();
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ boolean m144977c1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        mo105256k1();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ boolean m144979n1() {
        mo105254i1();
        return false;
    }

    /* renamed from: R0 */
    public final int mo105240R0(@C0359n0 String str, @C0359n0 JSONArray jSONArray, int i, boolean z) {
        if (i != jSONArray.length()) {
            return i;
        }
        this.f86151Z.updatePurposeConsent(str, z, true);
        return 0;
    }

    @C0376v0(api = 21)
    /* renamed from: V0 */
    public final void mo105241V0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.rv_sdk_list);
        this.f86154c = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f86154c.setLayoutManager(new CustomLinearLayoutManager(this.f86162y));
        this.f86157f = (ImageView) view.findViewById(C35265a.C35273h.filter_sdk);
        this.f86156e = (ImageView) view.findViewById(C35265a.C35273h.back_from_sdklist);
        this.f86152a = (TextView) view.findViewById(C35265a.C35273h.sdk_list_page_title);
        this.f86153b = (TextView) view.findViewById(C35265a.C35273h.sdk_title);
        this.f86149X = (RelativeLayout) view.findViewById(C35265a.C35273h.sdk_parent_layout);
        SearchView searchView = (SearchView) view.findViewById(C35265a.C35273h.search_sdk);
        this.f86132E0 = searchView;
        this.f86135H0 = (EditText) searchView.findViewById(C0387a.C0394g.search_src_text);
        this.f86158g = (ImageView) this.f86132E0.findViewById(C0387a.C0394g.search_mag_icon);
        this.f86159v = (ImageView) this.f86132E0.findViewById(C0387a.C0394g.search_close_btn);
        this.f86136I0 = this.f86132E0.findViewById(C0387a.C0394g.search_edit_frame);
        this.f86150Y = (CoordinatorLayout) view.findViewById(C35265a.C35273h.parent_sdk_list);
        this.f86145R0 = (SwitchCompat) view.findViewById(C35265a.C35273h.sdk_allow_all_toggle);
        this.f86146S0 = (TextView) view.findViewById(C35265a.C35273h.sdk_allow_all_title);
    }

    /* renamed from: X0 */
    public void mo105242X0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86137J0 = oTConfiguration;
    }

    /* renamed from: Y0 */
    public void mo105243Y0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86151Z = oTPublishersHeadlessSDK;
    }

    /* renamed from: Z0 */
    public void mo105244Z0(C35173t.C35175b bVar) {
        this.f86144Q0 = bVar;
    }

    /* renamed from: a */
    public final void mo105245a() {
        mo105261p1();
        mo105251f1(mo105257l1());
    }

    /* renamed from: a1 */
    public final void mo105246a1(@C0359n0 String str, @C0359n0 JSONArray jSONArray) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                String obj = jSONArray.get(i3).toString();
                if (this.f86151Z.getConsentStatusForSDKId(obj) == 0) {
                    i = mo105240R0(str, jSONArray, i + 1, false);
                } else if (1 == this.f86151Z.getConsentStatusForSDKId(obj)) {
                    i2 = mo105240R0(str, jSONArray, i2 + 1, true);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OTSDKListFragment", "Error while updating category status based on respective sdk status " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final void mo105247b() {
        this.f86136I0.setBackgroundResource(C35265a.C35272g.ot_search_border);
        GradientDrawable gradientDrawable = new GradientDrawable();
        C35100a0 i = this.f86140M0.mo105597i();
        String g = C35020d.m143605J(i.mo104644g()) ? "0" : i.mo104644g();
        String d = C35020d.m143605J(i.mo104640c()) ? this.f86140M0.mo105592d() : i.mo104640c();
        String a = C35020d.m143605J(i.mo104638a()) ? "#2D6B6767" : i.mo104638a();
        String e = C35020d.m143605J(i.mo104642e()) ? "20" : i.mo104642e();
        gradientDrawable.setStroke(Integer.parseInt(g), Color.parseColor(d));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(a));
        gradientDrawable.setCornerRadius(Float.parseFloat(e));
        this.f86136I0.setBackground(gradientDrawable);
    }

    /* renamed from: b1 */
    public void mo105248b1(@C0359n0 JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray l = new C34967b0(this.f86162y).mo103644l(next);
            if (l != null) {
                mo105246a1(next, l);
            }
        }
    }

    @C0376v0(api = 21)
    /* renamed from: d */
    public final void mo105249d(String str) {
        ImageView imageView;
        StringBuilder sb;
        String str2 = "Selected";
        if (!C35020d.m143605J(str)) {
            if (C35019c.m143598c(str, true)) {
                mo105262q1();
                str2 = "Unselected";
            } else {
                mo105263r1();
            }
            imageView = this.f86157f;
            sb = new StringBuilder();
        } else {
            if (this.f86161x) {
                mo105263r1();
            } else {
                mo105262q1();
                str2 = "Unselected";
            }
            imageView = this.f86157f;
            sb = new StringBuilder();
        }
        sb.append(str2);
        sb.append("Filter");
        imageView.setContentDescription(sb.toString());
    }

    /* renamed from: d1 */
    public final boolean mo105250d1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!new C35015e(this.f86162y).mo104008t(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f1 */
    public final void mo105251f1(String str) {
        SwitchCompat switchCompat;
        int i;
        if (!C13758b.f33436b.equals(this.f86141N0) || (str != null && new C35015e(this.f86162y).mo104008t(str))) {
            switchCompat = this.f86145R0;
            i = 8;
        } else {
            switchCompat = this.f86145R0;
            i = 0;
        }
        switchCompat.setVisibility(i);
        this.f86146S0.setVisibility(i);
    }

    @C0376v0(api = 21)
    /* renamed from: g1 */
    public final void mo105252g1(@C0359n0 List<String> list, boolean z) {
        mo105264s1();
        this.f86139L0 = z;
        mo105249d(String.valueOf(z));
        this.f86160w.mo105214u(list);
    }

    /* renamed from: h1 */
    public final void mo105253h1(boolean z) {
        this.f86160w.mo105207C(z);
    }

    /* renamed from: i1 */
    public final void mo105254i1() {
        C35173t tVar = this.f86160w;
        if (tVar != null) {
            tVar.mo105215v(false);
            this.f86160w.getFilter().filter("");
        }
    }

    /* renamed from: j */
    public void mo105223j(boolean z) {
        this.f86145R0.setChecked(z);
    }

    /* renamed from: j1 */
    public final void mo105255j1(@C0359n0 String str) {
        this.f86152a.setBackgroundColor(Color.parseColor(str));
        this.f86150Y.setBackgroundColor(Color.parseColor(str));
        this.f86149X.setBackgroundColor(Color.parseColor(str));
    }

    /* renamed from: k1 */
    public final void mo105256k1() {
        dismiss();
        this.f86133F0.clear();
        mo105248b1(this.f86160w.mo105217y());
        this.f86144Q0.mo105222a();
    }

    @C0363p0
    /* renamed from: l1 */
    public final String mo105257l1() {
        try {
            return !C35020d.m143605J(new C34982n(this.f86162y).mo103810b(this.f86148U0)) ? new C34982n(this.f86162y).mo103810b(this.f86148U0) : this.f86148U0;
        } catch (Exception e) {
            OTLogger.m143457l("OTSDKListFragment", "Error on getting parent child JSON. Error message = " + e.getMessage());
            return "";
        }
    }

    /* renamed from: m1 */
    public final void mo105258m1() {
        this.f86156e.setOnClickListener(this);
        this.f86157f.setOnClickListener(this);
        this.f86145R0.setOnClickListener(this);
        this.f86145R0.setChecked(true);
        this.f86132E0.setQueryHint("Search..");
        this.f86132E0.setIconifiedByDefault(false);
        this.f86132E0.mo1757a();
        this.f86132E0.clearFocus();
        this.f86132E0.setOnQueryTextListener(new C35187a());
        this.f86132E0.setOnCloseListener(new C35188a(this));
        this.f86145R0.setContentDescription(this.f86140M0.mo105593e());
        this.f86145R0.setOnCheckedChangeListener(new C35191b(this));
    }

    @C0376v0(api = 21)
    /* renamed from: o1 */
    public final void mo105259o1() {
        if (this.f86134G0 != null) {
            mo105255j1(this.f86140M0.mo105592d());
            this.f86156e.getDrawable().setTint(Color.parseColor(this.f86140M0.mo105591c()));
            boolean o = this.f86140M0.mo105603o();
            this.f86153b.setBackgroundColor(Color.parseColor(this.f86140M0.mo105592d()));
            String k = this.f86140M0.mo105599k().mo104667k();
            this.f86152a.setTextColor(Color.parseColor(k));
            mo105249d("");
            this.f86146S0.setText(this.f86140M0.mo105589a().mo104663g());
            this.f86146S0.setTextColor(Color.parseColor(this.f86140M0.mo105589a().mo104667k()));
            mo105261p1();
            if (!C35020d.m143605J(this.f86140M0.mo105597i().mo104652o())) {
                this.f86135H0.setTextColor(Color.parseColor(this.f86140M0.mo105597i().mo104652o()));
            }
            if (!C35020d.m143605J(this.f86140M0.mo105597i().mo104650m())) {
                this.f86135H0.setHintTextColor(Color.parseColor(this.f86140M0.mo105597i().mo104650m()));
            }
            if (!C35020d.m143605J(this.f86140M0.mo105597i().mo104648k())) {
                this.f86158g.setColorFilter(Color.parseColor(this.f86140M0.mo105597i().mo104648k()), PorterDuff.Mode.SRC_IN);
            }
            if (!C35020d.m143605J(this.f86140M0.mo105597i().mo104646i())) {
                this.f86159v.setColorFilter(Color.parseColor(this.f86140M0.mo105597i().mo104646i()), PorterDuff.Mode.SRC_IN);
            }
            this.f86136I0.setBackgroundResource(C35265a.C35272g.ot_search_border);
            mo105247b();
            C35173t tVar = new C35173t(this, this.f86162y, k, this.f86151Z, this.f86133F0, o, this.f86134G0, this.f86140M0, this.f86137J0, this.f86141N0, this.f86142O0, this.f86143P0);
            this.f86160w = tVar;
            this.f86154c.setAdapter(tVar);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.back_from_sdklist) {
            mo105256k1();
        } else if (id == C35265a.C35273h.filter_sdk) {
            mo105264s1();
            if (!this.f86163z.isAdded()) {
                this.f86163z.mo105416W0(this);
                C35221k0 k0Var = this.f86163z;
                C19232h activity = getActivity();
                Objects.requireNonNull(activity);
                k0Var.show(activity.mo57175g0(), OTFragmentTags.OT_SDK_LIST_FILTER_FRAGMENT_TAG);
            }
        } else if (id == C35265a.C35273h.sdk_allow_all_toggle) {
            mo105253h1(this.f86147T0);
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86138K0.mo104281t(this.f86162y, this.f86155d);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f86161x = true;
        Context applicationContext = getContext().getApplicationContext();
        if (this.f86151Z == null) {
            this.f86151Z = new OTPublishersHeadlessSDK(applicationContext);
        }
        if (getArguments() != null) {
            String string = getArguments().getString("OT_GROUP_ID_LIST");
            this.f86142O0 = getArguments().getString("ALWAYS_ACTIVE_TEXT", "Always Active");
            this.f86143P0 = getArguments().getString("ALWAYS_ACTIVE_TEXT_COLOR");
            this.f86141N0 = getArguments().getString("sdkLevelOptOutShow");
            if (!C35020d.m143605J(string)) {
                for (String str : string.replace("[", "").replace("]", "").trim().split(",")) {
                    this.f86133F0.add(str.trim());
                    this.f86148U0 = str.trim();
                }
            }
        }
        mo105264s1();
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35197d(this));
        return onCreateDialog;
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f86162y = getContext();
        this.f86138K0 = new UIUtils();
        boolean z = false;
        this.f86147T0 = false;
        if (bundle != null) {
            try {
                if (bundle.containsKey("NAV_FROM_PCDETAILS")) {
                    if (bundle.getInt("NAV_FROM_PCDETAILS") == 1) {
                        z = true;
                    }
                    this.f86161x = z;
                    bundle.remove("NAV_FROM_PCDETAILS");
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OTSDKListFragment", "Error in ui property object, error message = " + e.getMessage());
            }
        }
        int b = UIUtils.m143749b(this.f86162y, this.f86137J0);
        this.f86134G0 = new C35124x(this.f86162y).mo105015f(b);
        C35261f fVar = new C35261f();
        this.f86140M0 = fVar;
        fVar.mo105590b(this.f86151Z, this.f86162y, b);
        View e2 = this.f86138K0.mo104271e(this.f86162y, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_sdk_list);
        mo105241V0(e2);
        mo105258m1();
        mo105259o1();
        mo105245a();
        return e2;
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        bundle.putInt("NAV_FROM_PCDETAILS", this.f86139L0 ^ true ? 1 : 0);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p1 */
    public final void mo105261p1() {
        String str;
        String str2;
        SwitchCompat switchCompat;
        Context context;
        UIUtils uIUtils;
        if (this.f86145R0.isChecked()) {
            uIUtils = this.f86138K0;
            context = this.f86162y;
            switchCompat = this.f86145R0;
            str2 = this.f86140M0.mo105602n();
            str = this.f86140M0.mo105601m();
        } else {
            uIUtils = this.f86138K0;
            context = this.f86162y;
            switchCompat = this.f86145R0;
            str2 = this.f86140M0.mo105602n();
            str = this.f86140M0.mo105600l();
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    @C0376v0(api = 21)
    /* renamed from: q1 */
    public final void mo105262q1() {
        C35261f fVar = this.f86140M0;
        if (fVar != null) {
            this.f86157f.getDrawable().setTint(Color.parseColor(fVar.mo105595g()));
        }
    }

    @C0376v0(api = 21)
    /* renamed from: r1 */
    public final void mo105263r1() {
        if (this.f86134G0 != null) {
            this.f86157f.getDrawable().setTint(Color.parseColor(this.f86140M0.mo105596h()));
        }
    }

    /* renamed from: s1 */
    public final void mo105264s1() {
        C35221k0 P0 = C35221k0.m145218P0(OTFragmentTags.OT_SDK_LIST_FILTER_FRAGMENT_TAG, this.f86133F0, this.f86137J0);
        this.f86163z = P0;
        P0.mo105415V0(this.f86151Z);
    }

    @C0376v0(api = 21)
    /* renamed from: v0 */
    public void mo105265v0(@C0359n0 List<String> list, boolean z) {
        int i;
        SwitchCompat switchCompat;
        this.f86133F0 = list;
        mo105252g1(list, z);
        boolean d1 = mo105250d1(this.f86133F0);
        if (!C13758b.f33436b.equals(this.f86141N0) || !d1) {
            switchCompat = this.f86145R0;
            i = 8;
        } else {
            switchCompat = this.f86145R0;
            i = 0;
        }
        switchCompat.setVisibility(i);
        this.f86146S0.setVisibility(i);
        mo105264s1();
    }
}
