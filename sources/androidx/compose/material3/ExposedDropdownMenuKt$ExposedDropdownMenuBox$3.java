package androidx.compose.material3;

import android.view.View;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1058:1\n62#2,5:1059\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$3\n*L\n165#1:1059,5\n*E\n"})
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$3 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C15695i1<C15588o> $coordinates;
    final /* synthetic */ C8700z0<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$3\n*L\n1#1,484:1\n165#2:485\n*E\n"})
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$a */
    public static final class C8022a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8356u1 f19411a;

        public C8022a(C8356u1 u1Var) {
            this.f19411a = u1Var;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f19411a.mo14728a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$3(View view, C15695i1<C15588o> i1Var, int i, C8700z0<Integer> z0Var) {
        super(1);
        this.$view = view;
        this.$coordinates = i1Var;
        this.$verticalMarginInPx = i;
        this.$menuHeight$delegate = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        View view = this.$view;
        return new C8022a(new C8356u1(view, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1(view, this.$coordinates, this.$verticalMarginInPx, this.$menuHeight$delegate)));
    }
}
