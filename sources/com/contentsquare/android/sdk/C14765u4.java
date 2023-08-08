package com.contentsquare.android.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: com.contentsquare.android.sdk.u4 */
public class C14765u4 implements C14688re {

    /* renamed from: a */
    public final Queue<C14768c> f36603a = new PriorityQueue();

    /* renamed from: b */
    public final Handler f36604b;

    /* renamed from: c */
    public final long f36605c;

    /* renamed from: d */
    public final C14688re f36606d;

    /* renamed from: e */
    public final C14772u7 f36607e;

    /* renamed from: f */
    public final Runnable f36608f = new C14766a();

    /* renamed from: com.contentsquare.android.sdk.u4$a */
    public class C14766a implements Runnable {
        public C14766a() {
        }

        /* renamed from: a */
        public final boolean mo36554a(C14768c cVar) {
            Activity activity = cVar.f36611a.get();
            if (activity == null) {
                return false;
            }
            if (cVar instanceof C14767b) {
                Fragment fragment = ((C14767b) cVar).f36610d.get();
                if (fragment == null) {
                    return false;
                }
                C14765u4.this.f36606d.mo34762b(activity, fragment, cVar.f36612b);
                return true;
            } else if (cVar instanceof C14769d) {
                C14765u4.this.f36606d.mo34763c(activity, ((C14769d) cVar).f36614d, cVar.f36612b);
                return true;
            } else {
                C14765u4.this.f36606d.mo34767g(activity, cVar.f36612b);
                return true;
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void run() {
            /*
                r1 = this;
            L_0x0000:
                com.contentsquare.android.sdk.u4 r0 = com.contentsquare.android.sdk.C14765u4.this
                java.util.Queue<com.contentsquare.android.sdk.u4$c> r0 = r0.f36603a
                java.lang.Object r0 = r0.poll()
                com.contentsquare.android.sdk.u4$c r0 = (com.contentsquare.android.sdk.C14765u4.C14768c) r0
                if (r0 == 0) goto L_0x0012
                boolean r0 = r1.mo36554a(r0)
                if (r0 == 0) goto L_0x0000
            L_0x0012:
                com.contentsquare.android.sdk.u4 r0 = com.contentsquare.android.sdk.C14765u4.this
                java.util.Queue<com.contentsquare.android.sdk.u4$c> r0 = r0.f36603a
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14765u4.C14766a.run():void");
        }
    }

    /* renamed from: com.contentsquare.android.sdk.u4$b */
    public static class C14767b extends C14768c {

        /* renamed from: d */
        public final WeakReference<Fragment> f36610d;

        public C14767b(Activity activity, Fragment fragment, long j, long j2) {
            super(activity, j, j2);
            this.f36610d = new WeakReference<>(fragment);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.u4$c */
    public static class C14768c implements Comparable<C14768c> {

        /* renamed from: a */
        public final WeakReference<Activity> f36611a;

        /* renamed from: b */
        public final long f36612b;

        /* renamed from: c */
        public final long f36613c;

        public C14768c(Activity activity, long j, long j2) {
            this.f36611a = new WeakReference<>(activity);
            this.f36612b = j2;
            this.f36613c = j;
        }

        /* renamed from: b */
        public int compareTo(C14768c cVar) {
            int i = (this.f36613c > cVar.f36613c ? 1 : (this.f36613c == cVar.f36613c ? 0 : -1));
            return (i <= 0 && i < 0) ? 1 : -1;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.u4$d */
    public static class C14769d extends C14768c {

        /* renamed from: d */
        public final String f36614d;

        public C14769d(Activity activity, String str, long j, long j2) {
            super(activity, j, j2);
            this.f36614d = str;
        }
    }

    public C14765u4(C14688re reVar, C14772u7 u7Var, long j) {
        this.f36606d = reVar;
        this.f36607e = u7Var;
        this.f36604b = new Handler(Looper.getMainLooper());
        this.f36605c = j;
    }

    /* renamed from: a */
    public void mo34761a(Activity activity, String str, long j) {
        mo36552e(new C14769d(activity, str, this.f36607e.mo36566b(), j));
    }

    /* renamed from: b */
    public void mo34762b(Activity activity, Fragment fragment, long j) {
        mo36552e(new C14767b(activity, fragment, this.f36607e.mo36566b(), j));
    }

    /* renamed from: c */
    public void mo34763c(Activity activity, String str, long j) {
        mo36552e(new C14769d(activity, str, this.f36607e.mo36566b(), j));
    }

    /* renamed from: d */
    public void mo36551d() {
        this.f36603a.clear();
        this.f36604b.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: e */
    public final void mo36552e(C14768c cVar) {
        this.f36603a.add(cVar);
        mo36553f();
    }

    /* renamed from: f */
    public final void mo36553f() {
        this.f36604b.removeCallbacks(this.f36608f);
        this.f36604b.postDelayed(this.f36608f, this.f36605c);
    }

    /* renamed from: g */
    public void mo34767g(Activity activity, long j) {
        mo36552e(new C14768c(activity, this.f36607e.mo36566b(), j));
    }
}
