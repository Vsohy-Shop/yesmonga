package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.n0 */
public class C19448n0 extends Fragment {
    @C12579k

    /* renamed from: b */
    public static final C19450b f49828b = new C19450b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f49829c = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    @C12580l

    /* renamed from: a */
    public C19449a f49830a;

    /* renamed from: androidx.lifecycle.n0$a */
    public interface C19449a {
        /* renamed from: b */
        void mo57614b();

        /* renamed from: g */
        void mo57615g();

        void onCreate();
    }

    /* renamed from: androidx.lifecycle.n0$b */
    public static final class C19450b {
        public /* synthetic */ C19450b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11384m
        /* renamed from: c */
        public static /* synthetic */ void m90751c(Activity activity) {
        }

        @C11384m
        /* renamed from: a */
        public final void mo57629a(@C12579k Activity activity, @C12579k Lifecycle.C19372Event event) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof C19516z) {
                ((C19516z) activity).getLifecycle().mo57705l(event);
            } else if (activity instanceof C19499w) {
                Lifecycle lifecycle = ((C19499w) activity).getLifecycle();
                if (lifecycle instanceof C19512y) {
                    ((C19512y) lifecycle).mo57705l(event);
                }
            }
        }

        @C11314h(name = "get")
        @C12579k
        /* renamed from: b */
        public final C19448n0 mo57630b(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(C19448n0.f49829c);
            Intrinsics.checkNotNull(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (C19448n0) findFragmentByTag;
        }

        @C11384m
        /* renamed from: d */
        public final void mo57631d(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            if (Build.VERSION.SDK_INT >= 29) {
                C19451c.Companion.mo57645a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(C19448n0.f49829c) == null) {
                fragmentManager.beginTransaction().add(new C19448n0(), C19448n0.f49829c).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public C19450b() {
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.lifecycle.n0$c */
    public static final class C19451c implements Application.ActivityLifecycleCallbacks {
        @C12579k
        public static final C19452a Companion = new C19452a((DefaultConstructorMarker) null);

        /* renamed from: androidx.lifecycle.n0$c$a */
        public static final class C19452a {
            public /* synthetic */ C19452a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C11384m
            /* renamed from: a */
            public final void mo57645a(@C12579k Activity activity) {
                Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
                activity.registerActivityLifecycleCallbacks(new C19451c());
            }

            public C19452a() {
            }
        }

        @C11384m
        public static final void registerIn(@C12579k Activity activity) {
            Companion.mo57645a(activity);
        }

        public void onActivityCreated(@C12579k Activity activity, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        }

        public void onActivityDestroyed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        }

        public void onActivityPaused(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        }

        public void onActivityPostCreated(@C12579k Activity activity, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57629a(activity, Lifecycle.C19372Event.ON_CREATE);
        }

        public void onActivityPostResumed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57629a(activity, Lifecycle.C19372Event.ON_RESUME);
        }

        public void onActivityPostStarted(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57629a(activity, Lifecycle.C19372Event.ON_START);
        }

        public void onActivityPreDestroyed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57629a(activity, Lifecycle.C19372Event.ON_DESTROY);
        }

        public void onActivityPrePaused(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57629a(activity, Lifecycle.C19372Event.ON_PAUSE);
        }

        public void onActivityPreStopped(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57629a(activity, Lifecycle.C19372Event.ON_STOP);
        }

        public void onActivityResumed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        }

        public void onActivitySaveInstanceState(@C12579k Activity activity, @C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        public void onActivityStarted(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        }

        public void onActivityStopped(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        }
    }

    @C11384m
    /* renamed from: b */
    public static final void m90741b(@C12579k Activity activity, @C12579k Lifecycle.C19372Event event) {
        f49828b.mo57629a(activity, event);
    }

    @C11314h(name = "get")
    @C12579k
    /* renamed from: f */
    public static final C19448n0 m90742f(@C12579k Activity activity) {
        return f49828b.mo57630b(activity);
    }

    @C11384m
    /* renamed from: g */
    public static final void m90743g(@C12579k Activity activity) {
        f49828b.mo57631d(activity);
    }

    /* renamed from: a */
    public final void mo57618a(Lifecycle.C19372Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            C19450b bVar = f49828b;
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, C0696c.f2306r);
            bVar.mo57629a(activity, event);
        }
    }

    /* renamed from: c */
    public final void mo57619c(C19449a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: d */
    public final void mo57620d(C19449a aVar) {
        if (aVar != null) {
            aVar.mo57615g();
        }
    }

    /* renamed from: e */
    public final void mo57621e(C19449a aVar) {
        if (aVar != null) {
            aVar.mo57614b();
        }
    }

    /* renamed from: h */
    public final void mo57622h(@C12580l C19449a aVar) {
        this.f49830a = aVar;
    }

    public void onActivityCreated(@C12580l Bundle bundle) {
        super.onActivityCreated(bundle);
        mo57619c(this.f49830a);
        mo57618a(Lifecycle.C19372Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo57618a(Lifecycle.C19372Event.ON_DESTROY);
        this.f49830a = null;
    }

    public void onPause() {
        super.onPause();
        mo57618a(Lifecycle.C19372Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        mo57620d(this.f49830a);
        mo57618a(Lifecycle.C19372Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        mo57621e(this.f49830a);
        mo57618a(Lifecycle.C19372Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo57618a(Lifecycle.C19372Event.ON_STOP);
    }
}
