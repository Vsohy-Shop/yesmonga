package androidx.compose.p004ui.util;

import android.os.Trace;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.util.a */
public final class C16512a {
    /* renamed from: a */
    public static final <T> T m74764a(@C12579k String str, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(str, "sectionName");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            Trace.endSection();
            C11322b0.m43480c(1);
        }
    }
}
