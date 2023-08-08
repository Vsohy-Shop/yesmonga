package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import com.bumptech.glide.C22048d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22279h;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.load.engine.C22216e;
import com.bumptech.glide.load.engine.C22232g;
import com.bumptech.glide.load.engine.cache.C22185a;
import com.bumptech.glide.load.resource.bitmap.C22439v;
import com.bumptech.glide.util.C22628i;
import com.bumptech.glide.util.pool.C22639a;
import com.bumptech.glide.util.pool.C22647b;
import com.bumptech.glide.util.pool.C22648c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecodeJob<R> implements C22216e.C22217a, Runnable, Comparable<DecodeJob<?>>, C22639a.C22645f {

    /* renamed from: V0 */
    public static final String f56860V0 = "DecodeJob";

    /* renamed from: E0 */
    public C22143b<R> f56861E0;

    /* renamed from: F0 */
    public int f56862F0;

    /* renamed from: G0 */
    public Stage f56863G0;

    /* renamed from: H0 */
    public RunReason f56864H0;

    /* renamed from: I0 */
    public long f56865I0;

    /* renamed from: J0 */
    public boolean f56866J0;

    /* renamed from: K0 */
    public Object f56867K0;

    /* renamed from: L0 */
    public Thread f56868L0;

    /* renamed from: M0 */
    public C22108c f56869M0;

    /* renamed from: N0 */
    public C22108c f56870N0;

    /* renamed from: O0 */
    public Object f56871O0;

    /* renamed from: P0 */
    public DataSource f56872P0;

    /* renamed from: Q0 */
    public C22114d<?> f56873Q0;

    /* renamed from: R0 */
    public volatile C22216e f56874R0;

    /* renamed from: S0 */
    public volatile boolean f56875S0;

    /* renamed from: T0 */
    public volatile boolean f56876T0;

    /* renamed from: U0 */
    public boolean f56877U0;

    /* renamed from: X */
    public int f56878X;

    /* renamed from: Y */
    public C22234h f56879Y;

    /* renamed from: Z */
    public C22277f f56880Z;

    /* renamed from: a */
    public final C22231f<R> f56881a = new C22231f<>();

    /* renamed from: b */
    public final List<Throwable> f56882b = new ArrayList();

    /* renamed from: c */
    public final C22648c f56883c = C22648c.m102683a();

    /* renamed from: d */
    public final C22146e f56884d;

    /* renamed from: e */
    public final C17997q.C17998a<DecodeJob<?>> f56885e;

    /* renamed from: f */
    public final C22145d<?> f56886f = new C22145d<>();

    /* renamed from: g */
    public final C22147f f56887g = new C22147f();

    /* renamed from: v */
    public C22048d f56888v;

    /* renamed from: w */
    public C22108c f56889w;

    /* renamed from: x */
    public Priority f56890x;

    /* renamed from: y */
    public C22254l f56891y;

    /* renamed from: z */
    public int f56892z;

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C22142a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56904a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f56905b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f56906c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56906c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f56906c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f56905b = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f56905b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f56905b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f56905b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f56905b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f56904a = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f56904a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f56904a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.C22142a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface C22143b<R> {
        /* renamed from: c */
        void mo65877c(C22270s<R> sVar, DataSource dataSource, boolean z);

        /* renamed from: d */
        void mo65878d(GlideException glideException);

        /* renamed from: e */
        void mo65879e(DecodeJob<?> decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C22144c<Z> implements C22232g.C22233a<Z> {

        /* renamed from: a */
        public final DataSource f56907a;

        public C22144c(DataSource dataSource) {
            this.f56907a = dataSource;
        }

        @C0359n0
        /* renamed from: a */
        public C22270s<Z> mo65880a(@C0359n0 C22270s<Z> sVar) {
            return DecodeJob.this.mo65872t0(this.f56907a, sVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C22145d<Z> {

        /* renamed from: a */
        public C22108c f56909a;

        /* renamed from: b */
        public C22279h<Z> f56910b;

        /* renamed from: c */
        public C22268r<Z> f56911c;

        /* renamed from: a */
        public void mo65881a() {
            this.f56909a = null;
            this.f56910b = null;
            this.f56911c = null;
        }

        /* renamed from: b */
        public void mo65882b(C22146e eVar, C22277f fVar) {
            C22647b.m102675a("DecodeJob.encode");
            try {
                eVar.mo65885a().mo66022a(this.f56909a, new C22215d(this.f56910b, this.f56911c, fVar));
            } finally {
                this.f56911c.mo66219f();
                C22647b.m102680f();
            }
        }

        /* renamed from: c */
        public boolean mo65883c() {
            return this.f56911c != null;
        }

        /* renamed from: d */
        public <X> void mo65884d(C22108c cVar, C22279h<X> hVar, C22268r<X> rVar) {
            this.f56909a = cVar;
            this.f56910b = hVar;
            this.f56911c = rVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface C22146e {
        /* renamed from: a */
        C22185a mo65885a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C22147f {

        /* renamed from: a */
        public boolean f56912a;

        /* renamed from: b */
        public boolean f56913b;

        /* renamed from: c */
        public boolean f56914c;

        /* renamed from: a */
        public final boolean mo65886a(boolean z) {
            return (this.f56914c || z || this.f56913b) && this.f56912a;
        }

        /* renamed from: b */
        public synchronized boolean mo65887b() {
            this.f56913b = true;
            return mo65886a(false);
        }

        /* renamed from: c */
        public synchronized boolean mo65888c() {
            this.f56914c = true;
            return mo65886a(false);
        }

        /* renamed from: d */
        public synchronized boolean mo65889d(boolean z) {
            this.f56912a = true;
            return mo65886a(z);
        }

        /* renamed from: e */
        public synchronized void mo65890e() {
            this.f56913b = false;
            this.f56912a = false;
            this.f56914c = false;
        }
    }

    public DecodeJob(C22146e eVar, C17997q.C17998a<DecodeJob<?>> aVar) {
        this.f56884d = eVar;
        this.f56885e = aVar;
    }

    /* renamed from: A0 */
    public final void mo65846A0() {
        this.f56887g.mo65890e();
        this.f56886f.mo65881a();
        this.f56881a.mo66092a();
        this.f56875S0 = false;
        this.f56888v = null;
        this.f56889w = null;
        this.f56880Z = null;
        this.f56890x = null;
        this.f56891y = null;
        this.f56861E0 = null;
        this.f56863G0 = null;
        this.f56874R0 = null;
        this.f56868L0 = null;
        this.f56869M0 = null;
        this.f56871O0 = null;
        this.f56872P0 = null;
        this.f56873Q0 = null;
        this.f56865I0 = 0;
        this.f56876T0 = false;
        this.f56867K0 = null;
        this.f56882b.clear();
        this.f56885e.mo52468a(this);
    }

    /* renamed from: C0 */
    public final void mo65847C0() {
        this.f56868L0 = Thread.currentThread();
        this.f56865I0 = C22628i.m102603b();
        boolean z = false;
        while (!this.f56876T0 && this.f56874R0 != null && !(z = this.f56874R0.mo65922a())) {
            this.f56863G0 = mo65855X(this.f56863G0);
            this.f56874R0 = mo65854W();
            if (this.f56863G0 == Stage.SOURCE) {
                mo65869q();
                return;
            }
        }
        if ((this.f56863G0 == Stage.FINISHED || this.f56876T0) && !z) {
            mo65866n0();
        }
    }

    /* renamed from: F0 */
    public final <Data, ResourceType> C22270s<R> mo65848F0(Data data, DataSource dataSource, C22267q<Data, ResourceType, R> qVar) throws GlideException {
        C22277f Z = mo65856Z(dataSource);
        C22116e l = this.f56888v.mo65525i().mo65451l(data);
        try {
            return qVar.mo66214b(l, Z, this.f56892z, this.f56878X, new C22144c(dataSource));
        } finally {
            l.mo65778b();
        }
    }

    /* renamed from: H0 */
    public final void mo65849H0() {
        int i = C22142a.f56904a[this.f56864H0.ordinal()];
        if (i == 1) {
            this.f56863G0 = mo65855X(Stage.INITIALIZE);
            this.f56874R0 = mo65854W();
            mo65847C0();
        } else if (i == 2) {
            mo65847C0();
        } else if (i == 3) {
            mo65853Q();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f56864H0);
        }
    }

    /* renamed from: K0 */
    public final void mo65850K0() {
        Throwable th;
        this.f56883c.mo67017c();
        if (this.f56875S0) {
            if (this.f56882b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f56882b;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f56875S0 = true;
    }

    /* renamed from: L0 */
    public boolean mo65851L0() {
        Stage X = mo65855X(Stage.INITIALIZE);
        if (X == Stage.RESOURCE_CACHE || X == Stage.DATA_CACHE) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final <Data> C22270s<R> mo65852M(Data data, DataSource dataSource) throws GlideException {
        return mo65848F0(data, dataSource, this.f56881a.mo66099h(data.getClass()));
    }

    /* renamed from: Q */
    public final void mo65853Q() {
        C22270s<R> sVar;
        if (Log.isLoggable(f56860V0, 2)) {
            long j = this.f56865I0;
            mo65863i0("Retrieved data", j, "data: " + this.f56871O0 + ", cache key: " + this.f56869M0 + ", fetcher: " + this.f56873Q0);
        }
        try {
            sVar = mo65876z(this.f56873Q0, this.f56871O0, this.f56872P0);
        } catch (GlideException e) {
            e.mo65899j(this.f56870N0, this.f56872P0);
            this.f56882b.add(e);
            sVar = null;
        }
        if (sVar != null) {
            mo65865m0(sVar, this.f56872P0, this.f56877U0);
        } else {
            mo65847C0();
        }
    }

    /* renamed from: W */
    public final C22216e mo65854W() {
        int i = C22142a.f56905b[this.f56863G0.ordinal()];
        if (i == 1) {
            return new C22271t(this.f56881a, this);
        }
        if (i == 2) {
            return new C22155b(this.f56881a, this);
        }
        if (i == 3) {
            return new C22275w(this.f56881a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f56863G0);
    }

    /* renamed from: X */
    public final Stage mo65855X(Stage stage) {
        int i = C22142a.f56905b[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return Stage.FINISHED;
                }
                if (i != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                } else if (this.f56879Y.mo66122b()) {
                    return Stage.RESOURCE_CACHE;
                } else {
                    return mo65855X(Stage.RESOURCE_CACHE);
                }
            } else if (this.f56866J0) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f56879Y.mo66121a()) {
            return Stage.DATA_CACHE;
        } else {
            return mo65855X(Stage.DATA_CACHE);
        }
    }

    @C0359n0
    /* renamed from: Z */
    public final C22277f mo65856Z(DataSource dataSource) {
        boolean z;
        C22277f fVar = this.f56880Z;
        if (Build.VERSION.SDK_INT < 26) {
            return fVar;
        }
        if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.f56881a.mo66115x()) {
            z = true;
        } else {
            z = false;
        }
        C22139e eVar = C22439v.f57571k;
        Boolean bool = (Boolean) fVar.mo66232c(eVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return fVar;
        }
        C22277f fVar2 = new C22277f();
        fVar2.mo66233d(this.f56880Z);
        fVar2.mo66234e(eVar, Boolean.valueOf(z));
        return fVar2;
    }

    /* renamed from: b */
    public void mo65857b(C22108c cVar, Exception exc, C22114d<?> dVar, DataSource dataSource) {
        dVar.mo65789b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo65900k(cVar, dataSource, dVar.mo65784a());
        this.f56882b.add(glideException);
        if (Thread.currentThread() != this.f56868L0) {
            this.f56864H0 = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f56861E0.mo65879e(this);
            return;
        }
        mo65847C0();
    }

    /* renamed from: e0 */
    public final int mo65859e0() {
        return this.f56890x.ordinal();
    }

    /* renamed from: f0 */
    public DecodeJob<R> mo65860f0(C22048d dVar, Object obj, C22254l lVar, C22108c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C22234h hVar, Map<Class<?>, C22280i<?>> map, boolean z, boolean z2, boolean z3, C22277f fVar, C22143b<R> bVar, int i3) {
        this.f56881a.mo66113v(dVar, obj, cVar, i, i2, hVar, cls, cls2, priority, fVar, map, z, z2, this.f56884d);
        this.f56888v = dVar;
        this.f56889w = cVar;
        this.f56890x = priority;
        this.f56891y = lVar;
        this.f56892z = i;
        this.f56878X = i2;
        this.f56879Y = hVar;
        this.f56866J0 = z3;
        this.f56880Z = fVar;
        this.f56861E0 = bVar;
        this.f56862F0 = i3;
        this.f56864H0 = RunReason.INITIALIZE;
        this.f56867K0 = obj;
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C22648c mo65861g() {
        return this.f56883c;
    }

    /* renamed from: h0 */
    public final void mo65862h0(String str, long j) {
        mo65863i0(str, j, (String) null);
    }

    /* renamed from: i0 */
    public final void mo65863i0(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C22628i.m102602a(j));
        sb.append(", load key: ");
        sb.append(this.f56891y);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    /* renamed from: j0 */
    public final void mo65864j0(C22270s<R> sVar, DataSource dataSource, boolean z) {
        mo65850K0();
        this.f56861E0.mo65877c(sVar, dataSource, z);
    }

    /* renamed from: m0 */
    public final void mo65865m0(C22270s<R> sVar, DataSource dataSource, boolean z) {
        C22268r<R> rVar;
        C22268r<R> rVar2;
        C22647b.m102675a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (sVar instanceof C22258o) {
                ((C22258o) sVar).mo66184b();
            }
            if (this.f56886f.mo65883c()) {
                C22268r<R> d = C22268r.m101310d(sVar);
                rVar2 = d;
                rVar = d;
            } else {
                rVar2 = null;
                rVar = sVar;
            }
            mo65864j0(rVar, dataSource, z);
            this.f56863G0 = Stage.ENCODE;
            if (this.f56886f.mo65883c()) {
                this.f56886f.mo65882b(this.f56884d, this.f56880Z);
            }
            if (rVar2 != null) {
                rVar2.mo66219f();
            }
            mo65867o0();
            C22647b.m102680f();
        } catch (Throwable th) {
            C22647b.m102680f();
            throw th;
        }
    }

    /* renamed from: n0 */
    public final void mo65866n0() {
        mo65850K0();
        this.f56861E0.mo65878d(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f56882b)));
        mo65868p0();
    }

    /* renamed from: o0 */
    public final void mo65867o0() {
        if (this.f56887g.mo65887b()) {
            mo65846A0();
        }
    }

    /* renamed from: p0 */
    public final void mo65868p0() {
        if (this.f56887g.mo65888c()) {
            mo65846A0();
        }
    }

    /* renamed from: q */
    public void mo65869q() {
        this.f56864H0 = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f56861E0.mo65879e(this);
    }

    /* renamed from: r */
    public void mo65870r(C22108c cVar, Object obj, C22114d<?> dVar, DataSource dataSource, C22108c cVar2) {
        this.f56869M0 = cVar;
        this.f56871O0 = obj;
        this.f56873Q0 = dVar;
        this.f56872P0 = dataSource;
        this.f56870N0 = cVar2;
        boolean z = false;
        if (cVar != this.f56881a.mo66094c().get(0)) {
            z = true;
        }
        this.f56877U0 = z;
        if (Thread.currentThread() != this.f56868L0) {
            this.f56864H0 = RunReason.DECODE_DATA;
            this.f56861E0.mo65879e(this);
            return;
        }
        C22647b.m102675a("DecodeJob.decodeFromRetrievedData");
        try {
            mo65853Q();
        } finally {
            C22647b.m102680f();
        }
    }

    public void run() {
        C22647b.m102678d("DecodeJob#run(reason=%s, model=%s)", this.f56864H0, this.f56867K0);
        C22114d<?> dVar = this.f56873Q0;
        try {
            if (this.f56876T0) {
                mo65866n0();
                if (dVar != null) {
                    dVar.mo65789b();
                }
                C22647b.m102680f();
                return;
            }
            mo65849H0();
            if (dVar != null) {
                dVar.mo65789b();
            }
            C22647b.m102680f();
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo65789b();
            }
            C22647b.m102680f();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0359n0
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.engine.C22270s<Z> mo65872t0(com.bumptech.glide.load.DataSource r12, @androidx.annotation.C0359n0 com.bumptech.glide.load.engine.C22270s<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.f<R> r0 = r11.f56881a
            com.bumptech.glide.load.i r0 = r0.mo66110s(r8)
            com.bumptech.glide.d r2 = r11.f56888v
            int r3 = r11.f56892z
            int r4 = r11.f56878X
            com.bumptech.glide.load.engine.s r2 = r0.mo65776a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo66175a()
        L_0x002b:
            com.bumptech.glide.load.engine.f<R> r13 = r11.f56881a
            boolean r13 = r13.mo66114w(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.f<R> r13 = r11.f56881a
            com.bumptech.glide.load.h r1 = r13.mo66105n(r0)
            com.bumptech.glide.load.f r13 = r11.f56880Z
            com.bumptech.glide.load.EncodeStrategy r13 = r1.mo66238b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.f<R> r1 = r11.f56881a
            com.bumptech.glide.load.c r2 = r11.f56869M0
            boolean r1 = r1.mo66116y(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.engine.h r3 = r11.f56879Y
            boolean r12 = r3.mo66124d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.DecodeJob.C22142a.f56906c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.u r12 = new com.bumptech.glide.load.engine.u
            com.bumptech.glide.load.engine.f<R> r13 = r11.f56881a
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r13.mo66093b()
            com.bumptech.glide.load.c r3 = r11.f56869M0
            com.bumptech.glide.load.c r4 = r11.f56889w
            int r5 = r11.f56892z
            int r6 = r11.f56878X
            com.bumptech.glide.load.f r9 = r11.f56880Z
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.c r12 = new com.bumptech.glide.load.engine.c
            com.bumptech.glide.load.c r13 = r11.f56869M0
            com.bumptech.glide.load.c r1 = r11.f56889w
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.C22268r.m101310d(r0)
            com.bumptech.glide.load.engine.DecodeJob$d<?> r13 = r11.f56886f
            r13.mo65884d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.mo65872t0(com.bumptech.glide.load.DataSource, com.bumptech.glide.load.engine.s):com.bumptech.glide.load.engine.s");
    }

    /* renamed from: u0 */
    public void mo65873u0(boolean z) {
        if (this.f56887g.mo65889d(z)) {
            mo65846A0();
        }
    }

    /* renamed from: w */
    public void mo65874w() {
        this.f56876T0 = true;
        C22216e eVar = this.f56874R0;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* renamed from: y */
    public int compareTo(@C0359n0 DecodeJob<?> decodeJob) {
        int e0 = mo65859e0() - decodeJob.mo65859e0();
        if (e0 == 0) {
            return this.f56862F0 - decodeJob.f56862F0;
        }
        return e0;
    }

    /* renamed from: z */
    public final <Data> C22270s<R> mo65876z(C22114d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.mo65789b();
            return null;
        }
        try {
            long b = C22628i.m102603b();
            C22270s<R> M = mo65852M(data, dataSource);
            if (Log.isLoggable(f56860V0, 2)) {
                mo65862h0("Decoded result " + M, b);
            }
            return M;
        } finally {
            dVar.mo65789b();
        }
    }
}
