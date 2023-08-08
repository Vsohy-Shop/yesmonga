package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.ui.text.font.k0 */
public final class C16216k0 extends C16249w0 {

    /* renamed from: z */
    public static final int f40311z = 0;
    @C12579k

    /* renamed from: x */
    public final String f40312x;
    @C12579k

    /* renamed from: y */
    public final String f40313y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16216k0(@C12579k String str, @C12579k String str2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "fontFamilyName");
        this.f40312x = str;
        this.f40313y = str2;
    }

    @C12579k
    /* renamed from: H */
    public final String mo46975H() {
        return this.f40312x;
    }

    @C12579k
    public String toString() {
        return this.f40313y;
    }
}
