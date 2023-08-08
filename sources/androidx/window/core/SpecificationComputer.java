package androidx.window.core;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class SpecificationComputer<T> {
    @C12579k

    /* renamed from: a */
    public static final C20989a f54137a = new C20989a((DefaultConstructorMarker) null);

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "window_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    /* renamed from: androidx.window.core.SpecificationComputer$a */
    public static final class C20989a {
        public /* synthetic */ C20989a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ SpecificationComputer m97129b(C20989a aVar, Object obj, String str, VerificationMode verificationMode, C20997f fVar, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = C20993c.f54158a.mo62776a();
            }
            if ((i & 4) != 0) {
                fVar = C20991a.f54153a;
            }
            return aVar.mo62746a(obj, str, verificationMode, fVar);
        }

        @C12579k
        /* renamed from: a */
        public final <T> SpecificationComputer<T> mo62746a(@C12579k T t, @C12579k String str, @C12579k VerificationMode verificationMode, @C12579k C20997f fVar) {
            Intrinsics.checkNotNullParameter(t, "<this>");
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            Intrinsics.checkNotNullParameter(fVar, "logger");
            return new C20998g(t, str, verificationMode, fVar);
        }

        public C20989a() {
        }
    }

    @C12580l
    /* renamed from: a */
    public abstract T mo62743a();

    @C12579k
    /* renamed from: b */
    public final String mo62744b(@C12579k Object obj, @C12579k String str) {
        Intrinsics.checkNotNullParameter(obj, "value");
        Intrinsics.checkNotNullParameter(str, "message");
        return str + " value: " + obj;
    }

    @C12579k
    /* renamed from: c */
    public abstract SpecificationComputer<T> mo62745c(@C12579k String str, @C12579k C11300l<? super T, Boolean> lVar);
}
