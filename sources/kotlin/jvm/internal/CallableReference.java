package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.C11665v0;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11499h;
import kotlin.reflect.C11520r;
import kotlin.reflect.C11522s;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements C11492c, Serializable {
    @C11665v0(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.f28420a;
    @C11665v0(version = "1.4")
    private final boolean isTopLevel;
    @C11665v0(version = "1.4")
    private final String name;
    @C11665v0(version = "1.4")
    private final Class owner;
    @C11665v0(version = "1.1")
    protected final Object receiver;
    private transient C11492c reflected;
    @C11665v0(version = "1.4")
    private final String signature;

    @C11665v0(version = "1.2")
    public static class NoReceiver implements Serializable {

        /* renamed from: a */
        public static final NoReceiver f28420a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f28420a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @C11665v0(version = "1.1")
    public C11492c compute() {
        C11492c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        C11492c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract C11492c computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @C11665v0(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C11499h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C11342l0.m43550g(cls);
        }
        return C11342l0.m43547d(cls);
    }

    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @C11665v0(version = "1.1")
    public C11492c getReflected() {
        C11492c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public C11520r getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @C11665v0(version = "1.1")
    public List<C11522s> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @C11665v0(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @C11665v0(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @C11665v0(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @C11665v0(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @C11665v0(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @C11665v0(version = "1.1")
    public CallableReference(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    @C11665v0(version = "1.4")
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
