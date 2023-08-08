package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.gson.m */
public final class C33701m extends C33699k {

    /* renamed from: a */
    public final LinkedTreeMap<String, C33699k> f81819a = new LinkedTreeMap<>();

    /* renamed from: A0 */
    public boolean mo97781A0(String str) {
        return this.f81819a.containsKey(str);
    }

    /* renamed from: B0 */
    public Set<String> mo97782B0() {
        return this.f81819a.keySet();
    }

    /* renamed from: C0 */
    public C33699k mo97783C0(String str) {
        return this.f81819a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C33701m) && ((C33701m) obj).f81819a.equals(this.f81819a))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f81819a.hashCode();
    }

    /* renamed from: m0 */
    public void mo97786m0(String str, C33699k kVar) {
        if (kVar == null) {
            kVar = C33700l.f81818a;
        }
        this.f81819a.put(str, kVar);
    }

    /* renamed from: n0 */
    public void mo97787n0(String str, Boolean bool) {
        mo97786m0(str, mo97791s0(bool));
    }

    /* renamed from: o0 */
    public void mo97788o0(String str, Character ch) {
        mo97786m0(str, mo97791s0(ch));
    }

    /* renamed from: p0 */
    public void mo97789p0(String str, Number number) {
        mo97786m0(str, mo97791s0(number));
    }

    /* renamed from: r0 */
    public void mo97790r0(String str, String str2) {
        mo97786m0(str, mo97791s0(str2));
    }

    /* renamed from: s0 */
    public final C33699k mo97791s0(Object obj) {
        return obj == null ? C33700l.f81818a : new C33703o(obj);
    }

    public int size() {
        return this.f81819a.size();
    }

    /* renamed from: t0 */
    public C33701m mo97531e() {
        C33701m mVar = new C33701m();
        for (Map.Entry next : this.f81819a.entrySet()) {
            mVar.mo97786m0((String) next.getKey(), ((C33699k) next.getValue()).mo97531e());
        }
        return mVar;
    }

    /* renamed from: u0 */
    public Set<Map.Entry<String, C33699k>> mo97794u0() {
        return this.f81819a.entrySet();
    }

    /* renamed from: v0 */
    public C33699k mo97795v0(String str) {
        return this.f81819a.get(str);
    }

    /* renamed from: w0 */
    public C33623h mo97796w0(String str) {
        return (C33623h) this.f81819a.get(str);
    }

    /* renamed from: y0 */
    public C33701m mo97797y0(String str) {
        return (C33701m) this.f81819a.get(str);
    }

    /* renamed from: z0 */
    public C33703o mo97798z0(String str) {
        return (C33703o) this.f81819a.get(str);
    }
}
