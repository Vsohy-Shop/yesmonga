package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.bk */
public final class C41170bk extends C41743zg<String> implements RandomAccess, C41194ck {

    /* renamed from: c */
    public static final C41170bk f104473c;

    /* renamed from: d */
    public static final C41194ck f104474d;

    /* renamed from: b */
    public final List<Object> f104475b;

    static {
        C41170bk bkVar = new C41170bk(10);
        f104473c = bkVar;
        bkVar.zzb();
        f104474d = bkVar;
    }

    public C41170bk() {
        this(10);
    }

    /* renamed from: i */
    public static String m167215i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zztd) {
            return ((zztd) obj).mo136154f0(C41650vj.f105169a);
        }
        return C41650vj.m168606h((byte[]) obj);
    }

    /* renamed from: E0 */
    public final void mo135120E0(zztd zztd) {
        mo136121e();
        this.f104475b.add(zztd);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo136121e();
        this.f104475b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo136121e();
        if (collection instanceof C41194ck) {
            collection = ((C41194ck) collection).mo135128j();
        }
        boolean addAll = this.f104475b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo136121e();
        this.f104475b.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final C41194ck mo135125f() {
        if (mo135928d()) {
            return new C41220dm(this);
        }
        return this;
    }

    /* renamed from: h */
    public final String get(int i) {
        Object obj = this.f104475b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zztd) {
            zztd zztd = (zztd) obj;
            String f0 = zztd.mo136154f0(C41650vj.f105169a);
            if (zztd.mo136147A()) {
                this.f104475b.set(i, f0);
            }
            return f0;
        }
        byte[] bArr = (byte[]) obj;
        String h = C41650vj.m168606h(bArr);
        if (C41650vj.m168608j(bArr)) {
            this.f104475b.set(i, h);
        }
        return h;
    }

    /* renamed from: j */
    public final List<?> mo135128j() {
        return Collections.unmodifiableList(this.f104475b);
    }

    /* renamed from: m */
    public final Object mo135129m(int i) {
        return this.f104475b.get(i);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C41626uj mo135130n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f104475b);
            return new C41170bk((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136121e();
        Object remove = this.f104475b.remove(i);
        this.modCount++;
        return m167215i(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo136121e();
        return m167215i(this.f104475b.set(i, (String) obj));
    }

    public final int size() {
        return this.f104475b.size();
    }

    public C41170bk(int i) {
        this.f104475b = new ArrayList(i);
    }

    public C41170bk(ArrayList<Object> arrayList) {
        this.f104475b = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
