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
import android.widget.RelativeLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35039c;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35076d;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35084k;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.m */
public class C35087m extends Fragment implements C35039c.C35040a, View.OnKeyListener, View.OnFocusChangeListener, C35076d.C35077a, C35084k.C35085a {

    /* renamed from: E0 */
    public C35039c f85542E0;

    /* renamed from: X */
    public C35076d f85543X;

    /* renamed from: Y */
    public C35084k f85544Y;

    /* renamed from: Z */
    public View f85545Z;

    /* renamed from: a */
    public Context f85546a;

    /* renamed from: b */
    public OTPublishersHeadlessSDK f85547b;

    /* renamed from: c */
    public C35088a f85548c;

    /* renamed from: d */
    public C34962a f85549d;

    /* renamed from: e */
    public Button f85550e;

    /* renamed from: f */
    public Button f85551f;

    /* renamed from: g */
    public Button f85552g;

    /* renamed from: v */
    public RecyclerView f85553v;

    /* renamed from: w */
    public C35069c f85554w;

    /* renamed from: x */
    public RelativeLayout f85555x;

    /* renamed from: y */
    public LinearLayout f85556y;

    /* renamed from: z */
    public ImageView f85557z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.m$a */
    public interface C35088a {
        /* renamed from: b */
        void mo104472b(int i);

        /* renamed from: c */
        void mo104525c(Map<String, String> map);
    }

    @C0359n0
    /* renamed from: J0 */
    public static C35087m m144118J0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0359n0 C35088a aVar2, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35087m mVar = new C35087m();
        Bundle bundle = new Bundle();
        bundle.putString("TV_PC_CONTENT", str);
        mVar.setArguments(bundle);
        mVar.mo104566N0(aVar);
        mVar.mo104568P0(aVar2);
        mVar.mo104567O0(oTPublishersHeadlessSDK);
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ void m144119M0(C19499w wVar, Lifecycle.C19372Event event) {
        if (event.compareTo(Lifecycle.C19372Event.ON_RESUME) == 0) {
            this.f85552g.clearFocus();
            this.f85551f.clearFocus();
            this.f85550e.clearFocus();
            this.f85544Y.mo104550g1();
        }
    }

    @C0376v0(api = 21)
    /* renamed from: Q0 */
    public static void m144120Q0(@C0359n0 C35105e eVar, @C0359n0 Button button) {
        button.setText(eVar.mo104295s());
        if (eVar.mo104296u() != null) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        }
        button.getBackground().setTint(Color.parseColor(eVar.mo104699a()));
        button.setVisibility(eVar.mo104297w());
        button.setElevation(0.0f);
    }

    /* renamed from: E */
    public void mo104312E(int i) {
        this.f85543X.mo104500l1();
        Bundle bundle = new Bundle();
        bundle.putInt("OT_FOCUSED_PC_LIST_ITEM", i);
        setArguments(bundle);
    }

    /* renamed from: K0 */
    public final JSONArray mo104564K0(@C0363p0 JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray != null) {
            try {
                jSONObject.put("GroupName", this.f85554w.mo104399G());
                jSONObject.put("GroupDescription", this.f85554w.mo104424x());
                jSONObject.put("isAlertNotice", true);
                jSONArray2.put(jSONObject);
                for (int i = 0; i < jSONArray.length(); i++) {
                    jSONArray2.put(jSONArray.getJSONObject(i));
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "Exception while setting alert notice text, err : " + e.toString());
                return jSONArray;
            }
        }
        return jSONArray2;
    }

    /* renamed from: L0 */
    public final void mo104565L0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.tv_grp_list);
        this.f85553v = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f85553v.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f85550e = (Button) view.findViewById(C35265a.C35273h.tv_btn_confirm);
        this.f85551f = (Button) view.findViewById(C35265a.C35273h.tv_btn_accept_pc);
        this.f85552g = (Button) view.findViewById(C35265a.C35273h.tv_btn_reject_pc);
        this.f85555x = (RelativeLayout) view.findViewById(C35265a.C35273h.tv_pc_lyt);
        this.f85556y = (LinearLayout) view.findViewById(C35265a.C35273h.tv_btn_layout);
        this.f85557z = (ImageView) view.findViewById(C35265a.C35273h.ot_tv_pc_logo);
        this.f85545Z = view.findViewById(C35265a.C35273h.ot_pc_list_div_tv);
    }

    /* renamed from: N0 */
    public void mo104566N0(@C0359n0 C34962a aVar) {
        this.f85549d = aVar;
    }

    /* renamed from: O0 */
    public void mo104567O0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85547b = oTPublishersHeadlessSDK;
    }

    /* renamed from: P0 */
    public void mo104568P0(@C0359n0 C35088a aVar) {
        this.f85548c = aVar;
    }

    /* renamed from: R0 */
    public final void mo104569R0() {
        this.f85550e.setOnKeyListener(this);
        this.f85551f.setOnKeyListener(this);
        this.f85552g.setOnKeyListener(this);
        this.f85550e.setOnFocusChangeListener(this);
        this.f85551f.setOnFocusChangeListener(this);
        this.f85552g.setOnFocusChangeListener(this);
    }

    /* renamed from: S */
    public void mo104313S(JSONObject jSONObject, boolean z) {
        mo104570S0(jSONObject, z);
    }

    /* renamed from: S0 */
    public final void mo104570S0(@C0363p0 JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            this.f85543X = C35076d.m144012K0("GroupDetails", this.f85549d, jSONObject, this, z, this.f85547b);
            getChildFragmentManager().mo56909u().mo57201C(C35265a.C35273h.ot_pc_detail_container, this.f85543X).mo57225o((String) null).mo57052q();
        }
    }

    @C0376v0(api = 21)
    /* renamed from: T0 */
    public final void mo104571T0() {
        String str;
        StringBuilder sb;
        try {
            JSONObject e = this.f85554w.mo104407e(this.f85546a);
            this.f85555x.setBackgroundColor(Color.parseColor(this.f85554w.mo104419s()));
            this.f85556y.setBackgroundColor(Color.parseColor(this.f85554w.mo104419s()));
            this.f85545Z.setBackgroundColor(Color.parseColor(this.f85554w.mo104393A()));
            this.f85553v.setBackgroundColor(Color.parseColor(this.f85554w.mo104402J().mo104786i()));
            m144120Q0(this.f85554w.mo104421u(), this.f85550e);
            m144120Q0(this.f85554w.mo104405c(), this.f85551f);
            m144120Q0(this.f85554w.mo104398F(), this.f85552g);
            mo104572U0();
            if (e != null) {
                JSONArray K0 = mo104564K0(e.getJSONArray("Groups"));
                int i = (getArguments() == null || !getArguments().containsKey("OT_FOCUSED_PC_LIST_ITEM")) ? 0 : getArguments().getInt("OT_FOCUSED_PC_LIST_ITEM");
                C35039c cVar = new C35039c(K0, this);
                this.f85542E0 = cVar;
                cVar.f85294d = i;
                this.f85553v.setAdapter(cVar);
                mo104570S0(K0.getJSONObject(0), false);
            }
        } catch (JSONException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "JSON error while populating PC fields";
            sb.append(str);
            sb.append(e.getMessage());
            OTLogger.m143457l("TVPreferenceCenter", sb.toString());
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "error while populating PC list";
            sb.append(str);
            sb.append(e.getMessage());
            OTLogger.m143457l("TVPreferenceCenter", sb.toString());
        }
    }

    /* renamed from: U0 */
    public final void mo104572U0() {
        if (this.f85554w.mo104396D().mo104776e()) {
            ((C22090i) ((C22090i) ((C22090i) C22038b.m100352G(this).mo65605u(this.f85554w.mo104396D().mo104774c()).mo66750K()).mo66785e1(10000)).mo66746I(C35265a.C35272g.ic_ot)).mo65675K1(this.f85557z);
        }
    }

    /* renamed from: a */
    public void mo104314a() {
        this.f85542E0.notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo104510b(int i) {
        if (i == 24) {
            this.f85542E0.notifyDataSetChanged();
        }
        if (i == 26) {
            this.f85551f.requestFocus();
        }
    }

    /* renamed from: c */
    public void mo104511c(Map<String, String> map) {
        this.f85548c.mo104525c(map);
    }

    @C0376v0(api = 21)
    /* renamed from: e */
    public void mo104512e(JSONObject jSONObject, boolean z) {
        this.f85544Y = C35084k.m144079K0(OTFragmentTags.OT_PREFERENCE_CENTER_DETAILS_FRAGMENT_TAG, this.f85549d, jSONObject, this, z, this.f85547b);
        getChildFragmentManager().mo56909u().mo57201C(C35265a.C35273h.ot_pc_detail_container, this.f85544Y).mo57225o((String) null).mo57052q();
        this.f85544Y.getLifecycle().mo57464a(new C35086l(this));
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85546a = getActivity();
        this.f85554w = C35069c.m143925y();
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85546a, layoutInflater, viewGroup, C35265a.C35276k.ot_pc_tvfragment);
        mo104565L0(e);
        mo104569R0();
        mo104571T0();
        return e;
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.tv_btn_confirm) {
            C35036e.m143803e(z, this.f85550e, this.f85554w.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.tv_btn_reject_pc) {
            C35036e.m143803e(z, this.f85552g, this.f85554w.mo104398F());
        }
        if (view.getId() == C35265a.C35273h.tv_btn_accept_pc) {
            C35036e.m143803e(z, this.f85551f, this.f85554w.mo104405c());
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        int id = view.getId();
        int i2 = C35265a.C35273h.tv_btn_confirm;
        if (id == i2 && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85548c.mo104472b(14);
        }
        if (view.getId() == i2 && C35036e.m143801a(i, keyEvent) == 25) {
            this.f85542E0.notifyDataSetChanged();
            return true;
        }
        int id2 = view.getId();
        int i3 = C35265a.C35273h.tv_btn_accept_pc;
        if (id2 == i3 && C35036e.m143801a(i, keyEvent) == 25) {
            C35084k kVar = this.f85544Y;
            if (kVar != null) {
                kVar.mo104550g1();
            }
            this.f85543X.mo104500l1();
            return true;
        }
        int id3 = view.getId();
        int i4 = C35265a.C35273h.tv_btn_reject_pc;
        if (id3 == i4 && C35036e.m143801a(i, keyEvent) == 25) {
            C35084k kVar2 = this.f85544Y;
            if (kVar2 != null) {
                kVar2.mo104550g1();
            }
            this.f85543X.mo104500l1();
            return true;
        }
        if (view.getId() == i3 && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85548c.mo104472b(21);
        }
        if (view.getId() == i4 && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85548c.mo104472b(22);
        }
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f85548c.mo104472b(23);
        return false;
    }

    /* renamed from: w */
    public void mo104563w(int i, boolean z, boolean z2) {
        getChildFragmentManager().mo56912v1();
        C35076d dVar = this.f85543X;
        if (dVar != null) {
            dVar.mo104502n1();
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f85543X.mo104497j(z);
                    } else {
                        return;
                    }
                }
                this.f85543X.mo104494g1(z2);
                return;
            }
            this.f85543X.mo104497j(z);
        }
    }

    /* renamed from: b */
    public void mo104560b() {
        Button button;
        if (this.f85551f.getVisibility() == 0) {
            button = this.f85551f;
        } else if (this.f85552g.getVisibility() == 0) {
            button = this.f85552g;
        } else {
            return;
        }
        button.requestFocus();
    }
}
