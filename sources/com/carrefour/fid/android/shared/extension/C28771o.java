package com.carrefour.fid.android.shared.extension;

import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compose.kt\ncom/carrefour/fid/android/shared/extension/ComposeKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,25:1\n1098#2:26\n927#2,6:27\n*S KotlinDebug\n*F\n+ 1 Compose.kt\ncom/carrefour/fid/android/shared/extension/ComposeKt\n*L\n11#1:26\n15#1:27,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.extension.o */
public final class C28771o {
    @C12579k
    /* renamed from: a */
    public static final C16156d m119089a(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "<this>");
        boolean z = false;
        List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"<b>", "</b>"}, false, 0, 6, (Object) null);
        C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
        for (String str3 : split$default) {
            if (z) {
                int r = aVar.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
                try {
                    aVar.mo46707l(str3);
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    aVar.mo46710o(r);
                }
            } else {
                aVar.mo46707l(str3);
            }
            z = !z;
        }
        return aVar.mo46716u();
    }
}
