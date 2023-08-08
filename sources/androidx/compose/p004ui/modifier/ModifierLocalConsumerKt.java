package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,74:1\n135#2:75\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n51#1:75\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumerKt */
public final class ModifierLocalConsumerKt {
    @C8547h2
    @C8761g
    @C12579k
    /* renamed from: a */
    public static final C8767m m69475a(@C12579k C8767m mVar, @C12579k C11300l<? super C15636k, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "consumer");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C15621x4a113c71(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C15629e(lVar, lVar2));
    }
}
