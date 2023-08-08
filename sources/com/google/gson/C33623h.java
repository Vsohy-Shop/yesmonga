package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.h */
public final class C33623h extends C33699k implements Iterable<C33699k> {

    /* renamed from: a */
    public final List<C33699k> f81817a;

    public C33623h() {
        this.f81817a = new ArrayList();
    }

    /* renamed from: A */
    public float mo97528A() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97528A();
        }
        throw new IllegalStateException();
    }

    /* renamed from: H */
    public int mo97529H() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97529H();
        }
        throw new IllegalStateException();
    }

    /* renamed from: Y */
    public long mo97530Y() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97530Y();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e0 */
    public Number mo97532e0() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97532e0();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C33623h) && ((C33623h) obj).f81817a.equals(this.f81817a));
    }

    /* renamed from: f0 */
    public short mo97534f0() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97534f0();
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public BigDecimal mo97535h() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97535h();
        }
        throw new IllegalStateException();
    }

    /* renamed from: h0 */
    public String mo97536h0() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97536h0();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f81817a.hashCode();
    }

    /* renamed from: i */
    public BigInteger mo97538i() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97538i();
        }
        throw new IllegalStateException();
    }

    public Iterator<C33699k> iterator() {
        return this.f81817a.iterator();
    }

    /* renamed from: k */
    public boolean mo97540k() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97540k();
        }
        throw new IllegalStateException();
    }

    /* renamed from: m0 */
    public void mo97541m0(C33699k kVar) {
        if (kVar == null) {
            kVar = C33700l.f81818a;
        }
        this.f81817a.add(kVar);
    }

    /* renamed from: n0 */
    public void mo97542n0(Boolean bool) {
        this.f81817a.add(bool == null ? C33700l.f81818a : new C33703o(bool));
    }

    /* renamed from: o0 */
    public void mo97543o0(Character ch) {
        this.f81817a.add(ch == null ? C33700l.f81818a : new C33703o(ch));
    }

    /* renamed from: p0 */
    public void mo97544p0(Number number) {
        this.f81817a.add(number == null ? C33700l.f81818a : new C33703o(number));
    }

    /* renamed from: r */
    public byte mo97545r() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97545r();
        }
        throw new IllegalStateException();
    }

    /* renamed from: r0 */
    public void mo97546r0(String str) {
        this.f81817a.add(str == null ? C33700l.f81818a : new C33703o(str));
    }

    /* renamed from: s0 */
    public void mo97547s0(C33623h hVar) {
        this.f81817a.addAll(hVar.f81817a);
    }

    public int size() {
        return this.f81817a.size();
    }

    /* renamed from: t0 */
    public boolean mo97549t0(C33699k kVar) {
        return this.f81817a.contains(kVar);
    }

    /* renamed from: u0 */
    public C33623h mo97531e() {
        if (this.f81817a.isEmpty()) {
            return new C33623h();
        }
        C33623h hVar = new C33623h(this.f81817a.size());
        for (C33699k e : this.f81817a) {
            hVar.mo97541m0(e.mo97531e());
        }
        return hVar;
    }

    /* renamed from: v0 */
    public C33699k mo97551v0(int i) {
        return this.f81817a.get(i);
    }

    /* renamed from: w */
    public char mo97552w() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97552w();
        }
        throw new IllegalStateException();
    }

    /* renamed from: w0 */
    public C33699k mo97553w0(int i) {
        return this.f81817a.remove(i);
    }

    /* renamed from: y */
    public double mo97554y() {
        if (this.f81817a.size() == 1) {
            return this.f81817a.get(0).mo97554y();
        }
        throw new IllegalStateException();
    }

    /* renamed from: y0 */
    public boolean mo97555y0(C33699k kVar) {
        return this.f81817a.remove(kVar);
    }

    /* renamed from: z0 */
    public C33699k mo97556z0(int i, C33699k kVar) {
        return this.f81817a.set(i, kVar);
    }

    public C33623h(int i) {
        this.f81817a = new ArrayList(i);
    }
}
