package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "index", "", "data", "Lkotlin/d2;", "a", "(ILjava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$deactivateToEndGroup$3 extends Lambda implements C11304p<Integer, Object, C11079d2> {
    final /* synthetic */ int $group;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$deactivateToEndGroup$3(ComposerImpl composerImpl, int i) {
        super(2);
        this.this$0 = composerImpl;
        this.$group = i;
    }

    /* renamed from: a */
    public final void mo15075a(final int i, @C12580l final Object obj) {
        if (obj instanceof C8616s1) {
            this.this$0.f22576I.mo16799X(this.$group);
            ComposerImpl composerImpl = this.this$0;
            final int i2 = this.$group;
            ComposerImpl.m29539Z1(composerImpl, false, new C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>() {
                /* renamed from: a */
                public final void mo15076a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
                    Intrinsics.checkNotNullParameter(dVar, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(z1Var, "slots");
                    Intrinsics.checkNotNullParameter(r1Var, "rememberManager");
                    if (Intrinsics.areEqual(obj, z1Var.mo16949c1(i2, i))) {
                        r1Var.mo16306b((C8616s1) obj);
                        z1Var.mo16939X0(i, C8592o.f23032a.mo16277a());
                        return;
                    }
                    ComposerKt.m29774A("Slot table is out of sync".toString());
                    throw new KotlinNothingValueException();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo15076a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
                    return C11079d2.f28267a;
                }
            }, 1, (Object) null);
        } else if (obj instanceof RecomposeScopeImpl) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            C8613s l = recomposeScopeImpl.mo15209l();
            if (l != null) {
                l.mo16349U(true);
                recomposeScopeImpl.mo15221x();
            }
            this.this$0.f22576I.mo16799X(this.$group);
            ComposerImpl composerImpl2 = this.this$0;
            final int i3 = this.$group;
            ComposerImpl.m29539Z1(composerImpl2, false, new C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>() {
                /* renamed from: a */
                public final void mo15077a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
                    Intrinsics.checkNotNullParameter(dVar, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(z1Var, "slots");
                    Intrinsics.checkNotNullParameter(r1Var, "<anonymous parameter 2>");
                    if (Intrinsics.areEqual(obj, z1Var.mo16949c1(i3, i))) {
                        z1Var.mo16939X0(i, C8592o.f23032a.mo16277a());
                    } else {
                        ComposerKt.m29774A("Slot table is out of sync".toString());
                        throw new KotlinNothingValueException();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo15077a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
                    return C11079d2.f28267a;
                }
            }, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo15075a(((Number) obj).intValue(), obj2);
        return C11079d2.f28267a;
    }
}
