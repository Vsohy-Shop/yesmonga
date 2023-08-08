package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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

@C11067d(mo22501c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {960}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderDefaults$Thumb$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ SnapshotStateList<C2240d> $interactions;
    int label;

    /* renamed from: androidx.compose.material3.SliderDefaults$Thumb$1$1$a */
    public static final class C8091a implements C11908f<C2240d> {

        /* renamed from: a */
        public final /* synthetic */ SnapshotStateList<C2240d> f19662a;

        public C8091a(SnapshotStateList<C2240d> snapshotStateList) {
            this.f19662a = snapshotStateList;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C2240d dVar, @C12579k C11045c<? super C11079d2> cVar) {
            if (dVar instanceof C2245i.C2247b) {
                this.f19662a.add(dVar);
            } else if (dVar instanceof C2245i.C2248c) {
                this.f19662a.remove((Object) ((C2245i.C2248c) dVar).mo7609a());
            } else if (dVar instanceof C2245i.C2246a) {
                this.f19662a.remove((Object) ((C2245i.C2246a) dVar).mo7607a());
            } else if (dVar instanceof C2230a.C2232b) {
                this.f19662a.add(dVar);
            } else if (dVar instanceof C2230a.C2233c) {
                this.f19662a.remove((Object) ((C2230a.C2233c) dVar).mo7600a());
            } else if (dVar instanceof C2230a.C2231a) {
                this.f19662a.remove((Object) ((C2230a.C2231a) dVar).mo7599a());
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Thumb$1$1(C2243g gVar, SnapshotStateList<C2240d> snapshotStateList, C11045c<? super SliderDefaults$Thumb$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = gVar;
        this.$interactions = snapshotStateList;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<C2240d> c = this.$interactionSource.mo7603c();
            C8091a aVar = new C8091a(this.$interactions);
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
        return ((SliderDefaults$Thumb$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
