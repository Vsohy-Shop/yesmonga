package com.carrefour.fid.android.shared.base;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class BaseViewPagerAdapter extends FragmentStateAdapter {

    /* renamed from: Z */
    public static final int f68568Z = 8;
    @C12579k

    /* renamed from: X */
    public List<? extends C28494o<?>> f68569X = CollectionsKt__CollectionsKt.m40441E();
    @C12579k

    /* renamed from: Y */
    public final C11677z f68570Y = C10864b0.m38748c(new BaseViewPagerAdapter$fragmentNames$2(this));
    @C12579k

    /* renamed from: z */
    public final Context f68571z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewPagerAdapter(@C12579k Fragment fragment, @C12579k Context context) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f68571z = context;
    }

    @C12579k
    /* renamed from: F */
    public final String[] mo83348F() {
        return (String[]) this.f68570Y.getValue();
    }

    @C12579k
    /* renamed from: G */
    public final List<C28494o<?>> mo83349G() {
        return this.f68569X;
    }

    /* renamed from: H */
    public final void mo83350H(@C12579k List<? extends C28494o<?>> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f68569X = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f68569X.size();
    }

    public int getItemViewType(int i) {
        return C11342l0.m43547d(this.f68569X.get(i).getClass()).hashCode();
    }

    @C12579k
    /* renamed from: m */
    public Fragment mo62427m(int i) {
        return (Fragment) this.f68569X.get(i);
    }
}
