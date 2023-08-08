package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.tooling.b */
public interface C8680b extends C8679a {

    /* renamed from: androidx.compose.runtime.tooling.b$a */
    public static final class C8681a {
        @C12580l
        @Deprecated
        /* renamed from: a */
        public static C8680b m31895a(@C12579k C8680b bVar, @C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "identityToFind");
            return C8680b.super.mo16758e(obj);
        }

        @Deprecated
        /* renamed from: b */
        public static int m31896b(@C12579k C8680b bVar) {
            return C8680b.super.mo16767w();
        }

        @C12580l
        @Deprecated
        /* renamed from: c */
        public static Object m31897c(@C12579k C8680b bVar) {
            return C8680b.super.mo16761Q();
        }

        @Deprecated
        /* renamed from: d */
        public static int m31898d(@C12579k C8680b bVar) {
            return C8680b.super.mo16762W();
        }
    }

    @C12580l
    /* renamed from: Q */
    Object mo16761Q() {
        return null;
    }

    /* renamed from: W */
    int mo16762W() {
        return 0;
    }

    @C12579k
    Iterable<Object> getData();

    @C12579k
    Object getKey();

    @C12580l
    String getSourceInfo();

    @C12580l
    /* renamed from: q */
    Object mo16766q();

    /* renamed from: w */
    int mo16767w() {
        return 0;
    }
}
