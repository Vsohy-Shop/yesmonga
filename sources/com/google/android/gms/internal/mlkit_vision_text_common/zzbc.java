package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.C12027x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbc<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: x */
    public static final Object f72393x = new Object();
    @NullableDecl

    /* renamed from: a */
    public transient Object f72394a;
    @NullableDecl

    /* renamed from: b */
    public transient int[] f72395b;
    @NullableDecl

    /* renamed from: c */
    public transient Object[] f72396c;
    @NullableDecl

    /* renamed from: d */
    public transient Object[] f72397d;

    /* renamed from: e */
    public transient int f72398e;

    /* renamed from: f */
    public transient int f72399f;
    @NullableDecl

    /* renamed from: g */
    public transient Set<K> f72400g;
    @NullableDecl

    /* renamed from: v */
    public transient Set<Map.Entry<K, V>> f72401v;
    @NullableDecl

    /* renamed from: w */
    public transient Collection<V> f72402w;

    public zzbc() {
        mo85432o(3);
    }

    public final void clear() {
        if (!mo85435q()) {
            mo85431n();
            Map l = mo85430l();
            if (l != null) {
                this.f72398e = C29999b1.m121593a(size(), 3, C12027x.f29642j);
                l.clear();
                this.f72394a = null;
                this.f72399f = 0;
                return;
            }
            Arrays.fill(this.f72396c, 0, this.f72399f, (Object) null);
            Arrays.fill(this.f72397d, 0, this.f72399f, (Object) null);
            Object obj = this.f72394a;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f72395b, 0, this.f72399f, 0);
            this.f72399f = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map l = mo85430l();
        if (l != null) {
            return l.containsKey(obj);
        }
        if (mo85438s(obj) == -1) {
            return false;
        }
        return true;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map l = mo85430l();
        if (l != null) {
            return l.containsValue(obj);
        }
        for (int i = 0; i < this.f72399f; i++) {
            if (C30272xa.m121934a(obj, this.f72397d[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final int mo85424e() {
        return isEmpty() ? -1 : 0;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f72401v;
        if (set != null) {
            return set;
        }
        C30213t tVar = new C30213t(this);
        this.f72401v = tVar;
        return tVar;
    }

    /* renamed from: f */
    public final int mo85426f(int i) {
        int i2 = i + 1;
        if (i2 < this.f72399f) {
            return i2;
        }
        return -1;
    }

    public final V get(@NullableDecl Object obj) {
        Map l = mo85430l();
        if (l != null) {
            return l.get(obj);
        }
        int s = mo85438s(obj);
        if (s == -1) {
            return null;
        }
        return this.f72397d[s];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f72400g;
        if (set != null) {
            return set;
        }
        C30249w wVar = new C30249w(this);
        this.f72400g = wVar;
        return wVar;
    }

    @NullableDecl
    /* renamed from: l */
    public final Map<K, V> mo85430l() {
        Object obj = this.f72394a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: n */
    public final void mo85431n() {
        this.f72398e += 32;
    }

    /* renamed from: o */
    public final void mo85432o(int i) {
        this.f72398e = C29999b1.m121593a(12, 1, C12027x.f29642j);
    }

    /* renamed from: p */
    public final void mo85433p(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f72396c;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f72397d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f72395b;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = C29998b0.m121592a(obj) & i2;
            int c = C29985a0.m121574c(this.f72394a, a);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int[] iArr2 = this.f72395b;
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
                C29985a0.m121576e(this.f72394a, a, i + 1);
            }
        } else {
            this.f72396c[i] = null;
            this.f72397d[i] = null;
            this.f72395b[i] = 0;
        }
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo85435q()) {
            C29997b.m121590d(mo85435q(), "Arrays already allocated");
            int i = this.f72398e;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f72394a = C29985a0.m121575d(max2);
            mo85442v(max2 - 1);
            this.f72395b = new int[i];
            this.f72396c = new Object[i];
            this.f72397d = new Object[i];
        }
        Map l = mo85430l();
        if (l != null) {
            return l.put(k2, v2);
        }
        int[] iArr = this.f72395b;
        Object[] objArr = this.f72396c;
        V[] vArr = this.f72397d;
        int i2 = this.f72399f;
        int i3 = i2 + 1;
        int a = C29998b0.m121592a(k);
        int r = mo85436r();
        int i4 = a & r;
        int c = C29985a0.m121574c(this.f72394a, i4);
        if (c != 0) {
            int i5 = ~r;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !C30272xa.m121934a(k2, objArr[i8])) {
                    int i11 = i9 & r;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mo85436r() + 1, 1.0f);
                        for (int e = mo85424e(); e >= 0; e = mo85426f(e)) {
                            linkedHashMap.put(this.f72396c[e], this.f72397d[e]);
                        }
                        this.f72394a = linkedHashMap;
                        this.f72395b = null;
                        this.f72396c = null;
                        this.f72397d = null;
                        mo85431n();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 > r) {
                        r = mo85440t(r, C29985a0.m121572a(r), a, i2);
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
            r = mo85440t(r, C29985a0.m121572a(r), a, i2);
        } else {
            C29985a0.m121576e(this.f72394a, i4, i3);
        }
        int length = this.f72395b.length;
        if (i3 > length && (min = Math.min(C12027x.f29642j, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f72395b = Arrays.copyOf(this.f72395b, min);
            this.f72396c = Arrays.copyOf(this.f72396c, min);
            this.f72397d = Arrays.copyOf(this.f72397d, min);
        }
        this.f72395b[i2] = (~r) & a;
        this.f72396c[i2] = k2;
        this.f72397d[i2] = v2;
        this.f72399f = i3;
        mo85431n();
        return null;
    }

    /* renamed from: q */
    public final boolean mo85435q() {
        return this.f72394a == null;
    }

    /* renamed from: r */
    public final int mo85436r() {
        return (1 << (this.f72398e & 31)) - 1;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map l = mo85430l();
        if (l != null) {
            return l.remove(obj);
        }
        V u = mo85441u(obj);
        if (u == f72393x) {
            return null;
        }
        return u;
    }

    /* renamed from: s */
    public final int mo85438s(@NullableDecl Object obj) {
        if (mo85435q()) {
            return -1;
        }
        int a = C29998b0.m121592a(obj);
        int r = mo85436r();
        int c = C29985a0.m121574c(this.f72394a, a & r);
        if (c != 0) {
            int i = ~r;
            int i2 = a & i;
            do {
                int i3 = c - 1;
                int i4 = this.f72395b[i3];
                if ((i4 & i) == i2 && C30272xa.m121934a(obj, this.f72396c[i3])) {
                    return i3;
                }
                c = i4 & r;
            } while (c != 0);
        }
        return -1;
    }

    public final int size() {
        Map l = mo85430l();
        if (l != null) {
            return l.size();
        }
        return this.f72399f;
    }

    /* renamed from: t */
    public final int mo85440t(int i, int i2, int i3, int i4) {
        Object d = C29985a0.m121575d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C29985a0.m121576e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f72394a;
        int[] iArr = this.f72395b;
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C29985a0.m121574c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C29985a0.m121574c(d, i10);
                C29985a0.m121576e(d, i10, c);
                iArr[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f72394a = d;
        mo85442v(i5);
        return i5;
    }

    @NullableDecl
    /* renamed from: u */
    public final Object mo85441u(@NullableDecl Object obj) {
        if (mo85435q()) {
            return f72393x;
        }
        int r = mo85436r();
        int b = C29985a0.m121573b(obj, (Object) null, r, this.f72394a, this.f72395b, this.f72396c, (Object[]) null);
        if (b == -1) {
            return f72393x;
        }
        Object obj2 = this.f72397d[b];
        mo85433p(b, r);
        this.f72399f--;
        mo85431n();
        return obj2;
    }

    /* renamed from: v */
    public final void mo85442v(int i) {
        this.f72398e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f72398e & -32);
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f72402w;
        if (collection != null) {
            return collection;
        }
        C30285z zVar = new C30285z(this);
        this.f72402w = zVar;
        return zVar;
    }

    public zzbc(int i) {
        mo85432o(12);
    }
}
