package com.google.firebase.perf.application;

import androidx.annotation.C0359n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.C33378g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33431a;
import com.google.firebase.perf.util.C33436e;
import com.google.firebase.perf.util.C33440h;
import com.google.firebase.perf.util.Constants;
import java.util.WeakHashMap;

/* renamed from: com.google.firebase.perf.application.c */
public class C33283c extends FragmentManager.C19180m {

    /* renamed from: f */
    public static final C33363a f80932f = C33363a.m134449e();

    /* renamed from: a */
    public final WeakHashMap<Fragment, Trace> f80933a = new WeakHashMap<>();

    /* renamed from: b */
    public final C33431a f80934b;

    /* renamed from: c */
    public final C33424k f80935c;

    /* renamed from: d */
    public final C33279a f80936d;

    /* renamed from: e */
    public final C33284d f80937e;

    public C33283c(C33431a aVar, C33424k kVar, C33279a aVar2, C33284d dVar) {
        this.f80934b = aVar;
        this.f80935c = kVar;
        this.f80936d = aVar2;
        this.f80937e = dVar;
    }

    /* renamed from: j */
    public void mo56952j(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        super.mo56952j(fragmentManager, fragment);
        C33363a aVar = f80932f;
        aVar.mo96430b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f80933a.containsKey(fragment)) {
            aVar.mo96440m("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f80933a.get(fragment);
        this.f80933a.remove(fragment);
        C33436e<C33378g.C33379a> f = this.f80937e.mo96305f(fragment);
        if (!f.mo96912d()) {
            aVar.mo96440m("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        C33440h.m134832a(trace, f.mo96911c());
        trace.stop();
    }

    /* renamed from: m */
    public void mo35286m(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment) {
        String str;
        super.mo35286m(fragmentManager, fragment);
        f80932f.mo96430b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(mo96299s(fragment), this.f80935c, this.f80934b, this.f80936d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            str = Constants.f81298s;
        } else {
            str = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute(Constants.f81296q, str);
        if (fragment.getActivity() != null) {
            trace.putAttribute(Constants.f81297r, fragment.getActivity().getClass().getSimpleName());
        }
        this.f80933a.put(fragment, trace);
        this.f80937e.mo96303d(fragment);
    }

    /* renamed from: s */
    public String mo96299s(Fragment fragment) {
        return Constants.f81295p + fragment.getClass().getSimpleName();
    }

    @C40974d0
    /* renamed from: t */
    public WeakHashMap<Fragment, Trace> mo96300t() {
        return this.f80933a;
    }
}
