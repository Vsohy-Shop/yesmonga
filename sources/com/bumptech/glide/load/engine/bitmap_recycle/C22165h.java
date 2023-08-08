package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.bitmap_recycle.C22176m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h */
public class C22165h<K extends C22176m, V> {

    /* renamed from: a */
    public final C22166a<K, V> f56952a = new C22166a<>();

    /* renamed from: b */
    public final Map<K, C22166a<K, V>> f56953b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$a */
    public static class C22166a<K, V> {

        /* renamed from: a */
        public final K f56954a;

        /* renamed from: b */
        public List<V> f56955b;

        /* renamed from: c */
        public C22166a<K, V> f56956c;

        /* renamed from: d */
        public C22166a<K, V> f56957d;

        public C22166a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo65968a(V v) {
            if (this.f56955b == null) {
                this.f56955b = new ArrayList();
            }
            this.f56955b.add(v);
        }

        @C0363p0
        /* renamed from: b */
        public V mo65969b() {
            int c = mo65970c();
            if (c > 0) {
                return this.f56955b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo65970c() {
            List<V> list = this.f56955b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C22166a(K k) {
            this.f56957d = this;
            this.f56956c = this;
            this.f56954a = k;
        }
    }

    /* renamed from: e */
    public static <K, V> void m100956e(C22166a<K, V> aVar) {
        C22166a<K, V> aVar2 = aVar.f56957d;
        aVar2.f56956c = aVar.f56956c;
        aVar.f56956c.f56957d = aVar2;
    }

    /* renamed from: g */
    public static <K, V> void m100957g(C22166a<K, V> aVar) {
        aVar.f56956c.f56957d = aVar;
        aVar.f56957d.f56956c = aVar;
    }

    @C0363p0
    /* renamed from: a */
    public V mo65962a(K k) {
        C22166a aVar = this.f56953b.get(k);
        if (aVar == null) {
            aVar = new C22166a(k);
            this.f56953b.put(k, aVar);
        } else {
            k.mo65943a();
        }
        mo65963b(aVar);
        return aVar.mo65969b();
    }

    /* renamed from: b */
    public final void mo65963b(C22166a<K, V> aVar) {
        m100956e(aVar);
        C22166a<K, V> aVar2 = this.f56952a;
        aVar.f56957d = aVar2;
        aVar.f56956c = aVar2.f56956c;
        m100957g(aVar);
    }

    /* renamed from: c */
    public final void mo65964c(C22166a<K, V> aVar) {
        m100956e(aVar);
        C22166a<K, V> aVar2 = this.f56952a;
        aVar.f56957d = aVar2.f56957d;
        aVar.f56956c = aVar2;
        m100957g(aVar);
    }

    /* renamed from: d */
    public void mo65965d(K k, V v) {
        C22166a aVar = this.f56953b.get(k);
        if (aVar == null) {
            aVar = new C22166a(k);
            mo65964c(aVar);
            this.f56953b.put(k, aVar);
        } else {
            k.mo65943a();
        }
        aVar.mo65968a(v);
    }

    @C0363p0
    /* renamed from: f */
    public V mo65966f() {
        for (C22166a<K, V> aVar = this.f56952a.f56957d; !aVar.equals(this.f56952a); aVar = aVar.f56957d) {
            V b = aVar.mo65969b();
            if (b != null) {
                return b;
            }
            m100956e(aVar);
            this.f56953b.remove(aVar.f56954a);
            ((C22176m) aVar.f56954a).mo65943a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C22166a<K, V> aVar = this.f56952a.f56956c;
        boolean z = false;
        while (!aVar.equals(this.f56952a)) {
            sb.append(C12361b.f30258i);
            sb.append(aVar.f56954a);
            sb.append(C12361b.f30257h);
            sb.append(aVar.mo65970c());
            sb.append("}, ");
            aVar = aVar.f56956c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
