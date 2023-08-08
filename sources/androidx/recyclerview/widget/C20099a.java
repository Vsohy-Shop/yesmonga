package androidx.recyclerview.widget;

import androidx.core.util.C17997q;
import androidx.recyclerview.widget.C20222x;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
public final class C20099a implements C20222x.C20223a {

    /* renamed from: i */
    public static final int f51684i = 0;

    /* renamed from: j */
    public static final int f51685j = 1;

    /* renamed from: k */
    public static final boolean f51686k = false;

    /* renamed from: l */
    public static final String f51687l = "AHT";

    /* renamed from: a */
    public C17997q.C17998a<C20101b> f51688a;

    /* renamed from: b */
    public final ArrayList<C20101b> f51689b;

    /* renamed from: c */
    public final ArrayList<C20101b> f51690c;

    /* renamed from: d */
    public final C20100a f51691d;

    /* renamed from: e */
    public Runnable f51692e;

    /* renamed from: f */
    public final boolean f51693f;

    /* renamed from: g */
    public final C20222x f51694g;

    /* renamed from: h */
    public int f51695h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface C20100a {
        /* renamed from: a */
        void mo59810a(int i, int i2);

        /* renamed from: b */
        void mo59811b(C20101b bVar);

        /* renamed from: c */
        void mo59812c(C20101b bVar);

        /* renamed from: d */
        void mo59813d(int i, int i2);

        /* renamed from: e */
        void mo59814e(int i, int i2, Object obj);

        /* renamed from: f */
        RecyclerView.C20061e0 mo59815f(int i);

        /* renamed from: g */
        void mo59816g(int i, int i2);

        /* renamed from: h */
        void mo59817h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class C20101b {

        /* renamed from: e */
        public static final int f51696e = 1;

        /* renamed from: f */
        public static final int f51697f = 2;

        /* renamed from: g */
        public static final int f51698g = 4;

        /* renamed from: h */
        public static final int f51699h = 8;

        /* renamed from: i */
        public static final int f51700i = 30;

        /* renamed from: a */
        public int f51701a;

        /* renamed from: b */
        public int f51702b;

        /* renamed from: c */
        public Object f51703c;

        /* renamed from: d */
        public int f51704d;

        public C20101b(int i, int i2, int i3, Object obj) {
            this.f51701a = i;
            this.f51702b = i2;
            this.f51704d = i3;
            this.f51703c = obj;
        }

        /* renamed from: a */
        public String mo60223a() {
            int i = this.f51701a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20101b)) {
                return false;
            }
            C20101b bVar = (C20101b) obj;
            int i = this.f51701a;
            if (i != bVar.f51701a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f51704d - this.f51702b) == 1 && this.f51704d == bVar.f51702b && this.f51702b == bVar.f51704d) {
                return true;
            }
            if (this.f51704d != bVar.f51704d || this.f51702b != bVar.f51702b) {
                return false;
            }
            Object obj2 = this.f51703c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f51703c)) {
                    return false;
                }
            } else if (bVar.f51703c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f51701a * 31) + this.f51702b) * 31) + this.f51704d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo60223a() + ",s:" + this.f51702b + "c:" + this.f51704d + ",p:" + this.f51703c + "]";
        }
    }

    public C20099a(C20100a aVar) {
        this(aVar, false);
    }

    /* renamed from: A */
    public final int mo60196A(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f51690c.size() - 1; size >= 0; size--) {
            C20101b bVar = this.f51690c.get(size);
            int i5 = bVar.f51701a;
            if (i5 == 8) {
                int i6 = bVar.f51702b;
                int i7 = bVar.f51704d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f51702b = i6 + 1;
                            bVar.f51704d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f51702b = i6 - 1;
                            bVar.f51704d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f51704d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f51704d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f51702b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f51702b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f51702b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f51704d;
                    } else if (i5 == 2) {
                        i += bVar.f51704d;
                    }
                } else if (i2 == 1) {
                    bVar.f51702b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f51702b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f51690c.size() - 1; size2 >= 0; size2--) {
            C20101b bVar2 = this.f51690c.get(size2);
            if (bVar2.f51701a == 8) {
                int i9 = bVar2.f51704d;
                if (i9 == bVar2.f51702b || i9 < 0) {
                    this.f51690c.remove(size2);
                    mo60198b(bVar2);
                }
            } else if (bVar2.f51704d <= 0) {
                this.f51690c.remove(size2);
                mo60198b(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public C20101b mo60197a(int i, int i2, int i3, Object obj) {
        C20101b b = this.f51688a.mo52469b();
        if (b == null) {
            return new C20101b(i, i2, i3, obj);
        }
        b.f51701a = i;
        b.f51702b = i2;
        b.f51704d = i3;
        b.f51703c = obj;
        return b;
    }

    /* renamed from: b */
    public void mo60198b(C20101b bVar) {
        if (!this.f51693f) {
            bVar.f51703c = null;
            this.f51688a.mo52468a(bVar);
        }
    }

    /* renamed from: c */
    public C20099a mo60199c(C20101b... bVarArr) {
        Collections.addAll(this.f51689b, bVarArr);
        return this;
    }

    /* renamed from: d */
    public final void mo60200d(C20101b bVar) {
        mo60219w(bVar);
    }

    /* renamed from: e */
    public final void mo60201e(C20101b bVar) {
        mo60219w(bVar);
    }

    /* renamed from: f */
    public int mo60202f(int i) {
        int size = this.f51689b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C20101b bVar = this.f51689b.get(i2);
            int i3 = bVar.f51701a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f51702b;
                    if (i4 <= i) {
                        int i5 = bVar.f51704d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f51702b;
                    if (i6 == i) {
                        i = bVar.f51704d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f51704d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f51702b <= i) {
                i += bVar.f51704d;
            }
        }
        return i;
    }

    /* renamed from: g */
    public final void mo60203g(C20101b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f51702b;
        int i2 = bVar.f51704d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f51691d.mo59815f(i3) != null || mo60205i(i3)) {
                if (c2 == 0) {
                    mo60208l(mo60197a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    mo60219w(mo60197a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f51704d) {
            mo60198b(bVar);
            bVar = mo60197a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            mo60208l(bVar);
        } else {
            mo60219w(bVar);
        }
    }

    /* renamed from: h */
    public final void mo60204h(C20101b bVar) {
        int i = bVar.f51702b;
        int i2 = bVar.f51704d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f51691d.mo59815f(i) != null || mo60205i(i)) {
                if (!z) {
                    mo60208l(mo60197a(4, i4, i3, bVar.f51703c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    mo60219w(mo60197a(4, i4, i3, bVar.f51703c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f51704d) {
            Object obj = bVar.f51703c;
            mo60198b(bVar);
            bVar = mo60197a(4, i4, i3, obj);
        }
        if (!z) {
            mo60208l(bVar);
        } else {
            mo60219w(bVar);
        }
    }

    /* renamed from: i */
    public final boolean mo60205i(int i) {
        int size = this.f51690c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C20101b bVar = this.f51690c.get(i2);
            int i3 = bVar.f51701a;
            if (i3 == 8) {
                if (mo60211o(bVar.f51704d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f51702b;
                int i5 = bVar.f51704d + i4;
                while (i4 < i5) {
                    if (mo60211o(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo60206j() {
        int size = this.f51690c.size();
        for (int i = 0; i < size; i++) {
            this.f51691d.mo59812c(this.f51690c.get(i));
        }
        mo60221y(this.f51690c);
        this.f51695h = 0;
    }

    /* renamed from: k */
    public void mo60207k() {
        mo60206j();
        int size = this.f51689b.size();
        for (int i = 0; i < size; i++) {
            C20101b bVar = this.f51689b.get(i);
            int i2 = bVar.f51701a;
            if (i2 == 1) {
                this.f51691d.mo59812c(bVar);
                this.f51691d.mo59816g(bVar.f51702b, bVar.f51704d);
            } else if (i2 == 2) {
                this.f51691d.mo59812c(bVar);
                this.f51691d.mo59817h(bVar.f51702b, bVar.f51704d);
            } else if (i2 == 4) {
                this.f51691d.mo59812c(bVar);
                this.f51691d.mo59814e(bVar.f51702b, bVar.f51704d, bVar.f51703c);
            } else if (i2 == 8) {
                this.f51691d.mo59812c(bVar);
                this.f51691d.mo59810a(bVar.f51702b, bVar.f51704d);
            }
            Runnable runnable = this.f51692e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo60221y(this.f51689b);
        this.f51695h = 0;
    }

    /* renamed from: l */
    public final void mo60208l(C20101b bVar) {
        int i;
        boolean z;
        int i2 = bVar.f51701a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A = mo60196A(bVar.f51702b, i2);
        int i3 = bVar.f51702b;
        int i4 = bVar.f51701a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f51704d; i6++) {
            int A2 = mo60196A(bVar.f51702b + (i * i6), bVar.f51701a);
            int i7 = bVar.f51701a;
            if (i7 == 2 ? A2 != A : !(i7 == 4 && A2 == A + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i5++;
            } else {
                C20101b a = mo60197a(i7, A, i5, bVar.f51703c);
                mo60209m(a, i3);
                mo60198b(a);
                if (bVar.f51701a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                A = A2;
            }
        }
        Object obj = bVar.f51703c;
        mo60198b(bVar);
        if (i5 > 0) {
            C20101b a2 = mo60197a(bVar.f51701a, A, i5, obj);
            mo60209m(a2, i3);
            mo60198b(a2);
        }
    }

    /* renamed from: m */
    public void mo60209m(C20101b bVar, int i) {
        this.f51691d.mo59811b(bVar);
        int i2 = bVar.f51701a;
        if (i2 == 2) {
            this.f51691d.mo59817h(i, bVar.f51704d);
        } else if (i2 == 4) {
            this.f51691d.mo59814e(i, bVar.f51704d, bVar.f51703c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: n */
    public int mo60210n(int i) {
        return mo60211o(i, 0);
    }

    /* renamed from: o */
    public int mo60211o(int i, int i2) {
        int size = this.f51690c.size();
        while (i2 < size) {
            C20101b bVar = this.f51690c.get(i2);
            int i3 = bVar.f51701a;
            if (i3 == 8) {
                int i4 = bVar.f51702b;
                if (i4 == i) {
                    i = bVar.f51704d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f51704d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f51702b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f51704d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f51704d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: p */
    public boolean mo60212p(int i) {
        return (i & this.f51695h) != 0;
    }

    /* renamed from: q */
    public boolean mo60213q() {
        return this.f51689b.size() > 0;
    }

    /* renamed from: r */
    public boolean mo60214r() {
        return !this.f51690c.isEmpty() && !this.f51689b.isEmpty();
    }

    /* renamed from: s */
    public boolean mo60215s(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f51689b.add(mo60197a(4, i, i2, obj));
        this.f51695h |= 4;
        if (this.f51689b.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo60216t(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f51689b.add(mo60197a(1, i, i2, (Object) null));
        this.f51695h |= 1;
        if (this.f51689b.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean mo60217u(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f51689b.add(mo60197a(8, i, i2, (Object) null));
            this.f51695h |= 8;
            if (this.f51689b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: v */
    public boolean mo60218v(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f51689b.add(mo60197a(2, i, i2, (Object) null));
        this.f51695h |= 2;
        if (this.f51689b.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo60219w(C20101b bVar) {
        this.f51690c.add(bVar);
        int i = bVar.f51701a;
        if (i == 1) {
            this.f51691d.mo59816g(bVar.f51702b, bVar.f51704d);
        } else if (i == 2) {
            this.f51691d.mo59813d(bVar.f51702b, bVar.f51704d);
        } else if (i == 4) {
            this.f51691d.mo59814e(bVar.f51702b, bVar.f51704d, bVar.f51703c);
        } else if (i == 8) {
            this.f51691d.mo59810a(bVar.f51702b, bVar.f51704d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: x */
    public void mo60220x() {
        this.f51694g.mo60690b(this.f51689b);
        int size = this.f51689b.size();
        for (int i = 0; i < size; i++) {
            C20101b bVar = this.f51689b.get(i);
            int i2 = bVar.f51701a;
            if (i2 == 1) {
                mo60200d(bVar);
            } else if (i2 == 2) {
                mo60203g(bVar);
            } else if (i2 == 4) {
                mo60204h(bVar);
            } else if (i2 == 8) {
                mo60201e(bVar);
            }
            Runnable runnable = this.f51692e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f51689b.clear();
    }

    /* renamed from: y */
    public void mo60221y(List<C20101b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo60198b(list.get(i));
        }
        list.clear();
    }

    /* renamed from: z */
    public void mo60222z() {
        mo60221y(this.f51689b);
        mo60221y(this.f51690c);
        this.f51695h = 0;
    }

    public C20099a(C20100a aVar, boolean z) {
        this.f51688a = new C17997q.C17999b(30);
        this.f51689b = new ArrayList<>();
        this.f51690c = new ArrayList<>();
        this.f51695h = 0;
        this.f51691d = aVar;
        this.f51693f = z;
        this.f51694g = new C20222x(this);
    }
}
