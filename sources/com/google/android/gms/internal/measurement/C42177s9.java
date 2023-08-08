package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C42092n9;
import com.google.android.gms.internal.measurement.C42177s9;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.s9 */
public abstract class C42177s9<MessageType extends C42177s9<MessageType, BuilderType>, BuilderType extends C42092n9<MessageType, BuilderType>> extends C41948f8<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C42298zb zzc = C42298zb.m171286c();
    private int zzd = -1;

    /* renamed from: l */
    public static C42177s9 m170817l(Class cls) {
        Map map = zza;
        C42177s9 s9Var = (C42177s9) map.get(cls);
        if (s9Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                s9Var = (C42177s9) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (s9Var == null) {
            s9Var = (C42177s9) ((C42177s9) C42006ic.m170299j(cls)).mo136501A(6, (Object) null, (Object) null);
            if (s9Var != null) {
                map.put(cls, s9Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return s9Var;
    }

    /* renamed from: n */
    public static C42262x9 m170818n() {
        return C42194t9.m170871i();
    }

    /* renamed from: o */
    public static C42279y9 m170819o() {
        return C42058la.m170495h();
    }

    /* renamed from: p */
    public static C42279y9 m170820p(C42279y9 y9Var) {
        int i;
        int size = y9Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return y9Var.mo137120x0(i);
    }

    /* renamed from: q */
    public static C42296z9 m170821q() {
        return C41951fb.m169885h();
    }

    /* renamed from: r */
    public static C42296z9 m170822r(C42296z9 z9Var) {
        int i;
        int size = z9Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return z9Var.mo136618n(i);
    }

    /* renamed from: s */
    public static Object m170823s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: t */
    public static Object m170824t(C42246wa waVar, String str, Object[] objArr) {
        return new C41969gb(waVar, str, objArr);
    }

    /* renamed from: w */
    public static void m170825w(Class cls, C42177s9 s9Var) {
        s9Var.mo137282v();
        zza.put(cls, s9Var);
    }

    /* renamed from: A */
    public abstract Object mo136501A(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final int mo136761a(C41987hb hbVar) {
        if (mo137284y()) {
            int i = mo137276i(hbVar);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = mo137276i(hbVar);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i3);
    }

    /* renamed from: b */
    public final int mo137271b() {
        int i;
        if (mo137284y()) {
            i = mo137276i((C41987hb) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = mo137276i((C41987hb) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public final /* synthetic */ C42229va mo137272c() {
        return (C42092n9) mo136501A(5, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final void mo137273e(C42295z8 z8Var) throws IOException {
        C41933eb.m169828a().mo136721b(getClass()).mo136570h(this, C41859a9.m169629J(z8Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C41933eb.m169828a().mo136721b(getClass()).mo136567e(this, (C42177s9) obj);
    }

    /* renamed from: f */
    public final /* synthetic */ C42246wa mo137176f() {
        return (C42177s9) mo136501A(6, (Object) null, (Object) null);
    }

    public final int hashCode() {
        if (mo137284y()) {
            return mo137285z();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int z = mo137285z();
        this.zzb = z;
        return z;
    }

    /* renamed from: i */
    public final int mo137276i(C41987hb hbVar) {
        if (hbVar != null) {
            return hbVar.mo136564b(this);
        }
        return C41933eb.m169828a().mo136721b(getClass()).mo136564b(this);
    }

    /* renamed from: j */
    public final C42092n9 mo137277j() {
        return (C42092n9) mo136501A(5, (Object) null, (Object) null);
    }

    /* renamed from: k */
    public final C42092n9 mo137278k() {
        C42092n9 n9Var = (C42092n9) mo136501A(5, (Object) null, (Object) null);
        n9Var.mo137178n(this);
        return n9Var;
    }

    /* renamed from: m */
    public final C42177s9 mo137279m() {
        return (C42177s9) mo136501A(4, (Object) null, (Object) null);
    }

    public final String toString() {
        return C42280ya.m171172a(this, super.toString());
    }

    /* renamed from: u */
    public final void mo137281u() {
        C41933eb.m169828a().mo136721b(getClass()).mo136565c(this);
        mo137282v();
    }

    /* renamed from: v */
    public final void mo137282v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: x */
    public final void mo137283x(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: y */
    public final boolean mo137284y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: z */
    public final int mo137285z() {
        return C41933eb.m169828a().mo136721b(getClass()).mo136563a(this);
    }
}
