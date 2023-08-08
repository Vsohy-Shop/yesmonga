package androidx.compose.material3;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,358:1\n1064#2,2:359\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1\n*L\n132#1:359,2\n*E\n"})
public final class DateInputKt$DateInputTextField$1 extends Lambda implements C11300l<TextFieldValue, C11079d2> {
    final /* synthetic */ C8169a0 $dateInputFormat;
    final /* synthetic */ C8174b0 $dateInputValidator;
    final /* synthetic */ C8700z0<String> $errorText;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ C11300l<C8238l, C11079d2> $onDateChanged;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8700z0<TextFieldValue> $text$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$1(C8169a0 a0Var, C8700z0<String> z0Var, C11300l<? super C8238l, C11079d2> lVar, StateData stateData, C8174b0 b0Var, int i, Locale locale, C8700z0<TextFieldValue> z0Var2) {
        super(1);
        this.$dateInputFormat = a0Var;
        this.$errorText = z0Var;
        this.$onDateChanged = lVar;
        this.$stateData = stateData;
        this.$dateInputValidator = b0Var;
        this.$inputIdentifier = i;
        this.$locale = locale;
        this.$text$delegate = z0Var2;
    }

    /* renamed from: a */
    public final void mo11339a(@C12579k TextFieldValue textFieldValue) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(textFieldValue, "input");
        if (textFieldValue.mo47115i().length() <= this.$dateInputFormat.mo12438g().length()) {
            String i = textFieldValue.mo47115i();
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i.length()) {
                    z = true;
                    break;
                } else if (!Character.isDigit(i.charAt(i2))) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                DateInputKt.m25563d(this.$text$delegate, textFieldValue);
                String obj = StringsKt__StringsKt.trim(textFieldValue.mo47115i()).toString();
                if (obj.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C8238l lVar = null;
                if (z2 || obj.length() < this.$dateInputFormat.mo12438g().length()) {
                    this.$errorText.setValue("");
                    this.$onDateChanged.invoke(null);
                    return;
                }
                C8238l a = this.$stateData.mo11987a().mo12485a(obj, this.$dateInputFormat.mo12438g());
                this.$errorText.setValue(this.$dateInputValidator.mo12457a(a, this.$inputIdentifier, this.$locale));
                C11300l<C8238l, C11079d2> lVar2 = this.$onDateChanged;
                if (this.$errorText.getValue().length() == 0) {
                    z3 = true;
                }
                if (z3) {
                    lVar = a;
                }
                lVar2.invoke(lVar);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11339a((TextFieldValue) obj);
        return C11079d2.f28267a;
    }
}
