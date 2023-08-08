package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.C0329d0;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.core.content.C17358m0;
import androidx.core.p027os.C17772a;
import androidx.core.view.C18193h0;
import com.urbanairship.push.C9489i;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.b */
public class C17018b extends C17318d {

    /* renamed from: i */
    public static C17028j f44964i;

    /* renamed from: androidx.core.app.b$a */
    public class C17019a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String[] f44965a;

        /* renamed from: b */
        public final /* synthetic */ Activity f44966b;

        /* renamed from: c */
        public final /* synthetic */ int f44967c;

        public C17019a(String[] strArr, Activity activity, int i) {
            this.f44965a = strArr;
            this.f44966b = activity;
            this.f44967c = i;
        }

        public void run() {
            int[] iArr = new int[this.f44965a.length];
            PackageManager packageManager = this.f44966b.getPackageManager();
            String packageName = this.f44966b.getPackageName();
            int length = this.f44965a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f44965a[i], packageName);
            }
            ((C17027i) this.f44966b).onRequestPermissionsResult(this.f44967c, this.f44965a, iArr);
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.app.b$b */
    public static class C17020b {
        @C0373u
        /* renamed from: a */
        public static void m78755a(Activity activity) {
            activity.finishAffinity();
        }

        @C0373u
        /* renamed from: b */
        public static void m78756b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @C0373u
        /* renamed from: c */
        public static void m78757c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.app.b$c */
    public static class C17021c {
        @C0373u
        /* renamed from: a */
        public static void m78758a(Activity activity) {
            activity.finishAfterTransition();
        }

        @C0373u
        /* renamed from: b */
        public static void m78759b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @C0373u
        /* renamed from: c */
        public static void m78760c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @C0373u
        /* renamed from: d */
        public static void m78761d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @C0373u
        /* renamed from: e */
        public static void m78762e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @C0376v0(22)
    /* renamed from: androidx.core.app.b$d */
    public static class C17022d {
        @C0373u
        /* renamed from: a */
        public static Uri m78763a(Activity activity) {
            return activity.getReferrer();
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.app.b$e */
    public static class C17023e {
        @C0373u
        /* renamed from: a */
        public static void m78764a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @C0373u
        /* renamed from: b */
        public static void m78765b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @C0373u
        /* renamed from: c */
        public static boolean m78766c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.app.b$f */
    public static class C17024f {
        @C0373u
        /* renamed from: a */
        public static <T> T m78767a(Activity activity, int i) {
            return activity.requireViewById(i);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.app.b$g */
    public static class C17025g {
        @C0373u
        /* renamed from: a */
        public static Display m78768a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @C0373u
        /* renamed from: b */
        public static void m78769b(@C0359n0 Activity activity, @C0363p0 C17358m0 m0Var, @C0363p0 Bundle bundle) {
            activity.setLocusContext(m0Var == null ? null : m0Var.mo51798c(), bundle);
        }
    }

    @C0376v0(31)
    /* renamed from: androidx.core.app.b$h */
    public static class C17026h {
        @C0373u
        /* renamed from: a */
        public static boolean m78770a(@C0359n0 Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    /* renamed from: androidx.core.app.b$i */
    public interface C17027i {
        void onRequestPermissionsResult(int i, @C0359n0 String[] strArr, @C0359n0 int[] iArr);
    }

    /* renamed from: androidx.core.app.b$j */
    public interface C17028j {
        /* renamed from: a */
        boolean mo51188a(@C0359n0 Activity activity, @C0337f0(from = 0) int i, int i2, @C0363p0 Intent intent);

        /* renamed from: b */
        boolean mo51189b(@C0359n0 Activity activity, @C0359n0 String[] strArr, @C0337f0(from = 0) int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.b$k */
    public interface C17029k {
        /* renamed from: w */
        void mo51190w(int i);
    }

    @C0376v0(21)
    /* renamed from: androidx.core.app.b$l */
    public static class C17030l extends SharedElementCallback {

        /* renamed from: a */
        public final C17052c6 f44968a;

        public C17030l(C17052c6 c6Var) {
            this.f44968a = c6Var;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f44968a.mo51244b(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f44968a.mo51245c(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f44968a.mo51246d(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f44968a.mo51247e(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f44968a.mo51248f(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f44968a.mo51249g(list, list2, list3);
        }

        @C0376v0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f44968a.mo51250h(list, list2, new C17110g(onSharedElementsReadyListener));
        }
    }

    /* renamed from: A */
    public static void m78734A(@C0359n0 Activity activity) {
        C17021c.m78758a(activity);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: B */
    public static C17028j m78735B() {
        return f44964i;
    }

    @C0363p0
    /* renamed from: C */
    public static Uri m78736C(@C0359n0 Activity activity) {
        return C17022d.m78763a(activity);
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m78737D(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    /* renamed from: E */
    public static boolean m78738E(@C0359n0 Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return C17026h.m78770a(activity);
        }
        if (i == 30) {
            if (C17025g.m78768a(activity) == null || C17025g.m78768a(activity).getDisplayId() == 0) {
                return false;
            }
            return true;
        } else if (i != 29) {
            return false;
        } else {
            if (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: F */
    public static /* synthetic */ void m78739F(Activity activity) {
        if (!activity.isFinishing() && !C17137j.m79372i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: G */
    public static void m78740G(@C0359n0 Activity activity) {
        C17021c.m78759b(activity);
    }

    /* renamed from: H */
    public static void m78741H(@C0359n0 Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C17008a(activity));
        }
    }

    @C0363p0
    /* renamed from: I */
    public static C18193h0 m78742I(@C0359n0 Activity activity, @C0359n0 DragEvent dragEvent) {
        return C18193h0.m82463b(activity, dragEvent);
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: J */
    public static void m78743J(@C0359n0 Activity activity, @C0359n0 String[] strArr, @C0337f0(from = 0) int i) {
        String[] strArr2;
        C17028j jVar = f44964i;
        if (jVar == null || !jVar.mo51189b(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (i2 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (!C17772a.m81155k() && TextUtils.equals(strArr[i2], C9489i.f25911h)) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr2 = new String[(strArr.length - size)];
            } else {
                strArr2 = strArr;
            }
            if (size > 0) {
                if (size != strArr.length) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (activity instanceof C17029k) {
                ((C17029k) activity).mo51190w(i);
            }
            C17023e.m78765b(activity, strArr, i);
        }
    }

    @C0359n0
    /* renamed from: K */
    public static <T extends View> T m78744K(@C0359n0 Activity activity, @C0329d0 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C17024f.m78767a(activity, i);
        }
        T findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: L */
    public static void m78745L(@C0359n0 Activity activity, @C0363p0 C17052c6 c6Var) {
        C17030l lVar;
        if (c6Var != null) {
            lVar = new C17030l(c6Var);
        } else {
            lVar = null;
        }
        C17021c.m78760c(activity, lVar);
    }

    /* renamed from: M */
    public static void m78746M(@C0359n0 Activity activity, @C0363p0 C17052c6 c6Var) {
        C17030l lVar;
        if (c6Var != null) {
            lVar = new C17030l(c6Var);
        } else {
            lVar = null;
        }
        C17021c.m78761d(activity, lVar);
    }

    /* renamed from: N */
    public static void m78747N(@C0359n0 Activity activity, @C0363p0 C17358m0 m0Var, @C0363p0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            C17025g.m78769b(activity, m0Var, bundle);
        }
    }

    /* renamed from: O */
    public static void m78748O(@C0363p0 C17028j jVar) {
        f44964i = jVar;
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: P */
    public static boolean m78749P(@C0359n0 Activity activity, @C0359n0 String str) {
        if (C17772a.m81155k() || !TextUtils.equals(C9489i.f25911h, str)) {
            return C17023e.m78766c(activity, str);
        }
        return false;
    }

    /* renamed from: Q */
    public static void m78750Q(@C0359n0 Activity activity, @C0359n0 Intent intent, int i, @C0363p0 Bundle bundle) {
        C17020b.m78756b(activity, intent, i, bundle);
    }

    /* renamed from: R */
    public static void m78751R(@C0359n0 Activity activity, @C0359n0 IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4, @C0363p0 Bundle bundle) throws IntentSender.SendIntentException {
        C17020b.m78757c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: S */
    public static void m78752S(@C0359n0 Activity activity) {
        C17021c.m78762e(activity);
    }

    /* renamed from: z */
    public static void m78754z(@C0359n0 Activity activity) {
        C17020b.m78755a(activity);
    }
}
