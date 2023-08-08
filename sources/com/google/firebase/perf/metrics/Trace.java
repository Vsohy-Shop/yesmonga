package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.perf.C33316f;
import com.google.firebase.perf.application.C33279a;
import com.google.firebase.perf.application.C33282b;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.validator.C33388e;
import com.google.firebase.perf.session.C33398a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33431a;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace extends C33282b implements Parcelable, C33316f, C33398a {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C33370a();

    /* renamed from: X */
    public static final C33363a f81084X = C33363a.m134449e();

    /* renamed from: Y */
    public static final Map<String, Trace> f81085Y = new ConcurrentHashMap();
    @C40974d0

    /* renamed from: Z */
    public static final Parcelable.Creator<Trace> f81086Z = new C33371b();

    /* renamed from: a */
    public final WeakReference<C33398a> f81087a;

    /* renamed from: b */
    public final Trace f81088b;

    /* renamed from: c */
    public final GaugeManager f81089c;

    /* renamed from: d */
    public final String f81090d;

    /* renamed from: e */
    public final Map<String, Counter> f81091e;

    /* renamed from: f */
    public final Map<String, String> f81092f;

    /* renamed from: g */
    public final List<PerfSession> f81093g;

    /* renamed from: v */
    public final List<Trace> f81094v;

    /* renamed from: w */
    public final C33424k f81095w;

    /* renamed from: x */
    public final C33431a f81096x;

    /* renamed from: y */
    public Timer f81097y;

    /* renamed from: z */
    public Timer f81098z;

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    public class C33370a implements Parcelable.Creator<Trace> {
        /* renamed from: a */
        public Trace createFromParcel(@C0359n0 Parcel parcel) {
            return new Trace(parcel, false, (C33370a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    public class C33371b implements Parcelable.Creator<Trace> {
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, (C33370a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z, C33370a aVar) {
        this(parcel, z);
    }

    @C0359n0
    /* renamed from: c */
    public static Trace m134506c(@C0359n0 String str) {
        return new Trace(str);
    }

    @C0359n0
    /* renamed from: j */
    public static synchronized Trace m134507j(@C0359n0 String str) {
        Trace trace;
        synchronized (Trace.class) {
            Map<String, Trace> map = f81085Y;
            trace = map.get(str);
            if (trace == null) {
                trace = new Trace(str);
                map.put(str, trace);
            }
        }
        return trace;
    }

    @C0359n0
    @C40974d0
    /* renamed from: k */
    public static synchronized Trace m134508k(@C0359n0 String str, @C0359n0 C33424k kVar, @C0359n0 C33431a aVar, @C0359n0 C33279a aVar2) {
        Trace trace;
        synchronized (Trace.class) {
            Map<String, Trace> map = f81085Y;
            trace = map.get(str);
            if (trace == null) {
                trace = new Trace(str, kVar, aVar, aVar2, GaugeManager.getInstance());
                map.put(str, trace);
            }
        }
        return trace;
    }

    @C0363p0
    /* renamed from: r */
    public static Trace m134509r(@C0359n0 String str) {
        Trace trace = f81085Y.get(str);
        if (trace != null) {
            trace.start();
        }
        return trace;
    }

    @C0363p0
    /* renamed from: t */
    public static Trace m134510t(@C0359n0 String str) {
        Map<String, Trace> map = f81085Y;
        Trace trace = map.get(str);
        if (trace != null) {
            trace.stop();
            map.remove(str);
        }
        return trace;
    }

    /* renamed from: a */
    public void mo96482a(PerfSession perfSession) {
        if (perfSession == null) {
            f81084X.mo96439l("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (mo96494l() && !mo96496n()) {
            this.f81093g.add(perfSession);
        }
    }

    /* renamed from: b */
    public final void mo96483b(@C0359n0 String str, @C0359n0 String str2) {
        if (mo96496n()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f81090d}));
        } else if (this.f81092f.containsKey(str) || this.f81092f.size() < 5) {
            C33388e.m134602d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    @C0359n0
    @C40974d0
    /* renamed from: d */
    public Map<String, Counter> mo96484d() {
        return this.f81091e;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    @C40974d0
    /* renamed from: e */
    public Timer mo96486e() {
        return this.f81098z;
    }

    @C0359n0
    @C40974d0
    /* renamed from: f */
    public String mo96487f() {
        return this.f81090d;
    }

    public void finalize() throws Throwable {
        try {
            if (mo96495m()) {
                f81084X.mo96440m("Trace '%s' is started but not stopped when it is destructed!", this.f81090d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @C40974d0
    /* renamed from: g */
    public List<PerfSession> mo96489g() {
        List<PerfSession> unmodifiableList;
        synchronized (this.f81093g) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession next : this.f81093g) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @C0363p0
    @Keep
    public String getAttribute(@C0359n0 String str) {
        return this.f81092f.get(str);
    }

    @C0359n0
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f81092f);
    }

    @Keep
    public long getLongMetric(@C0359n0 String str) {
        Counter counter;
        if (str != null) {
            counter = this.f81091e.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0;
        }
        return counter.mo96472a();
    }

    @C40974d0
    /* renamed from: h */
    public Timer mo96491h() {
        return this.f81097y;
    }

    @C0359n0
    @C40974d0
    /* renamed from: i */
    public List<Trace> mo96492i() {
        return this.f81094v;
    }

    @Keep
    public void incrementMetric(@C0359n0 String str, long j) {
        String e = C33388e.m134603e(str);
        if (e != null) {
            f81084X.mo96432d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!mo96494l()) {
            f81084X.mo96440m("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f81090d);
        } else if (mo96496n()) {
            f81084X.mo96440m("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f81090d);
        } else {
            Counter o = mo96497o(str.trim());
            o.mo96474c(j);
            f81084X.mo96430b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(o.mo96472a()), this.f81090d);
        }
    }

    @C40974d0
    /* renamed from: l */
    public boolean mo96494l() {
        return this.f81097y != null;
    }

    @C40974d0
    /* renamed from: m */
    public boolean mo96495m() {
        return mo96494l() && !mo96496n();
    }

    @C40974d0
    /* renamed from: n */
    public boolean mo96496n() {
        return this.f81098z != null;
    }

    @C0359n0
    /* renamed from: o */
    public final Counter mo96497o(@C0359n0 String str) {
        Counter counter = this.f81091e.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.f81091e.put(str, counter2);
        return counter2;
    }

    /* renamed from: p */
    public final void mo96498p(Timer timer) {
        if (!this.f81094v.isEmpty()) {
            Trace trace = this.f81094v.get(this.f81094v.size() - 1);
            if (trace.f81098z == null) {
                trace.f81098z = timer;
            }
        }
    }

    @Keep
    public void putAttribute(@C0359n0 String str, @C0359n0 String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo96483b(str, str2);
            f81084X.mo96430b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f81090d);
            z = true;
        } catch (Exception e) {
            f81084X.mo96432d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f81092f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@C0359n0 String str, long j) {
        String e = C33388e.m134603e(str);
        if (e != null) {
            f81084X.mo96432d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!mo96494l()) {
            f81084X.mo96440m("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f81090d);
        } else if (mo96496n()) {
            f81084X.mo96440m("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f81090d);
        } else {
            mo96497o(str.trim()).mo96475d(j);
            f81084X.mo96430b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f81090d);
        }
    }

    /* renamed from: q */
    public void mo96500q(@C0359n0 String str) {
        Timer a = this.f81096x.mo96901a();
        mo96498p(a);
        this.f81094v.add(new Trace(this, str, a, (Timer) null, (List<Trace>) null, (Map<String, Counter>) null, (Map<String, String>) null));
    }

    @Keep
    public void removeAttribute(@C0359n0 String str) {
        if (mo96496n()) {
            f81084X.mo96431c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f81092f.remove(str);
        }
    }

    /* renamed from: s */
    public void mo96501s() {
        mo96498p(this.f81096x.mo96901a());
    }

    @Keep
    public void start() {
        if (!C33307a.m134328h().mo96352M()) {
            f81084X.mo96429a("Trace feature is disabled.");
            return;
        }
        String f = C33388e.m134604f(this.f81090d);
        if (f != null) {
            f81084X.mo96432d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f81090d, f);
        } else if (this.f81097y != null) {
            f81084X.mo96432d("Trace '%s' has already started, should not start again!", this.f81090d);
        } else {
            this.f81097y = this.f81096x.mo96901a();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f81087a);
            mo96482a(perfSession);
            if (perfSession.mo96780f()) {
                this.f81089c.collectGaugeMetricOnce(perfSession.mo96777d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!mo96494l()) {
            f81084X.mo96432d("Trace '%s' has not been started so unable to stop!", this.f81090d);
        } else if (mo96496n()) {
            f81084X.mo96432d("Trace '%s' has already stopped, should not stop again!", this.f81090d);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f81087a);
            unregisterForAppState();
            Timer a = this.f81096x.mo96901a();
            this.f81098z = a;
            if (this.f81088b == null) {
                mo96498p(a);
                if (!this.f81090d.isEmpty()) {
                    this.f81095w.mo96863I(new C33382j(this).mo96557a(), getAppState());
                    if (SessionManager.getInstance().perfSession().mo96780f()) {
                        this.f81089c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().mo96777d());
                        return;
                    }
                    return;
                }
                f81084X.mo96431c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Keep
    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeParcelable(this.f81088b, 0);
        parcel.writeString(this.f81090d);
        parcel.writeList(this.f81094v);
        parcel.writeMap(this.f81091e);
        parcel.writeParcelable(this.f81097y, 0);
        parcel.writeParcelable(this.f81098z, 0);
        synchronized (this.f81093g) {
            parcel.writeList(this.f81093g);
        }
    }

    public Trace(@C0359n0 String str) {
        this(str, C33424k.m134761l(), new C33431a(), C33279a.m134177c(), GaugeManager.getInstance());
    }

    public Trace(@C0359n0 Trace trace, @C0359n0 String str, Timer timer, Timer timer2, @C0363p0 List<Trace> list, @C0363p0 Map<String, Counter> map, @C0363p0 Map<String, String> map2) {
        this.f81087a = new WeakReference<>(this);
        this.f81088b = trace;
        this.f81090d = str.trim();
        this.f81097y = timer;
        this.f81098z = timer2;
        this.f81094v = list == null ? new ArrayList<>() : list;
        this.f81091e = map == null ? new ConcurrentHashMap<>() : map;
        this.f81092f = map2 == null ? new ConcurrentHashMap<>() : map2;
        this.f81096x = trace.f81096x;
        this.f81095w = trace.f81095w;
        this.f81093g = Collections.synchronizedList(new ArrayList());
        this.f81089c = trace.f81089c;
    }

    public Trace(@C0359n0 String str, @C0359n0 C33424k kVar, @C0359n0 C33431a aVar, @C0359n0 C33279a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(@C0359n0 String str, @C0359n0 C33424k kVar, @C0359n0 C33431a aVar, @C0359n0 C33279a aVar2, @C0359n0 GaugeManager gaugeManager) {
        super(aVar2);
        this.f81087a = new WeakReference<>(this);
        this.f81088b = null;
        this.f81090d = str.trim();
        this.f81094v = new ArrayList();
        this.f81091e = new ConcurrentHashMap();
        this.f81092f = new ConcurrentHashMap();
        this.f81096x = aVar;
        this.f81095w = kVar;
        this.f81093g = Collections.synchronizedList(new ArrayList());
        this.f81089c = gaugeManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(@C0359n0 Parcel parcel, boolean z) {
        super(z ? null : C33279a.m134177c());
        this.f81087a = new WeakReference<>(this);
        Class<Trace> cls = Trace.class;
        this.f81088b = (Trace) parcel.readParcelable(cls.getClassLoader());
        this.f81090d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f81094v = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f81091e = concurrentHashMap;
        this.f81092f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        Class<Timer> cls2 = Timer.class;
        this.f81097y = (Timer) parcel.readParcelable(cls2.getClassLoader());
        this.f81098z = (Timer) parcel.readParcelable(cls2.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f81093g = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f81095w = null;
            this.f81096x = null;
            this.f81089c = null;
            return;
        }
        this.f81095w = C33424k.m134761l();
        this.f81096x = new C33431a();
        this.f81089c = GaugeManager.getInstance();
    }
}
