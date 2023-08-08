package okio;

import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "changed in Okio 2.x")
/* renamed from: okio.e */
public final class C12468e {
    @C12579k

    /* renamed from: a */
    public static final C12468e f30405a = new C12468e();

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    /* renamed from: a */
    public final long mo27191a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        return C12520s0.m51065l(str, 0, 0, 3, (Object) null);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    /* renamed from: b */
    public final long mo27192b(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        return C12520s0.m51064k(str, i, i2);
    }
}
