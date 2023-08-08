package com.google.android.gms.internal.measurement;

import com.urbanairship.actions.ToastAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C41939f implements Iterable, C42133q, C42065m {

    /* renamed from: a */
    public final SortedMap f106108a;

    /* renamed from: b */
    public final Map f106109b;

    public C41939f() {
        this.f106108a = new TreeMap();
        this.f106109b = new TreeMap();
    }

    /* renamed from: A */
    public final int mo136726A() {
        if (this.f106108a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f106108a.lastKey()).intValue() + 1;
    }

    /* renamed from: H */
    public final C42133q mo136727H(int i) {
        C42133q qVar;
        if (i >= mo136726A()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else if (!mo136739h0(i) || (qVar = (C42133q) this.f106108a.get(Integer.valueOf(i))) == null) {
            return C42133q.f106351H;
        } else {
            return qVar;
        }
    }

    /* renamed from: I0 */
    public final C42133q mo136728I0(String str) {
        C42133q qVar;
        if (ToastAction.f87498j.equals(str)) {
            return new C41993i(Double.valueOf((double) mo136726A()));
        }
        if (!mo136746r(str) || (qVar = (C42133q) this.f106109b.get(str)) == null) {
            return C42133q.f106351H;
        }
        return qVar;
    }

    /* renamed from: M */
    public final String mo136729M(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f106108a.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= mo136726A()) {
                    break;
                }
                C42133q H = mo136727H(i);
                sb.append(str2);
                if (!(H instanceof C42218v) && !(H instanceof C42099o)) {
                    sb.append(H.mo136744k());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    /* renamed from: Q */
    public final Iterator mo136730Q() {
        return this.f106108a.keySet().iterator();
    }

    /* renamed from: W */
    public final List mo136731W() {
        ArrayList arrayList = new ArrayList(mo136726A());
        for (int i = 0; i < mo136726A(); i++) {
            arrayList.add(mo136727H(i));
        }
        return arrayList;
    }

    /* renamed from: X */
    public final void mo136732X() {
        this.f106108a.clear();
    }

    /* renamed from: Y */
    public final void mo136733Y(int i, C42133q qVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo136726A()) {
            mo136737f0(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f106108a.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f106108a;
                Integer valueOf = Integer.valueOf(intValue);
                C42133q qVar2 = (C42133q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo136737f0(intValue + 1, qVar2);
                    this.f106108a.remove(valueOf);
                }
            }
            mo136737f0(i, qVar);
        }
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        C41939f fVar = new C41939f();
        for (Map.Entry entry : this.f106108a.entrySet()) {
            if (entry.getValue() instanceof C42065m) {
                fVar.f106108a.put((Integer) entry.getKey(), (C42133q) entry.getValue());
            } else {
                fVar.f106108a.put((Integer) entry.getKey(), ((C42133q) entry.getValue()).mo136734e());
            }
        }
        return fVar;
    }

    /* renamed from: e0 */
    public final void mo136735e0(int i) {
        int intValue = ((Integer) this.f106108a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f106108a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f106108a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f106108a.put(valueOf, C42133q.f106351H);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f106108a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f106108a;
                    Integer valueOf2 = Integer.valueOf(i);
                    C42133q qVar = (C42133q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f106108a.put(Integer.valueOf(i - 1), qVar);
                        this.f106108a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C41939f)) {
            return false;
        }
        C41939f fVar = (C41939f) obj;
        if (mo136726A() != fVar.mo136726A()) {
            return false;
        }
        if (this.f106108a.isEmpty()) {
            return fVar.f106108a.isEmpty();
        }
        for (int intValue = ((Integer) this.f106108a.firstKey()).intValue(); intValue <= ((Integer) this.f106108a.lastKey()).intValue(); intValue++) {
            if (!mo136727H(intValue).equals(fVar.mo136727H(intValue))) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"elements"})
    /* renamed from: f0 */
    public final void mo136737f0(int i, C42133q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qVar == null) {
            this.f106108a.remove(Integer.valueOf(i));
        } else {
            this.f106108a.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        return Boolean.TRUE;
    }

    /* renamed from: h0 */
    public final boolean mo136739h0(int i) {
        if (i >= 0 && i <= ((Integer) this.f106108a.lastKey()).intValue()) {
            return this.f106108a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public final int hashCode() {
        return this.f106108a.hashCode() * 31;
    }

    /* renamed from: i */
    public final C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return C41904d0.m169758a(str, this, d5Var, list);
        }
        return C42029k.m170426a(this, new C42201u(str), d5Var, list);
    }

    public final Iterator iterator() {
        return new C41921e(this);
    }

    /* renamed from: j */
    public final Double mo136743j() {
        if (this.f106108a.size() == 1) {
            return mo136727H(0).mo136743j();
        }
        if (this.f106108a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: k */
    public final String mo136744k() {
        return mo136729M(",");
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return new C41903d(this, this.f106108a.keySet().iterator(), this.f106109b.keySet().iterator());
    }

    /* renamed from: r */
    public final boolean mo136746r(String str) {
        if (ToastAction.f87498j.equals(str) || this.f106109b.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return mo136729M(",");
    }

    /* renamed from: w */
    public final void mo136748w(String str, C42133q qVar) {
        if (qVar == null) {
            this.f106109b.remove(str);
        } else {
            this.f106109b.put(str, qVar);
        }
    }

    /* renamed from: y */
    public final int mo136749y() {
        return this.f106108a.size();
    }

    public C41939f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo136737f0(i, (C42133q) list.get(i));
            }
        }
    }
}
