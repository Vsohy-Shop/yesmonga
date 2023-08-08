package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8578k2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,69:1\n135#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:70\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt */
public final class ModifierLocalProviderKt {

    @C11363r0({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n76#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n66#1:70\n*E\n"})
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$a */
    public static final class C15622a extends C15988w0 implements C15634j<T> {
        @C12579k

        /* renamed from: d */
        public final C15638m<T> f38765d;
        @C12579k

        /* renamed from: e */
        public final C8578k2 f38766e;

        public C15622a(C15638m<T> mVar, C11289a<? extends T> aVar, C11300l<? super C15983v0, C11079d2> lVar) {
            super(lVar);
            this.f38765d = mVar;
            this.f38766e = C8415c2.m30235d(aVar);
        }

        @C12579k
        public C15638m<T> getKey() {
            return this.f38765d;
        }

        public T getValue() {
            return this.f38766e.getValue();
        }
    }

    @C8761g
    @C12579k
    /* renamed from: a */
    public static final <T> C8767m m69484a(@C12579k C8767m mVar, @C12579k C15638m<T> mVar2, @C12579k C11289a<? extends T> aVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar2, "key");
        Intrinsics.checkNotNullParameter(aVar, "value");
        if (InspectableValueKt.m71063e()) {
            lVar = new C15623xd651ace7(mVar2, aVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C15622a(mVar2, aVar, lVar));
    }
}
