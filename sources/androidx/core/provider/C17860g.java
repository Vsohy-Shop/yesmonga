package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.collection.C1879j;
import androidx.collection.C1886l;
import androidx.core.graphics.C17530b1;
import androidx.core.provider.C17866h;
import androidx.core.util.C17970d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.core.provider.g */
public class C17860g {

    /* renamed from: a */
    public static final C1879j<String, Typeface> f46233a = new C1879j<>(16);

    /* renamed from: b */
    public static final ExecutorService f46234b = C17872i.m81391a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    public static final Object f46235c = new Object();
    @C0323b0("LOCK")

    /* renamed from: d */
    public static final C1886l<String, ArrayList<C17970d<C17865e>>> f46236d = new C1886l<>();

    /* renamed from: androidx.core.provider.g$a */
    public class C17861a implements Callable<C17865e> {

        /* renamed from: a */
        public final /* synthetic */ String f46237a;

        /* renamed from: b */
        public final /* synthetic */ Context f46238b;

        /* renamed from: c */
        public final /* synthetic */ C17859f f46239c;

        /* renamed from: d */
        public final /* synthetic */ int f46240d;

        public C17861a(String str, Context context, C17859f fVar, int i) {
            this.f46237a = str;
            this.f46238b = context;
            this.f46239c = fVar;
            this.f46240d = i;
        }

        /* renamed from: a */
        public C17865e call() {
            return C17860g.m81362c(this.f46237a, this.f46238b, this.f46239c, this.f46240d);
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    public class C17862b implements C17970d<C17865e> {

        /* renamed from: a */
        public final /* synthetic */ C17847a f46241a;

        public C17862b(C17847a aVar) {
            this.f46241a = aVar;
        }

        /* renamed from: a */
        public void accept(C17865e eVar) {
            if (eVar == null) {
                eVar = new C17865e(-3);
            }
            this.f46241a.mo52260b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    public class C17863c implements Callable<C17865e> {

        /* renamed from: a */
        public final /* synthetic */ String f46242a;

        /* renamed from: b */
        public final /* synthetic */ Context f46243b;

        /* renamed from: c */
        public final /* synthetic */ C17859f f46244c;

        /* renamed from: d */
        public final /* synthetic */ int f46245d;

        public C17863c(String str, Context context, C17859f fVar, int i) {
            this.f46242a = str;
            this.f46243b = context;
            this.f46244c = fVar;
            this.f46245d = i;
        }

        /* renamed from: a */
        public C17865e call() {
            try {
                return C17860g.m81362c(this.f46242a, this.f46243b, this.f46244c, this.f46245d);
            } catch (Throwable unused) {
                return new C17865e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.g$d */
    public class C17864d implements C17970d<C17865e> {

        /* renamed from: a */
        public final /* synthetic */ String f46246a;

        public C17864d(String str) {
            this.f46246a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((androidx.core.util.C17970d) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(androidx.core.provider.C17860g.C17865e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C17860g.f46235c
                monitor-enter(r0)
                androidx.collection.l<java.lang.String, java.util.ArrayList<androidx.core.util.d<androidx.core.provider.g$e>>> r1 = androidx.core.provider.C17860g.f46236d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f46246a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f46246a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.d r1 = (androidx.core.util.C17970d) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C17860g.C17864d.accept(androidx.core.provider.g$e):void");
        }
    }

    /* renamed from: a */
    public static String m81360a(@C0359n0 C17859f fVar, int i) {
        return fVar.mo52268d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m81361b(@C0359n0 C17866h.C17868b bVar) {
        int i = 1;
        if (bVar.mo52282c() == 0) {
            C17866h.C17869c[] b = bVar.mo52281b();
            if (!(b == null || b.length == 0)) {
                int length = b.length;
                i = 0;
                int i2 = 0;
                while (i2 < length) {
                    int b2 = b[i2].mo52283b();
                    if (b2 == 0) {
                        i2++;
                    } else if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
            return i;
        } else if (bVar.mo52282c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C17865e m81362c(@C0359n0 String str, @C0359n0 Context context, @C0359n0 C17859f fVar, int i) {
        C1879j<String, Typeface> jVar = f46233a;
        Typeface f = jVar.mo6246f(str);
        if (f != null) {
            return new C17865e(f);
        }
        try {
            C17866h.C17868b e = C17857e.m81347e(context, fVar, (CancellationSignal) null);
            int b = m81361b(e);
            if (b != 0) {
                return new C17865e(b);
            }
            Typeface d = C17530b1.m80352d(context, (CancellationSignal) null, e.mo52281b(), i);
            if (d == null) {
                return new C17865e(-3);
            }
            jVar.mo6250j(str, d);
            return new C17865e(d);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C17865e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new androidx.core.provider.C17860g.C17863c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f46234b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        androidx.core.provider.C17872i.m81393c(r8, r9, new androidx.core.provider.C17860g.C17864d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m81363d(@androidx.annotation.C0359n0 android.content.Context r5, @androidx.annotation.C0359n0 androidx.core.provider.C17859f r6, int r7, @androidx.annotation.C0363p0 java.util.concurrent.Executor r8, @androidx.annotation.C0359n0 androidx.core.provider.C17847a r9) {
        /*
            java.lang.String r0 = m81360a(r6, r7)
            androidx.collection.j<java.lang.String, android.graphics.Typeface> r1 = f46233a
            java.lang.Object r1 = r1.mo6246f(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.g$e r5 = new androidx.core.provider.g$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo52260b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.g$b r1 = new androidx.core.provider.g$b
            r1.<init>(r9)
            java.lang.Object r9 = f46235c
            monitor-enter(r9)
            androidx.collection.l<java.lang.String, java.util.ArrayList<androidx.core.util.d<androidx.core.provider.g$e>>> r2 = f46236d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            androidx.core.provider.g$c r9 = new androidx.core.provider.g$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f46234b
        L_0x0044:
            androidx.core.provider.g$d r5 = new androidx.core.provider.g$d
            r5.<init>(r0)
            androidx.core.provider.C17872i.m81393c(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C17860g.m81363d(android.content.Context, androidx.core.provider.f, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    public static Typeface m81364e(@C0359n0 Context context, @C0359n0 C17859f fVar, @C0359n0 C17847a aVar, int i, int i2) {
        String a = m81360a(fVar, i);
        Typeface f = f46233a.mo6246f(a);
        if (f != null) {
            aVar.mo52260b(new C17865e(f));
            return f;
        } else if (i2 == -1) {
            C17865e c = m81362c(a, context, fVar, i);
            aVar.mo52260b(c);
            return c.f46247a;
        } else {
            try {
                C17865e eVar = (C17865e) C17872i.m81394d(f46234b, new C17861a(a, context, fVar, i), i2);
                aVar.mo52260b(eVar);
                return eVar.f46247a;
            } catch (InterruptedException unused) {
                aVar.mo52260b(new C17865e(-3));
                return null;
            }
        }
    }

    /* renamed from: f */
    public static void m81365f() {
        f46233a.mo6244d();
    }

    /* renamed from: androidx.core.provider.g$e */
    public static final class C17865e {

        /* renamed from: a */
        public final Typeface f46247a;

        /* renamed from: b */
        public final int f46248b;

        public C17865e(int i) {
            this.f46247a = null;
            this.f46248b = i;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo52280a() {
            return this.f46248b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C17865e(@C0359n0 Typeface typeface) {
            this.f46247a = typeface;
            this.f46248b = 0;
        }
    }
}
