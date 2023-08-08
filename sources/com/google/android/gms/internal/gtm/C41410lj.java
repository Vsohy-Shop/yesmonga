package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41265fj;
import com.google.android.gms.internal.gtm.C41410lj;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.gtm.lj */
public abstract class C41410lj<MessageType extends C41410lj<MessageType, BuilderType>, BuilderType extends C41265fj<MessageType, BuilderType>> extends C41695xg<MessageType, BuilderType> {
    private static final Map<Object, C41410lj<?, ?>> zza = new ConcurrentHashMap();
    protected C41748zl zzc = C41748zl.m168947c();
    protected int zzd = -1;

    /* renamed from: B */
    public static <T extends C41410lj<T, ?>> T m168012B(T t) throws zzvk {
        if (t == null || t.mo135366i()) {
            return t;
        }
        zzvk zzvk = new zzvk(new zzxn(t).getMessage());
        zzvk.mo136159h(t);
        throw zzvk;
    }

    /* renamed from: n */
    public static <ContainingType extends C41627uk, Type> C41361jj<ContainingType, Type> m168013n(ContainingType containingtype, Type type, C41627uk ukVar, C41506pj pjVar, int i, zzye zzye, Class cls) {
        return new C41361jj(containingtype, type, ukVar, new C41337ij(pjVar, i, zzye, false, false), cls);
    }

    /* renamed from: o */
    public static <T extends C41410lj> T m168014o(Class<T> cls) {
        Map<Object, C41410lj<?, ?>> map = zza;
        T t = (C41410lj) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C41410lj) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C41410lj) ((C41410lj) C41340im.m167752j(cls)).mo134974A(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: p */
    public static <T extends C41410lj<T, ?>> T m168015p(T t, InputStream inputStream, C41673wi wiVar) throws zzvk {
        C41624uh uhVar = new C41624uh(inputStream, 4096, (C41600th) null);
        T t2 = (C41410lj) t.mo134974A(4, (Object) null, (Object) null);
        try {
            C41315hl<?> b = C41219dl.m167407a().mo135299b(t2.getClass());
            b.mo135464j(t2, C41696xh.m168723m(uhVar), wiVar);
            b.mo135457c(t2);
            m168012B(t2);
            return t2;
        } catch (zzvk e) {
            e = e;
            if (e.mo136161l()) {
                e = new zzvk((IOException) e);
            }
            e.mo136159h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzvk) {
                throw ((zzvk) e2.getCause());
            }
            zzvk zzvk = new zzvk(e2);
            zzvk.mo136159h(t2);
            throw zzvk;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzvk) {
                throw ((zzvk) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: q */
    public static <T extends C41410lj<T, ?>> T m168016q(T t, byte[] bArr, C41673wi wiVar) throws zzvk {
        T r = m168017r(t, bArr, 0, bArr.length, wiVar);
        m168012B(r);
        return r;
    }

    /* renamed from: r */
    public static <T extends C41410lj<T, ?>> T m168017r(T t, byte[] bArr, int i, int i2, C41673wi wiVar) throws zzvk {
        T t2 = (C41410lj) t.mo134974A(4, (Object) null, (Object) null);
        try {
            C41315hl<?> b = C41219dl.m167407a().mo135299b(t2.getClass());
            b.mo135463i(t2, bArr, 0, i2, new C41167bh(wiVar));
            b.mo135457c(t2);
            if (t2.zzb == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzvk e) {
            e = e;
            if (e.mo136161l()) {
                e = new zzvk((IOException) e);
            }
            e.mo136159h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzvk) {
                throw ((zzvk) e2.getCause());
            }
            zzvk zzvk = new zzvk(e2);
            zzvk.mo136159h(t2);
            throw zzvk;
        } catch (IndexOutOfBoundsException unused) {
            zzvk j = zzvk.m169002j();
            j.mo136159h(t2);
            throw j;
        }
    }

    /* renamed from: s */
    public static C41554rj m168018s() {
        return C41458nj.m168083i();
    }

    /* renamed from: t */
    public static <E> C41626uj<E> m168019t() {
        return C41243el.m167469h();
    }

    /* renamed from: u */
    public static <E> C41626uj<E> m168020u(C41626uj<E> ujVar) {
        int i;
        int size = ujVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return ujVar.mo135130n(i);
    }

    /* renamed from: v */
    public static Object m168021v(Method method, Object obj, Object... objArr) {
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

    /* renamed from: x */
    public static Object m168022x(C41627uk ukVar, String str, Object[] objArr) {
        return new C41267fl(ukVar, str, objArr);
    }

    /* renamed from: z */
    public static <T extends C41410lj> void m168023z(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* renamed from: A */
    public abstract Object mo134974A(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final int mo135622a() {
        return this.zzd;
    }

    /* renamed from: b */
    public final int mo135623b() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int b = C41219dl.m167407a().mo135299b(getClass()).mo135456b(this);
        this.zzd = b;
        return b;
    }

    /* renamed from: c */
    public final void mo135624c(C41144ai aiVar) throws IOException {
        C41219dl.m167407a().mo135299b(getClass()).mo135462h(this, C41168bi.m167162m(aiVar));
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C41603tk mo135625e() {
        C41265fj fjVar = (C41265fj) mo134974A(5, (Object) null, (Object) null);
        fjVar.mo135373u(this);
        return fjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C41219dl.m167407a().mo135299b(getClass()).mo135459e(this, (C41410lj) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C41603tk mo135627f() {
        return (C41265fj) mo134974A(5, (Object) null, (Object) null);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C41627uk mo135365h() {
        return (C41410lj) mo134974A(6, (Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int a = C41219dl.m167407a().mo135299b(getClass()).mo135455a(this);
        this.zzb = a;
        return a;
    }

    /* renamed from: i */
    public final boolean mo135366i() {
        C41410lj ljVar;
        byte byteValue = ((Byte) mo134974A(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g = C41219dl.m167407a().mo135299b(getClass()).mo135461g(this);
        if (true != g) {
            ljVar = null;
        } else {
            ljVar = this;
        }
        mo134974A(2, ljVar, (Object) null);
        return g;
    }

    /* renamed from: k */
    public final void mo135629k(int i) {
        this.zzd = i;
    }

    /* renamed from: l */
    public final <MessageType extends C41410lj<MessageType, BuilderType>, BuilderType extends C41265fj<MessageType, BuilderType>> BuilderType mo135630l() {
        return (C41265fj) mo134974A(5, (Object) null, (Object) null);
    }

    /* renamed from: m */
    public final BuilderType mo135631m() {
        BuilderType buildertype = (C41265fj) mo134974A(5, (Object) null, (Object) null);
        buildertype.mo135373u(this);
        return buildertype;
    }

    public final String toString() {
        return C41675wk.m168683a(this, super.toString());
    }
}
