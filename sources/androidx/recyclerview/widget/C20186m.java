package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.C0363p0;
import androidx.core.p027os.C17821p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.m */
public final class C20186m implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal<C20186m> f52030e = new ThreadLocal<>();

    /* renamed from: f */
    public static Comparator<C20189c> f52031f = new C20187a();

    /* renamed from: a */
    public ArrayList<RecyclerView> f52032a = new ArrayList<>();

    /* renamed from: b */
    public long f52033b;

    /* renamed from: c */
    public long f52034c;

    /* renamed from: d */
    public ArrayList<C20189c> f52035d = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.m$a */
    public class C20187a implements Comparator<C20189c> {
        /* renamed from: a */
        public int compare(C20189c cVar, C20189c cVar2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = cVar.f52043d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (cVar2.f52043d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                boolean z3 = cVar.f52040a;
                if (z3 == cVar2.f52040a) {
                    int i = cVar2.f52041b - cVar.f52041b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.f52042c - cVar2.f52042c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.m$b */
    public static class C20188b implements RecyclerView.C20076o.C20079c {

        /* renamed from: a */
        public int f52036a;

        /* renamed from: b */
        public int f52037b;

        /* renamed from: c */
        public int[] f52038c;

        /* renamed from: d */
        public int f52039d;

        /* renamed from: a */
        public void mo59991a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f52039d * 2;
                int[] iArr = this.f52038c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f52038c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f52038c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f52038c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f52039d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public void mo60565b() {
            int[] iArr = this.f52038c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f52039d = 0;
        }

        /* renamed from: c */
        public void mo60566c(RecyclerView recyclerView, boolean z) {
            this.f52039d = 0;
            int[] iArr = this.f52038c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C20076o oVar = recyclerView.f51422E0;
            if (recyclerView.f51493z != null && oVar != null && oVar.mo59889K0()) {
                if (z) {
                    if (!recyclerView.f51463d.mo60213q()) {
                        oVar.mo59364A(recyclerView.f51493z.getItemCount(), this);
                    }
                } else if (!recyclerView.mo59469D0()) {
                    oVar.mo59436z(this.f52036a, this.f52037b, recyclerView.f51490x1, this);
                }
                int i = this.f52039d;
                if (i > oVar.f51573X) {
                    oVar.f51573X = i;
                    oVar.f51574Y = z;
                    recyclerView.f51459b.mo60031L();
                }
            }
        }

        /* renamed from: d */
        public boolean mo60567d(int i) {
            if (this.f52038c != null) {
                int i2 = this.f52039d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f52038c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo60568e(int i, int i2) {
            this.f52036a = i;
            this.f52037b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    public static class C20189c {

        /* renamed from: a */
        public boolean f52040a;

        /* renamed from: b */
        public int f52041b;

        /* renamed from: c */
        public int f52042c;

        /* renamed from: d */
        public RecyclerView f52043d;

        /* renamed from: e */
        public int f52044e;

        /* renamed from: a */
        public void mo60569a() {
            this.f52040a = false;
            this.f52041b = 0;
            this.f52042c = 0;
            this.f52043d = null;
            this.f52044e = 0;
        }
    }

    /* renamed from: f */
    public static boolean m94398f(RecyclerView recyclerView, int i) {
        int j = recyclerView.f51465e.mo60366j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C20061e0 u0 = RecyclerView.m93254u0(recyclerView.f51465e.mo60365i(i2));
            if (u0.mPosition == i && !u0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo60553a(RecyclerView recyclerView) {
        this.f52032a.add(recyclerView);
    }

    /* renamed from: c */
    public final void mo60554c() {
        C20189c cVar;
        boolean z;
        int size = this.f52032a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f52032a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f51488w1.mo60566c(recyclerView, false);
                i += recyclerView.f51488w1.f52039d;
            }
        }
        this.f52035d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f52032a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C20188b bVar = recyclerView2.f51488w1;
                int abs = Math.abs(bVar.f52036a) + Math.abs(bVar.f52037b);
                for (int i5 = 0; i5 < bVar.f52039d * 2; i5 += 2) {
                    if (i3 >= this.f52035d.size()) {
                        cVar = new C20189c();
                        this.f52035d.add(cVar);
                    } else {
                        cVar = this.f52035d.get(i3);
                    }
                    int[] iArr = bVar.f52038c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f52040a = z;
                    cVar.f52041b = abs;
                    cVar.f52042c = i6;
                    cVar.f52043d = recyclerView2;
                    cVar.f52044e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f52035d, f52031f);
    }

    /* renamed from: d */
    public final void mo60555d(C20189c cVar, long j) {
        long j2;
        if (cVar.f52040a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.C20061e0 j3 = mo60560j(cVar.f52043d, cVar.f52044e, j2);
        if (j3 != null && j3.mNestedRecyclerView != null && j3.isBound() && !j3.isInvalid()) {
            mo60559i(j3.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: e */
    public final void mo60556e(long j) {
        int i = 0;
        while (i < this.f52035d.size()) {
            C20189c cVar = this.f52035d.get(i);
            if (cVar.f52043d != null) {
                mo60555d(cVar, j);
                cVar.mo60569a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo60557g(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f52033b == 0) {
            this.f52033b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f51488w1.mo60568e(i, i2);
    }

    /* renamed from: h */
    public void mo60558h(long j) {
        mo60554c();
        mo60556e(j);
    }

    /* renamed from: i */
    public final void mo60559i(@C0363p0 RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f51453W0 && recyclerView.f51465e.mo60366j() != 0) {
                recyclerView.mo59612q1();
            }
            C20188b bVar = recyclerView.f51488w1;
            bVar.mo60566c(recyclerView, true);
            if (bVar.f52039d != 0) {
                try {
                    C17821p0.m81248b(RecyclerView.f51410s2);
                    recyclerView.f51490x1.mo59736k(recyclerView.f51493z);
                    for (int i = 0; i < bVar.f52039d * 2; i += 2) {
                        mo60560j(recyclerView, bVar.f52038c[i], j);
                    }
                } finally {
                    C17821p0.m81250d();
                }
            }
        }
    }

    /* renamed from: j */
    public final RecyclerView.C20061e0 mo60560j(RecyclerView recyclerView, int i, long j) {
        if (m94398f(recyclerView, i)) {
            return null;
        }
        RecyclerView.C20089w wVar = recyclerView.f51459b;
        try {
            recyclerView.mo59538c1();
            RecyclerView.C20061e0 J = wVar.mo60029J(i, false, j);
            if (J != null) {
                if (!J.isBound() || J.isInvalid()) {
                    wVar.mo60034a(J, false);
                } else {
                    wVar.mo60022C(J.itemView);
                }
            }
            return J;
        } finally {
            recyclerView.mo59548e1(false);
        }
    }

    /* renamed from: k */
    public void mo60561k(RecyclerView recyclerView) {
        this.f52032a.remove(recyclerView);
    }

    public void run() {
        try {
            C17821p0.m81248b(RecyclerView.f51409r2);
            if (!this.f52032a.isEmpty()) {
                int size = this.f52032a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f52032a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo60558h(TimeUnit.MILLISECONDS.toNanos(j) + this.f52034c);
                    this.f52033b = 0;
                    C17821p0.m81250d();
                }
            }
        } finally {
            this.f52033b = 0;
            C17821p0.m81250d();
        }
    }
}
