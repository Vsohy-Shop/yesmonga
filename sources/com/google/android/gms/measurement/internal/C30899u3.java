package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0323b0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C42113od;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
public final class C30899u3 extends C30654a6 {

    /* renamed from: c */
    public char f73975c = 0;

    /* renamed from: d */
    public long f73976d = -1;
    @C0323b0("this")

    /* renamed from: e */
    public String f73977e;

    /* renamed from: f */
    public final C30875s3 f73978f = new C30875s3(this, 6, false, false);

    /* renamed from: g */
    public final C30875s3 f73979g = new C30875s3(this, 6, true, false);

    /* renamed from: h */
    public final C30875s3 f73980h = new C30875s3(this, 6, false, true);

    /* renamed from: i */
    public final C30875s3 f73981i = new C30875s3(this, 5, false, false);

    /* renamed from: j */
    public final C30875s3 f73982j = new C30875s3(this, 5, true, false);

    /* renamed from: k */
    public final C30875s3 f73983k = new C30875s3(this, 5, false, true);

    /* renamed from: l */
    public final C30875s3 f73984l = new C30875s3(this, 4, false, false);

    /* renamed from: m */
    public final C30875s3 f73985m = new C30875s3(this, 3, false, false);

    /* renamed from: n */
    public final C30875s3 f73986n = new C30875s3(this, 2, false, false);

    public C30899u3(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: A */
    public static String m124179A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String B = m124180B(z, obj);
        String B2 = m124180B(z, obj2);
        String B3 = m124180B(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    @C40974d0
    /* renamed from: B */
    public static String m124180B(boolean z, Object obj) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String C = m124181C(C30731g5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m124181C(className).equals(C)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C30887t3) {
                return ((C30887t3) obj).f73958a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    @C40974d0
    /* renamed from: C */
    public static String m124181C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        C42113od.m170692b();
        if (((Boolean) C30742h3.f73487A0.mo87094a((Object) null)).booleanValue()) {
            return "";
        }
        return str;
    }

    /* renamed from: z */
    public static Object m124186z(String str) {
        if (str == null) {
            return null;
        }
        return new C30887t3(str);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @C40974d0
    /* renamed from: D */
    public final String mo87486D() {
        String str;
        synchronized (this) {
            if (this.f73977e == null) {
                if (this.f74136a.mo87113Q() != null) {
                    this.f73977e = this.f74136a.mo87113Q();
                } else {
                    this.f73977e = this.f74136a.mo87130z().mo87090w();
                }
            }
            C40843u.m166202l(this.f73977e);
            str = this.f73977e;
        }
        return str;
    }

    /* renamed from: G */
    public final void mo87487G(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo87486D(), i)) {
            Log.println(i, mo87486D(), m124179A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C40843u.m166202l(str);
            C30692d5 G = this.f74136a.mo87104G();
            if (G == null) {
                Log.println(6, mo87486D(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo86876n()) {
                Log.println(6, mo87486D(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                G.mo86950z(new C30863r3(this, i, str, obj, obj2, obj3));
            }
        }
    }

    /* renamed from: j */
    public final boolean mo86872j() {
        return false;
    }

    /* renamed from: q */
    public final C30875s3 mo87488q() {
        return this.f73985m;
    }

    /* renamed from: r */
    public final C30875s3 mo87489r() {
        return this.f73978f;
    }

    /* renamed from: s */
    public final C30875s3 mo87490s() {
        return this.f73980h;
    }

    /* renamed from: t */
    public final C30875s3 mo87491t() {
        return this.f73979g;
    }

    /* renamed from: u */
    public final C30875s3 mo87492u() {
        return this.f73984l;
    }

    /* renamed from: v */
    public final C30875s3 mo87493v() {
        return this.f73986n;
    }

    /* renamed from: w */
    public final C30875s3 mo87494w() {
        return this.f73981i;
    }

    /* renamed from: x */
    public final C30875s3 mo87495x() {
        return this.f73983k;
    }

    /* renamed from: y */
    public final C30875s3 mo87496y() {
        return this.f73982j;
    }
}
