package kotlinx.coroutines.internal;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.s0 */
public final /* synthetic */ class C12018s0 {

    /* renamed from: a */
    public static final int f29627a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m47953a() {
        return f29627a;
    }

    @C12580l
    /* renamed from: b */
    public static final String m47954b(@C12579k String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
