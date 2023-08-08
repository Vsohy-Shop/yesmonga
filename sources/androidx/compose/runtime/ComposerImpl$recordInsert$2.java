package androidx.compose.runtime;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"Landroidx/compose/runtime/d;", "applier", "Landroidx/compose/runtime/z1;", "slots", "Landroidx/compose/runtime/r1;", "rememberManager", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/r1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n162#2,4:4529\n167#2,3:4539\n33#3,6:4533\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n*L\n3573#1:4529,4\n3573#1:4539,3\n3574#1:4533,6\n*E\n"})
public final class ComposerImpl$recordInsert$2 extends Lambda implements C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> {
    final /* synthetic */ C8412c $anchor;
    final /* synthetic */ List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> $fixups;
    final /* synthetic */ C8692w1 $insertTable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$2(C8692w1 w1Var, C8412c cVar, List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list) {
        super(3);
        this.$insertTable = w1Var;
        this.$anchor = cVar;
        this.$fixups = list;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo15094a(@C12579k C8428d<?> dVar, @C12579k C8701z1 z1Var, @C12579k C8608r1 r1Var) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(z1Var, "slots");
        Intrinsics.checkNotNullParameter(r1Var, "rememberManager");
        C8692w1 w1Var = this.$insertTable;
        List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list = this.$fixups;
        C8701z1 G0 = w1Var.mo16837G0();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(dVar, G0, r1Var);
            }
            C11079d2 d2Var = C11079d2.f28267a;
            G0.mo16908I();
            z1Var.mo16904G();
            C8692w1 w1Var2 = this.$insertTable;
            z1Var.mo16994z0(w1Var2, this.$anchor.mo15341d(w1Var2));
            z1Var.mo16928S();
        } catch (Throwable th) {
            G0.mo16908I();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15094a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
        return C11079d2.f28267a;
    }
}
