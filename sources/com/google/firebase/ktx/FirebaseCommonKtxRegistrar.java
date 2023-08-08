package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.C32561a;
import com.google.firebase.annotations.concurrent.C32562b;
import com.google.firebase.annotations.concurrent.C32563c;
import com.google.firebase.annotations.concurrent.C32564d;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32592k;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.C33507h;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12091r1;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, mo22516d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/google/firebase/components/g;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, mo22517k = 1, mo22518mv = {1, 7, 1})
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$a */
    public static final class C33130a<T> implements C32592k {

        /* renamed from: a */
        public static final C33130a<T> f80366a = new C33130a<>();

        /* renamed from: b */
        public final CoroutineDispatcher mo94629a(C32584h hVar) {
            Object f = hVar.mo94707f(C32578f0.m131623a(C32561a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C12091r1.m48305c((Executor) f);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$b */
    public static final class C33131b<T> implements C32592k {

        /* renamed from: a */
        public static final C33131b<T> f80367a = new C33131b<>();

        /* renamed from: b */
        public final CoroutineDispatcher mo94629a(C32584h hVar) {
            Object f = hVar.mo94707f(C32578f0.m131623a(C32563c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C12091r1.m48305c((Executor) f);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$c */
    public static final class C33132c<T> implements C32592k {

        /* renamed from: a */
        public static final C33132c<T> f80368a = new C33132c<>();

        /* renamed from: b */
        public final CoroutineDispatcher mo94629a(C32584h hVar) {
            Object f = hVar.mo94707f(C32578f0.m131623a(C32562b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C12091r1.m48305c((Executor) f);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$d */
    public static final class C33133d<T> implements C32592k {

        /* renamed from: a */
        public static final C33133d<T> f80369a = new C33133d<>();

        /* renamed from: b */
        public final CoroutineDispatcher mo94629a(C32584h hVar) {
            Object f = hVar.mo94707f(C32578f0.m131623a(C32564d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C12091r1.m48305c((Executor) f);
        }
    }

    @C12579k
    public List<C32580g<?>> getComponents() {
        Class<C32561a> cls = C32561a.class;
        Class<CoroutineDispatcher> cls2 = CoroutineDispatcher.class;
        Class<Executor> cls3 = Executor.class;
        C32580g<CoroutineDispatcher> d = C32580g.m131634f(C32578f0.m131623a(cls, cls2)).mo94693b(C32608v.m131746l(C32578f0.m131623a(cls, cls3))).mo94697f(C33130a.f80366a).mo94695d();
        Intrinsics.checkNotNullExpressionValue(d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<C32563c> cls4 = C32563c.class;
        C32580g<C32563c> d2 = C32580g.m131634f(C32578f0.m131623a(cls4, cls2)).mo94693b(C32608v.m131746l(C32578f0.m131623a(cls4, cls3))).mo94697f(C33131b.f80367a).mo94695d();
        Intrinsics.checkNotNullExpressionValue(d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<C32562b> cls5 = C32562b.class;
        C32580g<C32562b> d3 = C32580g.m131634f(C32578f0.m131623a(cls5, cls2)).mo94693b(C32608v.m131746l(C32578f0.m131623a(cls5, cls3))).mo94697f(C33132c.f80368a).mo94695d();
        Intrinsics.checkNotNullExpressionValue(d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<C32564d> cls6 = C32564d.class;
        C32580g<C32564d> d4 = C32580g.m131634f(C32578f0.m131623a(cls6, cls2)).mo94693b(C32608v.m131746l(C32578f0.m131623a(cls6, cls3))).mo94697f(C33133d.f80369a).mo94695d();
        Intrinsics.checkNotNullExpressionValue(d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt__CollectionsKt.m40448L(C33507h.m135086b(C33136c.f80375a, "20.3.1"), d, d2, d3, d4);
    }
}
