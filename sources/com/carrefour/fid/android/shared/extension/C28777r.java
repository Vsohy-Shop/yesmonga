package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.shared.p046io.JobCancellationThrowable;
import com.google.android.play.core.tasks.C32224a;
import com.google.android.play.core.tasks.C32227d;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoreTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTask.kt\ncom/carrefour/fid/android/shared/extension/CoreTaskKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,27:1\n314#2,11:28\n*S KotlinDebug\n*F\n+ 1 CoreTask.kt\ncom/carrefour/fid/android/shared/extension/CoreTaskKt\n*L\n17#1:28,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.extension.r */
public final class C28777r {

    @C11363r0({"SMAP\nCoreTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTask.kt\ncom/carrefour/fid/android/shared/extension/CoreTaskKt$await$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.extension.r$a */
    public static final class C28778a<ResultT> implements C32224a {

        /* renamed from: a */
        public final /* synthetic */ C32227d<T> f70441a;

        /* renamed from: b */
        public final /* synthetic */ C12072o<T> f70442b;

        public C28778a(C32227d<T> dVar, C12072o<? super T> oVar) {
            this.f70441a = dVar;
            this.f70442b = oVar;
        }

        /* renamed from: a */
        public final void mo21579a(@C12579k C32227d<T> dVar) {
            Intrinsics.checkNotNullParameter(dVar, "task");
            if (dVar.mo93019g() != null || !dVar.mo93023k()) {
                Exception g = dVar.mo93019g();
                if (g != null) {
                    C12072o<T> oVar = this.f70442b;
                    Result.C10852a aVar = Result.f28060a;
                    oVar.resumeWith(Result.m38702b(C11661u0.m45734a(g)));
                    return;
                }
                return;
            }
            T h = this.f70441a.mo93020h();
            if (h != null) {
                C12072o<T> oVar2 = this.f70442b;
                Result.C10852a aVar2 = Result.f28060a;
                oVar2.resumeWith(Result.m38702b(h));
            } else {
                h = null;
            }
            if (h == null) {
                C12072o<T> oVar3 = this.f70442b;
                Result.C10852a aVar3 = Result.f28060a;
                oVar3.resumeWith(Result.m38702b(C11661u0.m45734a(new Throwable("The result of the task cannot be empty"))));
            }
        }
    }

    @C12580l
    /* renamed from: a */
    public static final <T> Object m119101a(@C12579k C32227d<T> dVar, @C12579k C11045c<? super T> cVar) {
        String str;
        if (!dVar.mo93022j()) {
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
            pVar.mo24537e0();
            dVar.mo93013a(new C28778a(dVar, pVar));
            Object y = pVar.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return y;
        } else if (dVar.mo93019g() == null && dVar.mo93023k() && dVar.mo93020h() != null) {
            return dVar.mo93020h();
        } else {
            Exception g = dVar.mo93019g();
            if (g != null) {
                str = g.getMessage();
            } else {
                str = null;
            }
            throw new JobCancellationThrowable(str);
        }
    }
}
