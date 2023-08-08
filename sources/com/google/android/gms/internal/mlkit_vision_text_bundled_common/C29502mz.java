package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29281gz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29502mz;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.mz */
public abstract class C29502mz<MessageType extends C29502mz<MessageType, BuilderType>, BuilderType extends C29281gz<MessageType, BuilderType>> extends C29648qx<MessageType, BuilderType> {
    private static final Map<Object, C29502mz<?, ?>> zbb = new ConcurrentHashMap();
    protected C29392k zbc = C29392k.m120586c();
    protected int zbd = -1;

    /* renamed from: j */
    public static Object m120752j(x00 x00, String str, Object[] objArr) {
        return new i10(x00, str, objArr);
    }

    /* renamed from: k */
    public static <T extends C29502mz> void m120753k(Class<T> cls, T t) {
        zbb.put(cls, t);
    }

    /* renamed from: n */
    public static <T extends C29502mz> T m120754n(Class<T> cls) {
        Map<Object, C29502mz<?, ?>> map = zbb;
        T t = (C29502mz) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C29502mz) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C29502mz) ((C29502mz) C29725t.m121138j(cls)).mo84505l(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: o */
    public static <T extends C29502mz<T, ?>> T m120755o(T t, byte[] bArr, C29908xy xyVar) throws zbye {
        T p = m120756p(t, bArr, 0, bArr.length, xyVar);
        if (p == null || p.mo84648h()) {
            return p;
        }
        zbye zbye = new zbye(new zbaah(p).getMessage());
        zbye.mo85004f(p);
        throw zbye;
    }

    /* renamed from: p */
    public static <T extends C29502mz<T, ?>> T m120756p(T t, byte[] bArr, int i, int i2, C29908xy xyVar) throws zbye {
        T t2 = (C29502mz) t.mo84505l(4, (Object) null, (Object) null);
        try {
            j10<?> b = g10.m120414a().mo84636b(t2.getClass());
            b.mo84489g(t2, bArr, 0, i2, new C29944yx(xyVar));
            b.mo84487e(t2);
            if (t2.zba == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zbye e) {
            e.mo85004f(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zbye) {
                throw ((zbye) e2.getCause());
            }
            zbye zbye = new zbye(e2);
            zbye.mo85004f(t2);
            throw zbye;
        } catch (IndexOutOfBoundsException unused) {
            zbye g = zbye.m121514g();
            g.mo85004f(t2);
            throw g;
        }
    }

    /* renamed from: q */
    public static C29687rz m120757q() {
        return C29170dz.m120318h();
    }

    /* renamed from: r */
    public static C29724sz m120758r() {
        return C29539nz.m120811i();
    }

    /* renamed from: s */
    public static C29835vz m120759s() {
        return l00.m120644i();
    }

    /* renamed from: t */
    public static <E> C29872wz<E> m120760t() {
        return h10.m120454h();
    }

    /* renamed from: u */
    public static Object m120761u(Method method, Object obj, Object... objArr) {
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

    /* renamed from: a */
    public final void mo84726a(int i) {
        this.zbd = i;
    }

    /* renamed from: b */
    public final int mo84727b() {
        int i = this.zbd;
        if (i != -1) {
            return i;
        }
        int a = g10.m120414a().mo84636b(getClass()).mo84483a(this);
        this.zbd = a;
        return a;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ w00 mo84728c() {
        C29281gz gzVar = (C29281gz) mo84505l(5, (Object) null, (Object) null);
        gzVar.mo84653n(this);
        return gzVar;
    }

    /* renamed from: d */
    public final int mo84729d() {
        return this.zbd;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ w00 mo84730e() {
        return (C29281gz) mo84505l(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return g10.m120414a().mo84636b(getClass()).mo84488f(this, (C29502mz) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo84732f(C29686ry ryVar) throws IOException {
        g10.m120414a().mo84636b(getClass()).mo84485c(this, C29723sy.m121085M(ryVar));
    }

    /* renamed from: h */
    public final boolean mo84648h() {
        C29502mz mzVar;
        byte byteValue = ((Byte) mo84505l(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = g10.m120414a().mo84636b(getClass()).mo84486d(this);
        if (true != d) {
            mzVar = null;
        } else {
            mzVar = this;
        }
        mo84505l(2, mzVar, (Object) null);
        return d;
    }

    public final int hashCode() {
        int i = this.zba;
        if (i != 0) {
            return i;
        }
        int h = g10.m120414a().mo84636b(getClass()).mo84490h(this);
        this.zba = h;
        return h;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ x00 mo84649i() {
        return (C29502mz) mo84505l(6, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public abstract Object mo84505l(int i, Object obj, Object obj2);

    /* renamed from: m */
    public final <MessageType extends C29502mz<MessageType, BuilderType>, BuilderType extends C29281gz<MessageType, BuilderType>> BuilderType mo84734m() {
        return (C29281gz) mo84505l(5, (Object) null, (Object) null);
    }

    public final String toString() {
        return z00.m121428a(this, super.toString());
    }
}
