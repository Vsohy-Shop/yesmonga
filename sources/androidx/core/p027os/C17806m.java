package androidx.core.p027os;

import android.os.Handler;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.core.os.m */
public final class C17806m {

    /* renamed from: androidx.core.os.m$a */
    public static final class C17807a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f46187a;

        public C17807a(C11289a<C11079d2> aVar) {
            this.f46187a = aVar;
        }

        public final void run() {
            this.f46187a.invoke();
        }
    }

    /* renamed from: androidx.core.os.m$b */
    public static final class C17808b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f46188a;

        public C17808b(C11289a<C11079d2> aVar) {
            this.f46188a = aVar;
        }

        public final void run() {
            this.f46188a.invoke();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Runnable m81199a(@C12579k Handler handler, long j, @C12580l Object obj, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        C17807a aVar2 = new C17807a(aVar);
        handler.postAtTime(aVar2, obj, j);
        return aVar2;
    }

    /* renamed from: b */
    public static /* synthetic */ Runnable m81200b(Handler handler, long j, Object obj, C11289a aVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        C17807a aVar2 = new C17807a(aVar);
        handler.postAtTime(aVar2, obj, j);
        return aVar2;
    }

    @C12579k
    /* renamed from: c */
    public static final Runnable m81201c(@C12579k Handler handler, long j, @C12580l Object obj, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        C17808b bVar = new C17808b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j);
        } else {
            C17800k.m81191d(handler, bVar, obj, j);
        }
        return bVar;
    }

    /* renamed from: d */
    public static /* synthetic */ Runnable m81202d(Handler handler, long j, Object obj, C11289a aVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        C17808b bVar = new C17808b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j);
        } else {
            C17800k.m81191d(handler, bVar, obj, j);
        }
        return bVar;
    }
}
