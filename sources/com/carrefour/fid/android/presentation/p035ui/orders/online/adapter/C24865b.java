package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.b */
public final class C24865b extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24866a f61641b = new C24866a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61642c = 8;

    /* renamed from: d */
    public static final int f61643d = 1;
    @C12579k

    /* renamed from: a */
    public final View f61644a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.b$a */
    public static final class C24866a {
        public /* synthetic */ C24866a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24866a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24865b(@C12579k View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.f61644a = view;
    }

    @C12579k
    /* renamed from: c */
    public final View mo72615c() {
        return this.f61644a;
    }
}
