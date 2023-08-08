package kotlinx.serialization;

import kotlin.C11076d0;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo22516d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "index", "", "(I)V", "message", "", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, mo22517k = 1, mo22518mv = {1, 6, 0}, mo22520xi = 48)
@C11532s0
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(@C12580l String str) {
        super(str);
    }

    public UnknownFieldException(int i) {
        this(Intrinsics.stringPlus("An unknown field for index ", Integer.valueOf(i)));
    }
}
