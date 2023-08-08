package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.C0323b0;
import androidx.annotation.C0346i;
import androidx.annotation.C0363p0;
import com.android.volley.C21751e;
import com.android.volley.C21771p;
import com.android.volley.C21776s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.C11626x;

public abstract class Request<T> implements Comparable<Request<T>> {

    /* renamed from: G0 */
    public static final String f56139G0 = "UTF-8";

    /* renamed from: E0 */
    public Object f56140E0;
    @C0323b0("mLock")

    /* renamed from: F0 */
    public C21711c f56141F0;

    /* renamed from: X */
    public boolean f56142X;

    /* renamed from: Y */
    public C21775r f56143Y;
    @C0363p0

    /* renamed from: Z */
    public C21751e.C21752a f56144Z;

    /* renamed from: a */
    public final C21776s.C21777a f56145a;

    /* renamed from: b */
    public final int f56146b;

    /* renamed from: c */
    public final String f56147c;

    /* renamed from: d */
    public final int f56148d;

    /* renamed from: e */
    public final Object f56149e;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: f */
    public C21771p.C21772a f56150f;

    /* renamed from: g */
    public Integer f56151g;

    /* renamed from: v */
    public C21764n f56152v;

    /* renamed from: w */
    public boolean f56153w;
    @C0323b0("mLock")

    /* renamed from: x */
    public boolean f56154x;
    @C0323b0("mLock")

    /* renamed from: y */
    public boolean f56155y;

    /* renamed from: z */
    public boolean f56156z;

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* renamed from: com.android.volley.Request$a */
    public class C21709a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f56162a;

        /* renamed from: b */
        public final /* synthetic */ long f56163b;

        public C21709a(String str, long j) {
            this.f56162a = str;
            this.f56163b = j;
        }

        public void run() {
            Request.this.f56145a.mo64961a(this.f56162a, this.f56163b);
            Request.this.f56145a.mo64962b(Request.this.toString());
        }
    }

    /* renamed from: com.android.volley.Request$b */
    public interface C21710b {

        /* renamed from: a */
        public static final int f56165a = -1;

        /* renamed from: b */
        public static final int f56166b = 0;

        /* renamed from: c */
        public static final int f56167c = 1;

        /* renamed from: d */
        public static final int f56168d = 2;

        /* renamed from: e */
        public static final int f56169e = 3;

        /* renamed from: f */
        public static final int f56170f = 4;

        /* renamed from: g */
        public static final int f56171g = 5;

        /* renamed from: h */
        public static final int f56172h = 6;

        /* renamed from: i */
        public static final int f56173i = 7;
    }

    /* renamed from: com.android.volley.Request$c */
    public interface C21711c {
        /* renamed from: a */
        void mo64822a(Request<?> request, C21771p<?> pVar);

        /* renamed from: b */
        void mo64823b(Request<?> request);
    }

    @Deprecated
    public Request(String str, C21771p.C21772a aVar) {
        this(-1, str, aVar);
    }

    /* renamed from: M */
    public static int m99875M(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: A0 */
    public C21775r mo64776A0() {
        return this.f56143Y;
    }

    /* renamed from: A1 */
    public final Request<?> mo64777A1(int i) {
        this.f56151g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: B1 */
    public final Request<?> mo64778B1(boolean z) {
        this.f56153w = z;
        return this;
    }

    /* renamed from: C0 */
    public final int mo64779C0() {
        Integer num = this.f56151g;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    /* renamed from: E1 */
    public final Request<?> mo64780E1(boolean z) {
        this.f56142X = z;
        return this;
    }

    /* renamed from: F0 */
    public Object mo64781F0() {
        return this.f56140E0;
    }

    /* renamed from: F1 */
    public final Request<?> mo64782F1(boolean z) {
        this.f56156z = z;
        return this;
    }

    /* renamed from: G1 */
    public Request<?> mo64783G1(Object obj) {
        this.f56140E0 = obj;
        return this;
    }

    /* renamed from: H0 */
    public final int mo64784H0() {
        return mo64776A0().mo64926c();
    }

    /* renamed from: H1 */
    public final boolean mo64785H1() {
        return this.f56153w;
    }

    /* renamed from: I1 */
    public final boolean mo64786I1() {
        return this.f56142X;
    }

    /* renamed from: K0 */
    public int mo64787K0() {
        return this.f56148d;
    }

    /* renamed from: L0 */
    public String mo64788L0() {
        return this.f56147c;
    }

    /* renamed from: L1 */
    public final boolean mo64789L1() {
        return this.f56156z;
    }

    /* renamed from: N0 */
    public boolean mo64790N0() {
        boolean z;
        synchronized (this.f56149e) {
            z = this.f56155y;
        }
        return z;
    }

    /* renamed from: O0 */
    public boolean mo64791O0() {
        boolean z;
        synchronized (this.f56149e) {
            z = this.f56154x;
        }
        return z;
    }

    /* renamed from: Q */
    public void mo64792Q(String str) {
        C21764n nVar = this.f56152v;
        if (nVar != null) {
            nVar.mo64949g(this);
        }
        if (C21776s.C21777a.f56331c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C21709a(str, id));
                return;
            }
            this.f56145a.mo64961a(str, id);
            this.f56145a.mo64962b(toString());
        }
    }

    /* renamed from: R0 */
    public void mo64793R0() {
        synchronized (this.f56149e) {
            this.f56155y = true;
        }
    }

    /* renamed from: U0 */
    public void mo64794U0() {
        C21711c cVar;
        synchronized (this.f56149e) {
            cVar = this.f56141F0;
        }
        if (cVar != null) {
            cVar.mo64823b(this);
        }
    }

    /* renamed from: W */
    public byte[] mo20315W() throws AuthFailureError {
        Map<String, String> j0 = mo64803j0();
        if (j0 == null || j0.size() <= 0) {
            return null;
        }
        return mo64819z(j0, mo64806m0());
    }

    /* renamed from: X */
    public String mo64795X() {
        return "application/x-www-form-urlencoded; charset=" + mo64806m0();
    }

    @C0363p0
    /* renamed from: Z */
    public C21751e.C21752a mo64796Z() {
        return this.f56144Z;
    }

    /* renamed from: c1 */
    public void mo64797c1(C21771p<?> pVar) {
        C21711c cVar;
        synchronized (this.f56149e) {
            cVar = this.f56141F0;
        }
        if (cVar != null) {
            cVar.mo64822a(this, pVar);
        }
    }

    /* renamed from: e0 */
    public String mo64799e0() {
        String L0 = mo64788L0();
        int i0 = mo64802i0();
        if (i0 == 0 || i0 == -1) {
            return L0;
        }
        return Integer.toString(i0) + '-' + L0;
    }

    @C0363p0
    /* renamed from: f0 */
    public C21771p.C21772a mo64800f0() {
        C21771p.C21772a aVar;
        synchronized (this.f56149e) {
            aVar = this.f56150f;
        }
        return aVar;
    }

    /* renamed from: g */
    public void mo64801g(String str) {
        if (C21776s.C21777a.f56331c) {
            this.f56145a.mo64961a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: h0 */
    public Map<String, String> mo20316h0() throws AuthFailureError {
        return Collections.emptyMap();
    }

    /* renamed from: i0 */
    public int mo64802i0() {
        return this.f56146b;
    }

    @C0363p0
    /* renamed from: j0 */
    public Map<String, String> mo64803j0() throws AuthFailureError {
        return null;
    }

    /* renamed from: j1 */
    public VolleyError mo64804j1(VolleyError volleyError) {
        return volleyError;
    }

    /* renamed from: k1 */
    public abstract C21771p<T> mo20305k1(C21762l lVar);

    /* renamed from: l1 */
    public void mo64805l1(int i) {
        C21764n nVar = this.f56152v;
        if (nVar != null) {
            nVar.mo64955m(this, i);
        }
    }

    /* renamed from: m0 */
    public String mo64806m0() {
        return "UTF-8";
    }

    @Deprecated
    /* renamed from: n0 */
    public byte[] mo64807n0() throws AuthFailureError {
        Map<String, String> p0 = mo64810p0();
        if (p0 == null || p0.size() <= 0) {
            return null;
        }
        return mo64819z(p0, mo64814t0());
    }

    /* renamed from: n1 */
    public Request<?> mo64808n1(C21751e.C21752a aVar) {
        this.f56144Z = aVar;
        return this;
    }

    @Deprecated
    /* renamed from: o0 */
    public String mo64809o0() {
        return mo64795X();
    }

    @C0363p0
    @Deprecated
    /* renamed from: p0 */
    public Map<String, String> mo64810p0() throws AuthFailureError {
        return mo64803j0();
    }

    @C0346i
    /* renamed from: q */
    public void mo64811q() {
        synchronized (this.f56149e) {
            this.f56154x = true;
            this.f56150f = null;
        }
    }

    /* renamed from: q1 */
    public void mo64812q1(C21711c cVar) {
        synchronized (this.f56149e) {
            this.f56141F0 = cVar;
        }
    }

    /* renamed from: r */
    public int compareTo(Request<T> request) {
        Priority u0 = mo64816u0();
        Priority u02 = request.mo64816u0();
        if (u0 == u02) {
            return this.f56151g.intValue() - request.f56151g.intValue();
        }
        return u02.ordinal() - u0.ordinal();
    }

    @Deprecated
    /* renamed from: t0 */
    public String mo64814t0() {
        return mo64806m0();
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(mo64787K0());
        StringBuilder sb = new StringBuilder();
        if (mo64791O0()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(mo64788L0());
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(mo64816u0());
        sb.append(" ");
        sb.append(this.f56151g);
        return sb.toString();
    }

    /* renamed from: u0 */
    public Priority mo64816u0() {
        return Priority.NORMAL;
    }

    /* renamed from: w */
    public void mo64817w(VolleyError volleyError) {
        C21771p.C21772a aVar;
        synchronized (this.f56149e) {
            aVar = this.f56150f;
        }
        if (aVar != null) {
            aVar.mo20312c(volleyError);
        }
    }

    /* renamed from: w1 */
    public Request<?> mo64818w1(C21764n nVar) {
        this.f56152v = nVar;
        return this;
    }

    /* renamed from: y */
    public abstract void mo20306y(T t);

    /* renamed from: z */
    public final byte[] mo64819z(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() == null || next.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", new Object[]{next.getKey(), next.getValue()}));
                }
                sb.append(URLEncoder.encode((String) next.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), str));
                sb.append(C11626x.f28913d);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: z1 */
    public Request<?> mo64820z1(C21775r rVar) {
        this.f56143Y = rVar;
        return this;
    }

    public Request(int i, String str, @C0363p0 C21771p.C21772a aVar) {
        this.f56145a = C21776s.C21777a.f56331c ? new C21776s.C21777a() : null;
        this.f56149e = new Object();
        this.f56153w = true;
        this.f56154x = false;
        this.f56155y = false;
        this.f56156z = false;
        this.f56142X = false;
        this.f56144Z = null;
        this.f56146b = i;
        this.f56147c = str;
        this.f56150f = aVar;
        mo64820z1(new C21755g());
        this.f56148d = m99875M(str);
    }
}
