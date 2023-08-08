package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.C0363p0;
import androidx.core.graphics.C17586h0;
import androidx.palette.graphics.C19868b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: androidx.palette.graphics.a */
public final class C19865a {

    /* renamed from: g */
    public static final String f50725g = "ColorCutQuantizer";

    /* renamed from: h */
    public static final boolean f50726h = false;

    /* renamed from: i */
    public static final int f50727i = -3;

    /* renamed from: j */
    public static final int f50728j = -2;

    /* renamed from: k */
    public static final int f50729k = -1;

    /* renamed from: l */
    public static final int f50730l = 5;

    /* renamed from: m */
    public static final int f50731m = 31;

    /* renamed from: n */
    public static final Comparator<C19867b> f50732n = new C19866a();

    /* renamed from: a */
    public final int[] f50733a;

    /* renamed from: b */
    public final int[] f50734b;

    /* renamed from: c */
    public final List<C19868b.C19874e> f50735c;
    @C0363p0

    /* renamed from: d */
    public final TimingLogger f50736d = null;

    /* renamed from: e */
    public final C19868b.C19872c[] f50737e;

    /* renamed from: f */
    public final float[] f50738f = new float[3];

    /* renamed from: androidx.palette.graphics.a$a */
    public static class C19866a implements Comparator<C19867b> {
        /* renamed from: a */
        public int compare(C19867b bVar, C19867b bVar2) {
            return bVar2.mo58659g() - bVar.mo58659g();
        }
    }

    /* renamed from: androidx.palette.graphics.a$b */
    public class C19867b {

        /* renamed from: a */
        public int f50739a;

        /* renamed from: b */
        public int f50740b;

        /* renamed from: c */
        public int f50741c;

        /* renamed from: d */
        public int f50742d;

        /* renamed from: e */
        public int f50743e;

        /* renamed from: f */
        public int f50744f;

        /* renamed from: g */
        public int f50745g;

        /* renamed from: h */
        public int f50746h;

        /* renamed from: i */
        public int f50747i;

        public C19867b(int i, int i2) {
            this.f50739a = i;
            this.f50740b = i2;
            mo58655c();
        }

        /* renamed from: a */
        public final boolean mo58653a() {
            return mo58657e() > 1;
        }

        /* renamed from: b */
        public final int mo58654b() {
            int f = mo58658f();
            C19865a aVar = C19865a.this;
            int[] iArr = aVar.f50733a;
            int[] iArr2 = aVar.f50734b;
            C19865a.m92235e(iArr, f, this.f50739a, this.f50740b);
            Arrays.sort(iArr, this.f50739a, this.f50740b + 1);
            C19865a.m92235e(iArr, f, this.f50739a, this.f50740b);
            int i = this.f50741c / 2;
            int i2 = this.f50739a;
            int i3 = 0;
            while (true) {
                int i4 = this.f50740b;
                if (i2 > i4) {
                    return this.f50739a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* renamed from: c */
        public final void mo58655c() {
            C19865a aVar = C19865a.this;
            int[] iArr = aVar.f50733a;
            int[] iArr2 = aVar.f50734b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f50739a; i8 <= this.f50740b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int k = C19865a.m92240k(i9);
                int j = C19865a.m92239j(i9);
                int i10 = C19865a.m92238i(i9);
                if (k > i2) {
                    i2 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i3) {
                    i3 = j;
                }
                if (j < i6) {
                    i6 = j;
                }
                if (i10 > i4) {
                    i4 = i10;
                }
                if (i10 < i7) {
                    i7 = i10;
                }
            }
            this.f50742d = i;
            this.f50743e = i2;
            this.f50744f = i6;
            this.f50745g = i3;
            this.f50746h = i7;
            this.f50747i = i4;
            this.f50741c = i5;
        }

        /* renamed from: d */
        public final C19868b.C19874e mo58656d() {
            C19865a aVar = C19865a.this;
            int[] iArr = aVar.f50733a;
            int[] iArr2 = aVar.f50734b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f50739a; i5 <= this.f50740b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C19865a.m92240k(i6) * i7;
                i3 += C19865a.m92239j(i6) * i7;
                i4 += i7 * C19865a.m92238i(i6);
            }
            float f = (float) i2;
            return new C19868b.C19874e(C19865a.m92234b(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        /* renamed from: e */
        public final int mo58657e() {
            return (this.f50740b + 1) - this.f50739a;
        }

        /* renamed from: f */
        public final int mo58658f() {
            int i = this.f50743e - this.f50742d;
            int i2 = this.f50745g - this.f50744f;
            int i3 = this.f50747i - this.f50746h;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 < i || i2 < i3) {
                return -1;
            }
            return -2;
        }

        /* renamed from: g */
        public final int mo58659g() {
            return ((this.f50743e - this.f50742d) + 1) * ((this.f50745g - this.f50744f) + 1) * ((this.f50747i - this.f50746h) + 1);
        }

        /* renamed from: h */
        public final C19867b mo58660h() {
            if (mo58653a()) {
                int b = mo58654b();
                C19867b bVar = new C19867b(b + 1, this.f50740b);
                this.f50740b = b;
                mo58655c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public C19865a(int[] iArr, int i, C19868b.C19872c[] cVarArr) {
        this.f50737e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f50734b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = m92237g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && mo58647l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f50733a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f50735c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f50735c.add(new C19868b.C19874e(m92233a(i8), iArr2[i8]));
            }
            return;
        }
        this.f50735c = mo58646h(i);
    }

    /* renamed from: a */
    public static int m92233a(int i) {
        return m92234b(m92240k(i), m92239j(i), m92238i(i));
    }

    /* renamed from: b */
    public static int m92234b(int i, int i2, int i3) {
        return Color.rgb(m92236f(i, 5, 8), m92236f(i2, 5, 8), m92236f(i3, 5, 8));
    }

    /* renamed from: e */
    public static void m92235e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m92238i(i4) | (m92239j(i4) << 10) | (m92240k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m92240k(i5) | (m92238i(i5) << 10) | (m92239j(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static int m92236f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    public static int m92237g(int i) {
        return m92236f(Color.blue(i), 8, 5) | (m92236f(Color.red(i), 8, 5) << 10) | (m92236f(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: i */
    public static int m92238i(int i) {
        return i & 31;
    }

    /* renamed from: j */
    public static int m92239j(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: k */
    public static int m92240k(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: c */
    public final List<C19868b.C19874e> mo58644c(Collection<C19867b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C19867b d : collection) {
            C19868b.C19874e d2 = d.mo58656d();
            if (!mo58649n(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C19868b.C19874e> mo58645d() {
        return this.f50735c;
    }

    /* renamed from: h */
    public final List<C19868b.C19874e> mo58646h(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f50732n);
        priorityQueue.offer(new C19867b(0, this.f50733a.length - 1));
        mo58650o(priorityQueue, i);
        return mo58644c(priorityQueue);
    }

    /* renamed from: l */
    public final boolean mo58647l(int i) {
        int a = m92233a(i);
        C17586h0.m80579p(a, this.f50738f);
        return mo58648m(a, this.f50738f);
    }

    /* renamed from: m */
    public final boolean mo58648m(int i, float[] fArr) {
        C19868b.C19872c[] cVarArr = this.f50737e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f50737e[i2].mo58685a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo58649n(C19868b.C19874e eVar) {
        return mo58648m(eVar.mo58711e(), eVar.mo58709c());
    }

    /* renamed from: o */
    public final void mo58650o(PriorityQueue<C19867b> priorityQueue, int i) {
        C19867b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.mo58653a()) {
            priorityQueue.offer(poll.mo58660h());
            priorityQueue.offer(poll);
        }
    }
}
