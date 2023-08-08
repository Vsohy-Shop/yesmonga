package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16334z0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,369:1\n135#2:370\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n60#1:370\n*E\n"})
public final class TextFieldScrollKt {

    /* renamed from: androidx.compose.foundation.text.TextFieldScrollKt$a */
    public /* synthetic */ class C2750a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt.C2750a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static final C15098i m12446b(C16479d dVar, int i, C16334z0 z0Var, C16260h0 h0Var, boolean z, int i2) {
        C15098i iVar;
        float f;
        float f2;
        if (h0Var == null || (iVar = h0Var.mo47049e(z0Var.mo47342a().mo9514b(i))) == null) {
            iVar = C15098i.f37261e.mo42285a();
        }
        C15098i iVar2 = iVar;
        int n2 = dVar.mo7429n2(TextFieldCursorKt.m12376c());
        if (z) {
            f = (((float) i2) - iVar2.mo42279t()) - ((float) n2);
        } else {
            f = iVar2.mo42279t();
        }
        float f3 = f;
        if (z) {
            f2 = ((float) i2) - iVar2.mo42279t();
        } else {
            f2 = iVar2.mo42279t() + ((float) n2);
        }
        return C15098i.m64914h(iVar2, f3, 0.0f, f2, 0.0f, 10, (Object) null);
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m12447c(@C12579k C8767m mVar, @C12579k TextFieldScrollerPosition textFieldScrollerPosition, @C12579k TextFieldValue textFieldValue, @C12579k C16275a1 a1Var, @C12579k C11289a<C2851y> aVar) {
        C8767m mVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(textFieldScrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(a1Var, "visualTransformation");
        Intrinsics.checkNotNullParameter(aVar, "textLayoutResultProvider");
        Orientation f = textFieldScrollerPosition.mo9419f();
        int e = textFieldScrollerPosition.mo9418e(textFieldValue.mo47113h());
        textFieldScrollerPosition.mo9424k(textFieldValue.mo47113h());
        C16334z0 a = C2772g0.m12578a(a1Var, textFieldValue.mo47111f());
        int i = C2750a.$EnumSwitchMapping$0[f.ordinal()];
        if (i == 1) {
            mVar2 = new VerticalScrollLayoutModifier(textFieldScrollerPosition, e, a, aVar);
        } else if (i == 2) {
            mVar2 = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, e, a, aVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C8744d.m32515b(mVar).mo17224k3(mVar2);
    }

    @C12579k
    /* renamed from: d */
    public static final C8767m m12448d(@C12579k C8767m mVar, @C12579k TextFieldScrollerPosition textFieldScrollerPosition, @C12580l C2243g gVar, boolean z) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(textFieldScrollerPosition, "scrollerPosition");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2751x23ef3b2b(textFieldScrollerPosition, gVar, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, z, gVar));
    }

    /* renamed from: e */
    public static /* synthetic */ C8767m m12449e(C8767m mVar, TextFieldScrollerPosition textFieldScrollerPosition, C2243g gVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return m12448d(mVar, textFieldScrollerPosition, gVar, z);
    }
}
