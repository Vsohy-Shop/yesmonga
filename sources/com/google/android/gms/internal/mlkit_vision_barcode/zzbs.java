package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.C12027x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbs<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: x */
    public static final Object f98384x = new Object();
    @NullableDecl

    /* renamed from: a */
    public transient Object f98385a;
    @NullableDecl

    /* renamed from: b */
    public transient int[] f98386b;
    @NullableDecl

    /* renamed from: c */
    public transient Object[] f98387c;
    @NullableDecl

    /* renamed from: d */
    public transient Object[] f98388d;

    /* renamed from: e */
    public transient int f98389e;

    /* renamed from: f */
    public transient int f98390f;
    @NullableDecl

    /* renamed from: g */
    public transient Set<K> f98391g;
    @NullableDecl

    /* renamed from: v */
    public transient Set<Map.Entry<K, V>> f98392v;
    @NullableDecl

    /* renamed from: w */
    public transient Collection<V> f98393w;

    public zzbs() {
        mo122614o(3);
    }

    public final void clear() {
        if (!mo122617q()) {
            mo122613n();
            Map l = mo122612l();
            if (l != null) {
                this.f98389e = C38678l1.m160048a(size(), 3, C12027x.f29642j);
                l.clear();
                this.f98385a = null;
                this.f98390f = 0;
                return;
            }
            Arrays.fill(this.f98387c, 0, this.f98390f, (Object) null);
            Arrays.fill(this.f98388d, 0, this.f98390f, (Object) null);
            Object obj = this.f98385a;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f98386b, 0, this.f98390f, 0);
            this.f98390f = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map l = mo122612l();
        if (l != null) {
            return l.containsKey(obj);
        }
        if (mo122620s(obj) == -1) {
            return false;
        }
        return true;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map l = mo122612l();
        if (l != null) {
            return l.containsValue(obj);
        }
        for (int i = 0; i < this.f98390f; i++) {
            if (C38676l.m160047a(obj, this.f98388d[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final int mo122606e() {
        return isEmpty() ? -1 : 0;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f98392v;
        if (set != null) {
            return set;
        }
        C38638i0 i0Var = new C38638i0(this);
        this.f98392v = i0Var;
        return i0Var;
    }

    /* renamed from: f */
    public final int mo122608f(int i) {
        int i2 = i + 1;
        if (i2 < this.f98390f) {
            return i2;
        }
        return -1;
    }

    public final V get(@NullableDecl Object obj) {
        Map l = mo122612l();
        if (l != null) {
            return l.get(obj);
        }
        int s = mo122620s(obj);
        if (s == -1) {
            return null;
        }
        return this.f98388d[s];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f98391g;
        if (set != null) {
            return set;
        }
        C38677l0 l0Var = new C38677l0(this);
        this.f98391g = l0Var;
        return l0Var;
    }

    @NullableDecl
    /* renamed from: l */
    public final Map<K, V> mo122612l() {
        Object obj = this.f98385a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: n */
    public final void mo122613n() {
        this.f98389e += 32;
    }

    /* renamed from: o */
    public final void mo122614o(int i) {
        this.f98389e = C38678l1.m160048a(12, 1, C12027x.f29642j);
    }

    /* renamed from: p */
    public final void mo122615p(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f98387c;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f98388d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f98386b;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = C38729p0.m160099a(obj) & i2;
            int c = C38716o0.m160085c(this.f98385a, a);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int[] iArr2 = this.f98386b;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c = i6;
                    } else {
                        iArr2[i4] = ((i + 1) & i2) | ((~i2) & i5);
                        return;
                    }
                }
            } else {
                C38716o0.m160087e(this.f98385a, a, i + 1);
            }
        } else {
            this.f98387c[i] = null;
            this.f98388d[i] = null;
            this.f98386b[i] = 0;
        }
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo122617q()) {
            C38728p.m160097d(mo122617q(), "Arrays already allocated");
            int i = this.f98389e;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f98385a = C38716o0.m160086d(max2);
            mo122624v(max2 - 1);
            this.f98386b = new int[i];
            this.f98387c = new Object[i];
            this.f98388d = new Object[i];
        }
        Map l = mo122612l();
        if (l != null) {
            return l.put(k2, v2);
        }
        int[] iArr = this.f98386b;
        Object[] objArr = this.f98387c;
        V[] vArr = this.f98388d;
        int i2 = this.f98390f;
        int i3 = i2 + 1;
        int a = C38729p0.m160099a(k);
        int r = mo122618r();
        int i4 = a & r;
        int c = C38716o0.m160085c(this.f98385a, i4);
        if (c != 0) {
            int i5 = ~r;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !C38676l.m160047a(k2, objArr[i8])) {
                    int i11 = i9 & r;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mo122618r() + 1, 1.0f);
                        for (int e = mo122606e(); e >= 0; e = mo122608f(e)) {
                            linkedHashMap.put(this.f98387c[e], this.f98388d[e]);
                        }
                        this.f98385a = linkedHashMap;
                        this.f98386b = null;
                        this.f98387c = null;
                        this.f98388d = null;
                        mo122613n();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 > r) {
                        r = mo122622t(r, C38716o0.m160083a(r), a, i2);
                    } else {
                        iArr[i8] = (i3 & r) | i10;
                    }
                } else {
                    V v3 = vArr[i8];
                    vArr[i8] = v2;
                    return v3;
                }
            }
        } else if (i3 > r) {
            r = mo122622t(r, C38716o0.m160083a(r), a, i2);
        } else {
            C38716o0.m160087e(this.f98385a, i4, i3);
        }
        int length = this.f98386b.length;
        if (i3 > length && (min = Math.min(C12027x.f29642j, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f98386b = Arrays.copyOf(this.f98386b, min);
            this.f98387c = Arrays.copyOf(this.f98387c, min);
            this.f98388d = Arrays.copyOf(this.f98388d, min);
        }
        this.f98386b[i2] = (~r) & a;
        this.f98387c[i2] = k2;
        this.f98388d[i2] = v2;
        this.f98390f = i3;
        mo122613n();
        return null;
    }

    /* renamed from: q */
    public final boolean mo122617q() {
        return this.f98385a == null;
    }

    /* renamed from: r */
    public final int mo122618r() {
        return (1 << (this.f98389e & 31)) - 1;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map l = mo122612l();
        if (l != null) {
            return l.remove(obj);
        }
        V u = mo122623u(obj);
        if (u == f98384x) {
            return null;
        }
        return u;
    }

    /* renamed from: s */
    public final int mo122620s(@NullableDecl Object obj) {
        if (mo122617q()) {
            return -1;
        }
        int a = C38729p0.m160099a(obj);
        int r = mo122618r();
        int c = C38716o0.m160085c(this.f98385a, a & r);
        if (c != 0) {
            int i = ~r;
            int i2 = a & i;
            do {
                int i3 = c - 1;
                int i4 = this.f98386b[i3];
                if ((i4 & i) == i2 && C38676l.m160047a(obj, this.f98387c[i3])) {
                    return i3;
                }
                c = i4 & r;
            } while (c != 0);
        }
        return -1;
    }

    public final int size() {
        Map l = mo122612l();
        if (l != null) {
            return l.size();
        }
        return this.f98390f;
    }

    /* renamed from: t */
    public final int mo122622t(int i, int i2, int i3, int i4) {
        Object d = C38716o0.m160086d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C38716o0.m160087e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f98385a;
        int[] iArr = this.f98386b;
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C38716o0.m160085c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C38716o0.m160085c(d, i10);
                C38716o0.m160087e(d, i10, c);
                iArr[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f98385a = d;
        mo122624v(i5);
        return i5;
    }

    @NullableDecl
    /* renamed from: u */
    public final Object mo122623u(@NullableDecl Object obj) {
        if (mo122617q()) {
            return f98384x;
        }
        int r = mo122618r();
        int b = C38716o0.m160084b(obj, (Object) null, r, this.f98385a, this.f98386b, this.f98387c, (Object[]) null);
        if (b == -1) {
            return f98384x;
        }
        Object obj2 = this.f98388d[b];
        mo122615p(b, r);
        this.f98390f--;
        mo122613n();
        return obj2;
    }

    /* renamed from: v */
    public final void mo122624v(int i) {
        this.f98389e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f98389e & -32);
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f98393w;
        if (collection != null) {
            return collection;
        }
        C38703n0 n0Var = new C38703n0(this);
        this.f98393w = n0Var;
        return n0Var;
    }

    public zzbs(int i) {
        mo122614o(12);
    }
}
