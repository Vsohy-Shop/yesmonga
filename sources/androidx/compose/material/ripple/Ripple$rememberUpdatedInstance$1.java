package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.C2245i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", mo22502f = "Ripple.kt", mo22503i = {}, mo22504l = {136}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C7921i $instance;
    final /* synthetic */ C2241e $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$a */
    public static final class C7907a implements C11908f<C2240d> {

        /* renamed from: a */
        public final /* synthetic */ C7921i f18993a;

        /* renamed from: b */
        public final /* synthetic */ C12074o0 f18994b;

        public C7907a(C7921i iVar, C12074o0 o0Var) {
            this.f18993a = iVar;
            this.f18994b = o0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C2240d dVar, @C12579k C11045c<? super C11079d2> cVar) {
            if (dVar instanceof C2245i.C2247b) {
                this.f18993a.mo11002b((C2245i.C2247b) dVar, this.f18994b);
            } else if (dVar instanceof C2245i.C2248c) {
                this.f18993a.mo11003f(((C2245i.C2248c) dVar).mo7609a());
            } else if (dVar instanceof C2245i.C2246a) {
                this.f18993a.mo11003f(((C2245i.C2246a) dVar).mo7607a());
            } else {
                this.f18993a.mo11064h(dVar, this.f18994b);
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(C2241e eVar, C7921i iVar, C11045c<? super Ripple$rememberUpdatedInstance$1> cVar) {
        super(2, cVar);
        this.$interactionSource = eVar;
        this.$instance = iVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, cVar);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<C2240d> c = this.$interactionSource.mo7603c();
            C7907a aVar = new C7907a(this.$instance, (C12074o0) this.L$0);
            this.label = 1;
            if (c.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((Ripple$rememberUpdatedInstance$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
