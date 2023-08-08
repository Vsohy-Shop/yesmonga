package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.jb */
public class C14449jb extends C14240c3<String> implements C14308ec, RandomAccess {

    /* renamed from: c */
    public static final C14449jb f35690c;

    /* renamed from: d */
    public static final C14308ec f35691d;

    /* renamed from: b */
    public final List<Object> f35692b;

    static {
        C14449jb jbVar = new C14449jb();
        f35690c = jbVar;
        jbVar.mo34819c();
        f35691d = jbVar;
    }

    public C14449jb() {
        this(10);
    }

    /* renamed from: h */
    public static String m62213h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C14719t0 ? ((C14719t0) obj).mo36440r0() : C14566o3.m62808j((byte[]) obj);
    }

    /* renamed from: E */
    public Object mo35077E(int i) {
        return this.f35692b.get(i);
    }

    /* renamed from: a */
    public C14308ec mo35078a() {
        return mo34822p() ? new C14390h3(this) : this;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo34821e();
        if (collection instanceof C14308ec) {
            collection = ((C14308ec) collection).mo35079b();
        }
        boolean addAll = this.f35692b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        mo34821e();
        this.f35692b.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public void add(int i, String str) {
        mo34821e();
        this.f35692b.add(i, str);
        this.modCount++;
    }

    /* renamed from: k */
    public String set(int i, String str) {
        mo34821e();
        return m62213h(this.f35692b.set(i, str));
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo34822p() {
        return super.mo34822p();
    }

    /* renamed from: q */
    public String get(int i) {
        Object obj = this.f35692b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C14719t0) {
            C14719t0 t0Var = (C14719t0) obj;
            String r0 = t0Var.mo36440r0();
            if (t0Var.mo36434l0()) {
                this.f35692b.set(i, r0);
            }
            return r0;
        }
        byte[] bArr = (byte[]) obj;
        String j = C14566o3.m62808j(bArr);
        if (C14566o3.m62807i(bArr)) {
            this.f35692b.set(i, j);
        }
        return j;
    }

    /* renamed from: q0 */
    public void mo35080q0(C14719t0 t0Var) {
        mo34821e();
        this.f35692b.add(t0Var);
        this.modCount++;
    }

    /* renamed from: r */
    public C14449jb mo34508b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f35692b);
            return new C14449jb((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f35692b.size();
    }

    /* renamed from: w */
    public String remove(int i) {
        mo34821e();
        Object remove = this.f35692b.remove(i);
        this.modCount++;
        return m62213h(remove);
    }

    public C14449jb(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public List<?> mo35079b() {
        return Collections.unmodifiableList(this.f35692b);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C14449jb(ArrayList<Object> arrayList) {
        this.f35692b = arrayList;
    }
}
