package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12169x;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", mo22502f = "Share.kt", mo22503i = {}, mo22504l = {340}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C12169x<C11952u<T>> $result;
    final /* synthetic */ C11907e<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    @C11363r0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a */
    public static final class C11853a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<C11940j<T>> f29376a;

        /* renamed from: b */
        public final /* synthetic */ C12074o0 f29377b;

        /* renamed from: c */
        public final /* synthetic */ C12169x<C11952u<T>> f29378c;

        public C11853a(Ref.ObjectRef<C11940j<T>> objectRef, C12074o0 o0Var, C12169x<C11952u<T>> xVar) {
            this.f29376a = objectRef;
            this.f29377b = o0Var;
            this.f29378c = xVar;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            C11079d2 d2Var;
            C11940j jVar = (C11940j) this.f29376a.element;
            if (jVar != null) {
                jVar.setValue(t);
                d2Var = C11079d2.f28267a;
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                C12074o0 o0Var = this.f29377b;
                Ref.ObjectRef<C11940j<T>> objectRef = this.f29376a;
                C12169x<C11952u<T>> xVar = this.f29378c;
                T a = C11953v.m47628a(t);
                xVar.mo24789G(new C11942l(a, C11804f2.m46951B(o0Var.getCoroutineContext())));
                objectRef.element = a;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(C11907e<? extends T> eVar, C12169x<C11952u<T>> xVar, C11045c<? super FlowKt__ShareKt$launchSharingDeferred$1> cVar) {
        super(2, cVar);
        this.$upstream = eVar;
        this.$result = xVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, cVar);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C11907e<T> eVar = this.$upstream;
            C11853a aVar = new C11853a(objectRef, o0Var, this.$result);
            this.label = 1;
            if (eVar.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th) {
                this.$result.mo24790i(th);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
