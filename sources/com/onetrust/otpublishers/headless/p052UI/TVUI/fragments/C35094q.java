package com.onetrust.otpublishers.headless.p052UI.TVUI.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35050j;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35070d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.q */
public class C35094q extends Fragment implements C35050j.C35051a, View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: a */
    public TextView f85589a;

    /* renamed from: b */
    public Context f85590b;

    /* renamed from: c */
    public C35095a f85591c;

    /* renamed from: d */
    public RecyclerView f85592d;

    /* renamed from: e */
    public C35069c f85593e;

    /* renamed from: f */
    public C35070d f85594f;

    /* renamed from: g */
    public Map<String, String> f85595g = new HashMap();

    /* renamed from: v */
    public Button f85596v;

    /* renamed from: w */
    public Button f85597w;

    /* renamed from: x */
    public C35050j f85598x;

    /* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.q$a */
    public interface C35095a {
        /* renamed from: b */
        void mo104607b(int i);

        /* renamed from: c */
        void mo104608c(@C0359n0 Map<String, String> map);
    }

    @C0359n0
    /* renamed from: I0 */
    public static C35094q m144172I0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0359n0 C35095a aVar2, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0363p0 Map<String, String> map, boolean z) {
        C35094q qVar = new C35094q();
        Bundle bundle = new Bundle();
        bundle.putString("TV_PC_CONTENT", str);
        qVar.setArguments(bundle);
        qVar.mo104600K0(aVar2);
        qVar.mo104601L0(map);
        return qVar;
    }

    /* renamed from: J0 */
    public final void mo104599J0(@C0359n0 View view) {
        this.f85589a = (TextView) view.findViewById(C35265a.C35273h.ot_tv_filter_title);
        this.f85592d = (RecyclerView) view.findViewById(C35265a.C35273h.ot_tv_filter_list);
        this.f85597w = (Button) view.findViewById(C35265a.C35273h.ot_tv_filter_clear);
        this.f85596v = (Button) view.findViewById(C35265a.C35273h.ot_tv_filter_apply);
        this.f85589a.requestFocus();
    }

    /* renamed from: K0 */
    public void mo104600K0(@C0359n0 C35095a aVar) {
        this.f85591c = aVar;
    }

    /* renamed from: L0 */
    public void mo104601L0(@C0363p0 Map<String, String> map) {
        this.f85595g = map;
    }

    /* renamed from: M0 */
    public final void mo104602M0() {
        try {
            this.f85597w.setText(this.f85594f.mo104431f());
            this.f85596v.setText(this.f85594f.mo104426a());
            JSONObject e = this.f85593e.mo104407e(this.f85590b);
            if (this.f85595g == null) {
                this.f85595g = new HashMap();
            }
            this.f85598x = new C35050j(new UIUtils().mo104275m(e.optJSONArray("Groups")), this.f85593e.mo104393A(), this.f85595g, this);
            this.f85592d.setLayoutManager(new LinearLayoutManager(this.f85590b));
            this.f85592d.setAdapter(this.f85598x);
        } catch (Exception e2) {
            OTLogger.m143457l("TVVendorListFilter", "error while populating VL fields" + e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo104603a() {
        String A = this.f85593e.mo104393A();
        C35036e.m143803e(false, this.f85596v, this.f85593e.mo104421u());
        C35036e.m143803e(false, this.f85597w, this.f85593e.mo104421u());
        this.f85589a.setTextColor(Color.parseColor(A));
    }

    /* renamed from: b */
    public final void mo104604b() {
        this.f85596v.setOnKeyListener(this);
        this.f85597w.setOnKeyListener(this);
        this.f85596v.setOnFocusChangeListener(this);
        this.f85597w.setOnFocusChangeListener(this);
    }

    /* renamed from: c */
    public void mo104330c(@C0359n0 Map<String, String> map) {
        mo104601L0(map);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85590b = getActivity();
        this.f85593e = C35069c.m143925y();
        this.f85594f = C35070d.m143959g();
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = new UIUtils().mo104271e(this.f85590b, layoutInflater, viewGroup, C35265a.C35276k.ot_tv_purpose_filter);
        mo104599J0(e);
        mo104604b();
        mo104603a();
        mo104602M0();
        return e;
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C35265a.C35273h.ot_tv_filter_clear) {
            C35036e.m143803e(z, this.f85597w, this.f85593e.mo104421u());
        }
        if (view.getId() == C35265a.C35273h.ot_tv_filter_apply) {
            C35036e.m143803e(z, this.f85596v, this.f85593e.mo104421u());
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view.getId() == C35265a.C35273h.ot_tv_filter_clear && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85598x.mo104329t(new HashMap());
            this.f85598x.notifyDataSetChanged();
            mo104601L0(new HashMap());
        }
        if (view.getId() == C35265a.C35273h.ot_tv_filter_apply && C35036e.m143801a(i, keyEvent) == 21) {
            this.f85591c.mo104608c(this.f85595g);
        }
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f85591c.mo104607b(23);
        return false;
    }
}
