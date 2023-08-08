package com.google.firebase.abt;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.inject.C33058b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.firebase.abt.c */
public class C32515c {
    @C0344h1

    /* renamed from: d */
    public static final String f78859d = "com.google.firebase.abt";
    @C0344h1

    /* renamed from: e */
    public static final String f78860e = "%s_lastKnownExperimentStartTime";

    /* renamed from: a */
    public final C33058b<C32537a> f78861a;

    /* renamed from: b */
    public final String f78862b;
    @C0363p0

    /* renamed from: c */
    public Integer f78863c = null;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.abt.c$a */
    public @interface C32516a {

        /* renamed from: P2 */
        public static final String f78864P2 = "frc";

        /* renamed from: Q2 */
        public static final String f78865Q2 = "fiam";
    }

    public C32515c(Context context, C33058b<C32537a> bVar, String str) {
        this.f78861a = bVar;
        this.f78862b = str;
    }

    /* renamed from: c */
    public static List<C32513a> m131491c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> b : list) {
            arrayList.add(C32513a.m131480b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo94612a(C32537a.C32540c cVar) {
        this.f78861a.get().mo94645a(cVar);
    }

    /* renamed from: b */
    public final void mo94613b(List<C32513a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(mo94615e());
        int h = mo94618h();
        for (C32513a next : list) {
            while (arrayDeque.size() >= h) {
                mo94620j(((C32537a.C32540c) arrayDeque.pollFirst()).f78983b);
            }
            C32537a.C32540c i = next.mo94610i(this.f78862b);
            mo94612a(i);
            arrayDeque.offer(i);
        }
    }

    @C0348i1
    /* renamed from: d */
    public List<C32513a> mo94614d() throws AbtException {
        mo94625o();
        List<C32537a.C32540c> e = mo94615e();
        ArrayList arrayList = new ArrayList();
        for (C32537a.C32540c a : e) {
            arrayList.add(C32513a.m131479a(a));
        }
        return arrayList;
    }

    @C0348i1
    /* renamed from: e */
    public final List<C32537a.C32540c> mo94615e() {
        return this.f78861a.get().mo94651f(this.f78862b, "");
    }

    /* renamed from: f */
    public final ArrayList<C32513a> mo94616f(List<C32513a> list, Set<String> set) {
        ArrayList<C32513a> arrayList = new ArrayList<>();
        for (C32513a next : list) {
            if (!set.contains(next.mo94604c())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList<C32537a.C32540c> mo94617g(List<C32537a.C32540c> list, Set<String> set) {
        ArrayList<C32537a.C32540c> arrayList = new ArrayList<>();
        for (C32537a.C32540c next : list) {
            if (!set.contains(next.f78983b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C0348i1
    /* renamed from: h */
    public final int mo94618h() {
        if (this.f78863c == null) {
            this.f78863c = Integer.valueOf(this.f78861a.get().mo94650e(this.f78862b));
        }
        return this.f78863c.intValue();
    }

    @C0348i1
    /* renamed from: i */
    public void mo94619i() throws AbtException {
        mo94625o();
        mo94621k(mo94615e());
    }

    /* renamed from: j */
    public final void mo94620j(String str) {
        this.f78861a.get().clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    /* renamed from: k */
    public final void mo94621k(Collection<C32537a.C32540c> collection) {
        for (C32537a.C32540c cVar : collection) {
            mo94620j(cVar.f78983b);
        }
    }

    @C0348i1
    /* renamed from: l */
    public void mo94622l(List<Map<String, String>> list) throws AbtException {
        mo94625o();
        if (list != null) {
            mo94623m(m131491c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    /* renamed from: m */
    public final void mo94623m(List<C32513a> list) throws AbtException {
        if (list.isEmpty()) {
            mo94619i();
            return;
        }
        HashSet hashSet = new HashSet();
        for (C32513a c : list) {
            hashSet.add(c.mo94604c());
        }
        List<C32537a.C32540c> e = mo94615e();
        HashSet hashSet2 = new HashSet();
        for (C32537a.C32540c cVar : e) {
            hashSet2.add(cVar.f78983b);
        }
        mo94621k(mo94617g(e, hashSet));
        mo94613b(mo94616f(list, hashSet2));
    }

    @C0348i1
    /* renamed from: n */
    public void mo94624n(C32513a aVar) throws AbtException {
        mo94625o();
        C32513a.m131481k(aVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> j = aVar.mo94611j();
        j.remove(C32513a.f78843i);
        arrayList.add(C32513a.m131480b(j));
        mo94613b(arrayList);
    }

    /* renamed from: o */
    public final void mo94625o() throws AbtException {
        if (this.f78861a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @C0348i1
    /* renamed from: p */
    public void mo94626p(List<C32513a> list) throws AbtException {
        mo94625o();
        HashSet hashSet = new HashSet();
        for (C32513a c : list) {
            hashSet.add(c.mo94604c());
        }
        mo94621k(mo94617g(mo94615e(), hashSet));
    }
}
