package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.annotation.experimental.C0335b;
import androidx.camera.core.impl.C1505t0;
import androidx.camera.core.impl.CameraInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: androidx.camera.core.n */
public final class C1647n {

    /* renamed from: b */
    public static final int f4602b = 0;

    /* renamed from: c */
    public static final int f4603c = 1;
    @C0359n0

    /* renamed from: d */
    public static final C1647n f4604d = new C1648a().mo5638d(0).mo5637b();
    @C0359n0

    /* renamed from: e */
    public static final C1647n f4605e = new C1648a().mo5638d(1).mo5637b();

    /* renamed from: a */
    public LinkedHashSet<C1635l> f4606a;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.n$b */
    public @interface C1649b {
    }

    public C1647n(LinkedHashSet<C1635l> linkedHashSet) {
        this.f4606a = linkedHashSet;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: a */
    public LinkedHashSet<CameraInternal> mo5631a(@C0359n0 LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo5121c());
        }
        List<C1641m> b = mo5632b(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal next = it2.next();
            if (b.contains(next.mo5121c())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0335b(markerClass = C1399f0.class)
    @C0359n0
    /* renamed from: b */
    public List<C1641m> mo5632b(@C0359n0 List<C1641m> list) {
        ArrayList arrayList = new ArrayList(list);
        List<C1641m> arrayList2 = new ArrayList<>(list);
        Iterator<C1635l> it = this.f4606a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().mo4754a(Collections.unmodifiableList(arrayList2));
            if (arrayList2.isEmpty()) {
                throw new IllegalArgumentException("No available camera can be found.");
            } else if (arrayList.containsAll(arrayList2)) {
                arrayList.retainAll(arrayList2);
            } else {
                throw new IllegalArgumentException("The output isn't contained in the input.");
            }
        }
        return arrayList2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public LinkedHashSet<C1635l> mo5633c() {
        return this.f4606a;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0335b(markerClass = C1399f0.class)
    /* renamed from: d */
    public Integer mo5634d() {
        Iterator<C1635l> it = this.f4606a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C1635l next = it.next();
            if (next instanceof C1505t0) {
                Integer valueOf = Integer.valueOf(((C1505t0) next).mo5324b());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: e */
    public CameraInternal mo5635e(@C0359n0 LinkedHashSet<CameraInternal> linkedHashSet) {
        return mo5631a(linkedHashSet).iterator().next();
    }

    /* renamed from: androidx.camera.core.n$a */
    public static final class C1648a {

        /* renamed from: a */
        public final LinkedHashSet<C1635l> f4607a;

        public C1648a() {
            this.f4607a = new LinkedHashSet<>();
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: c */
        public static C1648a m6734c(@C0359n0 C1647n nVar) {
            return new C1648a(nVar.mo5633c());
        }

        @C1399f0
        @C0359n0
        /* renamed from: a */
        public C1648a mo5636a(@C0359n0 C1635l lVar) {
            this.f4607a.add(lVar);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C1647n mo5637b() {
            return new C1647n(this.f4607a);
        }

        @C0359n0
        @C0335b(markerClass = C1399f0.class)
        /* renamed from: d */
        public C1648a mo5638d(int i) {
            this.f4607a.add(new C1505t0(i));
            return this;
        }

        public C1648a(@C0359n0 LinkedHashSet<C1635l> linkedHashSet) {
            this.f4607a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
