package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.q */
public interface C21069q {
    @C12579k

    /* renamed from: a */
    public static final C21070a f54319a = C21070a.f54320a;

    /* renamed from: androidx.window.layout.q$a */
    public static final class C21070a {

        /* renamed from: a */
        public static final /* synthetic */ C21070a f54320a = new C21070a();

        /* renamed from: b */
        public static final boolean f54321b = false;
        @C12580l

        /* renamed from: c */
        public static final String f54322c = C11342l0.m43547d(C21069q.class).mo22848s();
        @C12579k

        /* renamed from: d */
        public static C21071r f54323d = C21046h.f54275a;

        @C11314h(name = "getOrCreate")
        @C12579k
        @C11384m
        /* renamed from: a */
        public final C21069q mo63012a(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return f54323d.mo62971a(new WindowInfoTrackerImpl(C21077x.f54327b, mo63015d(context)));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: b */
        public final void mo63013b(@C12579k C21071r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "overridingDecorator");
            f54323d = rVar;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: c */
        public final void mo63014c() {
            f54323d = C21046h.f54275a;
        }

        @C12579k
        /* renamed from: d */
        public final C21068p mo63015d(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            C21049j jVar = null;
            try {
                WindowLayoutComponent m = SafeWindowLayoutComponentProvider.f54232a.mo62904m();
                if (m != null) {
                    jVar = new C21049j(m);
                }
            } catch (Throwable unused) {
            }
            if (jVar == null) {
                return C21063n.f54305c.mo63002a(context);
            }
            return jVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11384m
    /* renamed from: a */
    static void m97429a(@C12579k C21071r rVar) {
        f54319a.mo63013b(rVar);
    }

    @C11314h(name = "getOrCreate")
    @C12579k
    @C11384m
    /* renamed from: b */
    static C21069q m97430b(@C12579k Context context) {
        return f54319a.mo63012a(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11384m
    static void reset() {
        f54319a.mo63014c();
    }

    @C12579k
    /* renamed from: c */
    C11907e<C21073t> mo62952c(@C12579k Activity activity);
}
