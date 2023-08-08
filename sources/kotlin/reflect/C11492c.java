package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.C11665v0;
import kotlin.internal.C11111g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.reflect.c */
public interface C11492c<R> extends C11491b {

    /* renamed from: kotlin.reflect.c$a */
    public static final class C11493a {
        @C11111g
        /* renamed from: a */
        public static /* synthetic */ void m44503a() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: b */
        public static /* synthetic */ void m44504b() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: c */
        public static /* synthetic */ void m44505c() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: d */
        public static /* synthetic */ void m44506d() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: e */
        public static /* synthetic */ void m44507e() {
        }

        @C11665v0(version = "1.1")
        /* renamed from: f */
        public static /* synthetic */ void m44508f() {
        }

        @C11665v0(version = "1.3")
        /* renamed from: g */
        public static /* synthetic */ void m44509g() {
        }
    }

    R call(@C12579k Object... objArr);

    R callBy(@C12579k Map<KParameter, ? extends Object> map);

    @C12579k
    String getName();

    @C12579k
    List<KParameter> getParameters();

    @C12579k
    C11520r getReturnType();

    @C12579k
    List<C11522s> getTypeParameters();

    @C12580l
    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
