package com.carrefour.fid.android.presentation.p035ui.coupons.adapter;

import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.adapter.b */
public final class C23786b extends FragmentStateAdapter {

    /* renamed from: X */
    public static final int f59880X = 8;
    @C12579k

    /* renamed from: z */
    public final List<Fragment> f59881z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23786b(@C12579k C19232h hVar, @C12579k List<? extends Fragment> list) {
        super(hVar);
        Intrinsics.checkNotNullParameter(hVar, "fa");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f59881z = list;
    }

    public int getItemCount() {
        return this.f59881z.size();
    }

    @C12579k
    /* renamed from: m */
    public Fragment mo62427m(int i) {
        return this.f59881z.get(i);
    }
}
