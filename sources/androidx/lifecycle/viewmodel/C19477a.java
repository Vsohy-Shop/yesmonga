package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.viewmodel.a */
public abstract class C19477a {
    @C12579k

    /* renamed from: a */
    public final Map<C19479b<?>, Object> f49865a = new LinkedHashMap();

    /* renamed from: androidx.lifecycle.viewmodel.a$a */
    public static final class C19478a extends C19477a {
        @C12579k

        /* renamed from: b */
        public static final C19478a f49866b = new C19478a();

        @C12580l
        /* renamed from: a */
        public <T> T mo57677a(@C12579k C19479b<T> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return null;
        }
    }

    /* renamed from: androidx.lifecycle.viewmodel.a$b */
    public interface C19479b<T> {
    }

    @C12580l
    /* renamed from: a */
    public abstract <T> T mo57677a(@C12579k C19479b<T> bVar);

    @C12579k
    /* renamed from: b */
    public final Map<C19479b<?>, Object> mo57678b() {
        return this.f49865a;
    }
}
