package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32061j1;
import com.google.android.play.core.internal.C32062k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.play.core.assetpacks.j1 */
public final class C31942j1 {

    /* renamed from: g */
    public static final C32062k f77925g = new C32062k("ExtractorSessionStoreView");

    /* renamed from: a */
    public final C31906c0 f77926a;

    /* renamed from: b */
    public final C32040c1<C31914d3> f77927b;

    /* renamed from: c */
    public final C31998w0 f77928c;

    /* renamed from: d */
    public final C32040c1<Executor> f77929d;

    /* renamed from: e */
    public final Map<Integer, C31922f1> f77930e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f77931f = new ReentrantLock();

    public C31942j1(C31906c0 c0Var, C32040c1<C31914d3> c1Var, C31998w0 w0Var, C32040c1<Executor> c1Var2) {
        this.f77926a = c0Var;
        this.f77927b = c1Var;
        this.f77928c = w0Var;
        this.f77929d = c1Var2;
    }

    /* renamed from: t */
    public static String m129543t(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C31904bk("Session without pack received.");
    }

    /* renamed from: u */
    public static <T> List<T> m129544u(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void mo92599a() {
        this.f77931f.lock();
    }

    /* renamed from: b */
    public final void mo92600b() {
        this.f77931f.unlock();
    }

    /* renamed from: c */
    public final Map<Integer, C31922f1> mo92601c() {
        return this.f77930e;
    }

    /* renamed from: d */
    public final boolean mo92602d(Bundle bundle) {
        return ((Boolean) mo92616r(new C32006y0(this, bundle, (byte[]) null))).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo92603e(Bundle bundle) {
        return ((Boolean) mo92616r(new C32006y0(this, bundle))).booleanValue();
    }

    /* renamed from: f */
    public final void mo92604f(String str, int i, long j) {
        mo92616r(new C32010z0(this, str, i, j));
    }

    /* renamed from: g */
    public final void mo92605g(int i) {
        mo92616r(new C31896a1(this, i));
    }

    /* renamed from: h */
    public final Map<String, Integer> mo92606h(List<String> list) {
        return (Map) mo92616r(new C31901b1(this, list));
    }

    /* renamed from: i */
    public final /* synthetic */ Map mo92607i(List list) {
        int i;
        Map<String, C31922f1> q = mo92615q(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C31922f1 f1Var = q.get(str);
            if (f1Var == null) {
                i = 8;
            } else {
                if (C31987t1.m129671f(f1Var.f77852c.f77838c)) {
                    try {
                        f1Var.f77852c.f77838c = 6;
                        this.f77929d.mo92734a().execute(new C31907c1(this, f1Var));
                        this.f77928c.mo92702a(str);
                    } catch (C31904bk unused) {
                        f77925g.mo92778d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(f1Var.f77850a), str);
                    }
                }
                i = f1Var.f77852c.f77838c;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: j */
    public final /* synthetic */ Map mo92608j(List list) {
        HashMap hashMap = new HashMap();
        for (C31922f1 next : this.f77930e.values()) {
            String str = next.f77852c.f77836a;
            if (list.contains(str)) {
                C31922f1 f1Var = (C31922f1) hashMap.get(str);
                if ((f1Var == null ? -1 : f1Var.f77850a) < next.f77850a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: k */
    public final /* synthetic */ Boolean mo92609k(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C31922f1> map = this.f77930e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C31922f1 f1Var = this.f77930e.get(valueOf);
        if (f1Var.f77852c.f77838c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C31987t1.m129674i(f1Var.f77852c.f77838c, bundle.getInt(C32061j1.m129824e("status", m129543t(bundle)))));
    }

    /* renamed from: l */
    public final /* synthetic */ Boolean mo92610l(Bundle bundle) {
        C31927g1 g1Var;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C31922f1> map = this.f77930e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        boolean z2 = false;
        if (map.containsKey(valueOf)) {
            C31922f1 s = mo92617s(i);
            int i2 = bundle2.getInt(C32061j1.m129824e("status", s.f77852c.f77836a));
            if (C31987t1.m129674i(s.f77852c.f77838c, i2)) {
                f77925g.mo92775a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(s.f77852c.f77838c));
                C31917e1 e1Var = s.f77852c;
                String str = e1Var.f77836a;
                int i3 = e1Var.f77838c;
                if (i3 == 4) {
                    this.f77927b.mo92734a().mo92544e(i, str);
                } else if (i3 == 5) {
                    this.f77927b.mo92734a().mo92541b(i);
                } else if (i3 == 6) {
                    this.f77927b.mo92734a().mo92539T0(Arrays.asList(new String[]{str}));
                }
            } else {
                s.f77852c.f77838c = i2;
                if (C31987t1.m129672g(i2)) {
                    mo92605g(i);
                    this.f77928c.mo92702a(s.f77852c.f77836a);
                } else {
                    for (C31927g1 next : s.f77852c.f77840e) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C32061j1.m129825f("chunk_intents", s.f77852c.f77836a, next.f77865a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.f77868d.get(i4).f77825a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String t = m129543t(bundle);
            long j = bundle2.getLong(C32061j1.m129824e("pack_version", t));
            int i5 = bundle2.getInt(C32061j1.m129824e("status", t));
            long j2 = bundle2.getLong(C32061j1.m129824e("total_bytes_to_download", t));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C32061j1.m129824e("slice_ids", t));
            ArrayList arrayList = new ArrayList();
            for (T t2 : m129544u(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C32061j1.m129825f("chunk_intents", t, t2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m129544u(parcelableArrayList2)) {
                    if (intent == null) {
                        z = z2;
                    }
                    arrayList2.add(new C31912d1(z));
                    z = true;
                    z2 = false;
                }
                String string = bundle2.getString(C32061j1.m129825f("uncompressed_hash_sha256", t, t2));
                long j3 = bundle2.getLong(C32061j1.m129825f("uncompressed_size", t, t2));
                int i6 = bundle2.getInt(C32061j1.m129825f("patch_format", t, t2), 0);
                if (i6 != 0) {
                    g1Var = new C31927g1(t2, string, j3, arrayList2, 0, i6);
                    z2 = false;
                } else {
                    z2 = false;
                    g1Var = new C31927g1(t2, string, j3, arrayList2, bundle2.getInt(C32061j1.m129825f("compression_format", t, t2), 0), 0);
                }
                arrayList.add(g1Var);
                z = true;
            }
            this.f77930e.put(Integer.valueOf(i), new C31922f1(i, bundle2.getInt("app_version_code"), new C31917e1(t, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* renamed from: m */
    public final /* synthetic */ void mo92611m(String str, int i, long j) {
        C31922f1 f1Var = mo92615q(Arrays.asList(new String[]{str})).get(str);
        if (f1Var == null || C31987t1.m129672g(f1Var.f77852c.f77838c)) {
            f77925g.mo92776b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f77926a.mo92514b(str, i, j);
        f1Var.f77852c.f77838c = 4;
    }

    /* renamed from: n */
    public final /* synthetic */ void mo92612n(int i) {
        mo92617s(i).f77852c.f77838c = 5;
    }

    /* renamed from: o */
    public final /* synthetic */ void mo92613o(int i) {
        C31922f1 s = mo92617s(i);
        if (C31987t1.m129672g(s.f77852c.f77838c)) {
            C31906c0 c0Var = this.f77926a;
            C31917e1 e1Var = s.f77852c;
            c0Var.mo92514b(e1Var.f77836a, s.f77851b, e1Var.f77837b);
            C31917e1 e1Var2 = s.f77852c;
            int i2 = e1Var2.f77838c;
            if (i2 == 5 || i2 == 6) {
                this.f77926a.mo92515c(e1Var2.f77836a, s.f77851b, e1Var2.f77837b);
                return;
            }
            return;
        }
        throw new C31904bk(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* renamed from: p */
    public final void mo92614p(int i) {
        mo92616r(new C31896a1(this, i, (byte[]) null));
    }

    /* renamed from: q */
    public final Map<String, C31922f1> mo92615q(List<String> list) {
        return (Map) mo92616r(new C31901b1(this, list, (byte[]) null));
    }

    /* renamed from: r */
    public final <T> T mo92616r(C31932h1<T> h1Var) {
        try {
            mo92599a();
            return h1Var.mo92480a();
        } finally {
            mo92600b();
        }
    }

    /* renamed from: s */
    public final C31922f1 mo92617s(int i) {
        Map<Integer, C31922f1> map = this.f77930e;
        Integer valueOf = Integer.valueOf(i);
        C31922f1 f1Var = map.get(valueOf);
        if (f1Var != null) {
            return f1Var;
        }
        throw new C31904bk(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }
}
