package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C2672d;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.focus.C15087z;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ C2672d $bringIntoViewRequester;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C16313q $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ C16321t0 $textInputService;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, C16321t0 t0Var, TextFieldValue textFieldValue, C16313q qVar, C16281c0 c0Var, TextFieldSelectionManager textFieldSelectionManager, C12074o0 o0Var, C2672d dVar) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = t0Var;
        this.$value = textFieldValue;
        this.$imeOptions = qVar;
        this.$offsetMapping = c0Var;
        this.$manager = textFieldSelectionManager;
        this.$coroutineScope = o0Var;
        this.$bringIntoViewRequester = dVar;
    }

    /* renamed from: a */
    public final void mo9280a(@C12579k C15087z zVar) {
        C2851y g;
        Intrinsics.checkNotNullParameter(zVar, "it");
        if (this.$state.mo9440d() != zVar.mo42156g()) {
            this.$state.mo9458v(zVar.mo42156g());
            C16321t0 t0Var = this.$textInputService;
            if (t0Var != null) {
                CoreTextFieldKt.m12258m(t0Var, this.$state, this.$value, this.$imeOptions, this.$offsetMapping);
                if (zVar.mo42156g() && (g = this.$state.mo9443g()) != null) {
                    C11723c2 unused = C12038j.m48061f(this.$coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, g, this.$offsetMapping, (C11045c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1>) null), 3, (Object) null);
                }
            }
            if (!zVar.mo42156g()) {
                TextFieldSelectionManager.m12870r(this.$manager, (C15094f) null, 1, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9280a((C15087z) obj);
        return C11079d2.f28267a;
    }
}
