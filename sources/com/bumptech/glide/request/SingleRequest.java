package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import com.bumptech.glide.C22040c;
import com.bumptech.glide.C22048d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C22240i;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.C22462h;
import com.bumptech.glide.request.target.C22583o;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.request.transition.C22600g;
import com.bumptech.glide.util.C22628i;
import com.bumptech.glide.util.C22635o;
import com.bumptech.glide.util.pool.C22647b;
import com.bumptech.glide.util.pool.C22648c;
import com.google.firebase.installations.local.C33093b;
import java.util.List;
import java.util.concurrent.Executor;

public final class SingleRequest<R> implements C22557e, C22583o, C22562i {

    /* renamed from: E */
    public static final String f57781E = "GlideRequest";

    /* renamed from: F */
    public static final String f57782F = "Glide";

    /* renamed from: G */
    public static final boolean f57783G = Log.isLoggable(f57781E, 2);
    @C0323b0("requestLock")

    /* renamed from: A */
    public int f57784A;
    @C0323b0("requestLock")

    /* renamed from: B */
    public int f57785B;
    @C0323b0("requestLock")

    /* renamed from: C */
    public boolean f57786C;
    @C0363p0

    /* renamed from: D */
    public RuntimeException f57787D;

    /* renamed from: a */
    public int f57788a;
    @C0363p0

    /* renamed from: b */
    public final String f57789b;

    /* renamed from: c */
    public final C22648c f57790c;

    /* renamed from: d */
    public final Object f57791d;
    @C0363p0

    /* renamed from: e */
    public final C22560g<R> f57792e;

    /* renamed from: f */
    public final RequestCoordinator f57793f;

    /* renamed from: g */
    public final Context f57794g;

    /* renamed from: h */
    public final C22048d f57795h;
    @C0363p0

    /* renamed from: i */
    public final Object f57796i;

    /* renamed from: j */
    public final Class<R> f57797j;

    /* renamed from: k */
    public final C22553a<?> f57798k;

    /* renamed from: l */
    public final int f57799l;

    /* renamed from: m */
    public final int f57800m;

    /* renamed from: n */
    public final Priority f57801n;

    /* renamed from: o */
    public final C22584p<R> f57802o;
    @C0363p0

    /* renamed from: p */
    public final List<C22560g<R>> f57803p;

    /* renamed from: q */
    public final C22600g<? super R> f57804q;

    /* renamed from: r */
    public final Executor f57805r;
    @C0323b0("requestLock")

    /* renamed from: s */
    public C22270s<R> f57806s;
    @C0323b0("requestLock")

    /* renamed from: t */
    public C22240i.C22246d f57807t;
    @C0323b0("requestLock")

    /* renamed from: u */
    public long f57808u;

    /* renamed from: v */
    public volatile C22240i f57809v;
    @C0323b0("requestLock")

    /* renamed from: w */
    public Status f57810w;
    @C0363p0
    @C0323b0("requestLock")

    /* renamed from: x */
    public Drawable f57811x;
    @C0363p0
    @C0323b0("requestLock")

    /* renamed from: y */
    public Drawable f57812y;
    @C0363p0
    @C0323b0("requestLock")

    /* renamed from: z */
    public Drawable f57813z;

    public enum Status {
        PENDING,
        f57815b,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C22048d dVar, @C0359n0 Object obj, @C0363p0 Object obj2, Class<R> cls, C22553a<?> aVar, int i, int i2, Priority priority, C22584p<R> pVar, @C0363p0 C22560g<R> gVar, @C0363p0 List<C22560g<R>> list, RequestCoordinator requestCoordinator, C22240i iVar, C22600g<? super R> gVar2, Executor executor) {
        String str;
        if (f57783G) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f57789b = str;
        this.f57790c = C22648c.m102683a();
        this.f57791d = obj;
        this.f57794g = context;
        this.f57795h = dVar;
        this.f57796i = obj2;
        this.f57797j = cls;
        this.f57798k = aVar;
        this.f57799l = i;
        this.f57800m = i2;
        this.f57801n = priority;
        this.f57802o = pVar;
        this.f57792e = gVar;
        this.f57803p = list;
        this.f57793f = requestCoordinator;
        this.f57809v = iVar;
        this.f57804q = gVar2;
        this.f57805r = executor;
        this.f57810w = Status.PENDING;
        if (this.f57787D == null && dVar.mo65523g().mo65571b(C22040c.C22045e.class)) {
            this.f57787D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: v */
    public static int m102217v(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: y */
    public static <R> SingleRequest<R> m102218y(Context context, C22048d dVar, Object obj, Object obj2, Class<R> cls, C22553a<?> aVar, int i, int i2, Priority priority, C22584p<R> pVar, C22560g<R> gVar, @C0363p0 List<C22560g<R>> list, RequestCoordinator requestCoordinator, C22240i iVar, C22600g<? super R> gVar2, Executor executor) {
        return new SingleRequest(context, dVar, obj, obj2, cls, aVar, i, i2, priority, pVar, gVar, list, requestCoordinator, iVar, gVar2, executor);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[Catch:{ all -> 0x00b6 }] */
    @androidx.annotation.C0323b0("requestLock")
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66702A(com.bumptech.glide.load.engine.C22270s<R> r10, R r11, com.bumptech.glide.load.DataSource r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.mo66725s()
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r9.f57810w = r0
            r9.f57806s = r10
            com.bumptech.glide.d r10 = r9.f57795h
            int r10 = r10.mo65524h()
            r0 = 3
            if (r10 > r0) goto L_0x0061
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f57796i
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f57784A
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f57785B
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f57808u
            double r0 = com.bumptech.glide.util.C22628i.m102602a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
        L_0x0061:
            r10 = 1
            r9.f57786C = r10
            r6 = 0
            java.util.List<com.bumptech.glide.request.g<R>> r0 = r9.f57803p     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b6 }
            r8 = r6
        L_0x006e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b6 }
            com.bumptech.glide.request.g r0 = (com.bumptech.glide.request.C22560g) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r9.f57796i     // Catch:{ all -> 0x00b6 }
            com.bumptech.glide.request.target.p<R> r3 = r9.f57802o     // Catch:{ all -> 0x00b6 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo66827f(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            r8 = r8 | r0
            goto L_0x006e
        L_0x0087:
            r8 = r6
        L_0x0088:
            com.bumptech.glide.request.g<R> r0 = r9.f57792e     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r2 = r9.f57796i     // Catch:{ all -> 0x00b6 }
            com.bumptech.glide.request.target.p<R> r3 = r9.f57802o     // Catch:{ all -> 0x00b6 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo66827f(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r10 = r6
        L_0x009b:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00a9
            com.bumptech.glide.request.transition.g<? super R> r10 = r9.f57804q     // Catch:{ all -> 0x00b6 }
            com.bumptech.glide.request.transition.f r10 = r10.mo66937a(r12, r13)     // Catch:{ all -> 0x00b6 }
            com.bumptech.glide.request.target.p<R> r12 = r9.f57802o     // Catch:{ all -> 0x00b6 }
            r12.mo65592l(r11, r10)     // Catch:{ all -> 0x00b6 }
        L_0x00a9:
            r9.f57786C = r6
            r9.mo66730x()
            java.lang.String r10 = "GlideRequest"
            int r11 = r9.f57788a
            com.bumptech.glide.util.pool.C22647b.m102681g(r10, r11)
            return
        L_0x00b6:
            r10 = move-exception
            r9.f57786C = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo66702A(com.bumptech.glide.load.engine.s, java.lang.Object, com.bumptech.glide.load.DataSource, boolean):void");
    }

    @C0323b0("requestLock")
    /* renamed from: B */
    public final void mo66703B() {
        Drawable drawable;
        if (mo66718l()) {
            if (this.f57796i == null) {
                drawable = mo66723q();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                drawable = mo66722p();
            }
            if (drawable == null) {
                drawable = mo66724r();
            }
            this.f57802o.mo65594o(drawable);
        }
    }

    /* renamed from: Z */
    public void mo66704Z() {
        synchronized (this.f57791d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: a */
    public boolean mo66705a() {
        boolean z;
        synchronized (this.f57791d) {
            if (this.f57810w == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo66706b() {
        boolean z;
        synchronized (this.f57791d) {
            if (this.f57810w == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo66707c(C22270s<?> sVar, DataSource dataSource, boolean z) {
        Object obj;
        String str;
        this.f57790c.mo67017c();
        C22270s<?> sVar2 = null;
        try {
            synchronized (this.f57791d) {
                try {
                    this.f57807t = null;
                    if (sVar == null) {
                        mo66709d(new GlideException("Expected to receive a Resource<R> with an object of " + this.f57797j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = sVar.get();
                    if (obj2 != null) {
                        if (this.f57797j.isAssignableFrom(obj2.getClass())) {
                            if (!mo66719m()) {
                                try {
                                    this.f57806s = null;
                                    this.f57810w = Status.COMPLETE;
                                    C22647b.m102681g(f57781E, this.f57788a);
                                    this.f57809v.mo66134l(sVar);
                                    return;
                                } catch (Throwable th) {
                                    sVar2 = sVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                mo66702A(sVar, obj2, dataSource, z);
                                return;
                            }
                        }
                    }
                    this.f57806s = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f57797j);
                    sb.append(" but instead got ");
                    if (obj2 != null) {
                        obj = obj2.getClass();
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    sb.append(C33093b.f80281i);
                    sb.append(obj2);
                    sb.append("} inside Resource{");
                    sb.append(sVar);
                    sb.append("}.");
                    if (obj2 != null) {
                        str = "";
                    } else {
                        str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                    }
                    sb.append(str);
                    mo66709d(new GlideException(sb.toString()));
                    this.f57809v.mo66134l(sVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (sVar2 != null) {
                this.f57809v.mo66134l(sVar2);
            }
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r5.f57809v.mo66134l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f57791d
            monitor-enter(r0)
            r5.mo66716j()     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.util.pool.c r1 = r5.f57790c     // Catch:{ all -> 0x0040 }
            r1.mo67017c()     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f57810w     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x0040 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0013:
            r5.mo66720n()     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.load.engine.s<R> r1 = r5.f57806s     // Catch:{ all -> 0x0040 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f57806s = r3     // Catch:{ all -> 0x0040 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.mo66717k()     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x002e
            com.bumptech.glide.request.target.p<R> r3 = r5.f57802o     // Catch:{ all -> 0x0040 }
            android.graphics.drawable.Drawable r4 = r5.mo66724r()     // Catch:{ all -> 0x0040 }
            r3.mo65591k(r4)     // Catch:{ all -> 0x0040 }
        L_0x002e:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.f57788a     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.util.pool.C22647b.m102681g(r3, r4)     // Catch:{ all -> 0x0040 }
            r5.f57810w = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003f
            com.bumptech.glide.load.engine.i r0 = r5.f57809v
            r0.mo66134l(r1)
        L_0x003f:
            return
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    /* renamed from: d */
    public void mo66709d(GlideException glideException) {
        mo66731z(glideException, 5);
    }

    /* renamed from: e */
    public void mo66710e(int i, int i2) {
        Object obj;
        this.f57790c.mo67017c();
        Object obj2 = this.f57791d;
        synchronized (obj2) {
            try {
                boolean z = f57783G;
                if (z) {
                    mo66728u("Got onSizeReady in " + C22628i.m102602a(this.f57808u));
                }
                if (this.f57810w == Status.WAITING_FOR_SIZE) {
                    Status status = Status.f57815b;
                    this.f57810w = status;
                    float h0 = this.f57798k.mo66790h0();
                    this.f57784A = m102217v(i, h0);
                    this.f57785B = m102217v(i2, h0);
                    if (z) {
                        mo66728u("finished setup for calling load in " + C22628i.m102602a(this.f57808u));
                    }
                    Status status2 = status;
                    boolean z2 = z;
                    Status status3 = status2;
                    obj = obj2;
                    try {
                        this.f57807t = this.f57809v.mo66130g(this.f57795h, this.f57796i, this.f57798k.mo66788g0(), this.f57784A, this.f57785B, this.f57798k.mo66783d0(), this.f57797j, this.f57801n, this.f57798k.mo66755O(), this.f57798k.mo66795j0(), this.f57798k.mo66817z0(), this.f57798k.mo66811u0(), this.f57798k.mo66768V(), this.f57798k.mo66809r0(), this.f57798k.mo66799l0(), this.f57798k.mo66797k0(), this.f57798k.mo66766U(), this, this.f57805r);
                        if (this.f57810w != status3) {
                            this.f57807t = null;
                        }
                        if (z2) {
                            mo66728u("finished onSizeReady in " + C22628i.m102602a(this.f57808u));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean mo66711f() {
        boolean z;
        synchronized (this.f57791d) {
            if (this.f57810w == Status.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public Object mo66712g() {
        this.f57790c.mo67017c();
        return this.f57791d;
    }

    /* renamed from: h */
    public boolean mo66713h(C22557e eVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C22553a<?> aVar;
        Priority priority;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        C22553a<?> aVar2;
        Priority priority2;
        int i6;
        C22557e eVar2 = eVar;
        if (!(eVar2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f57791d) {
            i = this.f57799l;
            i2 = this.f57800m;
            obj = this.f57796i;
            cls = this.f57797j;
            aVar = this.f57798k;
            priority = this.f57801n;
            List<C22560g<R>> list = this.f57803p;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        SingleRequest singleRequest = (SingleRequest) eVar2;
        synchronized (singleRequest.f57791d) {
            i4 = singleRequest.f57799l;
            i5 = singleRequest.f57800m;
            obj2 = singleRequest.f57796i;
            cls2 = singleRequest.f57797j;
            aVar2 = singleRequest.f57798k;
            priority2 = singleRequest.f57801n;
            List<C22560g<R>> list2 = singleRequest.f57803p;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5 && C22635o.m102628c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && i3 == i6) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66714i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f57791d
            monitor-enter(r0)
            r5.mo66716j()     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.util.pool.c r1 = r5.f57790c     // Catch:{ all -> 0x00b3 }
            r1.mo67017c()     // Catch:{ all -> 0x00b3 }
            long r1 = com.bumptech.glide.util.C22628i.m102603b()     // Catch:{ all -> 0x00b3 }
            r5.f57808u = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r5.f57796i     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f57799l     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f57800m     // Catch:{ all -> 0x00b3 }
            boolean r1 = com.bumptech.glide.util.C22635o.m102648w(r1, r2)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f57799l     // Catch:{ all -> 0x00b3 }
            r5.f57784A = r1     // Catch:{ all -> 0x00b3 }
            int r1 = r5.f57800m     // Catch:{ all -> 0x00b3 }
            r5.f57785B = r1     // Catch:{ all -> 0x00b3 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.mo66723q()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r5.mo66731z(r2, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x003c:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f57810w     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.f57815b     // Catch:{ all -> 0x00b3 }
            if (r2 == r3) goto L_0x00ab
            com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00b3 }
            if (r2 != r4) goto L_0x0050
            com.bumptech.glide.load.engine.s<R> r1 = r5.f57806s     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00b3 }
            r3 = 0
            r5.mo66707c(r1, r2, r3)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0050:
            r5.mo66721o(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "GlideRequest"
            int r1 = com.bumptech.glide.util.pool.C22647b.m102676b(r1)     // Catch:{ all -> 0x00b3 }
            r5.f57788a = r1     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b3 }
            r5.f57810w = r1     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f57799l     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f57800m     // Catch:{ all -> 0x00b3 }
            boolean r2 = com.bumptech.glide.util.C22635o.m102648w(r2, r4)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0071
            int r2 = r5.f57799l     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f57800m     // Catch:{ all -> 0x00b3 }
            r5.mo66710e(r2, r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x0076
        L_0x0071:
            com.bumptech.glide.request.target.p<R> r2 = r5.f57802o     // Catch:{ all -> 0x00b3 }
            r2.mo65595p(r5)     // Catch:{ all -> 0x00b3 }
        L_0x0076:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f57810w     // Catch:{ all -> 0x00b3 }
            if (r2 == r3) goto L_0x007c
            if (r2 != r1) goto L_0x008b
        L_0x007c:
            boolean r1 = r5.mo66718l()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x008b
            com.bumptech.glide.request.target.p<R> r1 = r5.f57802o     // Catch:{ all -> 0x00b3 }
            android.graphics.drawable.Drawable r2 = r5.mo66724r()     // Catch:{ all -> 0x00b3 }
            r1.mo65589g(r2)     // Catch:{ all -> 0x00b3 }
        L_0x008b:
            boolean r1 = f57783G     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            long r2 = r5.f57808u     // Catch:{ all -> 0x00b3 }
            double r2 = com.bumptech.glide.util.C22628i.m102602a(r2)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b3 }
            r5.mo66728u(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo66714i():void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f57791d) {
            Status status = this.f57810w;
            if (status != Status.f57815b) {
                if (status != Status.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @C0323b0("requestLock")
    /* renamed from: j */
    public final void mo66716j() {
        if (this.f57786C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @C0323b0("requestLock")
    /* renamed from: k */
    public final boolean mo66717k() {
        RequestCoordinator requestCoordinator = this.f57793f;
        return requestCoordinator == null || requestCoordinator.mo66700j(this);
    }

    @C0323b0("requestLock")
    /* renamed from: l */
    public final boolean mo66718l() {
        RequestCoordinator requestCoordinator = this.f57793f;
        return requestCoordinator == null || requestCoordinator.mo66695c(this);
    }

    @C0323b0("requestLock")
    /* renamed from: m */
    public final boolean mo66719m() {
        RequestCoordinator requestCoordinator = this.f57793f;
        return requestCoordinator == null || requestCoordinator.mo66696d(this);
    }

    @C0323b0("requestLock")
    /* renamed from: n */
    public final void mo66720n() {
        mo66716j();
        this.f57790c.mo67017c();
        this.f57802o.mo65588d(this);
        C22240i.C22246d dVar = this.f57807t;
        if (dVar != null) {
            dVar.mo66143a();
            this.f57807t = null;
        }
    }

    /* renamed from: o */
    public final void mo66721o(Object obj) {
        List<C22560g<R>> list = this.f57803p;
        if (list != null) {
            for (C22560g next : list) {
                if (next instanceof C22555c) {
                    ((C22555c) next).mo66823a(obj);
                }
            }
        }
    }

    @C0323b0("requestLock")
    /* renamed from: p */
    public final Drawable mo66722p() {
        if (this.f57811x == null) {
            Drawable R = this.f57798k.mo66760R();
            this.f57811x = R;
            if (R == null && this.f57798k.mo66757P() > 0) {
                this.f57811x = mo66726t(this.f57798k.mo66757P());
            }
        }
        return this.f57811x;
    }

    @C0323b0("requestLock")
    /* renamed from: q */
    public final Drawable mo66723q() {
        if (this.f57813z == null) {
            Drawable S = this.f57798k.mo66762S();
            this.f57813z = S;
            if (S == null && this.f57798k.mo66764T() > 0) {
                this.f57813z = mo66726t(this.f57798k.mo66764T());
            }
        }
        return this.f57813z;
    }

    @C0323b0("requestLock")
    /* renamed from: r */
    public final Drawable mo66724r() {
        if (this.f57812y == null) {
            Drawable a0 = this.f57798k.mo66776a0();
            this.f57812y = a0;
            if (a0 == null && this.f57798k.mo66778b0() > 0) {
                this.f57812y = mo66726t(this.f57798k.mo66778b0());
            }
        }
        return this.f57812y;
    }

    @C0323b0("requestLock")
    /* renamed from: s */
    public final boolean mo66725s() {
        RequestCoordinator requestCoordinator = this.f57793f;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo66694a();
    }

    @C0323b0("requestLock")
    /* renamed from: t */
    public final Drawable mo66726t(@C0375v int i) {
        Resources.Theme theme;
        if (this.f57798k.mo66793i0() != null) {
            theme = this.f57798k.mo66793i0();
        } else {
            theme = this.f57794g.getTheme();
        }
        return C22462h.m101922a(this.f57795h, i, theme);
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f57791d) {
            obj = this.f57796i;
            cls = this.f57797j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: u */
    public final void mo66728u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f57789b);
    }

    @C0323b0("requestLock")
    /* renamed from: w */
    public final void mo66729w() {
        RequestCoordinator requestCoordinator = this.f57793f;
        if (requestCoordinator != null) {
            requestCoordinator.mo66697e(this);
        }
    }

    @C0323b0("requestLock")
    /* renamed from: x */
    public final void mo66730x() {
        RequestCoordinator requestCoordinator = this.f57793f;
        if (requestCoordinator != null) {
            requestCoordinator.mo66698g(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    public final void mo66731z(GlideException glideException, int i) {
        boolean z;
        this.f57790c.mo67017c();
        synchronized (this.f57791d) {
            glideException.mo65901l(this.f57787D);
            int h = this.f57795h.mo65524h();
            if (h <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.f57796i);
                sb.append(" with size [");
                sb.append(this.f57784A);
                sb.append("x");
                sb.append(this.f57785B);
                sb.append("]");
                if (h <= 4) {
                    glideException.mo65897h("Glide");
                }
            }
            this.f57807t = null;
            this.f57810w = Status.FAILED;
            boolean z2 = true;
            this.f57786C = true;
            try {
                List<C22560g<R>> list = this.f57803p;
                if (list != null) {
                    z = false;
                    for (C22560g<R> e : list) {
                        z |= e.mo66826e(glideException, this.f57796i, this.f57802o, mo66725s());
                    }
                } else {
                    z = false;
                }
                C22560g<R> gVar = this.f57792e;
                if (gVar == null || !gVar.mo66826e(glideException, this.f57796i, this.f57802o, mo66725s())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    mo66703B();
                }
                this.f57786C = false;
                mo66729w();
                C22647b.m102681g(f57781E, this.f57788a);
            } catch (Throwable th) {
                this.f57786C = false;
                throw th;
            }
        }
    }
}
