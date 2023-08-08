package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public final class LazyGridSpanLayoutProvider {
    @C12579k

    /* renamed from: a */
    public final C2495j f6523a;
    @C12579k

    /* renamed from: b */
    public final ArrayList<C2477a> f6524b;

    /* renamed from: c */
    public int f6525c;

    /* renamed from: d */
    public int f6526d;

    /* renamed from: e */
    public int f6527e;

    /* renamed from: f */
    public int f6528f = -1;
    @C12579k

    /* renamed from: g */
    public final List<Integer> f6529g = new ArrayList();
    @C12579k

    /* renamed from: h */
    public List<C2488d> f6530h = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: i */
    public int f6531i;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b */
    public static final class C2478b implements C2497l {
        @C12579k

        /* renamed from: a */
        public static final C2478b f6534a = new C2478b();

        /* renamed from: b */
        public static int f6535b;

        /* renamed from: c */
        public static int f6536c;

        /* renamed from: a */
        public int mo8487a() {
            return f6535b;
        }

        /* renamed from: b */
        public int mo8488b() {
            return f6536c;
        }

        /* renamed from: c */
        public void mo8489c(int i) {
            f6535b = i;
        }

        /* renamed from: d */
        public void mo8490d(int i) {
            f6536c = i;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c */
    public static final class C2479c {

        /* renamed from: c */
        public static final int f6537c = 8;

        /* renamed from: a */
        public final int f6538a;
        @C12579k

        /* renamed from: b */
        public final List<C2488d> f6539b;

        public C2479c(int i, @C12579k List<C2488d> list) {
            Intrinsics.checkNotNullParameter(list, "spans");
            this.f6538a = i;
            this.f6539b = list;
        }

        /* renamed from: a */
        public final int mo8491a() {
            return this.f6538a;
        }

        @C12579k
        /* renamed from: b */
        public final List<C2488d> mo8492b() {
            return this.f6539b;
        }
    }

    public LazyGridSpanLayoutProvider(@C12579k C2495j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "itemProvider");
        this.f6523a = jVar;
        ArrayList<C2477a> arrayList = new ArrayList<>();
        arrayList.add(new C2477a(0, 0, 2, (DefaultConstructorMarker) null));
        this.f6524b = arrayList;
    }

    /* renamed from: a */
    public final int mo8476a() {
        return ((int) Math.sqrt((((double) mo8481f()) * 1.0d) / ((double) this.f6531i))) + 1;
    }

    /* renamed from: b */
    public final List<C2488d> mo8477b(int i) {
        if (i == this.f6530h.size()) {
            return this.f6530h;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C2488d.m11156a(C2505t.m11262a(1)));
        }
        this.f6530h = arrayList;
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae A[LOOP:0: B:33:0x00ae->B:76:0x00ae, LOOP_START, PHI: r2 r4 r5 
      PHI: (r2v6 int) = (r2v5 int), (r2v10 int) binds: [B:32:0x00ac, B:76:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:32:0x00ac, B:76:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v5 int) = (r5v4 int), (r5v13 int) binds: [B:32:0x00ac, B:76:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015b  */
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.C2479c mo8478c(int r12) {
        /*
            r11 = this;
            androidx.compose.foundation.lazy.grid.j r0 = r11.f6523a
            boolean r0 = r0.mo8447c()
            r1 = 0
            if (r0 != 0) goto L_0x0025
            int r0 = r11.f6531i
            int r12 = r12 * r0
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c
            int r2 = r11.f6531i
            int r3 = r11.mo8481f()
            int r3 = r3 - r12
            int r2 = kotlin.ranges.C11479u.m44313B(r2, r3)
            int r1 = kotlin.ranges.C11479u.m44447u(r2, r1)
            java.util.List r1 = r11.mo8477b(r1)
            r0.<init>(r12, r1)
            return r0
        L_0x0025:
            int r0 = r11.mo8476a()
            int r0 = r12 / r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r2 = r11.f6524b
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r11.mo8476a()
            int r2 = r2 * r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r4 = r11.f6524b
            java.lang.Object r4 = r4.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r4 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.C2477a) r4
            int r4 = r4.mo8485a()
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r5 = r11.f6524b
            java.lang.Object r5 = r5.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r5 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.C2477a) r5
            int r5 = r5.mo8486b()
            int r6 = r11.f6525c
            if (r2 > r6) goto L_0x005c
            if (r6 > r12) goto L_0x005c
            r7 = r3
            goto L_0x005d
        L_0x005c:
            r7 = r1
        L_0x005d:
            if (r7 == 0) goto L_0x0065
            int r4 = r11.f6526d
            int r5 = r11.f6527e
            r2 = r6
            goto L_0x0081
        L_0x0065:
            int r6 = r11.f6528f
            if (r0 != r6) goto L_0x0081
            int r6 = r12 - r2
            java.util.List<java.lang.Integer> r7 = r11.f6529g
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0081
            java.util.List<java.lang.Integer> r2 = r11.f6529g
            java.lang.Object r2 = r2.get(r6)
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            r2 = r12
            r5 = r1
        L_0x0081:
            int r6 = r11.mo8476a()
            int r6 = r2 % r6
            if (r6 != 0) goto L_0x009b
            int r6 = r11.mo8476a()
            int r7 = r12 - r2
            r8 = 2
            if (r8 > r7) goto L_0x0096
            if (r7 >= r6) goto L_0x0096
            r6 = r3
            goto L_0x0097
        L_0x0096:
            r6 = r1
        L_0x0097:
            if (r6 == 0) goto L_0x009b
            r6 = r3
            goto L_0x009c
        L_0x009b:
            r6 = r1
        L_0x009c:
            if (r6 == 0) goto L_0x00a5
            r11.f6528f = r0
            java.util.List<java.lang.Integer> r0 = r11.f6529g
            r0.clear()
        L_0x00a5:
            if (r2 > r12) goto L_0x00a9
            r0 = r3
            goto L_0x00aa
        L_0x00a9:
            r0 = r1
        L_0x00aa:
            java.lang.String r7 = "Check failed."
            if (r0 == 0) goto L_0x015b
        L_0x00ae:
            if (r2 >= r12) goto L_0x011c
            int r0 = r11.mo8481f()
            if (r4 >= r0) goto L_0x011c
            if (r6 == 0) goto L_0x00c1
            java.util.List<java.lang.Integer> r0 = r11.f6529g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0.add(r8)
        L_0x00c1:
            r0 = r1
        L_0x00c2:
            int r8 = r11.f6531i
            if (r0 >= r8) goto L_0x00e4
            int r8 = r11.mo8481f()
            if (r4 >= r8) goto L_0x00e4
            if (r5 != 0) goto L_0x00d9
            int r8 = r11.f6531i
            int r8 = r8 - r0
            int r8 = r11.mo8484i(r4, r8)
            r10 = r8
            r8 = r5
            r5 = r10
            goto L_0x00da
        L_0x00d9:
            r8 = r1
        L_0x00da:
            int r0 = r0 + r5
            int r9 = r11.f6531i
            if (r0 <= r9) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            int r4 = r4 + 1
            r5 = r8
            goto L_0x00c2
        L_0x00e4:
            int r2 = r2 + 1
            int r0 = r11.mo8476a()
            int r0 = r2 % r0
            if (r0 != 0) goto L_0x00ae
            int r0 = r11.mo8481f()
            if (r4 >= r0) goto L_0x00ae
            int r0 = r11.mo8476a()
            int r0 = r2 / r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r8 = r11.f6524b
            int r8 = r8.size()
            if (r8 != r0) goto L_0x0104
            r0 = r3
            goto L_0x0105
        L_0x0104:
            r0 = r1
        L_0x0105:
            if (r0 == 0) goto L_0x0112
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r0 = r11.f6524b
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r8 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a
            r8.<init>(r4, r5)
            r0.add(r8)
            goto L_0x00ae
        L_0x0112:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = r7.toString()
            r12.<init>(r0)
            throw r12
        L_0x011c:
            r11.f6525c = r12
            r11.f6526d = r4
            r11.f6527e = r5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = r1
            r2 = r4
        L_0x0129:
            int r3 = r11.f6531i
            if (r0 >= r3) goto L_0x0155
            int r3 = r11.mo8481f()
            if (r2 >= r3) goto L_0x0155
            if (r5 != 0) goto L_0x0140
            int r3 = r11.f6531i
            int r3 = r3 - r0
            int r3 = r11.mo8484i(r2, r3)
            r10 = r5
            r5 = r3
            r3 = r10
            goto L_0x0141
        L_0x0140:
            r3 = r1
        L_0x0141:
            int r0 = r0 + r5
            int r6 = r11.f6531i
            if (r0 > r6) goto L_0x0155
            int r2 = r2 + 1
            long r5 = androidx.compose.foundation.lazy.grid.C2505t.m11262a(r5)
            androidx.compose.foundation.lazy.grid.d r5 = androidx.compose.foundation.lazy.grid.C2488d.m11156a(r5)
            r12.add(r5)
            r5 = r3
            goto L_0x0129
        L_0x0155:
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c
            r0.<init>(r4, r12)
            return r0
        L_0x015b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = r7.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.mo8478c(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c");
    }

    /* renamed from: d */
    public final int mo8479d(int i) {
        boolean z;
        boolean z2;
        int i2;
        if (mo8481f() <= 0) {
            return C2510x.m11278c(0);
        }
        if (i < mo8481f()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f6523a.mo8447c()) {
            return C2510x.m11278c(i / this.f6531i);
        } else {
            int w = CollectionsKt__CollectionsKt.m40468w(this.f6524b, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i), 3, (Object) null);
            if (w < 0) {
                w = (-w) - 2;
            }
            int a = mo8476a() * w;
            int a2 = this.f6524b.get(w).mo8485a();
            if (a2 <= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = 0;
                while (a2 < i) {
                    int i4 = a2 + 1;
                    int i5 = mo8484i(a2, this.f6531i - i3);
                    i3 += i5;
                    int i6 = this.f6531i;
                    if (i3 >= i6) {
                        if (i3 == i6) {
                            a++;
                            i3 = 0;
                        } else {
                            a++;
                            i3 = i5;
                        }
                    }
                    if (a % mo8476a() == 0 && a / mo8476a() >= this.f6524b.size()) {
                        ArrayList<C2477a> arrayList = this.f6524b;
                        if (i3 > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        arrayList.add(new C2477a(i4 - i2, 0, 2, (DefaultConstructorMarker) null));
                    }
                    a2 = i4;
                }
                if (i3 + mo8484i(i, this.f6531i - i3) > this.f6531i) {
                    a++;
                }
                return C2510x.m11278c(a);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    public final int mo8480e() {
        return this.f6531i;
    }

    /* renamed from: f */
    public final int mo8481f() {
        return this.f6523a.mo8288a();
    }

    /* renamed from: g */
    public final void mo8482g() {
        this.f6524b.clear();
        this.f6524b.add(new C2477a(0, 0, 2, (DefaultConstructorMarker) null));
        this.f6525c = 0;
        this.f6526d = 0;
        this.f6527e = 0;
        this.f6528f = -1;
        this.f6529g.clear();
    }

    /* renamed from: h */
    public final void mo8483h(int i) {
        if (i != this.f6531i) {
            this.f6531i = i;
            mo8482g();
        }
    }

    /* renamed from: i */
    public final int mo8484i(int i, int i2) {
        C2495j jVar = this.f6523a;
        C2478b bVar = C2478b.f6534a;
        bVar.mo8489c(i2);
        bVar.mo8490d(this.f6531i);
        return C11479u.m44334I(C2488d.m11161f(jVar.mo8448j(bVar, i)), 1, this.f6531i);
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a */
    public static final class C2477a {

        /* renamed from: a */
        public final int f6532a;

        /* renamed from: b */
        public final int f6533b;

        public C2477a(int i, int i2) {
            this.f6532a = i;
            this.f6533b = i2;
        }

        /* renamed from: a */
        public final int mo8485a() {
            return this.f6532a;
        }

        /* renamed from: b */
        public final int mo8486b() {
            return this.f6533b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2477a(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
