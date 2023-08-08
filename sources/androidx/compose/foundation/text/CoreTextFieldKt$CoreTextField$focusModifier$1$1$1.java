package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C2672d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", mo22502f = "CoreTextField.kt", mo22503i = {}, mo22504l = {308}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2672d $bringIntoViewRequester;
    final /* synthetic */ C2851y $layoutResult;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(C2672d dVar, TextFieldValue textFieldValue, TextFieldState textFieldState, C2851y yVar, C16281c0 c0Var, C11045c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1> cVar) {
        super(2, cVar);
        this.$bringIntoViewRequester = dVar;
        this.$value = textFieldValue;
        this.$state = textFieldState;
        this.$layoutResult = yVar;
        this.$offsetMapping = c0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C2672d dVar = this.$bringIntoViewRequester;
            TextFieldValue textFieldValue = this.$value;
            C2785r r = this.$state.mo9454r();
            C16260h0 i2 = this.$layoutResult.mo9930i();
            C16281c0 c0Var = this.$offsetMapping;
            this.label = 1;
            if (CoreTextFieldKt.m12256k(dVar, textFieldValue, r, i2, c0Var, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
