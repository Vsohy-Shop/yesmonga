package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.C11665v0;
import kotlin.reflect.C11500i;

@C11665v0(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {
    private final Class funInterface;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunInterfaceConstructorReference)) {
            return false;
        }
        return this.funInterface.equals(((FunInterfaceConstructorReference) obj).funInterface);
    }

    public int hashCode() {
        return this.funInterface.hashCode();
    }

    public String toString() {
        return "fun interface " + this.funInterface.getName();
    }

    public C11500i getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
