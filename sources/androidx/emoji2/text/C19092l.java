package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.C0323b0;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.provider.C17859f;
import androidx.core.provider.C17866h;
import androidx.core.util.C18001r;
import androidx.emoji2.text.C19019f;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.l */
public class C19092l extends C19019f.C19024d {

    /* renamed from: k */
    public static final C19094b f48583k = new C19094b();

    /* renamed from: androidx.emoji2.text.l$a */
    public static class C19093a extends C19097d {

        /* renamed from: a */
        public final long f48584a;

        /* renamed from: b */
        public long f48585b;

        public C19093a(long j) {
            this.f48584a = j;
        }

        /* renamed from: a */
        public long mo56285a() {
            if (this.f48585b == 0) {
                this.f48585b = SystemClock.uptimeMillis();
                return 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f48585b;
            if (uptimeMillis > this.f48584a) {
                return -1;
            }
            return Math.min(Math.max(uptimeMillis, 1000), this.f48584a - uptimeMillis);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.emoji2.text.l$b */
    public static class C19094b {
        @C0363p0
        /* renamed from: a */
        public Typeface mo56286a(@C0359n0 Context context, @C0359n0 C17866h.C17869c cVar) throws PackageManager.NameNotFoundException {
            return C17866h.m81371a(context, (CancellationSignal) null, new C17866h.C17869c[]{cVar});
        }

        @C0359n0
        /* renamed from: b */
        public C17866h.C17868b mo56287b(@C0359n0 Context context, @C0359n0 C17859f fVar) throws PackageManager.NameNotFoundException {
            return C17866h.m81372b(context, (CancellationSignal) null, fVar);
        }

        /* renamed from: c */
        public void mo56288c(@C0359n0 Context context, @C0359n0 Uri uri, @C0359n0 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* renamed from: d */
        public void mo56289d(@C0359n0 Context context, @C0359n0 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    public static class C19095c implements C19019f.C19030j {

        /* renamed from: l */
        public static final String f48586l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        @C0359n0

        /* renamed from: a */
        public final Context f48587a;
        @C0359n0

        /* renamed from: b */
        public final C17859f f48588b;
        @C0359n0

        /* renamed from: c */
        public final C19094b f48589c;
        @C0359n0

        /* renamed from: d */
        public final Object f48590d = new Object();
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: e */
        public Handler f48591e;
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: f */
        public Executor f48592f;
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: g */
        public ThreadPoolExecutor f48593g;
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: h */
        public C19097d f48594h;
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: i */
        public C19019f.C19031k f48595i;
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: j */
        public ContentObserver f48596j;
        @C0363p0
        @C0323b0("mLock")

        /* renamed from: k */
        public Runnable f48597k;

        /* renamed from: androidx.emoji2.text.l$c$a */
        public class C19096a extends ContentObserver {
            public C19096a(Handler handler) {
                super(handler);
            }

            public void onChange(boolean z, Uri uri) {
                C19095c.this.mo56292d();
            }
        }

        public C19095c(@C0359n0 Context context, @C0359n0 C17859f fVar, @C0359n0 C19094b bVar) {
            C18001r.m81776m(context, "Context cannot be null");
            C18001r.m81776m(fVar, "FontRequest cannot be null");
            this.f48587a = context.getApplicationContext();
            this.f48588b = fVar;
            this.f48589c = bVar;
        }

        @C0376v0(19)
        /* renamed from: a */
        public void mo55938a(@C0359n0 C19019f.C19031k kVar) {
            C18001r.m81776m(kVar, "LoaderCallback cannot be null");
            synchronized (this.f48590d) {
                this.f48595i = kVar;
            }
            mo56292d();
        }

        /* renamed from: b */
        public final void mo56290b() {
            synchronized (this.f48590d) {
                this.f48595i = null;
                ContentObserver contentObserver = this.f48596j;
                if (contentObserver != null) {
                    this.f48589c.mo56289d(this.f48587a, contentObserver);
                    this.f48596j = null;
                }
                Handler handler = this.f48591e;
                if (handler != null) {
                    handler.removeCallbacks(this.f48597k);
                }
                this.f48591e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f48593g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f48592f = null;
                this.f48593g = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r7.f48590d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r3 = r7.f48594h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
            if (r3 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
            r3 = r3.mo56285a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            if (r3 < 0) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
            mo56294f(r0.mo52285d(), r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0034, code lost:
            if (r1 != 0) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            androidx.core.p027os.C17821p0.m81248b(f48586l);
            r1 = r7.f48589c.mo56286a(r7.f48587a, r0);
            r0 = androidx.core.graphics.C17599i2.m80648f(r7.f48587a, (android.os.CancellationSignal) null, r0.mo52285d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
            if (r0 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
            if (r1 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
            r0 = androidx.emoji2.text.C19105p.m89420e(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            androidx.core.p027os.C17821p0.m81250d();
            r1 = r7.f48590d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x005b, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r2 = r7.f48595i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
            if (r2 == null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0060, code lost:
            r2.mo55941b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            mo56290b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0072, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            androidx.core.p027os.C17821p0.m81250d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0077, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0093, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0094, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
            monitor-enter(r7.f48590d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            r2 = r7.f48595i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x009a, code lost:
            if (r2 != null) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x009c, code lost:
            r2.mo55940a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a0, code lost:
            mo56290b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = mo56293e();
            r1 = r0.mo52283b();
         */
        @androidx.annotation.C0348i1
        @androidx.annotation.C0376v0(19)
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo56291c() {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f48590d
                monitor-enter(r0)
                androidx.emoji2.text.f$k r1 = r7.f48595i     // Catch:{ all -> 0x00a7 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
                androidx.core.provider.h$c r0 = r7.mo56293e()     // Catch:{ all -> 0x0094 }
                int r1 = r0.mo52283b()     // Catch:{ all -> 0x0094 }
                r2 = 2
                if (r1 != r2) goto L_0x0034
                java.lang.Object r2 = r7.f48590d     // Catch:{ all -> 0x0094 }
                monitor-enter(r2)     // Catch:{ all -> 0x0094 }
                androidx.emoji2.text.l$d r3 = r7.f48594h     // Catch:{ all -> 0x0031 }
                if (r3 == 0) goto L_0x002f
                long r3 = r3.mo56285a()     // Catch:{ all -> 0x0031 }
                r5 = 0
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x002f
                android.net.Uri r0 = r0.mo52285d()     // Catch:{ all -> 0x0031 }
                r7.mo56294f(r0, r3)     // Catch:{ all -> 0x0031 }
                monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                return
            L_0x002f:
                monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                goto L_0x0034
            L_0x0031:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x0034:
                if (r1 != 0) goto L_0x0078
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.p027os.C17821p0.m81248b(r1)     // Catch:{ all -> 0x0073 }
                androidx.emoji2.text.l$b r1 = r7.f48589c     // Catch:{ all -> 0x0073 }
                android.content.Context r2 = r7.f48587a     // Catch:{ all -> 0x0073 }
                android.graphics.Typeface r1 = r1.mo56286a(r2, r0)     // Catch:{ all -> 0x0073 }
                android.content.Context r2 = r7.f48587a     // Catch:{ all -> 0x0073 }
                android.net.Uri r0 = r0.mo52285d()     // Catch:{ all -> 0x0073 }
                r3 = 0
                java.nio.ByteBuffer r0 = androidx.core.graphics.C17599i2.m80648f(r2, r3, r0)     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x006b
                if (r1 == 0) goto L_0x006b
                androidx.emoji2.text.p r0 = androidx.emoji2.text.C19105p.m89420e(r1, r0)     // Catch:{ all -> 0x0073 }
                androidx.core.p027os.C17821p0.m81250d()     // Catch:{ all -> 0x0094 }
                java.lang.Object r1 = r7.f48590d     // Catch:{ all -> 0x0094 }
                monitor-enter(r1)     // Catch:{ all -> 0x0094 }
                androidx.emoji2.text.f$k r2 = r7.f48595i     // Catch:{ all -> 0x0068 }
                if (r2 == 0) goto L_0x0063
                r2.mo55941b(r0)     // Catch:{ all -> 0x0068 }
            L_0x0063:
                monitor-exit(r1)     // Catch:{ all -> 0x0068 }
                r7.mo56290b()     // Catch:{ all -> 0x0094 }
                goto L_0x00a3
            L_0x0068:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0068 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x006b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x0073 }
                throw r0     // Catch:{ all -> 0x0073 }
            L_0x0073:
                r0 = move-exception
                androidx.core.p027os.C17821p0.m81250d()     // Catch:{ all -> 0x0094 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x0078:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0094 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
                r2.<init>()     // Catch:{ all -> 0x0094 }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x0094 }
                r2.append(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0094 }
                r0.<init>(r1)     // Catch:{ all -> 0x0094 }
                throw r0     // Catch:{ all -> 0x0094 }
            L_0x0094:
                r0 = move-exception
                java.lang.Object r1 = r7.f48590d
                monitor-enter(r1)
                androidx.emoji2.text.f$k r2 = r7.f48595i     // Catch:{ all -> 0x00a4 }
                if (r2 == 0) goto L_0x009f
                r2.mo55940a(r0)     // Catch:{ all -> 0x00a4 }
            L_0x009f:
                monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
                r7.mo56290b()
            L_0x00a3:
                return
            L_0x00a4:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
                throw r0
            L_0x00a7:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C19092l.C19095c.mo56291c():void");
        }

        @C0376v0(19)
        /* renamed from: d */
        public void mo56292d() {
            synchronized (this.f48590d) {
                if (this.f48595i != null) {
                    if (this.f48592f == null) {
                        ThreadPoolExecutor c = C19011c.m88838c("emojiCompat");
                        this.f48593g = c;
                        this.f48592f = c;
                    }
                    this.f48592f.execute(new C19098m(this));
                }
            }
        }

        @C0348i1
        /* renamed from: e */
        public final C17866h.C17869c mo56293e() {
            try {
                C17866h.C17868b b = this.f48589c.mo56287b(this.f48587a, this.f48588b);
                if (b.mo52282c() == 0) {
                    C17866h.C17869c[] b2 = b.mo52281b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo52282c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @C0348i1
        @C0376v0(19)
        /* renamed from: f */
        public final void mo56294f(Uri uri, long j) {
            synchronized (this.f48590d) {
                Handler handler = this.f48591e;
                if (handler == null) {
                    handler = C19011c.m88840e();
                    this.f48591e = handler;
                }
                if (this.f48596j == null) {
                    C19096a aVar = new C19096a(handler);
                    this.f48596j = aVar;
                    this.f48589c.mo56288c(this.f48587a, uri, aVar);
                }
                if (this.f48597k == null) {
                    this.f48597k = new C19099n(this);
                }
                handler.postDelayed(this.f48597k, j);
            }
        }

        /* renamed from: g */
        public void mo56295g(@C0359n0 Executor executor) {
            synchronized (this.f48590d) {
                this.f48592f = executor;
            }
        }

        /* renamed from: h */
        public void mo56296h(@C0363p0 C19097d dVar) {
            synchronized (this.f48590d) {
                this.f48594h = dVar;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.l$d */
    public static abstract class C19097d {
        /* renamed from: a */
        public abstract long mo56285a();
    }

    public C19092l(@C0359n0 Context context, @C0359n0 C17859f fVar) {
        super(new C19095c(context, fVar, f48583k));
    }

    @C0359n0
    @Deprecated
    /* renamed from: l */
    public C19092l mo56282l(@C0363p0 Handler handler) {
        if (handler == null) {
            return this;
        }
        mo56283m(C19011c.m88837b(handler));
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C19092l mo56283m(@C0359n0 Executor executor) {
        ((C19095c) mo55987a()).mo56295g(executor);
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C19092l mo56284n(@C0363p0 C19097d dVar) {
        ((C19095c) mo55987a()).mo56296h(dVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C19092l(@C0359n0 Context context, @C0359n0 C17859f fVar, @C0359n0 C19094b bVar) {
        super(new C19095c(context, fVar, bVar));
    }
}
