package dev.chrisbanes.snapper;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Ldev/chrisbanes/snapper/g;", "a", "()Ldev/chrisbanes/snapper/g;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class LazyListSnapperLayoutInfo$currentItem$2 extends Lambda implements C11289a<C10369g> {
    final /* synthetic */ LazyListSnapperLayoutInfo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListSnapperLayoutInfo$currentItem$2(LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo) {
        super(0);
        this.this$0 = lazyListSnapperLayoutInfo;
    }

    @C12580l
    /* renamed from: a */
    public final C10369g invoke() {
        boolean z;
        C11559m<C10369g> i = this.this$0.mo21760i();
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = this.this$0;
        C10369g gVar = null;
        for (C10369g next : i) {
            C10369g gVar2 = next;
            if (gVar2.mo21793b() <= ((Number) lazyListSnapperLayoutInfo.f27987c.invoke(lazyListSnapperLayoutInfo, gVar2)).intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                gVar = next;
            }
        }
        return gVar;
    }
}
