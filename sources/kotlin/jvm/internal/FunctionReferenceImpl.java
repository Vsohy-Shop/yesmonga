package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11499h;

public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, C11499h hVar, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((C11362r) hVar).mo22787o(), str, str2, (hVar instanceof C11494d) ^ true ? 1 : 0);
    }

    @C11665v0(version = "1.4")
    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    @C11665v0(version = "1.4")
    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
