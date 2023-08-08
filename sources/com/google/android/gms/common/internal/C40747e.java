package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.C0346i;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40501f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.C40974d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@C40473a
/* renamed from: com.google.android.gms.common.internal.e */
public abstract class C40747e<T extends IInterface> {
    @C40473a

    /* renamed from: F */
    public static final int f103803F = 1;
    @C40473a

    /* renamed from: G */
    public static final int f103804G = 4;
    @C40473a

    /* renamed from: H */
    public static final int f103805H = 5;
    @C40473a
    @C0359n0

    /* renamed from: I */
    public static final String f103806I = "pendingIntent";
    @C40473a
    @C0359n0

    /* renamed from: J */
    public static final String f103807J = "<<default account>>";
    @C40473a
    @C0359n0

    /* renamed from: K */
    public static final String[] f103808K = {"service_esmobile", "service_googleme"};

    /* renamed from: L */
    public static final Feature[] f103809L = new Feature[0];
    @C0363p0

    /* renamed from: A */
    public volatile String f103810A;
    @C0363p0

    /* renamed from: B */
    public ConnectionResult f103811B;

    /* renamed from: C */
    public boolean f103812C;
    @C0363p0

    /* renamed from: D */
    public volatile zzj f103813D;
    @C0359n0
    @C40974d0

    /* renamed from: E */
    public AtomicInteger f103814E;

    /* renamed from: c */
    public int f103815c;

    /* renamed from: d */
    public long f103816d;

    /* renamed from: e */
    public long f103817e;

    /* renamed from: f */
    public int f103818f;

    /* renamed from: g */
    public long f103819g;
    @C0363p0

    /* renamed from: h */
    public volatile String f103820h;
    @C40974d0

    /* renamed from: i */
    public C40772i2 f103821i;

    /* renamed from: j */
    public final Context f103822j;

    /* renamed from: k */
    public final Looper f103823k;

    /* renamed from: l */
    public final C40773j f103824l;

    /* renamed from: m */
    public final C40715h f103825m;

    /* renamed from: n */
    public final Handler f103826n;

    /* renamed from: o */
    public final Object f103827o;

    /* renamed from: p */
    public final Object f103828p;
    @C0363p0
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: q */
    public C40798p f103829q;
    @C0359n0
    @C40974d0

    /* renamed from: r */
    public C40750c f103830r;
    @C0363p0
    @GuardedBy("mLock")

    /* renamed from: s */
    public IInterface f103831s;

    /* renamed from: t */
    public final ArrayList f103832t;
    @C0363p0
    @GuardedBy("mLock")

    /* renamed from: u */
    public C40811s1 f103833u;
    @GuardedBy("mLock")

    /* renamed from: v */
    public int f103834v;
    @C0363p0

    /* renamed from: w */
    public final C40748a f103835w;
    @C0363p0

    /* renamed from: x */
    public final C40749b f103836x;

    /* renamed from: y */
    public final int f103837y;
    @C0363p0

    /* renamed from: z */
    public final String f103838z;

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.e$a */
    public interface C40748a {
        @C40473a

        /* renamed from: a */
        public static final int f103839a = 1;
        @C40473a

        /* renamed from: b */
        public static final int f103840b = 3;

        @C40473a
        /* renamed from: H0 */
        void mo86926H0(int i);

        @C40473a
        /* renamed from: m0 */
        void mo86931m0(@C0363p0 Bundle bundle);
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.e$b */
    public interface C40749b {
        @C40473a
        /* renamed from: O0 */
        void mo86927O0(@C0359n0 ConnectionResult connectionResult);
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.e$c */
    public interface C40750c {
        @C40473a
        /* renamed from: a */
        void mo134010a(@C0359n0 ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.e$d */
    public class C40751d implements C40750c {
        @C40473a
        public C40751d() {
        }

        /* renamed from: a */
        public final void mo134010a(@C0359n0 ConnectionResult connectionResult) {
            if (connectionResult.mo133595e0()) {
                C40747e eVar = C40747e.this;
                eVar.mo134365p((C40785m) null, eVar.mo134339L());
            } else if (C40747e.this.f103836x != null) {
                C40747e.this.f103836x.mo86927O0(connectionResult);
            }
        }
    }

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.e$e */
    public interface C40752e {
        @C40473a
        /* renamed from: a */
        void mo134041a();
    }

    @C40473a
    @C40974d0
    public C40747e(@C0359n0 Context context, @C0359n0 Handler handler, @C0359n0 C40773j jVar, @C0359n0 C40715h hVar, int i, @C0363p0 C40748a aVar, @C0363p0 C40749b bVar) {
        this.f103820h = null;
        this.f103827o = new Object();
        this.f103828p = new Object();
        this.f103832t = new ArrayList();
        this.f103834v = 1;
        this.f103811B = null;
        this.f103812C = false;
        this.f103813D = null;
        this.f103814E = new AtomicInteger(0);
        C40843u.m166203m(context, "Context must not be null");
        this.f103822j = context;
        C40843u.m166203m(handler, "Handler must not be null");
        this.f103826n = handler;
        this.f103823k = handler.getLooper();
        C40843u.m166203m(jVar, "Supervisor must not be null");
        this.f103824l = jVar;
        C40843u.m166203m(hVar, "API availability must not be null");
        this.f103825m = hVar;
        this.f103837y = i;
        this.f103835w = aVar;
        this.f103836x = bVar;
        this.f103838z = null;
    }

    /* renamed from: k0 */
    public static /* bridge */ /* synthetic */ void m165795k0(C40747e eVar, zzj zzj) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        eVar.f103813D = zzj;
        if (eVar.mo134353a0()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.f103984d;
            C40849w b = C40849w.m166213b();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.mo134277f0();
            }
            b.mo134511c(rootTelemetryConfiguration);
        }
    }

    /* renamed from: l0 */
    public static /* bridge */ /* synthetic */ void m165796l0(C40747e eVar, int i) {
        int i2;
        int i3;
        synchronized (eVar.f103827o) {
            i2 = eVar.f103834v;
        }
        if (i2 == 3) {
            eVar.f103812C = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = eVar.f103826n;
        handler.sendMessage(handler.obtainMessage(i3, eVar.f103814E.get(), 16));
    }

    /* renamed from: o0 */
    public static /* bridge */ /* synthetic */ boolean m165798o0(C40747e eVar, int i, int i2, IInterface iInterface) {
        synchronized (eVar.f103827o) {
            if (eVar.f103834v != i) {
                return false;
            }
            eVar.mo134367q0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: p0 */
    public static /* bridge */ /* synthetic */ boolean m165799p0(C40747e eVar) {
        if (eVar.f103812C || TextUtils.isEmpty(eVar.mo87437N()) || TextUtils.isEmpty(eVar.mo134337J())) {
            return false;
        }
        try {
            Class.forName(eVar.mo87437N());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: A */
    public abstract T mo87436A(@C0359n0 IBinder iBinder);

    @C40473a
    /* renamed from: B */
    public boolean mo134330B() {
        return false;
    }

    @C0363p0
    @C40473a
    /* renamed from: C */
    public Account mo134331C() {
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: D */
    public Feature[] mo134332D() {
        return f103809L;
    }

    @C0363p0
    @C40473a
    /* renamed from: E */
    public Executor mo134333E() {
        return null;
    }

    @C0363p0
    @C40473a
    /* renamed from: F */
    public Bundle mo134334F() {
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: G */
    public final Context mo134335G() {
        return this.f103822j;
    }

    @C40473a
    /* renamed from: H */
    public int mo134336H() {
        return this.f103837y;
    }

    @C40473a
    @C0359n0
    /* renamed from: I */
    public Bundle mo87659I() {
        return new Bundle();
    }

    @C0363p0
    @C40473a
    /* renamed from: J */
    public String mo134337J() {
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: K */
    public final Looper mo134338K() {
        return this.f103823k;
    }

    @C40473a
    @C0359n0
    /* renamed from: L */
    public Set<Scope> mo134339L() {
        return Collections.emptySet();
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public final T mo134340M() throws DeadObjectException {
        T t;
        synchronized (this.f103827o) {
            if (this.f103834v != 5) {
                mo134373z();
                t = this.f103831s;
                C40843u.m166203m(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    @C40473a
    @C0359n0
    /* renamed from: N */
    public abstract String mo87437N();

    @C40473a
    @C0359n0
    /* renamed from: O */
    public abstract String mo87438O();

    @C40473a
    @C0359n0
    /* renamed from: P */
    public String mo134341P() {
        return "com.google.android.gms";
    }

    @C0363p0
    @C40473a
    /* renamed from: Q */
    public ConnectionTelemetryConfiguration mo134342Q() {
        zzj zzj = this.f103813D;
        if (zzj == null) {
            return null;
        }
        return zzj.f103984d;
    }

    @C40473a
    /* renamed from: R */
    public boolean mo134343R() {
        return mo87439t() >= 211700000;
    }

    @C40473a
    /* renamed from: S */
    public boolean mo134344S() {
        return this.f103813D != null;
    }

    @C40473a
    @C0346i
    /* renamed from: T */
    public void mo134345T(@C0359n0 T t) {
        this.f103817e = System.currentTimeMillis();
    }

    @C40473a
    @C0346i
    /* renamed from: U */
    public void mo134346U(@C0359n0 ConnectionResult connectionResult) {
        this.f103818f = connectionResult.mo133591M();
        this.f103819g = System.currentTimeMillis();
    }

    @C40473a
    @C0346i
    /* renamed from: V */
    public void mo134347V(int i) {
        this.f103815c = i;
        this.f103816d = System.currentTimeMillis();
    }

    @C40473a
    /* renamed from: W */
    public void mo134348W(int i, @C0363p0 IBinder iBinder, @C0363p0 Bundle bundle, int i2) {
        Handler handler = this.f103826n;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C40842t1(this, i, iBinder, bundle)));
    }

    @C40473a
    /* renamed from: X */
    public void mo134349X(@C0359n0 String str) {
        this.f103810A = str;
    }

    @C40473a
    /* renamed from: Y */
    public void mo134350Y(int i) {
        Handler handler = this.f103826n;
        handler.sendMessage(handler.obtainMessage(6, this.f103814E.get(), i));
    }

    @C40473a
    @C40974d0
    /* renamed from: Z */
    public void mo134351Z(@C0359n0 C40750c cVar, int i, @C0363p0 PendingIntent pendingIntent) {
        C40843u.m166203m(cVar, "Connection progress callbacks cannot be null.");
        this.f103830r = cVar;
        Handler handler = this.f103826n;
        handler.sendMessage(handler.obtainMessage(3, this.f103814E.get(), i, pendingIntent));
    }

    @C40473a
    /* renamed from: a */
    public boolean mo134352a() {
        boolean z;
        synchronized (this.f103827o) {
            if (this.f103834v == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @C40473a
    /* renamed from: a0 */
    public boolean mo134353a0() {
        return false;
    }

    @C40473a
    /* renamed from: b */
    public boolean mo134354b() {
        return false;
    }

    @C40473a
    /* renamed from: c */
    public boolean mo134355c() {
        return false;
    }

    @C40473a
    /* renamed from: d */
    public void mo134356d(@C0359n0 String str) {
        this.f103820h = str;
        mo134358f();
    }

    @C40473a
    /* renamed from: e */
    public boolean mo134357e() {
        boolean z;
        synchronized (this.f103827o) {
            int i = this.f103834v;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    @C40473a
    /* renamed from: f */
    public void mo134358f() {
        this.f103814E.incrementAndGet();
        synchronized (this.f103832t) {
            int size = this.f103832t.size();
            for (int i = 0; i < size; i++) {
                ((C40804q1) this.f103832t.get(i)).mo134460d();
            }
            this.f103832t.clear();
        }
        synchronized (this.f103828p) {
            this.f103829q = null;
        }
        mo134367q0(1, (IInterface) null);
    }

    @C0359n0
    /* renamed from: f0 */
    public final String mo134359f0() {
        String str = this.f103838z;
        return str == null ? this.f103822j.getClass().getName() : str;
    }

    @C40473a
    @C0359n0
    /* renamed from: g */
    public String mo134360g() {
        C40772i2 i2Var;
        if (mo134352a() && (i2Var = this.f103821i) != null) {
            return i2Var.mo134420b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @C40473a
    /* renamed from: h */
    public void mo134361h(@C0359n0 C40750c cVar) {
        C40843u.m166203m(cVar, "Connection progress callbacks cannot be null.");
        this.f103830r = cVar;
        mo134367q0(2, (IInterface) null);
    }

    @C40473a
    /* renamed from: l */
    public boolean mo134362l() {
        return true;
    }

    @C40473a
    /* renamed from: m */
    public boolean mo87660m() {
        return false;
    }

    /* renamed from: m0 */
    public final void mo134363m0(int i, @C0363p0 Bundle bundle, int i2) {
        Handler handler = this.f103826n;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C40845u1(this, i, (Bundle) null)));
    }

    @C0363p0
    @C40473a
    /* renamed from: n */
    public IBinder mo134364n() {
        synchronized (this.f103828p) {
            C40798p pVar = this.f103829q;
            if (pVar == null) {
                return null;
            }
            IBinder asBinder = pVar.asBinder();
            return asBinder;
        }
    }

    @C0348i1
    @C40473a
    /* renamed from: p */
    public void mo134365p(@C0363p0 C40785m mVar, @C0359n0 Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle I = mo87659I();
        int i = this.f103837y;
        String str = this.f103810A;
        int i2 = C40715h.f103695a;
        Scope[] scopeArr = GetServiceRequest.f103750Z;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f103749E0;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f103756d = this.f103822j.getPackageName();
        getServiceRequest3.f103759g = I;
        if (set2 != null) {
            getServiceRequest3.f103758f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo87660m()) {
            Account C = mo134331C();
            if (C == null) {
                C = new Account("<<default account>>", C40733b.f103787a);
            }
            getServiceRequest3.f103760v = C;
            if (mVar != null) {
                getServiceRequest3.f103757e = mVar.asBinder();
            }
        } else if (mo134354b()) {
            getServiceRequest3.f103760v = mo134331C();
        }
        getServiceRequest3.f103761w = f103809L;
        getServiceRequest3.f103762x = mo134332D();
        if (mo134353a0()) {
            getServiceRequest3.f103751X = true;
        }
        try {
            synchronized (this.f103828p) {
                C40798p pVar = this.f103829q;
                if (pVar != null) {
                    pVar.mo134409N5(new C40807r1(this, this.f103814E.get()), getServiceRequest3);
                }
            }
        } catch (DeadObjectException unused) {
            mo134350Y(3);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo134348W(8, (IBinder) null, (Bundle) null, this.f103814E.get());
        }
    }

    @C40473a
    /* renamed from: q */
    public void mo134366q(@C0359n0 C40752e eVar) {
        eVar.mo134041a();
    }

    /* renamed from: q0 */
    public final void mo134367q0(int i, @C0363p0 IInterface iInterface) {
        boolean z;
        boolean z2;
        C40772i2 i2Var;
        C40772i2 i2Var2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        C40843u.m166191a(z3);
        synchronized (this.f103827o) {
            this.f103834v = i;
            this.f103831s = iInterface;
            if (i == 1) {
                C40811s1 s1Var = this.f103833u;
                if (s1Var != null) {
                    C40773j jVar = this.f103824l;
                    String c = this.f103821i.mo134421c();
                    C40843u.m166202l(c);
                    jVar.mo134427j(c, this.f103821i.mo134420b(), this.f103821i.mo134419a(), s1Var, mo134359f0(), this.f103821i.mo134422d());
                    this.f103833u = null;
                }
            } else if (i == 2 || i == 3) {
                C40811s1 s1Var2 = this.f103833u;
                if (!(s1Var2 == null || (i2Var2 = this.f103821i) == null)) {
                    String c2 = i2Var2.mo134421c();
                    String b = i2Var2.mo134420b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b);
                    C40773j jVar2 = this.f103824l;
                    String c3 = this.f103821i.mo134421c();
                    C40843u.m166202l(c3);
                    jVar2.mo134427j(c3, this.f103821i.mo134420b(), this.f103821i.mo134419a(), s1Var2, mo134359f0(), this.f103821i.mo134422d());
                    this.f103814E.incrementAndGet();
                }
                C40811s1 s1Var3 = new C40811s1(this, this.f103814E.get());
                this.f103833u = s1Var3;
                if (this.f103834v != 3 || mo134337J() == null) {
                    i2Var = new C40772i2(mo134341P(), mo87438O(), false, C40773j.m165913c(), mo134343R());
                } else {
                    i2Var = new C40772i2(mo134335G().getPackageName(), mo134337J(), true, C40773j.m165913c(), false);
                }
                this.f103821i = i2Var;
                if (i2Var.mo134422d()) {
                    if (mo87439t() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f103821i.mo134421c())));
                    }
                }
                C40773j jVar3 = this.f103824l;
                String c4 = this.f103821i.mo134421c();
                C40843u.m166202l(c4);
                String b2 = this.f103821i.mo134420b();
                int a = this.f103821i.mo134419a();
                if (!jVar3.mo134406k(new C40732a2(c4, b2, a, this.f103821i.mo134422d()), s1Var3, mo134359f0(), mo134333E())) {
                    String c5 = this.f103821i.mo134421c();
                    String b3 = this.f103821i.mo134420b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to connect to service: ");
                    sb2.append(c5);
                    sb2.append(" on ");
                    sb2.append(b3);
                    mo134363m0(16, (Bundle) null, this.f103814E.get());
                }
            } else if (i == 4) {
                C40843u.m166202l(iInterface);
                mo134345T(iInterface);
            }
        }
    }

    @C40473a
    /* renamed from: r */
    public void mo134368r(@C0359n0 String str, @C0359n0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0359n0 String[] strArr) {
        int i;
        IInterface iInterface;
        C40798p pVar;
        synchronized (this.f103827o) {
            i = this.f103834v;
            iInterface = this.f103831s;
        }
        synchronized (this.f103828p) {
            pVar = this.f103829q;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo87437N()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f103817e > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f103817e;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f103816d > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f103815c;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f103816d;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f103819g > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C40501f.m164764a(this.f103818f));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f103819g;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    @C40473a
    /* renamed from: t */
    public int mo87439t() {
        return C40715h.f103695a;
    }

    @C0363p0
    @C40473a
    /* renamed from: u */
    public final Feature[] mo134369u() {
        zzj zzj = this.f103813D;
        if (zzj == null) {
            return null;
        }
        return zzj.f103982b;
    }

    @C0363p0
    @C40473a
    /* renamed from: w */
    public String mo134370w() {
        return this.f103820h;
    }

    @C40473a
    @C0359n0
    /* renamed from: x */
    public Intent mo134371x() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @C40473a
    /* renamed from: y */
    public void mo134372y() {
        int k = this.f103825m.mo134209k(this.f103822j, mo87439t());
        if (k != 0) {
            mo134367q0(1, (IInterface) null);
            mo134351Z(new C40751d(), k, (PendingIntent) null);
            return;
        }
        mo134361h(new C40751d());
    }

    @C40473a
    /* renamed from: z */
    public final void mo134373z() {
        if (!mo134352a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C40473a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40747e(@androidx.annotation.C0359n0 android.content.Context r10, @androidx.annotation.C0359n0 android.os.Looper r11, int r12, @androidx.annotation.C0363p0 com.google.android.gms.common.internal.C40747e.C40748a r13, @androidx.annotation.C0363p0 com.google.android.gms.common.internal.C40747e.C40749b r14, @androidx.annotation.C0363p0 java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.C40773j.m165914d(r10)
            com.google.android.gms.common.h r4 = com.google.android.gms.common.C40715h.m165670i()
            com.google.android.gms.common.internal.C40843u.m166202l(r13)
            com.google.android.gms.common.internal.C40843u.m166202l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C40747e.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e$a, com.google.android.gms.common.internal.e$b, java.lang.String):void");
    }

    @C40473a
    @C40974d0
    public C40747e(@C0359n0 Context context, @C0359n0 Looper looper, @C0359n0 C40773j jVar, @C0359n0 C40715h hVar, int i, @C0363p0 C40748a aVar, @C0363p0 C40749b bVar, @C0363p0 String str) {
        this.f103820h = null;
        this.f103827o = new Object();
        this.f103828p = new Object();
        this.f103832t = new ArrayList();
        this.f103834v = 1;
        this.f103811B = null;
        this.f103812C = false;
        this.f103813D = null;
        this.f103814E = new AtomicInteger(0);
        C40843u.m166203m(context, "Context must not be null");
        this.f103822j = context;
        C40843u.m166203m(looper, "Looper must not be null");
        this.f103823k = looper;
        C40843u.m166203m(jVar, "Supervisor must not be null");
        this.f103824l = jVar;
        C40843u.m166203m(hVar, "API availability must not be null");
        this.f103825m = hVar;
        this.f103826n = new C40801p1(this, looper);
        this.f103837y = i;
        this.f103835w = aVar;
        this.f103836x = bVar;
        this.f103838z = str;
    }
}
