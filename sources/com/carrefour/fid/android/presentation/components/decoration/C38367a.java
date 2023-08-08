package com.carrefour.fid.android.presentation.components.decoration;

import android.view.View;
import androidx.annotation.C0354l;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.presentation.components.decoration.C28852a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.components.decoration.a */
public final class C38367a extends C28852a {

    /* renamed from: f */
    public static final int f97150f = 0;

    public C38367a() {
        this(0, false, 0, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public int mo83966m(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        if (view.findViewById(R.id.image_holder_order_details_product) == null && view.findViewById(R.id.text_order_details_department_label) == null) {
            return 0;
        }
        return super.mo83966m(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38367a(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? -3355444 : i2);
    }

    public C38367a(int i, boolean z, @C0354l int i2) {
        super(i, z, i2);
    }
}
