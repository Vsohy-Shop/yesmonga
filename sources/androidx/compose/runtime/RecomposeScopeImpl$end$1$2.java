package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8417b;
import androidx.compose.runtime.collection.C8418c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/runtime/p;", "composition", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/p;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n132#2,18:350\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n327#1:350,18\n*E\n"})
public final class RecomposeScopeImpl$end$1$2 extends Lambda implements C11300l<C8598p, C11079d2> {
    final /* synthetic */ C8417b $instances;
    final /* synthetic */ int $token;
    final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i, C8417b bVar) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i;
        this.$instances = bVar;
    }

    /* renamed from: a */
    public final void mo15224a(@C12579k C8598p pVar) {
        boolean z;
        C8404a0 a0Var;
        Intrinsics.checkNotNullParameter(pVar, "composition");
        if (this.this$0.f22706e == this.$token && Intrinsics.areEqual((Object) this.$instances, (Object) this.this$0.f22707f) && (pVar instanceof C8613s)) {
            C8417b bVar = this.$instances;
            int i = this.$token;
            RecomposeScopeImpl recomposeScopeImpl = this.this$0;
            int i2 = bVar.mo15350i();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = bVar.mo15349g()[i4];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                int i5 = bVar.mo15351k()[i4];
                if (i5 != i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C8613s sVar = (C8613s) pVar;
                    sVar.mo16347S(obj, recomposeScopeImpl);
                    if (obj instanceof C8404a0) {
                        a0Var = (C8404a0) obj;
                    } else {
                        a0Var = null;
                    }
                    if (a0Var != null) {
                        sVar.mo16346R(a0Var);
                        C8418c c = recomposeScopeImpl.f22708g;
                        if (c != null) {
                            c.mo15368l(a0Var);
                            if (c.mo15364h() == 0) {
                                recomposeScopeImpl.f22708g = null;
                            }
                        }
                    }
                }
                if (!z) {
                    if (i3 != i4) {
                        bVar.mo15349g()[i3] = obj;
                        bVar.mo15351k()[i3] = i5;
                    }
                    i3++;
                }
            }
            int i6 = bVar.mo15350i();
            for (int i7 = i3; i7 < i6; i7++) {
                bVar.mo15349g()[i7] = null;
            }
            bVar.mo15355p(i3);
            if (this.$instances.mo15350i() == 0) {
                this.this$0.f22707f = null;
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15224a((C8598p) obj);
        return C11079d2.f28267a;
    }
}
