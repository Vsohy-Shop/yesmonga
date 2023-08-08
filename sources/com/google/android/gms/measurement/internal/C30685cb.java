package com.google.android.gms.measurement.internal;

import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import com.google.android.gms.internal.measurement.C41989hd;
import com.google.android.gms.internal.measurement.C42053l5;
import com.google.android.gms.internal.measurement.C42071m5;
import com.google.android.gms.internal.measurement.C42088n5;
import com.google.android.gms.internal.measurement.C42105o5;
import com.google.android.gms.internal.measurement.C42155r4;
import com.google.android.gms.internal.measurement.C42172s4;
import com.google.android.gms.internal.measurement.C42189t4;
import com.google.android.gms.internal.measurement.C42206u4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.cb */
public final class C30685cb {

    /* renamed from: a */
    public String f73272a;

    /* renamed from: b */
    public boolean f73273b;

    /* renamed from: c */
    public C42071m5 f73274c;

    /* renamed from: d */
    public BitSet f73275d;

    /* renamed from: e */
    public BitSet f73276e;

    /* renamed from: f */
    public Map f73277f;

    /* renamed from: g */
    public Map f73278g;

    /* renamed from: h */
    public final /* synthetic */ C30660b f73279h;

    public /* synthetic */ C30685cb(C30660b bVar, String str, C30672bb bbVar) {
        this.f73279h = bVar;
        this.f73272a = str;
        this.f73273b = true;
        this.f73275d = new BitSet();
        this.f73276e = new BitSet();
        this.f73277f = new C1866a();
        this.f73278g = new C1866a();
    }

    @C0359n0
    /* renamed from: a */
    public final C42172s4 mo86935a(int i) {
        ArrayList arrayList;
        List list;
        C42155r4 C = C42172s4.m170795C();
        C.mo137251x(i);
        C.mo137249B(this.f73273b);
        C42071m5 m5Var = this.f73274c;
        if (m5Var != null) {
            C.mo137250C(m5Var);
        }
        C42053l5 F = C42071m5.m170538F();
        F.mo137101A(C30846pa.m124113H(this.f73275d));
        F.mo137103C(C30846pa.m124113H(this.f73276e));
        Map map = this.f73277f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f73277f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f73277f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C42189t4 D = C42206u4.m170892D();
                    D.mo137302A(intValue2);
                    D.mo137303x(l.longValue());
                    arrayList2.add((C42206u4) D.mo137180s());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            F.mo137108x(arrayList);
        }
        Map map2 = this.f73278g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f73278g.keySet()) {
                C42088n5 E = C42105o5.m170643E();
                E.mo137172A(num.intValue());
                List list2 = (List) this.f73278g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    E.mo137173x(list2);
                }
                arrayList3.add((C42105o5) E.mo137180s());
            }
            list = arrayList3;
        }
        F.mo137102B(list);
        C.mo137248A(F);
        return (C42172s4) C.mo137180s();
    }

    /* renamed from: c */
    public final void mo86936c(@C0359n0 C30737gb gbVar) {
        int a = gbVar.mo87065a();
        Boolean bool = gbVar.f73477c;
        if (bool != null) {
            BitSet bitSet = this.f73276e;
            bool.booleanValue();
            bitSet.set(a, true);
        }
        Boolean bool2 = gbVar.f73478d;
        if (bool2 != null) {
            this.f73275d.set(a, bool2.booleanValue());
        }
        if (gbVar.f73479e != null) {
            Map map = this.f73277f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = gbVar.f73479e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f73277f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (gbVar.f73480f != null) {
            Map map2 = this.f73278g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f73278g.put(valueOf2, list);
            }
            if (gbVar.mo87067c()) {
                list.clear();
            }
            C41989hd.m170237b();
            C30725g z = this.f73279h.f74136a.mo87130z();
            String str = this.f73272a;
            C30729g3 g3Var = C30742h3.f73522a0;
            if (z.mo87070B(str, g3Var) && gbVar.mo87066b()) {
                list.clear();
            }
            C41989hd.m170237b();
            if (this.f73279h.f74136a.mo87130z().mo87070B(this.f73272a, g3Var)) {
                Long valueOf3 = Long.valueOf(gbVar.f73480f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(gbVar.f73480f.longValue() / 1000));
        }
    }

    public /* synthetic */ C30685cb(C30660b bVar, String str, C42071m5 m5Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C30672bb bbVar) {
        this.f73279h = bVar;
        this.f73272a = str;
        this.f73275d = bitSet;
        this.f73276e = bitSet2;
        this.f73277f = map;
        this.f73278g = new C1866a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f73278g.put(num, arrayList);
        }
        this.f73273b = false;
        this.f73274c = m5Var;
    }
}
