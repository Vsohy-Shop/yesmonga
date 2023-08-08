package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo22516d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "lifecycle-runtime-ktx_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
public final class C19388xfdb59cc4 implements C19470t {

    /* renamed from: a */
    public final /* synthetic */ Lifecycle.State f49761a;

    /* renamed from: b */
    public final /* synthetic */ Lifecycle f49762b;

    /* renamed from: c */
    public final /* synthetic */ C12072o<R> f49763c;

    /* renamed from: d */
    public final /* synthetic */ C11289a<R> f49764d;

    public C19388xfdb59cc4(Lifecycle.State state, Lifecycle lifecycle, C12072o<? super R> oVar, C11289a<? extends R> aVar) {
        this.f49761a = state;
        this.f49762b = lifecycle;
        this.f49763c = oVar;
        this.f49764d = aVar;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Object obj;
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.Companion.mo57473d(this.f49761a)) {
            this.f49762b.mo57467d(this);
            C12072o<R> oVar = this.f49763c;
            C11289a<R> aVar = this.f49764d;
            try {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(aVar.invoke());
            } catch (Throwable th) {
                Result.C10852a aVar3 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            oVar.resumeWith(obj);
        } else if (event == Lifecycle.C19372Event.ON_DESTROY) {
            this.f49762b.mo57467d(this);
            C12072o<R> oVar2 = this.f49763c;
            Result.C10852a aVar4 = Result.f28060a;
            oVar2.resumeWith(Result.m38702b(C11661u0.m45734a(new LifecycleDestroyedException())));
        }
    }
}
