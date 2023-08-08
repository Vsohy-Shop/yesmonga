package androidx.coordinatorlayout.widget;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1886l;
import androidx.core.util.C17997q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C16984a<T> {

    /* renamed from: a */
    public final C17997q.C17998a<ArrayList<T>> f44914a = new C17997q.C17999b(10);

    /* renamed from: b */
    public final C1886l<T, ArrayList<T>> f44915b = new C1886l<>();

    /* renamed from: c */
    public final ArrayList<T> f44916c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f44917d = new HashSet<>();

    /* renamed from: a */
    public void mo51131a(@C0359n0 T t, @C0359n0 T t2) {
        if (!this.f44915b.containsKey(t) || !this.f44915b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f44915b.get(t);
        if (arrayList == null) {
            arrayList = mo51136f();
            this.f44915b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo51132b(@C0359n0 T t) {
        if (!this.f44915b.containsKey(t)) {
            this.f44915b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo51133c() {
        int size = this.f44915b.size();
        for (int i = 0; i < size; i++) {
            ArrayList o = this.f44915b.mo6338o(i);
            if (o != null) {
                mo51141k(o);
            }
        }
        this.f44915b.clear();
    }

    /* renamed from: d */
    public boolean mo51134d(@C0359n0 T t) {
        return this.f44915b.containsKey(t);
    }

    /* renamed from: e */
    public final void mo51135e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f44915b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo51135e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    @C0359n0
    /* renamed from: f */
    public final ArrayList<T> mo51136f() {
        ArrayList<T> b = this.f44914a.mo52469b();
        if (b == null) {
            return new ArrayList<>();
        }
        return b;
    }

    @C0363p0
    /* renamed from: g */
    public List mo51137g(@C0359n0 T t) {
        return this.f44915b.get(t);
    }

    @C0363p0
    /* renamed from: h */
    public List<T> mo51138h(@C0359n0 T t) {
        int size = this.f44915b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList o = this.f44915b.mo6338o(i);
            if (o != null && o.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f44915b.mo6334j(i));
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: i */
    public ArrayList<T> mo51139i() {
        this.f44916c.clear();
        this.f44917d.clear();
        int size = this.f44915b.size();
        for (int i = 0; i < size; i++) {
            mo51135e(this.f44915b.mo6334j(i), this.f44916c, this.f44917d);
        }
        return this.f44916c;
    }

    /* renamed from: j */
    public boolean mo51140j(@C0359n0 T t) {
        int size = this.f44915b.size();
        for (int i = 0; i < size; i++) {
            ArrayList o = this.f44915b.mo6338o(i);
            if (o != null && o.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo51141k(@C0359n0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f44914a.mo52468a(arrayList);
    }

    /* renamed from: l */
    public int mo51142l() {
        return this.f44915b.size();
    }
}
