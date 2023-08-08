package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.platform.r4 */
public final class C15961r4 {
    @C12579k

    /* renamed from: a */
    public static final C15961r4 f39661a = new C15961r4();

    @C0373u
    @C0376v0(29)
    @C12579k
    /* renamed from: a */
    public final Map<Integer, Integer> mo45949a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Map<Integer, Integer> a = view.getAttributeSourceResourceMap();
        Intrinsics.checkNotNullExpressionValue(a, "view.attributeSourceResourceMap");
        return a;
    }
}
