package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14218ba;
import com.contentsquare.android.sdk.C14253cc;
import com.contentsquare.android.sdk.C14288e1;
import com.contentsquare.android.sdk.C14359g4;
import com.contentsquare.android.sdk.C14359g4.C14360a;
import com.contentsquare.android.sdk.C14566o3;
import com.contentsquare.android.sdk.C14710sf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.contentsquare.android.sdk.g4 */
public abstract class C14359g4<MessageType extends C14359g4<MessageType, BuilderType>, BuilderType extends C14360a<MessageType, BuilderType>> extends C14288e1<MessageType, BuilderType> {

    /* renamed from: d */
    public static Map<Object, C14359g4<?, ?>> f35515d = new ConcurrentHashMap();

    /* renamed from: b */
    public C14197b1 f35516b = C14197b1.m60926m();

    /* renamed from: c */
    public int f35517c = -1;

    /* renamed from: com.contentsquare.android.sdk.g4$a */
    public static abstract class C14360a<MessageType extends C14359g4<MessageType, BuilderType>, BuilderType extends C14360a<MessageType, BuilderType>> extends C14288e1.C14289a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f35518a;

        /* renamed from: b */
        public MessageType f35519b;

        /* renamed from: c */
        public boolean f35520c = false;

        public C14360a(MessageType messagetype) {
            this.f35518a = messagetype;
            this.f35519b = (C14359g4) messagetype.mo35317r(C14365f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: f */
        public final boolean mo35315f() {
            return C14359g4.m61823x(this.f35519b, false);
        }

        /* renamed from: k */
        public BuilderType mo35019c(MessageType messagetype) {
            return mo35325m(messagetype);
        }

        /* renamed from: l */
        public final void mo35324l(MessageType messagetype, MessageType messagetype2) {
            C14599od.m62876d().mo36106c(messagetype).mo35213c(messagetype, messagetype2);
        }

        /* renamed from: m */
        public BuilderType mo35325m(MessageType messagetype) {
            mo35329t();
            mo35324l(this.f35519b, messagetype);
            return this;
        }

        /* renamed from: n */
        public final MessageType mo34703p() {
            MessageType o = mo34701a();
            if (o.mo35315f()) {
                return o;
            }
            throw C14288e1.C14289a.m61442i(o);
        }

        /* renamed from: o */
        public MessageType mo34701a() {
            if (this.f35520c) {
                return this.f35519b;
            }
            this.f35519b.mo35310E();
            this.f35520c = true;
            return this.f35519b;
        }

        /* renamed from: s */
        public BuilderType clone() {
            BuilderType F = mo35313Y().mo34700j();
            F.mo35325m(mo34701a());
            return F;
        }

        /* renamed from: t */
        public final void mo35329t() {
            if (this.f35520c) {
                mo35330u();
                this.f35520c = false;
            }
        }

        /* renamed from: u */
        public void mo35330u() {
            MessageType messagetype = (C14359g4) this.f35519b.mo35317r(C14365f.NEW_MUTABLE_INSTANCE);
            mo35324l(messagetype, this.f35519b);
            this.f35519b = messagetype;
        }

        /* renamed from: v */
        public MessageType mo35313Y() {
            return this.f35518a;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g4$b */
    public static class C14361b<T extends C14359g4<T, ?>> extends C14491l2<T> {

        /* renamed from: b */
        public final T f35521b;

        public C14361b(T t) {
            this.f35521b = t;
        }

        /* renamed from: g */
        public T mo35089a(C14231c cVar, C14787v2 v2Var) {
            return C14359g4.m61815l(this.f35521b, cVar, v2Var);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g4$c */
    public static abstract class C14362c<MessageType extends C14362c<MessageType, BuilderType>, BuilderType> extends C14359g4<MessageType, BuilderType> implements C14748ta {

        /* renamed from: e */
        public C14253cc<C14363d> f35522e = C14253cc.m61319n();

        /* renamed from: H */
        public C14253cc<C14363d> mo35333H() {
            if (this.f35522e.mo34872u()) {
                this.f35522e = this.f35522e.clone();
            }
            return this.f35522e;
        }

        /* renamed from: S0 */
        public /* bridge */ /* synthetic */ C14218ba.C14219a mo34695S0() {
            return C14359g4.super.mo34695S0();
        }

        /* renamed from: Y */
        public /* bridge */ /* synthetic */ C14218ba mo35313Y() {
            return C14359g4.super.mo35313Y();
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C14218ba.C14219a mo34700j() {
            return C14359g4.super.mo34700j();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g4$d */
    public static final class C14363d implements C14253cc.C14255b<C14363d> {

        /* renamed from: a */
        public final C14566o3.C14570d<?> f35523a;

        /* renamed from: b */
        public final int f35524b;

        /* renamed from: c */
        public final C14710sf.C14712b f35525c;

        /* renamed from: d */
        public final boolean f35526d;

        /* renamed from: e */
        public final boolean f35527e;

        /* renamed from: W1 */
        public C14218ba.C14219a mo34876W1(C14218ba.C14219a aVar, C14218ba baVar) {
            return ((C14360a) aVar).mo35325m((C14359g4) baVar);
        }

        /* renamed from: a */
        public int mo34877a() {
            return this.f35524b;
        }

        /* renamed from: b */
        public int compareTo(C14363d dVar) {
            return this.f35524b - dVar.f35524b;
        }

        /* renamed from: c */
        public boolean mo34879c() {
            return this.f35527e;
        }

        /* renamed from: g */
        public C14566o3.C14570d<?> mo35336g() {
            return this.f35523a;
        }

        /* renamed from: j */
        public C14710sf.C14712b mo34880j() {
            return this.f35525c;
        }

        /* renamed from: p */
        public boolean mo34881p() {
            return this.f35526d;
        }

        /* renamed from: b */
        public C14710sf.C14717c mo34878b() {
            return this.f35525c.mo36423g();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g4$e */
    public static class C14364e<ContainingType extends C14218ba, Type> extends C14437j1<ContainingType, Type> {

        /* renamed from: a */
        public final C14218ba f35528a;

        /* renamed from: b */
        public final C14363d f35529b;

        /* renamed from: a */
        public C14710sf.C14712b mo35337a() {
            return this.f35529b.mo34880j();
        }

        /* renamed from: b */
        public C14218ba mo35338b() {
            return this.f35528a;
        }

        /* renamed from: c */
        public int mo35339c() {
            return this.f35529b.mo34877a();
        }

        /* renamed from: d */
        public boolean mo35340d() {
            return this.f35529b.f35526d;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g4$f */
    public enum C14365f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    public static C14566o3.C14573g m61812A() {
        return C14846x2.m63967M();
    }

    /* renamed from: B */
    public static C14566o3.C14574h m61813B() {
        return C14871y.m64070M();
    }

    /* renamed from: C */
    public static <E> C14566o3.C14575i<E> m61814C() {
        return C14346fe.m61721q();
    }

    /* renamed from: l */
    public static <T extends C14359g4<T, ?>> T m61815l(T t, C14231c cVar, C14787v2 v2Var) {
        T t2 = (C14359g4) t.mo35317r(C14365f.NEW_MUTABLE_INSTANCE);
        try {
            C14398h8 c = C14599od.m62876d().mo36106c(t2);
            c.mo35221i(t2, C14690s.m63305b(cVar), v2Var);
            c.mo35216e(t2);
            return t2;
        } catch (C14394h5 e) {
            e = e;
            if (e.mo35492b()) {
                e = new C14394h5((IOException) e);
            }
            throw e.mo35491a(t2);
        } catch (C14189ae e2) {
            throw e2.mo34546a().mo35491a(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof C14394h5) {
                throw ((C14394h5) e3.getCause());
            }
            throw new C14394h5(e3).mo35491a(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C14394h5) {
                throw ((C14394h5) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: m */
    public static <T extends C14359g4<?, ?>> T m61816m(Class<T> cls) {
        T t = (C14359g4) f35515d.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C14359g4) f35515d.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C14359g4) C14634q4.m63034d(cls)).mo35313Y();
            if (t != null) {
                f35515d.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: n */
    public static C14566o3.C14573g m61817n(C14566o3.C14573g gVar) {
        int size = gVar.size();
        return gVar.mo34508b(size == 0 ? 10 : size * 2);
    }

    /* renamed from: o */
    public static C14566o3.C14574h m61818o(C14566o3.C14574h hVar) {
        int size = hVar.size();
        return hVar.mo34508b(size == 0 ? 10 : size * 2);
    }

    /* renamed from: q */
    public static <E> C14566o3.C14575i<E> m61819q(C14566o3.C14575i<E> iVar) {
        int size = iVar.size();
        return iVar.mo34508b(size == 0 ? 10 : size * 2);
    }

    /* renamed from: u */
    public static Object m61820u(C14218ba baVar, String str, Object[] objArr) {
        return new C14172a5(baVar, str, objArr);
    }

    /* renamed from: v */
    public static Object m61821v(Method method, Object obj, Object... objArr) {
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

    /* renamed from: w */
    public static <T extends C14359g4<?, ?>> void m61822w(Class<T> cls, T t) {
        f35515d.put(cls, t);
    }

    /* renamed from: x */
    public static final <T extends C14359g4<T, ?>> boolean m61823x(T t, boolean z) {
        byte byteValue = ((Byte) t.mo35317r(C14365f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = C14599od.m62876d().mo36106c(t).mo35211b(t);
        if (z) {
            t.mo35318s(C14365f.SET_MEMOIZED_IS_INITIALIZED, b ? t : null);
        }
        return b;
    }

    /* renamed from: D */
    public final MessageType mo35313Y() {
        return (C14359g4) mo35317r(C14365f.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: E */
    public void mo35310E() {
        C14599od.m62876d().mo36106c(this).mo35216e(this);
    }

    /* renamed from: F */
    public final BuilderType mo34700j() {
        return (C14360a) mo35317r(C14365f.NEW_BUILDER);
    }

    /* renamed from: G */
    public final BuilderType mo34695S0() {
        BuilderType buildertype = (C14360a) mo35317r(C14365f.NEW_BUILDER);
        buildertype.mo35325m(this);
        return buildertype;
    }

    /* renamed from: b */
    public void mo34697b(C14235c1 c1Var) {
        C14599od.m62876d().mo36106c(this).mo35219g(this, C14387h1.m61958P(c1Var));
    }

    /* renamed from: c */
    public int mo34698c() {
        if (this.f35517c == -1) {
            this.f35517c = C14599od.m62876d().mo36106c(this).mo35215d(this);
        }
        return this.f35517c;
    }

    /* renamed from: e */
    public void mo35015e(int i) {
        this.f35517c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C14599od.m62876d().mo36106c(this).mo35220h(this, (C14359g4) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35315f() {
        return m61823x(this, true);
    }

    /* renamed from: g */
    public int mo35016g() {
        return this.f35517c;
    }

    public int hashCode() {
        int i = this.f35282a;
        if (i != 0) {
            return i;
        }
        int f = C14599od.m62876d().mo36106c(this).mo35218f(this);
        this.f35282a = f;
        return f;
    }

    /* renamed from: r */
    public Object mo35317r(C14365f fVar) {
        return mo34833t(fVar, (Object) null, (Object) null);
    }

    /* renamed from: s */
    public Object mo35318s(C14365f fVar, Object obj) {
        return mo34833t(fVar, obj, (Object) null);
    }

    /* renamed from: t */
    public abstract Object mo34833t(C14365f fVar, Object obj, Object obj2);

    public String toString() {
        return C14481kb.m62420a(this, super.toString());
    }

    /* renamed from: y */
    public Object mo35320y() {
        return mo35317r(C14365f.BUILD_MESSAGE_INFO);
    }

    /* renamed from: z */
    public final <MessageType extends C14359g4<MessageType, BuilderType>, BuilderType extends C14360a<MessageType, BuilderType>> BuilderType mo35321z() {
        return (C14360a) mo35317r(C14365f.NEW_BUILDER);
    }

    /* renamed from: b */
    public final C14311ee<MessageType> mo34696b() {
        return (C14311ee) mo35317r(C14365f.GET_PARSER);
    }
}
