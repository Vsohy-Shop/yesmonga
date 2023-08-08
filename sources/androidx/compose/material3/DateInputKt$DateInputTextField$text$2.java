package androidx.compose.material3;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateInputKt$DateInputTextField$text$2 extends Lambda implements C11289a<C8700z0<TextFieldValue>> {
    final /* synthetic */ C8169a0 $dateInputFormat;
    final /* synthetic */ C8238l $initialDate;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$text$2(StateData stateData, C8238l lVar, C8169a0 a0Var, Locale locale) {
        super(0);
        this.$stateData = stateData;
        this.$initialDate = lVar;
        this.$dateInputFormat = a0Var;
        this.$locale = locale;
    }

    @C12579k
    /* renamed from: a */
    public final C8700z0<TextFieldValue> invoke() {
        String str;
        StateData stateData = this.$stateData;
        C8238l lVar = this.$initialDate;
        C8169a0 a0Var = this.$dateInputFormat;
        Locale locale = this.$locale;
        if (lVar == null || (str = stateData.mo11987a().mo12493j(lVar.mo12763X(), a0Var.mo12438g(), locale)) == null) {
            str = "";
        }
        return C8539f2.m30981g(new TextFieldValue(str, C16359o0.m73780b(0, 0), (C16356n0) null, 4, (DefaultConstructorMarker) null), (C8410b2) null, 2, (Object) null);
    }
}
