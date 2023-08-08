package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.da */
public final class C41914da extends C41966g8 implements RandomAccess, C41932ea {

    /* renamed from: c */
    public static final C41914da f106077c;
    @Deprecated

    /* renamed from: d */
    public static final C41932ea f106078d;

    /* renamed from: b */
    public final List f106079b;

    static {
        C41914da daVar = new C41914da(false);
        f106077c = daVar;
        f106078d = daVar;
    }

    public C41914da() {
        this(10);
    }

    /* renamed from: i */
    public static String m169779i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            return ((zzka) obj).mo137601Q(C41860aa.f105996b);
        }
        return C41860aa.m169669d((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo136872e();
        this.f106079b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo136872e();
        if (collection instanceof C41932ea) {
            collection = ((C41932ea) collection).mo136696j();
        }
        boolean addAll = this.f106079b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo136872e();
        this.f106079b.clear();
        this.modCount++;
    }

    /* renamed from: f */
    public final C41932ea mo136693f() {
        return mo136871d() ? new C41916dc(this) : this;
    }

    /* renamed from: h */
    public final String get(int i) {
        Object obj = this.f106079b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            zzka zzka = (zzka) obj;
            String Q = zzka.mo137601Q(C41860aa.f105996b);
            if (zzka.mo137599y()) {
                this.f106079b.set(i, Q);
            }
            return Q;
        }
        byte[] bArr = (byte[]) obj;
        String d = C41860aa.m169669d(bArr);
        if (C42078mc.m170568d(bArr)) {
            this.f106079b.set(i, d);
        }
        return d;
    }

    /* renamed from: j */
    public final List mo136696j() {
        return Collections.unmodifiableList(this.f106079b);
    }

    /* renamed from: j2 */
    public final void mo136697j2(zzka zzka) {
        mo136872e();
        this.f106079b.add(zzka);
        this.modCount++;
    }

    /* renamed from: m */
    public final Object mo136698m(int i) {
        return this.f106079b.get(i);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C42296z9 mo136618n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f106079b);
            return new C41914da(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136872e();
        Object remove = this.f106079b.remove(i);
        this.modCount++;
        return m169779i(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo136872e();
        return m169779i(this.f106079b.set(i, (String) obj));
    }

    public final int size() {
        return this.f106079b.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41914da(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f106079b = arrayList;
    }

    public C41914da(ArrayList arrayList) {
        super(true);
        this.f106079b = arrayList;
    }

    public C41914da(boolean z) {
        super(false);
        this.f106079b = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
