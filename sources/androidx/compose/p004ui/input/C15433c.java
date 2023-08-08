package androidx.compose.p004ui.input;

import androidx.compose.p004ui.C8761g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,76:1\n76#2:77\n102#2,2:78\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:77\n72#1:78,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.c */
public final class C15433c implements C15432b {
    @C12579k

    /* renamed from: a */
    public final C11300l<C15430a, Boolean> f38125a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f38126b;

    public /* synthetic */ C15433c(int i, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, lVar);
    }

    @C8761g
    /* renamed from: a */
    public boolean mo43613a(int i) {
        return this.f38125a.invoke(C15430a.m67351c(i)).booleanValue();
    }

    /* renamed from: b */
    public int mo43614b() {
        return ((C15430a) this.f38126b.getValue()).mo43609i();
    }

    /* renamed from: c */
    public void mo43615c(int i) {
        this.f38126b.setValue(C15430a.m67351c(i));
    }

    public C15433c(int i, C11300l<? super C15430a, Boolean> lVar) {
        this.f38125a = lVar;
        this.f38126b = C8539f2.m30981g(C15430a.m67351c(i), (C8410b2) null, 2, (Object) null);
    }
}
