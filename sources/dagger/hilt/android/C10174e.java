package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.C0696c;
import androidx.exifinterface.media.C19135a;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.C10263c;
import dagger.hilt.android.internal.C10184a;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: dagger.hilt.android.e */
public final class C10174e {
    @C12579k

    /* renamed from: a */
    public static final C10174e f27910a = new C10174e();

    @C11384m
    /* renamed from: b */
    public static final <T> T m38391b(@C12579k Activity activity, @C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(cls, "entryPoint");
        return C10263c.m38503a(activity, cls);
    }

    @C11384m
    /* renamed from: d */
    public static final <T> T m38392d(@C12579k Context context, @C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cls, "entryPoint");
        return C10263c.m38503a(C10184a.m38402a(context.getApplicationContext()), cls);
    }

    @C11384m
    /* renamed from: f */
    public static final <T> T m38393f(@C12579k Fragment fragment, @C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cls, "entryPoint");
        return C10263c.m38503a(fragment, cls);
    }

    @C11384m
    /* renamed from: h */
    public static final <T> T m38394h(@C12579k View view, @C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(cls, "entryPoint");
        return C10263c.m38503a(view, cls);
    }

    /* renamed from: a */
    public final /* synthetic */ <T> T mo21612a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return m38391b(activity, Object.class);
    }

    /* renamed from: c */
    public final /* synthetic */ <T> T mo21613c(Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return m38392d(context, Object.class);
    }

    /* renamed from: e */
    public final /* synthetic */ <T> T mo21614e(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return m38393f(fragment, Object.class);
    }

    /* renamed from: g */
    public final /* synthetic */ <T> T mo21615g(View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return m38394h(view, Object.class);
    }
}
