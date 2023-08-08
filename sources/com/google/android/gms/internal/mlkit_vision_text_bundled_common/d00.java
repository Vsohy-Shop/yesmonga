package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class d00 extends C29722sx<String> implements RandomAccess, e00 {

    /* renamed from: c */
    public static final d00 f71195c;

    /* renamed from: d */
    public static final e00 f71196d;

    /* renamed from: b */
    public final List<Object> f71197b;

    static {
        d00 d00 = new d00(10);
        f71195c = d00;
        d00.mo84834I();
        f71196d = d00;
    }

    public d00() {
        this(10);
    }

    /* renamed from: i */
    public static String m120280i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zbwp) {
            return ((zbwp) obj).mo84999W(C29909xz.f71541a);
        }
        return C29909xz.m121350h((byte[]) obj);
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f71197b);
            return new d00((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Q2 */
    public final List<?> mo84574Q2() {
        return Collections.unmodifiableList(this.f71197b);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo84835e();
        this.f71197b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo84835e();
        if (collection instanceof e00) {
            collection = ((e00) collection).mo84574Q2();
        }
        boolean addAll = this.f71197b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c3 */
    public final Object mo84576c3(int i) {
        return this.f71197b.get(i);
    }

    public final void clear() {
        mo84835e();
        this.f71197b.clear();
        this.modCount++;
    }

    /* renamed from: h */
    public final String get(int i) {
        Object obj = this.f71197b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zbwp) {
            zbwp zbwp = (zbwp) obj;
            String W = zbwp.mo84999W(C29909xz.f71541a);
            if (zbwp.mo84997y()) {
                this.f71197b.set(i, W);
            }
            return W;
        }
        byte[] bArr = (byte[]) obj;
        String h = C29909xz.m121350h(bArr);
        if (C29909xz.m121352j(bArr)) {
            this.f71197b.set(i, h);
        }
        return h;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo84835e();
        Object remove = this.f71197b.remove(i);
        this.modCount++;
        return m120280i(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo84835e();
        return m120280i(this.f71197b.set(i, (String) obj));
    }

    public final int size() {
        return this.f71197b.size();
    }

    /* renamed from: x */
    public final e00 mo84581x() {
        if (mo84839z()) {
            return new C29540o(this);
        }
        return this;
    }

    public d00(int i) {
        this.f71197b = new ArrayList(i);
    }

    public d00(ArrayList<Object> arrayList) {
        this.f71197b = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
