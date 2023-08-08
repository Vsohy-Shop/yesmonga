package com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.C24127e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.adapter.b */
public final class C24121b extends FragmentStateAdapter {
    @C12579k

    /* renamed from: E0 */
    public static final String f60344E0 = "KEY_SINGLE_SLIDE_CMS";
    @C12579k

    /* renamed from: X */
    public static final C24122a f60345X = new C24122a((DefaultConstructorMarker) null);

    /* renamed from: Y */
    public static final int f60346Y = 8;

    /* renamed from: Z */
    public static final long f60347Z = 5000;
    @C12579k

    /* renamed from: z */
    public List<SlideFooterCellModel> f60348z = new ArrayList();

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.adapter.b$a */
    public static final class C24122a {
        public /* synthetic */ C24122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24122a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24121b(@C12579k Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @C12579k
    /* renamed from: E */
    public final List<SlideFooterCellModel> mo70500E() {
        return this.f60348z;
    }

    /* renamed from: F */
    public final void mo70501F(@C12579k List<SlideFooterCellModel> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f60348z = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f60348z.size();
    }

    @C12579k
    /* renamed from: m */
    public Fragment mo62427m(int i) {
        C24127e.C24128a aVar = C24127e.f60360v;
        Bundle bundle = new Bundle();
        bundle.putParcelable(f60344E0, this.f60348z.get(i));
        return aVar.mo70510a(bundle);
    }
}
