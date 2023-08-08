package androidx.compose.material3;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarKt$SearchBarInputField$3$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ String $searchSemantics;
    final /* synthetic */ String $suggestionsAvailableSemantics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBarInputField$3$1(String str, boolean z, String str2, FocusRequester focusRequester) {
        super(1);
        this.$searchSemantics = str;
        this.$active = z;
        this.$suggestionsAvailableSemantics = str2;
        this.$focusRequester = focusRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71959G0(qVar, this.$searchSemantics);
        if (this.$active) {
            SemanticsPropertiesKt.m71989V0(qVar, this.$suggestionsAvailableSemantics);
        }
        final FocusRequester focusRequester = this.$focusRequester;
        SemanticsPropertiesKt.m72017h0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                focusRequester.mo42129h();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }
}
