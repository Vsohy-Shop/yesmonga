package com.google.firebase.ktx;

import android.content.Context;
import androidx.exifinterface.media.C19135a;
import com.google.firebase.C33033f;
import com.google.firebase.C33262n;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32592k;
import com.google.firebase.components.C32608v;
import com.urbanairship.iam.events.C9175a;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12091r1;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.firebase.ktx.c */
public final class C33136c {
    @C12579k

    /* renamed from: a */
    public static final String f80375a = "fire-core-ktx";

    /* renamed from: com.google.firebase.ktx.c$a */
    public static final class C33137a<T> implements C32592k {

        /* renamed from: a */
        public static final C33137a<T> f80376a = new C33137a<>();

        /* renamed from: b */
        public final CoroutineDispatcher mo94629a(C32584h hVar) {
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            Object f = hVar.mo94707f(C32578f0.m131623a(Annotation.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C12091r1.m48305c((Executor) f);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C33033f m133644a(@C12579k C33135b bVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        C33033f q = C33033f.m133334q(str);
        Intrinsics.checkNotNullExpressionValue(q, "getInstance(name)");
        return q;
    }

    /* renamed from: b */
    public static final /* synthetic */ <T extends Annotation> C32580g<CoroutineDispatcher> m133645b() {
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        Class<Annotation> cls = Annotation.class;
        C32580g.C32582b<Annotation> f = C32580g.m131634f(C32578f0.m131623a(cls, CoroutineDispatcher.class));
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        C32580g.C32582b<Annotation> b = f.mo94693b(C32608v.m131746l(C32578f0.m131623a(cls, Executor.class)));
        Intrinsics.needClassReification();
        C32580g<Annotation> d = b.mo94697f(C33137a.f80376a).mo94695d();
        Intrinsics.checkNotNullExpressionValue(d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return d;
    }

    @C12579k
    /* renamed from: c */
    public static final C33033f m133646c(@C12579k C33135b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C33033f p = C33033f.m133333p();
        Intrinsics.checkNotNullExpressionValue(p, "getInstance()");
        return p;
    }

    @C12579k
    /* renamed from: d */
    public static final C33262n m133647d(@C12579k C33135b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C33262n s = m133646c(C33135b.f80374a).mo95723s();
        Intrinsics.checkNotNullExpressionValue(s, "Firebase.app.options");
        return s;
    }

    @C12580l
    /* renamed from: e */
    public static final C33033f m133648e(@C12579k C33135b bVar, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return C33033f.m133336x(context);
    }

    @C12579k
    /* renamed from: f */
    public static final C33033f m133649f(@C12579k C33135b bVar, @C12579k Context context, @C12579k C33262n nVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(nVar, "options");
        C33033f y = C33033f.m133337y(context, nVar);
        Intrinsics.checkNotNullExpressionValue(y, "initializeApp(context, options)");
        return y;
    }

    @C12579k
    /* renamed from: g */
    public static final C33033f m133650g(@C12579k C33135b bVar, @C12579k Context context, @C12579k C33262n nVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(nVar, "options");
        Intrinsics.checkNotNullParameter(str, "name");
        C33033f z = C33033f.m133338z(context, nVar, str);
        Intrinsics.checkNotNullExpressionValue(z, "initializeApp(context, options, name)");
        return z;
    }
}
