package com.carrefour.fid.android.design.components.widgets.swipetorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.type.ViewType;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.b */
public final class C37408b extends ViewGroup.MarginLayoutParams {

    /* renamed from: b */
    public static final int f94013b = 8;
    @C12579k

    /* renamed from: a */
    public ViewType f94014a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37408b(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        ViewType viewType = ViewType.UNKNOWN;
        this.f94014a = viewType;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.PullLayoutParams, 0, 0);
        try {
            this.f94014a = ViewType.f92958a.mo112748a(obtainStyledAttributes.getInt(C36896b.C36914r.PullLayoutParams_layout_type, viewType.mo112747q()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @C12579k
    /* renamed from: a */
    public final ViewType mo114047a() {
        return this.f94014a;
    }

    /* renamed from: b */
    public final void mo114048b(@C12579k ViewType viewType) {
        Intrinsics.checkNotNullParameter(viewType, "<set-?>");
        this.f94014a = viewType;
    }

    public C37408b(int i, int i2) {
        super(i, i2);
        this.f94014a = ViewType.UNKNOWN;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37408b(@C12579k ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        Intrinsics.checkNotNullParameter(layoutParams, "source");
        this.f94014a = ViewType.UNKNOWN;
    }
}
