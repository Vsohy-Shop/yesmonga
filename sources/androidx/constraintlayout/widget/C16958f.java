package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.widget.f */
public class C16958f {

    /* renamed from: c */
    public static final int f44838c = -1;

    /* renamed from: a */
    public SparseIntArray f44839a = new SparseIntArray();

    /* renamed from: b */
    public HashMap<Integer, HashSet<WeakReference<C16959a>>> f44840b = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.f$a */
    public interface C16959a {
        /* renamed from: a */
        void mo50124a(int i, int i2, int i3);
    }

    /* renamed from: a */
    public void mo50984a(int i, C16959a aVar) {
        HashSet hashSet = this.f44840b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f44840b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    /* renamed from: b */
    public void mo50985b() {
        this.f44840b.clear();
    }

    /* renamed from: c */
    public void mo50986c(int i, int i2) {
        int i3 = this.f44839a.get(i, -1);
        if (i3 != i2) {
            this.f44839a.put(i, i2);
            HashSet hashSet = this.f44840b.get(Integer.valueOf(i));
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C16959a aVar = (C16959a) ((WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.mo50124a(i, i2, i3);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        WeakReference weakReference = (WeakReference) it2.next();
                        if (((C16959a) weakReference.get()) == null) {
                            arrayList.add(weakReference);
                        }
                    }
                    hashSet.removeAll(arrayList);
                }
            }
        }
    }

    /* renamed from: d */
    public int mo50987d(int i) {
        return this.f44839a.get(i, -1);
    }

    /* renamed from: e */
    public void mo50988e(int i, C16959a aVar) {
        HashSet hashSet = this.f44840b.get(Integer.valueOf(i));
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C16959a aVar2 = (C16959a) weakReference.get();
                if (aVar2 == null || aVar2 == aVar) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    /* renamed from: f */
    public void mo50989f(C16959a aVar) {
        for (Integer intValue : this.f44840b.keySet()) {
            mo50988e(intValue.intValue(), aVar);
        }
    }
}
