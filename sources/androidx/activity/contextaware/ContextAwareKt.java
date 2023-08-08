package androidx.activity.contextaware;

import android.content.Context;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,93:1\n314#2,11:94\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:94,11\n*E\n"})
public final class ContextAwareKt {

    @C11363r0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* renamed from: androidx.activity.contextaware.ContextAwareKt$a */
    public static final class C0230a implements C0233c {

        /* renamed from: a */
        public final /* synthetic */ C12072o<R> f730a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Context, R> f731b;

        public C0230a(C12072o<R> oVar, C11300l<Context, R> lVar) {
            this.f730a = oVar;
            this.f731b = lVar;
        }

        /* renamed from: a */
        public void mo823a(@C12579k Context context) {
            Object obj;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            C12072o<R> oVar = this.f730a;
            C11300l<Context, R> lVar = this.f731b;
            try {
                Result.C10852a aVar = Result.f28060a;
                obj = Result.m38702b(lVar.invoke(context));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            oVar.resumeWith(obj);
        }
    }

    @C12580l
    /* renamed from: a */
    public static final <R> Object m1317a(@C12579k C0231a aVar, @C12579k C11300l<Context, R> lVar, @C12579k C11045c<R> cVar) {
        Context g = aVar.mo708g();
        if (g != null) {
            return lVar.invoke(g);
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C0230a aVar2 = new C0230a(pVar, lVar);
        aVar.mo739s(aVar2);
        pVar.mo24529C(new ContextAwareKt$withContextAvailable$2$1(aVar, aVar2));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* renamed from: b */
    public static final <R> Object m1318b(C0231a aVar, C11300l<Context, R> lVar, C11045c<R> cVar) {
        Context g = aVar.mo708g();
        if (g != null) {
            return lVar.invoke(g);
        }
        C11322b0.m43482e(0);
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C0230a aVar2 = new C0230a(pVar, lVar);
        aVar.mo739s(aVar2);
        pVar.mo24529C(new ContextAwareKt$withContextAvailable$2$1(aVar, aVar2));
        C11079d2 d2Var = C11079d2.f28267a;
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        C11322b0.m43482e(1);
        return y;
    }
}
