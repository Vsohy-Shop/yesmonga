package kotlin.reflect;

import kotlin.C11665v0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.reflect.n */
public interface C11510n<V> extends C11492c<V> {

    /* renamed from: kotlin.reflect.n$a */
    public interface C11511a<V> {
        @C12579k
        /* renamed from: a */
        C11510n<V> mo23138a();
    }

    /* renamed from: kotlin.reflect.n$b */
    public static final class C11512b {
        @C11665v0(version = "1.1")
        /* renamed from: a */
        public static /* synthetic */ void m44550a() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: b */
        public static /* synthetic */ void m44551b() {
        }
    }

    /* renamed from: kotlin.reflect.n$c */
    public interface C11513c<V> extends C11511a<V>, C11500i<V> {
    }

    @C12579k
    C11513c<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
