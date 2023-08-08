package com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component;

import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.service.C28330R;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPictos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pictos.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/component/ComposableSingletons$PictosKt$lambda-1$1\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,79:1\n1098#2:80\n927#2,6:81\n*S KotlinDebug\n*F\n+ 1 Pictos.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/component/ComposableSingletons$PictosKt$lambda-1$1\n*L\n33#1:80\n34#1:81,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.component.ComposableSingletons$PictosKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PictosKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    public static final ComposableSingletons$PictosKt$lambda1$1 INSTANCE = new ComposableSingletons$PictosKt$lambda1$1();

    public ComposableSingletons$PictosKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1057013593, i2, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.component.ComposableSingletons$PictosKt.lambda-1.<anonymous> (Pictos.kt:30)");
            }
            oVar2.mo14918M(1654729708);
            C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
            oVar2.mo14918M(1654729751);
            int r = aVar.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
            try {
                aVar.mo46707l(C16018i.m71858d(C28330R.string.drive_summary_picto1_start, oVar2, 0));
                C11079d2 d2Var = C11079d2.f28267a;
                aVar.mo46710o(r);
                oVar.mo15002m0();
                aVar.mo46707l(" ");
                aVar.mo46707l(C16018i.m71858d(C28330R.string.drive_summary_picto1_end, oVar2, 0));
                C16156d u = aVar.mo46716u();
                oVar.mo15002m0();
                TextKt.m14197d(u, (C8767m) null, 0, C16506u.m74712m(12), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 3072, 0, 261622);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
            } catch (Throwable th) {
                aVar.mo46710o(r);
                throw th;
            }
        } else {
            oVar.mo14958a0();
        }
    }
}
