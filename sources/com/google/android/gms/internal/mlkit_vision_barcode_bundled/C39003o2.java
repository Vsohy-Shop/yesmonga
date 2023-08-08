package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38935h2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o2 */
public abstract class C39003o2<MessageType extends C39003o2<MessageType, BuilderType>, BuilderType extends C38935h2<MessageType, BuilderType>> extends C39091y0<MessageType, BuilderType> {
    private static final Map<Object, C39003o2<?, ?>> zza = new ConcurrentHashMap();
    protected C38938h5 zzc = C38938h5.m160536c();
    protected int zzd = -1;

    /* renamed from: j */
    public static <ContainingType extends C39076w3, Type> C38985m2<ContainingType, Type> m160629j(ContainingType containingtype, Type type, C39076w3 w3Var, C39030r2 r2Var, int i, zzhp zzhp, Class cls) {
        return new C38985m2(containingtype, type, w3Var, new C38975l2((C39030r2<?>) null, i, zzhp, false, false), cls);
    }

    /* renamed from: k */
    public static <T extends C39003o2> T m160630k(Class<T> cls) {
        Map<Object, C39003o2<?, ?>> map = zza;
        T t = (C39003o2) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C39003o2) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C39003o2) ((C39003o2) C39024q5.m160720j(cls)).mo94469z(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: l */
    public static <T extends C39003o2<T, ?>> T m160631l(T t, byte[] bArr, C39101z1 z1Var) throws zzep {
        T m = m160632m(t, bArr, 0, bArr.length, z1Var);
        if (m == null || m.mo122908b()) {
            return m;
        }
        zzep zzep = new zzep(new zzgy(m).getMessage());
        zzep.mo123207f(m);
        throw zzep;
    }

    /* renamed from: m */
    public static <T extends C39003o2<T, ?>> T m160632m(T t, byte[] bArr, int i, int i2, C39101z1 z1Var) throws zzep {
        T t2 = (C39003o2) t.mo94469z(4, (Object) null, (Object) null);
        try {
            C39014p4<?> b = C38917f4.m160495a().mo122883b(t2.getClass());
            b.mo122791e(t2, bArr, 0, i2, new C38884c1(z1Var));
            b.mo122789c(t2);
            if (t2.zzb == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzep e) {
            e.mo123207f(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzep) {
                throw ((zzep) e2.getCause());
            }
            zzep zzep = new zzep(e2);
            zzep.mo123207f(t2);
            throw zzep;
        } catch (IndexOutOfBoundsException unused) {
            zzep g = zzep.m161105g();
            g.mo123207f(t2);
            throw g;
        }
    }

    /* renamed from: n */
    public static C39048t2 m160633n() {
        return C38915f2.m160489h();
    }

    /* renamed from: o */
    public static C39048t2 m160634o(C39048t2 t2Var) {
        int i;
        int size = t2Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return t2Var.mo122880m(i);
    }

    /* renamed from: p */
    public static C39057u2 m160635p() {
        return C39012p2.m160669i();
    }

    /* renamed from: s */
    public static <E> C39075w2<E> m160636s() {
        return C38927g4.m160516h();
    }

    /* renamed from: t */
    public static <E> C39075w2<E> m160637t(C39075w2<E> w2Var) {
        int i;
        int size = w2Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return w2Var.mo122844n(i);
    }

    /* renamed from: u */
    public static Object m160638u(Method method, Object obj, Object... objArr) {
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

    /* renamed from: v */
    public static Object m160639v(C39076w3 w3Var, String str, Object[] objArr) {
        return new C38947i4(w3Var, str, objArr);
    }

    /* renamed from: w */
    public static <T extends C39003o2> void m160640w(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ C39067v3 mo122982A() {
        return (C38935h2) mo94469z(5, (Object) null, (Object) null);
    }

    /* renamed from: a */
    public final int mo122983a() {
        return this.zzd;
    }

    /* renamed from: b */
    public final boolean mo122908b() {
        C39003o2 o2Var;
        byte byteValue = ((Byte) mo94469z(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i = C38917f4.m160495a().mo122883b(getClass()).mo122795i(this);
        if (true != i) {
            o2Var = null;
        } else {
            o2Var = this;
        }
        mo94469z(2, o2Var, (Object) null);
        return i;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C39076w3 mo122909c() {
        return (C39003o2) mo94469z(6, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final void mo122984e(C39056u1 u1Var) throws IOException {
        C38917f4.m160495a().mo122883b(getClass()).mo122794h(this, C39065v1.m160895m(u1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C38917f4.m160495a().mo122883b(getClass()).mo122793g(this, (C39003o2) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C39067v3 mo122986f() {
        C38935h2 h2Var = (C38935h2) mo94469z(5, (Object) null, (Object) null);
        h2Var.mo122914l(this);
        return h2Var;
    }

    /* renamed from: g */
    public final void mo122987g(int i) {
        this.zzd = i;
    }

    /* renamed from: h */
    public final <MessageType extends C39003o2<MessageType, BuilderType>, BuilderType extends C38935h2<MessageType, BuilderType>> BuilderType mo122988h() {
        return (C38935h2) mo94469z(5, (Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int a = C38917f4.m160495a().mo122883b(getClass()).mo122787a(this);
        this.zzb = a;
        return a;
    }

    /* renamed from: i */
    public final BuilderType mo122990i() {
        BuilderType buildertype = (C38935h2) mo94469z(5, (Object) null, (Object) null);
        buildertype.mo122914l(this);
        return buildertype;
    }

    public final String toString() {
        return C39094y3.m160984a(this, super.toString());
    }

    /* renamed from: x */
    public final int mo122992x() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int b = C38917f4.m160495a().mo122883b(getClass()).mo122788b(this);
        this.zzd = b;
        return b;
    }

    /* renamed from: z */
    public abstract Object mo94469z(int i, Object obj, Object obj2);
}
