package androidx.recyclerview.widget;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.j */
public class C20157j {

    /* renamed from: a */
    public static final Comparator<C20161d> f51889a = new C20158a();

    /* renamed from: androidx.recyclerview.widget.j$a */
    public class C20158a implements Comparator<C20161d> {
        /* renamed from: a */
        public int compare(C20161d dVar, C20161d dVar2) {
            return dVar.f51892a - dVar2.f51892a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    public static abstract class C20159b {
        /* renamed from: a */
        public abstract boolean mo59153a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo59154b(int i, int i2);

        @C0363p0
        /* renamed from: c */
        public Object mo60270c(int i, int i2) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo59155d();

        /* renamed from: e */
        public abstract int mo59156e();
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    public static class C20160c {

        /* renamed from: a */
        public final int[] f51890a;

        /* renamed from: b */
        public final int f51891b;

        public C20160c(int i) {
            int[] iArr = new int[i];
            this.f51890a = iArr;
            this.f51891b = iArr.length / 2;
        }

        /* renamed from: a */
        public int[] mo60463a() {
            return this.f51890a;
        }

        /* renamed from: b */
        public void mo60464b(int i) {
            Arrays.fill(this.f51890a, i);
        }

        /* renamed from: c */
        public int mo60465c(int i) {
            return this.f51890a[i + this.f51891b];
        }

        /* renamed from: d */
        public void mo60466d(int i, int i2) {
            this.f51890a[i + this.f51891b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    public static class C20161d {

        /* renamed from: a */
        public final int f51892a;

        /* renamed from: b */
        public final int f51893b;

        /* renamed from: c */
        public final int f51894c;

        public C20161d(int i, int i2, int i3) {
            this.f51892a = i;
            this.f51893b = i2;
            this.f51894c = i3;
        }

        /* renamed from: a */
        public int mo60467a() {
            return this.f51892a + this.f51894c;
        }

        /* renamed from: b */
        public int mo60468b() {
            return this.f51893b + this.f51894c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$e */
    public static class C20162e {

        /* renamed from: h */
        public static final int f51895h = -1;

        /* renamed from: i */
        public static final int f51896i = 1;

        /* renamed from: j */
        public static final int f51897j = 2;

        /* renamed from: k */
        public static final int f51898k = 4;

        /* renamed from: l */
        public static final int f51899l = 8;

        /* renamed from: m */
        public static final int f51900m = 12;

        /* renamed from: n */
        public static final int f51901n = 4;

        /* renamed from: o */
        public static final int f51902o = 15;

        /* renamed from: a */
        public final List<C20161d> f51903a;

        /* renamed from: b */
        public final int[] f51904b;

        /* renamed from: c */
        public final int[] f51905c;

        /* renamed from: d */
        public final C20159b f51906d;

        /* renamed from: e */
        public final int f51907e;

        /* renamed from: f */
        public final int f51908f;

        /* renamed from: g */
        public final boolean f51909g;

        public C20162e(C20159b bVar, List<C20161d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f51903a = list;
            this.f51904b = iArr;
            this.f51905c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f51906d = bVar;
            this.f51907e = bVar.mo59156e();
            this.f51908f = bVar.mo59155d();
            this.f51909g = z;
            mo60469a();
            mo60475g();
        }

        @C0363p0
        /* renamed from: i */
        public static C20164g m94288i(Collection<C20164g> collection, int i, boolean z) {
            C20164g gVar;
            Iterator<C20164g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f51910a == i && gVar.f51912c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C20164g next = it.next();
                if (z) {
                    next.f51911b--;
                } else {
                    next.f51911b++;
                }
            }
            return gVar;
        }

        /* renamed from: a */
        public final void mo60469a() {
            C20161d dVar;
            if (this.f51903a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.f51903a.get(0);
            }
            if (!(dVar != null && dVar.f51892a == 0 && dVar.f51893b == 0)) {
                this.f51903a.add(0, new C20161d(0, 0, 0));
            }
            this.f51903a.add(new C20161d(this.f51907e, this.f51908f, 0));
        }

        /* renamed from: b */
        public int mo60470b(@C0337f0(from = 0) int i) {
            if (i < 0 || i >= this.f51908f) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.f51908f);
            }
            int i2 = this.f51905c[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        /* renamed from: c */
        public int mo60471c(@C0337f0(from = 0) int i) {
            if (i < 0 || i >= this.f51907e) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f51907e);
            }
            int i2 = this.f51904b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        /* renamed from: d */
        public void mo60472d(@C0359n0 C20211u uVar) {
            C20126f fVar;
            int i;
            if (uVar instanceof C20126f) {
                fVar = (C20126f) uVar;
            } else {
                fVar = new C20126f(uVar);
            }
            int i2 = this.f51907e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f51907e;
            int i4 = this.f51908f;
            for (int size = this.f51903a.size() - 1; size >= 0; size--) {
                C20161d dVar = this.f51903a.get(size);
                int a = dVar.mo60467a();
                int b = dVar.mo60468b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f51904b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C20164g i7 = m94288i(arrayDeque, i6, false);
                        if (i7 != null) {
                            int i8 = (i2 - i7.f51911b) - 1;
                            fVar.mo60233d(i3, i8);
                            if ((i5 & 4) != 0) {
                                fVar.mo60232c(i8, 1, this.f51906d.mo60270c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C20164g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        fVar.mo60231b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i9 = this.f51905c[i4];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        C20164g i11 = m94288i(arrayDeque, i10, true);
                        if (i11 == null) {
                            arrayDeque.add(new C20164g(i4, i2 - i3, false));
                        } else {
                            fVar.mo60233d((i2 - i11.f51911b) - 1, i3);
                            if ((i9 & 4) != 0) {
                                fVar.mo60232c(i3, 1, this.f51906d.mo60270c(i10, i4));
                            }
                        }
                    } else {
                        fVar.mo60230a(i3, 1);
                        i2++;
                    }
                }
                int i12 = dVar.f51892a;
                int i13 = dVar.f51893b;
                for (i = 0; i < dVar.f51894c; i++) {
                    if ((this.f51904b[i12] & 15) == 2) {
                        fVar.mo60232c(i12, 1, this.f51906d.mo60270c(i12, i13));
                    }
                    i12++;
                    i13++;
                }
                i3 = dVar.f51892a;
                i4 = dVar.f51893b;
            }
            fVar.mo60356e();
        }

        /* renamed from: e */
        public void mo60473e(@C0359n0 RecyclerView.Adapter adapter) {
            mo60472d(new C20104b(adapter));
        }

        /* renamed from: f */
        public final void mo60474f(int i) {
            int i2;
            int size = this.f51903a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C20161d dVar = this.f51903a.get(i4);
                while (i3 < dVar.f51893b) {
                    if (this.f51905c[i3] != 0 || !this.f51906d.mo59154b(i, i3)) {
                        i3++;
                    } else {
                        if (this.f51906d.mo59153a(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f51904b[i] = (i3 << 4) | i2;
                        this.f51905c[i3] = (i << 4) | i2;
                        return;
                    }
                }
                i3 = dVar.mo60468b();
            }
        }

        /* renamed from: g */
        public final void mo60475g() {
            int i;
            for (C20161d next : this.f51903a) {
                for (int i2 = 0; i2 < next.f51894c; i2++) {
                    int i3 = next.f51892a + i2;
                    int i4 = next.f51893b + i2;
                    if (this.f51906d.mo59153a(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f51904b[i3] = (i4 << 4) | i;
                    this.f51905c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f51909g) {
                mo60476h();
            }
        }

        /* renamed from: h */
        public final void mo60476h() {
            int i = 0;
            for (C20161d next : this.f51903a) {
                while (i < next.f51892a) {
                    if (this.f51904b[i] == 0) {
                        mo60474f(i);
                    }
                    i++;
                }
                i = next.mo60467a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$f */
    public static abstract class C20163f<T> {
        /* renamed from: a */
        public abstract boolean mo60477a(@C0359n0 T t, @C0359n0 T t2);

        /* renamed from: b */
        public abstract boolean mo60478b(@C0359n0 T t, @C0359n0 T t2);

        @C0363p0
        /* renamed from: c */
        public Object mo60479c(@C0359n0 T t, @C0359n0 T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$g */
    public static class C20164g {

        /* renamed from: a */
        public int f51910a;

        /* renamed from: b */
        public int f51911b;

        /* renamed from: c */
        public boolean f51912c;

        public C20164g(int i, int i2, boolean z) {
            this.f51910a = i;
            this.f51911b = i2;
            this.f51912c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$h */
    public static class C20165h {

        /* renamed from: a */
        public int f51913a;

        /* renamed from: b */
        public int f51914b;

        /* renamed from: c */
        public int f51915c;

        /* renamed from: d */
        public int f51916d;

        public C20165h() {
        }

        /* renamed from: a */
        public int mo60480a() {
            return this.f51916d - this.f51915c;
        }

        /* renamed from: b */
        public int mo60481b() {
            return this.f51914b - this.f51913a;
        }

        public C20165h(int i, int i2, int i3, int i4) {
            this.f51913a = i;
            this.f51914b = i2;
            this.f51915c = i3;
            this.f51916d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$i */
    public static class C20166i {

        /* renamed from: a */
        public int f51917a;

        /* renamed from: b */
        public int f51918b;

        /* renamed from: c */
        public int f51919c;

        /* renamed from: d */
        public int f51920d;

        /* renamed from: e */
        public boolean f51921e;

        /* renamed from: a */
        public int mo60482a() {
            return Math.min(this.f51919c - this.f51917a, this.f51920d - this.f51918b);
        }

        /* renamed from: b */
        public boolean mo60483b() {
            return this.f51920d - this.f51918b != this.f51919c - this.f51917a;
        }

        /* renamed from: c */
        public boolean mo60484c() {
            return this.f51920d - this.f51918b > this.f51919c - this.f51917a;
        }

        @C0359n0
        /* renamed from: d */
        public C20161d mo60485d() {
            if (!mo60483b()) {
                int i = this.f51917a;
                return new C20161d(i, this.f51918b, this.f51919c - i);
            } else if (this.f51921e) {
                return new C20161d(this.f51917a, this.f51918b, mo60482a());
            } else {
                if (mo60484c()) {
                    return new C20161d(this.f51917a, this.f51918b + 1, mo60482a());
                }
                return new C20161d(this.f51917a + 1, this.f51918b, mo60482a());
            }
        }
    }

    @C0363p0
    /* renamed from: a */
    public static C20166i m94271a(C20165h hVar, C20159b bVar, C20160c cVar, C20160c cVar2, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if ((hVar.mo60481b() - hVar.mo60480a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int b = hVar.mo60481b() - hVar.mo60480a();
        int i6 = -i;
        int i7 = i6;
        while (i7 <= i) {
            if (i7 == i6 || (i7 != i && cVar2.mo60465c(i7 + 1) < cVar2.mo60465c(i7 - 1))) {
                i3 = cVar2.mo60465c(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar2.mo60465c(i7 - 1);
                i2 = i3 - 1;
            }
            int i8 = hVar.f51916d - ((hVar.f51914b - i2) - i7);
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 + 1;
            }
            while (i2 > hVar.f51913a && i8 > hVar.f51915c && bVar.mo59154b(i2 - 1, i8 - 1)) {
                i2--;
                i8--;
            }
            cVar2.mo60466d(i7, i2);
            if (!z || (i5 = b - i7) < i6 || i5 > i || cVar.mo60465c(i5) < i2) {
                i7 += 2;
            } else {
                C20166i iVar = new C20166i();
                iVar.f51917a = i2;
                iVar.f51918b = i8;
                iVar.f51919c = i3;
                iVar.f51920d = i4;
                iVar.f51921e = true;
                return iVar;
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: b */
    public static C20162e m94272b(@C0359n0 C20159b bVar) {
        return m94273c(bVar, true);
    }

    @C0359n0
    /* renamed from: c */
    public static C20162e m94273c(@C0359n0 C20159b bVar, boolean z) {
        C20165h hVar;
        int e = bVar.mo59156e();
        int d = bVar.mo59155d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C20165h(0, e, 0, d));
        int i = ((((e + d) + 1) / 2) * 2) + 1;
        C20160c cVar = new C20160c(i);
        C20160c cVar2 = new C20160c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C20165h hVar2 = (C20165h) arrayList2.remove(arrayList2.size() - 1);
            C20166i e2 = m94275e(hVar2, bVar, cVar, cVar2);
            if (e2 != null) {
                if (e2.mo60482a() > 0) {
                    arrayList.add(e2.mo60485d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new C20165h();
                } else {
                    hVar = (C20165h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f51913a = hVar2.f51913a;
                hVar.f51915c = hVar2.f51915c;
                hVar.f51914b = e2.f51917a;
                hVar.f51916d = e2.f51918b;
                arrayList2.add(hVar);
                hVar2.f51914b = hVar2.f51914b;
                hVar2.f51916d = hVar2.f51916d;
                hVar2.f51913a = e2.f51919c;
                hVar2.f51915c = e2.f51920d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f51889a);
        return new C20162e(bVar, arrayList, cVar.mo60463a(), cVar2.mo60463a(), z);
    }

    @C0363p0
    /* renamed from: d */
    public static C20166i m94274d(C20165h hVar, C20159b bVar, C20160c cVar, C20160c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = true;
        if (Math.abs(hVar.mo60481b() - hVar.mo60480a()) % 2 != 1) {
            z = false;
        }
        int b = hVar.mo60481b() - hVar.mo60480a();
        int i6 = -i;
        int i7 = i6;
        while (i7 <= i) {
            if (i7 == i6 || (i7 != i && cVar.mo60465c(i7 + 1) > cVar.mo60465c(i7 - 1))) {
                i3 = cVar.mo60465c(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar.mo60465c(i7 - 1);
                i2 = i3 + 1;
            }
            int i8 = (hVar.f51915c + (i2 - hVar.f51913a)) - i7;
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 - 1;
            }
            while (i2 < hVar.f51914b && i8 < hVar.f51916d && bVar.mo59154b(i2, i8)) {
                i2++;
                i8++;
            }
            cVar.mo60466d(i7, i2);
            if (!z || (i5 = b - i7) < i6 + 1 || i5 > i - 1 || cVar2.mo60465c(i5) > i2) {
                i7 += 2;
            } else {
                C20166i iVar = new C20166i();
                iVar.f51917a = i3;
                iVar.f51918b = i4;
                iVar.f51919c = i2;
                iVar.f51920d = i8;
                iVar.f51921e = false;
                return iVar;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: e */
    public static C20166i m94275e(C20165h hVar, C20159b bVar, C20160c cVar, C20160c cVar2) {
        if (hVar.mo60481b() >= 1 && hVar.mo60480a() >= 1) {
            int b = ((hVar.mo60481b() + hVar.mo60480a()) + 1) / 2;
            cVar.mo60466d(1, hVar.f51913a);
            cVar2.mo60466d(1, hVar.f51914b);
            for (int i = 0; i < b; i++) {
                C20166i d = m94274d(hVar, bVar, cVar, cVar2, i);
                if (d != null) {
                    return d;
                }
                C20166i a = m94271a(hVar, bVar, cVar, cVar2, i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
