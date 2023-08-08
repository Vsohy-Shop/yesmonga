package com.carrefour.fid.android.core.extension;

import android.graphics.drawable.Drawable;
import androidx.activity.result.C0302g;
import androidx.core.content.C17318d;
import androidx.fragment.app.Fragment;
import com.carrefour.fid.android.R;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class FragmentKt {
    /* renamed from: a */
    public static final void m148915a(@C12579k Fragment fragment, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C0302g<String> gVar, @C12579k C11289a<C11079d2> aVar) {
        Fragment fragment2 = fragment;
        String str4 = str;
        C0302g<String> gVar2 = gVar;
        Intrinsics.checkNotNullParameter(fragment2, "<this>");
        Intrinsics.checkNotNullParameter(str4, "permission");
        Intrinsics.checkNotNullParameter(str2, "dialogTitle");
        Intrinsics.checkNotNullParameter(str3, "dialogMessage");
        Intrinsics.checkNotNullParameter(gVar2, "requestPermissionLauncher");
        Intrinsics.checkNotNullParameter(aVar, "grantedAction");
        if (C17318d.m79718a(fragment.requireContext(), str4) == 0) {
            aVar.invoke();
        } else if (fragment.shouldShowRequestPermissionRationale(str)) {
            Drawable h = com.carrefour.fid.android.shared.extension.FragmentKt.m118820h(fragment2, R.drawable.background_search_bar, (Integer) null, 2, (Object) null);
            String string = fragment2.getString(R.string.general_refuse);
            String string2 = fragment2.getString(R.string.ok_uppercase);
            com.carrefour.fid.android.shared.extension.FragmentKt.m118838z(fragment, str2, str3, string, FragmentKt$checkOrRequestPermission$1.f89633f, string2, false, new FragmentKt$checkOrRequestPermission$2(fragment2), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
        } else {
            gVar2.mo960b(str4);
        }
    }

    @C12580l
    /* renamed from: b */
    public static final <T> T m148916b(@C12579k Fragment fragment, @C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(cls, "type");
        T parentFragment = fragment.getParentFragment();
        if (parentFragment == null) {
            return null;
        }
        if (Intrinsics.areEqual((Object) parentFragment.getClass(), (Object) cls)) {
            return parentFragment;
        }
        return m148916b(parentFragment, cls);
    }
}
