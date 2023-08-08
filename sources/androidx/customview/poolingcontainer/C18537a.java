package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import androidx.customview.poolingcontainer.C18540d;
import com.google.android.gms.common.internal.C40852x;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "PoolingContainer")
/* renamed from: androidx.customview.poolingcontainer.a */
public final class C18537a {

    /* renamed from: a */
    public static final int f47314a = C18540d.C18541a.pooling_container_listener_holder_tag;

    /* renamed from: b */
    public static final int f47315b = C18540d.C18541a.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    /* renamed from: a */
    public static final void m83840a(@C12579k View view, @C12579k C18538b bVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        m83843d(view).mo53416a(bVar);
    }

    /* renamed from: b */
    public static final void m83841b(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (View d : ViewKt.m81838i(view)) {
            m83843d(d).mo53417b();
        }
    }

    /* renamed from: c */
    public static final void m83842c(@C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        for (View d : ViewGroupKt.m81808e(viewGroup)) {
            m83843d(d).mo53417b();
        }
    }

    /* renamed from: d */
    public static final C18539c m83843d(View view) {
        int i = f47314a;
        C18539c cVar = (C18539c) view.getTag(i);
        if (cVar != null) {
            return cVar;
        }
        C18539c cVar2 = new C18539c();
        view.setTag(i, cVar2);
        return cVar2;
    }

    /* renamed from: e */
    public static final boolean m83844e(@C12579k View view) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f47315b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m83845f(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (ViewParent next : ViewKt.m81839j(view)) {
            if ((next instanceof View) && m83844e((View) next)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    /* renamed from: g */
    public static final void m83846g(@C12579k View view, @C12579k C18538b bVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        m83843d(view).mo53418c(bVar);
    }

    /* renamed from: h */
    public static final void m83847h(@C12579k View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f47315b, Boolean.valueOf(z));
    }
}
