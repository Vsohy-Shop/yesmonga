package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,142:1\n76#2:143\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n65#1:143\n*E\n"})
public final class SaveableStateHolderKt {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C8623b m31370a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(15454635);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:58)");
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m31343d(new Object[0], SaveableStateHolderImpl.f23088d.mo16398a(), (String) null, SaveableStateHolderKt$rememberSaveableStateHolder$1.f23102f, oVar, 3080, 4);
        saveableStateHolderImpl.mo16392i((C8624c) oVar.mo15032w(SaveableStateRegistryKt.m31373b()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return saveableStateHolderImpl;
    }
}
