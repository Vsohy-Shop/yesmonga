package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C17994n;

/* renamed from: androidx.core.app.i */
public class C17125i {

    /* renamed from: a */
    public static final String f45376a = "android.activity.usage_time";

    /* renamed from: b */
    public static final String f45377b = "android.usage_time_packages";

    @C0376v0(16)
    /* renamed from: androidx.core.app.i$a */
    public static class C17126a extends C17125i {

        /* renamed from: c */
        public final ActivityOptions f45378c;

        public C17126a(ActivityOptions activityOptions) {
            this.f45378c = activityOptions;
        }

        /* renamed from: a */
        public Rect mo51571a() {
            return C17130e.m79356a(this.f45378c);
        }

        /* renamed from: j */
        public void mo51572j(@C0359n0 PendingIntent pendingIntent) {
            C17129d.m79355c(this.f45378c, pendingIntent);
        }

        @C0359n0
        /* renamed from: k */
        public C17125i mo51573k(@C0363p0 Rect rect) {
            return new C17126a(C17130e.m79357b(this.f45378c, rect));
        }

        /* renamed from: l */
        public Bundle mo51574l() {
            return this.f45378c.toBundle();
        }

        /* renamed from: m */
        public void mo51575m(@C0359n0 C17125i iVar) {
            if (iVar instanceof C17126a) {
                this.f45378c.update(((C17126a) iVar).f45378c);
            }
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.app.i$b */
    public static class C17127b {
        @C0373u
        /* renamed from: a */
        public static ActivityOptions m79347a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @C0373u
        /* renamed from: b */
        public static ActivityOptions m79348b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: c */
        public static ActivityOptions m79349c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.app.i$c */
    public static class C17128c {
        @C0373u
        /* renamed from: a */
        public static ActivityOptions m79350a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @C0373u
        /* renamed from: b */
        public static ActivityOptions m79351b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @C0373u
        /* renamed from: c */
        public static ActivityOptions m79352c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.app.i$d */
    public static class C17129d {
        @C0373u
        /* renamed from: a */
        public static ActivityOptions m79353a() {
            return ActivityOptions.makeBasic();
        }

        @C0373u
        /* renamed from: b */
        public static ActivityOptions m79354b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: c */
        public static void m79355c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.app.i$e */
    public static class C17130e {
        @C0373u
        /* renamed from: a */
        public static Rect m79356a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @C0373u
        /* renamed from: b */
        public static ActivityOptions m79357b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C17125i m79329b() {
        return new C17126a(C17129d.m79353a());
    }

    @C0359n0
    /* renamed from: c */
    public static C17125i m79330c(@C0359n0 View view, int i, int i2, int i3, int i4) {
        return new C17126a(C17129d.m79354b(view, i, i2, i3, i4));
    }

    @C0359n0
    /* renamed from: d */
    public static C17125i m79331d(@C0359n0 Context context, int i, int i2) {
        return new C17126a(C17127b.m79347a(context, i, i2));
    }

    @C0359n0
    /* renamed from: e */
    public static C17125i m79332e(@C0359n0 View view, int i, int i2, int i3, int i4) {
        return new C17126a(C17127b.m79348b(view, i, i2, i3, i4));
    }

    @C0359n0
    /* renamed from: f */
    public static C17125i m79333f(@C0359n0 Activity activity, @C0359n0 View view, @C0359n0 String str) {
        return new C17126a(C17128c.m79350a(activity, view, str));
    }

    @C0359n0
    /* renamed from: g */
    public static C17125i m79334g(@C0359n0 Activity activity, @C0363p0 C17994n<View, String>... nVarArr) {
        Pair[] pairArr;
        if (nVarArr != null) {
            pairArr = new Pair[nVarArr.length];
            for (int i = 0; i < nVarArr.length; i++) {
                C17994n<View, String> nVar = nVarArr[i];
                pairArr[i] = Pair.create((View) nVar.f46482a, (String) nVar.f46483b);
            }
        } else {
            pairArr = null;
        }
        return new C17126a(C17128c.m79351b(activity, pairArr));
    }

    @C0359n0
    /* renamed from: h */
    public static C17125i m79335h() {
        return new C17126a(C17128c.m79352c());
    }

    @C0359n0
    /* renamed from: i */
    public static C17125i m79336i(@C0359n0 View view, @C0359n0 Bitmap bitmap, int i, int i2) {
        return new C17126a(C17127b.m79349c(view, bitmap, i, i2));
    }

    @C0363p0
    /* renamed from: a */
    public Rect mo51571a() {
        return null;
    }

    /* renamed from: j */
    public void mo51572j(@C0359n0 PendingIntent pendingIntent) {
    }

    @C0359n0
    /* renamed from: k */
    public C17125i mo51573k(@C0363p0 Rect rect) {
        return this;
    }

    @C0363p0
    /* renamed from: l */
    public Bundle mo51574l() {
        return null;
    }

    /* renamed from: m */
    public void mo51575m(@C0359n0 C17125i iVar) {
    }
}
