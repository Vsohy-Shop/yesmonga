package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.datastore.preferences.core.a */
public abstract class C18602a {

    /* renamed from: androidx.datastore.preferences.core.a$a */
    public static final class C18603a<T> {
        @C12579k

        /* renamed from: a */
        public final String f47462a;

        public C18603a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.f47462a = str;
        }

        @C12579k
        /* renamed from: a */
        public final String mo53719a() {
            return this.f47462a;
        }

        @C12579k
        /* renamed from: b */
        public final C18604b<T> mo53720b(T t) {
            return new C18604b<>(this, t);
        }

        public boolean equals(@C12580l Object obj) {
            if (obj instanceof C18603a) {
                return Intrinsics.areEqual((Object) this.f47462a, (Object) ((C18603a) obj).f47462a);
            }
            return false;
        }

        public int hashCode() {
            return this.f47462a.hashCode();
        }

        @C12579k
        public String toString() {
            return this.f47462a;
        }
    }

    /* renamed from: androidx.datastore.preferences.core.a$b */
    public static final class C18604b<T> {
        @C12579k

        /* renamed from: a */
        public final C18603a<T> f47463a;

        /* renamed from: b */
        public final T f47464b;

        public C18604b(@C12579k C18603a<T> aVar, T t) {
            Intrinsics.checkNotNullParameter(aVar, "key");
            this.f47463a = aVar;
            this.f47464b = t;
        }

        @C12579k
        /* renamed from: a */
        public final C18603a<T> mo53724a() {
            return this.f47463a;
        }

        /* renamed from: b */
        public final T mo53725b() {
            return this.f47464b;
        }
    }

    @C12579k
    /* renamed from: a */
    public abstract Map<C18603a<?>, Object> mo53692a();

    /* renamed from: b */
    public abstract <T> boolean mo53693b(@C12579k C18603a<T> aVar);

    @C12580l
    /* renamed from: c */
    public abstract <T> T mo53694c(@C12579k C18603a<T> aVar);

    @C12579k
    /* renamed from: d */
    public final MutablePreferences mo53717d() {
        return new MutablePreferences(C10977s0.m41442J0(mo53692a()), false);
    }

    @C12579k
    /* renamed from: e */
    public final C18602a mo53718e() {
        return new MutablePreferences(C10977s0.m41442J0(mo53692a()), true);
    }
}
