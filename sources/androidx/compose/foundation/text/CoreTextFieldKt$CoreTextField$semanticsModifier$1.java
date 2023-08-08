package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.text.input.C16280c;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16287e;
import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.C16331y0;
import androidx.compose.p004ui.text.input.C16334z0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ C16313q $imeOptions;
    final /* synthetic */ boolean $isPassword;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ C16334z0 $transformedText;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1(C16313q qVar, C16334z0 z0Var, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, TextFieldState textFieldState, C16281c0 c0Var, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.$imeOptions = qVar;
        this.$transformedText = z0Var;
        this.$value = textFieldValue;
        this.$enabled = z;
        this.$isPassword = z2;
        this.$readOnly = z3;
        this.$state = textFieldState;
        this.$offsetMapping = c0Var;
        this.$manager = textFieldSelectionManager;
        this.$focusRequester = focusRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k final C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71969L0(qVar, this.$imeOptions.mo47297f());
        SemanticsPropertiesKt.m71963I0(qVar, this.$transformedText.mo47343b());
        SemanticsPropertiesKt.m72000a1(qVar, this.$value.mo47113h());
        if (!this.$enabled) {
            SemanticsPropertiesKt.m72020j(qVar);
        }
        if (this.$isPassword) {
            SemanticsPropertiesKt.m72039s0(qVar);
        }
        final TextFieldState textFieldState = this.$state;
        SemanticsPropertiesKt.m71986U(qVar, (String) null, new C11300l<List<C16260h0>, Boolean>() {
            @C12579k
            /* renamed from: a */
            public final Boolean invoke(@C12579k List<C16260h0> list) {
                boolean z;
                Intrinsics.checkNotNullParameter(list, "it");
                if (textFieldState.mo9443g() != null) {
                    C2851y g = textFieldState.mo9443g();
                    Intrinsics.checkNotNull(g);
                    list.add(g.mo9930i());
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, 1, (Object) null);
        final TextFieldState textFieldState2 = this.$state;
        SemanticsPropertiesKt.m71997Z0(qVar, (String) null, new C11300l<C16156d, Boolean>() {
            @C12579k
            /* renamed from: a */
            public final Boolean invoke(@C12579k C16156d dVar) {
                C11079d2 d2Var;
                Intrinsics.checkNotNullParameter(dVar, "text");
                C16331y0 e = textFieldState2.mo9441e();
                if (e != null) {
                    TextFieldState textFieldState = textFieldState2;
                    TextFieldDelegate.f7187a.mo9371g(CollectionsKt__CollectionsKt.m40448L(new C16287e(), new C16280c(dVar, 1)), textFieldState.mo9447k(), textFieldState.mo9446j(), e);
                    d2Var = C11079d2.f28267a;
                } else {
                    d2Var = null;
                }
                if (d2Var == null) {
                    textFieldState2.mo9446j().invoke(new TextFieldValue(dVar.mo46683j(), C16359o0.m73779a(dVar.mo46683j().length()), (C16356n0) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        final C16281c0 c0Var = this.$offsetMapping;
        final boolean z = this.$enabled;
        final TextFieldValue textFieldValue = this.$value;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        final TextFieldState textFieldState3 = this.$state;
        SemanticsPropertiesKt.m71987U0(qVar, (String) null, new C11305q<Integer, Integer, Boolean, Boolean>() {
            @C12579k
            /* renamed from: a */
            public final Boolean mo9288a(int i, int i2, boolean z) {
                if (!z) {
                    i = c0Var.mo9513a(i);
                }
                if (!z) {
                    i2 = c0Var.mo9513a(i2);
                }
                boolean z2 = false;
                if (z && !(i == C16356n0.m73742n(textFieldValue.mo47113h()) && i2 == C16356n0.m73737i(textFieldValue.mo47113h()))) {
                    if (C11479u.m44313B(i, i2) < 0 || C11479u.m44447u(i, i2) > textFieldValue.mo47111f().length()) {
                        textFieldSelectionManager.mo9768t();
                    } else {
                        if (z || i == i2) {
                            textFieldSelectionManager.mo9768t();
                        } else {
                            textFieldSelectionManager.mo9767s();
                        }
                        textFieldState3.mo9446j().invoke(new TextFieldValue(textFieldValue.mo47111f(), C16359o0.m73780b(i, i2), (C16356n0) null, 4, (DefaultConstructorMarker) null));
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return mo9288a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }, 1, (Object) null);
        final TextFieldState textFieldState4 = this.$state;
        final FocusRequester focusRequester = this.$focusRequester;
        final boolean z2 = this.$readOnly;
        SemanticsPropertiesKt.m72017h0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                CoreTextFieldKt.m12261p(textFieldState4, focusRequester, !z2);
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        final TextFieldSelectionManager textFieldSelectionManager2 = this.$manager;
        SemanticsPropertiesKt.m72021j0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                textFieldSelectionManager2.mo9767s();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        if (!C16356n0.m73736h(this.$value.mo47113h()) && !this.$isPassword) {
            final TextFieldSelectionManager textFieldSelectionManager3 = this.$manager;
            SemanticsPropertiesKt.m72012f(qVar, (String) null, new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    TextFieldSelectionManager.m12869m(textFieldSelectionManager3, false, 1, (Object) null);
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
            if (this.$enabled && !this.$readOnly) {
                final TextFieldSelectionManager textFieldSelectionManager4 = this.$manager;
                SemanticsPropertiesKt.m72016h(qVar, (String) null, new C11289a<Boolean>() {
                    @C12579k
                    public final Boolean invoke() {
                        textFieldSelectionManager4.mo9765p();
                        return Boolean.TRUE;
                    }
                }, 1, (Object) null);
            }
        }
        if (this.$enabled && !this.$readOnly) {
            final TextFieldSelectionManager textFieldSelectionManager5 = this.$manager;
            SemanticsPropertiesKt.m72043u0(qVar, (String) null, new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    textFieldSelectionManager5.mo9744P();
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }
}
