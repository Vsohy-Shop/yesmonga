package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11500i;

public class FunctionReference extends CallableReference implements C11320a0, C11500i {
    private final int arity;
    @C11665v0(version = "1.4")
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    @C11665v0(version = "1.1")
    public C11492c computeReflected() {
        return C11342l0.m43546c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()) || !Intrinsics.areEqual((Object) getOwner(), (Object) functionReference.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof C11500i) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @C11665v0(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @C11665v0(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @C11665v0(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @C11665v0(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @C11665v0(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C11492c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + C11342l0.f28466b;
    }

    @C11665v0(version = "1.1")
    public FunctionReference(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    @C11665v0(version = "1.1")
    public C11500i getReflected() {
        return (C11500i) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11665v0(version = "1.4")
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
