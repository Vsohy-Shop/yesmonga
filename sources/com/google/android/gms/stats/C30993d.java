package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40966b0;
import com.google.android.gms.common.util.C40976e0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import com.google.android.gms.internal.stats.C30298b;
import com.google.android.gms.internal.stats.C30299c;
import com.google.android.gms.internal.stats.C30304h;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@C40473a
@C40858y
@ThreadSafe
/* renamed from: com.google.android.gms.stats.d */
public class C30993d {

    /* renamed from: r */
    public static final long f74250r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    public static volatile ScheduledExecutorService f74251s = null;

    /* renamed from: t */
    public static final Object f74252t = new Object();

    /* renamed from: u */
    public static volatile C30997h f74253u = new C30995f();

    /* renamed from: a */
    public final Object f74254a = new Object();
    @C0323b0("acquireReleaseLock")

    /* renamed from: b */
    public final PowerManager.WakeLock f74255b;
    @C0323b0("acquireReleaseLock")

    /* renamed from: c */
    public int f74256c = 0;
    @C0323b0("acquireReleaseLock")

    /* renamed from: d */
    public Future<?> f74257d;
    @C0323b0("acquireReleaseLock")

    /* renamed from: e */
    public long f74258e;
    @C0323b0("acquireReleaseLock")

    /* renamed from: f */
    public final Set<C30998i> f74259f = new HashSet();
    @C0323b0("acquireReleaseLock")

    /* renamed from: g */
    public boolean f74260g = true;
    @C0323b0("acquireReleaseLock")

    /* renamed from: h */
    public int f74261h;
    @C0323b0("acquireReleaseLock")

    /* renamed from: i */
    public C30298b f74262i;

    /* renamed from: j */
    public C40979g f74263j = C40985k.m166636d();

    /* renamed from: k */
    public WorkSource f74264k;

    /* renamed from: l */
    public final String f74265l;

    /* renamed from: m */
    public final String f74266m;

    /* renamed from: n */
    public final Context f74267n;
    @C0323b0("acquireReleaseLock")

    /* renamed from: o */
    public final Map<String, C30996g> f74268o = new HashMap();

    /* renamed from: p */
    public AtomicInteger f74269p = new AtomicInteger(0);

    /* renamed from: q */
    public final ScheduledExecutorService f74270q;

    @C40473a
    public C30993d(@C0359n0 Context context, int i, @C0359n0 String str) {
        String str2;
        String packageName = context.getPackageName();
        C40843u.m166203m(context, "WakeLock: context must not be null");
        C40843u.m166199i(str, "WakeLock: wakeLockName must not be empty");
        this.f74267n = context.getApplicationContext();
        this.f74266m = str;
        this.f74262i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f74265l = str2;
        } else {
            this.f74265l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f74255b = newWakeLock;
            if (C40976e0.m166611g(context)) {
                WorkSource b = C40976e0.m166606b(context, C40966b0.m166592b(packageName) ? context.getPackageName() : packageName);
                this.f74264k = b;
                if (b != null) {
                    m124410i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f74251s;
            if (scheduledExecutorService == null) {
                synchronized (f74252t) {
                    scheduledExecutorService = f74251s;
                    if (scheduledExecutorService == null) {
                        C30304h.m122019a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f74251s = scheduledExecutorService;
                    }
                }
            }
            this.f74270q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m124409e(@C0359n0 C30993d dVar) {
        synchronized (dVar.f74254a) {
            if (dVar.mo87681b()) {
                String.valueOf(dVar.f74265l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                dVar.mo87685g();
                if (dVar.mo87681b()) {
                    dVar.f74256c = 1;
                    dVar.mo87686h(0);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m124410i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @C40473a
    /* renamed from: a */
    public void mo87680a(long j) {
        this.f74269p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f74250r), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f74254a) {
            if (!mo87681b()) {
                this.f74262i = C30298b.m122018a(false, (C30299c) null);
                this.f74255b.acquire();
                this.f74263j.mo134770c();
            }
            this.f74256c++;
            this.f74261h++;
            mo87684f((String) null);
            C30996g gVar = this.f74268o.get((Object) null);
            if (gVar == null) {
                gVar = new C30996g((C30995f) null);
                this.f74268o.put((Object) null, gVar);
            }
            gVar.f74272a++;
            long c = this.f74263j.mo134770c();
            if (Long.MAX_VALUE - c > max) {
                j2 = c + max;
            }
            if (j2 > this.f74258e) {
                this.f74258e = j2;
                Future<?> future = this.f74257d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f74257d = this.f74270q.schedule(new C30994e(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @C40473a
    /* renamed from: b */
    public boolean mo87681b() {
        boolean z;
        synchronized (this.f74254a) {
            if (this.f74256c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @C40473a
    /* renamed from: c */
    public void mo87682c() {
        if (this.f74269p.decrementAndGet() < 0) {
            String.valueOf(this.f74265l).concat(" release without a matched acquire!");
        }
        synchronized (this.f74254a) {
            mo87684f((String) null);
            if (this.f74268o.containsKey((Object) null)) {
                C30996g gVar = this.f74268o.get((Object) null);
                if (gVar != null) {
                    int i = gVar.f74272a - 1;
                    gVar.f74272a = i;
                    if (i == 0) {
                        this.f74268o.remove((Object) null);
                    }
                }
            } else {
                String.valueOf(this.f74265l).concat(" counter does not exist");
            }
            mo87686h(0);
        }
    }

    @C40473a
    /* renamed from: d */
    public void mo87683d(boolean z) {
        synchronized (this.f74254a) {
            this.f74260g = z;
        }
    }

    @C0323b0("acquireReleaseLock")
    /* renamed from: f */
    public final String mo87684f(String str) {
        if (this.f74260g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    @C0323b0("acquireReleaseLock")
    /* renamed from: g */
    public final void mo87685g() {
        if (!this.f74259f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f74259f);
            this.f74259f.clear();
            if (arrayList.size() > 0) {
                C30998i iVar = (C30998i) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: h */
    public final void mo87686h(int i) {
        synchronized (this.f74254a) {
            if (mo87681b()) {
                if (this.f74260g) {
                    int i2 = this.f74256c - 1;
                    this.f74256c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f74256c = 0;
                }
                mo87685g();
                for (C30996g gVar : this.f74268o.values()) {
                    gVar.f74272a = 0;
                }
                this.f74268o.clear();
                Future<?> future = this.f74257d;
                if (future != null) {
                    future.cancel(false);
                    this.f74257d = null;
                    this.f74258e = 0;
                }
                this.f74261h = 0;
                if (this.f74255b.isHeld()) {
                    try {
                        this.f74255b.release();
                        if (this.f74262i != null) {
                            this.f74262i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            String.valueOf(this.f74265l).concat(" failed to release!");
                            if (this.f74262i != null) {
                                this.f74262i = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f74262i != null) {
                            this.f74262i = null;
                        }
                        throw th;
                    }
                } else {
                    String.valueOf(this.f74265l).concat(" should be held!");
                }
            }
        }
    }
}
