package com.airbnb.lottie;

import androidx.collection.C1869c;
import androidx.core.util.C17994n;
import com.airbnb.lottie.utils.C21684h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.airbnb.lottie.s */
public class C21660s {

    /* renamed from: a */
    public boolean f56059a = false;

    /* renamed from: b */
    public final Set<C21662b> f56060b = new C1869c();

    /* renamed from: c */
    public final Map<String, C21684h> f56061c = new HashMap();

    /* renamed from: d */
    public final Comparator<C17994n<String, Float>> f56062d = new C21661a();

    /* renamed from: com.airbnb.lottie.s$a */
    public class C21661a implements Comparator<C17994n<String, Float>> {
        public C21661a() {
        }

        /* renamed from: a */
        public int compare(C17994n<String, Float> nVar, C17994n<String, Float> nVar2) {
            float floatValue = ((Float) nVar.f46483b).floatValue();
            float floatValue2 = ((Float) nVar2.f46483b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: com.airbnb.lottie.s$b */
    public interface C21662b {
        /* renamed from: a */
        void mo64658a(float f);
    }

    /* renamed from: a */
    public void mo64649a(C21662b bVar) {
        this.f56060b.add(bVar);
    }

    /* renamed from: b */
    public void mo64650b() {
        this.f56061c.clear();
    }

    /* renamed from: c */
    public List<C17994n<String, Float>> mo64651c() {
        if (!this.f56059a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f56061c.size());
        for (Map.Entry next : this.f56061c.entrySet()) {
            arrayList.add(new C17994n(next.getKey(), Float.valueOf(((C21684h) next.getValue()).mo64705b())));
        }
        Collections.sort(arrayList, this.f56062d);
        return arrayList;
    }

    /* renamed from: d */
    public void mo64652d() {
        if (this.f56059a) {
            List<C17994n<String, Float>> c = mo64651c();
            for (int i = 0; i < c.size(); i++) {
                C17994n nVar = c.get(i);
                String.format("\t\t%30s:%.2f", new Object[]{nVar.f46482a, nVar.f46483b});
            }
        }
    }

    /* renamed from: e */
    public void mo64653e(String str, float f) {
        if (this.f56059a) {
            C21684h hVar = this.f56061c.get(str);
            if (hVar == null) {
                hVar = new C21684h();
                this.f56061c.put(str, hVar);
            }
            hVar.mo64704a(f);
            if (str.equals("__container")) {
                for (C21662b a : this.f56060b) {
                    a.mo64658a(f);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo64654f(C21662b bVar) {
        this.f56060b.remove(bVar);
    }

    /* renamed from: g */
    public void mo64655g(boolean z) {
        this.f56059a = z;
    }
}
