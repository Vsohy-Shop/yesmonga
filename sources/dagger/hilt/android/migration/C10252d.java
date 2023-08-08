package dagger.hilt.android.migration;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0359n0;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.internal.migration.C10237b;
import dagger.hilt.internal.C10280f;

/* renamed from: dagger.hilt.android.migration.d */
public final class C10252d {
    /* renamed from: a */
    public static boolean m38497a(@C0359n0 Object obj) {
        C10280f.m38506b(obj);
        C10280f.m38505a(obj instanceof C10237b, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((C10237b) obj).mo21681a();
    }

    /* renamed from: b */
    public static boolean m38498b(@C0359n0 Service service) {
        return m38497a(service);
    }

    /* renamed from: c */
    public static boolean m38499c(@C0359n0 BroadcastReceiver broadcastReceiver) {
        return m38497a(broadcastReceiver);
    }

    /* renamed from: d */
    public static boolean m38500d(@C0359n0 View view) {
        return m38497a(view);
    }

    /* renamed from: e */
    public static boolean m38501e(@C0359n0 ComponentActivity componentActivity) {
        return m38497a(componentActivity);
    }

    /* renamed from: f */
    public static boolean m38502f(@C0359n0 Fragment fragment) {
        return m38497a(fragment);
    }
}
