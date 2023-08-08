package androidx.camera.core.internal;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.core.C1394e4;
import androidx.camera.core.C1399f0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1631k0;
import androidx.camera.core.C1641m;
import androidx.camera.core.C1647n;
import androidx.camera.core.CameraControl;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1464j;
import androidx.camera.core.impl.C1468k;
import androidx.camera.core.impl.C1473l;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1496q;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.core.util.C18001r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class CameraUseCaseAdapter implements C1624j {

    /* renamed from: z */
    public static final String f4511z = "CameraUseCaseAdapter";
    @C0359n0

    /* renamed from: a */
    public CameraInternal f4512a;

    /* renamed from: b */
    public final LinkedHashSet<CameraInternal> f4513b;

    /* renamed from: c */
    public final C1473l f4514c;

    /* renamed from: d */
    public final UseCaseConfigFactory f4515d;

    /* renamed from: e */
    public final C1589a f4516e;
    @C0323b0("mLock")

    /* renamed from: f */
    public final List<UseCase> f4517f = new ArrayList();
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: g */
    public C1394e4 f4518g;
    @C0323b0("mLock")
    @C0359n0

    /* renamed from: v */
    public C1464j f4519v = C1468k.m6156a();

    /* renamed from: w */
    public final Object f4520w = new Object();
    @C0323b0("mLock")

    /* renamed from: x */
    public boolean f4521x = true;
    @C0323b0("mLock")

    /* renamed from: y */
    public Config f4522y = null;

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(@C0359n0 String str) {
            super(str);
        }

        public CameraException(@C0359n0 Throwable th) {
            super(th);
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$a */
    public static final class C1589a {

        /* renamed from: a */
        public final List<String> f4523a = new ArrayList();

        public C1589a(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f4523a.add(it.next().mo4139l().mo4592b());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1589a) {
                return this.f4523a.equals(((C1589a) obj).f4523a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4523a.hashCode() * 53;
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$b */
    public static class C1590b {

        /* renamed from: a */
        public C1488o1<?> f4524a;

        /* renamed from: b */
        public C1488o1<?> f4525b;

        public C1590b(C1488o1<?> o1Var, C1488o1<?> o1Var2) {
            this.f4524a = o1Var;
            this.f4525b = o1Var2;
        }
    }

    public CameraUseCaseAdapter(@C0359n0 LinkedHashSet<CameraInternal> linkedHashSet, @C0359n0 C1473l lVar, @C0359n0 UseCaseConfigFactory useCaseConfigFactory) {
        this.f4512a = linkedHashSet.iterator().next();
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f4513b = linkedHashSet2;
        this.f4516e = new C1589a(linkedHashSet2);
        this.f4514c = lVar;
        this.f4515d = useCaseConfigFactory;
    }

    @C0359n0
    /* renamed from: q */
    public static C1589a m6585q(@C0359n0 LinkedHashSet<CameraInternal> linkedHashSet) {
        return new C1589a(linkedHashSet);
    }

    @C0359n0
    /* renamed from: a */
    public CameraControl mo5119a() {
        return this.f4512a.mo4133h();
    }

    @C0359n0
    /* renamed from: b */
    public C1464j mo5120b() {
        C1464j jVar;
        synchronized (this.f4520w) {
            jVar = this.f4519v;
        }
        return jVar;
    }

    @C0359n0
    /* renamed from: c */
    public C1641m mo5121c() {
        return this.f4512a.mo4139l();
    }

    @C0335b(markerClass = C1399f0.class)
    /* renamed from: d */
    public void mo5122d(@C0363p0 C1464j jVar) throws CameraException {
        synchronized (this.f4520w) {
            if (jVar == null) {
                try {
                    jVar = C1468k.m6156a();
                } catch (IllegalArgumentException e) {
                    throw new CameraException(e.getMessage());
                } catch (Throwable th) {
                    throw th;
                }
            }
            CameraInternal e2 = new C1647n.C1648a().mo5636a(jVar.mo5231l()).mo5637b().mo5635e(this.f4513b);
            Map<UseCase, C1590b> s = mo5583s(this.f4517f, jVar.mo5230k(), this.f4515d);
            Map<UseCase, Size> n = mo5579n(e2.mo4139l(), this.f4517f, Collections.emptyList(), s);
            mo5589y(n, this.f4517f);
            if (this.f4521x) {
                this.f4512a.mo4137k(this.f4517f);
            }
            for (UseCase y : this.f4517f) {
                y.mo4970y(this.f4512a);
            }
            for (UseCase next : this.f4517f) {
                C1590b bVar = s.get(next);
                next.mo4969v(e2, bVar.f4524a, bVar.f4525b);
                next.mo4949I((Size) C18001r.m81775l(n.get(next)));
            }
            if (this.f4521x) {
                e2.mo4135j(this.f4517f);
            }
            for (UseCase t : this.f4517f) {
                t.mo4967t();
            }
            this.f4512a = e2;
            this.f4519v = jVar;
        }
    }

    @C0359n0
    /* renamed from: e */
    public LinkedHashSet<CameraInternal> mo5123e() {
        return this.f4513b;
    }

    @C0335b(markerClass = C1631k0.class)
    /* renamed from: f */
    public void mo5576f(@C0359n0 Collection<UseCase> collection) throws CameraException {
        synchronized (this.f4520w) {
            ArrayList<UseCase> arrayList = new ArrayList<>();
            for (UseCase next : collection) {
                if (this.f4517f.contains(next)) {
                    C1417i2.m5911a(f4511z, "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(next);
                }
            }
            Map<UseCase, C1590b> s = mo5583s(arrayList, this.f4519v.mo5230k(), this.f4515d);
            try {
                Map<UseCase, Size> n = mo5579n(this.f4512a.mo4139l(), arrayList, this.f4517f, s);
                mo5589y(n, collection);
                for (UseCase useCase : arrayList) {
                    C1590b bVar = s.get(useCase);
                    useCase.mo4969v(this.f4512a, bVar.f4524a, bVar.f4525b);
                    useCase.mo4949I((Size) C18001r.m81775l(n.get(useCase)));
                }
                this.f4517f.addAll(arrayList);
                if (this.f4521x) {
                    this.f4512a.mo4135j(arrayList);
                }
                for (UseCase t : arrayList) {
                    t.mo4967t();
                }
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            }
        }
    }

    /* renamed from: g */
    public void mo5577g() {
        synchronized (this.f4520w) {
            if (!this.f4521x) {
                this.f4512a.mo4135j(this.f4517f);
                mo5587w();
                for (UseCase t : this.f4517f) {
                    t.mo4967t();
                }
                this.f4521x = true;
            }
        }
    }

    /* renamed from: i */
    public final void mo5578i() {
        synchronized (this.f4520w) {
            CameraControlInternal h = this.f4512a.mo4133h();
            this.f4522y = h.mo4684i();
            h.mo4696o();
        }
    }

    /* renamed from: n */
    public final Map<UseCase, Size> mo5579n(@C0359n0 C1496q qVar, @C0359n0 List<UseCase> list, @C0359n0 List<UseCase> list2, @C0359n0 Map<UseCase, C1590b> map) {
        ArrayList arrayList = new ArrayList();
        String b = qVar.mo4592b();
        HashMap hashMap = new HashMap();
        for (UseCase next : list2) {
            arrayList.add(this.f4514c.mo4704a(b, next.mo4956h(), next.mo4951b()));
            hashMap.put(next, next.mo4951b());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (UseCase next2 : list) {
                C1590b bVar = map.get(next2);
                hashMap2.put(next2.mo4963p(qVar, bVar.f4524a, bVar.f4525b), next2);
            }
            Map<C1488o1<?>, Size> c = this.f4514c.mo4706c(b, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((UseCase) entry.getValue(), c.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    /* renamed from: o */
    public void mo5580o(@C0359n0 List<UseCase> list) throws CameraException {
        synchronized (this.f4520w) {
            try {
                mo5579n(this.f4512a.mo4139l(), list, Collections.emptyList(), mo5583s(list, this.f4519v.mo5230k(), this.f4515d));
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public void mo5581p() {
        synchronized (this.f4520w) {
            if (this.f4521x) {
                mo5578i();
                this.f4512a.mo4137k(new ArrayList(this.f4517f));
                this.f4521x = false;
            }
        }
    }

    @C0359n0
    /* renamed from: r */
    public C1589a mo5582r() {
        return this.f4516e;
    }

    /* renamed from: s */
    public final Map<UseCase, C1590b> mo5583s(List<UseCase> list, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap hashMap = new HashMap();
        for (UseCase next : list) {
            hashMap.put(next, new C1590b(next.mo4801g(false, useCaseConfigFactory), next.mo4801g(true, useCaseConfigFactory2)));
        }
        return hashMap;
    }

    @C0359n0
    /* renamed from: t */
    public List<UseCase> mo5584t() {
        ArrayList arrayList;
        synchronized (this.f4520w) {
            arrayList = new ArrayList(this.f4517f);
        }
        return arrayList;
    }

    /* renamed from: u */
    public boolean mo5585u(@C0359n0 CameraUseCaseAdapter cameraUseCaseAdapter) {
        return this.f4516e.equals(cameraUseCaseAdapter.mo5582r());
    }

    /* renamed from: v */
    public void mo5586v(@C0359n0 Collection<UseCase> collection) {
        synchronized (this.f4520w) {
            this.f4512a.mo4137k(collection);
            for (UseCase next : collection) {
                if (this.f4517f.contains(next)) {
                    next.mo4970y(this.f4512a);
                } else {
                    C1417i2.m5913c(f4511z, "Attempting to detach non-attached UseCase: " + next);
                }
            }
            this.f4517f.removeAll(collection);
        }
    }

    /* renamed from: w */
    public final void mo5587w() {
        synchronized (this.f4520w) {
            if (this.f4522y != null) {
                this.f4512a.mo4133h().mo4688k(this.f4522y);
            }
        }
    }

    /* renamed from: x */
    public void mo5588x(@C0363p0 C1394e4 e4Var) {
        synchronized (this.f4520w) {
            this.f4518g = e4Var;
        }
    }

    @C0335b(markerClass = C1631k0.class)
    /* renamed from: y */
    public final void mo5589y(@C0359n0 Map<UseCase, Size> map, @C0359n0 Collection<UseCase> collection) {
        boolean z;
        synchronized (this.f4520w) {
            if (this.f4518g != null) {
                if (this.f4512a.mo4139l().mo4594d().intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Map<UseCase, Rect> a = C1617h.m6648a(this.f4512a.mo4133h().mo4680f(), z, this.f4518g.mo5090a(), this.f4512a.mo4139l().mo4601k(this.f4518g.mo5092c()), this.f4518g.mo5093d(), this.f4518g.mo5091b(), map);
                for (UseCase next : collection) {
                    next.mo4947G((Rect) C18001r.m81775l(a.get(next)));
                }
            }
        }
    }
}
