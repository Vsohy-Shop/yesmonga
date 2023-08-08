package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19229f0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.b */
public final class C24224b extends C19229f0 {

    /* renamed from: q */
    public static final int f60590q = 8;
    @C12579k

    /* renamed from: p */
    public List<? extends Fragment> f60591p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24224b(@C12579k FragmentManager fragmentManager, @C12579k List<? extends Fragment> list) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(list, "listFragment");
        this.f60591p = list;
    }

    /* renamed from: e */
    public int mo21373e() {
        return this.f60591p.size();
    }

    @C12579k
    /* renamed from: v */
    public Fragment mo57143v(int i) {
        return (Fragment) this.f60591p.get(i);
    }
}
