package kotlin.system;

import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;

@C11314h(name = "ProcessKt")
/* renamed from: kotlin.system.a */
public final class C11584a {
    @C11110f
    /* renamed from: a */
    public static final Void m44953a(int i) {
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
