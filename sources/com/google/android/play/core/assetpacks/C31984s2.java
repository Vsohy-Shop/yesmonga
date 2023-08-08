package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.play.core.assetpacks.model.C31958b;
import com.google.android.play.core.common.C32016c;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32061j1;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.splitinstall.C32199t0;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.s2 */
public final class C31984s2 implements C31905c {

    /* renamed from: l */
    public static final C32062k f78092l = new C32062k("AssetPackManager");

    /* renamed from: a */
    public final C31906c0 f78093a;

    /* renamed from: b */
    public final C32040c1<C31914d3> f78094b;

    /* renamed from: c */
    public final C32009z f78095c;

    /* renamed from: d */
    public final C32199t0 f78096d;

    /* renamed from: e */
    public final C31942j1 f78097e;

    /* renamed from: f */
    public final C31998w0 f78098f;

    /* renamed from: g */
    public final C31962n0 f78099g;

    /* renamed from: h */
    public final C32040c1<Executor> f78100h;

    /* renamed from: i */
    public final C32016c f78101i;

    /* renamed from: j */
    public final Handler f78102j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public boolean f78103k;

    public C31984s2(C31906c0 c0Var, C32040c1<C31914d3> c1Var, C32009z zVar, C32199t0 t0Var, C31942j1 j1Var, C31998w0 w0Var, C31962n0 n0Var, C32040c1<Executor> c1Var2, C32016c cVar) {
        this.f78093a = c0Var;
        this.f78094b = c1Var;
        this.f78095c = zVar;
        this.f78096d = t0Var;
        this.f78097e = j1Var;
        this.f78098f = w0Var;
        this.f78099g = n0Var;
        this.f78100h = c1Var2;
        this.f78101i = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo92486a(C31915e eVar) {
        boolean h = this.f78095c.mo92854h();
        this.f78095c.mo92850d(eVar);
        if (!h) {
            mo92682s();
        }
    }

    @Nullable
    /* renamed from: b */
    public final C31894a mo92487b(String str, String str2) {
        C31899b bVar;
        if (!this.f78103k) {
            this.f78100h.mo92734a().execute(new C31972p2(this));
            this.f78103k = true;
        }
        if (this.f78093a.mo92523q(str)) {
            try {
                bVar = this.f78093a.mo92526t(str);
            } catch (IOException unused) {
            }
        } else {
            if (this.f78096d.mo92983a().contains(str)) {
                bVar = C31899b.m129399a();
            }
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.mo92483d() == 1) {
            return this.f78093a.mo92511O(str, str2);
        }
        if (bVar.mo92483d() == 0) {
            return this.f78093a.mo92512P(str, str2, bVar);
        }
        f78092l.mo92775a("The asset %s is not present in Asset Pack %s", str2, str);
        return null;
    }

    /* renamed from: c */
    public final C32227d<Integer> mo92488c(Activity activity) {
        if (activity == null) {
            return C32229f.m130361d(new AssetPackException(-3));
        }
        if (this.f78099g.mo92632b() == null) {
            return C32229f.m130361d(new AssetPackException(-12));
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.f78099g.mo92632b());
        C32239p pVar = new C32239p();
        intent.putExtra("result_receiver", new C31930h(this, this.f78102j, pVar));
        activity.startActivity(intent);
        return pVar.mo93032c();
    }

    /* renamed from: d */
    public final C32227d<C31920f> mo92489d(List<String> list) {
        Map<String, Long> s = this.f78093a.mo92525s();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        if (!this.f78101i.mo92715a()) {
            arrayList.removeAll(s.keySet());
            arrayList2.addAll(list);
            arrayList2.removeAll(arrayList);
        }
        if (!arrayList.isEmpty()) {
            return this.f78094b.mo92734a().mo92540a(arrayList2, arrayList, s);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("error_code", 0);
        for (String next : list) {
            bundle.putInt(C32061j1.m129824e("status", next), 4);
            bundle.putInt(C32061j1.m129824e("error_code", next), 0);
            bundle.putLong(C32061j1.m129824e("total_bytes_to_download", next), 0);
            bundle.putLong(C32061j1.m129824e("bytes_downloaded", next), 0);
        }
        bundle.putStringArrayList("pack_names", new ArrayList(list));
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        return C32229f.m130358a(C31920f.m129486b(bundle, this.f78098f));
    }

    /* renamed from: e */
    public final void mo92490e() {
        this.f78095c.mo92852f();
    }

    @Nullable
    /* renamed from: f */
    public final C31899b mo92491f(String str) {
        if (!this.f78103k) {
            mo92683t();
        }
        if (this.f78093a.mo92523q(str)) {
            try {
                return this.f78093a.mo92526t(str);
            } catch (IOException unused) {
                return null;
            }
        } else if (this.f78096d.mo92983a().contains(str)) {
            return C31899b.m129399a();
        } else {
            return null;
        }
    }

    /* renamed from: g */
    public final void mo92492g(C31915e eVar) {
        this.f78095c.mo92851e(eVar);
    }

    /* renamed from: h */
    public final C32227d<Void> mo92493h(String str) {
        C32239p pVar = new C32239p();
        this.f78100h.mo92734a().execute(new C31943j2(this, str, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: i */
    public final C31920f mo92494i(List<String> list) {
        List<String> list2 = list;
        Map<String, Integer> h = this.f78097e.mo92606h(list2);
        HashMap hashMap = new HashMap();
        for (String next : list) {
            Integer num = h.get(next);
            hashMap.put(next, AssetPackState.m129378d(next, num == null ? 0 : num.intValue(), 0, 0, 0, 0.0d, 0, ""));
        }
        this.f78094b.mo92734a().mo92539T0(list2);
        return C31920f.m129485a(0, hashMap);
    }

    /* renamed from: j */
    public final C32227d<C31920f> mo92495j(List<String> list) {
        return this.f78094b.mo92734a().mo92547h(list, new C31937i1(this), this.f78093a.mo92525s());
    }

    /* renamed from: k */
    public final Map<String, C31899b> mo92496k() {
        Map<String, C31899b> r = this.f78093a.mo92524r();
        HashMap hashMap = new HashMap();
        for (String put : this.f78096d.mo92983a()) {
            hashMap.put(put, C31899b.m129399a());
        }
        r.putAll(hashMap);
        return r;
    }

    /* renamed from: l */
    public final void mo92677l(boolean z) {
        boolean h = this.f78095c.mo92854h();
        this.f78095c.mo92849c(z);
        if (z && !h) {
            mo92682s();
        }
    }

    @C31958b
    /* renamed from: m */
    public final int mo92678m(@C31958b int i, String str) {
        if (!this.f78093a.mo92523q(str) && i == 4) {
            return 8;
        }
        if (!this.f78093a.mo92523q(str) || i == 4) {
            return i;
        }
        return 4;
    }

    /* renamed from: n */
    public final /* synthetic */ void mo92679n() {
        this.f78093a.mo92508L();
        this.f78093a.mo92505I();
        this.f78093a.mo92509M();
    }

    /* renamed from: o */
    public final /* synthetic */ void mo92680o() {
        C32227d<List<String>> f = this.f78094b.mo92734a().mo92545f(this.f78093a.mo92525s());
        C31906c0 c0Var = this.f78093a;
        c0Var.getClass();
        f.mo93018f(this.f78100h.mo92734a(), C31976q2.m129617b(c0Var));
        f.mo93016d(this.f78100h.mo92734a(), C31980r2.f78072a);
    }

    /* renamed from: q */
    public final /* synthetic */ void mo92681q(String str, C32239p pVar) {
        if (this.f78093a.mo92503G(str)) {
            pVar.mo93030a(null);
            this.f78094b.mo92734a().mo92543d(str);
            return;
        }
        pVar.mo93031b(new IOException(String.format("Failed to remove pack %s.", new Object[]{str})));
    }

    /* renamed from: s */
    public final void mo92682s() {
        this.f78100h.mo92734a().execute(new C31972p2(this, (byte[]) null));
    }

    /* renamed from: t */
    public final void mo92683t() {
        this.f78100h.mo92734a().execute(new C31972p2(this));
        this.f78103k = true;
    }
}
