package androidx.compose.p004ui.platform;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", mo22502f = "WindowRecomposer.android.kt", mo22503i = {}, mo22504l = {387}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 */
public final class C15824x93d788e4 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11952u<Float> $durationScaleStateFlow;
    final /* synthetic */ C15843a1 $it;
    int label;

    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1$a */
    public static final class C15825a implements C11908f<Float> {

        /* renamed from: a */
        public final /* synthetic */ C15843a1 f39442a;

        public C15825a(C15843a1 a1Var) {
            this.f39442a = a1Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo45607c(float f, @C12579k C11045c<? super C11079d2> cVar) {
            this.f39442a.mo45638e(f);
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo45607c(((Number) obj).floatValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15824x93d788e4(C11952u<Float> uVar, C15843a1 a1Var, C11045c<? super C15824x93d788e4> cVar) {
        super(2, cVar);
        this.$durationScaleStateFlow = uVar;
        this.$it = a1Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new C15824x93d788e4(this.$durationScaleStateFlow, this.$it, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11952u<Float> uVar = this.$durationScaleStateFlow;
            C15825a aVar = new C15825a(this.$it);
            this.label = 1;
            if (uVar.collect(aVar, this) == h) {
                return h;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C11661u0.m45747n(obj);
        }
        throw new KotlinNothingValueException();
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C15824x93d788e4) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
