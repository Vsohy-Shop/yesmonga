package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.selects.SelectImplementation;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n63#1:69,2\n*E\n"})
@C11532s0
/* renamed from: kotlinx.coroutines.selects.n */
public class C12135n<R> extends SelectImplementation<R> {
    @C12579k

    /* renamed from: g */
    public final List<SelectImplementation<R>.a> f29894g = new ArrayList();

    public C12135n(@C12579k CoroutineContext coroutineContext) {
        super(coroutineContext);
    }

    /* renamed from: N */
    public final void mo24732N() {
        try {
            Collections.shuffle(this.f29894g);
            for (SelectImplementation.C12119a G : this.f29894g) {
                SelectImplementation.m48456G(this, G, false, 1, (Object) null);
            }
        } finally {
            this.f29894g.clear();
        }
    }

    /* renamed from: a */
    public void mo24704a(@C12579k C12124c cVar, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
        this.f29894g.add(new SelectImplementation.C12119a(cVar.mo24731d(), cVar.mo24728a(), cVar.mo24730c(), SelectKt.m48510l(), lVar, cVar.mo24729b()));
    }

    /* renamed from: c */
    public <P, Q> void mo24705c(@C12579k C12128g<? super P, ? extends Q> gVar, P p, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar) {
        this.f29894g.add(new SelectImplementation.C12119a(gVar.mo24731d(), gVar.mo24728a(), gVar.mo24730c(), p, pVar, gVar.mo24729b()));
    }

    /* renamed from: i */
    public <Q> void mo24712i(@C12579k C12126e<? extends Q> eVar, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar) {
        this.f29894g.add(new SelectImplementation.C12119a(eVar.mo24731d(), eVar.mo24728a(), eVar.mo24730c(), (Object) null, pVar, eVar.mo24729b()));
    }

    @C12580l
    @C11532s0
    /* renamed from: w */
    public Object mo24716w(@C12579k C11045c<? super R> cVar) {
        return mo24732N();
    }
}
