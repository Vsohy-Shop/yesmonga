package kotlin.reflect;

import kotlin.C11076d0;
import kotlin.C11665v0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface KParameter extends C11491b {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    /* renamed from: kotlin.reflect.KParameter$a */
    public static final class C11488a {
        @C11665v0(version = "1.1")
        /* renamed from: a */
        public static /* synthetic */ void m44488a() {
        }
    }

    int getIndex();

    @C12579k
    Kind getKind();

    @C12580l
    String getName();

    @C12579k
    C11520r getType();

    /* renamed from: u */
    boolean mo23123u();

    /* renamed from: v */
    boolean mo23124v();
}
