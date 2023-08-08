package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11510n;

public abstract class PropertyReference extends CallableReference implements C11510n {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public C11492c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !Intrinsics.areEqual(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C11510n) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @C11665v0(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @C11665v0(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C11492c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + C11342l0.f28466b;
    }

    @C11665v0(version = "1.1")
    public C11510n getReflected() {
        if (!this.syntheticJavaProperty) {
            return (C11510n) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @C11665v0(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11665v0(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }
}
