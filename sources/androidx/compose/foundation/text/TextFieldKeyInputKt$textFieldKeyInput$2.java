package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C2843s;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15441f;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,260:1\n25#2:261\n25#2:268\n1114#3,6:262\n1114#3,6:269\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n244#1:261\n245#1:268\n244#1:262,6\n245#1:269,6\n*E\n"})
public final class TextFieldKeyInputKt$textFieldKeyInput$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $editable;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ C11300l<TextFieldValue, C11079d2> $onValueChange;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ C2763c0 $undoManager;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInputKt$textFieldKeyInput$2(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, C16281c0 c0Var, C2763c0 c0Var2, C11300l<? super TextFieldValue, C11079d2> lVar) {
        super(3);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$editable = z;
        this.$singleLine = z2;
        this.$offsetMapping = c0Var;
        this.$undoManager = c0Var2;
        this.$onValueChange = lVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo9403a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar2.mo14918M(58482146);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(58482146, i, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:242)");
        }
        oVar2.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new C2843s();
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C2843s sVar = (C2843s) N;
        oVar2.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new C2758a();
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8767m a = C15441f.m68286a(C8767m.f23478j, new C11300l<C15436b, Boolean>(new TextFieldKeyInput(this.$state, this.$manager, this.$value, this.$editable, this.$singleLine, sVar, this.$offsetMapping, this.$undoManager, (C2758a) N2, (C2771g) null, this.$onValueChange, 512, (DefaultConstructorMarker) null)) {
            @C12579k
            /* renamed from: d */
            public final Boolean mo9404d(@C12579k KeyEvent keyEvent) {
                Intrinsics.checkNotNullParameter(keyEvent, "p0");
                return Boolean.valueOf(((TextFieldKeyInput) this.receiver).mo9390o(keyEvent));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo9404d(((C15436b) obj).mo43922h());
            }
        });
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9403a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
