package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3 */
public final class C38896d3 extends C38864a1<String> implements RandomAccess, C38906e3 {

    /* renamed from: c */
    public static final C38896d3 f98825c;

    /* renamed from: d */
    public static final C38906e3 f98826d;

    /* renamed from: b */
    public final List<Object> f98827b;

    static {
        C38896d3 d3Var = new C38896d3(10);
        f98825c = d3Var;
        d3Var.zzb();
        f98826d = d3Var;
    }

    public C38896d3() {
        this(10);
    }

    /* renamed from: i */
    public static String m160450i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdc) {
            return ((zzdc) obj).mo123201m0(C39084x2.f98960a);
        }
        return C39084x2.m160972h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo122768e();
        this.f98827b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo122768e();
        if (collection instanceof C38906e3) {
            collection = ((C38906e3) collection).mo122842j();
        }
        boolean addAll = this.f98827b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo122768e();
        this.f98827b.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final C38906e3 mo122839f() {
        if (mo122767d()) {
            return new C38978l5(this);
        }
        return this;
    }

    /* renamed from: h */
    public final String get(int i) {
        Object obj = this.f98827b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdc) {
            zzdc zzdc = (zzdc) obj;
            String m0 = zzdc.mo123201m0(C39084x2.f98960a);
            if (zzdc.mo123194W()) {
                this.f98827b.set(i, m0);
            }
            return m0;
        }
        byte[] bArr = (byte[]) obj;
        String h = C39084x2.m160972h(bArr);
        if (C39084x2.m160974j(bArr)) {
            this.f98827b.set(i, h);
        }
        return h;
    }

    /* renamed from: j */
    public final List<?> mo122842j() {
        return Collections.unmodifiableList(this.f98827b);
    }

    /* renamed from: m */
    public final Object mo122843m(int i) {
        return this.f98827b.get(i);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C39075w2 mo122844n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f98827b);
            return new C38896d3((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo122768e();
        Object remove = this.f98827b.remove(i);
        this.modCount++;
        return m160450i(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo122768e();
        return m160450i(this.f98827b.set(i, (String) obj));
    }

    public final int size() {
        return this.f98827b.size();
    }

    public C38896d3(int i) {
        this.f98827b = new ArrayList(i);
    }

    public C38896d3(ArrayList<Object> arrayList) {
        this.f98827b = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
