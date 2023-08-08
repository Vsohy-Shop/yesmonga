package androidx.room;

import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20488h;
import androidx.sqlite.p031db.C20489i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.C11079d2;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.v1 */
public final class C20400v1 implements C20489i, C20488h {

    /* renamed from: E0 */
    public static final int f52610E0 = 4;

    /* renamed from: F0 */
    public static final int f52611F0 = 5;

    /* renamed from: X */
    public static final int f52612X = 1;

    /* renamed from: Y */
    public static final int f52613Y = 2;

    /* renamed from: Z */
    public static final int f52614Z = 3;
    @C12579k

    /* renamed from: w */
    public static final C20402b f52615w = new C20402b((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f52616x = 15;

    /* renamed from: y */
    public static final int f52617y = 10;
    @C12579k
    @C11287e

    /* renamed from: z */
    public static final TreeMap<Integer, C20400v1> f52618z = new TreeMap<>();
    @C0344h1

    /* renamed from: a */
    public final int f52619a;
    @C12580l

    /* renamed from: b */
    public volatile String f52620b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final long[] f52621c;
    @C12579k
    @C11287e

    /* renamed from: d */
    public final double[] f52622d;
    @C12579k
    @C11287e

    /* renamed from: e */
    public final String[] f52623e;
    @C12579k
    @C11287e

    /* renamed from: f */
    public final byte[][] f52624f;
    @C12579k

    /* renamed from: g */
    public final int[] f52625g;

    /* renamed from: v */
    public int f52626v;

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.room.v1$a */
    public @interface C20401a {
    }

    /* renamed from: androidx.room.v1$b */
    public static final class C20402b {

        /* renamed from: androidx.room.v1$b$a */
        public static final class C20403a implements C20488h {

            /* renamed from: a */
            public final /* synthetic */ C20400v1 f52627a;

            public C20403a(C20400v1 v1Var) {
                this.f52627a = v1Var;
            }

            /* renamed from: G0 */
            public void mo60788G0(int i, double d) {
                this.f52627a.mo60788G0(i, d);
            }

            /* renamed from: O3 */
            public void mo60789O3() {
                this.f52627a.mo60789O3();
            }

            /* renamed from: S2 */
            public void mo60790S2(int i, long j) {
                this.f52627a.mo60790S2(i, j);
            }

            /* renamed from: a3 */
            public void mo60791a3(int i, @C12579k byte[] bArr) {
                Intrinsics.checkNotNullParameter(bArr, "value");
                this.f52627a.mo60791a3(i, bArr);
            }

            public void close() {
                this.f52627a.close();
            }

            /* renamed from: u3 */
            public void mo60800u3(int i) {
                this.f52627a.mo60800u3(i);
            }

            /* renamed from: v2 */
            public void mo60801v2(int i, @C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "value");
                this.f52627a.mo60801v2(i, str);
            }
        }

        public /* synthetic */ C20402b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        /* renamed from: c */
        public static /* synthetic */ void m95202c() {
        }

        @C0344h1
        /* renamed from: d */
        public static /* synthetic */ void m95203d() {
        }

        @C0344h1
        /* renamed from: e */
        public static /* synthetic */ void m95204e() {
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C20400v1 mo61240a(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "query");
            TreeMap<Integer, C20400v1> treeMap = C20400v1.f52618z;
            synchronized (treeMap) {
                Map.Entry<Integer, C20400v1> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    C20400v1 value = ceilingEntry.getValue();
                    value.mo61238o(str, i);
                    Intrinsics.checkNotNullExpressionValue(value, "sqliteQuery");
                    return value;
                }
                C11079d2 d2Var = C11079d2.f28267a;
                C20400v1 v1Var = new C20400v1(i, (DefaultConstructorMarker) null);
                v1Var.mo61238o(str, i);
                return v1Var;
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C20400v1 mo61241b(@C12579k C20489i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "supportSQLiteQuery");
            C20400v1 a = mo61240a(iVar.mo61233b(), iVar.mo61232a());
            iVar.mo61234c(new C20403a(a));
            return a;
        }

        /* renamed from: f */
        public final void mo61242f() {
            TreeMap<Integer, C20400v1> treeMap = C20400v1.f52618z;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }

        public C20402b() {
        }
    }

    public /* synthetic */ C20400v1(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C20400v1 m95183d(@C12579k String str, int i) {
        return f52615w.mo61240a(str, i);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C20400v1 m95184g(@C12579k C20489i iVar) {
        return f52615w.mo61241b(iVar);
    }

    /* renamed from: i */
    public static /* synthetic */ void m95185i() {
    }

    @C0344h1
    /* renamed from: j */
    public static /* synthetic */ void m95186j() {
    }

    @C0344h1
    /* renamed from: l */
    public static /* synthetic */ void m95187l() {
    }

    @C0344h1
    /* renamed from: m */
    public static /* synthetic */ void m95188m() {
    }

    @C0344h1
    /* renamed from: n */
    public static /* synthetic */ void m95189n() {
    }

    /* renamed from: G0 */
    public void mo60788G0(int i, double d) {
        this.f52625g[i] = 3;
        this.f52622d[i] = d;
    }

    /* renamed from: O3 */
    public void mo60789O3() {
        Arrays.fill(this.f52625g, 1);
        Arrays.fill(this.f52623e, (Object) null);
        Arrays.fill(this.f52624f, (Object) null);
        this.f52620b = null;
    }

    /* renamed from: S2 */
    public void mo60790S2(int i, long j) {
        this.f52625g[i] = 2;
        this.f52621c[i] = j;
    }

    /* renamed from: a */
    public int mo61232a() {
        return this.f52626v;
    }

    /* renamed from: a3 */
    public void mo60791a3(int i, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "value");
        this.f52625g[i] = 5;
        this.f52624f[i] = bArr;
    }

    @C12579k
    /* renamed from: b */
    public String mo61233b() {
        String str = this.f52620b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: c */
    public void mo61234c(@C12579k C20488h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "statement");
        int a = mo61232a();
        if (1 <= a) {
            int i = 1;
            while (true) {
                int i2 = this.f52625g[i];
                if (i2 == 1) {
                    hVar.mo60800u3(i);
                } else if (i2 == 2) {
                    hVar.mo60790S2(i, this.f52621c[i]);
                } else if (i2 == 3) {
                    hVar.mo60788G0(i, this.f52622d[i]);
                } else if (i2 == 4) {
                    String str = this.f52623e[i];
                    if (str != null) {
                        hVar.mo60801v2(i, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i2 == 5) {
                    byte[] bArr = this.f52624f[i];
                    if (bArr != null) {
                        hVar.mo60791a3(i, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i != a) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void close() {
    }

    /* renamed from: f */
    public final void mo61236f(@C12579k C20400v1 v1Var) {
        Intrinsics.checkNotNullParameter(v1Var, "other");
        int a = v1Var.mo61232a() + 1;
        System.arraycopy(v1Var.f52625g, 0, this.f52625g, 0, a);
        System.arraycopy(v1Var.f52621c, 0, this.f52621c, 0, a);
        System.arraycopy(v1Var.f52623e, 0, this.f52623e, 0, a);
        System.arraycopy(v1Var.f52624f, 0, this.f52624f, 0, a);
        System.arraycopy(v1Var.f52622d, 0, this.f52622d, 0, a);
    }

    /* renamed from: k */
    public final int mo61237k() {
        return this.f52619a;
    }

    /* renamed from: o */
    public final void mo61238o(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "query");
        this.f52620b = str;
        this.f52626v = i;
    }

    public final void release() {
        TreeMap<Integer, C20400v1> treeMap = f52618z;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f52619a), this);
            f52615w.mo61242f();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: u3 */
    public void mo60800u3(int i) {
        this.f52625g[i] = 1;
    }

    /* renamed from: v2 */
    public void mo60801v2(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f52625g[i] = 4;
        this.f52623e[i] = str;
    }

    public C20400v1(int i) {
        this.f52619a = i;
        int i2 = i + 1;
        this.f52625g = new int[i2];
        this.f52621c = new long[i2];
        this.f52622d = new double[i2];
        this.f52623e = new String[i2];
        this.f52624f = new byte[i2][];
    }
}
